package tlang;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import tlang.KnowledgeBase.ProofResult;
import tlang.Scope.VarInfo;
import tlang.TLantlrParser.EqualityExprContext;
import tlang.TLantlrParser.T_identifierContext;
import tlang.TLantlrParser.T_primaryContext;
import static tlang.TUtil.*;
import static tlang.TLantlrParser.*;

/**
 * Check all constraints for consistency and check that all deductions are supported.
 *
 * There are 4 passes:
 *  <ol> <li>Collect all field types and static field values, which was done in the FieldVisitor
 *           class
 *       <li>Check static validity, including static initialization blocks, passing the static
 *           object KnowledgeBase to the following proof step.
 *       <li>Collect instance field initializers and initialization blocks, passing the instance
 *           initialization KnowledgeBase, for constructors, and the instance object KnowledgeBase,
 *           for methods, to the following proof step.
 *       <li>Check instance validity, including both methods and constructors.
 *  </ol>
 * This is the 4th pass, check instance validity.
 * <p>
 * TODO: All class fields must be non-null by the end of a constructor unless they were declared
 * with the <code>optional</code> modifier.
 */
class TLantlrProofVisitor extends RewriteVisitor {

private static final String prover = "Prover";
private static final String logicalAndOperator = "/\\\\"; // extra backslashes for regexp

private ParseTree tree;
private CollectingMsgListener errors; // for collecting inconsistent and unprovable results
private static char prologDecoratorChar = '^';
private static TLantlrProofVisitor latestProofVisitor;
private Map<String, String> varTypeMap = new HashMap<>();

/** Contains a logical representation of the state of a program */
private KnowledgeBase kb = new KnowledgeBase();


public TLantlrProofVisitor( ParseTree               parseTree
                          , TokenStream             tokenStream
                          , Map<RuleContext, Scope> ctxToScope
                          , CollectingMsgListener   errors
                          ) {
  super(tokenStream, ctxToScope);
  this.tree = parseTree;
  this.errors = errors;
}

/**
 * All <code>axiom, constraint, conjecture,</code> and <code>given</code> statements must be
 * consistent and, with the code, must support the <code>theorem, lemma,</code> and
 * <code>means</code> statements.
 *
 * @param parseTree of the code to be proven
 * @param tokenStream that was used to generate the parseTree
 * @param ctxToScope map from a parse context to all scope information, especially variables
 * @param errors collects all error messages
 * @return a record of the prolog calls that were made to the prover
 */
public static String proveCorrectness( ParseTree               parseTree
                                     , TokenStream             tokenStream
                                     , Map<RuleContext, Scope> ctxToScope
                                     , CollectingMsgListener   errors
                                     ) {
  latestProofVisitor = new TLantlrProofVisitor(parseTree, tokenStream, ctxToScope, errors);
  latestProofVisitor.visit(parseTree);
  return getProlog();
}

public static String getProlog() {
  return latestProofVisitor.rewriter.getText();
}


//***** Visit the Nodes that call the prover and rewrite the code into Prolog *******



/**
 * Override the visit to this node in order to put all the calls to visit varieties of value-name
 * decoration into the same class and near one another.
 * @param ctx The parse tree, which is the single, leaf, node for the undecorated value
 *            name that contains the value-name token.
 * @return null
 */
@Override public
Void visitT_UndecoratedIdentifier(T_UndecoratedIdentifierContext ctx) {
  return null;
}

/**
 * Translate a pre-decorated value name to its Prolog form and substitute it in place. The
 * character <code>^</code> is substituted for the decorator, a scope name is prefixed using a dot
 * separator, and the whole name is enclosed in single quotes. For example, <code>'xyx</code> is
 * transformed to <code>'^xyz'</code> and if the variable <code>xyz</code> is an instance field,
 * the final transformation will be <code>'this.^xyz'</code>. Value names for local variables that
 * are at the top level of an executable component, e.g., a method, are not prefixed with a scope.
 * @param valueNameCtx The parse tree, which is the single, leaf, node for the pre-decorated value
 *                     name that contains the value-name token.
 * @return null
 */
@Override public Void visitT_PreValueName(T_PreValueNameContext valueNameCtx) {
  final String variableName = rewriter.source(valueNameCtx).substring(1); // e.g., 'xxx -> xxx
  final String scopePrefix = getScopePrefix(variableName);
  final String prologName = "'"+ scopePrefix + "^"+ variableName +"'"; // e.g., 'this.^xxx'
  rewriter.substituteText(valueNameCtx, prologName);
  return null;
}

/** Translate a mid-decorated value name to its Prolog form and substitute it in place. The
 * character <code>^</code> is substituted for the decorator, a scope name is prefixed using a dot
 * separator, and the whole name is enclosed in single quotes. For example, <code>abc'xyx</code> is
 * transformed to <code>'abc^xyz'</code> and if the variable <code>abc</code> is an instance field,
 * the final transformation will be <code>'this.abc^xyz'</code>. Value names for local variables that
 * are at the top level of an executable component, e.g., a method, are not prefixed with a scope.
 * @param valueNameCtx The parse tree, which is the single, leaf, node for the mid-decorated value
 *                     name that contains the value-name token.
 * @return null
 */
@Override public Void visitT_MidValueName(T_MidValueNameContext valueNameCtx) {
  final String valueName = rewriter.source(valueNameCtx);         // example  :  varName'xxx
  final String[] n = valueName.split(decoratorString);                 //           { varName,xxx }
  final String prologName= "'"+ getScopePrefix(n[0]) + n[0] +"^"+ n[1] +"'"; // 'this.varName^xxx'
  rewriter.substituteText(valueNameCtx, prologName);
  return null;
}

/**
 * Translate a post-decorated value name to its Prolog form, in place. The
 * character <code>^</code> is substituted for the decorator, a scope name is prefixed using a dot
 * separator, and the whole name is enclosed in single quotes. For example, <code>abc'</code> is
 * transformed to <code>'abc^'</code> and if the variable <code>abc</code> is an instance field,
 * the final transformation will be <code>'this.abc^'</code>. Value names for local variables that
 * are at the top level of an executable component, e.g., a method, are not prefixed with a scope.
 * <p>{@inheritDoc}
 * @param valueNameCtx The parse tree, which is the single, leaf, node for the post-decorated value
 *                     name that contains the value-name token.
 * @return null
 */
@Override public Void visitT_PostValueName(T_PostValueNameContext valueNameCtx) {
  final String valueName = rewriter.source(valueNameCtx);
  final String variableName = valueName.substring(0, valueName.length()-1);
  rewriter.substituteText(valueNameCtx, "'"+ getScopePrefix(variableName) + variableName +"^'");
  return null;
}

/**
 * <p>{@inheritDoc}
 */
@Override public Void visitInitializedVariable(InitializedVariableContext ctx) {
  visitChildren(ctx);
  kb.assume(rewriter.source(ctx));
  return null;
}

/** Submit the assignment to the prover.
 * TODO: provide the useful type information for the new value name that is being created.
 * <p>{@inheritDoc}
 *
 */
@Override public Void visitAssignStmt(AssignStmtContext ctx) {
  boolean needsEquivalence = hasBooleanTarget(ctx);
  visitChildren(ctx);
  String assignmentCode = removeSemicolonFromCode(ctx);
  if (needsEquivalence)
    assignmentCode = assignmentCode.replace("=", "===");
  kb.assume(parenthesized(assignmentCode));
  return null;
}

private boolean hasBooleanTarget(AssignStmtContext ctx) {
  boolean result = false;
  T_identifierContext targetCtx = ctx.t_assignable().t_identifier();
  if (targetCtx != null) {
    String targetName = targetCtx.getText();
    result = isBooleanValue(targetName);
  }
  return result;
}

public boolean isBooleanValue(String targetName) {
  String targetVarName = TUtil.variableName(targetName);
  String varType = currentScope.getExistingVarInfo(targetVarName).getType();
  return varType.equals("boolean");
}

private String removeSemicolonFromCode(AssignStmtContext ctx) {
  String revisedText  = rewriter.source(ctx);
  final int semicolonPosition = revisedText.lastIndexOf(';');
  return revisedText.substring(0, semicolonPosition);
}

