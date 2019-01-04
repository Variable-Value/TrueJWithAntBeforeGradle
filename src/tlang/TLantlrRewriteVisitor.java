package tlang;

import static tlang.TUtil.*;
import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.jdt.annotation.Nullable;
import tlang.Scope.VarInfo;
import static tlang.TLantlrParser.*;

/**
 * Translate to Java
 */
public class TLantlrRewriteVisitor extends RewriteVisitor {
// TODO Push static methods and values to instance - perhaps rewriter is instance parameter

private static @Nullable TLantlrRewriteVisitor visitor = null;

//TODO: remove tree - I can't see a use for it.
private ParseTree tree;
/**
 * Are we creating a new value name? For instance, in the assignment <code>x'[0] = 'x[0] + 1</code>
 * the <code>x'[0]</code> is an assignable expression and the <code>'x[0] + 1</code> is not.
 * Assignable expressions may need extra generated code to save the original value if that value
 * name is used again later.
 */
boolean inAssignableExpression = false;

public TLantlrRewriteVisitor( ParseTree               parseTree
                            , TokenStream             tokenStream
                            , Map<RuleContext, Scope> ctxToScope
                            ) {
  super(tokenStream, ctxToScope);
  this.tree = parseTree;
}

private static void ensureVisit(ParseTree parseTree, TokenStream tokenStream, Map<RuleContext, Scope> ctxToScope) {
  if ( ! alreadyVisited(parseTree, tokenStream, ctxToScope) ) {
    visitor = new TLantlrRewriteVisitor(parseTree, tokenStream, ctxToScope);
    visitor.visit(parseTree);
  }
}

private static boolean alreadyVisited( ParseTree               parseTree
                                     , TokenStream             tokenStream
                                     , Map<RuleContext, Scope> ctxToScope
                                     )
{
  return (  visitor != null
         && visitor.tree == parseTree
         && visitor.scopeMap == ctxToScope
         );
}

static public String treeToJava(ParseTree parseTree, TokenStream tokenStream, Map<RuleContext, Scope> ctxToScope) {
  ensureVisit(parseTree, tokenStream, ctxToScope);
  return visitor.getJava();
}

public String getJava() {
  return rewriter.getText();
}


// ***** Visit the Nodes that need to be rewritten *******

/* TODO: a post-decorated name for an uninitialized field in visitUninitializedField() should
 * indicate that the field is
 * constant once construction is complete, i.e., a Java final field. And if we are allowing
 * post-decorated fields, we might as well allow pre-decorated ones -- after all, they get default
 * values if no value is provided.
 */


/**
 * If there is an import statement, insert the new import before it,
 * else if there is a package declaration, insert the new import after it,
 * else if there is only a type declaration, insert the new import before it,
 * else insert the new import before whatever is there (javadoc?)
 * @return a null to indicate that there are no children to visit.
*/
@Override public Void
visitT_compilationUnit(T_compilationUnitContext ctx) {
  visitChildren(ctx);

  final String runtimeText = "import tlang.runtime.*;";

  final T_importDeclarationContext firstImportCtx =  ctx.t_importDeclaration(0);
  if (firstImportCtx != null) {
    rewriter.insertBefore(firstImportCtx.getStart(), runtimeText +" ");
  } else {

    final T_packageDeclarationContext packageCtx = ctx.t_packageDeclaration();
    if (packageCtx != null) {
      rewriter.insertAfter(packageCtx.getStop(), " "+  runtimeText);
    } else {
      final T_typeDeclarationContext firstTypeDef = ctx.t_typeDeclaration(0);
      if (firstTypeDef != null) {
        rewriter.insertBefore(0, runtimeText +" ");
          // 0 is first token in token stream so inserted before javadoc or
          // other comments
      }
    }
  }
  return null;
}

private boolean successfullInsertBefore( String outName
                                       , ParserRuleContext ruleCtx
                                       , String newText
                                       ) {
  if (ruleCtx != null) {
    rewriter.insertBefore(outName, ruleCtx.getStart(), newText);
    return true;
  } else {
    return false;
  }
}

private boolean successfullInsertAfter( String outName
                                      , ParserRuleContext ruleCtx
                                      , String newText
                                      ) {
  if (ruleCtx != null) {
    rewriter.insertAfter (outName, ruleCtx.getStop(), newText);
    return true;
  } else {
    return false;
  }
}



@Override
protected Void typeVisit(ParserRuleContext ctx) {
  Void result =  super.typeVisit(ctx);
  rewriter.insertBefore(ctx.getStart(), "@TType ");
  return result;
}

@Override
protected void executableVisit(ParserRuleContext ctx, ParserRuleContext bodyCtx) {
  final Scope oldScope = currentScope;
  currentScope = scopeMap.get(ctx);
  if (bodyCtx != null) {
    Token openBraceForBlock = bodyCtx.getStart();
    StringBuilder tempInitializations = new StringBuilder();
    Scope background = currentScope.parent;
    for (Map.Entry<String, VarInfo> varEntry : background.varToInfoMap.entrySet()) {
      String varName = varEntry.getKey();
      VarInfo varInfo = varEntry.getValue();
      String initValue = decoratorString+ varName;
      if (varInfo.reusedValueNames.contains(initValue)) {
        tempInitializations.append(" ")       .append(varInfo.getType())
                           .append(" $T$")    .append(varName)
                           .append(" = /*'*/").append(varName)
                           .append(";");
      }
    }
    rewriter.insertAfter(openBraceForBlock, tempInitializations);
  }

  visitChildren(ctx);

  currentScope = oldScope;
}

/**
 * Translate an assignment statement to Java. We reverse the sequential order of visiting the
 * children in order to reflect the idea that the
 * change to the LHS variable happens after the RHS expression is evaluated.
 * This allows assignments like a' = 'a + 1, where the LHS varable occurs on both sides. Note
 * that visiting the RHS expression translates the expression in place without affecting the as-yet
 * untranslated LHS value-name.
 * affecting the
 * <p>{@inheritDoc}
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void
visitAssignStmt(AssignStmtContext ctx) {
  // We collect this info before visiting the children in order to make sure
  // that the info is pre-modification
  // running example: let text for assignments statement be    a' = 'a + a;
//  System.out.println("BEFORE visitAssigngStmt: "+ rewriter.getText());
  Token assignedValueToken = ctx.t_assignable().getStart(); // token for a'
  String assignedValueName = assignedValueToken.getText();  // "a'"
  String varName = variableName(assignedValueName);         // "a"
  Token afterAssignment = ctx.getStop();                   //  the ";" token after the assignment

  visit(ctx.t_enterExprs());                                // becomes "/*'*/a + 1"
  visit(ctx.t_assignable());                                // becomes "a/*'*/"
                    // (equal sign and ; are unchanged) so we have     "a/*'*/ = /*'*/a + 1;"
  // we collect this info post-modification
//  System.out.println("AFTER  visit          : "+ rewriter.getText());
  VarInfo varInfo = currentScope.getExistingVarInfo(varName);
  if (originalValueIsReusedLater(assignedValueName, varInfo)) { // assignedValueName.equals("b'temp")) {
    rewriter.insertAfter(afterAssignment, saveOriginalValue(assignedValueName, varInfo));
    // saves the value for later reuse by inserting "a$T$ = a/*'*/;" after the assignment
  }
//  System.out.println("AFTER  visitAssigngStmt: "+ rewriter.getText());
  return null;
}

