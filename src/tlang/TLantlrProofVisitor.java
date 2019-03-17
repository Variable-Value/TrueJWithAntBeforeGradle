package tlang;

import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import tlang.KnowledgeBase.ProofResult;
import tlang.Scope.VarInfo;
import tlang.TLantlrParser.T_blockStatementContext;
import tlang.TLantlrParser.T_localVariableDeclarationContext;
import tlang.TLantlrParser.T_statementContext;
import tlang.TLantlrParser.T_typeDeclarationContext;
import static tlang.TUtil.*;
import static tlang.TLantlrParser.*;

/** Check all constraints for consistency and check that all deductions are supported. This is the
 * final pass before the compiler generates Java code. Eventually, the proof pass will be rather
 * complicated, including correctness of initialization of the static object, correctness of the
 * static methods, correctness of instance initialization, including all constructors, and
 * correctness of all methods.
 *
 * There are 4 passes:
 * <ol>
 * <li>Collect all field types and static field values, which was done in the FieldVisitor class
 * <li>Check static validity, including static initialization blocks, passing the static object
 * KnowledgeBase to the following proof step.
 * <li>Collect instance field initializers and initialization blocks, passing the instance
 * initialization KnowledgeBase for constructors, and also the instance object KnowledgeBase for
 * methods, to the following proof step.
 * <li>Prove instance validity, including both methods and constructors.
 * </ol>
 * <p>
 * References like (Deransart, et al., p.236) refer to
 * <p>
 * <cite>Prolog: The Standard:Reference Manual</cite>, P. Deransart, A. Ed-Dbali, L. Cervoni,
 * Springer-Verlog, 1996.
 * <p>
 * TODO: All class fields must be non-null by the end of a constructor unless they were declared
 * with the <code>optional</code> modifier. */
