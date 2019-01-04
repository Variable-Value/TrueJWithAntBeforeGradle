package tlang;

import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.eclipse.jdt.annotation.Nullable;
import tlang.Scope;

import static tlang.TLantlrParser.*;
import static tlang.Scope.*;

/**
 * Stores field information for use by later vistors.
 */
@SuppressWarnings({"javadoc"})
public class FieldVisitor extends TLantlrBaseVisitor<Void> {

private static final Scope scopeParentLeftNullHere = null;

private final String program;
CollectingMsgListener errs;
/**
 * The scope surrounding the current visit. Used by almost all the visitXXX methods. A null value
 * means that we have not yet entered a scope.
 */
@Nullable protected Scope currentScope;
/** Map from the parse context (ctx) for the code of a scope to the corresponding Scope object. */
protected Map<RuleContext, Scope> scopeMap;


public FieldVisitor(String program, CollectingMsgListener msgListener, Map<RuleContext, Scope> scopeMap) {
  this.program = program;
  this.errs = msgListener;
  this.scopeMap = scopeMap;
}

/**
 * {@inheritDoc}
 */
@Override public Void
visitT_classDeclaration(T_classDeclarationContext classCtx) {
  Scope localParent = currentScope;

  String classStaticScopeName = classCtx.UndecoratedIdentifier().getText();
  Scope classScope= new Scope(program, classStaticScopeName, scopeParentLeftNullHere);
    /* For classes that are at the top level in their compile unit, a null parent indicates that they
     * are a top level class. For inner classes, the correct enclosing scope will be determined
     * during the ContextCheckVisitor.
     * TODO: Create a test and implement the inner-class parent assignment.
     */
  currentScope = new Scope(program, "this", classScope);
  scopeMap.put(classCtx, currentScope);                                         // push
    // note that static fields will need to be defined with
    // currentScope.parent.declareFieldName(fieldId, idDeclarationCtx.idType)

  visitChildren(classCtx);

  currentScope = localParent;                                                   // pop
  return null;
}

public void typeDeclarationVisit(ParserRuleContext ctx, String scopeName) {
  final Scope localParent = currentScope; // push

  currentScope= new Scope(program, scopeName, scopeParentLeftNullHere);
    // a scope within a method would not point to the correct parent if we were
    // to fill in parent scope here, so we wait until ContextCheckVisitor
  scopeMap.put(ctx, currentScope);
  visitChildren(ctx);

  currentScope = localParent; // pop
}

/**
 * {@inheritDoc}
 */
@Override
public Void visitT_enumDeclaration(T_enumDeclarationContext ctx) {
  String scopeName = ctx.UndecoratedIdentifier().getText();
  typeDeclarationVisit(ctx, scopeName);
  return null;
}

/**
 * {@inheritDoc}
 */
@Override
public Void visitT_interfaceDeclaration(T_interfaceDeclarationContext ctx) {
  String scopeName = ctx.UndecoratedIdentifier().getText();
  typeDeclarationVisit(ctx, scopeName);
  return null;
}

/**
 * {@inheritDoc}
 */
@Override
public Void visitInitializedField(InitializedFieldContext initializedCtx) {
  declareANewField(initializedCtx.t_idDeclaration());
  return null;
}

/**
 * {@inheritDoc}
 */
@Override
public Void visitUninitializedField(UninitializedFieldContext uninitializedCtx) {
  declareANewField(uninitializedCtx.t_idDeclaration());
  return null;
}

private void declareANewField(final T_idDeclarationContext idDeclarationCtx) {
  final Token fieldId = idDeclarationCtx.getStart();
  currentScope.declareFieldName(fieldId, idDeclarationCtx.idType);
}


// Skip processing for all other class components except inner types
//   which get handled by the above code

@Override
public Void visitT_methodDeclaration(T_methodDeclarationContext ctx) {
  // visitChildren(ctx);
  return null;
}

@Override
public Void visitT_genericMethodDeclaration(T_genericMethodDeclarationContext ctx) {
  // visitChildren(ctx);
  return null;
}

@Override
public Void visitT_constructorDeclaration(T_constructorDeclarationContext ctx) {
  // visitChildren(ctx);
  return null;
}

@Override
public Void visitT_genericConstructorDeclaration(T_genericConstructorDeclarationContext ctx) {
  // visitChildren(ctx);
  return null;
}

@Override
public Void visitT_annotationTypeDeclaration(T_annotationTypeDeclarationContext ctx) {
  // visitChildren(ctx);
  return null;
}

} // end class FieldVisitor