private boolean originalValueIsReusedLater(String assignedValueName, VarInfo varInfo) {
  return varInfo != null && varInfo.reusedValueNames.contains(assignedValueName);
}

private String saveOriginalValue(String assignedValueName, VarInfo varInfo) {
  return String.format(" %s %s = %s;"
                      , varInfo.getType(), newID(assignedValueName), dedecorate(assignedValueName)
                      );
  //  return " "+ variableType +" "+ javaValueName +" = "+ dedecorate(assignedValueName) +";";
  //  return new StringBuilder().append(" ")   .append(variableType)
  //                            .append(" ")   .append(javaValueName)
  //                            .append(" = ") .append(dedecorate(assignedValueName))
  //                            .append(";")
  //                            .toString();
}

/**
 * {@inheritDoc}
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void
visitT_assignable(T_assignableContext ctx) {
  final boolean holdInAssignableState = inAssignableExpression;

  inAssignableExpression = true;
  visitChildren(ctx);

  inAssignableExpression = holdInAssignableState;
  return null;
}

/**
 * An undecorated identifier is the same as its Java form, so do nothing.
 * We only override the visit to this node here in order to put all the calls to visit
 * varieties of value-name decoration into the same class and near one another.
 * <p>{@inheritDoc}
 * @param undecoratedCtx  the parse tree, that is the single node for the undecorated value name
 *                        which contains the value-name token but has no children.
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void
visitT_UndecoratedIdentifier(T_UndecoratedIdentifierContext undecoratedCtx) {
  return null;
}

/**
 * Translate a pre-decorated value name to its Java form in place. If the value needs to be saved
 * because the name is referenced after being overwritten, then the characters <code>$T$</code> are
 * substituted for the decorator, but otherwise the decorator is made into a comment. For example,
 * <code>'xyx</code> is transformed to <code>$T$xyz</code> or <code>/*'*&sol;xyz</code>.
 * <p>{@inheritDoc}
 * @param preDecoratedCtx the parse tree, that is the single node for the pre-decorated value name
 *                        which contains the value-name token but has no children.
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void visitT_PreValueName(T_PreValueNameContext preDecoratedCtx) {
  final String id = rewriter.source(preDecoratedCtx);
  final String variableName = id.substring(1);
  final String javaVarName = ( ! inAssignableExpression && isReusedValue(id))
                             ? "$T$"+ variableName
                             : "/*'*/"+ variableName
                             ;
  rewriter.replace(preDecoratedCtx.getStart(), preDecoratedCtx.getStop(), javaVarName);
  return null;
}