class TLantlrProofVisitor extends RewriteVisitor {

private static final String prover = "Prover";
/** The logical and-operator for the prover */
private static final String and = "/\\"; // e.g., /\
/** The logical or-operator for the prover */
private static final String or = "\\/";  // e.g., \/
/** The logical not-operator for the prover */
private static final String not = "-";

private CollectingMsgListener errors; // for collecting inconsistent and unprovable results
private static char prologDecoratorChar = '^';
private static TLantlrProofVisitor latestProofVisitor;

/** Contains a logical representation of the state of a program */
private KnowledgeBase kb = new KnowledgeBase();


public TLantlrProofVisitor(
  TokenStream tokenStream,
  Map<RuleContext, Scope> ctxToScope,
  CollectingMsgListener errors)
{
  super(tokenStream, ctxToScope);
  this.errors = errors;
}

/** All <code>axiom, constraint, conjecture,</code> and <code>given</code> statements must be
 * consistent and, with the code, must support the <code>theorem, lemma,</code> and
 * <code>means</code> statements.
 *
 * @param  parseTree   of the code to be proven
 * @param  tokenStream that was used to generate the parseTree
 * @param  ctxToScope  map from a parse context to all scope information, especially variables
 * @param  errors      collects all error messages
 * @return             a record of the prolog calls that were made to the prover */
public static String proveCorrectness(
  ParseTree parseTree,
  TokenStream tokenStream,
  Map<RuleContext, Scope> ctxToScope,
  CollectingMsgListener errors)
{
  latestProofVisitor = new TLantlrProofVisitor(tokenStream, ctxToScope, errors);
  latestProofVisitor.visit(parseTree);
  return getProlog();
}

public static String getProlog() {
  return latestProofVisitor.rewriter.getText();
}


//***** Visit the Nodes that call the prover and rewrite the code into Prolog *******


/** Override the visit to this node in order to put all the calls to visit varieties of value-name
 * decoration into the same class and near one another.
 * @param  ctx The parse tree, which is the single, leaf, node for the undecorated value name that
 *               contains the value-name token.
 * @return     null */
@Override
public
        Void visitT_UndecoratedIdentifier(T_UndecoratedIdentifierContext ctx)
{
  return null;
}

/** Translate a pre-decorated value name to its Prolog form and substitute it in place. The
 * character <code>^</code> is substituted for the decorator, a scope name is prefixed using a dot
 * separator, and the whole name is enclosed in single quotes. For example, <code>'xyx</code> is
 * transformed to <code>'^xyz'</code> and if the variable <code>xyz</code> is an instance field, the
 * final transformation will be <code>'this.^xyz'</code>. Value names for local variables that are
 * at the top level of an executable component, e.g., a method, are not prefixed with a scope.
 * @param  valueNameCtx The parse tree, which is the single, leaf, node for the pre-decorated value
 *                        name that contains the value-name token.
 * @return              null */
@Override
public Void visitT_PreValueName(T_PreValueNameContext valueNameCtx) {
  final String variableName = rewriter.source(valueNameCtx).substring(1); // e.g., 'xxx -> xxx
  final String scopePrefix = getScopePrefix(variableName);
  final String prologName = "'" + scopePrefix + "^" + variableName + "'"; // e.g., 'this.^xxx'
  rewriter.substituteText(valueNameCtx, prologName);
  return null;
}

/** Translate a mid-decorated value name to its Prolog form and substitute it in place. The
 * character <code>^</code> is substituted for the decorator, a scope name is prefixed using a dot
 * separator, and the whole name is enclosed in single quotes. For example, <code>abc'xyx</code> is
 * transformed to <code>'abc^xyz'</code> and if the variable <code>abc</code> is an instance field,
 * the final transformation will be <code>'this.abc^xyz'</code>. Value names for local variables
 * that are at the top level of an executable component, e.g., a method, are not prefixed with a
 * scope.
 * @param  valueNameCtx The parse tree, which is the single, leaf, node for the mid-decorated value
 *                        name that contains the value-name token.
 * @return              null */
@Override
public Void visitT_MidValueName(T_MidValueNameContext valueNameCtx) {
  final String valueName = rewriter.source(valueNameCtx);         // example : varName'xxx
  final String[] n = valueName.split(decoratorString);                 // { varName,xxx }
  final String prologName = "'" + getScopePrefix(n[0]) + n[0] + "^" + n[1] + "'"; // 'this.varName^xxx'
  rewriter.substituteText(valueNameCtx, prologName);
  return null;
}

/** Translate a post-decorated value name to its Prolog form, in place. The character <code>^</code>
 * is substituted for the decorator, a scope name is prefixed using a dot separator, and the whole
 * name is enclosed in single quotes. For example, <code>abc'</code> is transformed to
 * <code>'abc^'</code> and if the variable <code>abc</code> is an instance field, the final
 * transformation will be <code>'this.abc^'</code>. Value names for local variables that are at the
 * top level of an executable component, e.g., a method, are not prefixed with a scope.
 * <p>
 * {@inheritDoc}
 * @param  valueNameCtx The parse tree, which is the single, leaf, node for the post-decorated value
 *                        name that contains the value-name token.
 * @return              null */
@Override
public Void visitT_PostValueName(T_PostValueNameContext valueNameCtx) {
  final String valueName = rewriter.source(valueNameCtx);
  final String variableName = valueName.substring(0, valueName.length() - 1);
  rewriter.substituteText(valueNameCtx, "'" + getScopePrefix(variableName) + variableName + "^'");
  return null;
}

/** Translate a Java literal into the corresponding prover literal.
 * <p>
 * For the <code>FloatingPointLiteral</code>, change something like .25 to 0.25, with a leading
 * zero. (Deransart, et al., p.236)
 * @return null required by implementation */
@Override
public Void visitT_literal(T_literalContext literalCtx) {
  visitChildren(literalCtx);

  TerminalNode terminalNode = literalCtx.FloatingPointLiteral();
  if (terminalNode != null) {
    String numericText = terminalNode.getText();
    if (numericText.startsWith("."))
      rewriter.substituteText(literalCtx, "0" + numericText);
  }
  // TODO: change 123E-4 to 0.0123 and .2E12 to 200000000000

  return null;
}

/**
 * <p>
 * {@inheritDoc} */
@Override
public Void visitInitializedVariable(InitializedVariableContext ctx) {
  visitChildren(ctx);
  kb.assume(rewriter.source(ctx));
  return null;
}

/** Submit the assignment to the prover. TODO: provide the useful type information for the new value
 * name that is being created.
 * <p>
 * {@inheritDoc} */
@Override
public Void visitAssignStmt(AssignStmtContext ctx) {
  visitChildren(ctx);

  String rhs = rewriter.source(ctx.t_assignable());
  String op = needsEquivalenceForBooleanTarget(ctx) ? "===" : "=";
//  if (needsEquivalenceForBooleanTarget(ctx)) {
//    Token op = (Token)ctx.getChild(1).getPayload();
//    rewriter.replace(op,"===");
//    assignmentCode = assignmentCode.replaceFirst("=", "===");
//  }
  String lhs = par(rewriter.source(ctx.t_expression()));
//  String src  = withoutSemicolon(rewriter.source(ctx));
  String src = rhs + op + lhs;
  rewriter.substituteText(ctx, src);
  kb.assume(src);
  return null;
}

private boolean needsEquivalenceForBooleanTarget(AssignStmtContext ctx) {
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

private String withoutSemicolon(String code) {
  int semicolonPosition = code.lastIndexOf(';');
  return code.substring(0, semicolonPosition) + code.substring(semicolonPosition + 1);
}

/**
 * {@inheritDoc}
 *
 * <p>The default implementation returns the result of calling
 * {@link #visitChildren} on {@code ctx}.</p>
 */
@Override public Void visitEmptyStmt(TLantlrParser.EmptyStmtContext ctx) {
  rewriter.substituteText(ctx, "true");
  return null;
}

/** Translate a block of statements into the meaning of its statements, changing the surrounding
 * braces to parentheses. Loop from the bottom up, stopping with the latest means-statement that was
 * issued, which summarizes everything needed from the code above it in this block. */
@Override public Void visitT_block(T_blockContext ctx) {
  final Scope parentScope = currentScope;
  currentScope = scopeMap.get(ctx);

  visitChildren(ctx);

  boolean statementsAreActive = true; // so far
  String meaning = "true";
  for (int i = ctx.t_blockStatement().size()-1; i >= 0; i-- ) {
    T_blockStatementContext blockCtx = ctx.t_blockStatement(i);
    T_statementContext statement = blockCtx.t_statement();
    if (statement != null) {
      if (statementsAreActive) {
        meaning += and + rewriter.source(statement);
        statementsAreActive = (statement instanceof MeansStmtContext) ? false : true;
      } else
        ;
    } else {
      T_localVariableDeclarationContext localDeclaration = blockCtx.t_localVariableDeclaration();
      if (localDeclaration != null) {
//        String type = localDeclaration.t_type().getText();
//        for (T_variableDeclaratorContext varOrValueName : localDeclaration.t_variableDeclarator()) {
//          if (varOrValueName instanceof UninitializedVariableContext) {
//            then;
//          } else {
//            orElse;
//          }
//        types += and + " type("+ type +","+ localDeclaration.t_variableDeclarator(v));
      } else {
        T_typeDeclarationContext localType = blockCtx.t_typeDeclaration();
        // localType cannot be null because of syntax
          // blah blah blah
      }
    }
  rewriter.substituteText(ctx, meaning);
  }


  currentScope = parentScope;
  return null;
}

/** Translate if-statement to logic. */
@Override
public Void visitIfStmt(IfStmtContext ctx) {
  visitChildren(ctx);

  String condition = rewriter.source(ctx.t_parExpression());
  String thenMeaning = par(rewriter.source(ctx.t_statement(0)));
  T_statementContext elseContext = ctx.t_statement(1);
  if (elseContext == null) {
    rewriter.substituteText(ctx, condition + "==>" + thenMeaning);
  } else {
    String elseMeaning = par(rewriter.source(elseContext));
    rewriter.substituteText(ctx, condition + and + thenMeaning
                    + or + not + condition + and + elseMeaning);
  }
  return null;
}

/** Translate <code>!</code> to the provers negation <code>-</code> */
@Override
public Void visitNotExpr(NotExprContext ctx) {
  visitChildren(ctx);

  rewriter.replace(ctx.start, "-");
  return null;
}

/** Parenthesize the relational expression and translate the operators to appropriate prover
 * operators. */
@Override
public Void visitConjRelationExpr(TLantlrParser.ConjRelationExprContext ctx) {
  visitChildren(ctx);

  translateOps(ctx);
  rewriter.substituteText(ctx, par(rewriter.source(ctx)));
  return null;
}

//@formatter:off
/**
 * Translate the operators to appropriate prover operators. If the expressions are boolean, use the
 * provers logical operators.
 *
 * <table>
 *   <tr><th>Java  <th>Prover
 *   <tr><td>&lt;  <td>&lt;
 *   <tr><td>&lt;= <td>=&lt;
 *   <tr><td>=     <td>=  (=== for boolean)
 *   <tr><td>!=    <td>#= (=#= for boolean)
 *   <tr><td>&gt;= <td>&gt;=
 *   <tr><td>&gt;  <td>&gt;
 * </table>
 *
 * @param ctx
 */
//@formatter:on
private void translateOps(ConjRelationExprContext ctx) {
  String operator = ctx.op.getText();
  if ("<=".equals(operator))
    rewriter.replace(ctx.op, "=<");
  if ("=".equals(operator))
    rewriter.replace(ctx.op, hasBooleanTerms(ctx.t_expressionDetail(0)) ? "===" : "=");
  if ("!=".equals(operator))
    rewriter.replace(ctx.op, hasBooleanTerms(ctx.t_expressionDetail(0)) ? "=#=" : "#=");
}

private boolean hasBooleanTerms(T_expressionDetailContext ctx) {
  if (ctx instanceof AndExprContext)
    return true;
  if (ctx instanceof ConjRelationExprContext)
    return true;
  if (ctx instanceof PrimaryExprContext)
    return isBooleanPrimary(ctx);
  if (ctx instanceof NotExprContext)
    return true;
//    if (ctx instanceof FuncCallExprContext) {
//      // TODO: does this function return a boolean?
//    }
  if (ctx instanceof DotExprContext)
    return isBooleanDotExpr((DotExprContext)ctx);
  if (ctx instanceof ConditionalExprContext) {  // e(0) ? e(1) : e(2)
    ConditionalExprContext ceCtx = (ConditionalExprContext)ctx;
    return hasBooleanTerms(ceCtx.t_expressionDetail(1)); // ||
                                                         // hasBooleanTerms(ceCtx.t_expressionDetail(2));
  }
//    if (ctx instanceof DotExplicitGenericExprContext) { /* TODO: returns boolean? */ }
  if (ctx instanceof InstanceOfExprContext)
    return true;
  if (ctx instanceof OrExprContext)
    return true;
  if (ctx instanceof ConditionalOrExprContext)
    return true;
  if (ctx instanceof ArrayExprContext) {
    ArrayExprContext aeCtx = (ArrayExprContext)ctx;
    if (hasBooleanTerms(aeCtx.t_expressionDetail(0)))
      return true;
  }
  if (ctx instanceof ExclusiveOrExprContext)
    return true;
//    if (ctx instanceof NewExprContext) { /* TODO: add this; however, new Boolean(true) is deprecated */ }
  if (ctx instanceof ConditionalAndExprContext)
    return true;
//    if (ctx instanceof TypeCastExprContext)  { /* TODO: check for casting boolean to Boolean (deprecated) */ }
  if (ctx instanceof ConditionalAndExprContext)
    return true;
  // OTHERWISE
  return false;
}

public boolean isBooleanDotExpr(DotExprContext ctx) {
  if ("this".equals(rewriter.source(ctx.t_expressionDetail()))
      && isBooleanValue(ctx.t_identifier().getText()))
    return true;
  // TODO: return true if other (non-this) object component identifier is boolean
  // otherwise
  return false;
}

public boolean isBooleanPrimary(T_expressionDetailContext ctx) {
  T_primaryContext pCtx = ((PrimaryExprContext)ctx).t_primary();
  if (pCtx.start.getText() == "(") // i.e., '(' t_expression ')'
    return hasBooleanTerms(pCtx.t_expression().t_expressionDetail());
  String text = pCtx.getText();
  if (text == "true")
    return true;
  if (text == "false")
    return true;
  if (pCtx.t_identifier() != null)
    return isBooleanValue(pCtx.t_identifier().getText());
  // This is all the possible booleans in the parse rule t_primary in the TLantlr.g4 grammar
  // as of 2019 Jan 16
  return false;
}

/** Replace the Java OR (|) with the prover OR (\/).
 * <p>
 * {@inheritDoc} */
@Override
public Void visitOrExpr(OrExprContext ctx) {
  visitChildren(ctx);

  rewriter.replace(binaryOperatorToken(ctx), or);
  return null;
}

/** Replace the Java AND (&) with the prover AND (/\).
 * <p>
 * {@inheritDoc} */
@Override
public Void visitAndExpr(AndExprContext ctx) {
  visitChildren(ctx);

  rewriter.replace(binaryOperatorToken(ctx), and);
  return null;
}

/** Replace the Java conditional OR (||) with the prover OR (\/).
 * <p>
 * {@inheritDoc} */
@Override
public Void visitConditionalOrExpr(ConditionalOrExprContext ctx) {
  visitChildren(ctx);

  rewriter.replace(binaryOperatorToken(ctx), or);
  return null;
}

/** Replace the Java conditional AND (&&) with the prover AND (/\).
 * <p>
 * {@inheritDoc} */
@Override
public Void visitConditionalAndExpr(ConditionalAndExprContext ctx) {
  visitChildren(ctx);

  rewriter.replace(binaryOperatorToken(ctx), and);
  return null;
}

private Token binaryOperatorToken(ParseTree pt) {
  return (Token)pt.getChild(1).getPayload();
}

/** The operators ===, ==>, and <== are the same as those used in the prover, but =!= must be
 * replaced with =#=.
 * <p>
 * {@inheritDoc} */
@Override
public Void visitConjunctiveBoolExpr(ConjunctiveBoolExprContext ctx) {
  visitChildren(ctx);

  if ("=!=".equals(ctx.op)) {
    rewriter.replace(ctx.op, "=#=");
  }
  return null;
}


/** Submit the means statement to the {@link KnowledgeBase} for proof, and substitute the
 * <code>means</code> statement for all the preceding assumptions, preserving the type information
 * for any value names that occur in the <code>means</code> statement.
 * <p>
 * {@inheritDoc}
 * @return a null */
@Override
public Void visitT_means(T_meansContext ctx) {
  visitChildren(ctx); // rewrite code into the KnowledgeBase language

  T_expressionDetailContext predicate = ctx.t_expression().t_expressionDetail();
  String meansStatementForProver = prologCode(predicate);
  ProofResult result = kb.substituteIfProven(meansStatementForProver);
  if ( !(result == ProofResult.provenTrue))
    proveEachConjunct(predicate);
  return null;
}

private ProofResult proveEachConjunct(T_expressionDetailContext conjunction) {
  if (isSingleConjunct(conjunction)) {
    ProofResult result = kb.assumeIfProven(prologCode(conjunction));
    reportAnyError(conjunction, result);
    return result;
  }

  for (ParseTree child : conjunction.children) {
    if (isConjunction(child) || child instanceof T_expressionDetailContext) {
      ProofResult conjunctResult = proveEachConjunct((T_expressionDetailContext)child);
      if (conjunctResult != ProofResult.provenTrue)
        return conjunctResult;
    }
  }
  return ProofResult.provenTrue;
}

private boolean isSingleConjunct(T_expressionDetailContext expressionDetail) {
  return !isConjunction(expressionDetail);
}

private boolean isConjunction(ParseTree expressionDetail) {
  return expressionDetail instanceof ConditionalAndExprContext
         || expressionDetail instanceof AndExprContext;
}

private void reportAnyError(ParserRuleContext ctx, ProofResult result) {
  if (result == ProofResult.provenTrue)
    return;

  String msg = null;
  if (result == ProofResult.unsupported)
    msg = "The code does not support the proof of the statement: " + rewriter.originalSource(ctx);
  else if (result == ProofResult.reachedLimit)
    msg = "The prover reached an internal limit. Consider adding a lemma to help prove "
          + "the statement: \n    " + rewriter.originalSource(ctx);
  errors.collectError(prover, ctx.getStart(), msg);
}

/** @param node
 * @return */
private String prologCode(ParseTree node) {
  return expandForall(rewriter.source(node)).replaceAll("//", "%");
}

/** Search for variables that are bound by a <code>forall</code> statement and add the expanded type
 * information for the variables inside the scope of the <code>forall</code>, that is, inside the
 * quantified statement) so that it will be available for use in the proof. Conjoin the "useful"
 * type constraints at the beginning of the scope of the bound variable and the "deep" constraints
 * at the end of the scope of the bound variable.
 * @param  statement the statement to be proven from a <code>means</code> statement
 * @return           the modified statement */
private String expandForall(String statement) {
  // TODO Expand forall statements for Prolog by adding type information for each forall variable
  return statement;
}

/* ************************ Helper methods ************************************/

/** Parenthesize the string */
private String par(String expression) {
  return "(" + expression + ")";
}

/** Get the name of the scope with a following dot separator, ready for prefixing to a prolog
 * variable name. For instance, an object-instance field returns "this." and a local variable that
 * is declared at the top level of a method returns "".
 * @param  variableName
 * @return              scope name followed by a dot separator */
private String getScopePrefix(final String variableName) {
  final Optional<VarInfo> info = currentScope.getOptionalExistingVarInfo(variableName);
  return info.map(v -> v.getScopeWhereDeclared().getLabel() + ".")
             .orElse("");
}

/** The full type name will need to include the package where it is defined unless it is a
 * primitive, but for now we just return the type as given in the code.
 * @param  idType
 * @return */
private String typeFullName(String idType) {
  // TODO look up type in information from imports or package
  return idType;
}

/** Extract the full variable name, including any scope prefix, from the value name, keeping the
 * single quotes required for general Prolog atom names.
 *
 * @param  val The Prolog version of the value name, including single quotes and any scope prefix.
 * @return     The variable name constructed from the <code>val</code> */
private String varName(String val) {
  final int pos = val.indexOf(prologDecoratorChar);
  if (pos == -1) {
    return val;
  }                        // return 'abc' for 'abc'
  else if (pos == 1) {
    return "'" + val.substring(2);
  }      // return 'abc' for '^abc'
  else {
    return val.substring(0, pos) + "'";
  }  // return 'abc' for 'abc^' or 'abc^de'
}

} // end class
