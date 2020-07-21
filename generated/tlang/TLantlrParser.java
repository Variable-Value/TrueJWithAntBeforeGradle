// Generated from C:\Users\cowan\Documents\GitHub\TrueJ\grammar/TLantlr.g4 by ANTLR 4.5.3
package tlang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLantlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ABSTRACT=5, ASSERT=6, BOOLEAN=7, BREAK=8, 
		BYTE=9, CASE=10, CATCH=11, CHAR=12, CLASS=13, CONST=14, CONTINUE=15, DEFAULT=16, 
		DO=17, DOUBLE=18, ELSE=19, ENUM=20, EXTENDS=21, FINAL=22, FINALLY=23, 
		FLOAT=24, FOR=25, IF=26, GIVEN=27, GOTO=28, IMPLEMENTS=29, IMPORT=30, 
		INSTANCEOF=31, INT=32, INTERFACE=33, INVARIANT=34, LONG=35, MEANS=36, 
		NATIVE=37, NEW=38, PACKAGE=39, PRIVATE=40, PROTECTED=41, PUBLIC=42, RETURN=43, 
		SHORT=44, STATIC=45, STRICTFP=46, SUPER=47, SWITCH=48, SYNCHRONIZED=49, 
		THIS=50, THROW=51, THROWS=52, TRANSIENT=53, TRY=54, VARIANT=55, VOID=56, 
		VOLATILE=57, WHILE=58, BooleanLiteral=59, NullLiteral=60, CONJUNCTIVE_BOOLEAN_EQUAL=61, 
		CONJUNCTIVE_IMPLIES=62, CONJUNCTIVE_CONSEQUENCE=63, CONJUNCTIVE_NOT_EQUAL=64, 
		UndecoratedIdentifier=65, Identifier=66, PreValueName=67, MidValueName=68, 
		PostValueName=69, WS=70, COMMENT=71, LINE_COMMENT=72, IntegerLiteral=73, 
		FloatingPointLiteral=74, CharacterLiteral=75, StringLiteral=76, LPAREN=77, 
		RPAREN=78, LBRACE=79, RBRACE=80, LBRACK=81, RBRACK=82, SEMI=83, COMMA=84, 
		DOT=85, ASSIGN=86, GT=87, LT=88, BANG=89, TILDE=90, QUESTION=91, COLON=92, 
		EQUAL=93, LE=94, GE=95, NOTEQUAL=96, AND=97, OR=98, INC=99, DEC=100, ADD=101, 
		SUB=102, MUL=103, DIV=104, BITAND=105, BITOR=106, CARET=107, MOD=108, 
		ADD_ASSIGN=109, SUB_ASSIGN=110, MUL_ASSIGN=111, DIV_ASSIGN=112, AND_ASSIGN=113, 
		OR_ASSIGN=114, XOR_ASSIGN=115, MOD_ASSIGN=116, LSHIFT_ASSIGN=117, RSHIFT_ASSIGN=118, 
		URSHIFT_ASSIGN=119, AT=120, ELLIPSIS=121;
	public static final int
		RULE_t_compilationUnit = 0, RULE_t_packageDeclaration = 1, RULE_t_importDeclaration = 2, 
		RULE_t_typeDeclaration = 3, RULE_t_modifier = 4, RULE_t_classOrInterfaceModifier = 5, 
		RULE_t_variableModifier = 6, RULE_t_classDeclaration = 7, RULE_t_typeParameters = 8, 
		RULE_t_typeParameter = 9, RULE_t_typeBound = 10, RULE_t_enumDeclaration = 11, 
		RULE_t_enumConstants = 12, RULE_t_enumConstant = 13, RULE_t_enumBodyDeclarations = 14, 
		RULE_t_interfaceDeclaration = 15, RULE_t_typeList = 16, RULE_t_classBody = 17, 
		RULE_t_interfaceBody = 18, RULE_t_classBodyDeclaration = 19, RULE_t_initializer = 20, 
		RULE_t_memberDeclaration = 21, RULE_t_methodDeclaration = 22, RULE_t_genericMethodDeclaration = 23, 
		RULE_t_constructorDeclaration = 24, RULE_t_genericConstructorDeclaration = 25, 
		RULE_t_fieldDeclaration = 26, RULE_t_fieldDeclarator = 27, RULE_t_interfaceBodyDeclaration = 28, 
		RULE_t_annotationVariableDeclarator = 29, RULE_t_variableDeclarator = 30, 
		RULE_t_initializedVariableDeclaratorId = 31, RULE_t_uninitializedVariableDeclaratorId = 32, 
		RULE_t_annotationVariableDeclaratorId = 33, RULE_t_variableInitializer = 34, 
		RULE_t_arrayInitializer = 35, RULE_t_packageOrTypeName = 36, RULE_t_enumConstantName = 37, 
		RULE_t_typeName = 38, RULE_t_type = 39, RULE_t_classOrInterfaceType = 40, 
		RULE_t_primitiveType = 41, RULE_t_typeArguments = 42, RULE_t_typeArgument = 43, 
		RULE_t_qualifiedNameList = 44, RULE_t_formalParameters = 45, RULE_t_formalParameterList = 46, 
		RULE_t_formalParameter = 47, RULE_t_lastFormalParameter = 48, RULE_t_methodBody = 49, 
		RULE_t_constructorBody = 50, RULE_t_qualifiedName = 51, RULE_t_literal = 52, 
		RULE_t_annotation = 53, RULE_t_annotationName = 54, RULE_t_elementValuePairs = 55, 
		RULE_t_elementValuePair = 56, RULE_t_elementValue = 57, RULE_t_elementValueArrayInitializer = 58, 
		RULE_t_annotationTypeDeclaration = 59, RULE_t_annotationTypeBody = 60, 
		RULE_t_annotationTypeElementDeclaration = 61, RULE_t_annotationMethodRest = 62, 
		RULE_t_annotationConstantRest = 63, RULE_t_defaultValue = 64, RULE_t_block = 65, 
		RULE_t_blockStatement = 66, RULE_t_localVariableDeclaration = 67, RULE_t_statement = 68, 
		RULE_t_ERROR = 69, RULE_t_assignable = 70, RULE_t_catchClause = 71, RULE_t_catchType = 72, 
		RULE_t_finallyBlock = 73, RULE_t_resourceSpecification = 74, RULE_t_resources = 75, 
		RULE_t_resource = 76, RULE_t_switchBlockStatementGroup = 77, RULE_t_switchLabel = 78, 
		RULE_t_forControl = 79, RULE_t_forInit = 80, RULE_t_enhancedForControl = 81, 
		RULE_t_forUpdate = 82, RULE_t_parExpression = 83, RULE_t_expressionList = 84, 
		RULE_t_constantExpression = 85, RULE_t_expression = 86, RULE_t_expressionDetail = 87, 
		RULE_t_primary = 88, RULE_t_creator = 89, RULE_t_createdName = 90, RULE_t_innerCreator = 91, 
		RULE_t_arrayCreatorRest = 92, RULE_t_classCreatorRest = 93, RULE_t_explicitGenericInvocation = 94, 
		RULE_t_nonWildcardTypeArguments = 95, RULE_t_typeArgumentsOrDiamond = 96, 
		RULE_t_nonWildcardTypeArgumentsOrDiamond = 97, RULE_t_superSuffix = 98, 
		RULE_t_explicitGenericInvocationSuffix = 99, RULE_t_arguments = 100, RULE_t_means = 101, 
		RULE_t_given = 102, RULE_t_idDeclaration = 103, RULE_t_identifier = 104, 
		RULE_t_identifierDetail = 105, RULE_t_valueName = 106, RULE_compilationUnit = 107, 
		RULE_packageDeclaration = 108, RULE_importDeclaration = 109, RULE_typeDeclaration = 110, 
		RULE_modifier = 111, RULE_classOrInterfaceModifier = 112, RULE_variableModifier = 113, 
		RULE_classDeclaration = 114, RULE_typeParameters = 115, RULE_typeParameter = 116, 
		RULE_typeBound = 117, RULE_enumDeclaration = 118, RULE_enumConstants = 119, 
		RULE_enumConstant = 120, RULE_enumBodyDeclarations = 121, RULE_interfaceDeclaration = 122, 
		RULE_typeList = 123, RULE_classBody = 124, RULE_interfaceBody = 125, RULE_classBodyDeclaration = 126, 
		RULE_memberDeclaration = 127, RULE_methodDeclaration = 128, RULE_genericMethodDeclaration = 129, 
		RULE_constructorDeclaration = 130, RULE_genericConstructorDeclaration = 131, 
		RULE_fieldDeclaration = 132, RULE_interfaceBodyDeclaration = 133, RULE_interfaceMemberDeclaration = 134, 
		RULE_constDeclaration = 135, RULE_constantDeclarator = 136, RULE_interfaceMethodDeclaration = 137, 
		RULE_genericInterfaceMethodDeclaration = 138, RULE_variableDeclarators = 139, 
		RULE_variableDeclarator = 140, RULE_variableDeclaratorId = 141, RULE_variableInitializer = 142, 
		RULE_arrayInitializer = 143, RULE_packageOrTypeName = 144, RULE_enumConstantName = 145, 
		RULE_typeName = 146, RULE_type = 147, RULE_classOrInterfaceType = 148, 
		RULE_primitiveType = 149, RULE_typeArguments = 150, RULE_typeArgument = 151, 
		RULE_qualifiedNameList = 152, RULE_formalParameters = 153, RULE_formalParameterList = 154, 
		RULE_formalParameter = 155, RULE_lastFormalParameter = 156, RULE_methodBody = 157, 
		RULE_constructorBody = 158, RULE_qualifiedName = 159, RULE_literal = 160, 
		RULE_annotation = 161, RULE_annotationName = 162, RULE_elementValuePairs = 163, 
		RULE_elementValuePair = 164, RULE_elementValue = 165, RULE_elementValueArrayInitializer = 166, 
		RULE_annotationTypeDeclaration = 167, RULE_annotationTypeBody = 168, RULE_annotationTypeElementDeclaration = 169, 
		RULE_annotationTypeElementRest = 170, RULE_annotationMethodOrConstantRest = 171, 
		RULE_annotationMethodRest = 172, RULE_annotationConstantRest = 173, RULE_defaultValue = 174, 
		RULE_block = 175, RULE_blockStatement = 176, RULE_localVariableDeclarationStatement = 177, 
		RULE_localVariableDeclaration = 178, RULE_statement = 179, RULE_catchClause = 180, 
		RULE_catchType = 181, RULE_finallyBlock = 182, RULE_resourceSpecification = 183, 
		RULE_resources = 184, RULE_resource = 185, RULE_switchBlockStatementGroup = 186, 
		RULE_switchLabel = 187, RULE_forControl = 188, RULE_forInit = 189, RULE_enhancedForControl = 190, 
		RULE_forUpdate = 191, RULE_parExpression = 192, RULE_expressionList = 193, 
		RULE_statementExpression = 194, RULE_constantExpression = 195, RULE_expression = 196, 
		RULE_primary = 197, RULE_creator = 198, RULE_createdName = 199, RULE_innerCreator = 200, 
		RULE_arrayCreatorRest = 201, RULE_classCreatorRest = 202, RULE_explicitGenericInvocation = 203, 
		RULE_nonWildcardTypeArguments = 204, RULE_typeArgumentsOrDiamond = 205, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 206, RULE_superSuffix = 207, 
		RULE_explicitGenericInvocationSuffix = 208, RULE_arguments = 209;
	public static final String[] ruleNames = {
		"t_compilationUnit", "t_packageDeclaration", "t_importDeclaration", "t_typeDeclaration", 
		"t_modifier", "t_classOrInterfaceModifier", "t_variableModifier", "t_classDeclaration", 
		"t_typeParameters", "t_typeParameter", "t_typeBound", "t_enumDeclaration", 
		"t_enumConstants", "t_enumConstant", "t_enumBodyDeclarations", "t_interfaceDeclaration", 
		"t_typeList", "t_classBody", "t_interfaceBody", "t_classBodyDeclaration", 
		"t_initializer", "t_memberDeclaration", "t_methodDeclaration", "t_genericMethodDeclaration", 
		"t_constructorDeclaration", "t_genericConstructorDeclaration", "t_fieldDeclaration", 
		"t_fieldDeclarator", "t_interfaceBodyDeclaration", "t_annotationVariableDeclarator", 
		"t_variableDeclarator", "t_initializedVariableDeclaratorId", "t_uninitializedVariableDeclaratorId", 
		"t_annotationVariableDeclaratorId", "t_variableInitializer", "t_arrayInitializer", 
		"t_packageOrTypeName", "t_enumConstantName", "t_typeName", "t_type", "t_classOrInterfaceType", 
		"t_primitiveType", "t_typeArguments", "t_typeArgument", "t_qualifiedNameList", 
		"t_formalParameters", "t_formalParameterList", "t_formalParameter", "t_lastFormalParameter", 
		"t_methodBody", "t_constructorBody", "t_qualifiedName", "t_literal", "t_annotation", 
		"t_annotationName", "t_elementValuePairs", "t_elementValuePair", "t_elementValue", 
		"t_elementValueArrayInitializer", "t_annotationTypeDeclaration", "t_annotationTypeBody", 
		"t_annotationTypeElementDeclaration", "t_annotationMethodRest", "t_annotationConstantRest", 
		"t_defaultValue", "t_block", "t_blockStatement", "t_localVariableDeclaration", 
		"t_statement", "t_ERROR", "t_assignable", "t_catchClause", "t_catchType", 
		"t_finallyBlock", "t_resourceSpecification", "t_resources", "t_resource", 
		"t_switchBlockStatementGroup", "t_switchLabel", "t_forControl", "t_forInit", 
		"t_enhancedForControl", "t_forUpdate", "t_parExpression", "t_expressionList", 
		"t_constantExpression", "t_expression", "t_expressionDetail", "t_primary", 
		"t_creator", "t_createdName", "t_innerCreator", "t_arrayCreatorRest", 
		"t_classCreatorRest", "t_explicitGenericInvocation", "t_nonWildcardTypeArguments", 
		"t_typeArgumentsOrDiamond", "t_nonWildcardTypeArgumentsOrDiamond", "t_superSuffix", 
		"t_explicitGenericInvocationSuffix", "t_arguments", "t_means", "t_given", 
		"t_idDeclaration", "t_identifier", "t_identifierDetail", "t_valueName", 
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"packageOrTypeName", "enumConstantName", "typeName", "type", "classOrInterfaceType", 
		"primitiveType", "typeArguments", "typeArgument", "qualifiedNameList", 
		"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
		"methodBody", "constructorBody", "qualifiedName", "literal", "annotation", 
		"annotationName", "elementValuePairs", "elementValuePair", "elementValue", 
		"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
		"annotationMethodRest", "annotationConstantRest", "defaultValue", "block", 
		"blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"statement", "catchClause", "catchType", "finallyBlock", "resourceSpecification", 
		"resources", "resource", "switchBlockStatementGroup", "switchLabel", "forControl", 
		"forInit", "enhancedForControl", "forUpdate", "parExpression", "expressionList", 
		"statementExpression", "constantExpression", "expression", "primary", 
		"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
		"explicitGenericInvocation", "nonWildcardTypeArguments", "typeArgumentsOrDiamond", 
		"nonWildcardTypeArgumentsOrDiamond", "superSuffix", "explicitGenericInvocationSuffix", 
		"arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sum'", "'prod'", "'forall'", "'forsome'", "'abstract'", "'assert'", 
		"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", 
		"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
		"'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'given'", 
		"'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'invariant'", "'long'", "'means'", "'native'", "'new'", "'package'", 
		"'private'", "'protected'", "'public'", "'return'", "'short'", "'static'", 
		"'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", 
		"'throws'", "'transient'", "'try'", "'variant'", "'void'", "'volatile'", 
		"'while'", null, "'null'", "'==='", "'==>'", "'<=='", "'=!='", null, null, 
		null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
		"'>>='", "'>>>='", "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", 
		"BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", 
		"DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", 
		"FOR", "IF", "GIVEN", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", 
		"INTERFACE", "INVARIANT", "LONG", "MEANS", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VARIANT", "VOID", "VOLATILE", "WHILE", "BooleanLiteral", "NullLiteral", 
		"CONJUNCTIVE_BOOLEAN_EQUAL", "CONJUNCTIVE_IMPLIES", "CONJUNCTIVE_CONSEQUENCE", 
		"CONJUNCTIVE_NOT_EQUAL", "UndecoratedIdentifier", "Identifier", "PreValueName", 
		"MidValueName", "PostValueName", "WS", "COMMENT", "LINE_COMMENT", "IntegerLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "AT", "ELLIPSIS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TLantlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLantlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class T_compilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TLantlrParser.EOF, 0); }
		public T_packageDeclarationContext t_packageDeclaration() {
			return getRuleContext(T_packageDeclarationContext.class,0);
		}
		public List<T_importDeclarationContext> t_importDeclaration() {
			return getRuleContexts(T_importDeclarationContext.class);
		}
		public T_importDeclarationContext t_importDeclaration(int i) {
			return getRuleContext(T_importDeclarationContext.class,i);
		}
		public List<T_typeDeclarationContext> t_typeDeclaration() {
			return getRuleContexts(T_typeDeclarationContext.class);
		}
		public T_typeDeclarationContext t_typeDeclaration(int i) {
			return getRuleContext(T_typeDeclarationContext.class,i);
		}
		public T_compilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_compilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_compilationUnitContext t_compilationUnit() throws RecognitionException {
		T_compilationUnitContext _localctx = new T_compilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_t_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(420);
				t_packageDeclaration();
				}
				break;
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(423);
				t_importDeclaration();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << DEFAULT) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(429);
				t_typeDeclaration();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_packageDeclarationContext extends ParserRuleContext {
		public T_qualifiedNameContext t_qualifiedName() {
			return getRuleContext(T_qualifiedNameContext.class,0);
		}
		public List<T_annotationContext> t_annotation() {
			return getRuleContexts(T_annotationContext.class);
		}
		public T_annotationContext t_annotation(int i) {
			return getRuleContext(T_annotationContext.class,i);
		}
		public T_packageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_packageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_packageDeclarationContext t_packageDeclaration() throws RecognitionException {
		T_packageDeclarationContext _localctx = new T_packageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_t_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(437);
				t_annotation();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(PACKAGE);
			setState(444);
			t_qualifiedName();
			setState(445);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_importDeclarationContext extends ParserRuleContext {
		public T_qualifiedNameContext t_qualifiedName() {
			return getRuleContext(T_qualifiedNameContext.class,0);
		}
		public T_importDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_importDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_importDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_importDeclarationContext t_importDeclaration() throws RecognitionException {
		T_importDeclarationContext _localctx = new T_importDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_t_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(IMPORT);
			setState(449);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(448);
				match(STATIC);
				}
			}

			setState(451);
			t_qualifiedName();
			setState(454);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(452);
				match(DOT);
				setState(453);
				match(MUL);
				}
			}

			setState(456);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeDeclarationContext extends ParserRuleContext {
		public T_classDeclarationContext t_classDeclaration() {
			return getRuleContext(T_classDeclarationContext.class,0);
		}
		public List<T_classOrInterfaceModifierContext> t_classOrInterfaceModifier() {
			return getRuleContexts(T_classOrInterfaceModifierContext.class);
		}
		public T_classOrInterfaceModifierContext t_classOrInterfaceModifier(int i) {
			return getRuleContext(T_classOrInterfaceModifierContext.class,i);
		}
		public T_enumDeclarationContext t_enumDeclaration() {
			return getRuleContext(T_enumDeclarationContext.class,0);
		}
		public T_interfaceDeclarationContext t_interfaceDeclaration() {
			return getRuleContext(T_interfaceDeclarationContext.class,0);
		}
		public T_annotationTypeDeclarationContext t_annotationTypeDeclaration() {
			return getRuleContext(T_annotationTypeDeclarationContext.class,0);
		}
		public T_typeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeDeclarationContext t_typeDeclaration() throws RecognitionException {
		T_typeDeclarationContext _localctx = new T_typeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_t_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(458);
					t_classOrInterfaceModifier();
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(464);
				t_classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(465);
					t_classOrInterfaceModifier();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471);
				t_enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(472);
					t_classOrInterfaceModifier();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
				t_interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(479);
						t_classOrInterfaceModifier();
						}
						} 
					}
					setState(484);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(485);
				t_annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_modifierContext extends ParserRuleContext {
		public T_classOrInterfaceModifierContext t_classOrInterfaceModifier() {
			return getRuleContext(T_classOrInterfaceModifierContext.class,0);
		}
		public T_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_modifierContext t_modifier() throws RecognitionException {
		T_modifierContext _localctx = new T_modifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_t_modifier);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				t_classOrInterfaceModifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_classOrInterfaceModifierContext extends ParserRuleContext {
		public T_annotationContext t_annotation() {
			return getRuleContext(T_annotationContext.class,0);
		}
		public T_classOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_classOrInterfaceModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_classOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_classOrInterfaceModifierContext t_classOrInterfaceModifier() throws RecognitionException {
		T_classOrInterfaceModifierContext _localctx = new T_classOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_t_classOrInterfaceModifier);
		int _la;
		try {
			setState(495);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				t_annotation();
				}
				break;
			case ABSTRACT:
			case DEFAULT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case TRANSIENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_variableModifierContext extends ParserRuleContext {
		public T_annotationContext t_annotation() {
			return getRuleContext(T_annotationContext.class,0);
		}
		public T_variableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_variableModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_variableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_variableModifierContext t_variableModifier() throws RecognitionException {
		T_variableModifierContext _localctx = new T_variableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_t_variableModifier);
		try {
			setState(499);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				t_annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_classDeclarationContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_classBodyContext t_classBody() {
			return getRuleContext(T_classBodyContext.class,0);
		}
		public T_typeParametersContext t_typeParameters() {
			return getRuleContext(T_typeParametersContext.class,0);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_typeListContext t_typeList() {
			return getRuleContext(T_typeListContext.class,0);
		}
		public T_classDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_classDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_classDeclarationContext t_classDeclaration() throws RecognitionException {
		T_classDeclarationContext _localctx = new T_classDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_t_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(CLASS);
			setState(502);
			match(UndecoratedIdentifier);
			setState(504);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(503);
				t_typeParameters();
				}
			}

			setState(508);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(506);
				match(EXTENDS);
				setState(507);
				t_type();
				}
			}

			setState(512);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(510);
				match(IMPLEMENTS);
				setState(511);
				t_typeList();
				}
			}

			setState(514);
			t_classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeParametersContext extends ParserRuleContext {
		public List<T_typeParameterContext> t_typeParameter() {
			return getRuleContexts(T_typeParameterContext.class);
		}
		public T_typeParameterContext t_typeParameter(int i) {
			return getRuleContext(T_typeParameterContext.class,i);
		}
		public T_typeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeParametersContext t_typeParameters() throws RecognitionException {
		T_typeParametersContext _localctx = new T_typeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_t_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(LT);
			setState(517);
			t_typeParameter();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(518);
				match(COMMA);
				setState(519);
				t_typeParameter();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeParameterContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_typeBoundContext t_typeBound() {
			return getRuleContext(T_typeBoundContext.class,0);
		}
		public T_typeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeParameterContext t_typeParameter() throws RecognitionException {
		T_typeParameterContext _localctx = new T_typeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_t_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(UndecoratedIdentifier);
			setState(530);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(528);
				match(EXTENDS);
				setState(529);
				t_typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeBoundContext extends ParserRuleContext {
		public List<T_typeContext> t_type() {
			return getRuleContexts(T_typeContext.class);
		}
		public T_typeContext t_type(int i) {
			return getRuleContext(T_typeContext.class,i);
		}
		public T_typeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeBoundContext t_typeBound() throws RecognitionException {
		T_typeBoundContext _localctx = new T_typeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_t_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			t_type();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(533);
				match(BITAND);
				setState(534);
				t_type();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_enumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(TLantlrParser.ENUM, 0); }
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_typeListContext t_typeList() {
			return getRuleContext(T_typeListContext.class,0);
		}
		public T_enumConstantsContext t_enumConstants() {
			return getRuleContext(T_enumConstantsContext.class,0);
		}
		public T_enumBodyDeclarationsContext t_enumBodyDeclarations() {
			return getRuleContext(T_enumBodyDeclarationsContext.class,0);
		}
		public T_enumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_enumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_enumDeclarationContext t_enumDeclaration() throws RecognitionException {
		T_enumDeclarationContext _localctx = new T_enumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_t_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(ENUM);
			setState(541);
			match(UndecoratedIdentifier);
			setState(544);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(542);
				match(IMPLEMENTS);
				setState(543);
				t_typeList();
				}
			}

			setState(546);
			match(LBRACE);
			setState(548);
			_la = _input.LA(1);
			if (_la==UndecoratedIdentifier || _la==AT) {
				{
				setState(547);
				t_enumConstants();
				}
			}

			setState(551);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(550);
				match(COMMA);
				}
			}

			setState(554);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(553);
				t_enumBodyDeclarations();
				}
			}

			setState(556);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_enumConstantsContext extends ParserRuleContext {
		public List<T_enumConstantContext> t_enumConstant() {
			return getRuleContexts(T_enumConstantContext.class);
		}
		public T_enumConstantContext t_enumConstant(int i) {
			return getRuleContext(T_enumConstantContext.class,i);
		}
		public T_enumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_enumConstants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_enumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_enumConstantsContext t_enumConstants() throws RecognitionException {
		T_enumConstantsContext _localctx = new T_enumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_t_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			t_enumConstant();
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(559);
					match(COMMA);
					setState(560);
					t_enumConstant();
					}
					} 
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_enumConstantContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public List<T_annotationContext> t_annotation() {
			return getRuleContexts(T_annotationContext.class);
		}
		public T_annotationContext t_annotation(int i) {
			return getRuleContext(T_annotationContext.class,i);
		}
		public T_argumentsContext t_arguments() {
			return getRuleContext(T_argumentsContext.class,0);
		}
		public T_classBodyContext t_classBody() {
			return getRuleContext(T_classBodyContext.class,0);
		}
		public T_enumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_enumConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_enumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_enumConstantContext t_enumConstant() throws RecognitionException {
		T_enumConstantContext _localctx = new T_enumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_t_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(566);
				t_annotation();
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
			match(UndecoratedIdentifier);
			setState(574);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(573);
				t_arguments();
				}
			}

			setState(577);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(576);
				t_classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_enumBodyDeclarationsContext extends ParserRuleContext {
		public List<T_classBodyDeclarationContext> t_classBodyDeclaration() {
			return getRuleContexts(T_classBodyDeclarationContext.class);
		}
		public T_classBodyDeclarationContext t_classBodyDeclaration(int i) {
			return getRuleContext(T_classBodyDeclarationContext.class,i);
		}
		public T_enumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_enumBodyDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_enumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_enumBodyDeclarationsContext t_enumBodyDeclarations() throws RecognitionException {
		T_enumBodyDeclarationsContext _localctx = new T_enumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_t_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(SEMI);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(580);
				t_classBodyDeclaration();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_interfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_interfaceBodyContext t_interfaceBody() {
			return getRuleContext(T_interfaceBodyContext.class,0);
		}
		public T_typeParametersContext t_typeParameters() {
			return getRuleContext(T_typeParametersContext.class,0);
		}
		public T_typeListContext t_typeList() {
			return getRuleContext(T_typeListContext.class,0);
		}
		public T_interfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_interfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_interfaceDeclarationContext t_interfaceDeclaration() throws RecognitionException {
		T_interfaceDeclarationContext _localctx = new T_interfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_t_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(INTERFACE);
			setState(587);
			match(UndecoratedIdentifier);
			setState(589);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(588);
				t_typeParameters();
				}
			}

			setState(593);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(591);
				match(EXTENDS);
				setState(592);
				t_typeList();
				}
			}

			setState(595);
			t_interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeListContext extends ParserRuleContext {
		public List<T_typeContext> t_type() {
			return getRuleContexts(T_typeContext.class);
		}
		public T_typeContext t_type(int i) {
			return getRuleContext(T_typeContext.class,i);
		}
		public T_typeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeListContext t_typeList() throws RecognitionException {
		T_typeListContext _localctx = new T_typeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_t_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			t_type();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(598);
				match(COMMA);
				setState(599);
				t_type();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_classBodyContext extends ParserRuleContext {
		public List<T_classBodyDeclarationContext> t_classBodyDeclaration() {
			return getRuleContexts(T_classBodyDeclarationContext.class);
		}
		public T_classBodyDeclarationContext t_classBodyDeclaration(int i) {
			return getRuleContext(T_classBodyDeclarationContext.class,i);
		}
		public T_classBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_classBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_classBodyContext t_classBody() throws RecognitionException {
		T_classBodyContext _localctx = new T_classBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_t_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(LBRACE);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(606);
				t_classBodyDeclaration();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_interfaceBodyContext extends ParserRuleContext {
		public List<T_interfaceBodyDeclarationContext> t_interfaceBodyDeclaration() {
			return getRuleContexts(T_interfaceBodyDeclarationContext.class);
		}
		public T_interfaceBodyDeclarationContext t_interfaceBodyDeclaration(int i) {
			return getRuleContext(T_interfaceBodyDeclarationContext.class,i);
		}
		public T_interfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_interfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_interfaceBodyContext t_interfaceBody() throws RecognitionException {
		T_interfaceBodyContext _localctx = new T_interfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_t_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(LBRACE);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(615);
				t_interfaceBodyDeclaration();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_classBodyDeclarationContext extends ParserRuleContext {
		public T_initializerContext t_initializer() {
			return getRuleContext(T_initializerContext.class,0);
		}
		public T_memberDeclarationContext t_memberDeclaration() {
			return getRuleContext(T_memberDeclarationContext.class,0);
		}
		public List<T_modifierContext> t_modifier() {
			return getRuleContexts(T_modifierContext.class);
		}
		public T_modifierContext t_modifier(int i) {
			return getRuleContext(T_modifierContext.class,i);
		}
		public T_classBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_classBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_classBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_classBodyDeclarationContext t_classBodyDeclaration() throws RecognitionException {
		T_classBodyDeclarationContext _localctx = new T_classBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_t_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(624);
					match(STATIC);
					}
				}

				setState(627);
				t_initializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(628);
						t_modifier();
						}
						} 
					}
					setState(633);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(634);
				t_memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_initializerContext extends ParserRuleContext {
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public T_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_initializerContext t_initializer() throws RecognitionException {
		T_initializerContext _localctx = new T_initializerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_t_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			t_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_memberDeclarationContext extends ParserRuleContext {
		public T_methodDeclarationContext t_methodDeclaration() {
			return getRuleContext(T_methodDeclarationContext.class,0);
		}
		public T_genericMethodDeclarationContext t_genericMethodDeclaration() {
			return getRuleContext(T_genericMethodDeclarationContext.class,0);
		}
		public T_fieldDeclarationContext t_fieldDeclaration() {
			return getRuleContext(T_fieldDeclarationContext.class,0);
		}
		public T_constructorDeclarationContext t_constructorDeclaration() {
			return getRuleContext(T_constructorDeclarationContext.class,0);
		}
		public T_genericConstructorDeclarationContext t_genericConstructorDeclaration() {
			return getRuleContext(T_genericConstructorDeclarationContext.class,0);
		}
		public T_interfaceDeclarationContext t_interfaceDeclaration() {
			return getRuleContext(T_interfaceDeclarationContext.class,0);
		}
		public T_annotationTypeDeclarationContext t_annotationTypeDeclaration() {
			return getRuleContext(T_annotationTypeDeclarationContext.class,0);
		}
		public T_classDeclarationContext t_classDeclaration() {
			return getRuleContext(T_classDeclarationContext.class,0);
		}
		public T_enumDeclarationContext t_enumDeclaration() {
			return getRuleContext(T_enumDeclarationContext.class,0);
		}
		public T_memberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_memberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_memberDeclarationContext t_memberDeclaration() throws RecognitionException {
		T_memberDeclarationContext _localctx = new T_memberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_t_memberDeclaration);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				t_methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				t_genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(641);
				t_fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				t_constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(643);
				t_genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(644);
				t_interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(645);
				t_annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(646);
				t_classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(647);
				t_enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_methodDeclarationContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_formalParametersContext t_formalParameters() {
			return getRuleContext(T_formalParametersContext.class,0);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_methodBodyContext t_methodBody() {
			return getRuleContext(T_methodBodyContext.class,0);
		}
		public T_qualifiedNameListContext t_qualifiedNameList() {
			return getRuleContext(T_qualifiedNameListContext.class,0);
		}
		public T_meansContext t_means() {
			return getRuleContext(T_meansContext.class,0);
		}
		public T_methodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_methodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_methodDeclarationContext t_methodDeclaration() throws RecognitionException {
		T_methodDeclarationContext _localctx = new T_methodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_t_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case UndecoratedIdentifier:
				{
				setState(650);
				t_type();
				}
				break;
			case VOID:
				{
				setState(651);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(654);
			match(UndecoratedIdentifier);
			setState(655);
			t_formalParameters();
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(656);
				match(LBRACK);
				setState(657);
				match(RBRACK);
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(663);
				match(THROWS);
				setState(664);
				t_qualifiedNameList();
				}
			}

			setState(669);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(667);
				t_methodBody();
				}
				break;
			case SEMI:
				{
				setState(668);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(672);
			_la = _input.LA(1);
			if (_la==MEANS) {
				{
				setState(671);
				t_means();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_genericMethodDeclarationContext extends ParserRuleContext {
		public T_typeParametersContext t_typeParameters() {
			return getRuleContext(T_typeParametersContext.class,0);
		}
		public T_methodDeclarationContext t_methodDeclaration() {
			return getRuleContext(T_methodDeclarationContext.class,0);
		}
		public T_genericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_genericMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_genericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_genericMethodDeclarationContext t_genericMethodDeclaration() throws RecognitionException {
		T_genericMethodDeclarationContext _localctx = new T_genericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_t_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			t_typeParameters();
			setState(675);
			t_methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_constructorDeclarationContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_formalParametersContext t_formalParameters() {
			return getRuleContext(T_formalParametersContext.class,0);
		}
		public T_constructorBodyContext t_constructorBody() {
			return getRuleContext(T_constructorBodyContext.class,0);
		}
		public T_qualifiedNameListContext t_qualifiedNameList() {
			return getRuleContext(T_qualifiedNameListContext.class,0);
		}
		public T_constructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_constructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_constructorDeclarationContext t_constructorDeclaration() throws RecognitionException {
		T_constructorDeclarationContext _localctx = new T_constructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_t_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(UndecoratedIdentifier);
			setState(678);
			t_formalParameters();
			setState(681);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(679);
				match(THROWS);
				setState(680);
				t_qualifiedNameList();
				}
			}

			setState(683);
			t_constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_genericConstructorDeclarationContext extends ParserRuleContext {
		public T_typeParametersContext t_typeParameters() {
			return getRuleContext(T_typeParametersContext.class,0);
		}
		public T_constructorDeclarationContext t_constructorDeclaration() {
			return getRuleContext(T_constructorDeclarationContext.class,0);
		}
		public T_genericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_genericConstructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_genericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_genericConstructorDeclarationContext t_genericConstructorDeclaration() throws RecognitionException {
		T_genericConstructorDeclarationContext _localctx = new T_genericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_t_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			t_typeParameters();
			setState(686);
			t_constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_fieldDeclarationContext extends ParserRuleContext {
		public T_typeContext ty;
		public List<T_fieldDeclaratorContext> t_fieldDeclarator() {
			return getRuleContexts(T_fieldDeclaratorContext.class);
		}
		public T_fieldDeclaratorContext t_fieldDeclarator(int i) {
			return getRuleContext(T_fieldDeclaratorContext.class,i);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_fieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_fieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_fieldDeclarationContext t_fieldDeclaration() throws RecognitionException {
		T_fieldDeclarationContext _localctx = new T_fieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_t_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			((T_fieldDeclarationContext)_localctx).ty = t_type();
			setState(689);
			t_fieldDeclarator((((T_fieldDeclarationContext)_localctx).ty!=null?_input.getText(((T_fieldDeclarationContext)_localctx).ty.start,((T_fieldDeclarationContext)_localctx).ty.stop):null));
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(690);
				match(COMMA);
				setState(691);
				t_fieldDeclarator((((T_fieldDeclarationContext)_localctx).ty!=null?_input.getText(((T_fieldDeclarationContext)_localctx).ty.start,((T_fieldDeclarationContext)_localctx).ty.stop):null));
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(697);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_fieldDeclaratorContext extends ParserRuleContext {
		public String idType;
		public T_fieldDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public T_fieldDeclaratorContext(ParserRuleContext parent, int invokingState, String idType) {
			super(parent, invokingState);
			this.idType = idType;
		}
		@Override public int getRuleIndex() { return RULE_t_fieldDeclarator; }
	 
		public T_fieldDeclaratorContext() { }
		public void copyFrom(T_fieldDeclaratorContext ctx) {
			super.copyFrom(ctx);
			this.idType = ctx.idType;
		}
	}
	public static class UninitializedFieldContext extends T_fieldDeclaratorContext {
		public T_idDeclarationContext t_idDeclaration() {
			return getRuleContext(T_idDeclarationContext.class,0);
		}
		public UninitializedFieldContext(T_fieldDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitUninitializedField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitializedFieldContext extends T_fieldDeclaratorContext {
		public Token op;
		public T_idDeclarationContext t_idDeclaration() {
			return getRuleContext(T_idDeclarationContext.class,0);
		}
		public T_variableInitializerContext t_variableInitializer() {
			return getRuleContext(T_variableInitializerContext.class,0);
		}
		public InitializedFieldContext(T_fieldDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInitializedField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_fieldDeclaratorContext t_fieldDeclarator(String idType) throws RecognitionException {
		T_fieldDeclaratorContext _localctx = new T_fieldDeclaratorContext(_ctx, getState(), idType);
		enterRule(_localctx, 54, RULE_t_fieldDeclarator);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new InitializedFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				t_idDeclaration(_localctx.idType);
				setState(700);
				((InitializedFieldContext)_localctx).op = match(ASSIGN);
				setState(701);
				t_variableInitializer();
				}
				break;
			case 2:
				_localctx = new UninitializedFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				t_idDeclaration(_localctx.idType);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_interfaceBodyDeclarationContext extends ParserRuleContext {
		public T_memberDeclarationContext t_memberDeclaration() {
			return getRuleContext(T_memberDeclarationContext.class,0);
		}
		public List<T_modifierContext> t_modifier() {
			return getRuleContexts(T_modifierContext.class);
		}
		public T_modifierContext t_modifier(int i) {
			return getRuleContext(T_modifierContext.class,i);
		}
		public T_interfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_interfaceBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_interfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_interfaceBodyDeclarationContext t_interfaceBodyDeclaration() throws RecognitionException {
		T_interfaceBodyDeclarationContext _localctx = new T_interfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_t_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(714);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				match(SEMI);
				}
				break;
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case UndecoratedIdentifier:
			case LT:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(707);
						t_modifier();
						}
						} 
					}
					setState(712);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(713);
				t_memberDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationVariableDeclaratorContext extends ParserRuleContext {
		public T_annotationVariableDeclaratorIdContext t_annotationVariableDeclaratorId() {
			return getRuleContext(T_annotationVariableDeclaratorIdContext.class,0);
		}
		public T_variableInitializerContext t_variableInitializer() {
			return getRuleContext(T_variableInitializerContext.class,0);
		}
		public T_annotationVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotationVariableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotationVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationVariableDeclaratorContext t_annotationVariableDeclarator() throws RecognitionException {
		T_annotationVariableDeclaratorContext _localctx = new T_annotationVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_t_annotationVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			t_annotationVariableDeclaratorId();
			setState(717);
			match(ASSIGN);
			setState(718);
			t_variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_variableDeclaratorContext extends ParserRuleContext {
		public String idType;
		public T_variableDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public T_variableDeclaratorContext(ParserRuleContext parent, int invokingState, String idType) {
			super(parent, invokingState);
			this.idType = idType;
		}
		@Override public int getRuleIndex() { return RULE_t_variableDeclarator; }
	 
		public T_variableDeclaratorContext() { }
		public void copyFrom(T_variableDeclaratorContext ctx) {
			super.copyFrom(ctx);
			this.idType = ctx.idType;
		}
	}
	public static class UninitializedVariableContext extends T_variableDeclaratorContext {
		public T_uninitializedVariableDeclaratorIdContext t_uninitializedVariableDeclaratorId() {
			return getRuleContext(T_uninitializedVariableDeclaratorIdContext.class,0);
		}
		public UninitializedVariableContext(T_variableDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitUninitializedVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitializedVariableContext extends T_variableDeclaratorContext {
		public Token op;
		public T_initializedVariableDeclaratorIdContext t_initializedVariableDeclaratorId() {
			return getRuleContext(T_initializedVariableDeclaratorIdContext.class,0);
		}
		public T_variableInitializerContext t_variableInitializer() {
			return getRuleContext(T_variableInitializerContext.class,0);
		}
		public InitializedVariableContext(T_variableDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInitializedVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_variableDeclaratorContext t_variableDeclarator(String idType) throws RecognitionException {
		T_variableDeclaratorContext _localctx = new T_variableDeclaratorContext(_ctx, getState(), idType);
		enterRule(_localctx, 60, RULE_t_variableDeclarator);
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new InitializedVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				t_initializedVariableDeclaratorId(_localctx.idType);
				setState(721);
				((InitializedVariableContext)_localctx).op = match(ASSIGN);
				setState(722);
				t_variableInitializer();
				}
				break;
			case 2:
				_localctx = new UninitializedVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				t_uninitializedVariableDeclaratorId(_localctx.idType);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_initializedVariableDeclaratorIdContext extends ParserRuleContext {
		public String idType;
		public T_idDeclarationContext t_idDeclaration() {
			return getRuleContext(T_idDeclarationContext.class,0);
		}
		public T_initializedVariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public T_initializedVariableDeclaratorIdContext(ParserRuleContext parent, int invokingState, String idType) {
			super(parent, invokingState);
			this.idType = idType;
		}
		@Override public int getRuleIndex() { return RULE_t_initializedVariableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_initializedVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_initializedVariableDeclaratorIdContext t_initializedVariableDeclaratorId(String idType) throws RecognitionException {
		T_initializedVariableDeclaratorIdContext _localctx = new T_initializedVariableDeclaratorIdContext(_ctx, getState(), idType);
		enterRule(_localctx, 62, RULE_t_initializedVariableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			t_idDeclaration(_localctx.idType);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_uninitializedVariableDeclaratorIdContext extends ParserRuleContext {
		public String idType;
		public T_idDeclarationContext t_idDeclaration() {
			return getRuleContext(T_idDeclarationContext.class,0);
		}
		public T_uninitializedVariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public T_uninitializedVariableDeclaratorIdContext(ParserRuleContext parent, int invokingState, String idType) {
			super(parent, invokingState);
			this.idType = idType;
		}
		@Override public int getRuleIndex() { return RULE_t_uninitializedVariableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_uninitializedVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_uninitializedVariableDeclaratorIdContext t_uninitializedVariableDeclaratorId(String idType) throws RecognitionException {
		T_uninitializedVariableDeclaratorIdContext _localctx = new T_uninitializedVariableDeclaratorIdContext(_ctx, getState(), idType);
		enterRule(_localctx, 64, RULE_t_uninitializedVariableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			t_idDeclaration(_localctx.idType);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationVariableDeclaratorIdContext extends ParserRuleContext {
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_annotationVariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotationVariableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotationVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationVariableDeclaratorIdContext t_annotationVariableDeclaratorId() throws RecognitionException {
		T_annotationVariableDeclaratorIdContext _localctx = new T_annotationVariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_t_annotationVariableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			t_identifier();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(732);
				match(LBRACK);
				setState(733);
				match(RBRACK);
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_variableInitializerContext extends ParserRuleContext {
		public T_arrayInitializerContext t_arrayInitializer() {
			return getRuleContext(T_arrayInitializerContext.class,0);
		}
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_variableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_variableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_variableInitializerContext t_variableInitializer() throws RecognitionException {
		T_variableInitializerContext _localctx = new T_variableInitializerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_t_variableInitializer);
		try {
			setState(741);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				t_arrayInitializer();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case BooleanLiteral:
			case NullLiteral:
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				t_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_arrayInitializerContext extends ParserRuleContext {
		public List<T_variableInitializerContext> t_variableInitializer() {
			return getRuleContexts(T_variableInitializerContext.class);
		}
		public T_variableInitializerContext t_variableInitializer(int i) {
			return getRuleContext(T_variableInitializerContext.class,i);
		}
		public T_arrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_arrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_arrayInitializerContext t_arrayInitializer() throws RecognitionException {
		T_arrayInitializerContext _localctx = new T_arrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_t_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(LBRACE);
			setState(755);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
				{
				setState(744);
				t_variableInitializer();
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(745);
						match(COMMA);
						setState(746);
						t_variableInitializer();
						}
						} 
					}
					setState(751);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(753);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(752);
					match(COMMA);
					}
				}

				}
			}

			setState(757);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_packageOrTypeNameContext extends ParserRuleContext {
		public T_qualifiedNameContext t_qualifiedName() {
			return getRuleContext(T_qualifiedNameContext.class,0);
		}
		public T_packageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_packageOrTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_packageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_packageOrTypeNameContext t_packageOrTypeName() throws RecognitionException {
		T_packageOrTypeNameContext _localctx = new T_packageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_t_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			t_qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_enumConstantNameContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_enumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_enumConstantName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_enumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_enumConstantNameContext t_enumConstantName() throws RecognitionException {
		T_enumConstantNameContext _localctx = new T_enumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_t_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(UndecoratedIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeNameContext extends ParserRuleContext {
		public T_qualifiedNameContext t_qualifiedName() {
			return getRuleContext(T_qualifiedNameContext.class,0);
		}
		public T_typeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeNameContext t_typeName() throws RecognitionException {
		T_typeNameContext _localctx = new T_typeNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_t_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			t_qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeContext extends ParserRuleContext {
		public T_classOrInterfaceTypeContext t_classOrInterfaceType() {
			return getRuleContext(T_classOrInterfaceTypeContext.class,0);
		}
		public T_primitiveTypeContext t_primitiveType() {
			return getRuleContext(T_primitiveTypeContext.class,0);
		}
		public T_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeContext t_type() throws RecognitionException {
		T_typeContext _localctx = new T_typeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_t_type);
		try {
			int _alt;
			setState(781);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				t_classOrInterfaceType();
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(766);
						match(LBRACK);
						setState(767);
						match(RBRACK);
						}
						} 
					}
					setState(772);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				t_primitiveType();
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(774);
						match(LBRACK);
						setState(775);
						match(RBRACK);
						}
						} 
					}
					setState(780);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_classOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> UndecoratedIdentifier() { return getTokens(TLantlrParser.UndecoratedIdentifier); }
		public TerminalNode UndecoratedIdentifier(int i) {
			return getToken(TLantlrParser.UndecoratedIdentifier, i);
		}
		public List<T_typeArgumentsContext> t_typeArguments() {
			return getRuleContexts(T_typeArgumentsContext.class);
		}
		public T_typeArgumentsContext t_typeArguments(int i) {
			return getRuleContext(T_typeArgumentsContext.class,i);
		}
		public T_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_classOrInterfaceTypeContext t_classOrInterfaceType() throws RecognitionException {
		T_classOrInterfaceTypeContext _localctx = new T_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_t_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(UndecoratedIdentifier);
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(784);
				t_typeArguments();
				}
				break;
			}
			setState(794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(787);
					match(DOT);
					setState(788);
					match(UndecoratedIdentifier);
					setState(790);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(789);
						t_typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_primitiveTypeContext extends ParserRuleContext {
		public T_primitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_primitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_primitiveTypeContext t_primitiveType() throws RecognitionException {
		T_primitiveTypeContext _localctx = new T_primitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_t_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeArgumentsContext extends ParserRuleContext {
		public List<T_typeArgumentContext> t_typeArgument() {
			return getRuleContexts(T_typeArgumentContext.class);
		}
		public T_typeArgumentContext t_typeArgument(int i) {
			return getRuleContext(T_typeArgumentContext.class,i);
		}
		public T_typeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeArgumentsContext t_typeArguments() throws RecognitionException {
		T_typeArgumentsContext _localctx = new T_typeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_t_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(LT);
			setState(800);
			t_typeArgument();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(801);
				match(COMMA);
				setState(802);
				t_typeArgument();
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(808);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeArgumentContext extends ParserRuleContext {
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_typeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeArgumentContext t_typeArgument() throws RecognitionException {
		T_typeArgumentContext _localctx = new T_typeArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_t_typeArgument);
		int _la;
		try {
			setState(816);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case UndecoratedIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				t_type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(QUESTION);
				setState(814);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(812);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(813);
					t_type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_qualifiedNameListContext extends ParserRuleContext {
		public List<T_qualifiedNameContext> t_qualifiedName() {
			return getRuleContexts(T_qualifiedNameContext.class);
		}
		public T_qualifiedNameContext t_qualifiedName(int i) {
			return getRuleContext(T_qualifiedNameContext.class,i);
		}
		public T_qualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_qualifiedNameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_qualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_qualifiedNameListContext t_qualifiedNameList() throws RecognitionException {
		T_qualifiedNameListContext _localctx = new T_qualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_t_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			t_qualifiedName();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(819);
				match(COMMA);
				setState(820);
				t_qualifiedName();
				}
				}
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_formalParametersContext extends ParserRuleContext {
		public T_formalParameterListContext t_formalParameterList() {
			return getRuleContext(T_formalParameterListContext.class,0);
		}
		public T_formalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_formalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_formalParametersContext t_formalParameters() throws RecognitionException {
		T_formalParametersContext _localctx = new T_formalParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_t_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(LPAREN);
			setState(828);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==UndecoratedIdentifier || _la==AT) {
				{
				setState(827);
				t_formalParameterList();
				}
			}

			setState(830);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_formalParameterListContext extends ParserRuleContext {
		public List<T_formalParameterContext> t_formalParameter() {
			return getRuleContexts(T_formalParameterContext.class);
		}
		public T_formalParameterContext t_formalParameter(int i) {
			return getRuleContext(T_formalParameterContext.class,i);
		}
		public T_lastFormalParameterContext t_lastFormalParameter() {
			return getRuleContext(T_lastFormalParameterContext.class,0);
		}
		public T_formalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_formalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_formalParameterListContext t_formalParameterList() throws RecognitionException {
		T_formalParameterListContext _localctx = new T_formalParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_t_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				t_formalParameter();
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(833);
						match(COMMA);
						setState(834);
						t_formalParameter();
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(842);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(840);
					match(COMMA);
					setState(841);
					t_lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				t_lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_formalParameterContext extends ParserRuleContext {
		public T_typeContext ty;
		public T_initializedVariableDeclaratorIdContext t_initializedVariableDeclaratorId() {
			return getRuleContext(T_initializedVariableDeclaratorIdContext.class,0);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public List<T_variableModifierContext> t_variableModifier() {
			return getRuleContexts(T_variableModifierContext.class);
		}
		public T_variableModifierContext t_variableModifier(int i) {
			return getRuleContext(T_variableModifierContext.class,i);
		}
		public T_formalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_formalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_formalParameterContext t_formalParameter() throws RecognitionException {
		T_formalParameterContext _localctx = new T_formalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_t_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(847);
				t_variableModifier();
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(853);
			((T_formalParameterContext)_localctx).ty = t_type();
			setState(854);
			t_initializedVariableDeclaratorId((((T_formalParameterContext)_localctx).ty!=null?_input.getText(((T_formalParameterContext)_localctx).ty.start,((T_formalParameterContext)_localctx).ty.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_lastFormalParameterContext extends ParserRuleContext {
		public T_typeContext ty;
		public T_initializedVariableDeclaratorIdContext t_initializedVariableDeclaratorId() {
			return getRuleContext(T_initializedVariableDeclaratorIdContext.class,0);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public List<T_variableModifierContext> t_variableModifier() {
			return getRuleContexts(T_variableModifierContext.class);
		}
		public T_variableModifierContext t_variableModifier(int i) {
			return getRuleContext(T_variableModifierContext.class,i);
		}
		public T_lastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_lastFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_lastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_lastFormalParameterContext t_lastFormalParameter() throws RecognitionException {
		T_lastFormalParameterContext _localctx = new T_lastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_t_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(856);
				t_variableModifier();
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
			((T_lastFormalParameterContext)_localctx).ty = t_type();
			setState(863);
			match(ELLIPSIS);
			setState(864);
			t_initializedVariableDeclaratorId((((T_lastFormalParameterContext)_localctx).ty!=null?_input.getText(((T_lastFormalParameterContext)_localctx).ty.start,((T_lastFormalParameterContext)_localctx).ty.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_methodBodyContext extends ParserRuleContext {
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public T_methodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_methodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_methodBodyContext t_methodBody() throws RecognitionException {
		T_methodBodyContext _localctx = new T_methodBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_t_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			t_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_constructorBodyContext extends ParserRuleContext {
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public T_constructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_constructorBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_constructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_constructorBodyContext t_constructorBody() throws RecognitionException {
		T_constructorBodyContext _localctx = new T_constructorBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_t_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			t_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_qualifiedNameContext extends ParserRuleContext {
		public List<T_identifierContext> t_identifier() {
			return getRuleContexts(T_identifierContext.class);
		}
		public T_identifierContext t_identifier(int i) {
			return getRuleContext(T_identifierContext.class,i);
		}
		public T_qualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_qualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_qualifiedNameContext t_qualifiedName() throws RecognitionException {
		T_qualifiedNameContext _localctx = new T_qualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_t_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			t_identifier();
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(871);
					match(DOT);
					setState(872);
					t_identifier();
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_literalContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(TLantlrParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(TLantlrParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(TLantlrParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(TLantlrParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TLantlrParser.BooleanLiteral, 0); }
		public T_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_literalContext t_literal() throws RecognitionException {
		T_literalContext _localctx = new T_literalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_t_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (BooleanLiteral - 59)) | (1L << (NullLiteral - 59)) | (1L << (IntegerLiteral - 59)) | (1L << (FloatingPointLiteral - 59)) | (1L << (CharacterLiteral - 59)) | (1L << (StringLiteral - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationContext extends ParserRuleContext {
		public T_annotationNameContext t_annotationName() {
			return getRuleContext(T_annotationNameContext.class,0);
		}
		public T_elementValuePairsContext t_elementValuePairs() {
			return getRuleContext(T_elementValuePairsContext.class,0);
		}
		public T_elementValueContext t_elementValue() {
			return getRuleContext(T_elementValueContext.class,0);
		}
		public T_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationContext t_annotation() throws RecognitionException {
		T_annotationContext _localctx = new T_annotationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_t_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(AT);
			setState(881);
			t_annotationName();
			setState(888);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(882);
				match(LPAREN);
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(883);
					t_elementValuePairs();
					}
					break;
				case 2:
					{
					setState(884);
					t_elementValue();
					}
					break;
				}
				setState(887);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationNameContext extends ParserRuleContext {
		public T_qualifiedNameContext t_qualifiedName() {
			return getRuleContext(T_qualifiedNameContext.class,0);
		}
		public T_annotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotationName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationNameContext t_annotationName() throws RecognitionException {
		T_annotationNameContext _localctx = new T_annotationNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_t_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			t_qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_elementValuePairsContext extends ParserRuleContext {
		public List<T_elementValuePairContext> t_elementValuePair() {
			return getRuleContexts(T_elementValuePairContext.class);
		}
		public T_elementValuePairContext t_elementValuePair(int i) {
			return getRuleContext(T_elementValuePairContext.class,i);
		}
		public T_elementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_elementValuePairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_elementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_elementValuePairsContext t_elementValuePairs() throws RecognitionException {
		T_elementValuePairsContext _localctx = new T_elementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_t_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			t_elementValuePair();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(893);
				match(COMMA);
				setState(894);
				t_elementValuePair();
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_elementValuePairContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_elementValueContext t_elementValue() {
			return getRuleContext(T_elementValueContext.class,0);
		}
		public T_elementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_elementValuePair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_elementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_elementValuePairContext t_elementValuePair() throws RecognitionException {
		T_elementValuePairContext _localctx = new T_elementValuePairContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_t_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(UndecoratedIdentifier);
			setState(901);
			match(ASSIGN);
			setState(902);
			t_elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_elementValueContext extends ParserRuleContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_annotationContext t_annotation() {
			return getRuleContext(T_annotationContext.class,0);
		}
		public T_elementValueArrayInitializerContext t_elementValueArrayInitializer() {
			return getRuleContext(T_elementValueArrayInitializerContext.class,0);
		}
		public T_elementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_elementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_elementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_elementValueContext t_elementValue() throws RecognitionException {
		T_elementValueContext _localctx = new T_elementValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_t_elementValue);
		try {
			setState(907);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case BooleanLiteral:
			case NullLiteral:
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				t_expression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				t_annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(906);
				t_elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_elementValueArrayInitializerContext extends ParserRuleContext {
		public List<T_elementValueContext> t_elementValue() {
			return getRuleContexts(T_elementValueContext.class);
		}
		public T_elementValueContext t_elementValue(int i) {
			return getRuleContext(T_elementValueContext.class,i);
		}
		public T_elementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_elementValueArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_elementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_elementValueArrayInitializerContext t_elementValueArrayInitializer() throws RecognitionException {
		T_elementValueArrayInitializerContext _localctx = new T_elementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_t_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(LBRACE);
			setState(918);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				setState(910);
				t_elementValue();
				setState(915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(911);
						match(COMMA);
						setState(912);
						t_elementValue();
						}
						} 
					}
					setState(917);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				}
			}

			setState(921);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(920);
				match(COMMA);
				}
			}

			setState(923);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_annotationTypeBodyContext t_annotationTypeBody() {
			return getRuleContext(T_annotationTypeBodyContext.class,0);
		}
		public T_annotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotationTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationTypeDeclarationContext t_annotationTypeDeclaration() throws RecognitionException {
		T_annotationTypeDeclarationContext _localctx = new T_annotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_t_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(AT);
			setState(926);
			match(INTERFACE);
			setState(927);
			match(UndecoratedIdentifier);
			setState(928);
			t_annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationTypeBodyContext extends ParserRuleContext {
		public List<T_annotationTypeElementDeclarationContext> t_annotationTypeElementDeclaration() {
			return getRuleContexts(T_annotationTypeElementDeclarationContext.class);
		}
		public T_annotationTypeElementDeclarationContext t_annotationTypeElementDeclaration(int i) {
			return getRuleContext(T_annotationTypeElementDeclarationContext.class,i);
		}
		public T_annotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotationTypeBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationTypeBodyContext t_annotationTypeBody() throws RecognitionException {
		T_annotationTypeBodyContext _localctx = new T_annotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_t_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(LBRACE);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(931);
				t_annotationTypeElementDeclaration();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(937);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationTypeElementDeclarationContext extends ParserRuleContext {
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_annotationMethodRestContext t_annotationMethodRest() {
			return getRuleContext(T_annotationMethodRestContext.class,0);
		}
		public T_annotationConstantRestContext t_annotationConstantRest() {
			return getRuleContext(T_annotationConstantRestContext.class,0);
		}
		public T_classDeclarationContext t_classDeclaration() {
			return getRuleContext(T_classDeclarationContext.class,0);
		}
		public T_interfaceDeclarationContext t_interfaceDeclaration() {
			return getRuleContext(T_interfaceDeclarationContext.class,0);
		}
		public T_enumDeclarationContext t_enumDeclaration() {
			return getRuleContext(T_enumDeclarationContext.class,0);
		}
		public T_annotationTypeDeclarationContext t_annotationTypeDeclaration() {
			return getRuleContext(T_annotationTypeDeclarationContext.class,0);
		}
		public List<T_modifierContext> t_modifier() {
			return getRuleContexts(T_modifierContext.class);
		}
		public T_modifierContext t_modifier(int i) {
			return getRuleContext(T_modifierContext.class,i);
		}
		public T_annotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotationTypeElementDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationTypeElementDeclarationContext t_annotationTypeElementDeclaration() throws RecognitionException {
		T_annotationTypeElementDeclarationContext _localctx = new T_annotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_t_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(972);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				match(SEMI);
				}
				break;
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case UndecoratedIdentifier:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						t_modifier();
						}
						} 
					}
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(946);
					t_type();
					setState(947);
					t_annotationMethodRest();
					setState(948);
					match(SEMI);
					}
					break;
				case 2:
					{
					setState(950);
					t_type();
					setState(951);
					t_annotationConstantRest();
					setState(952);
					match(SEMI);
					}
					break;
				case 3:
					{
					setState(954);
					t_classDeclaration();
					setState(956);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(955);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 4:
					{
					setState(958);
					t_interfaceDeclaration();
					setState(960);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(959);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 5:
					{
					setState(962);
					t_enumDeclaration();
					setState(964);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(963);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 6:
					{
					setState(966);
					t_annotationTypeDeclaration();
					setState(968);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(967);
						match(SEMI);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationMethodRestContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_defaultValueContext t_defaultValue() {
			return getRuleContext(T_defaultValueContext.class,0);
		}
		public T_annotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotationMethodRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationMethodRestContext t_annotationMethodRest() throws RecognitionException {
		T_annotationMethodRestContext _localctx = new T_annotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_t_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(UndecoratedIdentifier);
			setState(975);
			match(LPAREN);
			setState(976);
			match(RPAREN);
			setState(978);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(977);
				t_defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_annotationConstantRestContext extends ParserRuleContext {
		public List<T_annotationVariableDeclaratorContext> t_annotationVariableDeclarator() {
			return getRuleContexts(T_annotationVariableDeclaratorContext.class);
		}
		public T_annotationVariableDeclaratorContext t_annotationVariableDeclarator(int i) {
			return getRuleContext(T_annotationVariableDeclaratorContext.class,i);
		}
		public T_annotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_annotationConstantRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_annotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_annotationConstantRestContext t_annotationConstantRest() throws RecognitionException {
		T_annotationConstantRestContext _localctx = new T_annotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_t_annotationConstantRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			t_annotationVariableDeclarator();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(981);
				match(COMMA);
				setState(982);
				t_annotationVariableDeclarator();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_defaultValueContext extends ParserRuleContext {
		public T_elementValueContext t_elementValue() {
			return getRuleContext(T_elementValueContext.class,0);
		}
		public T_defaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_defaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_defaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_defaultValueContext t_defaultValue() throws RecognitionException {
		T_defaultValueContext _localctx = new T_defaultValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_t_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(DEFAULT);
			setState(989);
			t_elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_blockContext extends ParserRuleContext {
		public Token openBrace;
		public Token closeBrace;
		public List<T_blockStatementContext> t_blockStatement() {
			return getRuleContexts(T_blockStatementContext.class);
		}
		public T_blockStatementContext t_blockStatement(int i) {
			return getRuleContext(T_blockStatementContext.class,i);
		}
		public T_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_blockContext t_block() throws RecognitionException {
		T_blockContext _localctx = new T_blockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_t_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			((T_blockContext)_localctx).openBrace = match(LBRACE);
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << GIVEN) | (1L << INT) | (1L << INTERFACE) | (1L << INVARIANT) | (1L << LONG) | (1L << MEANS) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VARIANT) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(992);
				t_blockStatement();
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(998);
			((T_blockContext)_localctx).closeBrace = match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_blockStatementContext extends ParserRuleContext {
		public T_localVariableDeclarationContext t_localVariableDeclaration() {
			return getRuleContext(T_localVariableDeclarationContext.class,0);
		}
		public T_typeDeclarationContext t_typeDeclaration() {
			return getRuleContext(T_typeDeclarationContext.class,0);
		}
		public T_statementContext t_statement() {
			return getRuleContext(T_statementContext.class,0);
		}
		public T_blockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_blockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_blockStatementContext t_blockStatement() throws RecognitionException {
		T_blockStatementContext _localctx = new T_blockStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_t_blockStatement);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				t_localVariableDeclaration();
				setState(1001);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				t_typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				t_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_localVariableDeclarationContext extends ParserRuleContext {
		public T_typeContext ty;
		public List<T_variableDeclaratorContext> t_variableDeclarator() {
			return getRuleContexts(T_variableDeclaratorContext.class);
		}
		public T_variableDeclaratorContext t_variableDeclarator(int i) {
			return getRuleContext(T_variableDeclaratorContext.class,i);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public List<T_variableModifierContext> t_variableModifier() {
			return getRuleContexts(T_variableModifierContext.class);
		}
		public T_variableModifierContext t_variableModifier(int i) {
			return getRuleContext(T_variableModifierContext.class,i);
		}
		public T_localVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_localVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_localVariableDeclarationContext t_localVariableDeclaration() throws RecognitionException {
		T_localVariableDeclarationContext _localctx = new T_localVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_t_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1007);
				t_variableModifier();
				}
				}
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1013);
			((T_localVariableDeclarationContext)_localctx).ty = t_type();
			setState(1014);
			t_variableDeclarator((((T_localVariableDeclarationContext)_localctx).ty!=null?_input.getText(((T_localVariableDeclarationContext)_localctx).ty.start,((T_localVariableDeclarationContext)_localctx).ty.stop):null));
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1015);
				match(COMMA);
				setState(1016);
				t_variableDeclarator((((T_localVariableDeclarationContext)_localctx).ty!=null?_input.getText(((T_localVariableDeclarationContext)_localctx).ty.start,((T_localVariableDeclarationContext)_localctx).ty.stop):null));
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_statementContext extends ParserRuleContext {
		public T_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_statement; }
	 
		public T_statementContext() { }
		public void copyFrom(T_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SyncStmtContext extends T_statementContext {
		public T_parExpressionContext t_parExpression() {
			return getRuleContext(T_parExpressionContext.class,0);
		}
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public SyncStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitSyncStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GivenStmtContext extends T_statementContext {
		public T_givenContext t_given() {
			return getRuleContext(T_givenContext.class,0);
		}
		public GivenStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitGivenStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStmtContext extends T_statementContext {
		public T_parExpressionContext t_parExpression() {
			return getRuleContext(T_parExpressionContext.class,0);
		}
		public List<T_switchBlockStatementGroupContext> t_switchBlockStatementGroup() {
			return getRuleContexts(T_switchBlockStatementGroupContext.class);
		}
		public T_switchBlockStatementGroupContext t_switchBlockStatementGroup(int i) {
			return getRuleContext(T_switchBlockStatementGroupContext.class,i);
		}
		public List<T_switchLabelContext> t_switchLabel() {
			return getRuleContexts(T_switchLabelContext.class);
		}
		public T_switchLabelContext t_switchLabel(int i) {
			return getRuleContext(T_switchLabelContext.class,i);
		}
		public SwitchStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelStmtContext extends T_statementContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_statementContext t_statement() {
			return getRuleContext(T_statementContext.class,0);
		}
		public LabelStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitLabelStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStmtContext extends T_statementContext {
		public Token op;
		public T_assignableContext t_assignable() {
			return getRuleContext(T_assignableContext.class,0);
		}
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public AssignStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends T_statementContext {
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public BlockStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryStmtContext extends T_statementContext {
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public T_finallyBlockContext t_finallyBlock() {
			return getRuleContext(T_finallyBlockContext.class,0);
		}
		public List<T_catchClauseContext> t_catchClause() {
			return getRuleContexts(T_catchClauseContext.class);
		}
		public T_catchClauseContext t_catchClause(int i) {
			return getRuleContext(T_catchClauseContext.class,i);
		}
		public T_resourceSpecificationContext t_resourceSpecification() {
			return getRuleContext(T_resourceSpecificationContext.class,0);
		}
		public TryStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTryStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvariantStmtContext extends T_statementContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public InvariantStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInvariantStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallStmtContext extends T_statementContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_expressionListContext t_expressionList() {
			return getRuleContext(T_expressionListContext.class,0);
		}
		public CallStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ERROR_STMTContext extends T_statementContext {
		public T_ERRORContext t_ERROR() {
			return getRuleContext(T_ERRORContext.class,0);
		}
		public ERROR_STMTContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitERROR_STMT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MeansStmtContext extends T_statementContext {
		public T_meansContext t_means() {
			return getRuleContext(T_meansContext.class,0);
		}
		public MeansStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitMeansStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtContext extends T_statementContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public ContinueStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends T_statementContext {
		public T_parExpressionContext t_parExpression() {
			return getRuleContext(T_parExpressionContext.class,0);
		}
		public List<T_statementContext> t_statement() {
			return getRuleContexts(T_statementContext.class);
		}
		public T_statementContext t_statement(int i) {
			return getRuleContext(T_statementContext.class,i);
		}
		public IfStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreationStmtContext extends T_statementContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_innerCreatorContext t_innerCreator() {
			return getRuleContext(T_innerCreatorContext.class,0);
		}
		public T_nonWildcardTypeArgumentsContext t_nonWildcardTypeArguments() {
			return getRuleContext(T_nonWildcardTypeArgumentsContext.class,0);
		}
		public CreationStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitCreationStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends T_statementContext {
		public T_parExpressionContext t_parExpression() {
			return getRuleContext(T_parExpressionContext.class,0);
		}
		public T_statementContext t_statement() {
			return getRuleContext(T_statementContext.class,0);
		}
		public WhileStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariantStmtContext extends T_statementContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public VariantStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitVariantStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends T_statementContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public BreakStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtContext extends T_statementContext {
		public EmptyStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertStmtContext extends T_statementContext {
		public TerminalNode ASSERT() { return getToken(TLantlrParser.ASSERT, 0); }
		public List<T_expressionContext> t_expression() {
			return getRuleContexts(T_expressionContext.class);
		}
		public T_expressionContext t_expression(int i) {
			return getRuleContext(T_expressionContext.class,i);
		}
		public AssertStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAssertStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmtContext extends T_statementContext {
		public T_forControlContext t_forControl() {
			return getRuleContext(T_forControlContext.class,0);
		}
		public T_statementContext t_statement() {
			return getRuleContext(T_statementContext.class,0);
		}
		public ForStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends T_statementContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public ReturnStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowStmtContext extends T_statementContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public ThrowStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitThrowStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoStmtContext extends T_statementContext {
		public T_statementContext t_statement() {
			return getRuleContext(T_statementContext.class,0);
		}
		public T_parExpressionContext t_parExpression() {
			return getRuleContext(T_parExpressionContext.class,0);
		}
		public DoStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitDoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_statementContext t_statement() throws RecognitionException {
		T_statementContext _localctx = new T_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_t_statement);
		int _la;
		try {
			int _alt;
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				t_block();
				}
				break;
			case 2:
				_localctx = new AssertStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				match(ASSERT);
				setState(1024);
				t_expression();
				setState(1027);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1025);
					match(COLON);
					setState(1026);
					t_expression();
					}
				}

				setState(1029);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				match(IF);
				setState(1032);
				t_parExpression();
				setState(1033);
				t_statement();
				setState(1036);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(1034);
					match(ELSE);
					setState(1035);
					t_statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1038);
				match(FOR);
				setState(1039);
				match(LPAREN);
				setState(1040);
				t_forControl();
				setState(1041);
				match(RPAREN);
				setState(1042);
				t_statement();
				}
				break;
			case 5:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1044);
				match(WHILE);
				setState(1045);
				t_parExpression();
				setState(1046);
				t_statement();
				}
				break;
			case 6:
				_localctx = new VariantStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1048);
				match(VARIANT);
				setState(1049);
				t_expression();
				setState(1050);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new InvariantStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1052);
				match(INVARIANT);
				setState(1053);
				t_expression();
				setState(1054);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new DoStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1056);
				match(DO);
				setState(1057);
				t_statement();
				setState(1058);
				match(WHILE);
				setState(1059);
				t_parExpression();
				setState(1060);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new TryStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1062);
				match(TRY);
				setState(1063);
				t_block();
				setState(1073);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1065); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1064);
						t_catchClause();
						}
						}
						setState(1067); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1070);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1069);
						t_finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1072);
					t_finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				_localctx = new TryStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1075);
				match(TRY);
				setState(1076);
				t_resourceSpecification();
				setState(1077);
				t_block();
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1078);
					t_catchClause();
					}
					}
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1085);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1084);
					t_finallyBlock();
					}
				}

				}
				break;
			case 11:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1087);
				match(SWITCH);
				setState(1088);
				t_parExpression();
				setState(1089);
				match(LBRACE);
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1090);
						t_switchBlockStatementGroup();
						}
						} 
					}
					setState(1095);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1096);
					t_switchLabel();
					}
					}
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1102);
				match(RBRACE);
				}
				break;
			case 12:
				_localctx = new SyncStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1104);
				match(SYNCHRONIZED);
				setState(1105);
				t_parExpression();
				setState(1106);
				t_block();
				}
				break;
			case 13:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1108);
				match(RETURN);
				setState(1110);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(1109);
					t_expression();
					}
				}

				setState(1112);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new ThrowStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1113);
				match(THROW);
				setState(1114);
				t_expression();
				setState(1115);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1117);
				match(BREAK);
				setState(1119);
				_la = _input.LA(1);
				if (_la==UndecoratedIdentifier) {
					{
					setState(1118);
					match(UndecoratedIdentifier);
					}
				}

				setState(1121);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1122);
				match(CONTINUE);
				setState(1124);
				_la = _input.LA(1);
				if (_la==UndecoratedIdentifier) {
					{
					setState(1123);
					match(UndecoratedIdentifier);
					}
				}

				setState(1126);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1127);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1128);
				t_assignable();
				setState(1129);
				((AssignStmtContext)_localctx).op = match(ASSIGN);
				setState(1130);
				t_expression();
				setState(1131);
				match(SEMI);
				}
				break;
			case 19:
				_localctx = new CallStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1133);
				t_expression();
				setState(1134);
				match(LPAREN);
				setState(1136);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(1135);
					t_expressionList();
					}
				}

				setState(1138);
				match(RPAREN);
				setState(1139);
				match(SEMI);
				}
				break;
			case 20:
				_localctx = new CreationStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1141);
				t_expression();
				setState(1142);
				match(DOT);
				setState(1143);
				match(NEW);
				setState(1145);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1144);
					t_nonWildcardTypeArguments();
					}
				}

				setState(1147);
				t_innerCreator();
				}
				break;
			case 21:
				_localctx = new LabelStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1149);
				match(UndecoratedIdentifier);
				setState(1150);
				match(COLON);
				setState(1151);
				t_statement();
				}
				break;
			case 22:
				_localctx = new MeansStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(1152);
				t_means();
				}
				break;
			case 23:
				_localctx = new GivenStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(1153);
				t_given();
				}
				break;
			case 24:
				_localctx = new ERROR_STMTContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(1154);
				t_ERROR();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_ERRORContext extends ParserRuleContext {
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_ERRORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_ERROR; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_ERROR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_ERRORContext t_ERROR() throws RecognitionException {
		T_ERRORContext _localctx = new T_ERRORContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_t_ERROR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			t_identifier();
			setState(1158);
			t_expression();
			setState(1159);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_assignableContext extends ParserRuleContext {
		public List<T_expressionContext> t_expression() {
			return getRuleContexts(T_expressionContext.class);
		}
		public T_expressionContext t_expression(int i) {
			return getRuleContext(T_expressionContext.class,i);
		}
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_assignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_assignable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_assignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_assignableContext t_assignable() throws RecognitionException {
		T_assignableContext _localctx = new T_assignableContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_t_assignable);
		try {
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				t_expression();
				setState(1162);
				match(LBRACK);
				setState(1163);
				t_expression();
				setState(1164);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				t_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_catchClauseContext extends ParserRuleContext {
		public T_catchTypeContext t_catchType() {
			return getRuleContext(T_catchTypeContext.class,0);
		}
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public List<T_variableModifierContext> t_variableModifier() {
			return getRuleContexts(T_variableModifierContext.class);
		}
		public T_variableModifierContext t_variableModifier(int i) {
			return getRuleContext(T_variableModifierContext.class,i);
		}
		public T_catchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_catchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_catchClauseContext t_catchClause() throws RecognitionException {
		T_catchClauseContext _localctx = new T_catchClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_t_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(CATCH);
			setState(1170);
			match(LPAREN);
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1171);
				t_variableModifier();
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1177);
			t_catchType();
			setState(1178);
			t_identifier();
			setState(1179);
			match(RPAREN);
			setState(1180);
			t_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_catchTypeContext extends ParserRuleContext {
		public List<T_qualifiedNameContext> t_qualifiedName() {
			return getRuleContexts(T_qualifiedNameContext.class);
		}
		public T_qualifiedNameContext t_qualifiedName(int i) {
			return getRuleContext(T_qualifiedNameContext.class,i);
		}
		public T_catchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_catchType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_catchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_catchTypeContext t_catchType() throws RecognitionException {
		T_catchTypeContext _localctx = new T_catchTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_t_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			t_qualifiedName();
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1183);
				match(BITOR);
				setState(1184);
				t_qualifiedName();
				}
				}
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_finallyBlockContext extends ParserRuleContext {
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public T_finallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_finallyBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_finallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_finallyBlockContext t_finallyBlock() throws RecognitionException {
		T_finallyBlockContext _localctx = new T_finallyBlockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_t_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(FINALLY);
			setState(1191);
			t_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_resourceSpecificationContext extends ParserRuleContext {
		public T_resourcesContext t_resources() {
			return getRuleContext(T_resourcesContext.class,0);
		}
		public T_resourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_resourceSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_resourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_resourceSpecificationContext t_resourceSpecification() throws RecognitionException {
		T_resourceSpecificationContext _localctx = new T_resourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_t_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(LPAREN);
			setState(1194);
			t_resources();
			setState(1196);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1195);
				match(SEMI);
				}
			}

			setState(1198);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_resourcesContext extends ParserRuleContext {
		public List<T_resourceContext> t_resource() {
			return getRuleContexts(T_resourceContext.class);
		}
		public T_resourceContext t_resource(int i) {
			return getRuleContext(T_resourceContext.class,i);
		}
		public T_resourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_resources; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_resources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_resourcesContext t_resources() throws RecognitionException {
		T_resourcesContext _localctx = new T_resourcesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_t_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			t_resource();
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1201);
					match(SEMI);
					setState(1202);
					t_resource();
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_resourceContext extends ParserRuleContext {
		public T_classOrInterfaceTypeContext ty;
		public T_initializedVariableDeclaratorIdContext t_initializedVariableDeclaratorId() {
			return getRuleContext(T_initializedVariableDeclaratorIdContext.class,0);
		}
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_classOrInterfaceTypeContext t_classOrInterfaceType() {
			return getRuleContext(T_classOrInterfaceTypeContext.class,0);
		}
		public List<T_variableModifierContext> t_variableModifier() {
			return getRuleContexts(T_variableModifierContext.class);
		}
		public T_variableModifierContext t_variableModifier(int i) {
			return getRuleContext(T_variableModifierContext.class,i);
		}
		public T_resourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_resource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_resourceContext t_resource() throws RecognitionException {
		T_resourceContext _localctx = new T_resourceContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_t_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1208);
				t_variableModifier();
				}
				}
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1214);
			((T_resourceContext)_localctx).ty = t_classOrInterfaceType();
			setState(1215);
			t_initializedVariableDeclaratorId((((T_resourceContext)_localctx).ty!=null?_input.getText(((T_resourceContext)_localctx).ty.start,((T_resourceContext)_localctx).ty.stop):null));
			setState(1216);
			match(ASSIGN);
			setState(1217);
			t_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_switchBlockStatementGroupContext extends ParserRuleContext {
		public List<T_switchLabelContext> t_switchLabel() {
			return getRuleContexts(T_switchLabelContext.class);
		}
		public T_switchLabelContext t_switchLabel(int i) {
			return getRuleContext(T_switchLabelContext.class,i);
		}
		public List<T_blockStatementContext> t_blockStatement() {
			return getRuleContexts(T_blockStatementContext.class);
		}
		public T_blockStatementContext t_blockStatement(int i) {
			return getRuleContext(T_blockStatementContext.class,i);
		}
		public T_switchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_switchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_switchBlockStatementGroupContext t_switchBlockStatementGroup() throws RecognitionException {
		T_switchBlockStatementGroupContext _localctx = new T_switchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_t_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1220); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1219);
					t_switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1222); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1225); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1224);
					t_blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_switchLabelContext extends ParserRuleContext {
		public T_constantExpressionContext t_constantExpression() {
			return getRuleContext(T_constantExpressionContext.class,0);
		}
		public T_enumConstantNameContext t_enumConstantName() {
			return getRuleContext(T_enumConstantNameContext.class,0);
		}
		public T_switchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_switchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_switchLabelContext t_switchLabel() throws RecognitionException {
		T_switchLabelContext _localctx = new T_switchLabelContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_t_switchLabel);
		try {
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				match(CASE);
				setState(1230);
				t_constantExpression();
				setState(1231);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				match(CASE);
				setState(1234);
				t_enumConstantName();
				setState(1235);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1237);
				match(DEFAULT);
				setState(1238);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_forControlContext extends ParserRuleContext {
		public T_enhancedForControlContext t_enhancedForControl() {
			return getRuleContext(T_enhancedForControlContext.class,0);
		}
		public T_forInitContext t_forInit() {
			return getRuleContext(T_forInitContext.class,0);
		}
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_forUpdateContext t_forUpdate() {
			return getRuleContext(T_forUpdateContext.class,0);
		}
		public T_forControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_forControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_forControlContext t_forControl() throws RecognitionException {
		T_forControlContext _localctx = new T_forControlContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_t_forControl);
		int _la;
		try {
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241);
				t_enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
					{
					setState(1242);
					t_forInit();
					}
				}

				setState(1245);
				match(SEMI);
				setState(1247);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(1246);
					t_expression();
					}
				}

				setState(1249);
				match(SEMI);
				setState(1251);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(1250);
					t_forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_forInitContext extends ParserRuleContext {
		public T_localVariableDeclarationContext t_localVariableDeclaration() {
			return getRuleContext(T_localVariableDeclarationContext.class,0);
		}
		public T_expressionListContext t_expressionList() {
			return getRuleContext(T_expressionListContext.class,0);
		}
		public T_forInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_forInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_forInitContext t_forInit() throws RecognitionException {
		T_forInitContext _localctx = new T_forInitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_t_forInit);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				t_localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				t_expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_enhancedForControlContext extends ParserRuleContext {
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public List<T_variableModifierContext> t_variableModifier() {
			return getRuleContexts(T_variableModifierContext.class);
		}
		public T_variableModifierContext t_variableModifier(int i) {
			return getRuleContext(T_variableModifierContext.class,i);
		}
		public T_enhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_enhancedForControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_enhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_enhancedForControlContext t_enhancedForControl() throws RecognitionException {
		T_enhancedForControlContext _localctx = new T_enhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_t_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1259);
				t_variableModifier();
				}
				}
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1265);
			t_type();
			setState(1266);
			t_identifier();
			setState(1267);
			match(COLON);
			setState(1268);
			t_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_forUpdateContext extends ParserRuleContext {
		public T_expressionListContext t_expressionList() {
			return getRuleContext(T_expressionListContext.class,0);
		}
		public T_forUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_forUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_forUpdateContext t_forUpdate() throws RecognitionException {
		T_forUpdateContext _localctx = new T_forUpdateContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_t_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			t_expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_parExpressionContext extends ParserRuleContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_parExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_parExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_parExpressionContext t_parExpression() throws RecognitionException {
		T_parExpressionContext _localctx = new T_parExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_t_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(LPAREN);
			setState(1273);
			t_expression();
			setState(1274);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_expressionListContext extends ParserRuleContext {
		public List<T_expressionContext> t_expression() {
			return getRuleContexts(T_expressionContext.class);
		}
		public T_expressionContext t_expression(int i) {
			return getRuleContext(T_expressionContext.class,i);
		}
		public T_expressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_expressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_expressionListContext t_expressionList() throws RecognitionException {
		T_expressionListContext _localctx = new T_expressionListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_t_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			t_expression();
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1277);
				match(COMMA);
				setState(1278);
				t_expression();
				}
				}
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_constantExpressionContext extends ParserRuleContext {
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_constantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_constantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_constantExpressionContext t_constantExpression() throws RecognitionException {
		T_constantExpressionContext _localctx = new T_constantExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_t_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			t_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_expressionContext extends ParserRuleContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public T_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_expressionContext t_expression() throws RecognitionException {
		T_expressionContext _localctx = new T_expressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_t_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			t_expressionDetail(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_expressionDetailContext extends ParserRuleContext {
		public T_expressionDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_expressionDetail; }
	 
		public T_expressionDetailContext() { }
		public void copyFrom(T_expressionDetailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public AndExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConjRelationExprContext extends T_expressionDetailContext {
		public Token op;
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public ConjRelationExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConjRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifierExprContext extends T_expressionDetailContext {
		public List<T_localVariableDeclarationContext> t_localVariableDeclaration() {
			return getRuleContexts(T_localVariableDeclarationContext.class);
		}
		public T_localVariableDeclarationContext t_localVariableDeclaration(int i) {
			return getRuleContext(T_localVariableDeclarationContext.class,i);
		}
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public QuantifierExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitQuantifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitComplementExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public BitComplementExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitBitComplementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public SignExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitSignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public MultiplicativeExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotSuperExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public T_superSuffixContext t_superSuffix() {
			return getRuleContext(T_superSuffixContext.class,0);
		}
		public DotSuperExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitDotSuperExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExprContext extends T_expressionDetailContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public PrimaryExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public NotExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotThisExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public DotThisExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitDotThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public ShiftExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public FuncCallExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConjunctiveBoolExprContext extends T_expressionDetailContext {
		public Token op;
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public ConjunctiveBoolExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConjunctiveBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotNewExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public T_innerCreatorContext t_innerCreator() {
			return getRuleContext(T_innerCreatorContext.class,0);
		}
		public T_nonWildcardTypeArgumentsContext t_nonWildcardTypeArguments() {
			return getRuleContext(T_nonWildcardTypeArgumentsContext.class,0);
		}
		public DotNewExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitDotNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public DotExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public ConditionalExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotExplicitGenericExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public T_explicitGenericInvocationContext t_explicitGenericInvocation() {
			return getRuleContext(T_explicitGenericInvocationContext.class,0);
		}
		public DotExplicitGenericExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitDotExplicitGenericExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstanceOfExprContext extends T_expressionDetailContext {
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public InstanceOfExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInstanceOfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public OrExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalOrExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public ConditionalOrExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConditionalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public ArrayExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public AdditiveExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExclusiveOrExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public ExclusiveOrExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitExclusiveOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExprContext extends T_expressionDetailContext {
		public T_creatorContext t_creator() {
			return getRuleContext(T_creatorContext.class,0);
		}
		public NewExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalAndExprContext extends T_expressionDetailContext {
		public List<T_expressionDetailContext> t_expressionDetail() {
			return getRuleContexts(T_expressionDetailContext.class);
		}
		public T_expressionDetailContext t_expressionDetail(int i) {
			return getRuleContext(T_expressionDetailContext.class,i);
		}
		public ConditionalAndExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConditionalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeCastExprContext extends T_expressionDetailContext {
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_expressionDetailContext t_expressionDetail() {
			return getRuleContext(T_expressionDetailContext.class,0);
		}
		public TypeCastExprContext(T_expressionDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_expressionDetailContext t_expressionDetail() throws RecognitionException {
		return t_expressionDetail(0);
	}

	private T_expressionDetailContext t_expressionDetail(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		T_expressionDetailContext _localctx = new T_expressionDetailContext(_ctx, _parentState);
		T_expressionDetailContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_t_expressionDetail, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1289);
				t_primary();
				}
				break;
			case 2:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1290);
				match(NEW);
				setState(1291);
				t_creator();
				}
				break;
			case 3:
				{
				_localctx = new TypeCastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1292);
				match(LPAREN);
				setState(1293);
				t_type();
				setState(1294);
				match(RPAREN);
				setState(1295);
				t_expressionDetail(17);
				}
				break;
			case 4:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1297);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1298);
				t_expressionDetail(16);
				}
				break;
			case 5:
				{
				_localctx = new BitComplementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1299);
				match(TILDE);
				setState(1300);
				t_expressionDetail(15);
				}
				break;
			case 6:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1301);
				match(BANG);
				setState(1302);
				t_expressionDetail(14);
				}
				break;
			case 7:
				{
				_localctx = new QuantifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1303);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1304);
				match(LPAREN);
				setState(1305);
				t_localVariableDeclaration();
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1306);
					match(SEMI);
					setState(1307);
					t_localVariableDeclaration();
					}
					}
					setState(1312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1313);
				match(COLON);
				setState(1314);
				t_expressionDetail(0);
				setState(1315);
				match(COLON);
				setState(1316);
				t_expressionDetail(0);
				setState(1317);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1406);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1321);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1322);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (MUL - 103)) | (1L << (DIV - 103)) | (1L << (MOD - 103)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1323);
						t_expressionDetail(14);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1324);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1325);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1326);
						t_expressionDetail(13);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1327);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1335);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(1328);
							match(LT);
							setState(1329);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1330);
							match(GT);
							setState(1331);
							match(GT);
							setState(1332);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1333);
							match(GT);
							setState(1334);
							match(GT);
							}
							break;
						}
						setState(1337);
						t_expressionDetail(12);
						}
						break;
					case 4:
						{
						_localctx = new ConjRelationExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1338);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1339);
						((ConjRelationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ASSIGN - 86)) | (1L << (GT - 86)) | (1L << (LT - 86)) | (1L << (LE - 86)) | (1L << (GE - 86)) | (1L << (NOTEQUAL - 86)))) != 0)) ) {
							((ConjRelationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1340);
						t_expressionDetail(11);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1341);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1342);
						match(BITAND);
						setState(1343);
						t_expressionDetail(9);
						}
						break;
					case 6:
						{
						_localctx = new ExclusiveOrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1344);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1345);
						match(CARET);
						setState(1346);
						t_expressionDetail(8);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1347);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1348);
						match(BITOR);
						setState(1349);
						t_expressionDetail(7);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalAndExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1350);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1351);
						match(AND);
						setState(1352);
						t_expressionDetail(6);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalOrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1353);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1354);
						match(OR);
						setState(1355);
						t_expressionDetail(5);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1356);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1357);
						match(QUESTION);
						setState(1358);
						t_expressionDetail(0);
						setState(1359);
						match(COLON);
						setState(1360);
						t_expressionDetail(4);
						}
						break;
					case 11:
						{
						_localctx = new ConjunctiveBoolExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1362);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1363);
						((ConjunctiveBoolExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONJUNCTIVE_BOOLEAN_EQUAL - 61)) | (1L << (CONJUNCTIVE_IMPLIES - 61)) | (1L << (CONJUNCTIVE_CONSEQUENCE - 61)) | (1L << (CONJUNCTIVE_NOT_EQUAL - 61)))) != 0)) ) {
							((ConjunctiveBoolExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1364);
						t_expressionDetail(3);
						}
						break;
					case 12:
						{
						_localctx = new DotExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1365);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1366);
						match(DOT);
						setState(1367);
						t_identifier();
						}
						break;
					case 13:
						{
						_localctx = new DotThisExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1368);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1369);
						match(DOT);
						setState(1370);
						match(THIS);
						}
						break;
					case 14:
						{
						_localctx = new DotNewExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1371);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1372);
						match(DOT);
						setState(1373);
						match(NEW);
						setState(1375);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1374);
							t_nonWildcardTypeArguments();
							}
						}

						setState(1377);
						t_innerCreator();
						}
						break;
					case 15:
						{
						_localctx = new DotSuperExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1378);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1379);
						match(DOT);
						setState(1380);
						match(SUPER);
						setState(1381);
						t_superSuffix();
						}
						break;
					case 16:
						{
						_localctx = new DotExplicitGenericExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1382);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1383);
						match(DOT);
						setState(1384);
						t_explicitGenericInvocation();
						}
						break;
					case 17:
						{
						_localctx = new ArrayExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1385);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1386);
						match(LBRACK);
						setState(1387);
						t_expressionDetail(0);
						setState(1388);
						match(RBRACK);
						}
						break;
					case 18:
						{
						_localctx = new FuncCallExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1390);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1391);
						match(LPAREN);
						setState(1400);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
							{
							setState(1392);
							t_expressionDetail(0);
							setState(1397);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(1393);
								match(COMMA);
								setState(1394);
								t_expressionDetail(0);
								}
								}
								setState(1399);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(1402);
						match(RPAREN);
						}
						break;
					case 19:
						{
						_localctx = new InstanceOfExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1403);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1404);
						match(INSTANCEOF);
						setState(1405);
						t_type();
						}
						break;
					}
					} 
				}
				setState(1410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class T_primaryContext extends ParserRuleContext {
		public T_parExpressionContext t_parExpression() {
			return getRuleContext(T_parExpressionContext.class,0);
		}
		public T_literalContext t_literal() {
			return getRuleContext(T_literalContext.class,0);
		}
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_nonWildcardTypeArgumentsContext t_nonWildcardTypeArguments() {
			return getRuleContext(T_nonWildcardTypeArgumentsContext.class,0);
		}
		public T_explicitGenericInvocationSuffixContext t_explicitGenericInvocationSuffix() {
			return getRuleContext(T_explicitGenericInvocationSuffixContext.class,0);
		}
		public T_argumentsContext t_arguments() {
			return getRuleContext(T_argumentsContext.class,0);
		}
		public T_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_primaryContext t_primary() throws RecognitionException {
		T_primaryContext _localctx = new T_primaryContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_t_primary);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				t_parExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1414);
				t_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1415);
				t_identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1416);
				t_type();
				setState(1417);
				match(DOT);
				setState(1418);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1420);
				match(VOID);
				setState(1421);
				match(DOT);
				setState(1422);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1423);
				t_nonWildcardTypeArguments();
				setState(1427);
				switch (_input.LA(1)) {
				case SUPER:
				case UndecoratedIdentifier:
				case PreValueName:
				case MidValueName:
				case PostValueName:
					{
					setState(1424);
					t_explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1425);
					match(THIS);
					setState(1426);
					t_arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_creatorContext extends ParserRuleContext {
		public T_nonWildcardTypeArgumentsContext t_nonWildcardTypeArguments() {
			return getRuleContext(T_nonWildcardTypeArgumentsContext.class,0);
		}
		public T_createdNameContext t_createdName() {
			return getRuleContext(T_createdNameContext.class,0);
		}
		public T_classCreatorRestContext t_classCreatorRest() {
			return getRuleContext(T_classCreatorRestContext.class,0);
		}
		public T_arrayCreatorRestContext t_arrayCreatorRest() {
			return getRuleContext(T_arrayCreatorRestContext.class,0);
		}
		public T_creatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_creator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_creator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_creatorContext t_creator() throws RecognitionException {
		T_creatorContext _localctx = new T_creatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_t_creator);
		try {
			setState(1440);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				t_nonWildcardTypeArguments();
				setState(1432);
				t_createdName();
				setState(1433);
				t_classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				t_createdName();
				setState(1438);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1436);
					t_arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1437);
					t_classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_createdNameContext extends ParserRuleContext {
		public List<T_identifierContext> t_identifier() {
			return getRuleContexts(T_identifierContext.class);
		}
		public T_identifierContext t_identifier(int i) {
			return getRuleContext(T_identifierContext.class,i);
		}
		public List<T_typeArgumentsOrDiamondContext> t_typeArgumentsOrDiamond() {
			return getRuleContexts(T_typeArgumentsOrDiamondContext.class);
		}
		public T_typeArgumentsOrDiamondContext t_typeArgumentsOrDiamond(int i) {
			return getRuleContext(T_typeArgumentsOrDiamondContext.class,i);
		}
		public T_primitiveTypeContext t_primitiveType() {
			return getRuleContext(T_primitiveTypeContext.class,0);
		}
		public T_createdNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_createdName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_createdName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_createdNameContext t_createdName() throws RecognitionException {
		T_createdNameContext _localctx = new T_createdNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_t_createdName);
		int _la;
		try {
			setState(1457);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				t_identifier();
				setState(1444);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1443);
					t_typeArgumentsOrDiamond();
					}
				}

				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1446);
					match(DOT);
					setState(1447);
					t_identifier();
					setState(1449);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1448);
						t_typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				t_primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_innerCreatorContext extends ParserRuleContext {
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_classCreatorRestContext t_classCreatorRest() {
			return getRuleContext(T_classCreatorRestContext.class,0);
		}
		public T_nonWildcardTypeArgumentsOrDiamondContext t_nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(T_nonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public T_innerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_innerCreator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_innerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_innerCreatorContext t_innerCreator() throws RecognitionException {
		T_innerCreatorContext _localctx = new T_innerCreatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_t_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			t_identifier();
			setState(1461);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1460);
				t_nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1463);
			t_classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_arrayCreatorRestContext extends ParserRuleContext {
		public T_arrayInitializerContext t_arrayInitializer() {
			return getRuleContext(T_arrayInitializerContext.class,0);
		}
		public List<T_expressionContext> t_expression() {
			return getRuleContexts(T_expressionContext.class);
		}
		public T_expressionContext t_expression(int i) {
			return getRuleContext(T_expressionContext.class,i);
		}
		public T_arrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_arrayCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_arrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_arrayCreatorRestContext t_arrayCreatorRest() throws RecognitionException {
		T_arrayCreatorRestContext _localctx = new T_arrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_t_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			match(LBRACK);
			setState(1493);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1466);
				match(RBRACK);
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1467);
					match(LBRACK);
					setState(1468);
					match(RBRACK);
					}
					}
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1474);
				t_arrayInitializer();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case BooleanLiteral:
			case NullLiteral:
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case ADD:
			case SUB:
				{
				setState(1475);
				t_expression();
				setState(1476);
				match(RBRACK);
				setState(1483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1477);
						match(LBRACK);
						setState(1478);
						t_expression();
						setState(1479);
						match(RBRACK);
						}
						} 
					}
					setState(1485);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				setState(1490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1486);
						match(LBRACK);
						setState(1487);
						match(RBRACK);
						}
						} 
					}
					setState(1492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_classCreatorRestContext extends ParserRuleContext {
		public T_argumentsContext t_arguments() {
			return getRuleContext(T_argumentsContext.class,0);
		}
		public T_classBodyContext t_classBody() {
			return getRuleContext(T_classBodyContext.class,0);
		}
		public T_classCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_classCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_classCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_classCreatorRestContext t_classCreatorRest() throws RecognitionException {
		T_classCreatorRestContext _localctx = new T_classCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_t_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			t_arguments();
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1496);
				t_classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_explicitGenericInvocationContext extends ParserRuleContext {
		public T_nonWildcardTypeArgumentsContext t_nonWildcardTypeArguments() {
			return getRuleContext(T_nonWildcardTypeArgumentsContext.class,0);
		}
		public T_explicitGenericInvocationSuffixContext t_explicitGenericInvocationSuffix() {
			return getRuleContext(T_explicitGenericInvocationSuffixContext.class,0);
		}
		public T_explicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_explicitGenericInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_explicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_explicitGenericInvocationContext t_explicitGenericInvocation() throws RecognitionException {
		T_explicitGenericInvocationContext _localctx = new T_explicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_t_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			t_nonWildcardTypeArguments();
			setState(1500);
			t_explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_nonWildcardTypeArgumentsContext extends ParserRuleContext {
		public T_typeListContext t_typeList() {
			return getRuleContext(T_typeListContext.class,0);
		}
		public T_nonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_nonWildcardTypeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_nonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_nonWildcardTypeArgumentsContext t_nonWildcardTypeArguments() throws RecognitionException {
		T_nonWildcardTypeArgumentsContext _localctx = new T_nonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_t_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			match(LT);
			setState(1503);
			t_typeList();
			setState(1504);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_typeArgumentsOrDiamondContext extends ParserRuleContext {
		public T_typeArgumentsContext t_typeArguments() {
			return getRuleContext(T_typeArgumentsContext.class,0);
		}
		public T_typeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_typeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_typeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_typeArgumentsOrDiamondContext t_typeArgumentsOrDiamond() throws RecognitionException {
		T_typeArgumentsOrDiamondContext _localctx = new T_typeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_t_typeArgumentsOrDiamond);
		try {
			setState(1509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				match(LT);
				setState(1507);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				t_typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_nonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public T_nonWildcardTypeArgumentsContext t_nonWildcardTypeArguments() {
			return getRuleContext(T_nonWildcardTypeArgumentsContext.class,0);
		}
		public T_nonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_nonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_nonWildcardTypeArgumentsOrDiamondContext t_nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		T_nonWildcardTypeArgumentsOrDiamondContext _localctx = new T_nonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_t_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1511);
				match(LT);
				setState(1512);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				t_nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_superSuffixContext extends ParserRuleContext {
		public T_argumentsContext t_arguments() {
			return getRuleContext(T_argumentsContext.class,0);
		}
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_superSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_superSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_superSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_superSuffixContext t_superSuffix() throws RecognitionException {
		T_superSuffixContext _localctx = new T_superSuffixContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_t_superSuffix);
		try {
			setState(1522);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1516);
				t_arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				match(DOT);
				setState(1518);
				t_identifier();
				setState(1520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1519);
					t_arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_explicitGenericInvocationSuffixContext extends ParserRuleContext {
		public T_superSuffixContext t_superSuffix() {
			return getRuleContext(T_superSuffixContext.class,0);
		}
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_argumentsContext t_arguments() {
			return getRuleContext(T_argumentsContext.class,0);
		}
		public T_explicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_explicitGenericInvocationSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_explicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_explicitGenericInvocationSuffixContext t_explicitGenericInvocationSuffix() throws RecognitionException {
		T_explicitGenericInvocationSuffixContext _localctx = new T_explicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_t_explicitGenericInvocationSuffix);
		try {
			setState(1529);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1524);
				match(SUPER);
				setState(1525);
				t_superSuffix();
				}
				break;
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				t_identifier();
				setState(1527);
				t_arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_argumentsContext extends ParserRuleContext {
		public T_expressionListContext t_expressionList() {
			return getRuleContext(T_expressionListContext.class,0);
		}
		public T_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_argumentsContext t_arguments() throws RecognitionException {
		T_argumentsContext _localctx = new T_argumentsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_t_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			match(LPAREN);
			setState(1533);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UndecoratedIdentifier - 65)) | (1L << (PreValueName - 65)) | (1L << (MidValueName - 65)) | (1L << (PostValueName - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
				{
				setState(1532);
				t_expressionList();
				}
			}

			setState(1535);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_meansContext extends ParserRuleContext {
		public TerminalNode MEANS() { return getToken(TLantlrParser.MEANS, 0); }
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_meansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_means; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_means(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_meansContext t_means() throws RecognitionException {
		T_meansContext _localctx = new T_meansContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_t_means);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(MEANS);
			setState(1538);
			t_expression();
			setState(1539);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_givenContext extends ParserRuleContext {
		public TerminalNode GIVEN() { return getToken(TLantlrParser.GIVEN, 0); }
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
		}
		public T_givenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_given; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_given(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_givenContext t_given() throws RecognitionException {
		T_givenContext _localctx = new T_givenContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_t_given);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(GIVEN);
			setState(1542);
			t_expression();
			setState(1543);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_idDeclarationContext extends ParserRuleContext {
		public String idType;
		public T_identifierContext t_identifier() {
			return getRuleContext(T_identifierContext.class,0);
		}
		public T_idDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public T_idDeclarationContext(ParserRuleContext parent, int invokingState, String idType) {
			super(parent, invokingState);
			this.idType = idType;
		}
		@Override public int getRuleIndex() { return RULE_t_idDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_idDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_idDeclarationContext t_idDeclaration(String idType) throws RecognitionException {
		T_idDeclarationContext _localctx = new T_idDeclarationContext(_ctx, getState(), idType);
		enterRule(_localctx, 206, RULE_t_idDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			t_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_identifierContext extends ParserRuleContext {
		public T_identifierDetailContext t_identifierDetail() {
			return getRuleContext(T_identifierDetailContext.class,0);
		}
		public T_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_identifierContext t_identifier() throws RecognitionException {
		T_identifierContext _localctx = new T_identifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_t_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			t_identifierDetail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_identifierDetailContext extends ParserRuleContext {
		public T_identifierDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_identifierDetail; }
	 
		public T_identifierDetailContext() { }
		public void copyFrom(T_identifierDetailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class T_PreValueNameContext extends T_identifierDetailContext {
		public TerminalNode PreValueName() { return getToken(TLantlrParser.PreValueName, 0); }
		public T_PreValueNameContext(T_identifierDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_PreValueName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class T_MidValueNameContext extends T_identifierDetailContext {
		public TerminalNode MidValueName() { return getToken(TLantlrParser.MidValueName, 0); }
		public T_MidValueNameContext(T_identifierDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_MidValueName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class T_PostValueNameContext extends T_identifierDetailContext {
		public TerminalNode PostValueName() { return getToken(TLantlrParser.PostValueName, 0); }
		public T_PostValueNameContext(T_identifierDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_PostValueName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class T_UndecoratedIdentifierContext extends T_identifierDetailContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_UndecoratedIdentifierContext(T_identifierDetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_UndecoratedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_identifierDetailContext t_identifierDetail() throws RecognitionException {
		T_identifierDetailContext _localctx = new T_identifierDetailContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_t_identifierDetail);
		try {
			setState(1553);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
				_localctx = new T_UndecoratedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1549);
				match(UndecoratedIdentifier);
				}
				break;
			case PreValueName:
				_localctx = new T_PreValueNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
				match(PreValueName);
				}
				break;
			case MidValueName:
				_localctx = new T_MidValueNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1551);
				match(MidValueName);
				}
				break;
			case PostValueName:
				_localctx = new T_PostValueNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1552);
				match(PostValueName);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_valueNameContext extends ParserRuleContext {
		public TerminalNode PreValueName() { return getToken(TLantlrParser.PreValueName, 0); }
		public TerminalNode MidValueName() { return getToken(TLantlrParser.MidValueName, 0); }
		public TerminalNode PostValueName() { return getToken(TLantlrParser.PostValueName, 0); }
		public T_valueNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_valueName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_valueName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_valueNameContext t_valueName() throws RecognitionException {
		T_valueNameContext _localctx = new T_valueNameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_t_valueName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PreValueName - 67)) | (1L << (MidValueName - 67)) | (1L << (PostValueName - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TLantlrParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1557);
				packageDeclaration();
				}
				break;
			}
			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(1560);
				importDeclaration();
				}
				}
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(1566);
				typeDeclaration();
				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1572);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1574);
				annotation();
				}
				}
				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1580);
			match(PACKAGE);
			setState(1581);
			qualifiedName();
			setState(1582);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			match(IMPORT);
			setState(1586);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1585);
				match(STATIC);
				}
			}

			setState(1588);
			qualifiedName();
			setState(1591);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1589);
				match(DOT);
				setState(1590);
				match(MUL);
				}
			}

			setState(1593);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1595);
					classOrInterfaceModifier();
					}
					}
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1601);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1602);
					classOrInterfaceModifier();
					}
					}
					setState(1607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1608);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1609);
					classOrInterfaceModifier();
					}
					}
					setState(1614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1615);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1616);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1621);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				setState(1622);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1623);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_modifier);
		int _la;
		try {
			setState(1628);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1627);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(1632);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1630);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_variableModifier);
		try {
			setState(1636);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1635);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			match(CLASS);
			setState(1639);
			match(Identifier);
			setState(1641);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1640);
				typeParameters();
				}
			}

			setState(1645);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1643);
				match(EXTENDS);
				setState(1644);
				type();
				}
			}

			setState(1649);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1647);
				match(IMPLEMENTS);
				setState(1648);
				typeList();
				}
			}

			setState(1651);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			match(LT);
			setState(1654);
			typeParameter();
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1655);
				match(COMMA);
				setState(1656);
				typeParameter();
				}
				}
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1662);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(Identifier);
			setState(1667);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1665);
				match(EXTENDS);
				setState(1666);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			type();
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1670);
				match(BITAND);
				setState(1671);
				type();
				}
				}
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(TLantlrParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(ENUM);
			setState(1678);
			match(Identifier);
			setState(1681);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1679);
				match(IMPLEMENTS);
				setState(1680);
				typeList();
				}
			}

			setState(1683);
			match(LBRACE);
			setState(1685);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1684);
				enumConstants();
				}
			}

			setState(1688);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1687);
				match(COMMA);
				}
			}

			setState(1691);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1690);
				enumBodyDeclarations();
				}
			}

			setState(1693);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			enumConstant();
			setState(1700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1696);
					match(COMMA);
					setState(1697);
					enumConstant();
					}
					} 
				}
				setState(1702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1703);
				annotation();
				}
				}
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1709);
			match(Identifier);
			setState(1711);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1710);
				arguments();
				}
			}

			setState(1714);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1713);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			match(SEMI);
			setState(1720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1717);
				classBodyDeclaration();
				}
				}
				setState(1722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(INTERFACE);
			setState(1724);
			match(Identifier);
			setState(1726);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1725);
				typeParameters();
				}
			}

			setState(1730);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1728);
				match(EXTENDS);
				setState(1729);
				typeList();
				}
			}

			setState(1732);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			type();
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1735);
				match(COMMA);
				setState(1736);
				type();
				}
				}
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(LBRACE);
			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1743);
				classBodyDeclaration();
				}
				}
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1749);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(LBRACE);
			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1752);
				interfaceBodyDeclaration();
				}
				}
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1758);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1760);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1762);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(1761);
					match(STATIC);
					}
				}

				setState(1764);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1765);
						modifier();
						}
						} 
					}
					setState(1770);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				setState(1771);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_memberDeclaration);
		try {
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1775);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1776);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1777);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1778);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1779);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1780);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1781);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1782);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(1785);
				type();
				}
				break;
			case VOID:
				{
				setState(1786);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1789);
			match(Identifier);
			setState(1790);
			formalParameters();
			setState(1795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1791);
				match(LBRACK);
				setState(1792);
				match(RBRACK);
				}
				}
				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1800);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1798);
				match(THROWS);
				setState(1799);
				qualifiedNameList();
				}
			}

			setState(1804);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(1802);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(1803);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			typeParameters();
			setState(1807);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			match(Identifier);
			setState(1810);
			formalParameters();
			setState(1813);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1811);
				match(THROWS);
				setState(1812);
				qualifiedNameList();
				}
			}

			setState(1815);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			typeParameters();
			setState(1818);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			type();
			setState(1821);
			variableDeclarators();
			setState(1822);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(1832);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case Identifier:
			case LT:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1824);
						modifier();
						}
						} 
					}
					setState(1829);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				}
				setState(1830);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1831);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_interfaceMemberDeclaration);
		try {
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1834);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1836);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1837);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1838);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1839);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1840);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			type();
			setState(1844);
			constantDeclarator();
			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1845);
				match(COMMA);
				setState(1846);
				constantDeclarator();
				}
				}
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1852);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(Identifier);
			setState(1859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1855);
				match(LBRACK);
				setState(1856);
				match(RBRACK);
				}
				}
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1862);
			match(ASSIGN);
			setState(1863);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(1865);
				type();
				}
				break;
			case VOID:
				{
				setState(1866);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1869);
			match(Identifier);
			setState(1870);
			formalParameters();
			setState(1875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1871);
				match(LBRACK);
				setState(1872);
				match(RBRACK);
				}
				}
				setState(1877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1880);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1878);
				match(THROWS);
				setState(1879);
				qualifiedNameList();
				}
			}

			setState(1882);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			typeParameters();
			setState(1885);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			variableDeclarator();
			setState(1892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1888);
				match(COMMA);
				setState(1889);
				variableDeclarator();
				}
				}
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			variableDeclaratorId();
			setState(1898);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1896);
				match(ASSIGN);
				setState(1897);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(Identifier);
			setState(1905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1901);
				match(LBRACK);
				setState(1902);
				match(RBRACK);
				}
				}
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_variableInitializer);
		try {
			setState(1910);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1909);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			match(LBRACE);
			setState(1924);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
				{
				setState(1913);
				variableInitializer();
				setState(1918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1914);
						match(COMMA);
						setState(1915);
						variableInitializer();
						}
						} 
					}
					setState(1920);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				setState(1922);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1921);
					match(COMMA);
					}
				}

				}
			}

			setState(1926);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_type);
		try {
			int _alt;
			setState(1950);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				classOrInterfaceType();
				setState(1939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1935);
						match(LBRACK);
						setState(1936);
						match(RBRACK);
						}
						} 
					}
					setState(1941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1942);
				primitiveType();
				setState(1947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1943);
						match(LBRACK);
						setState(1944);
						match(RBRACK);
						}
						} 
					}
					setState(1949);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TLantlrParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TLantlrParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(Identifier);
			setState(1954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1953);
				typeArguments();
				}
				break;
			}
			setState(1963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1956);
					match(DOT);
					setState(1957);
					match(Identifier);
					setState(1959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						setState(1958);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(1965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(LT);
			setState(1969);
			typeArgument();
			setState(1974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1970);
				match(COMMA);
				setState(1971);
				typeArgument();
				}
				}
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1977);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_typeArgument);
		int _la;
		try {
			setState(1985);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1979);
				type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1980);
				match(QUESTION);
				setState(1983);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(1981);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1982);
					type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			qualifiedName();
			setState(1992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1988);
				match(COMMA);
				setState(1989);
				qualifiedName();
				}
				}
				setState(1994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(LPAREN);
			setState(1997);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1996);
				formalParameterList();
				}
			}

			setState(1999);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(2014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2001);
				formalParameter();
				setState(2006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2002);
						match(COMMA);
						setState(2003);
						formalParameter();
						}
						} 
					}
					setState(2008);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				}
				setState(2011);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2009);
					match(COMMA);
					setState(2010);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2016);
				variableModifier();
				}
				}
				setState(2021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2022);
			type();
			setState(2023);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2025);
				variableModifier();
				}
				}
				setState(2030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2031);
			type();
			setState(2032);
			match(ELLIPSIS);
			setState(2033);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TLantlrParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TLantlrParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			match(Identifier);
			setState(2044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2040);
					match(DOT);
					setState(2041);
					match(Identifier);
					}
					} 
				}
				setState(2046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(TLantlrParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(TLantlrParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(TLantlrParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(TLantlrParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TLantlrParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (BooleanLiteral - 59)) | (1L << (NullLiteral - 59)) | (1L << (IntegerLiteral - 59)) | (1L << (FloatingPointLiteral - 59)) | (1L << (CharacterLiteral - 59)) | (1L << (StringLiteral - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(AT);
			setState(2050);
			annotationName();
			setState(2057);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2051);
				match(LPAREN);
				setState(2054);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(2052);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(2053);
					elementValue();
					}
					break;
				}
				setState(2056);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			elementValuePair();
			setState(2066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2062);
				match(COMMA);
				setState(2063);
				elementValuePair();
				}
				}
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			match(Identifier);
			setState(2070);
			match(ASSIGN);
			setState(2071);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_elementValue);
		try {
			setState(2076);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(2073);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2074);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2075);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(LBRACE);
			setState(2087);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(2079);
				elementValue();
				setState(2084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2080);
						match(COMMA);
						setState(2081);
						elementValue();
						}
						} 
					}
					setState(2086);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				}
				}
			}

			setState(2090);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2089);
				match(COMMA);
				}
			}

			setState(2092);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2094);
			match(AT);
			setState(2095);
			match(INTERFACE);
			setState(2096);
			match(Identifier);
			setState(2097);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			match(LBRACE);
			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (SEMI - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(2100);
				annotationTypeElementDeclaration();
				}
				}
				setState(2105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2106);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(2116);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2108);
						modifier();
						}
						} 
					}
					setState(2113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				}
				setState(2114);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2115);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_annotationTypeElementRest);
		try {
			setState(2138);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2118);
				type();
				setState(2119);
				annotationMethodOrConstantRest();
				setState(2120);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122);
				classDeclaration();
				setState(2124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2123);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2126);
				interfaceDeclaration();
				setState(2128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2127);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(2130);
				enumDeclaration();
				setState(2132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2131);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2134);
				annotationTypeDeclaration();
				setState(2136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2135);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_annotationMethodOrConstantRest);
		try {
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2140);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2141);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(Identifier);
			setState(2145);
			match(LPAREN);
			setState(2146);
			match(RPAREN);
			setState(2148);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2147);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			match(DEFAULT);
			setState(2153);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			match(LBRACE);
			setState(2159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(2156);
				blockStatement();
				}
				}
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2162);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_blockStatement);
		try {
			setState(2167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2165);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2166);
				typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			localVariableDeclaration();
			setState(2170);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2172);
				variableModifier();
				}
				}
				setState(2177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2178);
			type();
			setState(2179);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(TLantlrParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(2285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2181);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2182);
				match(ASSERT);
				setState(2183);
				expression(0);
				setState(2186);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(2184);
					match(COLON);
					setState(2185);
					expression(0);
					}
				}

				setState(2188);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2190);
				match(IF);
				setState(2191);
				parExpression();
				setState(2192);
				statement();
				setState(2195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2193);
					match(ELSE);
					setState(2194);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2197);
				match(FOR);
				setState(2198);
				match(LPAREN);
				setState(2199);
				forControl();
				setState(2200);
				match(RPAREN);
				setState(2201);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2203);
				match(WHILE);
				setState(2204);
				parExpression();
				setState(2205);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2207);
				match(DO);
				setState(2208);
				statement();
				setState(2209);
				match(WHILE);
				setState(2210);
				parExpression();
				setState(2211);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2213);
				match(TRY);
				setState(2214);
				block();
				setState(2224);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(2216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2215);
						catchClause();
						}
						}
						setState(2218); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(2221);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(2220);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(2223);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2226);
				match(TRY);
				setState(2227);
				resourceSpecification();
				setState(2228);
				block();
				setState(2232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(2229);
					catchClause();
					}
					}
					setState(2234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2236);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(2235);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2238);
				match(SWITCH);
				setState(2239);
				parExpression();
				setState(2240);
				match(LBRACE);
				setState(2244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2241);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(2246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
				}
				setState(2250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(2247);
					switchLabel();
					}
					}
					setState(2252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2253);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2255);
				match(SYNCHRONIZED);
				setState(2256);
				parExpression();
				setState(2257);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2259);
				match(RETURN);
				setState(2261);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(2260);
					expression(0);
					}
				}

				setState(2263);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2264);
				match(THROW);
				setState(2265);
				expression(0);
				setState(2266);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2268);
				match(BREAK);
				setState(2270);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2269);
					match(Identifier);
					}
				}

				setState(2272);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2273);
				match(CONTINUE);
				setState(2275);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2274);
					match(Identifier);
					}
				}

				setState(2277);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2278);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2279);
				statementExpression();
				setState(2280);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2282);
				match(Identifier);
				setState(2283);
				match(COLON);
				setState(2284);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			match(CATCH);
			setState(2288);
			match(LPAREN);
			setState(2292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2289);
				variableModifier();
				}
				}
				setState(2294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2295);
			catchType();
			setState(2296);
			match(Identifier);
			setState(2297);
			match(RPAREN);
			setState(2298);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			qualifiedName();
			setState(2305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(2301);
				match(BITOR);
				setState(2302);
				qualifiedName();
				}
				}
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(FINALLY);
			setState(2309);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			match(LPAREN);
			setState(2312);
			resources();
			setState(2314);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2313);
				match(SEMI);
				}
			}

			setState(2316);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2318);
			resource();
			setState(2323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2319);
					match(SEMI);
					setState(2320);
					resource();
					}
					} 
				}
				setState(2325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2326);
				variableModifier();
				}
				}
				setState(2331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2332);
			classOrInterfaceType();
			setState(2333);
			variableDeclaratorId();
			setState(2334);
			match(ASSIGN);
			setState(2335);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2337);
				switchLabel();
				}
				}
				setState(2340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(2343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2342);
				blockStatement();
				}
				}
				setState(2345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_switchLabel);
		try {
			setState(2357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2347);
				match(CASE);
				setState(2348);
				constantExpression();
				setState(2349);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2351);
				match(CASE);
				setState(2352);
				enumConstantName();
				setState(2353);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2355);
				match(DEFAULT);
				setState(2356);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_forControl);
		int _la;
		try {
			setState(2371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2359);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2361);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2360);
					forInit();
					}
				}

				setState(2363);
				match(SEMI);
				setState(2365);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(2364);
					expression(0);
					}
				}

				setState(2367);
				match(SEMI);
				setState(2369);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(2368);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_forInit);
		try {
			setState(2375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2374);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2377);
				variableModifier();
				}
				}
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2383);
			type();
			setState(2384);
			match(Identifier);
			setState(2385);
			match(COLON);
			setState(2386);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			match(LPAREN);
			setState(2391);
			expression(0);
			setState(2392);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			expression(0);
			setState(2399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2395);
				match(COMMA);
				setState(2396);
				expression(0);
				}
				}
				setState(2401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2404);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 392;
		enterRecursionRule(_localctx, 392, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2407);
				primary();
				}
				break;
			case 2:
				{
				setState(2408);
				match(NEW);
				setState(2409);
				creator();
				}
				break;
			case 3:
				{
				setState(2410);
				match(LPAREN);
				setState(2411);
				type();
				setState(2412);
				match(RPAREN);
				setState(2413);
				expression(17);
				}
				break;
			case 4:
				{
				setState(2415);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (INC - 99)) | (1L << (DEC - 99)) | (1L << (ADD - 99)) | (1L << (SUB - 99)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2416);
				expression(15);
				}
				break;
			case 5:
				{
				setState(2417);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2418);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2421);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2422);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (MUL - 103)) | (1L << (DIV - 103)) | (1L << (MOD - 103)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2423);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2424);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2425);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2426);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2427);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2435);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
						case 1:
							{
							setState(2428);
							match(LT);
							setState(2429);
							match(LT);
							}
							break;
						case 2:
							{
							setState(2430);
							match(GT);
							setState(2431);
							match(GT);
							setState(2432);
							match(GT);
							}
							break;
						case 3:
							{
							setState(2433);
							match(GT);
							setState(2434);
							match(GT);
							}
							break;
						}
						setState(2437);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2438);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2439);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (GT - 87)) | (1L << (LT - 87)) | (1L << (LE - 87)) | (1L << (GE - 87)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2440);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2441);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2442);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2443);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2444);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2445);
						match(BITAND);
						setState(2446);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2447);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2448);
						match(CARET);
						setState(2449);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2450);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2451);
						match(BITOR);
						setState(2452);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2453);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2454);
						match(AND);
						setState(2455);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2456);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2457);
						match(OR);
						setState(2458);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2459);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2460);
						match(QUESTION);
						setState(2461);
						expression(0);
						setState(2462);
						match(COLON);
						setState(2463);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2465);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2466);
						_la = _input.LA(1);
						if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ASSIGN - 86)) | (1L << (ADD_ASSIGN - 86)) | (1L << (SUB_ASSIGN - 86)) | (1L << (MUL_ASSIGN - 86)) | (1L << (DIV_ASSIGN - 86)) | (1L << (AND_ASSIGN - 86)) | (1L << (OR_ASSIGN - 86)) | (1L << (XOR_ASSIGN - 86)) | (1L << (MOD_ASSIGN - 86)) | (1L << (LSHIFT_ASSIGN - 86)) | (1L << (RSHIFT_ASSIGN - 86)) | (1L << (URSHIFT_ASSIGN - 86)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2467);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2468);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(2469);
						match(DOT);
						setState(2470);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2471);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(2472);
						match(DOT);
						setState(2473);
						match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2474);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(2475);
						match(DOT);
						setState(2476);
						match(NEW);
						setState(2478);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(2477);
							nonWildcardTypeArguments();
							}
						}

						setState(2480);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2481);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(2482);
						match(DOT);
						setState(2483);
						match(SUPER);
						setState(2484);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2485);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(2486);
						match(DOT);
						setState(2487);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2488);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2489);
						match(LBRACK);
						setState(2490);
						expression(0);
						setState(2491);
						match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2493);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2494);
						match(LPAREN);
						setState(2496);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
							{
							setState(2495);
							expressionList();
							}
						}

						setState(2498);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2499);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2500);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2501);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2502);
						match(INSTANCEOF);
						setState(2503);
						type();
						}
						break;
					}
					} 
				}
				setState(2508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_primary);
		try {
			setState(2530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2509);
				match(LPAREN);
				setState(2510);
				expression(0);
				setState(2511);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2513);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2514);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2515);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2516);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2517);
				type();
				setState(2518);
				match(DOT);
				setState(2519);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2521);
				match(VOID);
				setState(2522);
				match(DOT);
				setState(2523);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2524);
				nonWildcardTypeArguments();
				setState(2528);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(2525);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(2526);
					match(THIS);
					setState(2527);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_creator);
		try {
			setState(2541);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2532);
				nonWildcardTypeArguments();
				setState(2533);
				createdName();
				setState(2534);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2536);
				createdName();
				setState(2539);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(2537);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(2538);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TLantlrParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TLantlrParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_createdName);
		int _la;
		try {
			setState(2558);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2543);
				match(Identifier);
				setState(2545);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2544);
					typeArgumentsOrDiamond();
					}
				}

				setState(2554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2547);
					match(DOT);
					setState(2548);
					match(Identifier);
					setState(2550);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2549);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(2556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2557);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			match(Identifier);
			setState(2562);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2561);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(2564);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
			match(LBRACK);
			setState(2594);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(2567);
				match(RBRACK);
				setState(2572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2568);
					match(LBRACK);
					setState(2569);
					match(RBRACK);
					}
					}
					setState(2574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2575);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(2576);
				expression(0);
				setState(2577);
				match(RBRACK);
				setState(2584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2578);
						match(LBRACK);
						setState(2579);
						expression(0);
						setState(2580);
						match(RBRACK);
						}
						} 
					}
					setState(2586);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				}
				setState(2591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2587);
						match(LBRACK);
						setState(2588);
						match(RBRACK);
						}
						} 
					}
					setState(2593);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2596);
			arguments();
			setState(2598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2597);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			nonWildcardTypeArguments();
			setState(2601);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2603);
			match(LT);
			setState(2604);
			typeList();
			setState(2605);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_typeArgumentsOrDiamond);
		try {
			setState(2610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2607);
				match(LT);
				setState(2608);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2609);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(2615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2612);
				match(LT);
				setState(2613);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2614);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_superSuffix);
		try {
			setState(2623);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2617);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2618);
				match(DOT);
				setState(2619);
				match(Identifier);
				setState(2621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2620);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TLantlrParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_explicitGenericInvocationSuffix);
		try {
			setState(2629);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2625);
				match(SUPER);
				setState(2626);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2627);
				match(Identifier);
				setState(2628);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2631);
			match(LPAREN);
			setState(2633);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
				{
				setState(2632);
				expressionList();
				}
			}

			setState(2635);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 87:
			return t_expressionDetail_sempred((T_expressionDetailContext)_localctx, predIndex);
		case 196:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean t_expressionDetail_sempred(T_expressionDetailContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 25);
		case 12:
			return precpred(_ctx, 24);
		case 13:
			return precpred(_ctx, 23);
		case 14:
			return precpred(_ctx, 22);
		case 15:
			return precpred(_ctx, 21);
		case 16:
			return precpred(_ctx, 20);
		case 17:
			return precpred(_ctx, 19);
		case 18:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 13);
		case 20:
			return precpred(_ctx, 12);
		case 21:
			return precpred(_ctx, 11);
		case 22:
			return precpred(_ctx, 10);
		case 23:
			return precpred(_ctx, 8);
		case 24:
			return precpred(_ctx, 7);
		case 25:
			return precpred(_ctx, 6);
		case 26:
			return precpred(_ctx, 5);
		case 27:
			return precpred(_ctx, 4);
		case 28:
			return precpred(_ctx, 3);
		case 29:
			return precpred(_ctx, 2);
		case 30:
			return precpred(_ctx, 1);
		case 31:
			return precpred(_ctx, 25);
		case 32:
			return precpred(_ctx, 24);
		case 33:
			return precpred(_ctx, 23);
		case 34:
			return precpred(_ctx, 22);
		case 35:
			return precpred(_ctx, 21);
		case 36:
			return precpred(_ctx, 20);
		case 37:
			return precpred(_ctx, 19);
		case 38:
			return precpred(_ctx, 16);
		case 39:
			return precpred(_ctx, 9);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3{\u0a50\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\3\2\5\2\u01a8\n\2\3\2\7\2\u01ab\n\2\f"+
		"\2\16\2\u01ae\13\2\3\2\7\2\u01b1\n\2\f\2\16\2\u01b4\13\2\3\2\3\2\3\3\7"+
		"\3\u01b9\n\3\f\3\16\3\u01bc\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u01c4\n\4"+
		"\3\4\3\4\3\4\5\4\u01c9\n\4\3\4\3\4\3\5\7\5\u01ce\n\5\f\5\16\5\u01d1\13"+
		"\5\3\5\3\5\7\5\u01d5\n\5\f\5\16\5\u01d8\13\5\3\5\3\5\7\5\u01dc\n\5\f\5"+
		"\16\5\u01df\13\5\3\5\3\5\7\5\u01e3\n\5\f\5\16\5\u01e6\13\5\3\5\3\5\5\5"+
		"\u01ea\n\5\3\6\3\6\5\6\u01ee\n\6\3\7\3\7\5\7\u01f2\n\7\3\b\3\b\5\b\u01f6"+
		"\n\b\3\t\3\t\3\t\5\t\u01fb\n\t\3\t\3\t\5\t\u01ff\n\t\3\t\3\t\5\t\u0203"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u020b\n\n\f\n\16\n\u020e\13\n\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u0215\n\13\3\f\3\f\3\f\7\f\u021a\n\f\f\f\16\f\u021d"+
		"\13\f\3\r\3\r\3\r\3\r\5\r\u0223\n\r\3\r\3\r\5\r\u0227\n\r\3\r\5\r\u022a"+
		"\n\r\3\r\5\r\u022d\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0234\n\16\f\16\16"+
		"\16\u0237\13\16\3\17\7\17\u023a\n\17\f\17\16\17\u023d\13\17\3\17\3\17"+
		"\5\17\u0241\n\17\3\17\5\17\u0244\n\17\3\20\3\20\7\20\u0248\n\20\f\20\16"+
		"\20\u024b\13\20\3\21\3\21\3\21\5\21\u0250\n\21\3\21\3\21\5\21\u0254\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\7\22\u025b\n\22\f\22\16\22\u025e\13\22\3"+
		"\23\3\23\7\23\u0262\n\23\f\23\16\23\u0265\13\23\3\23\3\23\3\24\3\24\7"+
		"\24\u026b\n\24\f\24\16\24\u026e\13\24\3\24\3\24\3\25\3\25\5\25\u0274\n"+
		"\25\3\25\3\25\7\25\u0278\n\25\f\25\16\25\u027b\13\25\3\25\5\25\u027e\n"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u028b"+
		"\n\27\3\30\3\30\5\30\u028f\n\30\3\30\3\30\3\30\3\30\7\30\u0295\n\30\f"+
		"\30\16\30\u0298\13\30\3\30\3\30\5\30\u029c\n\30\3\30\3\30\5\30\u02a0\n"+
		"\30\3\30\5\30\u02a3\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u02ac"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u02b7\n\34\f\34"+
		"\16\34\u02ba\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u02c3\n\35"+
		"\3\36\3\36\7\36\u02c7\n\36\f\36\16\36\u02ca\13\36\3\36\5\36\u02cd\n\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u02d8\n \3!\3!\3\"\3\"\3#\3#\3"+
		"#\7#\u02e1\n#\f#\16#\u02e4\13#\3$\3$\5$\u02e8\n$\3%\3%\3%\3%\7%\u02ee"+
		"\n%\f%\16%\u02f1\13%\3%\5%\u02f4\n%\5%\u02f6\n%\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3)\7)\u0303\n)\f)\16)\u0306\13)\3)\3)\3)\7)\u030b\n)\f)\16"+
		")\u030e\13)\5)\u0310\n)\3*\3*\5*\u0314\n*\3*\3*\3*\5*\u0319\n*\7*\u031b"+
		"\n*\f*\16*\u031e\13*\3+\3+\3,\3,\3,\3,\7,\u0326\n,\f,\16,\u0329\13,\3"+
		",\3,\3-\3-\3-\3-\5-\u0331\n-\5-\u0333\n-\3.\3.\3.\7.\u0338\n.\f.\16.\u033b"+
		"\13.\3/\3/\5/\u033f\n/\3/\3/\3\60\3\60\3\60\7\60\u0346\n\60\f\60\16\60"+
		"\u0349\13\60\3\60\3\60\5\60\u034d\n\60\3\60\5\60\u0350\n\60\3\61\7\61"+
		"\u0353\n\61\f\61\16\61\u0356\13\61\3\61\3\61\3\61\3\62\7\62\u035c\n\62"+
		"\f\62\16\62\u035f\13\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\65\7\65\u036c\n\65\f\65\16\65\u036f\13\65\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u0378\n\67\3\67\5\67\u037b\n\67\38\38\39\39\39\79\u0382"+
		"\n9\f9\169\u0385\139\3:\3:\3:\3:\3;\3;\3;\5;\u038e\n;\3<\3<\3<\3<\7<\u0394"+
		"\n<\f<\16<\u0397\13<\5<\u0399\n<\3<\5<\u039c\n<\3<\3<\3=\3=\3=\3=\3=\3"+
		">\3>\7>\u03a7\n>\f>\16>\u03aa\13>\3>\3>\3?\3?\7?\u03b0\n?\f?\16?\u03b3"+
		"\13?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u03bf\n?\3?\3?\5?\u03c3\n?\3?\3"+
		"?\5?\u03c7\n?\3?\3?\5?\u03cb\n?\5?\u03cd\n?\5?\u03cf\n?\3@\3@\3@\3@\5"+
		"@\u03d5\n@\3A\3A\3A\7A\u03da\nA\fA\16A\u03dd\13A\3B\3B\3B\3C\3C\7C\u03e4"+
		"\nC\fC\16C\u03e7\13C\3C\3C\3D\3D\3D\3D\3D\5D\u03f0\nD\3E\7E\u03f3\nE\f"+
		"E\16E\u03f6\13E\3E\3E\3E\3E\7E\u03fc\nE\fE\16E\u03ff\13E\3F\3F\3F\3F\3"+
		"F\5F\u0406\nF\3F\3F\3F\3F\3F\3F\3F\5F\u040f\nF\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\6F\u042c\n"+
		"F\rF\16F\u042d\3F\5F\u0431\nF\3F\5F\u0434\nF\3F\3F\3F\3F\7F\u043a\nF\f"+
		"F\16F\u043d\13F\3F\5F\u0440\nF\3F\3F\3F\3F\7F\u0446\nF\fF\16F\u0449\13"+
		"F\3F\7F\u044c\nF\fF\16F\u044f\13F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0459\nF"+
		"\3F\3F\3F\3F\3F\3F\3F\5F\u0462\nF\3F\3F\3F\5F\u0467\nF\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\5F\u0473\nF\3F\3F\3F\3F\3F\3F\3F\5F\u047c\nF\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\5F\u0486\nF\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\5H\u0492\nH"+
		"\3I\3I\3I\7I\u0497\nI\fI\16I\u049a\13I\3I\3I\3I\3I\3I\3J\3J\3J\7J\u04a4"+
		"\nJ\fJ\16J\u04a7\13J\3K\3K\3K\3L\3L\3L\5L\u04af\nL\3L\3L\3M\3M\3M\7M\u04b6"+
		"\nM\fM\16M\u04b9\13M\3N\7N\u04bc\nN\fN\16N\u04bf\13N\3N\3N\3N\3N\3N\3"+
		"O\6O\u04c7\nO\rO\16O\u04c8\3O\6O\u04cc\nO\rO\16O\u04cd\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\5P\u04da\nP\3Q\3Q\5Q\u04de\nQ\3Q\3Q\5Q\u04e2\nQ\3Q\3Q"+
		"\5Q\u04e6\nQ\5Q\u04e8\nQ\3R\3R\5R\u04ec\nR\3S\7S\u04ef\nS\fS\16S\u04f2"+
		"\13S\3S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3U\3V\3V\3V\7V\u0502\nV\fV\16V\u0505"+
		"\13V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\7Y\u051f\nY\fY\16Y\u0522\13Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u052a\nY\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u053a\nY\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0562\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0576\nY\fY\16Y\u0579\13Y\5Y\u057b\nY\3Y\3"+
		"Y\3Y\3Y\7Y\u0581\nY\fY\16Y\u0584\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\5Z\u0596\nZ\5Z\u0598\nZ\3[\3[\3[\3[\3[\3[\3[\5[\u05a1"+
		"\n[\5[\u05a3\n[\3\\\3\\\5\\\u05a7\n\\\3\\\3\\\3\\\5\\\u05ac\n\\\7\\\u05ae"+
		"\n\\\f\\\16\\\u05b1\13\\\3\\\5\\\u05b4\n\\\3]\3]\5]\u05b8\n]\3]\3]\3^"+
		"\3^\3^\3^\7^\u05c0\n^\f^\16^\u05c3\13^\3^\3^\3^\3^\3^\3^\3^\7^\u05cc\n"+
		"^\f^\16^\u05cf\13^\3^\3^\7^\u05d3\n^\f^\16^\u05d6\13^\5^\u05d8\n^\3_\3"+
		"_\5_\u05dc\n_\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\5b\u05e8\nb\3c\3c\3c\5c\u05ed"+
		"\nc\3d\3d\3d\3d\5d\u05f3\nd\5d\u05f5\nd\3e\3e\3e\3e\3e\5e\u05fc\ne\3f"+
		"\3f\5f\u0600\nf\3f\3f\3g\3g\3g\3g\3h\3h\3h\3h\3i\3i\3j\3j\3k\3k\3k\3k"+
		"\5k\u0614\nk\3l\3l\3m\5m\u0619\nm\3m\7m\u061c\nm\fm\16m\u061f\13m\3m\7"+
		"m\u0622\nm\fm\16m\u0625\13m\3m\3m\3n\7n\u062a\nn\fn\16n\u062d\13n\3n\3"+
		"n\3n\3n\3o\3o\5o\u0635\no\3o\3o\3o\5o\u063a\no\3o\3o\3p\7p\u063f\np\f"+
		"p\16p\u0642\13p\3p\3p\7p\u0646\np\fp\16p\u0649\13p\3p\3p\7p\u064d\np\f"+
		"p\16p\u0650\13p\3p\3p\7p\u0654\np\fp\16p\u0657\13p\3p\3p\5p\u065b\np\3"+
		"q\3q\5q\u065f\nq\3r\3r\5r\u0663\nr\3s\3s\5s\u0667\ns\3t\3t\3t\5t\u066c"+
		"\nt\3t\3t\5t\u0670\nt\3t\3t\5t\u0674\nt\3t\3t\3u\3u\3u\3u\7u\u067c\nu"+
		"\fu\16u\u067f\13u\3u\3u\3v\3v\3v\5v\u0686\nv\3w\3w\3w\7w\u068b\nw\fw\16"+
		"w\u068e\13w\3x\3x\3x\3x\5x\u0694\nx\3x\3x\5x\u0698\nx\3x\5x\u069b\nx\3"+
		"x\5x\u069e\nx\3x\3x\3y\3y\3y\7y\u06a5\ny\fy\16y\u06a8\13y\3z\7z\u06ab"+
		"\nz\fz\16z\u06ae\13z\3z\3z\5z\u06b2\nz\3z\5z\u06b5\nz\3{\3{\7{\u06b9\n"+
		"{\f{\16{\u06bc\13{\3|\3|\3|\5|\u06c1\n|\3|\3|\5|\u06c5\n|\3|\3|\3}\3}"+
		"\3}\7}\u06cc\n}\f}\16}\u06cf\13}\3~\3~\7~\u06d3\n~\f~\16~\u06d6\13~\3"+
		"~\3~\3\177\3\177\7\177\u06dc\n\177\f\177\16\177\u06df\13\177\3\177\3\177"+
		"\3\u0080\3\u0080\5\u0080\u06e5\n\u0080\3\u0080\3\u0080\7\u0080\u06e9\n"+
		"\u0080\f\u0080\16\u0080\u06ec\13\u0080\3\u0080\5\u0080\u06ef\n\u0080\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u06fa\n\u0081\3\u0082\3\u0082\5\u0082\u06fe\n\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\7\u0082\u0704\n\u0082\f\u0082\16\u0082\u0707\13"+
		"\u0082\3\u0082\3\u0082\5\u0082\u070b\n\u0082\3\u0082\3\u0082\5\u0082\u070f"+
		"\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084"+
		"\u0718\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0087\7\u0087\u0724\n\u0087\f\u0087\16\u0087\u0727"+
		"\13\u0087\3\u0087\3\u0087\5\u0087\u072b\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0734\n\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\7\u0089\u073a\n\u0089\f\u0089\16\u0089\u073d\13\u0089"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\7\u008a\u0744\n\u008a\f\u008a"+
		"\16\u008a\u0747\13\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\5\u008b"+
		"\u074e\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u0754\n\u008b\f"+
		"\u008b\16\u008b\u0757\13\u008b\3\u008b\3\u008b\5\u008b\u075b\n\u008b\3"+
		"\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\7\u008d"+
		"\u0765\n\u008d\f\u008d\16\u008d\u0768\13\u008d\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u076d\n\u008e\3\u008f\3\u008f\3\u008f\7\u008f\u0772\n\u008f\f"+
		"\u008f\16\u008f\u0775\13\u008f\3\u0090\3\u0090\5\u0090\u0779\n\u0090\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u077f\n\u0091\f\u0091\16\u0091"+
		"\u0782\13\u0091\3\u0091\5\u0091\u0785\n\u0091\5\u0091\u0787\n\u0091\3"+
		"\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\3\u0095\7\u0095\u0794\n\u0095\f\u0095\16\u0095\u0797\13\u0095"+
		"\3\u0095\3\u0095\3\u0095\7\u0095\u079c\n\u0095\f\u0095\16\u0095\u079f"+
		"\13\u0095\5\u0095\u07a1\n\u0095\3\u0096\3\u0096\5\u0096\u07a5\n\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u07aa\n\u0096\7\u0096\u07ac\n\u0096\f"+
		"\u0096\16\u0096\u07af\13\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\7\u0098\u07b7\n\u0098\f\u0098\16\u0098\u07ba\13\u0098\3\u0098"+
		"\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u07c2\n\u0099\5\u0099"+
		"\u07c4\n\u0099\3\u009a\3\u009a\3\u009a\7\u009a\u07c9\n\u009a\f\u009a\16"+
		"\u009a\u07cc\13\u009a\3\u009b\3\u009b\5\u009b\u07d0\n\u009b\3\u009b\3"+
		"\u009b\3\u009c\3\u009c\3\u009c\7\u009c\u07d7\n\u009c\f\u009c\16\u009c"+
		"\u07da\13\u009c\3\u009c\3\u009c\5\u009c\u07de\n\u009c\3\u009c\5\u009c"+
		"\u07e1\n\u009c\3\u009d\7\u009d\u07e4\n\u009d\f\u009d\16\u009d\u07e7\13"+
		"\u009d\3\u009d\3\u009d\3\u009d\3\u009e\7\u009e\u07ed\n\u009e\f\u009e\16"+
		"\u009e\u07f0\13\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u07fd\n\u00a1\f\u00a1"+
		"\16\u00a1\u0800\13\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0809\n\u00a3\3\u00a3\5\u00a3\u080c\n\u00a3\3\u00a4\3"+
		"\u00a4\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u0813\n\u00a5\f\u00a5\16\u00a5"+
		"\u0816\13\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u081f\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u0825\n"+
		"\u00a8\f\u00a8\16\u00a8\u0828\13\u00a8\5\u00a8\u082a\n\u00a8\3\u00a8\5"+
		"\u00a8\u082d\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00aa\3\u00aa\7\u00aa\u0838\n\u00aa\f\u00aa\16\u00aa\u083b\13"+
		"\u00aa\3\u00aa\3\u00aa\3\u00ab\7\u00ab\u0840\n\u00ab\f\u00ab\16\u00ab"+
		"\u0843\13\u00ab\3\u00ab\3\u00ab\5\u00ab\u0847\n\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u084f\n\u00ac\3\u00ac\3\u00ac"+
		"\5\u00ac\u0853\n\u00ac\3\u00ac\3\u00ac\5\u00ac\u0857\n\u00ac\3\u00ac\3"+
		"\u00ac\5\u00ac\u085b\n\u00ac\5\u00ac\u085d\n\u00ac\3\u00ad\3\u00ad\5\u00ad"+
		"\u0861\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0867\n\u00ae\3"+
		"\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\7\u00b1\u0870\n"+
		"\u00b1\f\u00b1\16\u00b1\u0873\13\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u087a\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4\7\u00b4"+
		"\u0880\n\u00b4\f\u00b4\16\u00b4\u0883\13\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u088d\n\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0896\n\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\6\u00b5\u08ab\n\u00b5\r\u00b5\16\u00b5\u08ac\3\u00b5\5\u00b5"+
		"\u08b0\n\u00b5\3\u00b5\5\u00b5\u08b3\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\7\u00b5\u08b9\n\u00b5\f\u00b5\16\u00b5\u08bc\13\u00b5\3\u00b5\5"+
		"\u00b5\u08bf\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u08c5\n\u00b5"+
		"\f\u00b5\16\u00b5\u08c8\13\u00b5\3\u00b5\7\u00b5\u08cb\n\u00b5\f\u00b5"+
		"\16\u00b5\u08ce\13\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u08d8\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08e1\n\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\5\u00b5\u08e6\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u08f0\n\u00b5\3\u00b6\3\u00b6\3\u00b6\7\u00b6"+
		"\u08f5\n\u00b6\f\u00b6\16\u00b6\u08f8\13\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0902\n\u00b7\f\u00b7"+
		"\16\u00b7\u0905\13\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\5\u00b9\u090d\n\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\7\u00ba"+
		"\u0914\n\u00ba\f\u00ba\16\u00ba\u0917\13\u00ba\3\u00bb\7\u00bb\u091a\n"+
		"\u00bb\f\u00bb\16\u00bb\u091d\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bc\6\u00bc\u0925\n\u00bc\r\u00bc\16\u00bc\u0926\3\u00bc"+
		"\6\u00bc\u092a\n\u00bc\r\u00bc\16\u00bc\u092b\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0938"+
		"\n\u00bd\3\u00be\3\u00be\5\u00be\u093c\n\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0940\n\u00be\3\u00be\3\u00be\5\u00be\u0944\n\u00be\5\u00be\u0946\n\u00be"+
		"\3\u00bf\3\u00bf\5\u00bf\u094a\n\u00bf\3\u00c0\7\u00c0\u094d\n\u00c0\f"+
		"\u00c0\16\u00c0\u0950\13\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\7\u00c3\u0960\n\u00c3\f\u00c3\16\u00c3\u0963\13\u00c3\3\u00c4\3\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0976\n\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0986\n\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09b1\n\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09c3\n\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u09cb\n\u00c6\f\u00c6"+
		"\16\u00c6\u09ce\13\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u09e3\n\u00c7\5\u00c7\u09e5\n"+
		"\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8"+
		"\u09ee\n\u00c8\5\u00c8\u09f0\n\u00c8\3\u00c9\3\u00c9\5\u00c9\u09f4\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u09f9\n\u00c9\7\u00c9\u09fb\n\u00c9\f"+
		"\u00c9\16\u00c9\u09fe\13\u00c9\3\u00c9\5\u00c9\u0a01\n\u00c9\3\u00ca\3"+
		"\u00ca\5\u00ca\u0a05\n\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\7\u00cb\u0a0d\n\u00cb\f\u00cb\16\u00cb\u0a10\13\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\7\u00cb\u0a19\n\u00cb\f"+
		"\u00cb\16\u00cb\u0a1c\13\u00cb\3\u00cb\3\u00cb\7\u00cb\u0a20\n\u00cb\f"+
		"\u00cb\16\u00cb\u0a23\13\u00cb\5\u00cb\u0a25\n\u00cb\3\u00cc\3\u00cc\5"+
		"\u00cc\u0a29\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0a35\n\u00cf\3\u00d0\3\u00d0\3"+
		"\u00d0\5\u00d0\u0a3a\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a40"+
		"\n\u00d1\5\u00d1\u0a42\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2"+
		"\u0a48\n\u00d2\3\u00d3\3\u00d3\5\u00d3\u0a4c\n\u00d3\3\u00d3\3\u00d3\3"+
		"\u00d3\2\4\u00b0\u018a\u00d4\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\2\24\6\2\'\'\63\63\67\67;;\b\2\7\7\22\22\30\30*,/\60\67\67\n\2\t\t\13"+
		"\13\16\16\24\24\32\32\"\"%%..\4\2\27\27\61\61\4\2=>KN\3\2gh\3\2\3\6\4"+
		"\2ijnn\4\2XZ`b\3\2?B\3\2EG\6\2\7\7\30\30*,/\60\3\2eh\3\2[\\\4\2YZ`a\4"+
		"\2__bb\4\2XXoy\3\2ef\u0b35\2\u01a7\3\2\2\2\4\u01ba\3\2\2\2\6\u01c1\3\2"+
		"\2\2\b\u01e9\3\2\2\2\n\u01ed\3\2\2\2\f\u01f1\3\2\2\2\16\u01f5\3\2\2\2"+
		"\20\u01f7\3\2\2\2\22\u0206\3\2\2\2\24\u0211\3\2\2\2\26\u0216\3\2\2\2\30"+
		"\u021e\3\2\2\2\32\u0230\3\2\2\2\34\u023b\3\2\2\2\36\u0245\3\2\2\2 \u024c"+
		"\3\2\2\2\"\u0257\3\2\2\2$\u025f\3\2\2\2&\u0268\3\2\2\2(\u027d\3\2\2\2"+
		"*\u027f\3\2\2\2,\u028a\3\2\2\2.\u028e\3\2\2\2\60\u02a4\3\2\2\2\62\u02a7"+
		"\3\2\2\2\64\u02af\3\2\2\2\66\u02b2\3\2\2\28\u02c2\3\2\2\2:\u02cc\3\2\2"+
		"\2<\u02ce\3\2\2\2>\u02d7\3\2\2\2@\u02d9\3\2\2\2B\u02db\3\2\2\2D\u02dd"+
		"\3\2\2\2F\u02e7\3\2\2\2H\u02e9\3\2\2\2J\u02f9\3\2\2\2L\u02fb\3\2\2\2N"+
		"\u02fd\3\2\2\2P\u030f\3\2\2\2R\u0311\3\2\2\2T\u031f\3\2\2\2V\u0321\3\2"+
		"\2\2X\u0332\3\2\2\2Z\u0334\3\2\2\2\\\u033c\3\2\2\2^\u034f\3\2\2\2`\u0354"+
		"\3\2\2\2b\u035d\3\2\2\2d\u0364\3\2\2\2f\u0366\3\2\2\2h\u0368\3\2\2\2j"+
		"\u0370\3\2\2\2l\u0372\3\2\2\2n\u037c\3\2\2\2p\u037e\3\2\2\2r\u0386\3\2"+
		"\2\2t\u038d\3\2\2\2v\u038f\3\2\2\2x\u039f\3\2\2\2z\u03a4\3\2\2\2|\u03ce"+
		"\3\2\2\2~\u03d0\3\2\2\2\u0080\u03d6\3\2\2\2\u0082\u03de\3\2\2\2\u0084"+
		"\u03e1\3\2\2\2\u0086\u03ef\3\2\2\2\u0088\u03f4\3\2\2\2\u008a\u0485\3\2"+
		"\2\2\u008c\u0487\3\2\2\2\u008e\u0491\3\2\2\2\u0090\u0493\3\2\2\2\u0092"+
		"\u04a0\3\2\2\2\u0094\u04a8\3\2\2\2\u0096\u04ab\3\2\2\2\u0098\u04b2\3\2"+
		"\2\2\u009a\u04bd\3\2\2\2\u009c\u04c6\3\2\2\2\u009e\u04d9\3\2\2\2\u00a0"+
		"\u04e7\3\2\2\2\u00a2\u04eb\3\2\2\2\u00a4\u04f0\3\2\2\2\u00a6\u04f8\3\2"+
		"\2\2\u00a8\u04fa\3\2\2\2\u00aa\u04fe\3\2\2\2\u00ac\u0506\3\2\2\2\u00ae"+
		"\u0508\3\2\2\2\u00b0\u0529\3\2\2\2\u00b2\u0597\3\2\2\2\u00b4\u05a2\3\2"+
		"\2\2\u00b6\u05b3\3\2\2\2\u00b8\u05b5\3\2\2\2\u00ba\u05bb\3\2\2\2\u00bc"+
		"\u05d9\3\2\2\2\u00be\u05dd\3\2\2\2\u00c0\u05e0\3\2\2\2\u00c2\u05e7\3\2"+
		"\2\2\u00c4\u05ec\3\2\2\2\u00c6\u05f4\3\2\2\2\u00c8\u05fb\3\2\2\2\u00ca"+
		"\u05fd\3\2\2\2\u00cc\u0603\3\2\2\2\u00ce\u0607\3\2\2\2\u00d0\u060b\3\2"+
		"\2\2\u00d2\u060d\3\2\2\2\u00d4\u0613\3\2\2\2\u00d6\u0615\3\2\2\2\u00d8"+
		"\u0618\3\2\2\2\u00da\u062b\3\2\2\2\u00dc\u0632\3\2\2\2\u00de\u065a\3\2"+
		"\2\2\u00e0\u065e\3\2\2\2\u00e2\u0662\3\2\2\2\u00e4\u0666\3\2\2\2\u00e6"+
		"\u0668\3\2\2\2\u00e8\u0677\3\2\2\2\u00ea\u0682\3\2\2\2\u00ec\u0687\3\2"+
		"\2\2\u00ee\u068f\3\2\2\2\u00f0\u06a1\3\2\2\2\u00f2\u06ac\3\2\2\2\u00f4"+
		"\u06b6\3\2\2\2\u00f6\u06bd\3\2\2\2\u00f8\u06c8\3\2\2\2\u00fa\u06d0\3\2"+
		"\2\2\u00fc\u06d9\3\2\2\2\u00fe\u06ee\3\2\2\2\u0100\u06f9\3\2\2\2\u0102"+
		"\u06fd\3\2\2\2\u0104\u0710\3\2\2\2\u0106\u0713\3\2\2\2\u0108\u071b\3\2"+
		"\2\2\u010a\u071e\3\2\2\2\u010c\u072a\3\2\2\2\u010e\u0733\3\2\2\2\u0110"+
		"\u0735\3\2\2\2\u0112\u0740\3\2\2\2\u0114\u074d\3\2\2\2\u0116\u075e\3\2"+
		"\2\2\u0118\u0761\3\2\2\2\u011a\u0769\3\2\2\2\u011c\u076e\3\2\2\2\u011e"+
		"\u0778\3\2\2\2\u0120\u077a\3\2\2\2\u0122\u078a\3\2\2\2\u0124\u078c\3\2"+
		"\2\2\u0126\u078e\3\2\2\2\u0128\u07a0\3\2\2\2\u012a\u07a2\3\2\2\2\u012c"+
		"\u07b0\3\2\2\2\u012e\u07b2\3\2\2\2\u0130\u07c3\3\2\2\2\u0132\u07c5\3\2"+
		"\2\2\u0134\u07cd\3\2\2\2\u0136\u07e0\3\2\2\2\u0138\u07e5\3\2\2\2\u013a"+
		"\u07ee\3\2\2\2\u013c\u07f5\3\2\2\2\u013e\u07f7\3\2\2\2\u0140\u07f9\3\2"+
		"\2\2\u0142\u0801\3\2\2\2\u0144\u0803\3\2\2\2\u0146\u080d\3\2\2\2\u0148"+
		"\u080f\3\2\2\2\u014a\u0817\3\2\2\2\u014c\u081e\3\2\2\2\u014e\u0820\3\2"+
		"\2\2\u0150\u0830\3\2\2\2\u0152\u0835\3\2\2\2\u0154\u0846\3\2\2\2\u0156"+
		"\u085c\3\2\2\2\u0158\u0860\3\2\2\2\u015a\u0862\3\2\2\2\u015c\u0868\3\2"+
		"\2\2\u015e\u086a\3\2\2\2\u0160\u086d\3\2\2\2\u0162\u0879\3\2\2\2\u0164"+
		"\u087b\3\2\2\2\u0166\u0881\3\2\2\2\u0168\u08ef\3\2\2\2\u016a\u08f1\3\2"+
		"\2\2\u016c\u08fe\3\2\2\2\u016e\u0906\3\2\2\2\u0170\u0909\3\2\2\2\u0172"+
		"\u0910\3\2\2\2\u0174\u091b\3\2\2\2\u0176\u0924\3\2\2\2\u0178\u0937\3\2"+
		"\2\2\u017a\u0945\3\2\2\2\u017c\u0949\3\2\2\2\u017e\u094e\3\2\2\2\u0180"+
		"\u0956\3\2\2\2\u0182\u0958\3\2\2\2\u0184\u095c\3\2\2\2\u0186\u0964\3\2"+
		"\2\2\u0188\u0966\3\2\2\2\u018a\u0975\3\2\2\2\u018c\u09e4\3\2\2\2\u018e"+
		"\u09ef\3\2\2\2\u0190\u0a00\3\2\2\2\u0192\u0a02\3\2\2\2\u0194\u0a08\3\2"+
		"\2\2\u0196\u0a26\3\2\2\2\u0198\u0a2a\3\2\2\2\u019a\u0a2d\3\2\2\2\u019c"+
		"\u0a34\3\2\2\2\u019e\u0a39\3\2\2\2\u01a0\u0a41\3\2\2\2\u01a2\u0a47\3\2"+
		"\2\2\u01a4\u0a49\3\2\2\2\u01a6\u01a8\5\4\3\2\u01a7\u01a6\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01ac\3\2\2\2\u01a9\u01ab\5\6\4\2\u01aa\u01a9\3\2"+
		"\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b2\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\5\b\5\2\u01b0\u01af\3\2"+
		"\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\2\2\3\u01b6\3\3\2\2\2"+
		"\u01b7\u01b9\5l\67\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01be\7)\2\2\u01be\u01bf\5h\65\2\u01bf\u01c0\7U\2\2\u01c0\5\3\2\2\2\u01c1"+
		"\u01c3\7 \2\2\u01c2\u01c4\7/\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2"+
		"\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\5h\65\2\u01c6\u01c7\7W\2\2\u01c7\u01c9"+
		"\7i\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cb\7U\2\2\u01cb\7\3\2\2\2\u01cc\u01ce\5\f\7\2\u01cd\u01cc\3\2\2\2"+
		"\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01ea\5\20\t\2\u01d3\u01d5\5\f\7\2"+
		"\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01ea\5\30\r\2"+
		"\u01da\u01dc\5\f\7\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01ea\5 \21\2\u01e1\u01e3\5\f\7\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2"+
		"\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e7\u01ea\5x=\2\u01e8\u01ea\7U\2\2\u01e9\u01cf\3\2\2"+
		"\2\u01e9\u01d6\3\2\2\2\u01e9\u01dd\3\2\2\2\u01e9\u01e4\3\2\2\2\u01e9\u01e8"+
		"\3\2\2\2\u01ea\t\3\2\2\2\u01eb\u01ee\5\f\7\2\u01ec\u01ee\t\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\13\3\2\2\2\u01ef\u01f2\5l\67"+
		"\2\u01f0\u01f2\t\3\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\r"+
		"\3\2\2\2\u01f3\u01f6\7\30\2\2\u01f4\u01f6\5l\67\2\u01f5\u01f3\3\2\2\2"+
		"\u01f5\u01f4\3\2\2\2\u01f6\17\3\2\2\2\u01f7\u01f8\7\17\2\2\u01f8\u01fa"+
		"\7C\2\2\u01f9\u01fb\5\22\n\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fd\7\27\2\2\u01fd\u01ff\5P)\2\u01fe\u01fc\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u0201\7\37\2\2\u0201"+
		"\u0203\5\"\22\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3"+
		"\2\2\2\u0204\u0205\5$\23\2\u0205\21\3\2\2\2\u0206\u0207\7Z\2\2\u0207\u020c"+
		"\5\24\13\2\u0208\u0209\7V\2\2\u0209\u020b\5\24\13\2\u020a\u0208\3\2\2"+
		"\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f"+
		"\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7Y\2\2\u0210\23\3\2\2\2\u0211"+
		"\u0214\7C\2\2\u0212\u0213\7\27\2\2\u0213\u0215\5\26\f\2\u0214\u0212\3"+
		"\2\2\2\u0214\u0215\3\2\2\2\u0215\25\3\2\2\2\u0216\u021b\5P)\2\u0217\u0218"+
		"\7k\2\2\u0218\u021a\5P)\2\u0219\u0217\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\27\3\2\2\2\u021d\u021b\3\2\2"+
		"\2\u021e\u021f\7\26\2\2\u021f\u0222\7C\2\2\u0220\u0221\7\37\2\2\u0221"+
		"\u0223\5\"\22\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3"+
		"\2\2\2\u0224\u0226\7Q\2\2\u0225\u0227\5\32\16\2\u0226\u0225\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u022a\7V\2\2\u0229\u0228\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u022d\5\36\20\2\u022c"+
		"\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7R"+
		"\2\2\u022f\31\3\2\2\2\u0230\u0235\5\34\17\2\u0231\u0232\7V\2\2\u0232\u0234"+
		"\5\34\17\2\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2"+
		"\u0235\u0236\3\2\2\2\u0236\33\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a"+
		"\5l\67\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0240\7C"+
		"\2\2\u023f\u0241\5\u00caf\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0244\5$\23\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\35\3\2\2\2\u0245\u0249\7U\2\2\u0246\u0248\5(\25\2\u0247\u0246"+
		"\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\37\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7#\2\2\u024d\u024f\7C\2\2"+
		"\u024e\u0250\5\22\n\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0253"+
		"\3\2\2\2\u0251\u0252\7\27\2\2\u0252\u0254\5\"\22\2\u0253\u0251\3\2\2\2"+
		"\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\5&\24\2\u0256!\3"+
		"\2\2\2\u0257\u025c\5P)\2\u0258\u0259\7V\2\2\u0259\u025b\5P)\2\u025a\u0258"+
		"\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"#\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0263\7Q\2\2\u0260\u0262\5(\25\2\u0261"+
		"\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7R\2\2\u0267"+
		"%\3\2\2\2\u0268\u026c\7Q\2\2\u0269\u026b\5:\36\2\u026a\u0269\3\2\2\2\u026b"+
		"\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2"+
		"\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7R\2\2\u0270\'\3\2\2\2\u0271\u027e"+
		"\7U\2\2\u0272\u0274\7/\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u027e\5*\26\2\u0276\u0278\5\n\6\2\u0277\u0276\3\2"+
		"\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027e\5,\27\2\u027d\u0271\3\2"+
		"\2\2\u027d\u0273\3\2\2\2\u027d\u0279\3\2\2\2\u027e)\3\2\2\2\u027f\u0280"+
		"\5\u0084C\2\u0280+\3\2\2\2\u0281\u028b\5.\30\2\u0282\u028b\5\60\31\2\u0283"+
		"\u028b\5\66\34\2\u0284\u028b\5\62\32\2\u0285\u028b\5\64\33\2\u0286\u028b"+
		"\5 \21\2\u0287\u028b\5x=\2\u0288\u028b\5\20\t\2\u0289\u028b\5\30\r\2\u028a"+
		"\u0281\3\2\2\2\u028a\u0282\3\2\2\2\u028a\u0283\3\2\2\2\u028a\u0284\3\2"+
		"\2\2\u028a\u0285\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0287\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028b-\3\2\2\2\u028c\u028f\5P)\2\u028d"+
		"\u028f\7:\2\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u0291\7C\2\2\u0291\u0296\5\\/\2\u0292\u0293\7S\2\2\u0293\u0295"+
		"\7T\2\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u029b\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\7\66"+
		"\2\2\u029a\u029c\5Z.\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029f"+
		"\3\2\2\2\u029d\u02a0\5d\63\2\u029e\u02a0\7U\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u029e\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u02a3\5\u00ccg\2\u02a2\u02a1"+
		"\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3/\3\2\2\2\u02a4\u02a5\5\22\n\2\u02a5"+
		"\u02a6\5.\30\2\u02a6\61\3\2\2\2\u02a7\u02a8\7C\2\2\u02a8\u02ab\5\\/\2"+
		"\u02a9\u02aa\7\66\2\2\u02aa\u02ac\5Z.\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\5f\64\2\u02ae\63\3\2\2\2\u02af"+
		"\u02b0\5\22\n\2\u02b0\u02b1\5\62\32\2\u02b1\65\3\2\2\2\u02b2\u02b3\5P"+
		")\2\u02b3\u02b8\58\35\2\u02b4\u02b5\7V\2\2\u02b5\u02b7\58\35\2\u02b6\u02b4"+
		"\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02bb\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\7U\2\2\u02bc\67\3\2\2\2"+
		"\u02bd\u02be\5\u00d0i\2\u02be\u02bf\7X\2\2\u02bf\u02c0\5F$\2\u02c0\u02c3"+
		"\3\2\2\2\u02c1\u02c3\5\u00d0i\2\u02c2\u02bd\3\2\2\2\u02c2\u02c1\3\2\2"+
		"\2\u02c39\3\2\2\2\u02c4\u02cd\7U\2\2\u02c5\u02c7\5\n\6\2\u02c6\u02c5\3"+
		"\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cd\5,\27\2\u02cc\u02c4\3\2"+
		"\2\2\u02cc\u02c8\3\2\2\2\u02cd;\3\2\2\2\u02ce\u02cf\5D#\2\u02cf\u02d0"+
		"\7X\2\2\u02d0\u02d1\5F$\2\u02d1=\3\2\2\2\u02d2\u02d3\5@!\2\u02d3\u02d4"+
		"\7X\2\2\u02d4\u02d5\5F$\2\u02d5\u02d8\3\2\2\2\u02d6\u02d8\5B\"\2\u02d7"+
		"\u02d2\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8?\3\2\2\2\u02d9\u02da\5\u00d0"+
		"i\2\u02daA\3\2\2\2\u02db\u02dc\5\u00d0i\2\u02dcC\3\2\2\2\u02dd\u02e2\5"+
		"\u00d2j\2\u02de\u02df\7S\2\2\u02df\u02e1\7T\2\2\u02e0\u02de\3\2\2\2\u02e1"+
		"\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3E\3\2\2\2"+
		"\u02e4\u02e2\3\2\2\2\u02e5\u02e8\5H%\2\u02e6\u02e8\5\u00aeX\2\u02e7\u02e5"+
		"\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8G\3\2\2\2\u02e9\u02f5\7Q\2\2\u02ea\u02ef"+
		"\5F$\2\u02eb\u02ec\7V\2\2\u02ec\u02ee\5F$\2\u02ed\u02eb\3\2\2\2\u02ee"+
		"\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f3\3\2"+
		"\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f4\7V\2\2\u02f3\u02f2\3\2\2\2\u02f3"+
		"\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02ea\3\2\2\2\u02f5\u02f6\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\7R\2\2\u02f8I\3\2\2\2\u02f9\u02fa"+
		"\5h\65\2\u02faK\3\2\2\2\u02fb\u02fc\7C\2\2\u02fcM\3\2\2\2\u02fd\u02fe"+
		"\5h\65\2\u02feO\3\2\2\2\u02ff\u0304\5R*\2\u0300\u0301\7S\2\2\u0301\u0303"+
		"\7T\2\2\u0302\u0300\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u0310\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u030c\5T"+
		"+\2\u0308\u0309\7S\2\2\u0309\u030b\7T\2\2\u030a\u0308\3\2\2\2\u030b\u030e"+
		"\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0310\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030f\u02ff\3\2\2\2\u030f\u0307\3\2\2\2\u0310Q\3\2\2\2"+
		"\u0311\u0313\7C\2\2\u0312\u0314\5V,\2\u0313\u0312\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314\u031c\3\2\2\2\u0315\u0316\7W\2\2\u0316\u0318\7C\2\2\u0317"+
		"\u0319\5V,\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2"+
		"\2\u031a\u0315\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d"+
		"\3\2\2\2\u031dS\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\t\4\2\2\u0320"+
		"U\3\2\2\2\u0321\u0322\7Z\2\2\u0322\u0327\5X-\2\u0323\u0324\7V\2\2\u0324"+
		"\u0326\5X-\2\u0325\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2"+
		"\2\u0327\u0328\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b"+
		"\7Y\2\2\u032bW\3\2\2\2\u032c\u0333\5P)\2\u032d\u0330\7]\2\2\u032e\u032f"+
		"\t\5\2\2\u032f\u0331\5P)\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0333\3\2\2\2\u0332\u032c\3\2\2\2\u0332\u032d\3\2\2\2\u0333Y\3\2\2\2"+
		"\u0334\u0339\5h\65\2\u0335\u0336\7V\2\2\u0336\u0338\5h\65\2\u0337\u0335"+
		"\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"[\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033e\7O\2\2\u033d\u033f\5^\60\2\u033e"+
		"\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\7P"+
		"\2\2\u0341]\3\2\2\2\u0342\u0347\5`\61\2\u0343\u0344\7V\2\2\u0344\u0346"+
		"\5`\61\2\u0345\u0343\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u034c\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034b\7V"+
		"\2\2\u034b\u034d\5b\62\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u0350\3\2\2\2\u034e\u0350\5b\62\2\u034f\u0342\3\2\2\2\u034f\u034e\3\2"+
		"\2\2\u0350_\3\2\2\2\u0351\u0353\5\16\b\2\u0352\u0351\3\2\2\2\u0353\u0356"+
		"\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356"+
		"\u0354\3\2\2\2\u0357\u0358\5P)\2\u0358\u0359\5@!\2\u0359a\3\2\2\2\u035a"+
		"\u035c\5\16\b\2\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3"+
		"\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2\2\2\u0360"+
		"\u0361\5P)\2\u0361\u0362\7{\2\2\u0362\u0363\5@!\2\u0363c\3\2\2\2\u0364"+
		"\u0365\5\u0084C\2\u0365e\3\2\2\2\u0366\u0367\5\u0084C\2\u0367g\3\2\2\2"+
		"\u0368\u036d\5\u00d2j\2\u0369\u036a\7W\2\2\u036a\u036c\5\u00d2j\2\u036b"+
		"\u0369\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2"+
		"\2\2\u036ei\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0371\t\6\2\2\u0371k\3\2"+
		"\2\2\u0372\u0373\7z\2\2\u0373\u037a\5n8\2\u0374\u0377\7O\2\2\u0375\u0378"+
		"\5p9\2\u0376\u0378\5t;\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\7P\2\2\u037a\u0374\3\2"+
		"\2\2\u037a\u037b\3\2\2\2\u037bm\3\2\2\2\u037c\u037d\5h\65\2\u037do\3\2"+
		"\2\2\u037e\u0383\5r:\2\u037f\u0380\7V\2\2\u0380\u0382\5r:\2\u0381\u037f"+
		"\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"q\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u0387\7C\2\2\u0387\u0388\7X\2\2\u0388"+
		"\u0389\5t;\2\u0389s\3\2\2\2\u038a\u038e\5\u00aeX\2\u038b\u038e\5l\67\2"+
		"\u038c\u038e\5v<\2\u038d\u038a\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038c"+
		"\3\2\2\2\u038eu\3\2\2\2\u038f\u0398\7Q\2\2\u0390\u0395\5t;\2\u0391\u0392"+
		"\7V\2\2\u0392\u0394\5t;\2\u0393\u0391\3\2\2\2\u0394\u0397\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2"+
		"\2\2\u0398\u0390\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a"+
		"\u039c\7V\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2"+
		"\2\2\u039d\u039e\7R\2\2\u039ew\3\2\2\2\u039f\u03a0\7z\2\2\u03a0\u03a1"+
		"\7#\2\2\u03a1\u03a2\7C\2\2\u03a2\u03a3\5z>\2\u03a3y\3\2\2\2\u03a4\u03a8"+
		"\7Q\2\2\u03a5\u03a7\5|?\2\u03a6\u03a5\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8"+
		"\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a8\3\2"+
		"\2\2\u03ab\u03ac\7R\2\2\u03ac{\3\2\2\2\u03ad\u03cf\7U\2\2\u03ae\u03b0"+
		"\5\n\6\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03cc\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b5\5P"+
		")\2\u03b5\u03b6\5~@\2\u03b6\u03b7\7U\2\2\u03b7\u03cd\3\2\2\2\u03b8\u03b9"+
		"\5P)\2\u03b9\u03ba\5\u0080A\2\u03ba\u03bb\7U\2\2\u03bb\u03cd\3\2\2\2\u03bc"+
		"\u03be\5\20\t\2\u03bd\u03bf\7U\2\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2"+
		"\2\2\u03bf\u03cd\3\2\2\2\u03c0\u03c2\5 \21\2\u03c1\u03c3\7U\2\2\u03c2"+
		"\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03cd\3\2\2\2\u03c4\u03c6\5\30"+
		"\r\2\u03c5\u03c7\7U\2\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"\u03cd\3\2\2\2\u03c8\u03ca\5x=\2\u03c9\u03cb\7U\2\2\u03ca\u03c9\3\2\2"+
		"\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03b4\3\2\2\2\u03cc\u03b8"+
		"\3\2\2\2\u03cc\u03bc\3\2\2\2\u03cc\u03c0\3\2\2\2\u03cc\u03c4\3\2\2\2\u03cc"+
		"\u03c8\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03ad\3\2\2\2\u03ce\u03b1\3\2"+
		"\2\2\u03cf}\3\2\2\2\u03d0\u03d1\7C\2\2\u03d1\u03d2\7O\2\2\u03d2\u03d4"+
		"\7P\2\2\u03d3\u03d5\5\u0082B\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2"+
		"\u03d5\177\3\2\2\2\u03d6\u03db\5<\37\2\u03d7\u03d8\7V\2\2\u03d8\u03da"+
		"\5<\37\2\u03d9\u03d7\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u0081\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\7\22"+
		"\2\2\u03df\u03e0\5t;\2\u03e0\u0083\3\2\2\2\u03e1\u03e5\7Q\2\2\u03e2\u03e4"+
		"\5\u0086D\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2"+
		"\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03e9"+
		"\7R\2\2\u03e9\u0085\3\2\2\2\u03ea\u03eb\5\u0088E\2\u03eb\u03ec\7U\2\2"+
		"\u03ec\u03f0\3\2\2\2\u03ed\u03f0\5\b\5\2\u03ee\u03f0\5\u008aF\2\u03ef"+
		"\u03ea\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0\u0087\3\2"+
		"\2\2\u03f1\u03f3\5\16\b\2\u03f2\u03f1\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2"+
		"\2\2\u03f7\u03f8\5P)\2\u03f8\u03fd\5> \2\u03f9\u03fa\7V\2\2\u03fa\u03fc"+
		"\5> \2\u03fb\u03f9\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u0089\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u0486\5\u0084"+
		"C\2\u0401\u0402\7\b\2\2\u0402\u0405\5\u00aeX\2\u0403\u0404\7^\2\2\u0404"+
		"\u0406\5\u00aeX\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407"+
		"\3\2\2\2\u0407\u0408\7U\2\2\u0408\u0486\3\2\2\2\u0409\u040a\7\34\2\2\u040a"+
		"\u040b\5\u00a8U\2\u040b\u040e\5\u008aF\2\u040c\u040d\7\25\2\2\u040d\u040f"+
		"\5\u008aF\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0486\3\2\2"+
		"\2\u0410\u0411\7\33\2\2\u0411\u0412\7O\2\2\u0412\u0413\5\u00a0Q\2\u0413"+
		"\u0414\7P\2\2\u0414\u0415\5\u008aF\2\u0415\u0486\3\2\2\2\u0416\u0417\7"+
		"<\2\2\u0417\u0418\5\u00a8U\2\u0418\u0419\5\u008aF\2\u0419\u0486\3\2\2"+
		"\2\u041a\u041b\79\2\2\u041b\u041c\5\u00aeX\2\u041c\u041d\7U\2\2\u041d"+
		"\u0486\3\2\2\2\u041e\u041f\7$\2\2\u041f\u0420\5\u00aeX\2\u0420\u0421\7"+
		"U\2\2\u0421\u0486\3\2\2\2\u0422\u0423\7\23\2\2\u0423\u0424\5\u008aF\2"+
		"\u0424\u0425\7<\2\2\u0425\u0426\5\u00a8U\2\u0426\u0427\7U\2\2\u0427\u0486"+
		"\3\2\2\2\u0428\u0429\78\2\2\u0429\u0433\5\u0084C\2\u042a\u042c\5\u0090"+
		"I\2\u042b\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u0431\5\u0094K\2\u0430\u042f"+
		"\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0434\5\u0094K"+
		"\2\u0433\u042b\3\2\2\2\u0433\u0432\3\2\2\2\u0434\u0486\3\2\2\2\u0435\u0436"+
		"\78\2\2\u0436\u0437\5\u0096L\2\u0437\u043b\5\u0084C\2\u0438\u043a\5\u0090"+
		"I\2\u0439\u0438\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u0440\5\u0094"+
		"K\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0486\3\2\2\2\u0441"+
		"\u0442\7\62\2\2\u0442\u0443\5\u00a8U\2\u0443\u0447\7Q\2\2\u0444\u0446"+
		"\5\u009cO\2\u0445\u0444\3\2\2\2\u0446\u0449\3\2\2\2\u0447\u0445\3\2\2"+
		"\2\u0447\u0448\3\2\2\2\u0448\u044d\3\2\2\2\u0449\u0447\3\2\2\2\u044a\u044c"+
		"\5\u009eP\2\u044b\u044a\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2"+
		"\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0451"+
		"\7R\2\2\u0451\u0486\3\2\2\2\u0452\u0453\7\63\2\2\u0453\u0454\5\u00a8U"+
		"\2\u0454\u0455\5\u0084C\2\u0455\u0486\3\2\2\2\u0456\u0458\7-\2\2\u0457"+
		"\u0459\5\u00aeX\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a"+
		"\3\2\2\2\u045a\u0486\7U\2\2\u045b\u045c\7\65\2\2\u045c\u045d\5\u00aeX"+
		"\2\u045d\u045e\7U\2\2\u045e\u0486\3\2\2\2\u045f\u0461\7\n\2\2\u0460\u0462"+
		"\7C\2\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0486\7U\2\2\u0464\u0466\7\21\2\2\u0465\u0467\7C\2\2\u0466\u0465\3\2"+
		"\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0486\7U\2\2\u0469"+
		"\u0486\7U\2\2\u046a\u046b\5\u008eH\2\u046b\u046c\7X\2\2\u046c\u046d\5"+
		"\u00aeX\2\u046d\u046e\7U\2\2\u046e\u0486\3\2\2\2\u046f\u0470\5\u00aeX"+
		"\2\u0470\u0472\7O\2\2\u0471\u0473\5\u00aaV\2\u0472\u0471\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\7P\2\2\u0475\u0476\7U\2"+
		"\2\u0476\u0486\3\2\2\2\u0477\u0478\5\u00aeX\2\u0478\u0479\7W\2\2\u0479"+
		"\u047b\7(\2\2\u047a\u047c\5\u00c0a\2\u047b\u047a\3\2\2\2\u047b\u047c\3"+
		"\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\5\u00b8]\2\u047e\u0486\3\2\2\2"+
		"\u047f\u0480\7C\2\2\u0480\u0481\7^\2\2\u0481\u0486\5\u008aF\2\u0482\u0486"+
		"\5\u00ccg\2\u0483\u0486\5\u00ceh\2\u0484\u0486\5\u008cG\2\u0485\u0400"+
		"\3\2\2\2\u0485\u0401\3\2\2\2\u0485\u0409\3\2\2\2\u0485\u0410\3\2\2\2\u0485"+
		"\u0416\3\2\2\2\u0485\u041a\3\2\2\2\u0485\u041e\3\2\2\2\u0485\u0422\3\2"+
		"\2\2\u0485\u0428\3\2\2\2\u0485\u0435\3\2\2\2\u0485\u0441\3\2\2\2\u0485"+
		"\u0452\3\2\2\2\u0485\u0456\3\2\2\2\u0485\u045b\3\2\2\2\u0485\u045f\3\2"+
		"\2\2\u0485\u0464\3\2\2\2\u0485\u0469\3\2\2\2\u0485\u046a\3\2\2\2\u0485"+
		"\u046f\3\2\2\2\u0485\u0477\3\2\2\2\u0485\u047f\3\2\2\2\u0485\u0482\3\2"+
		"\2\2\u0485\u0483\3\2\2\2\u0485\u0484\3\2\2\2\u0486\u008b\3\2\2\2\u0487"+
		"\u0488\5\u00d2j\2\u0488\u0489\5\u00aeX\2\u0489\u048a\7U\2\2\u048a\u008d"+
		"\3\2\2\2\u048b\u048c\5\u00aeX\2\u048c\u048d\7S\2\2\u048d\u048e\5\u00ae"+
		"X\2\u048e\u048f\7T\2\2\u048f\u0492\3\2\2\2\u0490\u0492\5\u00d2j\2\u0491"+
		"\u048b\3\2\2\2\u0491\u0490\3\2\2\2\u0492\u008f\3\2\2\2\u0493\u0494\7\r"+
		"\2\2\u0494\u0498\7O\2\2\u0495\u0497\5\16\b\2\u0496\u0495\3\2\2\2\u0497"+
		"\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2"+
		"\2\2\u049a\u0498\3\2\2\2\u049b\u049c\5\u0092J\2\u049c\u049d\5\u00d2j\2"+
		"\u049d\u049e\7P\2\2\u049e\u049f\5\u0084C\2\u049f\u0091\3\2\2\2\u04a0\u04a5"+
		"\5h\65\2\u04a1\u04a2\7l\2\2\u04a2\u04a4\5h\65\2\u04a3\u04a1\3\2\2\2\u04a4"+
		"\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u0093\3\2"+
		"\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04a9\7\31\2\2\u04a9\u04aa\5\u0084C\2\u04aa"+
		"\u0095\3\2\2\2\u04ab\u04ac\7O\2\2\u04ac\u04ae\5\u0098M\2\u04ad\u04af\7"+
		"U\2\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04b1\7P\2\2\u04b1\u0097\3\2\2\2\u04b2\u04b7\5\u009aN\2\u04b3\u04b4\7"+
		"U\2\2\u04b4\u04b6\5\u009aN\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7"+
		"\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u0099\3\2\2\2\u04b9\u04b7\3\2"+
		"\2\2\u04ba\u04bc\5\16\b\2\u04bb\u04ba\3\2\2\2\u04bc\u04bf\3\2\2\2\u04bd"+
		"\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04bd\3\2"+
		"\2\2\u04c0\u04c1\5R*\2\u04c1\u04c2\5@!\2\u04c2\u04c3\7X\2\2\u04c3\u04c4"+
		"\5\u00aeX\2\u04c4\u009b\3\2\2\2\u04c5\u04c7\5\u009eP\2\u04c6\u04c5\3\2"+
		"\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04cb\3\2\2\2\u04ca\u04cc\5\u0086D\2\u04cb\u04ca\3\2\2\2\u04cc\u04cd"+
		"\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u009d\3\2\2\2\u04cf"+
		"\u04d0\7\f\2\2\u04d0\u04d1\5\u00acW\2\u04d1\u04d2\7^\2\2\u04d2\u04da\3"+
		"\2\2\2\u04d3\u04d4\7\f\2\2\u04d4\u04d5\5L\'\2\u04d5\u04d6\7^\2\2\u04d6"+
		"\u04da\3\2\2\2\u04d7\u04d8\7\22\2\2\u04d8\u04da\7^\2\2\u04d9\u04cf\3\2"+
		"\2\2\u04d9\u04d3\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da\u009f\3\2\2\2\u04db"+
		"\u04e8\5\u00a4S\2\u04dc\u04de\5\u00a2R\2\u04dd\u04dc\3\2\2\2\u04dd\u04de"+
		"\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e1\7U\2\2\u04e0\u04e2\5\u00aeX\2"+
		"\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5"+
		"\7U\2\2\u04e4\u04e6\5\u00a6T\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2"+
		"\u04e6\u04e8\3\2\2\2\u04e7\u04db\3\2\2\2\u04e7\u04dd\3\2\2\2\u04e8\u00a1"+
		"\3\2\2\2\u04e9\u04ec\5\u0088E\2\u04ea\u04ec\5\u00aaV\2\u04eb\u04e9\3\2"+
		"\2\2\u04eb\u04ea\3\2\2\2\u04ec\u00a3\3\2\2\2\u04ed\u04ef\5\16\b\2\u04ee"+
		"\u04ed\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1\3\2"+
		"\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f4\5P)\2\u04f4\u04f5"+
		"\5\u00d2j\2\u04f5\u04f6\7^\2\2\u04f6\u04f7\5\u00aeX\2\u04f7\u00a5\3\2"+
		"\2\2\u04f8\u04f9\5\u00aaV\2\u04f9\u00a7\3\2\2\2\u04fa\u04fb\7O\2\2\u04fb"+
		"\u04fc\5\u00aeX\2\u04fc\u04fd\7P\2\2\u04fd\u00a9\3\2\2\2\u04fe\u0503\5"+
		"\u00aeX\2\u04ff\u0500\7V\2\2\u0500\u0502\5\u00aeX\2\u0501\u04ff\3\2\2"+
		"\2\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u00ab"+
		"\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u0507\5\u00aeX\2\u0507\u00ad\3\2\2"+
		"\2\u0508\u0509\5\u00b0Y\2\u0509\u00af\3\2\2\2\u050a\u050b\bY\1\2\u050b"+
		"\u052a\5\u00b2Z\2\u050c\u050d\7(\2\2\u050d\u052a\5\u00b4[\2\u050e\u050f"+
		"\7O\2\2\u050f\u0510\5P)\2\u0510\u0511\7P\2\2\u0511\u0512\5\u00b0Y\23\u0512"+
		"\u052a\3\2\2\2\u0513\u0514\t\7\2\2\u0514\u052a\5\u00b0Y\22\u0515\u0516"+
		"\7\\\2\2\u0516\u052a\5\u00b0Y\21\u0517\u0518\7[\2\2\u0518\u052a\5\u00b0"+
		"Y\20\u0519\u051a\t\b\2\2\u051a\u051b\7O\2\2\u051b\u0520\5\u0088E\2\u051c"+
		"\u051d\7U\2\2\u051d\u051f\5\u0088E\2\u051e\u051c\3\2\2\2\u051f\u0522\3"+
		"\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0523\3\2\2\2\u0522"+
		"\u0520\3\2\2\2\u0523\u0524\7^\2\2\u0524\u0525\5\u00b0Y\2\u0525\u0526\7"+
		"^\2\2\u0526\u0527\5\u00b0Y\2\u0527\u0528\7P\2\2\u0528\u052a\3\2\2\2\u0529"+
		"\u050a\3\2\2\2\u0529\u050c\3\2\2\2\u0529\u050e\3\2\2\2\u0529\u0513\3\2"+
		"\2\2\u0529\u0515\3\2\2\2\u0529\u0517\3\2\2\2\u0529\u0519\3\2\2\2\u052a"+
		"\u0582\3\2\2\2\u052b\u052c\f\17\2\2\u052c\u052d\t\t\2\2\u052d\u0581\5"+
		"\u00b0Y\20\u052e\u052f\f\16\2\2\u052f\u0530\t\7\2\2\u0530\u0581\5\u00b0"+
		"Y\17\u0531\u0539\f\r\2\2\u0532\u0533\7Z\2\2\u0533\u053a\7Z\2\2\u0534\u0535"+
		"\7Y\2\2\u0535\u0536\7Y\2\2\u0536\u053a\7Y\2\2\u0537\u0538\7Y\2\2\u0538"+
		"\u053a\7Y\2\2\u0539\u0532\3\2\2\2\u0539\u0534\3\2\2\2\u0539\u0537\3\2"+
		"\2\2\u053a\u053b\3\2\2\2\u053b\u0581\5\u00b0Y\16\u053c\u053d\f\f\2\2\u053d"+
		"\u053e\t\n\2\2\u053e\u0581\5\u00b0Y\r\u053f\u0540\f\n\2\2\u0540\u0541"+
		"\7k\2\2\u0541\u0581\5\u00b0Y\13\u0542\u0543\f\t\2\2\u0543\u0544\7m\2\2"+
		"\u0544\u0581\5\u00b0Y\n\u0545\u0546\f\b\2\2\u0546\u0547\7l\2\2\u0547\u0581"+
		"\5\u00b0Y\t\u0548\u0549\f\7\2\2\u0549\u054a\7c\2\2\u054a\u0581\5\u00b0"+
		"Y\b\u054b\u054c\f\6\2\2\u054c\u054d\7d\2\2\u054d\u0581\5\u00b0Y\7\u054e"+
		"\u054f\f\5\2\2\u054f\u0550\7]\2\2\u0550\u0551\5\u00b0Y\2\u0551\u0552\7"+
		"^\2\2\u0552\u0553\5\u00b0Y\6\u0553\u0581\3\2\2\2\u0554\u0555\f\4\2\2\u0555"+
		"\u0556\t\13\2\2\u0556\u0581\5\u00b0Y\5\u0557\u0558\f\33\2\2\u0558\u0559"+
		"\7W\2\2\u0559\u0581\5\u00d2j\2\u055a\u055b\f\32\2\2\u055b\u055c\7W\2\2"+
		"\u055c\u0581\7\64\2\2\u055d\u055e\f\31\2\2\u055e\u055f\7W\2\2\u055f\u0561"+
		"\7(\2\2\u0560\u0562\5\u00c0a\2\u0561\u0560\3\2\2\2\u0561\u0562\3\2\2\2"+
		"\u0562\u0563\3\2\2\2\u0563\u0581\5\u00b8]\2\u0564\u0565\f\30\2\2\u0565"+
		"\u0566\7W\2\2\u0566\u0567\7\61\2\2\u0567\u0581\5\u00c6d\2\u0568\u0569"+
		"\f\27\2\2\u0569\u056a\7W\2\2\u056a\u0581\5\u00be`\2\u056b\u056c\f\26\2"+
		"\2\u056c\u056d\7S\2\2\u056d\u056e\5\u00b0Y\2\u056e\u056f\7T\2\2\u056f"+
		"\u0581\3\2\2\2\u0570\u0571\f\25\2\2\u0571\u057a\7O\2\2\u0572\u0577\5\u00b0"+
		"Y\2\u0573\u0574\7V\2\2\u0574\u0576\5\u00b0Y\2\u0575\u0573\3\2\2\2\u0576"+
		"\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057b\3\2"+
		"\2\2\u0579\u0577\3\2\2\2\u057a\u0572\3\2\2\2\u057a\u057b\3\2\2\2\u057b"+
		"\u057c\3\2\2\2\u057c\u0581\7P\2\2\u057d\u057e\f\13\2\2\u057e\u057f\7!"+
		"\2\2\u057f\u0581\5P)\2\u0580\u052b\3\2\2\2\u0580\u052e\3\2\2\2\u0580\u0531"+
		"\3\2\2\2\u0580\u053c\3\2\2\2\u0580\u053f\3\2\2\2\u0580\u0542\3\2\2\2\u0580"+
		"\u0545\3\2\2\2\u0580\u0548\3\2\2\2\u0580\u054b\3\2\2\2\u0580\u054e\3\2"+
		"\2\2\u0580\u0554\3\2\2\2\u0580\u0557\3\2\2\2\u0580\u055a\3\2\2\2\u0580"+
		"\u055d\3\2\2\2\u0580\u0564\3\2\2\2\u0580\u0568\3\2\2\2\u0580\u056b\3\2"+
		"\2\2\u0580\u0570\3\2\2\2\u0580\u057d\3\2\2\2\u0581\u0584\3\2\2\2\u0582"+
		"\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u00b1\3\2\2\2\u0584\u0582\3\2"+
		"\2\2\u0585\u0598\5\u00a8U\2\u0586\u0598\7\64\2\2\u0587\u0598\7\61\2\2"+
		"\u0588\u0598\5j\66\2\u0589\u0598\5\u00d2j\2\u058a\u058b\5P)\2\u058b\u058c"+
		"\7W\2\2\u058c\u058d\7\17\2\2\u058d\u0598\3\2\2\2\u058e\u058f\7:\2\2\u058f"+
		"\u0590\7W\2\2\u0590\u0598\7\17\2\2\u0591\u0595\5\u00c0a\2\u0592\u0596"+
		"\5\u00c8e\2\u0593\u0594\7\64\2\2\u0594\u0596\5\u00caf\2\u0595\u0592\3"+
		"\2\2\2\u0595\u0593\3\2\2\2\u0596\u0598\3\2\2\2\u0597\u0585\3\2\2\2\u0597"+
		"\u0586\3\2\2\2\u0597\u0587\3\2\2\2\u0597\u0588\3\2\2\2\u0597\u0589\3\2"+
		"\2\2\u0597\u058a\3\2\2\2\u0597\u058e\3\2\2\2\u0597\u0591\3\2\2\2\u0598"+
		"\u00b3\3\2\2\2\u0599\u059a\5\u00c0a\2\u059a\u059b\5\u00b6\\\2\u059b\u059c"+
		"\5\u00bc_\2\u059c\u05a3\3\2\2\2\u059d\u05a0\5\u00b6\\\2\u059e\u05a1\5"+
		"\u00ba^\2\u059f\u05a1\5\u00bc_\2\u05a0\u059e\3\2\2\2\u05a0\u059f\3\2\2"+
		"\2\u05a1\u05a3\3\2\2\2\u05a2\u0599\3\2\2\2\u05a2\u059d\3\2\2\2\u05a3\u00b5"+
		"\3\2\2\2\u05a4\u05a6\5\u00d2j\2\u05a5\u05a7\5\u00c2b\2\u05a6\u05a5\3\2"+
		"\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05af\3\2\2\2\u05a8\u05a9\7W\2\2\u05a9"+
		"\u05ab\5\u00d2j\2\u05aa\u05ac\5\u00c2b\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac"+
		"\3\2\2\2\u05ac\u05ae\3\2\2\2\u05ad\u05a8\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af"+
		"\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b4\3\2\2\2\u05b1\u05af\3\2"+
		"\2\2\u05b2\u05b4\5T+\2\u05b3\u05a4\3\2\2\2\u05b3\u05b2\3\2\2\2\u05b4\u00b7"+
		"\3\2\2\2\u05b5\u05b7\5\u00d2j\2\u05b6\u05b8\5\u00c4c\2\u05b7\u05b6\3\2"+
		"\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\5\u00bc_\2\u05ba"+
		"\u00b9\3\2\2\2\u05bb\u05d7\7S\2\2\u05bc\u05c1\7T\2\2\u05bd\u05be\7S\2"+
		"\2\u05be\u05c0\7T\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4"+
		"\u05d8\5H%\2\u05c5\u05c6\5\u00aeX\2\u05c6\u05cd\7T\2\2\u05c7\u05c8\7S"+
		"\2\2\u05c8\u05c9\5\u00aeX\2\u05c9\u05ca\7T\2\2\u05ca\u05cc\3\2\2\2\u05cb"+
		"\u05c7\3\2\2\2\u05cc\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2"+
		"\2\2\u05ce\u05d4\3\2\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d1\7S\2\2\u05d1"+
		"\u05d3\7T\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2"+
		"\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d8\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7"+
		"\u05bc\3\2\2\2\u05d7\u05c5\3\2\2\2\u05d8\u00bb\3\2\2\2\u05d9\u05db\5\u00ca"+
		"f\2\u05da\u05dc\5$\23\2\u05db\u05da\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc"+
		"\u00bd\3\2\2\2\u05dd\u05de\5\u00c0a\2\u05de\u05df\5\u00c8e\2\u05df\u00bf"+
		"\3\2\2\2\u05e0\u05e1\7Z\2\2\u05e1\u05e2\5\"\22\2\u05e2\u05e3\7Y\2\2\u05e3"+
		"\u00c1\3\2\2\2\u05e4\u05e5\7Z\2\2\u05e5\u05e8\7Y\2\2\u05e6\u05e8\5V,\2"+
		"\u05e7\u05e4\3\2\2\2\u05e7\u05e6\3\2\2\2\u05e8\u00c3\3\2\2\2\u05e9\u05ea"+
		"\7Z\2\2\u05ea\u05ed\7Y\2\2\u05eb\u05ed\5\u00c0a\2\u05ec\u05e9\3\2\2\2"+
		"\u05ec\u05eb\3\2\2\2\u05ed\u00c5\3\2\2\2\u05ee\u05f5\5\u00caf\2\u05ef"+
		"\u05f0\7W\2\2\u05f0\u05f2\5\u00d2j\2\u05f1\u05f3\5\u00caf\2\u05f2\u05f1"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f5\3\2\2\2\u05f4\u05ee\3\2\2\2\u05f4"+
		"\u05ef\3\2\2\2\u05f5\u00c7\3\2\2\2\u05f6\u05f7\7\61\2\2\u05f7\u05fc\5"+
		"\u00c6d\2\u05f8\u05f9\5\u00d2j\2\u05f9\u05fa\5\u00caf\2\u05fa\u05fc\3"+
		"\2\2\2\u05fb\u05f6\3\2\2\2\u05fb\u05f8\3\2\2\2\u05fc\u00c9\3\2\2\2\u05fd"+
		"\u05ff\7O\2\2\u05fe\u0600\5\u00aaV\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3"+
		"\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\7P\2\2\u0602\u00cb\3\2\2\2\u0603"+
		"\u0604\7&\2\2\u0604\u0605\5\u00aeX\2\u0605\u0606\7U\2\2\u0606\u00cd\3"+
		"\2\2\2\u0607\u0608\7\35\2\2\u0608\u0609\5\u00aeX\2\u0609\u060a\7U\2\2"+
		"\u060a\u00cf\3\2\2\2\u060b\u060c\5\u00d2j\2\u060c\u00d1\3\2\2\2\u060d"+
		"\u060e\5\u00d4k\2\u060e\u00d3\3\2\2\2\u060f\u0614\7C\2\2\u0610\u0614\7"+
		"E\2\2\u0611\u0614\7F\2\2\u0612\u0614\7G\2\2\u0613\u060f\3\2\2\2\u0613"+
		"\u0610\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0612\3\2\2\2\u0614\u00d5\3\2"+
		"\2\2\u0615\u0616\t\f\2\2\u0616\u00d7\3\2\2\2\u0617\u0619\5\u00dan\2\u0618"+
		"\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061d\3\2\2\2\u061a\u061c\5\u00dc"+
		"o\2\u061b\u061a\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d"+
		"\u061e\3\2\2\2\u061e\u0623\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0622\5\u00de"+
		"p\2\u0621\u0620\3\2\2\2\u0622\u0625\3\2\2\2\u0623\u0621\3\2\2\2\u0623"+
		"\u0624\3\2\2\2\u0624\u0626\3\2\2\2\u0625\u0623\3\2\2\2\u0626\u0627\7\2"+
		"\2\3\u0627\u00d9\3\2\2\2\u0628\u062a\5\u0144\u00a3\2\u0629\u0628\3\2\2"+
		"\2\u062a\u062d\3\2\2\2\u062b\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062e"+
		"\3\2\2\2\u062d\u062b\3\2\2\2\u062e\u062f\7)\2\2\u062f\u0630\5\u0140\u00a1"+
		"\2\u0630\u0631\7U\2\2\u0631\u00db\3\2\2\2\u0632\u0634\7 \2\2\u0633\u0635"+
		"\7/\2\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636"+
		"\u0639\5\u0140\u00a1\2\u0637\u0638\7W\2\2\u0638\u063a\7i\2\2\u0639\u0637"+
		"\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063c\7U\2\2\u063c"+
		"\u00dd\3\2\2\2\u063d\u063f\5\u00e2r\2\u063e\u063d\3\2\2\2\u063f\u0642"+
		"\3\2\2\2\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642"+
		"\u0640\3\2\2\2\u0643\u065b\5\u00e6t\2\u0644\u0646\5\u00e2r\2\u0645\u0644"+
		"\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u064a\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u065b\5\u00eex\2\u064b\u064d"+
		"\5\u00e2r\2\u064c\u064b\3\2\2\2\u064d\u0650\3\2\2\2\u064e\u064c\3\2\2"+
		"\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2\2\2\u0650\u064e\3\2\2\2\u0651\u065b"+
		"\5\u00f6|\2\u0652\u0654\5\u00e2r\2\u0653\u0652\3\2\2\2\u0654\u0657\3\2"+
		"\2\2\u0655\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0658\3\2\2\2\u0657"+
		"\u0655\3\2\2\2\u0658\u065b\5\u0150\u00a9\2\u0659\u065b\7U\2\2\u065a\u0640"+
		"\3\2\2\2\u065a\u0647\3\2\2\2\u065a\u064e\3\2\2\2\u065a\u0655\3\2\2\2\u065a"+
		"\u0659\3\2\2\2\u065b\u00df\3\2\2\2\u065c\u065f\5\u00e2r\2\u065d\u065f"+
		"\t\2\2\2\u065e\u065c\3\2\2\2\u065e\u065d\3\2\2\2\u065f\u00e1\3\2\2\2\u0660"+
		"\u0663\5\u0144\u00a3\2\u0661\u0663\t\r\2\2\u0662\u0660\3\2\2\2\u0662\u0661"+
		"\3\2\2\2\u0663\u00e3\3\2\2\2\u0664\u0667\7\30\2\2\u0665\u0667\5\u0144"+
		"\u00a3\2\u0666\u0664\3\2\2\2\u0666\u0665\3\2\2\2\u0667\u00e5\3\2\2\2\u0668"+
		"\u0669\7\17\2\2\u0669\u066b\7D\2\2\u066a\u066c\5\u00e8u\2\u066b\u066a"+
		"\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066e\7\27\2\2"+
		"\u066e\u0670\5\u0128\u0095\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670"+
		"\u0673\3\2\2\2\u0671\u0672\7\37\2\2\u0672\u0674\5\u00f8}\2\u0673\u0671"+
		"\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\5\u00fa~"+
		"\2\u0676\u00e7\3\2\2\2\u0677\u0678\7Z\2\2\u0678\u067d\5\u00eav\2\u0679"+
		"\u067a\7V\2\2\u067a\u067c\5\u00eav\2\u067b\u0679\3\2\2\2\u067c\u067f\3"+
		"\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f"+
		"\u067d\3\2\2\2\u0680\u0681\7Y\2\2\u0681\u00e9\3\2\2\2\u0682\u0685\7D\2"+
		"\2\u0683\u0684\7\27\2\2\u0684\u0686\5\u00ecw\2\u0685\u0683\3\2\2\2\u0685"+
		"\u0686\3\2\2\2\u0686\u00eb\3\2\2\2\u0687\u068c\5\u0128\u0095\2\u0688\u0689"+
		"\7k\2\2\u0689\u068b\5\u0128\u0095\2\u068a\u0688\3\2\2\2\u068b\u068e\3"+
		"\2\2\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u00ed\3\2\2\2\u068e"+
		"\u068c\3\2\2\2\u068f\u0690\7\26\2\2\u0690\u0693\7D\2\2\u0691\u0692\7\37"+
		"\2\2\u0692\u0694\5\u00f8}\2\u0693\u0691\3\2\2\2\u0693\u0694\3\2\2\2\u0694"+
		"\u0695\3\2\2\2\u0695\u0697\7Q\2\2\u0696\u0698\5\u00f0y\2\u0697\u0696\3"+
		"\2\2\2\u0697\u0698\3\2\2\2\u0698\u069a\3\2\2\2\u0699\u069b\7V\2\2\u069a"+
		"\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069d\3\2\2\2\u069c\u069e\5\u00f4"+
		"{\2\u069d\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u069f\3\2\2\2\u069f"+
		"\u06a0\7R\2\2\u06a0\u00ef\3\2\2\2\u06a1\u06a6\5\u00f2z\2\u06a2\u06a3\7"+
		"V\2\2\u06a3\u06a5\5\u00f2z\2\u06a4\u06a2\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6"+
		"\u06a4\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u00f1\3\2\2\2\u06a8\u06a6\3\2"+
		"\2\2\u06a9\u06ab\5\u0144\u00a3\2\u06aa\u06a9\3\2\2\2\u06ab\u06ae\3\2\2"+
		"\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06af\3\2\2\2\u06ae\u06ac"+
		"\3\2\2\2\u06af\u06b1\7D\2\2\u06b0\u06b2\5\u01a4\u00d3\2\u06b1\u06b0\3"+
		"\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4\3\2\2\2\u06b3\u06b5\5\u00fa~\2"+
		"\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u00f3\3\2\2\2\u06b6\u06ba"+
		"\7U\2\2\u06b7\u06b9\5\u00fe\u0080\2\u06b8\u06b7\3\2\2\2\u06b9\u06bc\3"+
		"\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u00f5\3\2\2\2\u06bc"+
		"\u06ba\3\2\2\2\u06bd\u06be\7#\2\2\u06be\u06c0\7D\2\2\u06bf\u06c1\5\u00e8"+
		"u\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2"+
		"\u06c3\7\27\2\2\u06c3\u06c5\5\u00f8}\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5"+
		"\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\5\u00fc\177\2\u06c7\u00f7\3\2"+
		"\2\2\u06c8\u06cd\5\u0128\u0095\2\u06c9\u06ca\7V\2\2\u06ca\u06cc\5\u0128"+
		"\u0095\2\u06cb\u06c9\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2\u06cd"+
		"\u06ce\3\2\2\2\u06ce\u00f9\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0\u06d4\7Q"+
		"\2\2\u06d1\u06d3\5\u00fe\u0080\2\u06d2\u06d1\3\2\2\2\u06d3\u06d6\3\2\2"+
		"\2\u06d4\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d7\3\2\2\2\u06d6\u06d4"+
		"\3\2\2\2\u06d7\u06d8\7R\2\2\u06d8\u00fb\3\2\2\2\u06d9\u06dd\7Q\2\2\u06da"+
		"\u06dc\5\u010c\u0087\2\u06db\u06da\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db"+
		"\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0"+
		"\u06e1\7R\2\2\u06e1\u00fd\3\2\2\2\u06e2\u06ef\7U\2\2\u06e3\u06e5\7/\2"+
		"\2\u06e4\u06e3\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06ef"+
		"\5\u0160\u00b1\2\u06e7\u06e9\5\u00e0q\2\u06e8\u06e7\3\2\2\2\u06e9\u06ec"+
		"\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2\2\2\u06ec"+
		"\u06ea\3\2\2\2\u06ed\u06ef\5\u0100\u0081\2\u06ee\u06e2\3\2\2\2\u06ee\u06e4"+
		"\3\2\2\2\u06ee\u06ea\3\2\2\2\u06ef\u00ff\3\2\2\2\u06f0\u06fa\5\u0102\u0082"+
		"\2\u06f1\u06fa\5\u0104\u0083\2\u06f2\u06fa\5\u010a\u0086\2\u06f3\u06fa"+
		"\5\u0106\u0084\2\u06f4\u06fa\5\u0108\u0085\2\u06f5\u06fa\5\u00f6|\2\u06f6"+
		"\u06fa\5\u0150\u00a9\2\u06f7\u06fa\5\u00e6t\2\u06f8\u06fa\5\u00eex\2\u06f9"+
		"\u06f0\3\2\2\2\u06f9\u06f1\3\2\2\2\u06f9\u06f2\3\2\2\2\u06f9\u06f3\3\2"+
		"\2\2\u06f9\u06f4\3\2\2\2\u06f9\u06f5\3\2\2\2\u06f9\u06f6\3\2\2\2\u06f9"+
		"\u06f7\3\2\2\2\u06f9\u06f8\3\2\2\2\u06fa\u0101\3\2\2\2\u06fb\u06fe\5\u0128"+
		"\u0095\2\u06fc\u06fe\7:\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fc\3\2\2\2\u06fe"+
		"\u06ff\3\2\2\2\u06ff\u0700\7D\2\2\u0700\u0705\5\u0134\u009b\2\u0701\u0702"+
		"\7S\2\2\u0702\u0704\7T\2\2\u0703\u0701\3\2\2\2\u0704\u0707\3\2\2\2\u0705"+
		"\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u070a\3\2\2\2\u0707\u0705\3\2"+
		"\2\2\u0708\u0709\7\66\2\2\u0709\u070b\5\u0132\u009a\2\u070a\u0708\3\2"+
		"\2\2\u070a\u070b\3\2\2\2\u070b\u070e\3\2\2\2\u070c\u070f\5\u013c\u009f"+
		"\2\u070d\u070f\7U\2\2\u070e\u070c\3\2\2\2\u070e\u070d\3\2\2\2\u070f\u0103"+
		"\3\2\2\2\u0710\u0711\5\u00e8u\2\u0711\u0712\5\u0102\u0082\2\u0712\u0105"+
		"\3\2\2\2\u0713\u0714\7D\2\2\u0714\u0717\5\u0134\u009b\2\u0715\u0716\7"+
		"\66\2\2\u0716\u0718\5\u0132\u009a\2\u0717\u0715\3\2\2\2\u0717\u0718\3"+
		"\2\2\2\u0718\u0719\3\2\2\2\u0719\u071a\5\u013e\u00a0\2\u071a\u0107\3\2"+
		"\2\2\u071b\u071c\5\u00e8u\2\u071c\u071d\5\u0106\u0084\2\u071d\u0109\3"+
		"\2\2\2\u071e\u071f\5\u0128\u0095\2\u071f\u0720\5\u0118\u008d\2\u0720\u0721"+
		"\7U\2\2\u0721\u010b\3\2\2\2\u0722\u0724\5\u00e0q\2\u0723\u0722\3\2\2\2"+
		"\u0724\u0727\3\2\2\2\u0725\u0723\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0728"+
		"\3\2\2\2\u0727\u0725\3\2\2\2\u0728\u072b\5\u010e\u0088\2\u0729\u072b\7"+
		"U\2\2\u072a\u0725\3\2\2\2\u072a\u0729\3\2\2\2\u072b\u010d\3\2\2\2\u072c"+
		"\u0734\5\u0110\u0089\2\u072d\u0734\5\u0114\u008b\2\u072e\u0734\5\u0116"+
		"\u008c\2\u072f\u0734\5\u00f6|\2\u0730\u0734\5\u0150\u00a9\2\u0731\u0734"+
		"\5\u00e6t\2\u0732\u0734\5\u00eex\2\u0733\u072c\3\2\2\2\u0733\u072d\3\2"+
		"\2\2\u0733\u072e\3\2\2\2\u0733\u072f\3\2\2\2\u0733\u0730\3\2\2\2\u0733"+
		"\u0731\3\2\2\2\u0733\u0732\3\2\2\2\u0734\u010f\3\2\2\2\u0735\u0736\5\u0128"+
		"\u0095\2\u0736\u073b\5\u0112\u008a\2\u0737\u0738\7V\2\2\u0738\u073a\5"+
		"\u0112\u008a\2\u0739\u0737\3\2\2\2\u073a\u073d\3\2\2\2\u073b\u0739\3\2"+
		"\2\2\u073b\u073c\3\2\2\2\u073c\u073e\3\2\2\2\u073d\u073b\3\2\2\2\u073e"+
		"\u073f\7U\2\2\u073f\u0111\3\2\2\2\u0740\u0745\7D\2\2\u0741\u0742\7S\2"+
		"\2\u0742\u0744\7T\2\2\u0743\u0741\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743"+
		"\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0748\3\2\2\2\u0747\u0745\3\2\2\2\u0748"+
		"\u0749\7X\2\2\u0749\u074a\5\u011e\u0090\2\u074a\u0113\3\2\2\2\u074b\u074e"+
		"\5\u0128\u0095\2\u074c\u074e\7:\2\2\u074d\u074b\3\2\2\2\u074d\u074c\3"+
		"\2\2\2\u074e\u074f\3\2\2\2\u074f\u0750\7D\2\2\u0750\u0755\5\u0134\u009b"+
		"\2\u0751\u0752\7S\2\2\u0752\u0754\7T\2\2\u0753\u0751\3\2\2\2\u0754\u0757"+
		"\3\2\2\2\u0755\u0753\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u075a\3\2\2\2\u0757"+
		"\u0755\3\2\2\2\u0758\u0759\7\66\2\2\u0759\u075b\5\u0132\u009a\2\u075a"+
		"\u0758\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075d\7U"+
		"\2\2\u075d\u0115\3\2\2\2\u075e\u075f\5\u00e8u\2\u075f\u0760\5\u0114\u008b"+
		"\2\u0760\u0117\3\2\2\2\u0761\u0766\5\u011a\u008e\2\u0762\u0763\7V\2\2"+
		"\u0763\u0765\5\u011a\u008e\2\u0764\u0762\3\2\2\2\u0765\u0768\3\2\2\2\u0766"+
		"\u0764\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0119\3\2\2\2\u0768\u0766\3\2"+
		"\2\2\u0769\u076c\5\u011c\u008f\2\u076a\u076b\7X\2\2\u076b\u076d\5\u011e"+
		"\u0090\2\u076c\u076a\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u011b\3\2\2\2\u076e"+
		"\u0773\7D\2\2\u076f\u0770\7S\2\2\u0770\u0772\7T\2\2\u0771\u076f\3\2\2"+
		"\2\u0772\u0775\3\2\2\2\u0773\u0771\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u011d"+
		"\3\2\2\2\u0775\u0773\3\2\2\2\u0776\u0779\5\u0120\u0091\2\u0777\u0779\5"+
		"\u018a\u00c6\2\u0778\u0776\3\2\2\2\u0778\u0777\3\2\2\2\u0779\u011f\3\2"+
		"\2\2\u077a\u0786\7Q\2\2\u077b\u0780\5\u011e\u0090\2\u077c\u077d\7V\2\2"+
		"\u077d\u077f\5\u011e\u0090\2\u077e\u077c\3\2\2\2\u077f\u0782\3\2\2\2\u0780"+
		"\u077e\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0784\3\2\2\2\u0782\u0780\3\2"+
		"\2\2\u0783\u0785\7V\2\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785"+
		"\u0787\3\2\2\2\u0786\u077b\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788\3\2"+
		"\2\2\u0788\u0789\7R\2\2\u0789\u0121\3\2\2\2\u078a\u078b\5\u0140\u00a1"+
		"\2\u078b\u0123\3\2\2\2\u078c\u078d\7D\2\2\u078d\u0125\3\2\2\2\u078e\u078f"+
		"\5\u0140\u00a1\2\u078f\u0127\3\2\2\2\u0790\u0795\5\u012a\u0096\2\u0791"+
		"\u0792\7S\2\2\u0792\u0794\7T\2\2\u0793\u0791\3\2\2\2\u0794\u0797\3\2\2"+
		"\2\u0795\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u07a1\3\2\2\2\u0797\u0795"+
		"\3\2\2\2\u0798\u079d\5\u012c\u0097\2\u0799\u079a\7S\2\2\u079a\u079c\7"+
		"T\2\2\u079b\u0799\3\2\2\2\u079c\u079f\3\2\2\2\u079d\u079b\3\2\2\2\u079d"+
		"\u079e\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u07a0\u0790\3\2"+
		"\2\2\u07a0\u0798\3\2\2\2\u07a1\u0129\3\2\2\2\u07a2\u07a4\7D\2\2\u07a3"+
		"\u07a5\5\u012e\u0098\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07ad"+
		"\3\2\2\2\u07a6\u07a7\7W\2\2\u07a7\u07a9\7D\2\2\u07a8\u07aa\5\u012e\u0098"+
		"\2\u07a9\u07a8\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ac\3\2\2\2\u07ab\u07a6"+
		"\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae"+
		"\u012b\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0\u07b1\t\4\2\2\u07b1\u012d\3\2"+
		"\2\2\u07b2\u07b3\7Z\2\2\u07b3\u07b8\5\u0130\u0099\2\u07b4\u07b5\7V\2\2"+
		"\u07b5\u07b7\5\u0130\u0099\2\u07b6\u07b4\3\2\2\2\u07b7\u07ba\3\2\2\2\u07b8"+
		"\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07bb\3\2\2\2\u07ba\u07b8\3\2"+
		"\2\2\u07bb\u07bc\7Y\2\2\u07bc\u012f\3\2\2\2\u07bd\u07c4\5\u0128\u0095"+
		"\2\u07be\u07c1\7]\2\2\u07bf\u07c0\t\5\2\2\u07c0\u07c2\5\u0128\u0095\2"+
		"\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07bd"+
		"\3\2\2\2\u07c3\u07be\3\2\2\2\u07c4\u0131\3\2\2\2\u07c5\u07ca\5\u0140\u00a1"+
		"\2\u07c6\u07c7\7V\2\2\u07c7\u07c9\5\u0140\u00a1\2\u07c8\u07c6\3\2\2\2"+
		"\u07c9\u07cc\3\2\2\2\u07ca\u07c8\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u0133"+
		"\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cd\u07cf\7O\2\2\u07ce\u07d0\5\u0136\u009c"+
		"\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d2"+
		"\7P\2\2\u07d2\u0135\3\2\2\2\u07d3\u07d8\5\u0138\u009d\2\u07d4\u07d5\7"+
		"V\2\2\u07d5\u07d7\5\u0138\u009d\2\u07d6\u07d4\3\2\2\2\u07d7\u07da\3\2"+
		"\2\2\u07d8\u07d6\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07dd\3\2\2\2\u07da"+
		"\u07d8\3\2\2\2\u07db\u07dc\7V\2\2\u07dc\u07de\5\u013a\u009e\2\u07dd\u07db"+
		"\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07e1\5\u013a\u009e"+
		"\2\u07e0\u07d3\3\2\2\2\u07e0\u07df\3\2\2\2\u07e1\u0137\3\2\2\2\u07e2\u07e4"+
		"\5\u00e4s\2\u07e3\u07e2\3\2\2\2\u07e4\u07e7\3\2\2\2\u07e5\u07e3\3\2\2"+
		"\2\u07e5\u07e6\3\2\2\2\u07e6\u07e8\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e8\u07e9"+
		"\5\u0128\u0095\2\u07e9\u07ea\5\u011c\u008f\2\u07ea\u0139\3\2\2\2\u07eb"+
		"\u07ed\5\u00e4s\2\u07ec\u07eb\3\2\2\2\u07ed\u07f0\3\2\2\2\u07ee\u07ec"+
		"\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f1\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f1"+
		"\u07f2\5\u0128\u0095\2\u07f2\u07f3\7{\2\2\u07f3\u07f4\5\u011c\u008f\2"+
		"\u07f4\u013b\3\2\2\2\u07f5\u07f6\5\u0160\u00b1\2\u07f6\u013d\3\2\2\2\u07f7"+
		"\u07f8\5\u0160\u00b1\2\u07f8\u013f\3\2\2\2\u07f9\u07fe\7D\2\2\u07fa\u07fb"+
		"\7W\2\2\u07fb\u07fd\7D\2\2\u07fc\u07fa\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe"+
		"\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0141\3\2\2\2\u0800\u07fe\3\2"+
		"\2\2\u0801\u0802\t\6\2\2\u0802\u0143\3\2\2\2\u0803\u0804\7z\2\2\u0804"+
		"\u080b\5\u0146\u00a4\2\u0805\u0808\7O\2\2\u0806\u0809\5\u0148\u00a5\2"+
		"\u0807\u0809\5\u014c\u00a7\2\u0808\u0806\3\2\2\2\u0808\u0807\3\2\2\2\u0808"+
		"\u0809\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c\7P\2\2\u080b\u0805\3\2"+
		"\2\2\u080b\u080c\3\2\2\2\u080c\u0145\3\2\2\2\u080d\u080e\5\u0140\u00a1"+
		"\2\u080e\u0147\3\2\2\2\u080f\u0814\5\u014a\u00a6\2\u0810\u0811\7V\2\2"+
		"\u0811\u0813\5\u014a\u00a6\2\u0812\u0810\3\2\2\2\u0813\u0816\3\2\2\2\u0814"+
		"\u0812\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0149\3\2\2\2\u0816\u0814\3\2"+
		"\2\2\u0817\u0818\7D\2\2\u0818\u0819\7X\2\2\u0819\u081a\5\u014c\u00a7\2"+
		"\u081a\u014b\3\2\2\2\u081b\u081f\5\u018a\u00c6\2\u081c\u081f\5\u0144\u00a3"+
		"\2\u081d\u081f\5\u014e\u00a8\2\u081e\u081b\3\2\2\2\u081e\u081c\3\2\2\2"+
		"\u081e\u081d\3\2\2\2\u081f\u014d\3\2\2\2\u0820\u0829\7Q\2\2\u0821\u0826"+
		"\5\u014c\u00a7\2\u0822\u0823\7V\2\2\u0823\u0825\5\u014c\u00a7\2\u0824"+
		"\u0822\3\2\2\2\u0825\u0828\3\2\2\2\u0826\u0824\3\2\2\2\u0826\u0827\3\2"+
		"\2\2\u0827\u082a\3\2\2\2\u0828\u0826\3\2\2\2\u0829\u0821\3\2\2\2\u0829"+
		"\u082a\3\2\2\2\u082a\u082c\3\2\2\2\u082b\u082d\7V\2\2\u082c\u082b\3\2"+
		"\2\2\u082c\u082d\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u082f\7R\2\2\u082f"+
		"\u014f\3\2\2\2\u0830\u0831\7z\2\2\u0831\u0832\7#\2\2\u0832\u0833\7D\2"+
		"\2\u0833\u0834\5\u0152\u00aa\2\u0834\u0151\3\2\2\2\u0835\u0839\7Q\2\2"+
		"\u0836\u0838\5\u0154\u00ab\2\u0837\u0836\3\2\2\2\u0838\u083b\3\2\2\2\u0839"+
		"\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\3\2\2\2\u083b\u0839\3\2"+
		"\2\2\u083c\u083d\7R\2\2\u083d\u0153\3\2\2\2\u083e\u0840\5\u00e0q\2\u083f"+
		"\u083e\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0841\u0842\3\2"+
		"\2\2\u0842\u0844\3\2\2\2\u0843\u0841\3\2\2\2\u0844\u0847\5\u0156\u00ac"+
		"\2\u0845\u0847\7U\2\2\u0846\u0841\3\2\2\2\u0846\u0845\3\2\2\2\u0847\u0155"+
		"\3\2\2\2\u0848\u0849\5\u0128\u0095\2\u0849\u084a\5\u0158\u00ad\2\u084a"+
		"\u084b\7U\2\2\u084b\u085d\3\2\2\2\u084c\u084e\5\u00e6t\2\u084d\u084f\7"+
		"U\2\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u085d\3\2\2\2\u0850"+
		"\u0852\5\u00f6|\2\u0851\u0853\7U\2\2\u0852\u0851\3\2\2\2\u0852\u0853\3"+
		"\2\2\2\u0853\u085d\3\2\2\2\u0854\u0856\5\u00eex\2\u0855\u0857\7U\2\2\u0856"+
		"\u0855\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u085d\3\2\2\2\u0858\u085a\5\u0150"+
		"\u00a9\2\u0859\u085b\7U\2\2\u085a\u0859\3\2\2\2\u085a\u085b\3\2\2\2\u085b"+
		"\u085d\3\2\2\2\u085c\u0848\3\2\2\2\u085c\u084c\3\2\2\2\u085c\u0850\3\2"+
		"\2\2\u085c\u0854\3\2\2\2\u085c\u0858\3\2\2\2\u085d\u0157\3\2\2\2\u085e"+
		"\u0861\5\u015a\u00ae\2\u085f\u0861\5\u015c\u00af\2\u0860\u085e\3\2\2\2"+
		"\u0860\u085f\3\2\2\2\u0861\u0159\3\2\2\2\u0862\u0863\7D\2\2\u0863\u0864"+
		"\7O\2\2\u0864\u0866\7P\2\2\u0865\u0867\5\u015e\u00b0\2\u0866\u0865\3\2"+
		"\2\2\u0866\u0867\3\2\2\2\u0867\u015b\3\2\2\2\u0868\u0869\5\u0118\u008d"+
		"\2\u0869\u015d\3\2\2\2\u086a\u086b\7\22\2\2\u086b\u086c\5\u014c\u00a7"+
		"\2\u086c\u015f\3\2\2\2\u086d\u0871\7Q\2\2\u086e\u0870\5\u0162\u00b2\2"+
		"\u086f\u086e\3\2\2\2\u0870\u0873\3\2\2\2\u0871\u086f\3\2\2\2\u0871\u0872"+
		"\3\2\2\2\u0872\u0874\3\2\2\2\u0873\u0871\3\2\2\2\u0874\u0875\7R\2\2\u0875"+
		"\u0161\3\2\2\2\u0876\u087a\5\u0164\u00b3\2\u0877\u087a\5\u0168\u00b5\2"+
		"\u0878\u087a\5\u00dep\2\u0879\u0876\3\2\2\2\u0879\u0877\3\2\2\2\u0879"+
		"\u0878\3\2\2\2\u087a\u0163\3\2\2\2\u087b\u087c\5\u0166\u00b4\2\u087c\u087d"+
		"\7U\2\2\u087d\u0165\3\2\2\2\u087e\u0880\5\u00e4s\2\u087f\u087e\3\2\2\2"+
		"\u0880\u0883\3\2\2\2\u0881\u087f\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0884"+
		"\3\2\2\2\u0883\u0881\3\2\2\2\u0884\u0885\5\u0128\u0095\2\u0885\u0886\5"+
		"\u0118\u008d\2\u0886\u0167\3\2\2\2\u0887\u08f0\5\u0160\u00b1\2\u0888\u0889"+
		"\7\b\2\2\u0889\u088c\5\u018a\u00c6\2\u088a\u088b\7^\2\2\u088b\u088d\5"+
		"\u018a\u00c6\2\u088c\u088a\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e\3\2"+
		"\2\2\u088e\u088f\7U\2\2\u088f\u08f0\3\2\2\2\u0890\u0891\7\34\2\2\u0891"+
		"\u0892\5\u0182\u00c2\2\u0892\u0895\5\u0168\u00b5\2\u0893\u0894\7\25\2"+
		"\2\u0894\u0896\5\u0168\u00b5\2\u0895\u0893\3\2\2\2\u0895\u0896\3\2\2\2"+
		"\u0896\u08f0\3\2\2\2\u0897\u0898\7\33\2\2\u0898\u0899\7O\2\2\u0899\u089a"+
		"\5\u017a\u00be\2\u089a\u089b\7P\2\2\u089b\u089c\5\u0168\u00b5\2\u089c"+
		"\u08f0\3\2\2\2\u089d\u089e\7<\2\2\u089e\u089f\5\u0182\u00c2\2\u089f\u08a0"+
		"\5\u0168\u00b5\2\u08a0\u08f0\3\2\2\2\u08a1\u08a2\7\23\2\2\u08a2\u08a3"+
		"\5\u0168\u00b5\2\u08a3\u08a4\7<\2\2\u08a4\u08a5\5\u0182\u00c2\2\u08a5"+
		"\u08a6\7U\2\2\u08a6\u08f0\3\2\2\2\u08a7\u08a8\78\2\2\u08a8\u08b2\5\u0160"+
		"\u00b1\2\u08a9\u08ab\5\u016a\u00b6\2\u08aa\u08a9\3\2\2\2\u08ab\u08ac\3"+
		"\2\2\2\u08ac\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08af\3\2\2\2\u08ae"+
		"\u08b0\5\u016e\u00b8\2\u08af\u08ae\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b3"+
		"\3\2\2\2\u08b1\u08b3\5\u016e\u00b8\2\u08b2\u08aa\3\2\2\2\u08b2\u08b1\3"+
		"\2\2\2\u08b3\u08f0\3\2\2\2\u08b4\u08b5\78\2\2\u08b5\u08b6\5\u0170\u00b9"+
		"\2\u08b6\u08ba\5\u0160\u00b1\2\u08b7\u08b9\5\u016a\u00b6\2\u08b8\u08b7"+
		"\3\2\2\2\u08b9\u08bc\3\2\2\2\u08ba\u08b8\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb"+
		"\u08be\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bd\u08bf\5\u016e\u00b8\2\u08be\u08bd"+
		"\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08f0\3\2\2\2\u08c0\u08c1\7\62\2\2"+
		"\u08c1\u08c2\5\u0182\u00c2\2\u08c2\u08c6\7Q\2\2\u08c3\u08c5\5\u0176\u00bc"+
		"\2\u08c4\u08c3\3\2\2\2\u08c5\u08c8\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c6\u08c7"+
		"\3\2\2\2\u08c7\u08cc\3\2\2\2\u08c8\u08c6\3\2\2\2\u08c9\u08cb\5\u0178\u00bd"+
		"\2\u08ca\u08c9\3\2\2\2\u08cb\u08ce\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cd"+
		"\3\2\2\2\u08cd\u08cf\3\2\2\2\u08ce\u08cc\3\2\2\2\u08cf\u08d0\7R\2\2\u08d0"+
		"\u08f0\3\2\2\2\u08d1\u08d2\7\63\2\2\u08d2\u08d3\5\u0182\u00c2\2\u08d3"+
		"\u08d4\5\u0160\u00b1\2\u08d4\u08f0\3\2\2\2\u08d5\u08d7\7-\2\2\u08d6\u08d8"+
		"\5\u018a\u00c6\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\3"+
		"\2\2\2\u08d9\u08f0\7U\2\2\u08da\u08db\7\65\2\2\u08db\u08dc\5\u018a\u00c6"+
		"\2\u08dc\u08dd\7U\2\2\u08dd\u08f0\3\2\2\2\u08de\u08e0\7\n\2\2\u08df\u08e1"+
		"\7D\2\2\u08e0\u08df\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2"+
		"\u08f0\7U\2\2\u08e3\u08e5\7\21\2\2\u08e4\u08e6\7D\2\2\u08e5\u08e4\3\2"+
		"\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08f0\7U\2\2\u08e8"+
		"\u08f0\7U\2\2\u08e9\u08ea\5\u0186\u00c4\2\u08ea\u08eb\7U\2\2\u08eb\u08f0"+
		"\3\2\2\2\u08ec\u08ed\7D\2\2\u08ed\u08ee\7^\2\2\u08ee\u08f0\5\u0168\u00b5"+
		"\2\u08ef\u0887\3\2\2\2\u08ef\u0888\3\2\2\2\u08ef\u0890\3\2\2\2\u08ef\u0897"+
		"\3\2\2\2\u08ef\u089d\3\2\2\2\u08ef\u08a1\3\2\2\2\u08ef\u08a7\3\2\2\2\u08ef"+
		"\u08b4\3\2\2\2\u08ef\u08c0\3\2\2\2\u08ef\u08d1\3\2\2\2\u08ef\u08d5\3\2"+
		"\2\2\u08ef\u08da\3\2\2\2\u08ef\u08de\3\2\2\2\u08ef\u08e3\3\2\2\2\u08ef"+
		"\u08e8\3\2\2\2\u08ef\u08e9\3\2\2\2\u08ef\u08ec\3\2\2\2\u08f0\u0169\3\2"+
		"\2\2\u08f1\u08f2\7\r\2\2\u08f2\u08f6\7O\2\2\u08f3\u08f5\5\u00e4s\2\u08f4"+
		"\u08f3\3\2\2\2\u08f5\u08f8\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f6\u08f7\3\2"+
		"\2\2\u08f7\u08f9\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fa\5\u016c\u00b7"+
		"\2\u08fa\u08fb\7D\2\2\u08fb\u08fc\7P\2\2\u08fc\u08fd\5\u0160\u00b1\2\u08fd"+
		"\u016b\3\2\2\2\u08fe\u0903\5\u0140\u00a1\2\u08ff\u0900\7l\2\2\u0900\u0902"+
		"\5\u0140\u00a1\2\u0901\u08ff\3\2\2\2\u0902\u0905\3\2\2\2\u0903\u0901\3"+
		"\2\2\2\u0903\u0904\3\2\2\2\u0904\u016d\3\2\2\2\u0905\u0903\3\2\2\2\u0906"+
		"\u0907\7\31\2\2\u0907\u0908\5\u0160\u00b1\2\u0908\u016f\3\2\2\2\u0909"+
		"\u090a\7O\2\2\u090a\u090c\5\u0172\u00ba\2\u090b\u090d\7U\2\2\u090c\u090b"+
		"\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f\7P\2\2\u090f"+
		"\u0171\3\2\2\2\u0910\u0915\5\u0174\u00bb\2\u0911\u0912\7U\2\2\u0912\u0914"+
		"\5\u0174\u00bb\2\u0913\u0911\3\2\2\2\u0914\u0917\3\2\2\2\u0915\u0913\3"+
		"\2\2\2\u0915\u0916\3\2\2\2\u0916\u0173\3\2\2\2\u0917\u0915\3\2\2\2\u0918"+
		"\u091a\5\u00e4s\2\u0919\u0918\3\2\2\2\u091a\u091d\3\2\2\2\u091b\u0919"+
		"\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091e\3\2\2\2\u091d\u091b\3\2\2\2\u091e"+
		"\u091f\5\u012a\u0096\2\u091f\u0920\5\u011c\u008f\2\u0920\u0921\7X\2\2"+
		"\u0921\u0922\5\u018a\u00c6\2\u0922\u0175\3\2\2\2\u0923\u0925\5\u0178\u00bd"+
		"\2\u0924\u0923\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0924\3\2\2\2\u0926\u0927"+
		"\3\2\2\2\u0927\u0929\3\2\2\2\u0928\u092a\5\u0162\u00b2\2\u0929\u0928\3"+
		"\2\2\2\u092a\u092b\3\2\2\2\u092b\u0929\3\2\2\2\u092b\u092c\3\2\2\2\u092c"+
		"\u0177\3\2\2\2\u092d\u092e\7\f\2\2\u092e\u092f\5\u0188\u00c5\2\u092f\u0930"+
		"\7^\2\2\u0930\u0938\3\2\2\2\u0931\u0932\7\f\2\2\u0932\u0933\5\u0124\u0093"+
		"\2\u0933\u0934\7^\2\2\u0934\u0938\3\2\2\2\u0935\u0936\7\22\2\2\u0936\u0938"+
		"\7^\2\2\u0937\u092d\3\2\2\2\u0937\u0931\3\2\2\2\u0937\u0935\3\2\2\2\u0938"+
		"\u0179\3\2\2\2\u0939\u0946\5\u017e\u00c0\2\u093a\u093c\5\u017c\u00bf\2"+
		"\u093b\u093a\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093f"+
		"\7U\2\2\u093e\u0940\5\u018a\u00c6\2\u093f\u093e\3\2\2\2\u093f\u0940\3"+
		"\2\2\2\u0940\u0941\3\2\2\2\u0941\u0943\7U\2\2\u0942\u0944\5\u0180\u00c1"+
		"\2\u0943\u0942\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0946\3\2\2\2\u0945\u0939"+
		"\3\2\2\2\u0945\u093b\3\2\2\2\u0946\u017b\3\2\2\2\u0947\u094a\5\u0166\u00b4"+
		"\2\u0948\u094a\5\u0184\u00c3\2\u0949\u0947\3\2\2\2\u0949\u0948\3\2\2\2"+
		"\u094a\u017d\3\2\2\2\u094b\u094d\5\u00e4s\2\u094c\u094b\3\2\2\2\u094d"+
		"\u0950\3\2\2\2\u094e\u094c\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0951\3\2"+
		"\2\2\u0950\u094e\3\2\2\2\u0951\u0952\5\u0128\u0095\2\u0952\u0953\7D\2"+
		"\2\u0953\u0954\7^\2\2\u0954\u0955\5\u018a\u00c6\2\u0955\u017f\3\2\2\2"+
		"\u0956\u0957\5\u0184\u00c3\2\u0957\u0181\3\2\2\2\u0958\u0959\7O\2\2\u0959"+
		"\u095a\5\u018a\u00c6\2\u095a\u095b\7P\2\2\u095b\u0183\3\2\2\2\u095c\u0961"+
		"\5\u018a\u00c6\2\u095d\u095e\7V\2\2\u095e\u0960\5\u018a\u00c6\2\u095f"+
		"\u095d\3\2\2\2\u0960\u0963\3\2\2\2\u0961\u095f\3\2\2\2\u0961\u0962\3\2"+
		"\2\2\u0962\u0185\3\2\2\2\u0963\u0961\3\2\2\2\u0964\u0965\5\u018a\u00c6"+
		"\2\u0965\u0187\3\2\2\2\u0966\u0967\5\u018a\u00c6\2\u0967\u0189\3\2\2\2"+
		"\u0968\u0969\b\u00c6\1\2\u0969\u0976\5\u018c\u00c7\2\u096a\u096b\7(\2"+
		"\2\u096b\u0976\5\u018e\u00c8\2\u096c\u096d\7O\2\2\u096d\u096e\5\u0128"+
		"\u0095\2\u096e\u096f\7P\2\2\u096f\u0970\5\u018a\u00c6\23\u0970\u0976\3"+
		"\2\2\2\u0971\u0972\t\16\2\2\u0972\u0976\5\u018a\u00c6\21\u0973\u0974\t"+
		"\17\2\2\u0974\u0976\5\u018a\u00c6\20\u0975\u0968\3\2\2\2\u0975\u096a\3"+
		"\2\2\2\u0975\u096c\3\2\2\2\u0975\u0971\3\2\2\2\u0975\u0973\3\2\2\2\u0976"+
		"\u09cc\3\2\2\2\u0977\u0978\f\17\2\2\u0978\u0979\t\t\2\2\u0979\u09cb\5"+
		"\u018a\u00c6\20\u097a\u097b\f\16\2\2\u097b\u097c\t\7\2\2\u097c\u09cb\5"+
		"\u018a\u00c6\17\u097d\u0985\f\r\2\2\u097e\u097f\7Z\2\2\u097f\u0986\7Z"+
		"\2\2\u0980\u0981\7Y\2\2\u0981\u0982\7Y\2\2\u0982\u0986\7Y\2\2\u0983\u0984"+
		"\7Y\2\2\u0984\u0986\7Y\2\2\u0985\u097e\3\2\2\2\u0985\u0980\3\2\2\2\u0985"+
		"\u0983\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u09cb\5\u018a\u00c6\16\u0988"+
		"\u0989\f\f\2\2\u0989\u098a\t\20\2\2\u098a\u09cb\5\u018a\u00c6\r\u098b"+
		"\u098c\f\n\2\2\u098c\u098d\t\21\2\2\u098d\u09cb\5\u018a\u00c6\13\u098e"+
		"\u098f\f\t\2\2\u098f\u0990\7k\2\2\u0990\u09cb\5\u018a\u00c6\n\u0991\u0992"+
		"\f\b\2\2\u0992\u0993\7m\2\2\u0993\u09cb\5\u018a\u00c6\t\u0994\u0995\f"+
		"\7\2\2\u0995\u0996\7l\2\2\u0996\u09cb\5\u018a\u00c6\b\u0997";
	private static final String _serializedATNSegment1 =
		"\u0998\f\6\2\2\u0998\u0999\7c\2\2\u0999\u09cb\5\u018a\u00c6\7\u099a\u099b"+
		"\f\5\2\2\u099b\u099c\7d\2\2\u099c\u09cb\5\u018a\u00c6\6\u099d\u099e\f"+
		"\4\2\2\u099e\u099f\7]\2\2\u099f\u09a0\5\u018a\u00c6\2\u09a0\u09a1\7^\2"+
		"\2\u09a1\u09a2\5\u018a\u00c6\5\u09a2\u09cb\3\2\2\2\u09a3\u09a4\f\3\2\2"+
		"\u09a4\u09a5\t\22\2\2\u09a5\u09cb\5\u018a\u00c6\3\u09a6\u09a7\f\33\2\2"+
		"\u09a7\u09a8\7W\2\2\u09a8\u09cb\7D\2\2\u09a9\u09aa\f\32\2\2\u09aa\u09ab"+
		"\7W\2\2\u09ab\u09cb\7\64\2\2\u09ac\u09ad\f\31\2\2\u09ad\u09ae\7W\2\2\u09ae"+
		"\u09b0\7(\2\2\u09af\u09b1\5\u019a\u00ce\2\u09b0\u09af\3\2\2\2\u09b0\u09b1"+
		"\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09cb\5\u0192\u00ca\2\u09b3\u09b4\f"+
		"\30\2\2\u09b4\u09b5\7W\2\2\u09b5\u09b6\7\61\2\2\u09b6\u09cb\5\u01a0\u00d1"+
		"\2\u09b7\u09b8\f\27\2\2\u09b8\u09b9\7W\2\2\u09b9\u09cb\5\u0198\u00cd\2"+
		"\u09ba\u09bb\f\26\2\2\u09bb\u09bc\7S\2\2\u09bc\u09bd\5\u018a\u00c6\2\u09bd"+
		"\u09be\7T\2\2\u09be\u09cb\3\2\2\2\u09bf\u09c0\f\25\2\2\u09c0\u09c2\7O"+
		"\2\2\u09c1\u09c3\5\u0184\u00c3\2\u09c2\u09c1\3\2\2\2\u09c2\u09c3\3\2\2"+
		"\2\u09c3\u09c4\3\2\2\2\u09c4\u09cb\7P\2\2\u09c5\u09c6\f\22\2\2\u09c6\u09cb"+
		"\t\23\2\2\u09c7\u09c8\f\13\2\2\u09c8\u09c9\7!\2\2\u09c9\u09cb\5\u0128"+
		"\u0095\2\u09ca\u0977\3\2\2\2\u09ca\u097a\3\2\2\2\u09ca\u097d\3\2\2\2\u09ca"+
		"\u0988\3\2\2\2\u09ca\u098b\3\2\2\2\u09ca\u098e\3\2\2\2\u09ca\u0991\3\2"+
		"\2\2\u09ca\u0994\3\2\2\2\u09ca\u0997\3\2\2\2\u09ca\u099a\3\2\2\2\u09ca"+
		"\u099d\3\2\2\2\u09ca\u09a3\3\2\2\2\u09ca\u09a6\3\2\2\2\u09ca\u09a9\3\2"+
		"\2\2\u09ca\u09ac\3\2\2\2\u09ca\u09b3\3\2\2\2\u09ca\u09b7\3\2\2\2\u09ca"+
		"\u09ba\3\2\2\2\u09ca\u09bf\3\2\2\2\u09ca\u09c5\3\2\2\2\u09ca\u09c7\3\2"+
		"\2\2\u09cb\u09ce\3\2\2\2\u09cc\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd"+
		"\u018b\3\2\2\2\u09ce\u09cc\3\2\2\2\u09cf\u09d0\7O\2\2\u09d0\u09d1\5\u018a"+
		"\u00c6\2\u09d1\u09d2\7P\2\2\u09d2\u09e5\3\2\2\2\u09d3\u09e5\7\64\2\2\u09d4"+
		"\u09e5\7\61\2\2\u09d5\u09e5\5\u0142\u00a2\2\u09d6\u09e5\7D\2\2\u09d7\u09d8"+
		"\5\u0128\u0095\2\u09d8\u09d9\7W\2\2\u09d9\u09da\7\17\2\2\u09da\u09e5\3"+
		"\2\2\2\u09db\u09dc\7:\2\2\u09dc\u09dd\7W\2\2\u09dd\u09e5\7\17\2\2\u09de"+
		"\u09e2\5\u019a\u00ce\2\u09df\u09e3\5\u01a2\u00d2\2\u09e0\u09e1\7\64\2"+
		"\2\u09e1\u09e3\5\u01a4\u00d3\2\u09e2\u09df\3\2\2\2\u09e2\u09e0\3\2\2\2"+
		"\u09e3\u09e5\3\2\2\2\u09e4\u09cf\3\2\2\2\u09e4\u09d3\3\2\2\2\u09e4\u09d4"+
		"\3\2\2\2\u09e4\u09d5\3\2\2\2\u09e4\u09d6\3\2\2\2\u09e4\u09d7\3\2\2\2\u09e4"+
		"\u09db\3\2\2\2\u09e4\u09de\3\2\2\2\u09e5\u018d\3\2\2\2\u09e6\u09e7\5\u019a"+
		"\u00ce\2\u09e7\u09e8\5\u0190\u00c9\2\u09e8\u09e9\5\u0196\u00cc\2\u09e9"+
		"\u09f0\3\2\2\2\u09ea\u09ed\5\u0190\u00c9\2\u09eb\u09ee\5\u0194\u00cb\2"+
		"\u09ec\u09ee\5\u0196\u00cc\2\u09ed\u09eb\3\2\2\2\u09ed\u09ec\3\2\2\2\u09ee"+
		"\u09f0\3\2\2\2\u09ef\u09e6\3\2\2\2\u09ef\u09ea\3\2\2\2\u09f0\u018f\3\2"+
		"\2\2\u09f1\u09f3\7D\2\2\u09f2\u09f4\5\u019c\u00cf\2\u09f3\u09f2\3\2\2"+
		"\2\u09f3\u09f4\3\2\2\2\u09f4\u09fc\3\2\2\2\u09f5\u09f6\7W\2\2\u09f6\u09f8"+
		"\7D\2\2\u09f7\u09f9\5\u019c\u00cf\2\u09f8\u09f7\3\2\2\2\u09f8\u09f9\3"+
		"\2\2\2\u09f9\u09fb\3\2\2\2\u09fa\u09f5\3\2\2\2\u09fb\u09fe\3\2\2\2\u09fc"+
		"\u09fa\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u0a01\3\2\2\2\u09fe\u09fc\3\2"+
		"\2\2\u09ff\u0a01\5\u012c\u0097\2\u0a00\u09f1\3\2\2\2\u0a00\u09ff\3\2\2"+
		"\2\u0a01\u0191\3\2\2\2\u0a02\u0a04\7D\2\2\u0a03\u0a05\5\u019e\u00d0\2"+
		"\u0a04\u0a03\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a06\3\2\2\2\u0a06\u0a07"+
		"\5\u0196\u00cc\2\u0a07\u0193\3\2\2\2\u0a08\u0a24\7S\2\2\u0a09\u0a0e\7"+
		"T\2\2\u0a0a\u0a0b\7S\2\2\u0a0b\u0a0d\7T\2\2\u0a0c\u0a0a\3\2\2\2\u0a0d"+
		"\u0a10\3\2\2\2\u0a0e\u0a0c\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a11\3\2"+
		"\2\2\u0a10\u0a0e\3\2\2\2\u0a11\u0a25\5\u0120\u0091\2\u0a12\u0a13\5\u018a"+
		"\u00c6\2\u0a13\u0a1a\7T\2\2\u0a14\u0a15\7S\2\2\u0a15\u0a16\5\u018a\u00c6"+
		"\2\u0a16\u0a17\7T\2\2\u0a17\u0a19\3\2\2\2\u0a18\u0a14\3\2\2\2\u0a19\u0a1c"+
		"\3\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a21\3\2\2\2\u0a1c"+
		"\u0a1a\3\2\2\2\u0a1d\u0a1e\7S\2\2\u0a1e\u0a20\7T\2\2\u0a1f\u0a1d\3\2\2"+
		"\2\u0a20\u0a23\3\2\2\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a25"+
		"\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a24\u0a09\3\2\2\2\u0a24\u0a12\3\2\2\2\u0a25"+
		"\u0195\3\2\2\2\u0a26\u0a28\5\u01a4\u00d3\2\u0a27\u0a29\5\u00fa~\2\u0a28"+
		"\u0a27\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u0197\3\2\2\2\u0a2a\u0a2b\5\u019a"+
		"\u00ce\2\u0a2b\u0a2c\5\u01a2\u00d2\2\u0a2c\u0199\3\2\2\2\u0a2d\u0a2e\7"+
		"Z\2\2\u0a2e\u0a2f\5\u00f8}\2\u0a2f\u0a30\7Y\2\2\u0a30\u019b\3\2\2\2\u0a31"+
		"\u0a32\7Z\2\2\u0a32\u0a35\7Y\2\2\u0a33\u0a35\5\u012e\u0098\2\u0a34\u0a31"+
		"\3\2\2\2\u0a34\u0a33\3\2\2\2\u0a35\u019d\3\2\2\2\u0a36\u0a37\7Z\2\2\u0a37"+
		"\u0a3a\7Y\2\2\u0a38\u0a3a\5\u019a\u00ce\2\u0a39\u0a36\3\2\2\2\u0a39\u0a38"+
		"\3\2\2\2\u0a3a\u019f\3\2\2\2\u0a3b\u0a42\5\u01a4\u00d3\2\u0a3c\u0a3d\7"+
		"W\2\2\u0a3d\u0a3f\7D\2\2\u0a3e\u0a40\5\u01a4\u00d3\2\u0a3f\u0a3e\3\2\2"+
		"\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a42\3\2\2\2\u0a41\u0a3b\3\2\2\2\u0a41\u0a3c"+
		"\3\2\2\2\u0a42\u01a1\3\2\2\2\u0a43\u0a44\7\61\2\2\u0a44\u0a48\5\u01a0"+
		"\u00d1\2\u0a45\u0a46\7D\2\2\u0a46\u0a48\5\u01a4\u00d3\2\u0a47\u0a43\3"+
		"\2\2\2\u0a47\u0a45\3\2\2\2\u0a48\u01a3\3\2\2\2\u0a49\u0a4b\7O\2\2\u0a4a"+
		"\u0a4c\5\u0184\u00c3\2\u0a4b\u0a4a\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4d"+
		"\3\2\2\2\u0a4d\u0a4e\7P\2\2\u0a4e\u01a5\3\2\2\2\u012f\u01a7\u01ac\u01b2"+
		"\u01ba\u01c3\u01c8\u01cf\u01d6\u01dd\u01e4\u01e9\u01ed\u01f1\u01f5\u01fa"+
		"\u01fe\u0202\u020c\u0214\u021b\u0222\u0226\u0229\u022c\u0235\u023b\u0240"+
		"\u0243\u0249\u024f\u0253\u025c\u0263\u026c\u0273\u0279\u027d\u028a\u028e"+
		"\u0296\u029b\u029f\u02a2\u02ab\u02b8\u02c2\u02c8\u02cc\u02d7\u02e2\u02e7"+
		"\u02ef\u02f3\u02f5\u0304\u030c\u030f\u0313\u0318\u031c\u0327\u0330\u0332"+
		"\u0339\u033e\u0347\u034c\u034f\u0354\u035d\u036d\u0377\u037a\u0383\u038d"+
		"\u0395\u0398\u039b\u03a8\u03b1\u03be\u03c2\u03c6\u03ca\u03cc\u03ce\u03d4"+
		"\u03db\u03e5\u03ef\u03f4\u03fd\u0405\u040e\u042d\u0430\u0433\u043b\u043f"+
		"\u0447\u044d\u0458\u0461\u0466\u0472\u047b\u0485\u0491\u0498\u04a5\u04ae"+
		"\u04b7\u04bd\u04c8\u04cd\u04d9\u04dd\u04e1\u04e5\u04e7\u04eb\u04f0\u0503"+
		"\u0520\u0529\u0539\u0561\u0577\u057a\u0580\u0582\u0595\u0597\u05a0\u05a2"+
		"\u05a6\u05ab\u05af\u05b3\u05b7\u05c1\u05cd\u05d4\u05d7\u05db\u05e7\u05ec"+
		"\u05f2\u05f4\u05fb\u05ff\u0613\u0618\u061d\u0623\u062b\u0634\u0639\u0640"+
		"\u0647\u064e\u0655\u065a\u065e\u0662\u0666\u066b\u066f\u0673\u067d\u0685"+
		"\u068c\u0693\u0697\u069a\u069d\u06a6\u06ac\u06b1\u06b4\u06ba\u06c0\u06c4"+
		"\u06cd\u06d4\u06dd\u06e4\u06ea\u06ee\u06f9\u06fd\u0705\u070a\u070e\u0717"+
		"\u0725\u072a\u0733\u073b\u0745\u074d\u0755\u075a\u0766\u076c\u0773\u0778"+
		"\u0780\u0784\u0786\u0795\u079d\u07a0\u07a4\u07a9\u07ad\u07b8\u07c1\u07c3"+
		"\u07ca\u07cf\u07d8\u07dd\u07e0\u07e5\u07ee\u07fe\u0808\u080b\u0814\u081e"+
		"\u0826\u0829\u082c\u0839\u0841\u0846\u084e\u0852\u0856\u085a\u085c\u0860"+
		"\u0866\u0871\u0879\u0881\u088c\u0895\u08ac\u08af\u08b2\u08ba\u08be\u08c6"+
		"\u08cc\u08d7\u08e0\u08e5\u08ef\u08f6\u0903\u090c\u0915\u091b\u0926\u092b"+
		"\u0937\u093b\u093f\u0943\u0945\u0949\u094e\u0961\u0975\u0985\u09b0\u09c2"+
		"\u09ca\u09cc\u09e2\u09e4\u09ed\u09ef\u09f3\u09f8\u09fc\u0a00\u0a04\u0a0e"+
		"\u0a1a\u0a21\u0a24\u0a28\u0a34\u0a39\u0a3f\u0a41\u0a47\u0a4b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}