/**
 * Translate a mid-decorated value name to its Java form in place. If the value needs to be saved
 * because the name is referenced after being overwritten, then the characters <code>$T$</code> are
 * substituted for the decorator, but otherwise the decorator and following value-identifier text
 * made into a comment. For example, <code>abc'xyx</code> is transformed to <code>abc$T$xyz</code>
 * or <code>abc/*'xyz*&sol;</code>.
 * <p>{@inheritDoc}
 * @param midNameContext the parse tree, the single node for the mid-decorated value name
 *                       which contains the value-name token but has no children.
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void visitT_MidValueName(T_MidValueNameContext midNameContext) {
  final String valueName = rewriter.source(midNameContext);            // example: id'xxx
  final int decoratorPosition = decoratorPosition(valueName);               // 2
  final String variableName = valueName.substring(0, decoratorPosition);    // id
  final String decorationText = valueName.substring(decoratorPosition+1);   //    xxx

  final String javaVarName;
  if ( ! inAssignableExpression && isReusedValue(valueName))
    javaVarName = variableName +"$T$"+ decorationText;                      // id$T$xxx
  else                                                                      //  or
    javaVarName = variableName +"/*"+ decoratorString+decorationText +"*/"; // id/*'xxx*/
  rewriter.replace(midNameContext.getStart(), midNameContext.getStop(), javaVarName);
  return null;
}

/**
 * Translate a post-decorated value name to its Java form, in place, with the decorator made into a
 * comment. For example, <code>xyz'</code> is transformed to <code>xyz/*'*&sol;</code>.
 * <p>{@inheritDoc}
 * @param valueNameCtx the parse tree, the single node for the post-decorated value name
 *                     which contains the value-name token but has no children.
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void visitT_PostValueName(T_PostValueNameContext valueNameCtx) {
  final String id = rewriter.source(valueNameCtx);
  final String variableName = id.substring(0, id.length()-1);
  rewriter.replace(valueNameCtx.getStart(), valueNameCtx.getStop(), variableName +"/*'*/");
  return null;
}