	/** Replace
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitEqualityExpr(TLantlrParser.EqualityExprContext ctx) {
	  String sign = (ctx.op.getText() == "!=") ? "-" : "";
	  String equalityOp = hasBooleanTerms(ctx.t_expression(0)) ? "===" : "=" ;
	  rewriter.replace(ctx.op, equalityOp);
	  visitChildren(ctx);
	  String newText = sign + parenthesized(rewriter.source(ctx));
	  rewriter.substituteText(ctx, newText);
	  return null;
	}

  private boolean hasBooleanTerms(T_expressionContext ctx) {
    if (ctx instanceof AndExprContext)      return true;
    if (ctx instanceof EqualityExprContext) return true;
    if (ctx instanceof CompareExprContext)  return true;
    if (ctx instanceof PrimaryExprContext)  return isBooleanPrimary(ctx);
    if (ctx instanceof NotExprContext)      return true;
//    if (ctx instanceof DotThisExprContext) {
//      // TODO: retrun true if this is a descendant of Boolean
//    }
//    if (ctx instanceof FuncCallExprContext) {
//      // TODO: does this function return a boolean?
//    }
//    if (ctx instanceof DotNewExprContext) {
//      // TODO: Can this return a boolean?
//    }
    if (ctx instanceof DotExprContext)      return isBooleanDotExpr(ctx);
    if (ctx instanceof ConditionalExprContext) {
      ConditionalExprContext ceCtx = (ConditionalExprContext)ctx;
      return hasBooleanTerms(ceCtx.t_expression(0)) || hasBooleanTerms(ceCtx.t_expression(0));
    }
//    if (ctx instanceof DotExplicitGenericExprContext) { /* TODO: returns boolean? */ }
    if (ctx instanceof InstanceOfExprContext)      return true;
    if (ctx instanceof OrExprContext)      return true;
    if (ctx instanceof ConditionalOrExprContext)      return true;
    if (ctx instanceof ArrayExprContext) {
      ArrayExprContext aeCtx = (ArrayExprContext)ctx;
      if (hasBooleanTerms(aeCtx.t_expression(0))) return true;
    }
    if (ctx instanceof ExclusiveOrExprContext)      return true;
