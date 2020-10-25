// Generated from C:\Users\cowan\Documents\GitHub\TrueJ\grammar/TLantlr.g4 by ANTLR 4.5.3
package tlang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLantlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLantlrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_compilationUnit(TLantlrParser.T_compilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_packageDeclaration(TLantlrParser.T_packageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_importDeclaration(TLantlrParser.T_importDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeDeclaration(TLantlrParser.T_typeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_modifier(TLantlrParser.T_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_classOrInterfaceModifier(TLantlrParser.T_classOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_variableModifier(TLantlrParser.T_variableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_classDeclaration(TLantlrParser.T_classDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeParameters(TLantlrParser.T_typeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeParameter(TLantlrParser.T_typeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeBound(TLantlrParser.T_typeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_enumDeclaration(TLantlrParser.T_enumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_enumConstants(TLantlrParser.T_enumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_enumConstant(TLantlrParser.T_enumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_enumBodyDeclarations(TLantlrParser.T_enumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_interfaceDeclaration(TLantlrParser.T_interfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeList(TLantlrParser.T_typeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_classBody(TLantlrParser.T_classBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_interfaceBody(TLantlrParser.T_interfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_classBodyDeclaration(TLantlrParser.T_classBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_initializer(TLantlrParser.T_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_memberDeclaration(TLantlrParser.T_memberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_methodDeclaration(TLantlrParser.T_methodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_methodBody(TLantlrParser.T_methodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_genericMethodDeclaration(TLantlrParser.T_genericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_constructorDeclaration(TLantlrParser.T_constructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_constructorBody(TLantlrParser.T_constructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_genericConstructorDeclaration(TLantlrParser.T_genericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_fieldDeclaration(TLantlrParser.T_fieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitializedField}
	 * labeled alternative in {@link TLantlrParser#t_fieldDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedField(TLantlrParser.InitializedFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UninitializedField}
	 * labeled alternative in {@link TLantlrParser#t_fieldDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninitializedField(TLantlrParser.UninitializedFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_interfaceBodyDeclaration(TLantlrParser.T_interfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotationVariableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotationVariableDeclarator(TLantlrParser.T_annotationVariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitializedVariable}
	 * labeled alternative in {@link TLantlrParser#t_variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedVariable(TLantlrParser.InitializedVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UninitializedVariable}
	 * labeled alternative in {@link TLantlrParser#t_variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninitializedVariable(TLantlrParser.UninitializedVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_initializedVariableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_initializedVariableDeclaratorId(TLantlrParser.T_initializedVariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_uninitializedVariableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_uninitializedVariableDeclaratorId(TLantlrParser.T_uninitializedVariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotationVariableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotationVariableDeclaratorId(TLantlrParser.T_annotationVariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_variableInitializer(TLantlrParser.T_variableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_arrayInitializer(TLantlrParser.T_arrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_packageOrTypeName(TLantlrParser.T_packageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_enumConstantName(TLantlrParser.T_enumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeName(TLantlrParser.T_typeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_type(TLantlrParser.T_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_classOrInterfaceType(TLantlrParser.T_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_primitiveType(TLantlrParser.T_primitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeArguments(TLantlrParser.T_typeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeArgument(TLantlrParser.T_typeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_qualifiedNameList(TLantlrParser.T_qualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_formalParameters(TLantlrParser.T_formalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_formalParameterList(TLantlrParser.T_formalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_formalParameter(TLantlrParser.T_formalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_lastFormalParameter(TLantlrParser.T_lastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_qualifiedName(TLantlrParser.T_qualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_literal(TLantlrParser.T_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotation(TLantlrParser.T_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotationName(TLantlrParser.T_annotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_elementValuePairs(TLantlrParser.T_elementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_elementValuePair(TLantlrParser.T_elementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_elementValue(TLantlrParser.T_elementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_elementValueArrayInitializer(TLantlrParser.T_elementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotationTypeDeclaration(TLantlrParser.T_annotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotationTypeBody(TLantlrParser.T_annotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotationTypeElementDeclaration(TLantlrParser.T_annotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotationMethodRest(TLantlrParser.T_annotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_annotationConstantRest(TLantlrParser.T_annotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_defaultValue(TLantlrParser.T_defaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_block(TLantlrParser.T_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_blockStatement(TLantlrParser.T_blockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_localVariableDeclaration(TLantlrParser.T_localVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(TLantlrParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmt(TLantlrParser.AssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(TLantlrParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(TLantlrParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(TLantlrParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariantStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantStmt(TLantlrParser.VariantStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvariantStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariantStmt(TLantlrParser.InvariantStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStmt(TLantlrParser.DoStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStmt(TLantlrParser.TryStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(TLantlrParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SyncStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyncStmt(TLantlrParser.SyncStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(TLantlrParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStmt(TLantlrParser.ThrowStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(TLantlrParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(TLantlrParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(TLantlrParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(TLantlrParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(TLantlrParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreationStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreationStmt(TLantlrParser.CreationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelStmt(TLantlrParser.LabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MeansStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeansStmt(TLantlrParser.MeansStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GivenStmt}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGivenStmt(TLantlrParser.GivenStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ERROR_STMT}
	 * labeled alternative in {@link TLantlrParser#t_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitERROR_STMT(TLantlrParser.ERROR_STMTContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_ERROR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_ERROR(TLantlrParser.T_ERRORContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_assignable(TLantlrParser.T_assignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_catchClause(TLantlrParser.T_catchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_catchType(TLantlrParser.T_catchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_finallyBlock(TLantlrParser.T_finallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_resourceSpecification(TLantlrParser.T_resourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_resources(TLantlrParser.T_resourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_resource(TLantlrParser.T_resourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_switchBlockStatementGroup(TLantlrParser.T_switchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_switchLabel(TLantlrParser.T_switchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_forControl(TLantlrParser.T_forControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_forInit(TLantlrParser.T_forInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_enhancedForControl(TLantlrParser.T_enhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_forUpdate(TLantlrParser.T_forUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_parExpression(TLantlrParser.T_parExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_expressionList(TLantlrParser.T_expressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_constantExpression(TLantlrParser.T_constantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_expression(TLantlrParser.T_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(TLantlrParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConjRelationExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjRelationExpr(TLantlrParser.ConjRelationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuantifierExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifierExpr(TLantlrParser.QuantifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitComplementExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitComplementExpr(TLantlrParser.BitComplementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpr(TLantlrParser.SignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(TLantlrParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotSuperExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotSuperExpr(TLantlrParser.DotSuperExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(TLantlrParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(TLantlrParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotThisExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotThisExpr(TLantlrParser.DotThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpr(TLantlrParser.ShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(TLantlrParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConjunctiveBoolExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctiveBoolExpr(TLantlrParser.ConjunctiveBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotNewExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNewExpr(TLantlrParser.DotNewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(TLantlrParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(TLantlrParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExplicitGenericExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExplicitGenericExpr(TLantlrParser.DotExplicitGenericExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstanceOfExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpr(TLantlrParser.InstanceOfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(TLantlrParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalOrExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpr(TLantlrParser.ConditionalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(TLantlrParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(TLantlrParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExclusiveOrExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpr(TLantlrParser.ExclusiveOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(TLantlrParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalAndExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpr(TLantlrParser.ConditionalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCastExpr}
	 * labeled alternative in {@link TLantlrParser#t_expressionDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExpr(TLantlrParser.TypeCastExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_quantifiedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_quantifiedExpression(TLantlrParser.T_quantifiedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_rangeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_rangeConstraint(TLantlrParser.T_rangeConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_primary(TLantlrParser.T_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_creator(TLantlrParser.T_creatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_createdName(TLantlrParser.T_createdNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_innerCreator(TLantlrParser.T_innerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_arrayCreatorRest(TLantlrParser.T_arrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_classCreatorRest(TLantlrParser.T_classCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_explicitGenericInvocation(TLantlrParser.T_explicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_nonWildcardTypeArguments(TLantlrParser.T_nonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_typeArgumentsOrDiamond(TLantlrParser.T_typeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_nonWildcardTypeArgumentsOrDiamond(TLantlrParser.T_nonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_superSuffix(TLantlrParser.T_superSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_explicitGenericInvocationSuffix(TLantlrParser.T_explicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_arguments(TLantlrParser.T_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_finalMeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_finalMeans(TLantlrParser.T_finalMeansContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_markedFinalMeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_markedFinalMeans(TLantlrParser.T_markedFinalMeansContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_genericFinalMeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_genericFinalMeans(TLantlrParser.T_genericFinalMeansContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_means}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_means(TLantlrParser.T_meansContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_given}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_given(TLantlrParser.T_givenContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_idDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_idDeclaration(TLantlrParser.T_idDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_identifier(TLantlrParser.T_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code T_UndecoratedIdentifier}
	 * labeled alternative in {@link TLantlrParser#t_identifierDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_UndecoratedIdentifier(TLantlrParser.T_UndecoratedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code T_PreValueName}
	 * labeled alternative in {@link TLantlrParser#t_identifierDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_PreValueName(TLantlrParser.T_PreValueNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code T_MidValueName}
	 * labeled alternative in {@link TLantlrParser#t_identifierDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_MidValueName(TLantlrParser.T_MidValueNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code T_PostValueName}
	 * labeled alternative in {@link TLantlrParser#t_identifierDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_PostValueName(TLantlrParser.T_PostValueNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#t_valueName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_valueName(TLantlrParser.T_valueNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(TLantlrParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(TLantlrParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(TLantlrParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(TLantlrParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(TLantlrParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(TLantlrParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(TLantlrParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(TLantlrParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(TLantlrParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(TLantlrParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(TLantlrParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(TLantlrParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(TLantlrParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(TLantlrParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(TLantlrParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(TLantlrParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(TLantlrParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TLantlrParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(TLantlrParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(TLantlrParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(TLantlrParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(TLantlrParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(TLantlrParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(TLantlrParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(TLantlrParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(TLantlrParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(TLantlrParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(TLantlrParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(TLantlrParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(TLantlrParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(TLantlrParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(TLantlrParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(TLantlrParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(TLantlrParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(TLantlrParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(TLantlrParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(TLantlrParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(TLantlrParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(TLantlrParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TLantlrParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TLantlrParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(TLantlrParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(TLantlrParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(TLantlrParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(TLantlrParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(TLantlrParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(TLantlrParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(TLantlrParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(TLantlrParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(TLantlrParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(TLantlrParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(TLantlrParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(TLantlrParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TLantlrParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(TLantlrParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(TLantlrParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(TLantlrParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(TLantlrParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(TLantlrParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(TLantlrParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(TLantlrParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(TLantlrParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(TLantlrParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(TLantlrParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(TLantlrParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(TLantlrParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(TLantlrParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(TLantlrParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TLantlrParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(TLantlrParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(TLantlrParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(TLantlrParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TLantlrParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(TLantlrParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(TLantlrParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(TLantlrParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(TLantlrParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(TLantlrParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(TLantlrParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(TLantlrParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(TLantlrParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(TLantlrParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(TLantlrParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(TLantlrParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(TLantlrParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(TLantlrParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(TLantlrParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(TLantlrParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(TLantlrParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TLantlrParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(TLantlrParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(TLantlrParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(TLantlrParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(TLantlrParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(TLantlrParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(TLantlrParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(TLantlrParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(TLantlrParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(TLantlrParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(TLantlrParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(TLantlrParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(TLantlrParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLantlrParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TLantlrParser.ArgumentsContext ctx);
}