/**
 * The id is transformed from T form to Java form. If the value-name is referenced after its value
 * has been overwritten by an assignment to its variable, then a special name is used for the new
 * variable that keeps the copy of the overwritten value.
 *
 * <ul><li> <code>'name  -> /*'*&sol;name,</code> or <code>$T$name</code> if name is reused</li>
 *     <li> <code>nam'e  -> nam/*'*&sol;e,</code> or <code>nam$T$e</code> if name is reused</li>
 *     <li> <code>name'  -> name/*'*&sol;</code>
 *     <li> <code>name
 *             &NoBreak; -> name</code> (unchanged if no decorator)
 * </ul>
 *
 * @param id a possibly decorated T language identifier
 * @return a valid Java form to use for the <code>id</code>
 */
private String newID(final String id) {
  if ( ! inAssignableExpression && isReusedValue(id))
    return id.replace(decoratorString, "$T$"); // e.g., 'id --> $T$id
  else
    return dedecorate(id, decoratorPosition(id));
}

@Override public Void
visitT_means(T_meansContext ctx) {
  commentTheCode(ctx);
  // do not visitChildren(ctx);
  return null;
}


// ******** Utility Functions **********

private boolean isReusedValue(String id) {
  if (currentScope == null) // Not inside class yet
    return false;

  final VarInfo varinfo = currentScope.getExistingVarInfo(variableName(id));
  return originalValueIsReusedLater(id, varinfo);
}

private String javaName(String valueName) {
  // assumes decorator position >= 0
  final int primeAt = decoratorPosition(valueName);
  if (primeAt < 0) {
    return valueName;
  } else {
    if (primeAt == 0) { // is pre-decorated
      return "/*'*/"+ valueName.substring(1); // e.g., 'id --> /*'*/id
    } else { // mid- or post-decorated
      return valueName.substring(0, primeAt) +"/*"+ valueName.substring(primeAt) +"*/";
    }
  }
}

private String dedecorate(String valueName) {
  // assumes decorator position >= 0
  final int primeAt = decoratorPosition(valueName);
  return dedecorate(valueName, primeAt);
}

private String dedecorate(String valueName, final int primeAt) {
  if (primeAt < 0) // undecorated
    return valueName;

  if (primeAt == 0) { // is pre-decorated
    return "/*'*/"+ valueName.substring(1); // e.g., 'id --> /*'*/id
  } else { // mid- or post-decorated
    return valueName.substring(0, primeAt) +"/*"+ valueName.substring(primeAt) +"*/";
  }
}

private void commentTheCode(ParserRuleContext ctx) {
  String code = rewriter.source(ctx);
  rewriter.replace(ctx.getStart(), ctx.getStop(), commentTheCode(code));
}

/**
 * Comments out code using reversible T comment markers, even if the code
 * already contains comments. Even comment delimiters in quotes are marked,
 * but that's ok because they become part of a comment and are not operational.
 */
private String commentTheCode(String code) {
  if (code.contains("/*")) {
    return "/*$T$* "+ code.replace("/*", "(*$T$*").replace("*/", "*$T$*)")
          +" *$T$*/";
  } else {
    return "/*$T$* "+ code +" *$T$*/";
  }
}

/**
 * replaces all sections commented out by T with the uncommented version
 */
@SuppressWarnings("unused")
private String uncommentTheCode(String code) {
  if (code.contains("/*$T$ ")) {
    code = code.replace("/*$T$* ", ""  ).replace(" *$T$*/", ""  );
    if (code.contains("(*$T$*")) {
      code = code.replace("(*$T$*" , "/*").replace("*$T$*)" , "*/");
    }
  }
  return code;
}


} // class TLantlrRewriteVisitor
