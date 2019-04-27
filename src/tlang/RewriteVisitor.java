package tlang;

import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.jdt.annotation.Nullable;
import static tlang.TLantlrParser.*;

abstract class RewriteVisitor extends TLantlrBaseVisitor<Void> {

/** The scope surrounding the current visit. Passed as a "global" field between all the visits. */
  @Nullable protected Scope currentScope = null;
/** Map from a parse context (ctx) to the scope that the ctx's code defines. */
  protected Map<RuleContext, Scope> scopeMap;
/** A rewriter for collecting transformed code */
  protected ExtendedRewriter rewriter;

public RewriteVisitor( TokenStream             tokenStream
                      , Map<RuleContext, Scope> ctxToScope
                      ) {
  this.scopeMap = ctxToScope;
  this.rewriter = new ExtendedRewriter(tokenStream);
}

@Override public Void visitT_classDeclaration(T_classDeclarationContext ctx) {
  return typeVisit(ctx);
}

@Override public Void visitEnumDeclaration(EnumDeclarationContext ctx) {
  return typeVisit(ctx);
}

@Override public Void visitT_interfaceDeclaration(T_interfaceDeclarationContext ctx) {
  return typeVisit(ctx);
}

@Override public Void visitAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
  return typeVisit(ctx);
}

/**
 * {@inheritDoc}
 * A constructor has a background scope for a parent in order to hold all
 * the higher scope fields.
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void
visitT_constructorDeclaration(T_constructorDeclarationContext ctx) {
  final T_constructorBodyContext bodyCtx = ctx.t_constructorBody();
  executableVisit(ctx, bodyCtx);
  return null ;
}

/**
 * {@inheritDoc}
 * An initializer has a background scope for a parent in order to hold all
 * the higher scope fields.
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void
visitT_initializer(T_initializerContext ctx) {
  final T_blockContext bodyCtx = ctx.t_block();
  executableVisit(ctx, bodyCtx);
  return null;
}

/**
 * {@inheritDoc}
 * A method declaration has a background scope for a parent in order to hold all
 * the higher scope fields.
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void
visitT_methodDeclaration(T_methodDeclarationContext ctx) {
  final T_methodBodyContext bodyCtx = ctx.t_methodBody();
  executableVisit(ctx, bodyCtx);
  return null;
}

/**
 * {@inheritDoc}
 * @return a null to indicate that there are no children to visit.
 */
@Override public Void
visitT_block(T_blockContext ctx) {
  withChildScopeForCtx(ctx, () -> visitChildren(ctx));
  return null;
}



/* ******************************** SUPPORT METHODS ********************************** */

/** Set the scope to that of the type and visit the children.
 * @return a null to indicate that there are no children to visit.
 */
protected Void typeVisit(ParserRuleContext ctx) {
  withChildScopeForCtx(ctx, () -> visitChildren(ctx));
  return null;
}

protected void executableVisit(ParserRuleContext ctx, ParserRuleContext bodyCtx) {
  withChildScopeForCtx(ctx, () -> visitChildren(ctx));
}

/** Use the Java stack as an implicit stack for scopes  */
protected void withChildScopeForCtx(ParserRuleContext childCtx, Runnable function) {
  final Scope parentScope = currentScope; // save parent scope
  currentScope = scopeMap.get(childCtx);  // set to child scope
  function.run();                             // apply function using child scope
  currentScope = parentScope;             // restore currentScope
}

}