//    if (ctx instanceof NewExprContext) { /* TODO: check for boolean or descendant of Boolean */ }
    if (ctx instanceof ConditionalAndExprContext)      return true;
//    if (ctx instanceof TypeCastExprContext)  { /* TODO: check for cast to descendant of Boolean */ }
    if (ctx instanceof ConditionalAndExprContext)      return true;
    // OTHERWISE
    return false;
  }

  public boolean isBooleanDotExpr(T_expressionContext ctx) {
    DotExprContext deCtx = (DotExprContext)ctx;
    if ( rewriter.source(deCtx.t_expression()) == "this"
      && isBooleanValue(deCtx.t_identifier().getText())
       )
      return true;
    // TODO: return true if other object component identifier is boolean
    //otherwise
    return false;
  }

  public boolean isBooleanPrimary(T_expressionContext ctx) {
    T_primaryContext pCtx = ((PrimaryExprContext)ctx).t_primary();
    if (pCtx.start.getText() == "(") return hasBooleanTerms(pCtx.t_expression());
    if (pCtx.getText() == "true") return true;
    if (pCtx.t_identifier() != null) return isBooleanValue(pCtx.t_identifier().getText());
    // TODO: other options for primary
    // otherwise
    return false;
  }

  /** Replace the Java AND (&) with the prover AND (/\).
 * <p>{@inheritDoc}
 *
 */
@Override public Void visitAndExpr(AndExprContext ctx) {
  visitChildren(ctx);
  String newText = rewriter.source(ctx).replaceFirst("&", logicalAndOperator);
  rewriter.substituteText(ctx, parenthesized(newText));
  return null;
}

/** Replace the Java conditional AND (&&) with the prover AND (/\).
 * <p>{@inheritDoc}
 *
 */
@Override public Void visitConditionalAndExpr(ConditionalAndExprContext ctx) {
  visitChildren(ctx);
  String newText = rewriter.source(ctx).replaceFirst("&&", logicalAndOperator);
  rewriter.substituteText(ctx, parenthesized(newText));
  return null;
}

/** Submit the means statement to the {@link KnowledgeBase} for proof, and substitute the
 * <code>means</code> statement for all the preceding assumptions, preserving the type information
 * for any value names that occur in the <code>means</code> statement.
 * <p>{@inheritDoc}
 * @return a null */
@Override public Void visitT_means(T_meansContext ctx) {
  visitChildren(ctx); // rewrite code into the KnowledgeBase language
  String meansStatementForProver = expandForall(rewriter.sourceWithoutComments(ctx.t_enterExprs()));
  ProofResult result = kb.substituteIfProven(meansStatementForProver);
  if (result == ProofResult.unsupported) {
    String msg = "The code does not support the means statement: "
               + rewriter.originalSource(ctx.t_enterExprs());
    errors.collectError(prover, ctx.start, msg);
  } else if (result == ProofResult.reachedLimit) {
    String msg = "The prover reached an internal limit. Consider adding a lemma to help prove "
               + "the means statement: \n    "+ rewriter.originalSource(ctx.t_enterExprs());
    errors.collectError(prover, ctx.start, msg);
  }
  return null;
}

/** Search for variables that are bound by a <code>forall</code> statement and add the type
 * information for the variables to the <code>means</code> statement so that it will be available
 * for proof. Conjoin the "useful" type constraints at the point of declaration and the "deep"
 * constraints at the end of the scope of the bound variable.
 * @param meansSource the statement to be proven from a <code>means</code> statement
 * @return null
 */
private String expandForall(String meansSource) {
  // TODO Auto-generated method stub
  return meansSource;
}

/* ************************ Helper methods ************************************/

private String parenthesized(String source) {
  return "("+ source + ")";
}

/**
 * Get the name of the scope with a following dot separator, ready for prefixing to a prolog
 * variable name. For instance, an object-instance field returns "this." and a local variable that
 * is declared at the top level of a method returns "".
 * @param variableName
 * @return scope name followed by a dot separator
 */
private String getScopePrefix(final String variableName) {
  final Optional<VarInfo> info = currentScope.getOptionalExistingVarInfo(variableName);
  return info.map(v -> v.getScopeWhereDeclared().getLabel() +".")
             .orElse("");
}

/** The full type name will need to include the package where it is defined unless it is a
 * primitive, but for now we just return the type as given in the code.
 * @param idType
 * @return
 */
private String typeFullName(String idType) {
  // TODO look up type in information from imports or package
  return idType;
}

/** Extract the full variable name, including any scope prefix, from the value name, keeping the
 * single quotes required for general Prolog atom names.
 *
 * @param val The Prolog version of the value name, including single quotes and any scope prefix.
 * @return The variable name constructed from the <code>val</code>
 */
private String varName(String val) {
  final int pos = val.indexOf(prologDecoratorChar);
  if      (pos == -1) { return val; }                        // return 'abc' for 'abc'
  else if (pos ==  1) { return "'"+ val.substring(2); }      // return 'abc' for '^abc'
  else                { return val.substring(0,pos) +"'"; }  // return 'abc' for 'abc^' or 'abc^de'
}

} // end class
