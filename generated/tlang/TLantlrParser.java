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
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		MEANS=30, NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, 
		RETURN=37, SHORT=38, STATIC=39, STRICTFP=40, SUPER=41, SWITCH=42, SYNCHRONIZED=43, 
		THIS=44, THROW=45, THROWS=46, TRANSIENT=47, TRY=48, VOID=49, VOLATILE=50, 
		WHILE=51, BooleanLiteral=52, CONJUNCTIVE_BOOLEAN_EQUAL=53, CONJUNCTIVE_IMPLIES=54, 
		CONJUNCTIVE_CONSEQUENCE=55, CONJUNCTIVE_NOT_EQUAL=56, UndecoratedIdentifier=57, 
		Identifier=58, PreValueName=59, MidValueName=60, PostValueName=61, WS=62, 
		COMMENT=63, LINE_COMMENT=64, IntegerLiteral=65, FloatingPointLiteral=66, 
		CharacterLiteral=67, StringLiteral=68, NullLiteral=69, LPAREN=70, RPAREN=71, 
		LBRACE=72, RBRACE=73, LBRACK=74, RBRACK=75, SEMI=76, COMMA=77, DOT=78, 
		ASSIGN=79, GT=80, LT=81, BANG=82, TILDE=83, QUESTION=84, COLON=85, EQUAL=86, 
		LE=87, GE=88, NOTEQUAL=89, AND=90, OR=91, INC=92, DEC=93, ADD=94, SUB=95, 
		MUL=96, DIV=97, BITAND=98, BITOR=99, CARET=100, MOD=101, ADD_ASSIGN=102, 
		SUB_ASSIGN=103, MUL_ASSIGN=104, DIV_ASSIGN=105, AND_ASSIGN=106, OR_ASSIGN=107, 
		XOR_ASSIGN=108, MOD_ASSIGN=109, LSHIFT_ASSIGN=110, RSHIFT_ASSIGN=111, 
		URSHIFT_ASSIGN=112, AT=113, ELLIPSIS=114;
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
		RULE_t_interfaceMemberDeclaration = 29, RULE_t_constDeclaration = 30, 
		RULE_t_constantDeclarator = 31, RULE_t_interfaceMethodDeclaration = 32, 
		RULE_t_genericInterfaceMethodDeclaration = 33, RULE_t_annotationVariableDeclarator = 34, 
		RULE_t_variableDeclarator = 35, RULE_t_initializedVariableDeclaratorId = 36, 
		RULE_t_uninitializedVariableDeclaratorId = 37, RULE_t_annotationVariableDeclaratorId = 38, 
		RULE_t_variableInitializer = 39, RULE_t_arrayInitializer = 40, RULE_t_packageOrTypeName = 41, 
		RULE_t_enumConstantName = 42, RULE_t_typeName = 43, RULE_t_type = 44, 
		RULE_t_classOrInterfaceType = 45, RULE_t_primitiveType = 46, RULE_t_typeArguments = 47, 
		RULE_t_typeArgument = 48, RULE_t_qualifiedNameList = 49, RULE_t_formalParameters = 50, 
		RULE_t_formalParameterList = 51, RULE_t_formalParameter = 52, RULE_t_lastFormalParameter = 53, 
		RULE_t_methodBody = 54, RULE_t_constructorBody = 55, RULE_t_qualifiedName = 56, 
		RULE_t_literal = 57, RULE_t_annotation = 58, RULE_t_annotationName = 59, 
		RULE_t_elementValuePairs = 60, RULE_t_elementValuePair = 61, RULE_t_elementValue = 62, 
		RULE_t_elementValueArrayInitializer = 63, RULE_t_annotationTypeDeclaration = 64, 
		RULE_t_annotationTypeBody = 65, RULE_t_annotationTypeElementDeclaration = 66, 
		RULE_t_annotationMethodRest = 67, RULE_t_annotationConstantRest = 68, 
		RULE_t_defaultValue = 69, RULE_t_block = 70, RULE_t_nestedBlock = 71, 
		RULE_t_blockStatement = 72, RULE_t_localVariableDeclaration = 73, RULE_t_statement = 74, 
		RULE_t_assignable = 75, RULE_t_catchClause = 76, RULE_t_catchType = 77, 
		RULE_t_finallyBlock = 78, RULE_t_resourceSpecification = 79, RULE_t_resources = 80, 
		RULE_t_resource = 81, RULE_t_switchBlockStatementGroup = 82, RULE_t_switchLabel = 83, 
		RULE_t_forControl = 84, RULE_t_forInit = 85, RULE_t_enhancedForControl = 86, 
		RULE_t_forUpdate = 87, RULE_t_parExpression = 88, RULE_t_expressionList = 89, 
		RULE_t_constantExpression = 90, RULE_t_expression = 91, RULE_t_expressionDetail = 92, 
		RULE_t_primary = 93, RULE_t_creator = 94, RULE_t_createdName = 95, RULE_t_innerCreator = 96, 
		RULE_t_arrayCreatorRest = 97, RULE_t_classCreatorRest = 98, RULE_t_explicitGenericInvocation = 99, 
		RULE_t_nonWildcardTypeArguments = 100, RULE_t_typeArgumentsOrDiamond = 101, 
		RULE_t_nonWildcardTypeArgumentsOrDiamond = 102, RULE_t_superSuffix = 103, 
		RULE_t_explicitGenericInvocationSuffix = 104, RULE_t_arguments = 105, 
		RULE_t_means = 106, RULE_t_idDeclaration = 107, RULE_t_identifier = 108, 
		RULE_t_identifierDetail = 109, RULE_t_valueName = 110, RULE_compilationUnit = 111, 
		RULE_packageDeclaration = 112, RULE_importDeclaration = 113, RULE_typeDeclaration = 114, 
		RULE_modifier = 115, RULE_classOrInterfaceModifier = 116, RULE_variableModifier = 117, 
		RULE_classDeclaration = 118, RULE_typeParameters = 119, RULE_typeParameter = 120, 
		RULE_typeBound = 121, RULE_enumDeclaration = 122, RULE_enumConstants = 123, 
		RULE_enumConstant = 124, RULE_enumBodyDeclarations = 125, RULE_interfaceDeclaration = 126, 
		RULE_typeList = 127, RULE_classBody = 128, RULE_interfaceBody = 129, RULE_classBodyDeclaration = 130, 
		RULE_memberDeclaration = 131, RULE_methodDeclaration = 132, RULE_genericMethodDeclaration = 133, 
		RULE_constructorDeclaration = 134, RULE_genericConstructorDeclaration = 135, 
		RULE_fieldDeclaration = 136, RULE_interfaceBodyDeclaration = 137, RULE_interfaceMemberDeclaration = 138, 
		RULE_constDeclaration = 139, RULE_constantDeclarator = 140, RULE_interfaceMethodDeclaration = 141, 
		RULE_genericInterfaceMethodDeclaration = 142, RULE_variableDeclarators = 143, 
		RULE_variableDeclarator = 144, RULE_variableDeclaratorId = 145, RULE_variableInitializer = 146, 
		RULE_arrayInitializer = 147, RULE_packageOrTypeName = 148, RULE_enumConstantName = 149, 
		RULE_typeName = 150, RULE_type = 151, RULE_classOrInterfaceType = 152, 
		RULE_primitiveType = 153, RULE_typeArguments = 154, RULE_typeArgument = 155, 
		RULE_qualifiedNameList = 156, RULE_formalParameters = 157, RULE_formalParameterList = 158, 
		RULE_formalParameter = 159, RULE_lastFormalParameter = 160, RULE_methodBody = 161, 
		RULE_constructorBody = 162, RULE_qualifiedName = 163, RULE_literal = 164, 
		RULE_annotation = 165, RULE_annotationName = 166, RULE_elementValuePairs = 167, 
		RULE_elementValuePair = 168, RULE_elementValue = 169, RULE_elementValueArrayInitializer = 170, 
		RULE_annotationTypeDeclaration = 171, RULE_annotationTypeBody = 172, RULE_annotationTypeElementDeclaration = 173, 
		RULE_annotationTypeElementRest = 174, RULE_annotationMethodOrConstantRest = 175, 
		RULE_annotationMethodRest = 176, RULE_annotationConstantRest = 177, RULE_defaultValue = 178, 
		RULE_block = 179, RULE_blockStatement = 180, RULE_localVariableDeclarationStatement = 181, 
		RULE_localVariableDeclaration = 182, RULE_statement = 183, RULE_catchClause = 184, 
		RULE_catchType = 185, RULE_finallyBlock = 186, RULE_resourceSpecification = 187, 
		RULE_resources = 188, RULE_resource = 189, RULE_switchBlockStatementGroup = 190, 
		RULE_switchLabel = 191, RULE_forControl = 192, RULE_forInit = 193, RULE_enhancedForControl = 194, 
		RULE_forUpdate = 195, RULE_parExpression = 196, RULE_expressionList = 197, 
		RULE_statementExpression = 198, RULE_constantExpression = 199, RULE_expression = 200, 
		RULE_primary = 201, RULE_creator = 202, RULE_createdName = 203, RULE_innerCreator = 204, 
		RULE_arrayCreatorRest = 205, RULE_classCreatorRest = 206, RULE_explicitGenericInvocation = 207, 
		RULE_nonWildcardTypeArguments = 208, RULE_typeArgumentsOrDiamond = 209, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 210, RULE_superSuffix = 211, 
		RULE_explicitGenericInvocationSuffix = 212, RULE_arguments = 213;
	public static final String[] ruleNames = {
		"t_compilationUnit", "t_packageDeclaration", "t_importDeclaration", "t_typeDeclaration", 
		"t_modifier", "t_classOrInterfaceModifier", "t_variableModifier", "t_classDeclaration", 
		"t_typeParameters", "t_typeParameter", "t_typeBound", "t_enumDeclaration", 
		"t_enumConstants", "t_enumConstant", "t_enumBodyDeclarations", "t_interfaceDeclaration", 
		"t_typeList", "t_classBody", "t_interfaceBody", "t_classBodyDeclaration", 
		"t_initializer", "t_memberDeclaration", "t_methodDeclaration", "t_genericMethodDeclaration", 
		"t_constructorDeclaration", "t_genericConstructorDeclaration", "t_fieldDeclaration", 
		"t_fieldDeclarator", "t_interfaceBodyDeclaration", "t_interfaceMemberDeclaration", 
		"t_constDeclaration", "t_constantDeclarator", "t_interfaceMethodDeclaration", 
		"t_genericInterfaceMethodDeclaration", "t_annotationVariableDeclarator", 
		"t_variableDeclarator", "t_initializedVariableDeclaratorId", "t_uninitializedVariableDeclaratorId", 
		"t_annotationVariableDeclaratorId", "t_variableInitializer", "t_arrayInitializer", 
		"t_packageOrTypeName", "t_enumConstantName", "t_typeName", "t_type", "t_classOrInterfaceType", 
		"t_primitiveType", "t_typeArguments", "t_typeArgument", "t_qualifiedNameList", 
		"t_formalParameters", "t_formalParameterList", "t_formalParameter", "t_lastFormalParameter", 
		"t_methodBody", "t_constructorBody", "t_qualifiedName", "t_literal", "t_annotation", 
		"t_annotationName", "t_elementValuePairs", "t_elementValuePair", "t_elementValue", 
		"t_elementValueArrayInitializer", "t_annotationTypeDeclaration", "t_annotationTypeBody", 
		"t_annotationTypeElementDeclaration", "t_annotationMethodRest", "t_annotationConstantRest", 
		"t_defaultValue", "t_block", "t_nestedBlock", "t_blockStatement", "t_localVariableDeclaration", 
		"t_statement", "t_assignable", "t_catchClause", "t_catchType", "t_finallyBlock", 
		"t_resourceSpecification", "t_resources", "t_resource", "t_switchBlockStatementGroup", 
		"t_switchLabel", "t_forControl", "t_forInit", "t_enhancedForControl", 
		"t_forUpdate", "t_parExpression", "t_expressionList", "t_constantExpression", 
		"t_expression", "t_expressionDetail", "t_primary", "t_creator", "t_createdName", 
		"t_innerCreator", "t_arrayCreatorRest", "t_classCreatorRest", "t_explicitGenericInvocation", 
		"t_nonWildcardTypeArguments", "t_typeArgumentsOrDiamond", "t_nonWildcardTypeArgumentsOrDiamond", 
		"t_superSuffix", "t_explicitGenericInvocationSuffix", "t_arguments", "t_means", 
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
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'means'", "'native'", "'new'", "'package'", 
		"'private'", "'protected'", "'public'", "'return'", "'short'", "'static'", 
		"'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", 
		"'throws'", "'transient'", "'try'", "'void'", "'volatile'", "'while'", 
		null, "'==='", "'==>'", "'<=='", "'=!='", null, null, null, null, null, 
		null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "MEANS", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "BooleanLiteral", 
		"CONJUNCTIVE_BOOLEAN_EQUAL", "CONJUNCTIVE_IMPLIES", "CONJUNCTIVE_CONSEQUENCE", 
		"CONJUNCTIVE_NOT_EQUAL", "UndecoratedIdentifier", "Identifier", "PreValueName", 
		"MidValueName", "PostValueName", "WS", "COMMENT", "LINE_COMMENT", "IntegerLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "AT", "ELLIPSIS"
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
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(428);
				t_packageDeclaration();
				}
				break;
			}
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(431);
				t_importDeclaration();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(437);
				t_typeDeclaration();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
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
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(445);
				t_annotation();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(PACKAGE);
			setState(452);
			t_qualifiedName();
			setState(453);
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
			setState(455);
			match(IMPORT);
			setState(457);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(456);
				match(STATIC);
				}
			}

			setState(459);
			t_qualifiedName();
			setState(462);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(460);
				match(DOT);
				setState(461);
				match(MUL);
				}
			}

			setState(464);
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
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(466);
					t_classOrInterfaceModifier();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(472);
				t_classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(473);
					t_classOrInterfaceModifier();
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(479);
				t_enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(480);
					t_classOrInterfaceModifier();
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(486);
				t_interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						t_classOrInterfaceModifier();
						}
						} 
					}
					setState(492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(493);
				t_annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
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
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				t_classOrInterfaceModifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
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
			setState(503);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				t_annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case TRANSIENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0)) ) {
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
			setState(507);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
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
			setState(509);
			match(CLASS);
			setState(510);
			match(UndecoratedIdentifier);
			setState(512);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(511);
				t_typeParameters();
				}
			}

			setState(516);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(514);
				match(EXTENDS);
				setState(515);
				t_type();
				}
			}

			setState(520);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(518);
				match(IMPLEMENTS);
				setState(519);
				t_typeList();
				}
			}

			setState(522);
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
			setState(524);
			match(LT);
			setState(525);
			t_typeParameter();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(526);
				match(COMMA);
				setState(527);
				t_typeParameter();
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
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
			setState(535);
			match(UndecoratedIdentifier);
			setState(538);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(536);
				match(EXTENDS);
				setState(537);
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
			setState(540);
			t_type();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(541);
				match(BITAND);
				setState(542);
				t_type();
				}
				}
				setState(547);
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
			setState(548);
			match(ENUM);
			setState(549);
			match(UndecoratedIdentifier);
			setState(552);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(550);
				match(IMPLEMENTS);
				setState(551);
				t_typeList();
				}
			}

			setState(554);
			match(LBRACE);
			setState(556);
			_la = _input.LA(1);
			if (_la==UndecoratedIdentifier || _la==AT) {
				{
				setState(555);
				t_enumConstants();
				}
			}

			setState(559);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(558);
				match(COMMA);
				}
			}

			setState(562);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(561);
				t_enumBodyDeclarations();
				}
			}

			setState(564);
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
			setState(566);
			t_enumConstant();
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(567);
					match(COMMA);
					setState(568);
					t_enumConstant();
					}
					} 
				}
				setState(573);
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
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(574);
				t_annotation();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			match(UndecoratedIdentifier);
			setState(582);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(581);
				t_arguments();
				}
			}

			setState(585);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(584);
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
			setState(587);
			match(SEMI);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << UndecoratedIdentifier))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(588);
				t_classBodyDeclaration();
				}
				}
				setState(593);
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
			setState(594);
			match(INTERFACE);
			setState(595);
			match(UndecoratedIdentifier);
			setState(597);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(596);
				t_typeParameters();
				}
			}

			setState(601);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(599);
				match(EXTENDS);
				setState(600);
				t_typeList();
				}
			}

			setState(603);
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
			setState(605);
			t_type();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(606);
				match(COMMA);
				setState(607);
				t_type();
				}
				}
				setState(612);
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
			setState(613);
			match(LBRACE);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << UndecoratedIdentifier))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(614);
				t_classBodyDeclaration();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
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
			setState(622);
			match(LBRACE);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << UndecoratedIdentifier))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (SEMI - 76)) | (1L << (LT - 76)) | (1L << (AT - 76)))) != 0)) {
				{
				{
				setState(623);
				t_interfaceBodyDeclaration();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
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
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(632);
					match(STATIC);
					}
				}

				setState(635);
				t_initializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(636);
						t_modifier();
						}
						} 
					}
					setState(641);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(642);
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
			setState(645);
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
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				t_methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				t_genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				t_fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				t_constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(651);
				t_genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(652);
				t_interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(653);
				t_annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(654);
				t_classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(655);
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
			setState(660);
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
				setState(658);
				t_type();
				}
				break;
			case VOID:
				{
				setState(659);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(662);
			match(UndecoratedIdentifier);
			setState(663);
			t_formalParameters();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(664);
				match(LBRACK);
				setState(665);
				match(RBRACK);
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(671);
				match(THROWS);
				setState(672);
				t_qualifiedNameList();
				}
			}

			setState(677);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(675);
				t_methodBody();
				}
				break;
			case SEMI:
				{
				setState(676);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(680);
			_la = _input.LA(1);
			if (_la==MEANS) {
				{
				setState(679);
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
			setState(682);
			t_typeParameters();
			setState(683);
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
			setState(685);
			match(UndecoratedIdentifier);
			setState(686);
			t_formalParameters();
			setState(689);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(687);
				match(THROWS);
				setState(688);
				t_qualifiedNameList();
				}
			}

			setState(691);
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
			setState(693);
			t_typeParameters();
			setState(694);
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
			setState(696);
			((T_fieldDeclarationContext)_localctx).ty = t_type();
			setState(697);
			t_fieldDeclarator((((T_fieldDeclarationContext)_localctx).ty!=null?_input.getText(((T_fieldDeclarationContext)_localctx).ty.start,((T_fieldDeclarationContext)_localctx).ty.stop):null));
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(698);
				match(COMMA);
				setState(699);
				t_fieldDeclarator((((T_fieldDeclarationContext)_localctx).ty!=null?_input.getText(((T_fieldDeclarationContext)_localctx).ty.start,((T_fieldDeclarationContext)_localctx).ty.stop):null));
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
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
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new InitializedFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				t_idDeclaration(_localctx.idType);
				setState(708);
				match(ASSIGN);
				setState(709);
				t_variableInitializer();
				}
				break;
			case 2:
				_localctx = new UninitializedFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
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
		public T_interfaceMemberDeclarationContext t_interfaceMemberDeclaration() {
			return getRuleContext(T_interfaceMemberDeclarationContext.class,0);
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
			setState(722);
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
			case UndecoratedIdentifier:
			case LT:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(714);
						t_modifier();
						}
						} 
					}
					setState(719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(720);
				t_interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
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

	public static class T_interfaceMemberDeclarationContext extends ParserRuleContext {
		public T_constDeclarationContext t_constDeclaration() {
			return getRuleContext(T_constDeclarationContext.class,0);
		}
		public T_interfaceMethodDeclarationContext t_interfaceMethodDeclaration() {
			return getRuleContext(T_interfaceMethodDeclarationContext.class,0);
		}
		public T_genericInterfaceMethodDeclarationContext t_genericInterfaceMethodDeclaration() {
			return getRuleContext(T_genericInterfaceMethodDeclarationContext.class,0);
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
		public T_interfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_interfaceMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_interfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_interfaceMemberDeclarationContext t_interfaceMemberDeclaration() throws RecognitionException {
		T_interfaceMemberDeclarationContext _localctx = new T_interfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_t_interfaceMemberDeclaration);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				t_constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				t_interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				t_genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				t_interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				t_annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				t_classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(730);
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

	public static class T_constDeclarationContext extends ParserRuleContext {
		public T_typeContext ty;
		public List<T_constantDeclaratorContext> t_constantDeclarator() {
			return getRuleContexts(T_constantDeclaratorContext.class);
		}
		public T_constantDeclaratorContext t_constantDeclarator(int i) {
			return getRuleContext(T_constantDeclaratorContext.class,i);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_constDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_constDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_constDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_constDeclarationContext t_constDeclaration() throws RecognitionException {
		T_constDeclarationContext _localctx = new T_constDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_t_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			((T_constDeclarationContext)_localctx).ty = t_type();
			setState(734);
			t_constantDeclarator((((T_constDeclarationContext)_localctx).ty!=null?_input.getText(((T_constDeclarationContext)_localctx).ty.start,((T_constDeclarationContext)_localctx).ty.stop):null));
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(735);
				match(COMMA);
				setState(736);
				t_constantDeclarator((((T_constDeclarationContext)_localctx).ty!=null?_input.getText(((T_constDeclarationContext)_localctx).ty.start,((T_constDeclarationContext)_localctx).ty.stop):null));
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
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

	public static class T_constantDeclaratorContext extends ParserRuleContext {
		public String idType;
		public T_idDeclarationContext t_idDeclaration() {
			return getRuleContext(T_idDeclarationContext.class,0);
		}
		public T_variableInitializerContext t_variableInitializer() {
			return getRuleContext(T_variableInitializerContext.class,0);
		}
		public T_constantDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public T_constantDeclaratorContext(ParserRuleContext parent, int invokingState, String idType) {
			super(parent, invokingState);
			this.idType = idType;
		}
		@Override public int getRuleIndex() { return RULE_t_constantDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_constantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_constantDeclaratorContext t_constantDeclarator(String idType) throws RecognitionException {
		T_constantDeclaratorContext _localctx = new T_constantDeclaratorContext(_ctx, getState(), idType);
		enterRule(_localctx, 62, RULE_t_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			t_idDeclaration(_localctx.idType);
			setState(745);
			match(ASSIGN);
			setState(746);
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

	public static class T_interfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode UndecoratedIdentifier() { return getToken(TLantlrParser.UndecoratedIdentifier, 0); }
		public T_formalParametersContext t_formalParameters() {
			return getRuleContext(T_formalParametersContext.class,0);
		}
		public T_typeContext t_type() {
			return getRuleContext(T_typeContext.class,0);
		}
		public T_qualifiedNameListContext t_qualifiedNameList() {
			return getRuleContext(T_qualifiedNameListContext.class,0);
		}
		public T_interfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_interfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_interfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_interfaceMethodDeclarationContext t_interfaceMethodDeclaration() throws RecognitionException {
		T_interfaceMethodDeclarationContext _localctx = new T_interfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_t_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
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
				setState(748);
				t_type();
				}
				break;
			case VOID:
				{
				setState(749);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(752);
			match(UndecoratedIdentifier);
			setState(753);
			t_formalParameters();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(754);
				match(LBRACK);
				setState(755);
				match(RBRACK);
				}
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(763);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(761);
				match(THROWS);
				setState(762);
				t_qualifiedNameList();
				}
			}

			setState(765);
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

	public static class T_genericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public T_typeParametersContext t_typeParameters() {
			return getRuleContext(T_typeParametersContext.class,0);
		}
		public T_interfaceMethodDeclarationContext t_interfaceMethodDeclaration() {
			return getRuleContext(T_interfaceMethodDeclarationContext.class,0);
		}
		public T_genericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_genericInterfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_genericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_genericInterfaceMethodDeclarationContext t_genericInterfaceMethodDeclaration() throws RecognitionException {
		T_genericInterfaceMethodDeclarationContext _localctx = new T_genericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_t_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			t_typeParameters();
			setState(768);
			t_interfaceMethodDeclaration();
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
		enterRule(_localctx, 68, RULE_t_annotationVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			t_annotationVariableDeclaratorId();
			setState(771);
			match(ASSIGN);
			setState(772);
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
		enterRule(_localctx, 70, RULE_t_variableDeclarator);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new InitializedVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				t_initializedVariableDeclaratorId(_localctx.idType);
				setState(775);
				match(ASSIGN);
				setState(776);
				t_variableInitializer();
				}
				break;
			case 2:
				_localctx = new UninitializedVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
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
		enterRule(_localctx, 72, RULE_t_initializedVariableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
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
		enterRule(_localctx, 74, RULE_t_uninitializedVariableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
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
		enterRule(_localctx, 76, RULE_t_annotationVariableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			t_identifier();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(786);
				match(LBRACK);
				setState(787);
				match(RBRACK);
				}
				}
				setState(792);
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
		enterRule(_localctx, 78, RULE_t_variableInitializer);
		try {
			setState(795);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				t_arrayInitializer();
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
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
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
		enterRule(_localctx, 80, RULE_t_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(LBRACE);
			setState(809);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
				{
				setState(798);
				t_variableInitializer();
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(799);
						match(COMMA);
						setState(800);
						t_variableInitializer();
						}
						} 
					}
					setState(805);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(807);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(806);
					match(COMMA);
					}
				}

				}
			}

			setState(811);
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
		enterRule(_localctx, 82, RULE_t_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
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
		enterRule(_localctx, 84, RULE_t_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
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
		enterRule(_localctx, 86, RULE_t_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
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
		enterRule(_localctx, 88, RULE_t_type);
		try {
			int _alt;
			setState(835);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				t_classOrInterfaceType();
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(820);
						match(LBRACK);
						setState(821);
						match(RBRACK);
						}
						} 
					}
					setState(826);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
				setState(827);
				t_primitiveType();
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(828);
						match(LBRACK);
						setState(829);
						match(RBRACK);
						}
						} 
					}
					setState(834);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		enterRule(_localctx, 90, RULE_t_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(UndecoratedIdentifier);
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(838);
				t_typeArguments();
				}
				break;
			}
			setState(848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(841);
					match(DOT);
					setState(842);
					match(UndecoratedIdentifier);
					setState(844);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(843);
						t_typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		enterRule(_localctx, 92, RULE_t_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
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
		enterRule(_localctx, 94, RULE_t_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(LT);
			setState(854);
			t_typeArgument();
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(855);
				match(COMMA);
				setState(856);
				t_typeArgument();
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
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
		enterRule(_localctx, 96, RULE_t_typeArgument);
		int _la;
		try {
			setState(870);
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
				setState(864);
				t_type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(QUESTION);
				setState(868);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(866);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(867);
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
		enterRule(_localctx, 98, RULE_t_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			t_qualifiedName();
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(873);
				match(COMMA);
				setState(874);
				t_qualifiedName();
				}
				}
				setState(879);
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
		enterRule(_localctx, 100, RULE_t_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(LPAREN);
			setState(882);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << UndecoratedIdentifier))) != 0) || _la==AT) {
				{
				setState(881);
				t_formalParameterList();
				}
			}

			setState(884);
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
		enterRule(_localctx, 102, RULE_t_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				t_formalParameter();
				setState(891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(887);
						match(COMMA);
						setState(888);
						t_formalParameter();
						}
						} 
					}
					setState(893);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(896);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(894);
					match(COMMA);
					setState(895);
					t_lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
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
		enterRule(_localctx, 104, RULE_t_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(901);
				t_variableModifier();
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
			((T_formalParameterContext)_localctx).ty = t_type();
			setState(908);
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
		enterRule(_localctx, 106, RULE_t_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(910);
				t_variableModifier();
				}
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(916);
			((T_lastFormalParameterContext)_localctx).ty = t_type();
			setState(917);
			match(ELLIPSIS);
			setState(918);
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
		enterRule(_localctx, 108, RULE_t_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
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
		enterRule(_localctx, 110, RULE_t_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
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
		enterRule(_localctx, 112, RULE_t_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			t_identifier();
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(925);
					match(DOT);
					setState(926);
					t_identifier();
					}
					} 
				}
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 114, RULE_t_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BooleanLiteral - 52)) | (1L << (IntegerLiteral - 52)) | (1L << (FloatingPointLiteral - 52)) | (1L << (CharacterLiteral - 52)) | (1L << (StringLiteral - 52)) | (1L << (NullLiteral - 52)))) != 0)) ) {
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
		enterRule(_localctx, 116, RULE_t_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(AT);
			setState(935);
			t_annotationName();
			setState(942);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(936);
				match(LPAREN);
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(937);
					t_elementValuePairs();
					}
					break;
				case 2:
					{
					setState(938);
					t_elementValue();
					}
					break;
				}
				setState(941);
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
		enterRule(_localctx, 118, RULE_t_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
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
		enterRule(_localctx, 120, RULE_t_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			t_elementValuePair();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(947);
				match(COMMA);
				setState(948);
				t_elementValuePair();
				}
				}
				setState(953);
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
		enterRule(_localctx, 122, RULE_t_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(UndecoratedIdentifier);
			setState(955);
			match(ASSIGN);
			setState(956);
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
		enterRule(_localctx, 124, RULE_t_elementValue);
		try {
			setState(961);
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
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				t_expression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(959);
				t_annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
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
		enterRule(_localctx, 126, RULE_t_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(LBRACE);
			setState(972);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				setState(964);
				t_elementValue();
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(965);
						match(COMMA);
						setState(966);
						t_elementValue();
						}
						} 
					}
					setState(971);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				}
			}

			setState(975);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(974);
				match(COMMA);
				}
			}

			setState(977);
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
		enterRule(_localctx, 128, RULE_t_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(AT);
			setState(980);
			match(INTERFACE);
			setState(981);
			match(UndecoratedIdentifier);
			setState(982);
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
		enterRule(_localctx, 130, RULE_t_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(LBRACE);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << UndecoratedIdentifier))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(985);
				t_annotationTypeElementDeclaration();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
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
		enterRule(_localctx, 132, RULE_t_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(1026);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(SEMI);
				}
				break;
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
			case UndecoratedIdentifier:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(994);
						t_modifier();
						}
						} 
					}
					setState(999);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(1000);
					t_type();
					setState(1001);
					t_annotationMethodRest();
					setState(1002);
					match(SEMI);
					}
					break;
				case 2:
					{
					setState(1004);
					t_type();
					setState(1005);
					t_annotationConstantRest();
					setState(1006);
					match(SEMI);
					}
					break;
				case 3:
					{
					setState(1008);
					t_classDeclaration();
					setState(1010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(1009);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 4:
					{
					setState(1012);
					t_interfaceDeclaration();
					setState(1014);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(1013);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 5:
					{
					setState(1016);
					t_enumDeclaration();
					setState(1018);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(1017);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 6:
					{
					setState(1020);
					t_annotationTypeDeclaration();
					setState(1022);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(1021);
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
		enterRule(_localctx, 134, RULE_t_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(UndecoratedIdentifier);
			setState(1029);
			match(LPAREN);
			setState(1030);
			match(RPAREN);
			setState(1032);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1031);
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
		enterRule(_localctx, 136, RULE_t_annotationConstantRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			t_annotationVariableDeclarator();
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1035);
				match(COMMA);
				setState(1036);
				t_annotationVariableDeclarator();
				}
				}
				setState(1041);
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
		enterRule(_localctx, 138, RULE_t_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(DEFAULT);
			setState(1043);
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
		enterRule(_localctx, 140, RULE_t_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(LBRACE);
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << MEANS) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(1046);
				t_blockStatement();
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1052);
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

	public static class T_nestedBlockContext extends ParserRuleContext {
		public T_blockContext t_block() {
			return getRuleContext(T_blockContext.class,0);
		}
		public T_statementContext t_statement() {
			return getRuleContext(T_statementContext.class,0);
		}
		public T_nestedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_nestedBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitT_nestedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_nestedBlockContext t_nestedBlock() throws RecognitionException {
		T_nestedBlockContext _localctx = new T_nestedBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_t_nestedBlock);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				t_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
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

	public static class T_blockStatementContext extends ParserRuleContext {
		public T_localVariableDeclarationContext t_localVariableDeclaration() {
			return getRuleContext(T_localVariableDeclarationContext.class,0);
		}
		public T_statementContext t_statement() {
			return getRuleContext(T_statementContext.class,0);
		}
		public T_typeDeclarationContext t_typeDeclaration() {
			return getRuleContext(T_typeDeclarationContext.class,0);
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
		enterRule(_localctx, 144, RULE_t_blockStatement);
		try {
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				t_localVariableDeclaration();
				setState(1059);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				t_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1062);
				t_typeDeclaration();
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
		enterRule(_localctx, 146, RULE_t_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1065);
				t_variableModifier();
				}
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
			((T_localVariableDeclarationContext)_localctx).ty = t_type();
			setState(1072);
			t_variableDeclarator((((T_localVariableDeclarationContext)_localctx).ty!=null?_input.getText(((T_localVariableDeclarationContext)_localctx).ty.start,((T_localVariableDeclarationContext)_localctx).ty.stop):null));
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1073);
				match(COMMA);
				setState(1074);
				t_variableDeclarator((((T_localVariableDeclarationContext)_localctx).ty!=null?_input.getText(((T_localVariableDeclarationContext)_localctx).ty.start,((T_localVariableDeclarationContext)_localctx).ty.stop):null));
				}
				}
				setState(1079);
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
		public List<T_nestedBlockContext> t_nestedBlock() {
			return getRuleContexts(T_nestedBlockContext.class);
		}
		public T_nestedBlockContext t_nestedBlock(int i) {
			return getRuleContext(T_nestedBlockContext.class,i);
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
		public T_nestedBlockContext t_nestedBlock() {
			return getRuleContext(T_nestedBlockContext.class,0);
		}
		public WhileStmtContext(T_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLantlrVisitor ) return ((TLantlrVisitor<? extends T>)visitor).visitWhileStmt(this);
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
		public T_nestedBlockContext t_nestedBlock() {
			return getRuleContext(T_nestedBlockContext.class,0);
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
		public T_nestedBlockContext t_nestedBlock() {
			return getRuleContext(T_nestedBlockContext.class,0);
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
		enterRule(_localctx, 148, RULE_t_statement);
		int _la;
		try {
			int _alt;
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				t_block();
				}
				break;
			case 2:
				_localctx = new AssertStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				match(ASSERT);
				setState(1082);
				t_expression();
				setState(1085);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1083);
					match(COLON);
					setState(1084);
					t_expression();
					}
				}

				setState(1087);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
				match(IF);
				setState(1090);
				t_parExpression();
				setState(1091);
				t_nestedBlock();
				setState(1094);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1092);
					match(ELSE);
					setState(1093);
					t_nestedBlock();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1096);
				match(FOR);
				setState(1097);
				match(LPAREN);
				setState(1098);
				t_forControl();
				setState(1099);
				match(RPAREN);
				setState(1100);
				t_nestedBlock();
				}
				break;
			case 5:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1102);
				match(WHILE);
				setState(1103);
				t_parExpression();
				setState(1104);
				t_nestedBlock();
				}
				break;
			case 6:
				_localctx = new DoStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1106);
				match(DO);
				setState(1107);
				t_nestedBlock();
				setState(1108);
				match(WHILE);
				setState(1109);
				t_parExpression();
				setState(1110);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new TryStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1112);
				match(TRY);
				setState(1113);
				t_block();
				setState(1123);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1114);
						t_catchClause();
						}
						}
						setState(1117); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1120);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1119);
						t_finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1122);
					t_finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				_localctx = new TryStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1125);
				match(TRY);
				setState(1126);
				t_resourceSpecification();
				setState(1127);
				t_block();
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1128);
					t_catchClause();
					}
					}
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1135);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1134);
					t_finallyBlock();
					}
				}

				}
				break;
			case 9:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1137);
				match(SWITCH);
				setState(1138);
				t_parExpression();
				setState(1139);
				match(LBRACE);
				setState(1143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1140);
						t_switchBlockStatementGroup();
						}
						} 
					}
					setState(1145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1146);
					t_switchLabel();
					}
					}
					setState(1151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1152);
				match(RBRACE);
				}
				break;
			case 10:
				_localctx = new SyncStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1154);
				match(SYNCHRONIZED);
				setState(1155);
				t_parExpression();
				setState(1156);
				t_block();
				}
				break;
			case 11:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1158);
				match(RETURN);
				setState(1160);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(1159);
					t_expression();
					}
				}

				setState(1162);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new ThrowStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1163);
				match(THROW);
				setState(1164);
				t_expression();
				setState(1165);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1167);
				match(BREAK);
				setState(1169);
				_la = _input.LA(1);
				if (_la==UndecoratedIdentifier) {
					{
					setState(1168);
					match(UndecoratedIdentifier);
					}
				}

				setState(1171);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1172);
				match(CONTINUE);
				setState(1174);
				_la = _input.LA(1);
				if (_la==UndecoratedIdentifier) {
					{
					setState(1173);
					match(UndecoratedIdentifier);
					}
				}

				setState(1176);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1177);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1178);
				t_assignable();
				setState(1179);
				match(ASSIGN);
				setState(1180);
				t_expression();
				setState(1181);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new CallStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1183);
				t_expression();
				setState(1184);
				match(LPAREN);
				setState(1186);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(1185);
					t_expressionList();
					}
				}

				setState(1188);
				match(RPAREN);
				setState(1189);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new CreationStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1191);
				t_expression();
				setState(1192);
				match(DOT);
				setState(1193);
				match(NEW);
				setState(1195);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1194);
					t_nonWildcardTypeArguments();
					}
				}

				setState(1197);
				t_innerCreator();
				}
				break;
			case 19:
				_localctx = new LabelStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1199);
				match(UndecoratedIdentifier);
				setState(1200);
				match(COLON);
				setState(1201);
				t_statement();
				}
				break;
			case 20:
				_localctx = new MeansStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1202);
				t_means();
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
		enterRule(_localctx, 150, RULE_t_assignable);
		try {
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				t_expression();
				setState(1206);
				match(LBRACK);
				setState(1207);
				t_expression();
				setState(1208);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
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
		enterRule(_localctx, 152, RULE_t_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(CATCH);
			setState(1214);
			match(LPAREN);
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1215);
				t_variableModifier();
				}
				}
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1221);
			t_catchType();
			setState(1222);
			t_identifier();
			setState(1223);
			match(RPAREN);
			setState(1224);
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
		enterRule(_localctx, 154, RULE_t_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			t_qualifiedName();
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1227);
				match(BITOR);
				setState(1228);
				t_qualifiedName();
				}
				}
				setState(1233);
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
		enterRule(_localctx, 156, RULE_t_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(FINALLY);
			setState(1235);
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
		enterRule(_localctx, 158, RULE_t_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(LPAREN);
			setState(1238);
			t_resources();
			setState(1240);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1239);
				match(SEMI);
				}
			}

			setState(1242);
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
		enterRule(_localctx, 160, RULE_t_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			t_resource();
			setState(1249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1245);
					match(SEMI);
					setState(1246);
					t_resource();
					}
					} 
				}
				setState(1251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
		enterRule(_localctx, 162, RULE_t_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1252);
				t_variableModifier();
				}
				}
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1258);
			((T_resourceContext)_localctx).ty = t_classOrInterfaceType();
			setState(1259);
			t_initializedVariableDeclaratorId((((T_resourceContext)_localctx).ty!=null?_input.getText(((T_resourceContext)_localctx).ty.start,((T_resourceContext)_localctx).ty.stop):null));
			setState(1260);
			match(ASSIGN);
			setState(1261);
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
		enterRule(_localctx, 164, RULE_t_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1263);
				t_switchLabel();
				}
				}
				setState(1266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1268);
				t_blockStatement();
				}
				}
				setState(1271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << MEANS) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0) );
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
		enterRule(_localctx, 166, RULE_t_switchLabel);
		try {
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				match(CASE);
				setState(1274);
				t_constantExpression();
				setState(1275);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				match(CASE);
				setState(1278);
				t_enumConstantName();
				setState(1279);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1281);
				match(DEFAULT);
				setState(1282);
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
		enterRule(_localctx, 168, RULE_t_forControl);
		int _la;
		try {
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285);
				t_enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
					{
					setState(1286);
					t_forInit();
					}
				}

				setState(1289);
				match(SEMI);
				setState(1291);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(1290);
					t_expression();
					}
				}

				setState(1293);
				match(SEMI);
				setState(1295);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(1294);
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
		enterRule(_localctx, 170, RULE_t_forInit);
		try {
			setState(1301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299);
				t_localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
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
		enterRule(_localctx, 172, RULE_t_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1303);
				t_variableModifier();
				}
				}
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1309);
			t_type();
			setState(1310);
			t_identifier();
			setState(1311);
			match(COLON);
			setState(1312);
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
		enterRule(_localctx, 174, RULE_t_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
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
		enterRule(_localctx, 176, RULE_t_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(LPAREN);
			setState(1317);
			t_expression();
			setState(1318);
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
		enterRule(_localctx, 178, RULE_t_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			t_expression();
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1321);
				match(COMMA);
				setState(1322);
				t_expression();
				}
				}
				setState(1327);
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
		enterRule(_localctx, 180, RULE_t_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
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
		enterRule(_localctx, 182, RULE_t_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
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
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_t_expressionDetail, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1333);
				t_primary();
				}
				break;
			case 2:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1334);
				match(NEW);
				setState(1335);
				t_creator();
				}
				break;
			case 3:
				{
				_localctx = new TypeCastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1336);
				match(LPAREN);
				setState(1337);
				t_type();
				setState(1338);
				match(RPAREN);
				setState(1339);
				t_expressionDetail(16);
				}
				break;
			case 4:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1341);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1342);
				t_expressionDetail(15);
				}
				break;
			case 5:
				{
				_localctx = new BitComplementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1343);
				match(TILDE);
				setState(1344);
				t_expressionDetail(14);
				}
				break;
			case 6:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1345);
				match(BANG);
				setState(1346);
				t_expressionDetail(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1349);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1350);
						_la = _input.LA(1);
						if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (MUL - 96)) | (1L << (DIV - 96)) | (1L << (MOD - 96)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1351);
						t_expressionDetail(13);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1352);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1353);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1354);
						t_expressionDetail(12);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1355);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1363);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
						case 1:
							{
							setState(1356);
							match(LT);
							setState(1357);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1358);
							match(GT);
							setState(1359);
							match(GT);
							setState(1360);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1361);
							match(GT);
							setState(1362);
							match(GT);
							}
							break;
						}
						setState(1365);
						t_expressionDetail(11);
						}
						break;
					case 4:
						{
						_localctx = new ConjRelationExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1366);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1367);
						((ConjRelationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ASSIGN - 79)) | (1L << (GT - 79)) | (1L << (LT - 79)) | (1L << (LE - 79)) | (1L << (GE - 79)) | (1L << (NOTEQUAL - 79)))) != 0)) ) {
							((ConjRelationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1368);
						t_expressionDetail(10);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1369);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1370);
						match(BITAND);
						setState(1371);
						t_expressionDetail(8);
						}
						break;
					case 6:
						{
						_localctx = new ExclusiveOrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1372);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1373);
						match(CARET);
						setState(1374);
						t_expressionDetail(7);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1375);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1376);
						match(BITOR);
						setState(1377);
						t_expressionDetail(6);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalAndExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1378);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1379);
						match(AND);
						setState(1380);
						t_expressionDetail(5);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalOrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1381);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1382);
						match(OR);
						setState(1383);
						t_expressionDetail(4);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1384);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1385);
						match(QUESTION);
						setState(1386);
						t_expressionDetail(0);
						setState(1387);
						match(COLON);
						setState(1388);
						t_expressionDetail(3);
						}
						break;
					case 11:
						{
						_localctx = new ConjunctiveBoolExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1390);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1391);
						((ConjunctiveBoolExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONJUNCTIVE_BOOLEAN_EQUAL) | (1L << CONJUNCTIVE_IMPLIES) | (1L << CONJUNCTIVE_CONSEQUENCE) | (1L << CONJUNCTIVE_NOT_EQUAL))) != 0)) ) {
							((ConjunctiveBoolExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1392);
						t_expressionDetail(2);
						}
						break;
					case 12:
						{
						_localctx = new DotExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1393);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1394);
						match(DOT);
						setState(1395);
						t_identifier();
						}
						break;
					case 13:
						{
						_localctx = new DotThisExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1396);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1397);
						match(DOT);
						setState(1398);
						match(THIS);
						}
						break;
					case 14:
						{
						_localctx = new DotNewExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1399);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1400);
						match(DOT);
						setState(1401);
						match(NEW);
						setState(1403);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1402);
							t_nonWildcardTypeArguments();
							}
						}

						setState(1405);
						t_innerCreator();
						}
						break;
					case 15:
						{
						_localctx = new DotSuperExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1406);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1407);
						match(DOT);
						setState(1408);
						match(SUPER);
						setState(1409);
						t_superSuffix();
						}
						break;
					case 16:
						{
						_localctx = new DotExplicitGenericExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1410);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1411);
						match(DOT);
						setState(1412);
						t_explicitGenericInvocation();
						}
						break;
					case 17:
						{
						_localctx = new ArrayExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1413);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1414);
						match(LBRACK);
						setState(1415);
						t_expressionDetail(0);
						setState(1416);
						match(RBRACK);
						}
						break;
					case 18:
						{
						_localctx = new FuncCallExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1418);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1419);
						match(LPAREN);
						setState(1428);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
							{
							setState(1420);
							t_expressionDetail(0);
							setState(1425);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(1421);
								match(COMMA);
								setState(1422);
								t_expressionDetail(0);
								}
								}
								setState(1427);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(1430);
						match(RPAREN);
						}
						break;
					case 19:
						{
						_localctx = new InstanceOfExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1431);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1432);
						match(INSTANCEOF);
						setState(1433);
						t_type();
						}
						break;
					}
					} 
				}
				setState(1438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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
		public T_expressionContext t_expression() {
			return getRuleContext(T_expressionContext.class,0);
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
		enterRule(_localctx, 186, RULE_t_primary);
		try {
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				match(LPAREN);
				setState(1440);
				t_expression();
				setState(1441);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1444);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1445);
				t_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1446);
				t_identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1447);
				t_type();
				setState(1448);
				match(DOT);
				setState(1449);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1451);
				match(VOID);
				setState(1452);
				match(DOT);
				setState(1453);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1454);
				t_nonWildcardTypeArguments();
				setState(1458);
				switch (_input.LA(1)) {
				case SUPER:
				case UndecoratedIdentifier:
				case PreValueName:
				case MidValueName:
				case PostValueName:
					{
					setState(1455);
					t_explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1456);
					match(THIS);
					setState(1457);
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
		enterRule(_localctx, 188, RULE_t_creator);
		try {
			setState(1471);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				t_nonWildcardTypeArguments();
				setState(1463);
				t_createdName();
				setState(1464);
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
				setState(1466);
				t_createdName();
				setState(1469);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1467);
					t_arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1468);
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
		enterRule(_localctx, 190, RULE_t_createdName);
		int _la;
		try {
			setState(1488);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				t_identifier();
				setState(1475);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1474);
					t_typeArgumentsOrDiamond();
					}
				}

				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1477);
					match(DOT);
					setState(1478);
					t_identifier();
					setState(1480);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1479);
						t_typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1486);
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
				setState(1487);
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
		enterRule(_localctx, 192, RULE_t_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			t_identifier();
			setState(1492);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1491);
				t_nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1494);
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
		enterRule(_localctx, 194, RULE_t_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			match(LBRACK);
			setState(1524);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1497);
				match(RBRACK);
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1498);
					match(LBRACK);
					setState(1499);
					match(RBRACK);
					}
					}
					setState(1504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1505);
				t_arrayInitializer();
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
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case ADD:
			case SUB:
				{
				setState(1506);
				t_expression();
				setState(1507);
				match(RBRACK);
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1508);
						match(LBRACK);
						setState(1509);
						t_expression();
						setState(1510);
						match(RBRACK);
						}
						} 
					}
					setState(1516);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				setState(1521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1517);
						match(LBRACK);
						setState(1518);
						match(RBRACK);
						}
						} 
					}
					setState(1523);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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
		enterRule(_localctx, 196, RULE_t_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			t_arguments();
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1527);
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
		enterRule(_localctx, 198, RULE_t_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			t_nonWildcardTypeArguments();
			setState(1531);
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
		enterRule(_localctx, 200, RULE_t_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(LT);
			setState(1534);
			t_typeList();
			setState(1535);
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
		enterRule(_localctx, 202, RULE_t_typeArgumentsOrDiamond);
		try {
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537);
				match(LT);
				setState(1538);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1539);
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
		enterRule(_localctx, 204, RULE_t_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				match(LT);
				setState(1543);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1544);
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
		enterRule(_localctx, 206, RULE_t_superSuffix);
		try {
			setState(1553);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				t_arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1548);
				match(DOT);
				setState(1549);
				t_identifier();
				setState(1551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1550);
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
		enterRule(_localctx, 208, RULE_t_explicitGenericInvocationSuffix);
		try {
			setState(1560);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1555);
				match(SUPER);
				setState(1556);
				t_superSuffix();
				}
				break;
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1557);
				t_identifier();
				setState(1558);
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
		enterRule(_localctx, 210, RULE_t_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(LPAREN);
			setState(1564);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
				{
				setState(1563);
				t_expressionList();
				}
			}

			setState(1566);
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
		enterRule(_localctx, 212, RULE_t_means);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			match(MEANS);
			setState(1569);
			match(LPAREN);
			setState(1570);
			t_expression();
			setState(1571);
			match(RPAREN);
			setState(1572);
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
		enterRule(_localctx, 214, RULE_t_idDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
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
		enterRule(_localctx, 216, RULE_t_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
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
		enterRule(_localctx, 218, RULE_t_identifierDetail);
		try {
			setState(1582);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
				_localctx = new T_UndecoratedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1578);
				match(UndecoratedIdentifier);
				}
				break;
			case PreValueName:
				_localctx = new T_PreValueNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				match(PreValueName);
				}
				break;
			case MidValueName:
				_localctx = new T_MidValueNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1580);
				match(MidValueName);
				}
				break;
			case PostValueName:
				_localctx = new T_PostValueNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1581);
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
		enterRule(_localctx, 220, RULE_t_valueName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0)) ) {
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
		enterRule(_localctx, 222, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1586);
				packageDeclaration();
				}
				break;
			}
			setState(1592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(1589);
				importDeclaration();
				}
				}
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(1595);
				typeDeclaration();
				}
				}
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1601);
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
		enterRule(_localctx, 224, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1603);
				annotation();
				}
				}
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1609);
			match(PACKAGE);
			setState(1610);
			qualifiedName();
			setState(1611);
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
		enterRule(_localctx, 226, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			match(IMPORT);
			setState(1615);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1614);
				match(STATIC);
				}
			}

			setState(1617);
			qualifiedName();
			setState(1620);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1618);
				match(DOT);
				setState(1619);
				match(MUL);
				}
			}

			setState(1622);
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
		enterRule(_localctx, 228, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1624);
					classOrInterfaceModifier();
					}
					}
					setState(1629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1630);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1631);
					classOrInterfaceModifier();
					}
					}
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1637);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1638);
					classOrInterfaceModifier();
					}
					}
					setState(1643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1644);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1645);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1651);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1652);
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
		enterRule(_localctx, 230, RULE_modifier);
		int _la;
		try {
			setState(1657);
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
				setState(1655);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
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
		enterRule(_localctx, 232, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(1661);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
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
				setState(1660);
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
		enterRule(_localctx, 234, RULE_variableModifier);
		try {
			setState(1665);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
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
		enterRule(_localctx, 236, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(CLASS);
			setState(1668);
			match(Identifier);
			setState(1670);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1669);
				typeParameters();
				}
			}

			setState(1674);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1672);
				match(EXTENDS);
				setState(1673);
				type();
				}
			}

			setState(1678);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1676);
				match(IMPLEMENTS);
				setState(1677);
				typeList();
				}
			}

			setState(1680);
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
		enterRule(_localctx, 238, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(LT);
			setState(1683);
			typeParameter();
			setState(1688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1684);
				match(COMMA);
				setState(1685);
				typeParameter();
				}
				}
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1691);
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
		enterRule(_localctx, 240, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(Identifier);
			setState(1696);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1694);
				match(EXTENDS);
				setState(1695);
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
		enterRule(_localctx, 242, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			type();
			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1699);
				match(BITAND);
				setState(1700);
				type();
				}
				}
				setState(1705);
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
		enterRule(_localctx, 244, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(ENUM);
			setState(1707);
			match(Identifier);
			setState(1710);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1708);
				match(IMPLEMENTS);
				setState(1709);
				typeList();
				}
			}

			setState(1712);
			match(LBRACE);
			setState(1714);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1713);
				enumConstants();
				}
			}

			setState(1717);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1716);
				match(COMMA);
				}
			}

			setState(1720);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1719);
				enumBodyDeclarations();
				}
			}

			setState(1722);
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
		enterRule(_localctx, 246, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			enumConstant();
			setState(1729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1725);
					match(COMMA);
					setState(1726);
					enumConstant();
					}
					} 
				}
				setState(1731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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
		enterRule(_localctx, 248, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1732);
				annotation();
				}
				}
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1738);
			match(Identifier);
			setState(1740);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1739);
				arguments();
				}
			}

			setState(1743);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1742);
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
		enterRule(_localctx, 250, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			match(SEMI);
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << Identifier))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(1746);
				classBodyDeclaration();
				}
				}
				setState(1751);
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
		enterRule(_localctx, 252, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(INTERFACE);
			setState(1753);
			match(Identifier);
			setState(1755);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1754);
				typeParameters();
				}
			}

			setState(1759);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1757);
				match(EXTENDS);
				setState(1758);
				typeList();
				}
			}

			setState(1761);
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
		enterRule(_localctx, 254, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			type();
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1764);
				match(COMMA);
				setState(1765);
				type();
				}
				}
				setState(1770);
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
		enterRule(_localctx, 256, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(LBRACE);
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << Identifier))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(1772);
				classBodyDeclaration();
				}
				}
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1778);
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
		enterRule(_localctx, 258, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			match(LBRACE);
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << Identifier))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (SEMI - 76)) | (1L << (LT - 76)) | (1L << (AT - 76)))) != 0)) {
				{
				{
				setState(1781);
				interfaceBodyDeclaration();
				}
				}
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1787);
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
		enterRule(_localctx, 260, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1791);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(1790);
					match(STATIC);
					}
				}

				setState(1793);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1794);
						modifier();
						}
						} 
					}
					setState(1799);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				setState(1800);
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
		enterRule(_localctx, 262, RULE_memberDeclaration);
		try {
			setState(1812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1805);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1806);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1807);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1808);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1809);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1810);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1811);
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
		enterRule(_localctx, 264, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
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
				setState(1814);
				type();
				}
				break;
			case VOID:
				{
				setState(1815);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1818);
			match(Identifier);
			setState(1819);
			formalParameters();
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1820);
				match(LBRACK);
				setState(1821);
				match(RBRACK);
				}
				}
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1829);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1827);
				match(THROWS);
				setState(1828);
				qualifiedNameList();
				}
			}

			setState(1833);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(1831);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(1832);
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
		enterRule(_localctx, 266, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			typeParameters();
			setState(1836);
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
		enterRule(_localctx, 268, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			match(Identifier);
			setState(1839);
			formalParameters();
			setState(1842);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1840);
				match(THROWS);
				setState(1841);
				qualifiedNameList();
				}
			}

			setState(1844);
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
		enterRule(_localctx, 270, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			typeParameters();
			setState(1847);
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
		enterRule(_localctx, 272, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			type();
			setState(1850);
			variableDeclarators();
			setState(1851);
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
		enterRule(_localctx, 274, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(1861);
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
				setState(1856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1853);
						modifier();
						}
						} 
					}
					setState(1858);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				}
				setState(1859);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1860);
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
		enterRule(_localctx, 276, RULE_interfaceMemberDeclaration);
		try {
			setState(1870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1863);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1864);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1865);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1866);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1867);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1868);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1869);
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
		enterRule(_localctx, 278, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			type();
			setState(1873);
			constantDeclarator();
			setState(1878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1874);
				match(COMMA);
				setState(1875);
				constantDeclarator();
				}
				}
				setState(1880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1881);
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
		enterRule(_localctx, 280, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			match(Identifier);
			setState(1888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1884);
				match(LBRACK);
				setState(1885);
				match(RBRACK);
				}
				}
				setState(1890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1891);
			match(ASSIGN);
			setState(1892);
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
		enterRule(_localctx, 282, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
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
				setState(1894);
				type();
				}
				break;
			case VOID:
				{
				setState(1895);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1898);
			match(Identifier);
			setState(1899);
			formalParameters();
			setState(1904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1900);
				match(LBRACK);
				setState(1901);
				match(RBRACK);
				}
				}
				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1909);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1907);
				match(THROWS);
				setState(1908);
				qualifiedNameList();
				}
			}

			setState(1911);
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
		enterRule(_localctx, 284, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			typeParameters();
			setState(1914);
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
		enterRule(_localctx, 286, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			variableDeclarator();
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1917);
				match(COMMA);
				setState(1918);
				variableDeclarator();
				}
				}
				setState(1923);
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
		enterRule(_localctx, 288, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
			variableDeclaratorId();
			setState(1927);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1925);
				match(ASSIGN);
				setState(1926);
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
		enterRule(_localctx, 290, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(Identifier);
			setState(1934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1930);
				match(LBRACK);
				setState(1931);
				match(RBRACK);
				}
				}
				setState(1936);
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
		enterRule(_localctx, 292, RULE_variableInitializer);
		try {
			setState(1939);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1937);
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
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
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
				setState(1938);
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
		enterRule(_localctx, 294, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			match(LBRACE);
			setState(1953);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
				{
				setState(1942);
				variableInitializer();
				setState(1947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1943);
						match(COMMA);
						setState(1944);
						variableInitializer();
						}
						} 
					}
					setState(1949);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				}
				setState(1951);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1950);
					match(COMMA);
					}
				}

				}
			}

			setState(1955);
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
		enterRule(_localctx, 296, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
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
		enterRule(_localctx, 298, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
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
		enterRule(_localctx, 300, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
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
		enterRule(_localctx, 302, RULE_type);
		try {
			int _alt;
			setState(1979);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1963);
				classOrInterfaceType();
				setState(1968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1964);
						match(LBRACK);
						setState(1965);
						match(RBRACK);
						}
						} 
					}
					setState(1970);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
				setState(1971);
				primitiveType();
				setState(1976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1972);
						match(LBRACK);
						setState(1973);
						match(RBRACK);
						}
						} 
					}
					setState(1978);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
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
		enterRule(_localctx, 304, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			match(Identifier);
			setState(1983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1982);
				typeArguments();
				}
				break;
			}
			setState(1992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1985);
					match(DOT);
					setState(1986);
					match(Identifier);
					setState(1988);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1987);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(1994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
		enterRule(_localctx, 306, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
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
		enterRule(_localctx, 308, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			match(LT);
			setState(1998);
			typeArgument();
			setState(2003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1999);
				match(COMMA);
				setState(2000);
				typeArgument();
				}
				}
				setState(2005);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2006);
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
		enterRule(_localctx, 310, RULE_typeArgument);
		int _la;
		try {
			setState(2014);
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
				setState(2008);
				type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(2009);
				match(QUESTION);
				setState(2012);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(2010);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2011);
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
		enterRule(_localctx, 312, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			qualifiedName();
			setState(2021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2017);
				match(COMMA);
				setState(2018);
				qualifiedName();
				}
				}
				setState(2023);
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
		enterRule(_localctx, 314, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			match(LPAREN);
			setState(2026);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << Identifier))) != 0) || _la==AT) {
				{
				setState(2025);
				formalParameterList();
				}
			}

			setState(2028);
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
		enterRule(_localctx, 316, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(2043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2030);
				formalParameter();
				setState(2035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2031);
						match(COMMA);
						setState(2032);
						formalParameter();
						}
						} 
					}
					setState(2037);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				}
				setState(2040);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2038);
					match(COMMA);
					setState(2039);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
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
		enterRule(_localctx, 318, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2045);
				variableModifier();
				}
				}
				setState(2050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2051);
			type();
			setState(2052);
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
		enterRule(_localctx, 320, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2054);
				variableModifier();
				}
				}
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2060);
			type();
			setState(2061);
			match(ELLIPSIS);
			setState(2062);
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
		enterRule(_localctx, 322, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
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
		enterRule(_localctx, 324, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
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
		enterRule(_localctx, 326, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			match(Identifier);
			setState(2073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2069);
					match(DOT);
					setState(2070);
					match(Identifier);
					}
					} 
				}
				setState(2075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
		enterRule(_localctx, 328, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2076);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BooleanLiteral - 52)) | (1L << (IntegerLiteral - 52)) | (1L << (FloatingPointLiteral - 52)) | (1L << (CharacterLiteral - 52)) | (1L << (StringLiteral - 52)) | (1L << (NullLiteral - 52)))) != 0)) ) {
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
		enterRule(_localctx, 330, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(AT);
			setState(2079);
			annotationName();
			setState(2086);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2080);
				match(LPAREN);
				setState(2083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2081);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(2082);
					elementValue();
					}
					break;
				}
				setState(2085);
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
		enterRule(_localctx, 332, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
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
		enterRule(_localctx, 334, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090);
			elementValuePair();
			setState(2095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2091);
				match(COMMA);
				setState(2092);
				elementValuePair();
				}
				}
				setState(2097);
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
		enterRule(_localctx, 336, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			match(Identifier);
			setState(2099);
			match(ASSIGN);
			setState(2100);
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
		enterRule(_localctx, 338, RULE_elementValue);
		try {
			setState(2105);
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
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
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
				setState(2102);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2103);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2104);
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
		enterRule(_localctx, 340, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			match(LBRACE);
			setState(2116);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				setState(2108);
				elementValue();
				setState(2113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2109);
						match(COMMA);
						setState(2110);
						elementValue();
						}
						} 
					}
					setState(2115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				}
				}
			}

			setState(2119);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2118);
				match(COMMA);
				}
			}

			setState(2121);
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
		enterRule(_localctx, 342, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			match(AT);
			setState(2124);
			match(INTERFACE);
			setState(2125);
			match(Identifier);
			setState(2126);
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
		enterRule(_localctx, 344, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			match(LBRACE);
			setState(2132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << Identifier))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(2129);
				annotationTypeElementDeclaration();
				}
				}
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2135);
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
		enterRule(_localctx, 346, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(2145);
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
				setState(2140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2137);
						modifier();
						}
						} 
					}
					setState(2142);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
				}
				setState(2143);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2144);
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
		enterRule(_localctx, 348, RULE_annotationTypeElementRest);
		try {
			setState(2167);
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
				setState(2147);
				type();
				setState(2148);
				annotationMethodOrConstantRest();
				setState(2149);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2151);
				classDeclaration();
				setState(2153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2152);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2155);
				interfaceDeclaration();
				setState(2157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2156);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(2159);
				enumDeclaration();
				setState(2161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2160);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2163);
				annotationTypeDeclaration();
				setState(2165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2164);
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
		enterRule(_localctx, 350, RULE_annotationMethodOrConstantRest);
		try {
			setState(2171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2169);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2170);
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
		enterRule(_localctx, 352, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			match(Identifier);
			setState(2174);
			match(LPAREN);
			setState(2175);
			match(RPAREN);
			setState(2177);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2176);
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
		enterRule(_localctx, 354, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 356, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
			match(DEFAULT);
			setState(2182);
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
		enterRule(_localctx, 358, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			match(LBRACE);
			setState(2188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(2185);
				blockStatement();
				}
				}
				setState(2190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2191);
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
		enterRule(_localctx, 360, RULE_blockStatement);
		try {
			setState(2196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2193);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2194);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2195);
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
		enterRule(_localctx, 362, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2198);
			localVariableDeclaration();
			setState(2199);
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
		enterRule(_localctx, 364, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2201);
				variableModifier();
				}
				}
				setState(2206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2207);
			type();
			setState(2208);
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
		enterRule(_localctx, 366, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(2314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2210);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2211);
				match(ASSERT);
				setState(2212);
				expression(0);
				setState(2215);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(2213);
					match(COLON);
					setState(2214);
					expression(0);
					}
				}

				setState(2217);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2219);
				match(IF);
				setState(2220);
				parExpression();
				setState(2221);
				statement();
				setState(2224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2222);
					match(ELSE);
					setState(2223);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2226);
				match(FOR);
				setState(2227);
				match(LPAREN);
				setState(2228);
				forControl();
				setState(2229);
				match(RPAREN);
				setState(2230);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2232);
				match(WHILE);
				setState(2233);
				parExpression();
				setState(2234);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2236);
				match(DO);
				setState(2237);
				statement();
				setState(2238);
				match(WHILE);
				setState(2239);
				parExpression();
				setState(2240);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2242);
				match(TRY);
				setState(2243);
				block();
				setState(2253);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(2245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2244);
						catchClause();
						}
						}
						setState(2247); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(2250);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(2249);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(2252);
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
				setState(2255);
				match(TRY);
				setState(2256);
				resourceSpecification();
				setState(2257);
				block();
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(2258);
					catchClause();
					}
					}
					setState(2263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2265);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(2264);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2267);
				match(SWITCH);
				setState(2268);
				parExpression();
				setState(2269);
				match(LBRACE);
				setState(2273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2270);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(2275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				}
				setState(2279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(2276);
					switchLabel();
					}
					}
					setState(2281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2282);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2284);
				match(SYNCHRONIZED);
				setState(2285);
				parExpression();
				setState(2286);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2288);
				match(RETURN);
				setState(2290);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(2289);
					expression(0);
					}
				}

				setState(2292);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2293);
				match(THROW);
				setState(2294);
				expression(0);
				setState(2295);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2297);
				match(BREAK);
				setState(2299);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2298);
					match(Identifier);
					}
				}

				setState(2301);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2302);
				match(CONTINUE);
				setState(2304);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2303);
					match(Identifier);
					}
				}

				setState(2306);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2307);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2308);
				statementExpression();
				setState(2309);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2311);
				match(Identifier);
				setState(2312);
				match(COLON);
				setState(2313);
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
		enterRule(_localctx, 368, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			match(CATCH);
			setState(2317);
			match(LPAREN);
			setState(2321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2318);
				variableModifier();
				}
				}
				setState(2323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2324);
			catchType();
			setState(2325);
			match(Identifier);
			setState(2326);
			match(RPAREN);
			setState(2327);
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
		enterRule(_localctx, 370, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2329);
			qualifiedName();
			setState(2334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(2330);
				match(BITOR);
				setState(2331);
				qualifiedName();
				}
				}
				setState(2336);
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
		enterRule(_localctx, 372, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			match(FINALLY);
			setState(2338);
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
		enterRule(_localctx, 374, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(LPAREN);
			setState(2341);
			resources();
			setState(2343);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2342);
				match(SEMI);
				}
			}

			setState(2345);
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
		enterRule(_localctx, 376, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			resource();
			setState(2352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2348);
					match(SEMI);
					setState(2349);
					resource();
					}
					} 
				}
				setState(2354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
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
		enterRule(_localctx, 378, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2355);
				variableModifier();
				}
				}
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2361);
			classOrInterfaceType();
			setState(2362);
			variableDeclaratorId();
			setState(2363);
			match(ASSIGN);
			setState(2364);
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
		enterRule(_localctx, 380, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2366);
				switchLabel();
				}
				}
				setState(2369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(2372); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2371);
				blockStatement();
				}
				}
				setState(2374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0) );
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
		enterRule(_localctx, 382, RULE_switchLabel);
		try {
			setState(2386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2376);
				match(CASE);
				setState(2377);
				constantExpression();
				setState(2378);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
				match(CASE);
				setState(2381);
				enumConstantName();
				setState(2382);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2384);
				match(DEFAULT);
				setState(2385);
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
		enterRule(_localctx, 384, RULE_forControl);
		int _la;
		try {
			setState(2400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2388);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2390);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)))) != 0)) {
					{
					setState(2389);
					forInit();
					}
				}

				setState(2392);
				match(SEMI);
				setState(2394);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(2393);
					expression(0);
					}
				}

				setState(2396);
				match(SEMI);
				setState(2398);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
					{
					setState(2397);
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
		enterRule(_localctx, 386, RULE_forInit);
		try {
			setState(2404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2402);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2403);
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
		enterRule(_localctx, 388, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2406);
				variableModifier();
				}
				}
				setState(2411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2412);
			type();
			setState(2413);
			match(Identifier);
			setState(2414);
			match(COLON);
			setState(2415);
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
		enterRule(_localctx, 390, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
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
		enterRule(_localctx, 392, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			match(LPAREN);
			setState(2420);
			expression(0);
			setState(2421);
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
		enterRule(_localctx, 394, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			expression(0);
			setState(2428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2424);
				match(COMMA);
				setState(2425);
				expression(0);
				}
				}
				setState(2430);
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
		enterRule(_localctx, 396, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
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
		enterRule(_localctx, 398, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
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
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2436);
				primary();
				}
				break;
			case 2:
				{
				setState(2437);
				match(NEW);
				setState(2438);
				creator();
				}
				break;
			case 3:
				{
				setState(2439);
				match(LPAREN);
				setState(2440);
				type();
				setState(2441);
				match(RPAREN);
				setState(2442);
				expression(17);
				}
				break;
			case 4:
				{
				setState(2444);
				_la = _input.LA(1);
				if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (INC - 92)) | (1L << (DEC - 92)) | (1L << (ADD - 92)) | (1L << (SUB - 92)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2445);
				expression(15);
				}
				break;
			case 5:
				{
				setState(2446);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2447);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2450);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2451);
						_la = _input.LA(1);
						if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (MUL - 96)) | (1L << (DIV - 96)) | (1L << (MOD - 96)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2452);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2453);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2454);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2455);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2456);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2464);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
						case 1:
							{
							setState(2457);
							match(LT);
							setState(2458);
							match(LT);
							}
							break;
						case 2:
							{
							setState(2459);
							match(GT);
							setState(2460);
							match(GT);
							setState(2461);
							match(GT);
							}
							break;
						case 3:
							{
							setState(2462);
							match(GT);
							setState(2463);
							match(GT);
							}
							break;
						}
						setState(2466);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2467);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2468);
						_la = _input.LA(1);
						if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (GT - 80)) | (1L << (LT - 80)) | (1L << (LE - 80)) | (1L << (GE - 80)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2469);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2470);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2471);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2472);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2473);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2474);
						match(BITAND);
						setState(2475);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2476);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2477);
						match(CARET);
						setState(2478);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2479);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2480);
						match(BITOR);
						setState(2481);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2482);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2483);
						match(AND);
						setState(2484);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2485);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2486);
						match(OR);
						setState(2487);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2488);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2489);
						match(QUESTION);
						setState(2490);
						expression(0);
						setState(2491);
						match(COLON);
						setState(2492);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2494);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2495);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ASSIGN - 79)) | (1L << (ADD_ASSIGN - 79)) | (1L << (SUB_ASSIGN - 79)) | (1L << (MUL_ASSIGN - 79)) | (1L << (DIV_ASSIGN - 79)) | (1L << (AND_ASSIGN - 79)) | (1L << (OR_ASSIGN - 79)) | (1L << (XOR_ASSIGN - 79)) | (1L << (MOD_ASSIGN - 79)) | (1L << (LSHIFT_ASSIGN - 79)) | (1L << (RSHIFT_ASSIGN - 79)) | (1L << (URSHIFT_ASSIGN - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2496);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2497);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(2498);
						match(DOT);
						setState(2499);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2500);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(2501);
						match(DOT);
						setState(2502);
						match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2503);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(2504);
						match(DOT);
						setState(2505);
						match(NEW);
						setState(2507);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(2506);
							nonWildcardTypeArguments();
							}
						}

						setState(2509);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2510);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(2511);
						match(DOT);
						setState(2512);
						match(SUPER);
						setState(2513);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2514);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(2515);
						match(DOT);
						setState(2516);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2517);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2518);
						match(LBRACK);
						setState(2519);
						expression(0);
						setState(2520);
						match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2522);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2523);
						match(LPAREN);
						setState(2525);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
							{
							setState(2524);
							expressionList();
							}
						}

						setState(2527);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2528);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2529);
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
						setState(2530);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2531);
						match(INSTANCEOF);
						setState(2532);
						type();
						}
						break;
					}
					} 
				}
				setState(2537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
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
		enterRule(_localctx, 402, RULE_primary);
		try {
			setState(2559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2538);
				match(LPAREN);
				setState(2539);
				expression(0);
				setState(2540);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2542);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2543);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2544);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2545);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2546);
				type();
				setState(2547);
				match(DOT);
				setState(2548);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2550);
				match(VOID);
				setState(2551);
				match(DOT);
				setState(2552);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2553);
				nonWildcardTypeArguments();
				setState(2557);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(2554);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(2555);
					match(THIS);
					setState(2556);
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
		enterRule(_localctx, 404, RULE_creator);
		try {
			setState(2570);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2561);
				nonWildcardTypeArguments();
				setState(2562);
				createdName();
				setState(2563);
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
				setState(2565);
				createdName();
				setState(2568);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(2566);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(2567);
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
		enterRule(_localctx, 406, RULE_createdName);
		int _la;
		try {
			setState(2587);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2572);
				match(Identifier);
				setState(2574);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2573);
					typeArgumentsOrDiamond();
					}
				}

				setState(2583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2576);
					match(DOT);
					setState(2577);
					match(Identifier);
					setState(2579);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2578);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(2585);
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
				setState(2586);
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
		enterRule(_localctx, 408, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			match(Identifier);
			setState(2591);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2590);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(2593);
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
		enterRule(_localctx, 410, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2595);
			match(LBRACK);
			setState(2623);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(2596);
				match(RBRACK);
				setState(2601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2597);
					match(LBRACK);
					setState(2598);
					match(RBRACK);
					}
					}
					setState(2603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2604);
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
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(2605);
				expression(0);
				setState(2606);
				match(RBRACK);
				setState(2613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2607);
						match(LBRACK);
						setState(2608);
						expression(0);
						setState(2609);
						match(RBRACK);
						}
						} 
					}
					setState(2615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
				}
				setState(2620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2616);
						match(LBRACK);
						setState(2617);
						match(RBRACK);
						}
						} 
					}
					setState(2622);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
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
		enterRule(_localctx, 412, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			arguments();
			setState(2627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(2626);
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
		enterRule(_localctx, 414, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			nonWildcardTypeArguments();
			setState(2630);
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
		enterRule(_localctx, 416, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2632);
			match(LT);
			setState(2633);
			typeList();
			setState(2634);
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
		enterRule(_localctx, 418, RULE_typeArgumentsOrDiamond);
		try {
			setState(2639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2636);
				match(LT);
				setState(2637);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2638);
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
		enterRule(_localctx, 420, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(2644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2641);
				match(LT);
				setState(2642);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2643);
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
		enterRule(_localctx, 422, RULE_superSuffix);
		try {
			setState(2652);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2646);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2647);
				match(DOT);
				setState(2648);
				match(Identifier);
				setState(2650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2649);
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
		enterRule(_localctx, 424, RULE_explicitGenericInvocationSuffix);
		try {
			setState(2658);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2654);
				match(SUPER);
				setState(2655);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2656);
				match(Identifier);
				setState(2657);
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
		enterRule(_localctx, 426, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			match(LPAREN);
			setState(2662);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << Identifier))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)))) != 0)) {
				{
				setState(2661);
				expressionList();
				}
			}

			setState(2664);
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
		case 92:
			return t_expressionDetail_sempred((T_expressionDetailContext)_localctx, predIndex);
		case 200:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean t_expressionDetail_sempred(T_expressionDetailContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 24);
		case 12:
			return precpred(_ctx, 23);
		case 13:
			return precpred(_ctx, 22);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 20);
		case 16:
			return precpred(_ctx, 19);
		case 17:
			return precpred(_ctx, 18);
		case 18:
			return precpred(_ctx, 8);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3t\u0a6d\4\2\t\2\4"+
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
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\3\2\5\2\u01b0\n\2\3\2\7\2\u01b3\n\2\f\2\16\2"+
		"\u01b6\13\2\3\2\7\2\u01b9\n\2\f\2\16\2\u01bc\13\2\3\2\3\2\3\3\7\3\u01c1"+
		"\n\3\f\3\16\3\u01c4\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u01cc\n\4\3\4\3\4"+
		"\3\4\5\4\u01d1\n\4\3\4\3\4\3\5\7\5\u01d6\n\5\f\5\16\5\u01d9\13\5\3\5\3"+
		"\5\7\5\u01dd\n\5\f\5\16\5\u01e0\13\5\3\5\3\5\7\5\u01e4\n\5\f\5\16\5\u01e7"+
		"\13\5\3\5\3\5\7\5\u01eb\n\5\f\5\16\5\u01ee\13\5\3\5\3\5\5\5\u01f2\n\5"+
		"\3\6\3\6\5\6\u01f6\n\6\3\7\3\7\5\7\u01fa\n\7\3\b\3\b\5\b\u01fe\n\b\3\t"+
		"\3\t\3\t\5\t\u0203\n\t\3\t\3\t\5\t\u0207\n\t\3\t\3\t\5\t\u020b\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u0213\n\n\f\n\16\n\u0216\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\5\13\u021d\n\13\3\f\3\f\3\f\7\f\u0222\n\f\f\f\16\f\u0225\13\f"+
		"\3\r\3\r\3\r\3\r\5\r\u022b\n\r\3\r\3\r\5\r\u022f\n\r\3\r\5\r\u0232\n\r"+
		"\3\r\5\r\u0235\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u023c\n\16\f\16\16\16\u023f"+
		"\13\16\3\17\7\17\u0242\n\17\f\17\16\17\u0245\13\17\3\17\3\17\5\17\u0249"+
		"\n\17\3\17\5\17\u024c\n\17\3\20\3\20\7\20\u0250\n\20\f\20\16\20\u0253"+
		"\13\20\3\21\3\21\3\21\5\21\u0258\n\21\3\21\3\21\5\21\u025c\n\21\3\21\3"+
		"\21\3\22\3\22\3\22\7\22\u0263\n\22\f\22\16\22\u0266\13\22\3\23\3\23\7"+
		"\23\u026a\n\23\f\23\16\23\u026d\13\23\3\23\3\23\3\24\3\24\7\24\u0273\n"+
		"\24\f\24\16\24\u0276\13\24\3\24\3\24\3\25\3\25\5\25\u027c\n\25\3\25\3"+
		"\25\7\25\u0280\n\25\f\25\16\25\u0283\13\25\3\25\5\25\u0286\n\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0293\n\27\3\30"+
		"\3\30\5\30\u0297\n\30\3\30\3\30\3\30\3\30\7\30\u029d\n\30\f\30\16\30\u02a0"+
		"\13\30\3\30\3\30\5\30\u02a4\n\30\3\30\3\30\5\30\u02a8\n\30\3\30\5\30\u02ab"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u02b4\n\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u02bf\n\34\f\34\16\34\u02c2\13\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u02cb\n\35\3\36\7\36\u02ce\n"+
		"\36\f\36\16\36\u02d1\13\36\3\36\3\36\5\36\u02d5\n\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u02de\n\37\3 \3 \3 \3 \7 \u02e4\n \f \16 \u02e7"+
		"\13 \3 \3 \3!\3!\3!\3!\3\"\3\"\5\"\u02f1\n\"\3\"\3\"\3\"\3\"\7\"\u02f7"+
		"\n\"\f\"\16\"\u02fa\13\"\3\"\3\"\5\"\u02fe\n\"\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\5%\u030e\n%\3&\3&\3\'\3\'\3(\3(\3(\7(\u0317\n(\f"+
		"(\16(\u031a\13(\3)\3)\5)\u031e\n)\3*\3*\3*\3*\7*\u0324\n*\f*\16*\u0327"+
		"\13*\3*\5*\u032a\n*\5*\u032c\n*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\7.\u0339"+
		"\n.\f.\16.\u033c\13.\3.\3.\3.\7.\u0341\n.\f.\16.\u0344\13.\5.\u0346\n"+
		".\3/\3/\5/\u034a\n/\3/\3/\3/\5/\u034f\n/\7/\u0351\n/\f/\16/\u0354\13/"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u035c\n\61\f\61\16\61\u035f\13\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u0367\n\62\5\62\u0369\n\62\3\63\3"+
		"\63\3\63\7\63\u036e\n\63\f\63\16\63\u0371\13\63\3\64\3\64\5\64\u0375\n"+
		"\64\3\64\3\64\3\65\3\65\3\65\7\65\u037c\n\65\f\65\16\65\u037f\13\65\3"+
		"\65\3\65\5\65\u0383\n\65\3\65\5\65\u0386\n\65\3\66\7\66\u0389\n\66\f\66"+
		"\16\66\u038c\13\66\3\66\3\66\3\66\3\67\7\67\u0392\n\67\f\67\16\67\u0395"+
		"\13\67\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3:\7:\u03a2\n:\f:\16:\u03a5"+
		"\13:\3;\3;\3<\3<\3<\3<\3<\5<\u03ae\n<\3<\5<\u03b1\n<\3=\3=\3>\3>\3>\7"+
		">\u03b8\n>\f>\16>\u03bb\13>\3?\3?\3?\3?\3@\3@\3@\5@\u03c4\n@\3A\3A\3A"+
		"\3A\7A\u03ca\nA\fA\16A\u03cd\13A\5A\u03cf\nA\3A\5A\u03d2\nA\3A\3A\3B\3"+
		"B\3B\3B\3B\3C\3C\7C\u03dd\nC\fC\16C\u03e0\13C\3C\3C\3D\3D\7D\u03e6\nD"+
		"\fD\16D\u03e9\13D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u03f5\nD\3D\3D\5D\u03f9"+
		"\nD\3D\3D\5D\u03fd\nD\3D\3D\5D\u0401\nD\5D\u0403\nD\5D\u0405\nD\3E\3E"+
		"\3E\3E\5E\u040b\nE\3F\3F\3F\7F\u0410\nF\fF\16F\u0413\13F\3G\3G\3G\3H\3"+
		"H\7H\u041a\nH\fH\16H\u041d\13H\3H\3H\3I\3I\5I\u0423\nI\3J\3J\3J\3J\3J"+
		"\5J\u042a\nJ\3K\7K\u042d\nK\fK\16K\u0430\13K\3K\3K\3K\3K\7K\u0436\nK\f"+
		"K\16K\u0439\13K\3L\3L\3L\3L\3L\5L\u0440\nL\3L\3L\3L\3L\3L\3L\3L\5L\u0449"+
		"\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\6L\u045e"+
		"\nL\rL\16L\u045f\3L\5L\u0463\nL\3L\5L\u0466\nL\3L\3L\3L\3L\7L\u046c\n"+
		"L\fL\16L\u046f\13L\3L\5L\u0472\nL\3L\3L\3L\3L\7L\u0478\nL\fL\16L\u047b"+
		"\13L\3L\7L\u047e\nL\fL\16L\u0481\13L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u048b"+
		"\nL\3L\3L\3L\3L\3L\3L\3L\5L\u0494\nL\3L\3L\3L\5L\u0499\nL\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\5L\u04a5\nL\3L\3L\3L\3L\3L\3L\3L\5L\u04ae\nL\3L\3L"+
		"\3L\3L\3L\3L\5L\u04b6\nL\3M\3M\3M\3M\3M\3M\5M\u04be\nM\3N\3N\3N\7N\u04c3"+
		"\nN\fN\16N\u04c6\13N\3N\3N\3N\3N\3N\3O\3O\3O\7O\u04d0\nO\fO\16O\u04d3"+
		"\13O\3P\3P\3P\3Q\3Q\3Q\5Q\u04db\nQ\3Q\3Q\3R\3R\3R\7R\u04e2\nR\fR\16R\u04e5"+
		"\13R\3S\7S\u04e8\nS\fS\16S\u04eb\13S\3S\3S\3S\3S\3S\3T\6T\u04f3\nT\rT"+
		"\16T\u04f4\3T\6T\u04f8\nT\rT\16T\u04f9\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5"+
		"U\u0506\nU\3V\3V\5V\u050a\nV\3V\3V\5V\u050e\nV\3V\3V\5V\u0512\nV\5V\u0514"+
		"\nV\3W\3W\5W\u0518\nW\3X\7X\u051b\nX\fX\16X\u051e\13X\3X\3X\3X\3X\3X\3"+
		"Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\7[\u052e\n[\f[\16[\u0531\13[\3\\\3\\\3]\3]\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0546\n^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0556\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\5^\u057e\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\7^\u0592\n^\f^\16^\u0595\13^\5^\u0597\n^\3^\3^\3^\3^\7^"+
		"\u059d\n^\f^\16^\u05a0\13^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\5_\u05b5\n_\5_\u05b7\n_\3`\3`\3`\3`\3`\3`\3`\5`\u05c0\n"+
		"`\5`\u05c2\n`\3a\3a\5a\u05c6\na\3a\3a\3a\5a\u05cb\na\7a\u05cd\na\fa\16"+
		"a\u05d0\13a\3a\5a\u05d3\na\3b\3b\5b\u05d7\nb\3b\3b\3c\3c\3c\3c\7c\u05df"+
		"\nc\fc\16c\u05e2\13c\3c\3c\3c\3c\3c\3c\3c\7c\u05eb\nc\fc\16c\u05ee\13"+
		"c\3c\3c\7c\u05f2\nc\fc\16c\u05f5\13c\5c\u05f7\nc\3d\3d\5d\u05fb\nd\3e"+
		"\3e\3e\3f\3f\3f\3f\3g\3g\3g\5g\u0607\ng\3h\3h\3h\5h\u060c\nh\3i\3i\3i"+
		"\3i\5i\u0612\ni\5i\u0614\ni\3j\3j\3j\3j\3j\5j\u061b\nj\3k\3k\5k\u061f"+
		"\nk\3k\3k\3l\3l\3l\3l\3l\3l\3m\3m\3n\3n\3o\3o\3o\3o\5o\u0631\no\3p\3p"+
		"\3q\5q\u0636\nq\3q\7q\u0639\nq\fq\16q\u063c\13q\3q\7q\u063f\nq\fq\16q"+
		"\u0642\13q\3q\3q\3r\7r\u0647\nr\fr\16r\u064a\13r\3r\3r\3r\3r\3s\3s\5s"+
		"\u0652\ns\3s\3s\3s\5s\u0657\ns\3s\3s\3t\7t\u065c\nt\ft\16t\u065f\13t\3"+
		"t\3t\7t\u0663\nt\ft\16t\u0666\13t\3t\3t\7t\u066a\nt\ft\16t\u066d\13t\3"+
		"t\3t\7t\u0671\nt\ft\16t\u0674\13t\3t\3t\5t\u0678\nt\3u\3u\5u\u067c\nu"+
		"\3v\3v\5v\u0680\nv\3w\3w\5w\u0684\nw\3x\3x\3x\5x\u0689\nx\3x\3x\5x\u068d"+
		"\nx\3x\3x\5x\u0691\nx\3x\3x\3y\3y\3y\3y\7y\u0699\ny\fy\16y\u069c\13y\3"+
		"y\3y\3z\3z\3z\5z\u06a3\nz\3{\3{\3{\7{\u06a8\n{\f{\16{\u06ab\13{\3|\3|"+
		"\3|\3|\5|\u06b1\n|\3|\3|\5|\u06b5\n|\3|\5|\u06b8\n|\3|\5|\u06bb\n|\3|"+
		"\3|\3}\3}\3}\7}\u06c2\n}\f}\16}\u06c5\13}\3~\7~\u06c8\n~\f~\16~\u06cb"+
		"\13~\3~\3~\5~\u06cf\n~\3~\5~\u06d2\n~\3\177\3\177\7\177\u06d6\n\177\f"+
		"\177\16\177\u06d9\13\177\3\u0080\3\u0080\3\u0080\5\u0080\u06de\n\u0080"+
		"\3\u0080\3\u0080\5\u0080\u06e2\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\7\u0081\u06e9\n\u0081\f\u0081\16\u0081\u06ec\13\u0081\3\u0082"+
		"\3\u0082\7\u0082\u06f0\n\u0082\f\u0082\16\u0082\u06f3\13\u0082\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\7\u0083\u06f9\n\u0083\f\u0083\16\u0083\u06fc"+
		"\13\u0083\3\u0083\3\u0083\3\u0084\3\u0084\5\u0084\u0702\n\u0084\3\u0084"+
		"\3\u0084\7\u0084\u0706\n\u0084\f\u0084\16\u0084\u0709\13\u0084\3\u0084"+
		"\5\u0084\u070c\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u0717\n\u0085\3\u0086\3\u0086\5\u0086"+
		"\u071b\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086\u0721\n\u0086\f"+
		"\u0086\16\u0086\u0724\13\u0086\3\u0086\3\u0086\5\u0086\u0728\n\u0086\3"+
		"\u0086\3\u0086\5\u0086\u072c\n\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\5\u0088\u0735\n\u0088\3\u0088\3\u0088\3\u0089\3"+
		"\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\7\u008b\u0741\n"+
		"\u008b\f\u008b\16\u008b\u0744\13\u008b\3\u008b\3\u008b\5\u008b\u0748\n"+
		"\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u0751\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u0757\n\u008d\f"+
		"\u008d\16\u008d\u075a\13\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\7\u008e\u0761\n\u008e\f\u008e\16\u008e\u0764\13\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\5\u008f\u076b\n\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\7\u008f\u0771\n\u008f\f\u008f\16\u008f\u0774\13\u008f\3\u008f"+
		"\3\u008f\5\u008f\u0778\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\7\u0091\u0782\n\u0091\f\u0091\16\u0091\u0785"+
		"\13\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u078a\n\u0092\3\u0093\3\u0093"+
		"\3\u0093\7\u0093\u078f\n\u0093\f\u0093\16\u0093\u0792\13\u0093\3\u0094"+
		"\3\u0094\5\u0094\u0796\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095"+
		"\u079c\n\u0095\f\u0095\16\u0095\u079f\13\u0095\3\u0095\5\u0095\u07a2\n"+
		"\u0095\5\u0095\u07a4\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3"+
		"\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\7\u0099\u07b1\n\u0099\f"+
		"\u0099\16\u0099\u07b4\13\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u07b9\n"+
		"\u0099\f\u0099\16\u0099\u07bc\13\u0099\5\u0099\u07be\n\u0099\3\u009a\3"+
		"\u009a\5\u009a\u07c2\n\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u07c7\n\u009a"+
		"\7\u009a\u07c9\n\u009a\f\u009a\16\u009a\u07cc\13\u009a\3\u009b\3\u009b"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u07d4\n\u009c\f\u009c\16\u009c"+
		"\u07d7\13\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u07df\n\u009d\5\u009d\u07e1\n\u009d\3\u009e\3\u009e\3\u009e\7\u009e\u07e6"+
		"\n\u009e\f\u009e\16\u009e\u07e9\13\u009e\3\u009f\3\u009f\5\u009f\u07ed"+
		"\n\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u07f4\n\u00a0"+
		"\f\u00a0\16\u00a0\u07f7\13\u00a0\3\u00a0\3\u00a0\5\u00a0\u07fb\n\u00a0"+
		"\3\u00a0\5\u00a0\u07fe\n\u00a0\3\u00a1\7\u00a1\u0801\n\u00a1\f\u00a1\16"+
		"\u00a1\u0804\13\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\7\u00a2\u080a\n"+
		"\u00a2\f\u00a2\16\u00a2\u080d\13\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u081a"+
		"\n\u00a5\f\u00a5\16\u00a5\u081d\13\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0826\n\u00a7\3\u00a7\5\u00a7\u0829\n"+
		"\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0830\n\u00a9\f"+
		"\u00a9\16\u00a9\u0833\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ab\5\u00ab\u083c\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\7\u00ac\u0842\n\u00ac\f\u00ac\16\u00ac\u0845\13\u00ac\5\u00ac\u0847\n"+
		"\u00ac\3\u00ac\5\u00ac\u084a\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\7\u00ae\u0855\n\u00ae\f\u00ae\16"+
		"\u00ae\u0858\13\u00ae\3\u00ae\3\u00ae\3\u00af\7\u00af\u085d\n\u00af\f"+
		"\u00af\16\u00af\u0860\13\u00af\3\u00af\3\u00af\5\u00af\u0864\n\u00af\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u086c\n\u00b0\3"+
		"\u00b0\3\u00b0\5\u00b0\u0870\n\u00b0\3\u00b0\3\u00b0\5\u00b0\u0874\n\u00b0"+
		"\3\u00b0\3\u00b0\5\u00b0\u0878\n\u00b0\5\u00b0\u087a\n\u00b0\3\u00b1\3"+
		"\u00b1\5\u00b1\u087e\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0884"+
		"\n\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\7\u00b5"+
		"\u088d\n\u00b5\f\u00b5\16\u00b5\u0890\13\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0897\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b8"+
		"\7\u00b8\u089d\n\u00b8\f\u00b8\16\u00b8\u08a0\13\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u08aa\n\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u08b3"+
		"\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\6\u00b9\u08c8\n\u00b9\r\u00b9\16\u00b9\u08c9\3\u00b9"+
		"\5\u00b9\u08cd\n\u00b9\3\u00b9\5\u00b9\u08d0\n\u00b9\3\u00b9\3\u00b9\3"+
		"\u00b9\3\u00b9\7\u00b9\u08d6\n\u00b9\f\u00b9\16\u00b9\u08d9\13\u00b9\3"+
		"\u00b9\5\u00b9\u08dc\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u08e2"+
		"\n\u00b9\f\u00b9\16\u00b9\u08e5\13\u00b9\3\u00b9\7\u00b9\u08e8\n\u00b9"+
		"\f\u00b9\16\u00b9\u08eb\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u08f5\n\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u08fe\n\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\5\u00b9\u0903\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u090d\n\u00b9\3\u00ba\3\u00ba\3\u00ba"+
		"\7\u00ba\u0912\n\u00ba\f\u00ba\16\u00ba\u0915\13\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u091f\n\u00bb"+
		"\f\u00bb\16\u00bb\u0922\13\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u092a\n\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be"+
		"\7\u00be\u0931\n\u00be\f\u00be\16\u00be\u0934\13\u00be\3\u00bf\7\u00bf"+
		"\u0937\n\u00bf\f\u00bf\16\u00bf\u093a\13\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00c0\6\u00c0\u0942\n\u00c0\r\u00c0\16\u00c0\u0943"+
		"\3\u00c0\6\u00c0\u0947\n\u00c0\r\u00c0\16\u00c0\u0948\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u0955\n\u00c1\3\u00c2\3\u00c2\5\u00c2\u0959\n\u00c2\3\u00c2\3\u00c2\5"+
		"\u00c2\u095d\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0961\n\u00c2\5\u00c2\u0963"+
		"\n\u00c2\3\u00c3\3\u00c3\5\u00c3\u0967\n\u00c3\3\u00c4\7\u00c4\u096a\n"+
		"\u00c4\f\u00c4\16\u00c4\u096d\13\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\7\u00c7\u097d\n\u00c7\f\u00c7\16\u00c7\u0980\13\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0993"+
		"\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09a3\n\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09ce\n\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09e0\n\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u09e8\n\u00ca"+
		"\f\u00ca\16\u00ca\u09eb\13\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0a00\n\u00cb\5\u00cb"+
		"\u0a02\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\5\u00cc\u0a0b\n\u00cc\5\u00cc\u0a0d\n\u00cc\3\u00cd\3\u00cd\5\u00cd\u0a11"+
		"\n\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a16\n\u00cd\7\u00cd\u0a18\n"+
		"\u00cd\f\u00cd\16\u00cd\u0a1b\13\u00cd\3\u00cd\5\u00cd\u0a1e\n\u00cd\3"+
		"\u00ce\3\u00ce\5\u00ce\u0a22\n\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3"+
		"\u00cf\3\u00cf\7\u00cf\u0a2a\n\u00cf\f\u00cf\16\u00cf\u0a2d\13\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u0a36\n"+
		"\u00cf\f\u00cf\16\u00cf\u0a39\13\u00cf\3\u00cf\3\u00cf\7\u00cf\u0a3d\n"+
		"\u00cf\f\u00cf\16\u00cf\u0a40\13\u00cf\5\u00cf\u0a42\n\u00cf\3\u00d0\3"+
		"\u00d0\5\u00d0\u0a46\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3"+
		"\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a52\n\u00d3\3\u00d4\3"+
		"\u00d4\3\u00d4\5\u00d4\u0a57\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5"+
		"\u00d5\u0a5d\n\u00d5\5\u00d5\u0a5f\n\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u0a65\n\u00d6\3\u00d7\3\u00d7\5\u00d7\u0a69\n\u00d7\3\u00d7\3"+
		"\u00d7\3\u00d7\2\4\u00ba\u0192\u00d8\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0"+
		"\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\2\23\6\2!!--\61\61\64\64\7\2\3\3"+
		"\24\24$&)*\61\61\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37((\4\2\23\23+"+
		"+\4\2\66\66CG\3\2`a\4\2bcgg\4\2QSY[\3\2\67:\3\2=?\6\2\3\3\24\24$&)*\3"+
		"\2^a\3\2TU\4\2RSYZ\4\2XX[[\4\2QQhr\3\2^_\u0b53\2\u01af\3\2\2\2\4\u01c2"+
		"\3\2\2\2\6\u01c9\3\2\2\2\b\u01f1\3\2\2\2\n\u01f5\3\2\2\2\f\u01f9\3\2\2"+
		"\2\16\u01fd\3\2\2\2\20\u01ff\3\2\2\2\22\u020e\3\2\2\2\24\u0219\3\2\2\2"+
		"\26\u021e\3\2\2\2\30\u0226\3\2\2\2\32\u0238\3\2\2\2\34\u0243\3\2\2\2\36"+
		"\u024d\3\2\2\2 \u0254\3\2\2\2\"\u025f\3\2\2\2$\u0267\3\2\2\2&\u0270\3"+
		"\2\2\2(\u0285\3\2\2\2*\u0287\3\2\2\2,\u0292\3\2\2\2.\u0296\3\2\2\2\60"+
		"\u02ac\3\2\2\2\62\u02af\3\2\2\2\64\u02b7\3\2\2\2\66\u02ba\3\2\2\28\u02ca"+
		"\3\2\2\2:\u02d4\3\2\2\2<\u02dd\3\2\2\2>\u02df\3\2\2\2@\u02ea\3\2\2\2B"+
		"\u02f0\3\2\2\2D\u0301\3\2\2\2F\u0304\3\2\2\2H\u030d\3\2\2\2J\u030f\3\2"+
		"\2\2L\u0311\3\2\2\2N\u0313\3\2\2\2P\u031d\3\2\2\2R\u031f\3\2\2\2T\u032f"+
		"\3\2\2\2V\u0331\3\2\2\2X\u0333\3\2\2\2Z\u0345\3\2\2\2\\\u0347\3\2\2\2"+
		"^\u0355\3\2\2\2`\u0357\3\2\2\2b\u0368\3\2\2\2d\u036a\3\2\2\2f\u0372\3"+
		"\2\2\2h\u0385\3\2\2\2j\u038a\3\2\2\2l\u0393\3\2\2\2n\u039a\3\2\2\2p\u039c"+
		"\3\2\2\2r\u039e\3\2\2\2t\u03a6\3\2\2\2v\u03a8\3\2\2\2x\u03b2\3\2\2\2z"+
		"\u03b4\3\2\2\2|\u03bc\3\2\2\2~\u03c3\3\2\2\2\u0080\u03c5\3\2\2\2\u0082"+
		"\u03d5\3\2\2\2\u0084\u03da\3\2\2\2\u0086\u0404\3\2\2\2\u0088\u0406\3\2"+
		"\2\2\u008a\u040c\3\2\2\2\u008c\u0414\3\2\2\2\u008e\u0417\3\2\2\2\u0090"+
		"\u0422\3\2\2\2\u0092\u0429\3\2\2\2\u0094\u042e\3\2\2\2\u0096\u04b5\3\2"+
		"\2\2\u0098\u04bd\3\2\2\2\u009a\u04bf\3\2\2\2\u009c\u04cc\3\2\2\2\u009e"+
		"\u04d4\3\2\2\2\u00a0\u04d7\3\2\2\2\u00a2\u04de\3\2\2\2\u00a4\u04e9\3\2"+
		"\2\2\u00a6\u04f2\3\2\2\2\u00a8\u0505\3\2\2\2\u00aa\u0513\3\2\2\2\u00ac"+
		"\u0517\3\2\2\2\u00ae\u051c\3\2\2\2\u00b0\u0524\3\2\2\2\u00b2\u0526\3\2"+
		"\2\2\u00b4\u052a\3\2\2\2\u00b6\u0532\3\2\2\2\u00b8\u0534\3\2\2\2\u00ba"+
		"\u0545\3\2\2\2\u00bc\u05b6\3\2\2\2\u00be\u05c1\3\2\2\2\u00c0\u05d2\3\2"+
		"\2\2\u00c2\u05d4\3\2\2\2\u00c4\u05da\3\2\2\2\u00c6\u05f8\3\2\2\2\u00c8"+
		"\u05fc\3\2\2\2\u00ca\u05ff\3\2\2\2\u00cc\u0606\3\2\2\2\u00ce\u060b\3\2"+
		"\2\2\u00d0\u0613\3\2\2\2\u00d2\u061a\3\2\2\2\u00d4\u061c\3\2\2\2\u00d6"+
		"\u0622\3\2\2\2\u00d8\u0628\3\2\2\2\u00da\u062a\3\2\2\2\u00dc\u0630\3\2"+
		"\2\2\u00de\u0632\3\2\2\2\u00e0\u0635\3\2\2\2\u00e2\u0648\3\2\2\2\u00e4"+
		"\u064f\3\2\2\2\u00e6\u0677\3\2\2\2\u00e8\u067b\3\2\2\2\u00ea\u067f\3\2"+
		"\2\2\u00ec\u0683\3\2\2\2\u00ee\u0685\3\2\2\2\u00f0\u0694\3\2\2\2\u00f2"+
		"\u069f\3\2\2\2\u00f4\u06a4\3\2\2\2\u00f6\u06ac\3\2\2\2\u00f8\u06be\3\2"+
		"\2\2\u00fa\u06c9\3\2\2\2\u00fc\u06d3\3\2\2\2\u00fe\u06da\3\2\2\2\u0100"+
		"\u06e5\3\2\2\2\u0102\u06ed\3\2\2\2\u0104\u06f6\3\2\2\2\u0106\u070b\3\2"+
		"\2\2\u0108\u0716\3\2\2\2\u010a\u071a\3\2\2\2\u010c\u072d\3\2\2\2\u010e"+
		"\u0730\3\2\2\2\u0110\u0738\3\2\2\2\u0112\u073b\3\2\2\2\u0114\u0747\3\2"+
		"\2\2\u0116\u0750\3\2\2\2\u0118\u0752\3\2\2\2\u011a\u075d\3\2\2\2\u011c"+
		"\u076a\3\2\2\2\u011e\u077b\3\2\2\2\u0120\u077e\3\2\2\2\u0122\u0786\3\2"+
		"\2\2\u0124\u078b\3\2\2\2\u0126\u0795\3\2\2\2\u0128\u0797\3\2\2\2\u012a"+
		"\u07a7\3\2\2\2\u012c\u07a9\3\2\2\2\u012e\u07ab\3\2\2\2\u0130\u07bd\3\2"+
		"\2\2\u0132\u07bf\3\2\2\2\u0134\u07cd\3\2\2\2\u0136\u07cf\3\2\2\2\u0138"+
		"\u07e0\3\2\2\2\u013a\u07e2\3\2\2\2\u013c\u07ea\3\2\2\2\u013e\u07fd\3\2"+
		"\2\2\u0140\u0802\3\2\2\2\u0142\u080b\3\2\2\2\u0144\u0812\3\2\2\2\u0146"+
		"\u0814\3\2\2\2\u0148\u0816\3\2\2\2\u014a\u081e\3\2\2\2\u014c\u0820\3\2"+
		"\2\2\u014e\u082a\3\2\2\2\u0150\u082c\3\2\2\2\u0152\u0834\3\2\2\2\u0154"+
		"\u083b\3\2\2\2\u0156\u083d\3\2\2\2\u0158\u084d\3\2\2\2\u015a\u0852\3\2"+
		"\2\2\u015c\u0863\3\2\2\2\u015e\u0879\3\2\2\2\u0160\u087d\3\2\2\2\u0162"+
		"\u087f\3\2\2\2\u0164\u0885\3\2\2\2\u0166\u0887\3\2\2\2\u0168\u088a\3\2"+
		"\2\2\u016a\u0896\3\2\2\2\u016c\u0898\3\2\2\2\u016e\u089e\3\2\2\2\u0170"+
		"\u090c\3\2\2\2\u0172\u090e\3\2\2\2\u0174\u091b\3\2\2\2\u0176\u0923\3\2"+
		"\2\2\u0178\u0926\3\2\2\2\u017a\u092d\3\2\2\2\u017c\u0938\3\2\2\2\u017e"+
		"\u0941\3\2\2\2\u0180\u0954\3\2\2\2\u0182\u0962\3\2\2\2\u0184\u0966\3\2"+
		"\2\2\u0186\u096b\3\2\2\2\u0188\u0973\3\2\2\2\u018a\u0975\3\2\2\2\u018c"+
		"\u0979\3\2\2\2\u018e\u0981\3\2\2\2\u0190\u0983\3\2\2\2\u0192\u0992\3\2"+
		"\2\2\u0194\u0a01\3\2\2\2\u0196\u0a0c\3\2\2\2\u0198\u0a1d\3\2\2\2\u019a"+
		"\u0a1f\3\2\2\2\u019c\u0a25\3\2\2\2\u019e\u0a43\3\2\2\2\u01a0\u0a47\3\2"+
		"\2\2\u01a2\u0a4a\3\2\2\2\u01a4\u0a51\3\2\2\2\u01a6\u0a56\3\2\2\2\u01a8"+
		"\u0a5e\3\2\2\2\u01aa\u0a64\3\2\2\2\u01ac\u0a66\3\2\2\2\u01ae\u01b0\5\4"+
		"\3\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b4\3\2\2\2\u01b1"+
		"\u01b3\5\6\4\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01ba\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b9\5\b\5\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01be\7\2\2\3\u01be\3\3\2\2\2\u01bf\u01c1\5v<\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7#\2\2\u01c6\u01c7\5r:\2\u01c7\u01c8"+
		"\7N\2\2\u01c8\5\3\2\2\2\u01c9\u01cb\7\33\2\2\u01ca\u01cc\7)\2\2\u01cb"+
		"\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\5r"+
		":\2\u01ce\u01cf\7P\2\2\u01cf\u01d1\7b\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7N\2\2\u01d3\7\3\2\2\2\u01d4"+
		"\u01d6\5\f\7\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01f2\5\20\t\2\u01db\u01dd\5\f\7\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3"+
		"\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01f2\5\30\r\2\u01e2\u01e4\5\f\7\2\u01e3\u01e2\3"+
		"\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01f2\5 \21\2\u01e9\u01eb\5\f"+
		"\7\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\5\u0082"+
		"B\2\u01f0\u01f2\7N\2\2\u01f1\u01d7\3\2\2\2\u01f1\u01de\3\2\2\2\u01f1\u01e5"+
		"\3\2\2\2\u01f1\u01ec\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\t\3\2\2\2\u01f3"+
		"\u01f6\5\f\7\2\u01f4\u01f6\t\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2"+
		"\2\2\u01f6\13\3\2\2\2\u01f7\u01fa\5v<\2\u01f8\u01fa\t\3\2\2\u01f9\u01f7"+
		"\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\r\3\2\2\2\u01fb\u01fe\7\24\2\2\u01fc"+
		"\u01fe\5v<\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\17\3\2\2\2"+
		"\u01ff\u0200\7\13\2\2\u0200\u0202\7;\2\2\u0201\u0203\5\22\n\2\u0202\u0201"+
		"\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0205\7\23\2\2"+
		"\u0205\u0207\5Z.\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020a"+
		"\3\2\2\2\u0208\u0209\7\32\2\2\u0209\u020b\5\"\22\2\u020a\u0208\3\2\2\2"+
		"\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5$\23\2\u020d\21"+
		"\3\2\2\2\u020e\u020f\7S\2\2\u020f\u0214\5\24\13\2\u0210\u0211\7O\2\2\u0211"+
		"\u0213\5\24\13\2\u0212\u0210\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3"+
		"\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0218\7R\2\2\u0218\23\3\2\2\2\u0219\u021c\7;\2\2\u021a\u021b\7\23\2\2"+
		"\u021b\u021d\5\26\f\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\25"+
		"\3\2\2\2\u021e\u0223\5Z.\2\u021f\u0220\7d\2\2\u0220\u0222\5Z.\2\u0221"+
		"\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\27\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7\22\2\2\u0227\u022a"+
		"\7;\2\2\u0228\u0229\7\32\2\2\u0229\u022b\5\"\22\2\u022a\u0228\3\2\2\2"+
		"\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\7J\2\2\u022d\u022f"+
		"\5\32\16\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2"+
		"\u0230\u0232\7O\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234"+
		"\3\2\2\2\u0233\u0235\5\36\20\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2"+
		"\u0235\u0236\3\2\2\2\u0236\u0237\7K\2\2\u0237\31\3\2\2\2\u0238\u023d\5"+
		"\34\17\2\u0239\u023a\7O\2\2\u023a\u023c\5\34\17\2\u023b\u0239\3\2\2\2"+
		"\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\33"+
		"\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0242\5v<\2\u0241\u0240\3\2\2\2\u0242"+
		"\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2"+
		"\2\2\u0245\u0243\3\2\2\2\u0246\u0248\7;\2\2\u0247\u0249\5\u00d4k\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u024c\5$"+
		"\23\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\35\3\2\2\2\u024d\u0251"+
		"\7N\2\2\u024e\u0250\5(\25\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\37\3\2\2\2\u0253\u0251\3\2\2"+
		"\2\u0254\u0255\7\36\2\2\u0255\u0257\7;\2\2\u0256\u0258\5\22\n\2\u0257"+
		"\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u025a\7\23"+
		"\2\2\u025a\u025c\5\"\22\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u025e\5&\24\2\u025e!\3\2\2\2\u025f\u0264\5Z.\2\u0260"+
		"\u0261\7O\2\2\u0261\u0263\5Z.\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2"+
		"\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265#\3\2\2\2\u0266\u0264"+
		"\3\2\2\2\u0267\u026b\7J\2\2\u0268\u026a\5(\25\2\u0269\u0268\3\2\2\2\u026a"+
		"\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2"+
		"\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7K\2\2\u026f%\3\2\2\2\u0270\u0274"+
		"\7J\2\2\u0271\u0273\5:\36\2\u0272\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274"+
		"\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2"+
		"\2\2\u0277\u0278\7K\2\2\u0278\'\3\2\2\2\u0279\u0286\7N\2\2\u027a\u027c"+
		"\7)\2\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u0286\5*\26\2\u027e\u0280\5\n\6\2\u027f\u027e\3\2\2\2\u0280\u0283\3\2"+
		"\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0284\u0286\5,\27\2\u0285\u0279\3\2\2\2\u0285\u027b\3\2"+
		"\2\2\u0285\u0281\3\2\2\2\u0286)\3\2\2\2\u0287\u0288\5\u008eH\2\u0288+"+
		"\3\2\2\2\u0289\u0293\5.\30\2\u028a\u0293\5\60\31\2\u028b\u0293\5\66\34"+
		"\2\u028c\u0293\5\62\32\2\u028d\u0293\5\64\33\2\u028e\u0293\5 \21\2\u028f"+
		"\u0293\5\u0082B\2\u0290\u0293\5\20\t\2\u0291\u0293\5\30\r\2\u0292\u0289"+
		"\3\2\2\2\u0292\u028a\3\2\2\2\u0292\u028b\3\2\2\2\u0292\u028c\3\2\2\2\u0292"+
		"\u028d\3\2\2\2\u0292\u028e\3\2\2\2\u0292\u028f\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0292\u0291\3\2\2\2\u0293-\3\2\2\2\u0294\u0297\5Z.\2\u0295\u0297"+
		"\7\63\2\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2\2\2"+
		"\u0298\u0299\7;\2\2\u0299\u029e\5f\64\2\u029a\u029b\7L\2\2\u029b\u029d"+
		"\7M\2\2\u029c\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a3\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\7\60"+
		"\2\2\u02a2\u02a4\5d\63\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a8\5n8\2\u02a6\u02a8\7N\2\2\u02a7\u02a5\3\2\2"+
		"\2\u02a7\u02a6\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02ab\5\u00d6l\2\u02aa"+
		"\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab/\3\2\2\2\u02ac\u02ad\5\22\n\2"+
		"\u02ad\u02ae\5.\30\2\u02ae\61\3\2\2\2\u02af\u02b0\7;\2\2\u02b0\u02b3\5"+
		"f\64\2\u02b1\u02b2\7\60\2\2\u02b2\u02b4\5d\63\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\5p9\2\u02b6\63\3\2\2\2"+
		"\u02b7\u02b8\5\22\n\2\u02b8\u02b9\5\62\32\2\u02b9\65\3\2\2\2\u02ba\u02bb"+
		"\5Z.\2\u02bb\u02c0\58\35\2\u02bc\u02bd\7O\2\2\u02bd\u02bf\58\35\2\u02be"+
		"\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7N\2\2\u02c4"+
		"\67\3\2\2\2\u02c5\u02c6\5\u00d8m\2\u02c6\u02c7\7Q\2\2\u02c7\u02c8\5P)"+
		"\2\u02c8\u02cb\3\2\2\2\u02c9\u02cb\5\u00d8m\2\u02ca\u02c5\3\2\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02cb9\3\2\2\2\u02cc\u02ce\5\n\6\2\u02cd\u02cc\3\2\2\2"+
		"\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2"+
		"\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d5\5<\37\2\u02d3\u02d5\7N\2\2\u02d4"+
		"\u02cf\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5;\3\2\2\2\u02d6\u02de\5> \2\u02d7"+
		"\u02de\5B\"\2\u02d8\u02de\5D#\2\u02d9\u02de\5 \21\2\u02da\u02de\5\u0082"+
		"B\2\u02db\u02de\5\20\t\2\u02dc\u02de\5\30\r\2\u02dd\u02d6\3\2\2\2\u02dd"+
		"\u02d7\3\2\2\2\u02dd\u02d8\3\2\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02da\3\2"+
		"\2\2\u02dd\u02db\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de=\3\2\2\2\u02df\u02e0"+
		"\5Z.\2\u02e0\u02e5\5@!\2\u02e1\u02e2\7O\2\2\u02e2\u02e4\5@!\2\u02e3\u02e1"+
		"\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\7N\2\2\u02e9?\3\2\2\2\u02ea"+
		"\u02eb\5\u00d8m\2\u02eb\u02ec\7Q\2\2\u02ec\u02ed\5P)\2\u02edA\3\2\2\2"+
		"\u02ee\u02f1\5Z.\2\u02ef\u02f1\7\63\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02ef"+
		"\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\7;\2\2\u02f3\u02f8\5f\64\2\u02f4"+
		"\u02f5\7L\2\2\u02f5\u02f7\7M\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fa\3\2\2"+
		"\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fd\3\2\2\2\u02fa\u02f8"+
		"\3\2\2\2\u02fb\u02fc\7\60\2\2\u02fc\u02fe\5d\63\2\u02fd\u02fb\3\2\2\2"+
		"\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\7N\2\2\u0300C\3\2"+
		"\2\2\u0301\u0302\5\22\n\2\u0302\u0303\5B\"\2\u0303E\3\2\2\2\u0304\u0305"+
		"\5N(\2\u0305\u0306\7Q\2\2\u0306\u0307\5P)\2\u0307G\3\2\2\2\u0308\u0309"+
		"\5J&\2\u0309\u030a\7Q\2\2\u030a\u030b\5P)\2\u030b\u030e\3\2\2\2\u030c"+
		"\u030e\5L\'\2\u030d\u0308\3\2\2\2\u030d\u030c\3\2\2\2\u030eI\3\2\2\2\u030f"+
		"\u0310\5\u00d8m\2\u0310K\3\2\2\2\u0311\u0312\5\u00d8m\2\u0312M\3\2\2\2"+
		"\u0313\u0318\5\u00dan\2\u0314\u0315\7L\2\2\u0315\u0317\7M\2\2\u0316\u0314"+
		"\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"O\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u031e\5R*\2\u031c\u031e\5\u00b8]\2"+
		"\u031d\u031b\3\2\2\2\u031d\u031c\3\2\2\2\u031eQ\3\2\2\2\u031f\u032b\7"+
		"J\2\2\u0320\u0325\5P)\2\u0321\u0322\7O\2\2\u0322\u0324\5P)\2\u0323\u0321"+
		"\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032a\7O\2\2\u0329\u0328\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0320\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\7K\2\2\u032eS\3\2\2\2\u032f"+
		"\u0330\5r:\2\u0330U\3\2\2\2\u0331\u0332\7;\2\2\u0332W\3\2\2\2\u0333\u0334"+
		"\5r:\2\u0334Y\3\2\2\2\u0335\u033a\5\\/\2\u0336\u0337\7L\2\2\u0337\u0339"+
		"\7M\2\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u0346\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u0342\5^"+
		"\60\2\u033e\u033f\7L\2\2\u033f\u0341\7M\2\2\u0340\u033e\3\2\2\2\u0341"+
		"\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0346\3\2"+
		"\2\2\u0344\u0342\3\2\2\2\u0345\u0335\3\2\2\2\u0345\u033d\3\2\2\2\u0346"+
		"[\3\2\2\2\u0347\u0349\7;\2\2\u0348\u034a\5`\61\2\u0349\u0348\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u0352\3\2\2\2\u034b\u034c\7P\2\2\u034c\u034e\7;\2"+
		"\2\u034d\u034f\5`\61\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351"+
		"\3\2\2\2\u0350\u034b\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353]\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0356\t\4\2\2"+
		"\u0356_\3\2\2\2\u0357\u0358\7S\2\2\u0358\u035d\5b\62\2\u0359\u035a\7O"+
		"\2\2\u035a\u035c\5b\62\2\u035b\u0359\3\2\2\2\u035c\u035f\3\2\2\2\u035d"+
		"\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2"+
		"\2\2\u0360\u0361\7R\2\2\u0361a\3\2\2\2\u0362\u0369\5Z.\2\u0363\u0366\7"+
		"V\2\2\u0364\u0365\t\5\2\2\u0365\u0367\5Z.\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0362\3\2\2\2\u0368\u0363\3\2"+
		"\2\2\u0369c\3\2\2\2\u036a\u036f\5r:\2\u036b\u036c\7O\2\2\u036c\u036e\5"+
		"r:\2\u036d\u036b\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370e\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0374\7H\2\2\u0373"+
		"\u0375\5h\65\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2"+
		"\2\2\u0376\u0377\7I\2\2\u0377g\3\2\2\2\u0378\u037d\5j\66\2\u0379\u037a"+
		"\7O\2\2\u037a\u037c\5j\66\2\u037b\u0379\3\2\2\2\u037c\u037f\3\2\2\2\u037d"+
		"\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0382\3\2\2\2\u037f\u037d\3\2"+
		"\2\2\u0380\u0381\7O\2\2\u0381\u0383\5l\67\2\u0382\u0380\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0386\5l\67\2\u0385\u0378\3\2"+
		"\2\2\u0385\u0384\3\2\2\2\u0386i\3\2\2\2\u0387\u0389\5\16\b\2\u0388\u0387"+
		"\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038d\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u038e\5Z.\2\u038e\u038f\5J&\2"+
		"\u038fk\3\2\2\2\u0390\u0392\5\16\b\2\u0391\u0390\3\2\2\2\u0392\u0395\3"+
		"\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0396\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0396\u0397\5Z.\2\u0397\u0398\7t\2\2\u0398\u0399\5J&\2"+
		"\u0399m\3\2\2\2\u039a\u039b\5\u008eH\2\u039bo\3\2\2\2\u039c\u039d\5\u008e"+
		"H\2\u039dq\3\2\2\2\u039e\u03a3\5\u00dan\2\u039f\u03a0\7P\2\2\u03a0\u03a2"+
		"\5\u00dan\2\u03a1\u039f\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2"+
		"\2\u03a3\u03a4\3\2\2\2\u03a4s\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a7"+
		"\t\6\2\2\u03a7u\3\2\2\2\u03a8\u03a9\7s\2\2\u03a9\u03b0\5x=\2\u03aa\u03ad"+
		"\7H\2\2\u03ab\u03ae\5z>\2\u03ac\u03ae\5~@\2\u03ad\u03ab\3\2\2\2\u03ad"+
		"\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\7I"+
		"\2\2\u03b0\u03aa\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1w\3\2\2\2\u03b2\u03b3"+
		"\5r:\2\u03b3y\3\2\2\2\u03b4\u03b9\5|?\2\u03b5\u03b6\7O\2\2\u03b6\u03b8"+
		"\5|?\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba{\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03bd\7;\2\2\u03bd"+
		"\u03be\7Q\2\2\u03be\u03bf\5~@\2\u03bf}\3\2\2\2\u03c0\u03c4\5\u00b8]\2"+
		"\u03c1\u03c4\5v<\2\u03c2\u03c4\5\u0080A\2\u03c3\u03c0\3\2\2\2\u03c3\u03c1"+
		"\3\2\2\2\u03c3\u03c2\3\2\2\2\u03c4\177\3\2\2\2\u03c5\u03ce\7J\2\2\u03c6"+
		"\u03cb\5~@\2\u03c7\u03c8\7O\2\2\u03c8\u03ca\5~@\2\u03c9\u03c7\3\2\2\2"+
		"\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cf"+
		"\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03c6\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d1\3\2\2\2\u03d0\u03d2\7O\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\7K\2\2\u03d4\u0081\3\2\2\2\u03d5"+
		"\u03d6\7s\2\2\u03d6\u03d7\7\36\2\2\u03d7\u03d8\7;\2\2\u03d8\u03d9\5\u0084"+
		"C\2\u03d9\u0083\3\2\2\2\u03da\u03de\7J\2\2\u03db\u03dd\5\u0086D\2\u03dc"+
		"\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2"+
		"\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\7K\2\2\u03e2"+
		"\u0085\3\2\2\2\u03e3\u0405\7N\2\2\u03e4\u03e6\5\n\6\2\u03e5\u03e4\3\2"+
		"\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"\u0402\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\5Z.\2\u03eb\u03ec\5\u0088"+
		"E\2\u03ec\u03ed\7N\2\2\u03ed\u0403\3\2\2\2\u03ee\u03ef\5Z.\2\u03ef\u03f0"+
		"\5\u008aF\2\u03f0\u03f1\7N\2\2\u03f1\u0403\3\2\2\2\u03f2\u03f4\5\20\t"+
		"\2\u03f3\u03f5\7N\2\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u0403"+
		"\3\2\2\2\u03f6\u03f8\5 \21\2\u03f7\u03f9\7N\2\2\u03f8\u03f7\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u0403\3\2\2\2\u03fa\u03fc\5\30\r\2\u03fb\u03fd\7"+
		"N\2\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0403\3\2\2\2\u03fe"+
		"\u0400\5\u0082B\2\u03ff\u0401\7N\2\2\u0400\u03ff\3\2\2\2\u0400\u0401\3"+
		"\2\2\2\u0401\u0403\3\2\2\2\u0402\u03ea\3\2\2\2\u0402\u03ee\3\2\2\2\u0402"+
		"\u03f2\3\2\2\2\u0402\u03f6\3\2\2\2\u0402\u03fa\3\2\2\2\u0402\u03fe\3\2"+
		"\2\2\u0403\u0405\3\2\2\2\u0404\u03e3\3\2\2\2\u0404\u03e7\3\2\2\2\u0405"+
		"\u0087\3\2\2\2\u0406\u0407\7;\2\2\u0407\u0408\7H\2\2\u0408\u040a\7I\2"+
		"\2\u0409\u040b\5\u008cG\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u0089\3\2\2\2\u040c\u0411\5F$\2\u040d\u040e\7O\2\2\u040e\u0410\5F$\2"+
		"\u040f\u040d\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411\u0412"+
		"\3\2\2\2\u0412\u008b\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u0415\7\16\2\2"+
		"\u0415\u0416\5~@\2\u0416\u008d\3\2\2\2\u0417\u041b\7J\2\2\u0418\u041a"+
		"\5\u0092J\2\u0419\u0418\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2"+
		"\2\u041b\u041c\3\2\2\2\u041c\u041e\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u041f"+
		"\7K\2\2\u041f\u008f\3\2\2\2\u0420\u0423\5\u008eH\2\u0421\u0423\5\u0096"+
		"L\2\u0422\u0420\3\2\2\2\u0422\u0421\3\2\2\2\u0423\u0091\3\2\2\2\u0424"+
		"\u0425\5\u0094K\2\u0425\u0426\7N\2\2\u0426\u042a\3\2\2\2\u0427\u042a\5"+
		"\u0096L\2\u0428\u042a\5\b\5\2\u0429\u0424\3\2\2\2\u0429\u0427\3\2\2\2"+
		"\u0429\u0428\3\2\2\2\u042a\u0093\3\2\2\2\u042b\u042d\5\16\b\2\u042c\u042b"+
		"\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0431\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0432\5Z.\2\u0432\u0437\5H%\2"+
		"\u0433\u0434\7O\2\2\u0434\u0436\5H%\2\u0435\u0433\3\2\2\2\u0436\u0439"+
		"\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0095\3\2\2\2\u0439"+
		"\u0437\3\2\2\2\u043a\u04b6\5\u008eH\2\u043b\u043c\7\4\2\2\u043c\u043f"+
		"\5\u00b8]\2\u043d\u043e\7W\2\2\u043e\u0440\5\u00b8]\2\u043f\u043d\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\7N\2\2\u0442"+
		"\u04b6\3\2\2\2\u0443\u0444\7\30\2\2\u0444\u0445\5\u00b2Z\2\u0445\u0448"+
		"\5\u0090I\2\u0446\u0447\7\21\2\2\u0447\u0449\5\u0090I\2\u0448\u0446\3"+
		"\2\2\2\u0448\u0449\3\2\2\2\u0449\u04b6\3\2\2\2\u044a\u044b\7\27\2\2\u044b"+
		"\u044c\7H\2\2\u044c\u044d\5\u00aaV\2\u044d\u044e\7I\2\2\u044e\u044f\5"+
		"\u0090I\2\u044f\u04b6\3\2\2\2\u0450\u0451\7\65\2\2\u0451\u0452\5\u00b2"+
		"Z\2\u0452\u0453\5\u0090I\2\u0453\u04b6\3\2\2\2\u0454\u0455\7\17\2\2\u0455"+
		"\u0456\5\u0090I\2\u0456\u0457\7\65\2\2\u0457\u0458\5\u00b2Z\2\u0458\u0459"+
		"\7N\2\2\u0459\u04b6\3\2\2\2\u045a\u045b\7\62\2\2\u045b\u0465\5\u008eH"+
		"\2\u045c\u045e\5\u009aN\2\u045d\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f"+
		"\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u0463\5\u009e"+
		"P\2\u0462\u0461\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0466\3\2\2\2\u0464"+
		"\u0466\5\u009eP\2\u0465\u045d\3\2\2\2\u0465\u0464\3\2\2\2\u0466\u04b6"+
		"\3\2\2\2\u0467\u0468\7\62\2\2\u0468\u0469\5\u00a0Q\2\u0469\u046d\5\u008e"+
		"H\2\u046a\u046c\5\u009aN\2\u046b\u046a\3\2\2\2\u046c\u046f\3\2\2\2\u046d"+
		"\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2"+
		"\2\2\u0470\u0472\5\u009eP\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472"+
		"\u04b6\3\2\2\2\u0473\u0474\7,\2\2\u0474\u0475\5\u00b2Z\2\u0475\u0479\7"+
		"J\2\2\u0476\u0478\5\u00a6T\2\u0477\u0476\3\2\2\2\u0478\u047b\3\2\2\2\u0479"+
		"\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047f\3\2\2\2\u047b\u0479\3\2"+
		"\2\2\u047c\u047e\5\u00a8U\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f"+
		"\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0482\3\2\2\2\u0481\u047f\3\2"+
		"\2\2\u0482\u0483\7K\2\2\u0483\u04b6\3\2\2\2\u0484\u0485\7-\2\2\u0485\u0486"+
		"\5\u00b2Z\2\u0486\u0487\5\u008eH\2\u0487\u04b6\3\2\2\2\u0488\u048a\7\'"+
		"\2\2\u0489\u048b\5\u00b8]\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048c\3\2\2\2\u048c\u04b6\7N\2\2\u048d\u048e\7/\2\2\u048e\u048f\5\u00b8"+
		"]\2\u048f\u0490\7N\2\2\u0490\u04b6\3\2\2\2\u0491\u0493\7\6\2\2\u0492\u0494"+
		"\7;\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u04b6\7N\2\2\u0496\u0498\7\r\2\2\u0497\u0499\7;\2\2\u0498\u0497\3\2\2"+
		"\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u04b6\7N\2\2\u049b\u04b6"+
		"\7N\2\2\u049c\u049d\5\u0098M\2\u049d\u049e\7Q\2\2\u049e\u049f\5\u00b8"+
		"]\2\u049f\u04a0\7N\2\2\u04a0\u04b6\3\2\2\2\u04a1\u04a2\5\u00b8]\2\u04a2"+
		"\u04a4\7H\2\2\u04a3\u04a5\5\u00b4[\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3"+
		"\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\7I\2\2\u04a7\u04a8\7N\2\2\u04a8"+
		"\u04b6\3\2\2\2\u04a9\u04aa\5\u00b8]\2\u04aa\u04ab\7P\2\2\u04ab\u04ad\7"+
		"\"\2\2\u04ac\u04ae\5\u00caf\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2"+
		"\u04ae\u04af\3\2\2\2\u04af\u04b0\5\u00c2b\2\u04b0\u04b6\3\2\2\2\u04b1"+
		"\u04b2\7;\2\2\u04b2\u04b3\7W\2\2\u04b3\u04b6\5\u0096L\2\u04b4\u04b6\5"+
		"\u00d6l\2\u04b5\u043a\3\2\2\2\u04b5\u043b\3\2\2\2\u04b5\u0443\3\2\2\2"+
		"\u04b5\u044a\3\2\2\2\u04b5\u0450\3\2\2\2\u04b5\u0454\3\2\2\2\u04b5\u045a"+
		"\3\2\2\2\u04b5\u0467\3\2\2\2\u04b5\u0473\3\2\2\2\u04b5\u0484\3\2\2\2\u04b5"+
		"\u0488\3\2\2\2\u04b5\u048d\3\2\2\2\u04b5\u0491\3\2\2\2\u04b5\u0496\3\2"+
		"\2\2\u04b5\u049b\3\2\2\2\u04b5\u049c\3\2\2\2\u04b5\u04a1\3\2\2\2\u04b5"+
		"\u04a9\3\2\2\2\u04b5\u04b1\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b6\u0097\3\2"+
		"\2\2\u04b7\u04b8\5\u00b8]\2\u04b8\u04b9\7L\2\2\u04b9\u04ba\5\u00b8]\2"+
		"\u04ba\u04bb\7M\2\2\u04bb\u04be\3\2\2\2\u04bc\u04be\5\u00dan\2\u04bd\u04b7"+
		"\3\2\2\2\u04bd\u04bc\3\2\2\2\u04be\u0099\3\2\2\2\u04bf\u04c0\7\t\2\2\u04c0"+
		"\u04c4\7H\2\2\u04c1\u04c3\5\16\b\2\u04c2\u04c1\3\2\2\2\u04c3\u04c6\3\2"+
		"\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6"+
		"\u04c4\3\2\2\2\u04c7\u04c8\5\u009cO\2\u04c8\u04c9\5\u00dan\2\u04c9\u04ca"+
		"\7I\2\2\u04ca\u04cb\5\u008eH\2\u04cb\u009b\3\2\2\2\u04cc\u04d1\5r:\2\u04cd"+
		"\u04ce\7e\2\2\u04ce\u04d0\5r:\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\3\2\2"+
		"\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u009d\3\2\2\2\u04d3\u04d1"+
		"\3\2\2\2\u04d4\u04d5\7\25\2\2\u04d5\u04d6\5\u008eH\2\u04d6\u009f\3\2\2"+
		"\2\u04d7\u04d8\7H\2\2\u04d8\u04da\5\u00a2R\2\u04d9\u04db\7N\2\2\u04da"+
		"\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd\7I"+
		"\2\2\u04dd\u00a1\3\2\2\2\u04de\u04e3\5\u00a4S\2\u04df\u04e0\7N\2\2\u04e0"+
		"\u04e2\5\u00a4S\2\u04e1\u04df\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1"+
		"\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u00a3\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6"+
		"\u04e8\5\16\b\2\u04e7\u04e6\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3"+
		"\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec"+
		"\u04ed\5\\/\2\u04ed\u04ee\5J&\2\u04ee\u04ef\7Q\2\2\u04ef\u04f0\5\u00b8"+
		"]\2\u04f0\u00a5\3\2\2\2\u04f1\u04f3\5\u00a8U\2\u04f2\u04f1\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7\3\2"+
		"\2\2\u04f6\u04f8\5\u0092J\2\u04f7\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u00a7\3\2\2\2\u04fb\u04fc\7\b"+
		"\2\2\u04fc\u04fd\5\u00b6\\\2\u04fd\u04fe\7W\2\2\u04fe\u0506\3\2\2\2\u04ff"+
		"\u0500\7\b\2\2\u0500\u0501\5V,\2\u0501\u0502\7W\2\2\u0502\u0506\3\2\2"+
		"\2\u0503\u0504\7\16\2\2\u0504\u0506\7W\2\2\u0505\u04fb\3\2\2\2\u0505\u04ff"+
		"\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u00a9\3\2\2\2\u0507\u0514\5\u00aeX"+
		"\2\u0508\u050a\5\u00acW\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u050b\3\2\2\2\u050b\u050d\7N\2\2\u050c\u050e\5\u00b8]\2\u050d\u050c\3"+
		"\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0511\7N\2\2\u0510"+
		"\u0512\5\u00b0Y\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514"+
		"\3\2\2\2\u0513\u0507\3\2\2\2\u0513\u0509\3\2\2\2\u0514\u00ab\3\2\2\2\u0515"+
		"\u0518\5\u0094K\2\u0516\u0518\5\u00b4[\2\u0517\u0515\3\2\2\2\u0517\u0516"+
		"\3\2\2\2\u0518\u00ad\3\2\2\2\u0519\u051b\5\16\b\2\u051a\u0519\3\2\2\2"+
		"\u051b\u051e\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f"+
		"\3\2\2\2\u051e\u051c\3\2\2\2\u051f\u0520\5Z.\2\u0520\u0521\5\u00dan\2"+
		"\u0521\u0522\7W\2\2\u0522\u0523\5\u00b8]\2\u0523\u00af\3\2\2\2\u0524\u0525"+
		"\5\u00b4[\2\u0525\u00b1\3\2\2\2\u0526\u0527\7H\2\2\u0527\u0528\5\u00b8"+
		"]\2\u0528\u0529\7I\2\2\u0529\u00b3\3\2\2\2\u052a\u052f\5\u00b8]\2\u052b"+
		"\u052c\7O\2\2\u052c\u052e\5\u00b8]\2\u052d\u052b\3\2\2\2\u052e\u0531\3"+
		"\2\2\2\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u00b5\3\2\2\2\u0531"+
		"\u052f\3\2\2\2\u0532\u0533\5\u00b8]\2\u0533\u00b7\3\2\2\2\u0534\u0535"+
		"\5\u00ba^\2\u0535\u00b9\3\2\2\2\u0536\u0537\b^\1\2\u0537\u0546\5\u00bc"+
		"_\2\u0538\u0539\7\"\2\2\u0539\u0546\5\u00be`\2\u053a\u053b\7H\2\2\u053b"+
		"\u053c\5Z.\2\u053c\u053d\7I\2\2\u053d\u053e\5\u00ba^\22\u053e\u0546\3"+
		"\2\2\2\u053f\u0540\t\7\2\2\u0540\u0546\5\u00ba^\21\u0541\u0542\7U\2\2"+
		"\u0542\u0546\5\u00ba^\20\u0543\u0544\7T\2\2\u0544\u0546\5\u00ba^\17\u0545"+
		"\u0536\3\2\2\2\u0545\u0538\3\2\2\2\u0545\u053a\3\2\2\2\u0545\u053f\3\2"+
		"\2\2\u0545\u0541\3\2\2\2\u0545\u0543\3\2\2\2\u0546\u059e\3\2\2\2\u0547"+
		"\u0548\f\16\2\2\u0548\u0549\t\b\2\2\u0549\u059d\5\u00ba^\17\u054a\u054b"+
		"\f\r\2\2\u054b\u054c\t\7\2\2\u054c\u059d\5\u00ba^\16\u054d\u0555\f\f\2"+
		"\2\u054e\u054f\7S\2\2\u054f\u0556\7S\2\2\u0550\u0551\7R\2\2\u0551\u0552"+
		"\7R\2\2\u0552\u0556\7R\2\2\u0553\u0554\7R\2\2\u0554\u0556\7R\2\2\u0555"+
		"\u054e\3\2\2\2\u0555\u0550\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u0557\3\2"+
		"\2\2\u0557\u059d\5\u00ba^\r\u0558\u0559\f\13\2\2\u0559\u055a\t\t\2\2\u055a"+
		"\u059d\5\u00ba^\f\u055b\u055c\f\t\2\2\u055c\u055d\7d\2\2\u055d\u059d\5"+
		"\u00ba^\n\u055e\u055f\f\b\2\2\u055f\u0560\7f\2\2\u0560\u059d\5\u00ba^"+
		"\t\u0561\u0562\f\7\2\2\u0562\u0563\7e\2\2\u0563\u059d\5\u00ba^\b\u0564"+
		"\u0565\f\6\2\2\u0565\u0566\7\\\2\2\u0566\u059d\5\u00ba^\7\u0567\u0568"+
		"\f\5\2\2\u0568\u0569\7]\2\2\u0569\u059d\5\u00ba^\6\u056a\u056b\f\4\2\2"+
		"\u056b\u056c\7V\2\2\u056c\u056d\5\u00ba^\2\u056d\u056e\7W\2\2\u056e\u056f"+
		"\5\u00ba^\5\u056f\u059d\3\2\2\2\u0570\u0571\f\3\2\2\u0571\u0572\t\n\2"+
		"\2\u0572\u059d\5\u00ba^\4\u0573\u0574\f\32\2\2\u0574\u0575\7P\2\2\u0575"+
		"\u059d\5\u00dan\2\u0576\u0577\f\31\2\2\u0577\u0578\7P\2\2\u0578\u059d"+
		"\7.\2\2\u0579\u057a\f\30\2\2\u057a\u057b\7P\2\2\u057b\u057d\7\"\2\2\u057c"+
		"\u057e\5\u00caf\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f"+
		"\3\2\2\2\u057f\u059d\5\u00c2b\2\u0580\u0581\f\27\2\2\u0581\u0582\7P\2"+
		"\2\u0582\u0583\7+\2\2\u0583\u059d\5\u00d0i\2\u0584\u0585\f\26\2\2\u0585"+
		"\u0586\7P\2\2\u0586\u059d\5\u00c8e\2\u0587\u0588\f\25\2\2\u0588\u0589"+
		"\7L\2\2\u0589\u058a\5\u00ba^\2\u058a\u058b\7M\2\2\u058b\u059d\3\2\2\2"+
		"\u058c\u058d\f\24\2\2\u058d\u0596\7H\2\2\u058e\u0593\5\u00ba^\2\u058f"+
		"\u0590\7O\2\2\u0590\u0592\5\u00ba^\2\u0591\u058f\3\2\2\2\u0592\u0595\3"+
		"\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0597\3\2\2\2\u0595"+
		"\u0593\3\2\2\2\u0596\u058e\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2"+
		"\2\2\u0598\u059d\7I\2\2\u0599\u059a\f\n\2\2\u059a\u059b\7\34\2\2\u059b"+
		"\u059d\5Z.\2\u059c\u0547\3\2\2\2\u059c\u054a\3\2\2\2\u059c\u054d\3\2\2"+
		"\2\u059c\u0558\3\2\2\2\u059c\u055b\3\2\2\2\u059c\u055e\3\2\2\2\u059c\u0561"+
		"\3\2\2\2\u059c\u0564\3\2\2\2\u059c\u0567\3\2\2\2\u059c\u056a\3\2\2\2\u059c"+
		"\u0570\3\2\2\2\u059c\u0573\3\2\2\2\u059c\u0576\3\2\2\2\u059c\u0579\3\2"+
		"\2\2\u059c\u0580\3\2\2\2\u059c\u0584\3\2\2\2\u059c\u0587\3\2\2\2\u059c"+
		"\u058c\3\2\2\2\u059c\u0599\3\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2"+
		"\2\2\u059e\u059f\3\2\2\2\u059f\u00bb\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1"+
		"\u05a2\7H\2\2\u05a2\u05a3\5\u00b8]\2\u05a3\u05a4\7I\2\2\u05a4\u05b7\3"+
		"\2\2\2\u05a5\u05b7\7.\2\2\u05a6\u05b7\7+\2\2\u05a7\u05b7\5t;\2\u05a8\u05b7"+
		"\5\u00dan\2\u05a9\u05aa\5Z.\2\u05aa\u05ab\7P\2\2\u05ab\u05ac\7\13\2\2"+
		"\u05ac\u05b7\3\2\2\2\u05ad\u05ae\7\63\2\2\u05ae\u05af\7P\2\2\u05af\u05b7"+
		"\7\13\2\2\u05b0\u05b4\5\u00caf\2\u05b1\u05b5\5\u00d2j\2\u05b2\u05b3\7"+
		".\2\2\u05b3\u05b5\5\u00d4k\2\u05b4\u05b1\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5"+
		"\u05b7\3\2\2\2\u05b6\u05a1\3\2\2\2\u05b6\u05a5\3\2\2\2\u05b6\u05a6\3\2"+
		"\2\2\u05b6\u05a7\3\2\2\2\u05b6\u05a8\3\2\2\2\u05b6\u05a9\3\2\2\2\u05b6"+
		"\u05ad\3\2\2\2\u05b6\u05b0\3\2\2\2\u05b7\u00bd\3\2\2\2\u05b8\u05b9\5\u00ca"+
		"f\2\u05b9\u05ba\5\u00c0a\2\u05ba\u05bb\5\u00c6d\2\u05bb\u05c2\3\2\2\2"+
		"\u05bc\u05bf\5\u00c0a\2\u05bd\u05c0\5\u00c4c\2\u05be\u05c0\5\u00c6d\2"+
		"\u05bf\u05bd\3\2\2\2\u05bf\u05be\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1\u05b8"+
		"\3\2\2\2\u05c1\u05bc\3\2\2\2\u05c2\u00bf\3\2\2\2\u05c3\u05c5\5\u00dan"+
		"\2\u05c4\u05c6\5\u00ccg\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6"+
		"\u05ce\3\2\2\2\u05c7\u05c8\7P\2\2\u05c8\u05ca\5\u00dan\2\u05c9\u05cb\5"+
		"\u00ccg\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\3\2\2\2"+
		"\u05cc\u05c7\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf"+
		"\3\2\2\2\u05cf\u05d3\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d3\5^\60\2\u05d2"+
		"\u05c3\3\2\2\2\u05d2\u05d1\3\2\2\2\u05d3\u00c1\3\2\2\2\u05d4\u05d6\5\u00da"+
		"n\2\u05d5\u05d7\5\u00ceh\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05d9\5\u00c6d\2\u05d9\u00c3\3\2\2\2\u05da\u05f6"+
		"\7L\2\2\u05db\u05e0\7M\2\2\u05dc\u05dd\7L\2\2\u05dd\u05df\7M\2\2\u05de"+
		"\u05dc\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2"+
		"\2\2\u05e1\u05e3\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3\u05f7\5R*\2\u05e4\u05e5"+
		"\5\u00b8]\2\u05e5\u05ec\7M\2\2\u05e6\u05e7\7L\2\2\u05e7\u05e8\5\u00b8"+
		"]\2\u05e8\u05e9\7M\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05e6\3\2\2\2\u05eb\u05ee"+
		"\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f3\3\2\2\2\u05ee"+
		"\u05ec\3\2\2\2\u05ef\u05f0\7L\2\2\u05f0\u05f2\7M\2\2\u05f1\u05ef\3\2\2"+
		"\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f7"+
		"\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05db\3\2\2\2\u05f6\u05e4\3\2\2\2\u05f7"+
		"\u00c5\3\2\2\2\u05f8\u05fa\5\u00d4k\2\u05f9\u05fb\5$\23\2\u05fa\u05f9"+
		"\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u00c7\3\2\2\2\u05fc\u05fd\5\u00caf"+
		"\2\u05fd\u05fe\5\u00d2j\2\u05fe\u00c9\3\2\2\2\u05ff\u0600\7S\2\2\u0600"+
		"\u0601\5\"\22\2\u0601\u0602\7R\2\2\u0602\u00cb\3\2\2\2\u0603\u0604\7S"+
		"\2\2\u0604\u0607\7R\2\2\u0605\u0607\5`\61\2\u0606\u0603\3\2\2\2\u0606"+
		"\u0605\3\2\2\2\u0607\u00cd\3\2\2\2\u0608\u0609\7S\2\2\u0609\u060c\7R\2"+
		"\2\u060a\u060c\5\u00caf\2\u060b\u0608\3\2\2\2\u060b\u060a\3\2\2\2\u060c"+
		"\u00cf\3\2\2\2\u060d\u0614\5\u00d4k\2\u060e\u060f\7P\2\2\u060f\u0611\5"+
		"\u00dan\2\u0610\u0612\5\u00d4k\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2"+
		"\2\u0612\u0614\3\2\2\2\u0613\u060d\3\2\2\2\u0613\u060e\3\2\2\2\u0614\u00d1"+
		"\3\2\2\2\u0615\u0616\7+\2\2\u0616\u061b\5\u00d0i\2\u0617\u0618\5\u00da"+
		"n\2\u0618\u0619\5\u00d4k\2\u0619\u061b\3\2\2\2\u061a\u0615\3\2\2\2\u061a"+
		"\u0617\3\2\2\2\u061b\u00d3\3\2\2\2\u061c\u061e\7H\2\2\u061d\u061f\5\u00b4"+
		"[\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620"+
		"\u0621\7I\2\2\u0621\u00d5\3\2\2\2\u0622\u0623\7 \2\2\u0623\u0624\7H\2"+
		"\2\u0624\u0625\5\u00b8]\2\u0625\u0626\7I\2\2\u0626\u0627\7N\2\2\u0627"+
		"\u00d7\3\2\2\2\u0628\u0629\5\u00dan\2\u0629\u00d9\3\2\2\2\u062a\u062b"+
		"\5\u00dco\2\u062b\u00db\3\2\2\2\u062c\u0631\7;\2\2\u062d\u0631\7=\2\2"+
		"\u062e\u0631\7>\2\2\u062f\u0631\7?\2\2\u0630\u062c\3\2\2\2\u0630\u062d"+
		"\3\2\2\2\u0630\u062e\3\2\2\2\u0630\u062f\3\2\2\2\u0631\u00dd\3\2\2\2\u0632"+
		"\u0633\t\13\2\2\u0633\u00df\3\2\2\2\u0634\u0636\5\u00e2r\2\u0635\u0634"+
		"\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u063a\3\2\2\2\u0637\u0639\5\u00e4s"+
		"\2\u0638\u0637\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2\2\2\u063a\u063b"+
		"\3\2\2\2\u063b\u0640\3\2\2\2\u063c\u063a\3\2\2\2\u063d\u063f\5\u00e6t"+
		"\2\u063e\u063d\3\2\2\2\u063f\u0642\3\2\2\2\u0640\u063e\3\2\2\2\u0640\u0641"+
		"\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0640\3\2\2\2\u0643\u0644\7\2\2\3\u0644"+
		"\u00e1\3\2\2\2\u0645\u0647\5\u014c\u00a7\2\u0646\u0645\3\2\2\2\u0647\u064a"+
		"\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064b\3\2\2\2\u064a"+
		"\u0648\3\2\2\2\u064b\u064c\7#\2\2\u064c\u064d\5\u0148\u00a5\2\u064d\u064e"+
		"\7N\2\2\u064e\u00e3\3\2\2\2\u064f\u0651\7\33\2\2\u0650\u0652\7)\2\2\u0651"+
		"\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0656\5\u0148"+
		"\u00a5\2\u0654\u0655\7P\2\2\u0655\u0657\7b\2\2\u0656\u0654\3\2\2\2\u0656"+
		"\u0657\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u0659\7N\2\2\u0659\u00e5\3\2"+
		"\2\2\u065a\u065c\5\u00eav\2\u065b\u065a\3\2\2\2\u065c\u065f\3\2\2\2\u065d"+
		"\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2\2\2\u065f\u065d\3\2"+
		"\2\2\u0660\u0678\5\u00eex\2\u0661\u0663\5\u00eav\2\u0662\u0661\3\2\2\2"+
		"\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0667"+
		"\3\2\2\2\u0666\u0664\3\2\2\2\u0667\u0678\5\u00f6|\2\u0668\u066a\5\u00ea"+
		"v\2\u0669\u0668\3\2\2\2\u066a\u066d\3\2\2\2\u066b\u0669\3\2\2\2\u066b"+
		"\u066c\3\2\2\2\u066c\u066e\3\2\2\2\u066d\u066b\3\2\2\2\u066e\u0678\5\u00fe"+
		"\u0080\2\u066f\u0671\5\u00eav\2\u0670\u066f\3\2\2\2\u0671\u0674\3\2\2"+
		"\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0675\3\2\2\2\u0674\u0672"+
		"\3\2\2\2\u0675\u0678\5\u0158\u00ad\2\u0676\u0678\7N\2\2\u0677\u065d\3"+
		"\2\2\2\u0677\u0664\3\2\2\2\u0677\u066b\3\2\2\2\u0677\u0672\3\2\2\2\u0677"+
		"\u0676\3\2\2\2\u0678\u00e7\3\2\2\2\u0679\u067c\5\u00eav\2\u067a\u067c"+
		"\t\2\2\2\u067b\u0679\3\2\2\2\u067b\u067a\3\2\2\2\u067c\u00e9\3\2\2\2\u067d"+
		"\u0680\5\u014c\u00a7\2\u067e\u0680\t\f\2\2\u067f\u067d\3\2\2\2\u067f\u067e"+
		"\3\2\2\2\u0680\u00eb\3\2\2\2\u0681\u0684\7\24\2\2\u0682\u0684\5\u014c"+
		"\u00a7\2\u0683\u0681\3\2\2\2\u0683\u0682\3\2\2\2\u0684\u00ed\3\2\2\2\u0685"+
		"\u0686\7\13\2\2\u0686\u0688\7<\2\2\u0687\u0689\5\u00f0y\2\u0688\u0687"+
		"\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u068b\7\23\2\2"+
		"\u068b\u068d\5\u0130\u0099\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d"+
		"\u0690\3\2\2\2\u068e\u068f\7\32\2\2\u068f\u0691\5\u0100\u0081\2\u0690"+
		"\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0693\5\u0102"+
		"\u0082\2\u0693\u00ef\3\2\2\2\u0694\u0695\7S\2\2\u0695\u069a\5\u00f2z\2"+
		"\u0696\u0697\7O\2\2\u0697\u0699\5\u00f2z\2\u0698\u0696\3\2\2\2\u0699\u069c"+
		"\3\2\2\2\u069a\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069d\3\2\2\2\u069c"+
		"\u069a\3\2\2\2\u069d\u069e\7R\2\2\u069e\u00f1\3\2\2\2\u069f\u06a2\7<\2"+
		"\2\u06a0\u06a1\7\23\2\2\u06a1\u06a3\5\u00f4{\2\u06a2\u06a0\3\2\2\2\u06a2"+
		"\u06a3\3\2\2\2\u06a3\u00f3\3\2\2\2\u06a4\u06a9\5\u0130\u0099\2\u06a5\u06a6"+
		"\7d\2\2\u06a6\u06a8\5\u0130\u0099\2\u06a7\u06a5\3\2\2\2\u06a8\u06ab\3"+
		"\2\2\2\u06a9\u06a7\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u00f5\3\2\2\2\u06ab"+
		"\u06a9\3\2\2\2\u06ac\u06ad\7\22\2\2\u06ad\u06b0\7<\2\2\u06ae\u06af\7\32"+
		"\2\2\u06af\u06b1\5\u0100\u0081\2\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2\2"+
		"\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4\7J\2\2\u06b3\u06b5\5\u00f8}\2\u06b4"+
		"\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06b8\7O"+
		"\2\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06ba\3\2\2\2\u06b9"+
		"\u06bb\5\u00fc\177\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc"+
		"\3\2\2\2\u06bc\u06bd\7K\2\2\u06bd\u00f7\3\2\2\2\u06be\u06c3\5\u00fa~\2"+
		"\u06bf\u06c0\7O\2\2\u06c0\u06c2\5\u00fa~\2\u06c1\u06bf\3\2\2\2\u06c2\u06c5"+
		"\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u00f9\3\2\2\2\u06c5"+
		"\u06c3\3\2\2\2\u06c6\u06c8\5\u014c\u00a7\2\u06c7\u06c6\3\2\2\2\u06c8\u06cb"+
		"\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc\3\2\2\2\u06cb"+
		"\u06c9\3\2\2\2\u06cc\u06ce\7<\2\2\u06cd\u06cf\5\u01ac\u00d7\2\u06ce\u06cd"+
		"\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d1\3\2\2\2\u06d0\u06d2\5\u0102\u0082"+
		"\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u00fb\3\2\2\2\u06d3\u06d7"+
		"\7N\2\2\u06d4\u06d6\5\u0106\u0084\2\u06d5\u06d4\3\2\2\2\u06d6\u06d9\3"+
		"\2\2\2\u06d7\u06d5\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u00fd\3\2\2\2\u06d9"+
		"\u06d7\3\2\2\2\u06da\u06db\7\36\2\2\u06db\u06dd\7<\2\2\u06dc\u06de\5\u00f0"+
		"y\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e1\3\2\2\2\u06df"+
		"\u06e0\7\23\2\2\u06e0\u06e2\5\u0100\u0081\2\u06e1\u06df\3\2\2\2\u06e1"+
		"\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4\5\u0104\u0083\2\u06e4\u00ff"+
		"\3\2\2\2\u06e5\u06ea\5\u0130\u0099\2\u06e6\u06e7\7O\2\2\u06e7\u06e9\5"+
		"\u0130\u0099\2\u06e8\u06e6\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2"+
		"\2\2\u06ea\u06eb\3\2\2\2\u06eb\u0101\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed"+
		"\u06f1\7J\2\2\u06ee\u06f0\5\u0106\u0084\2\u06ef\u06ee\3\2\2\2\u06f0\u06f3"+
		"\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f4\3\2\2\2\u06f3"+
		"\u06f1\3\2\2\2\u06f4\u06f5\7K\2\2\u06f5\u0103\3\2\2\2\u06f6\u06fa\7J\2"+
		"\2\u06f7\u06f9\5\u0114\u008b\2\u06f8\u06f7\3\2\2\2\u06f9\u06fc\3\2\2\2"+
		"\u06fa\u06f8\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fd\3\2\2\2\u06fc\u06fa"+
		"\3\2\2\2\u06fd\u06fe\7K\2\2\u06fe\u0105\3\2\2\2\u06ff\u070c\7N\2\2\u0700"+
		"\u0702\7)\2\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\3\2"+
		"\2\2\u0703\u070c\5\u0168\u00b5\2\u0704\u0706\5\u00e8u\2\u0705\u0704\3"+
		"\2\2\2\u0706\u0709\3\2\2\2\u0707\u0705\3\2\2\2\u0707\u0708\3\2\2\2\u0708"+
		"\u070a\3\2\2\2\u0709\u0707\3\2\2\2\u070a\u070c\5\u0108\u0085\2\u070b\u06ff"+
		"\3\2\2\2\u070b\u0701\3\2\2\2\u070b\u0707\3\2\2\2\u070c\u0107\3\2\2\2\u070d"+
		"\u0717\5\u010a\u0086\2\u070e\u0717\5\u010c\u0087\2\u070f\u0717\5\u0112"+
		"\u008a\2\u0710\u0717\5\u010e\u0088\2\u0711\u0717\5\u0110\u0089\2\u0712"+
		"\u0717\5\u00fe\u0080\2\u0713\u0717\5\u0158\u00ad\2\u0714\u0717\5\u00ee"+
		"x\2\u0715\u0717\5\u00f6|\2\u0716\u070d\3\2\2\2\u0716\u070e\3\2\2\2\u0716"+
		"\u070f\3\2\2\2\u0716\u0710\3\2\2\2\u0716\u0711\3\2\2\2\u0716\u0712\3\2"+
		"\2\2\u0716\u0713\3\2\2\2\u0716\u0714\3\2\2\2\u0716\u0715\3\2\2\2\u0717"+
		"\u0109\3\2\2\2\u0718\u071b\5\u0130\u0099\2\u0719\u071b\7\63\2\2\u071a"+
		"\u0718\3\2\2\2\u071a\u0719\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071d\7<"+
		"\2\2\u071d\u0722\5\u013c\u009f\2\u071e\u071f\7L\2\2\u071f\u0721\7M\2\2"+
		"\u0720\u071e\3\2\2\2\u0721\u0724\3\2\2\2\u0722\u0720\3\2\2\2\u0722\u0723"+
		"\3\2\2\2\u0723\u0727\3\2\2\2\u0724\u0722\3\2\2\2\u0725\u0726\7\60\2\2"+
		"\u0726\u0728\5\u013a\u009e\2\u0727\u0725\3\2\2\2\u0727\u0728\3\2\2\2\u0728"+
		"\u072b\3\2\2\2\u0729\u072c\5\u0144\u00a3\2\u072a\u072c\7N\2\2\u072b\u0729"+
		"\3\2\2\2\u072b\u072a\3\2\2\2\u072c\u010b\3\2\2\2\u072d\u072e\5\u00f0y"+
		"\2\u072e\u072f\5\u010a\u0086\2\u072f\u010d\3\2\2\2\u0730\u0731\7<\2\2"+
		"\u0731\u0734\5\u013c\u009f\2\u0732\u0733\7\60\2\2\u0733\u0735\5\u013a"+
		"\u009e\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3\2\2\2\u0736"+
		"\u0737\5\u0146\u00a4\2\u0737\u010f\3\2\2\2\u0738\u0739\5\u00f0y\2\u0739"+
		"\u073a\5\u010e\u0088\2\u073a\u0111\3\2\2\2\u073b\u073c\5\u0130\u0099\2"+
		"\u073c\u073d\5\u0120\u0091\2\u073d\u073e\7N\2\2\u073e\u0113\3\2\2\2\u073f"+
		"\u0741\5\u00e8u\2\u0740\u073f\3\2\2\2\u0741\u0744\3\2\2\2\u0742\u0740"+
		"\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745\3\2\2\2\u0744\u0742\3\2\2\2\u0745"+
		"\u0748\5\u0116\u008c\2\u0746\u0748\7N\2\2\u0747\u0742\3\2\2\2\u0747\u0746"+
		"\3\2\2\2\u0748\u0115\3\2\2\2\u0749\u0751\5\u0118\u008d\2\u074a\u0751\5"+
		"\u011c\u008f\2\u074b\u0751\5\u011e\u0090\2\u074c\u0751\5\u00fe\u0080\2"+
		"\u074d\u0751\5\u0158\u00ad\2\u074e\u0751\5\u00eex\2\u074f\u0751\5\u00f6"+
		"|\2\u0750\u0749\3\2\2\2\u0750\u074a\3\2\2\2\u0750\u074b\3\2\2\2\u0750"+
		"\u074c\3\2\2\2\u0750\u074d\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u074f\3\2"+
		"\2\2\u0751\u0117\3\2\2\2\u0752\u0753\5\u0130\u0099\2\u0753\u0758\5\u011a"+
		"\u008e\2\u0754\u0755\7O\2\2\u0755\u0757\5\u011a\u008e\2\u0756\u0754\3"+
		"\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759"+
		"\u075b\3\2\2\2\u075a\u0758\3\2\2\2\u075b\u075c\7N\2\2\u075c\u0119\3\2"+
		"\2\2\u075d\u0762\7<\2\2\u075e\u075f\7L\2\2\u075f\u0761\7M\2\2\u0760\u075e"+
		"\3\2\2\2\u0761\u0764\3\2\2\2\u0762\u0760\3\2\2\2\u0762\u0763\3\2\2\2\u0763"+
		"\u0765\3\2\2\2\u0764\u0762\3\2\2\2\u0765\u0766\7Q\2\2\u0766\u0767\5\u0126"+
		"\u0094\2\u0767\u011b\3\2\2\2\u0768\u076b\5\u0130\u0099\2\u0769\u076b\7"+
		"\63\2\2\u076a\u0768\3\2\2\2\u076a\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c"+
		"\u076d\7<\2\2\u076d\u0772\5\u013c\u009f\2\u076e\u076f\7L\2\2\u076f\u0771"+
		"\7M\2\2\u0770\u076e\3\2\2\2\u0771\u0774\3\2\2\2\u0772\u0770\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0777\3\2\2\2\u0774\u0772\3\2\2\2\u0775\u0776\7\60"+
		"\2\2\u0776\u0778\5\u013a\u009e\2\u0777\u0775\3\2\2\2\u0777\u0778\3\2\2"+
		"\2\u0778\u0779\3\2\2\2\u0779\u077a\7N\2\2\u077a\u011d\3\2\2\2\u077b\u077c"+
		"\5\u00f0y\2\u077c\u077d\5\u011c\u008f\2\u077d\u011f\3\2\2\2\u077e\u0783"+
		"\5\u0122\u0092\2\u077f\u0780\7O\2\2\u0780\u0782\5\u0122\u0092\2\u0781"+
		"\u077f\3\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2"+
		"\2\2\u0784\u0121\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u0789\5\u0124\u0093"+
		"\2\u0787\u0788\7Q\2\2\u0788\u078a\5\u0126\u0094\2\u0789\u0787\3\2\2\2"+
		"\u0789\u078a\3\2\2\2\u078a\u0123\3\2\2\2\u078b\u0790\7<\2\2\u078c\u078d"+
		"\7L\2\2\u078d\u078f\7M\2\2\u078e\u078c\3\2\2\2\u078f\u0792\3\2\2\2\u0790"+
		"\u078e\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0125\3\2\2\2\u0792\u0790\3\2"+
		"\2\2\u0793\u0796\5\u0128\u0095\2\u0794\u0796\5\u0192\u00ca\2\u0795\u0793"+
		"\3\2\2\2\u0795\u0794\3\2\2\2\u0796\u0127\3\2\2\2\u0797\u07a3\7J\2\2\u0798"+
		"\u079d\5\u0126\u0094\2\u0799\u079a\7O\2\2\u079a\u079c\5\u0126\u0094\2"+
		"\u079b\u0799\3\2\2\2\u079c\u079f\3\2\2\2\u079d\u079b\3\2\2\2\u079d\u079e"+
		"\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u07a0\u07a2\7O\2\2\u07a1"+
		"\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\3\2\2\2\u07a3\u0798\3\2"+
		"\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a6\7K\2\2\u07a6"+
		"\u0129\3\2\2\2\u07a7\u07a8\5\u0148\u00a5\2\u07a8\u012b\3\2\2\2\u07a9\u07aa"+
		"\7<\2\2\u07aa\u012d\3\2\2\2\u07ab\u07ac\5\u0148\u00a5\2\u07ac\u012f\3"+
		"\2\2\2\u07ad\u07b2\5\u0132\u009a\2\u07ae\u07af\7L\2\2\u07af\u07b1\7M\2"+
		"\2\u07b0\u07ae\3\2\2\2\u07b1\u07b4\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b2\u07b3"+
		"\3\2\2\2\u07b3\u07be\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b5\u07ba\5\u0134\u009b"+
		"\2\u07b6\u07b7\7L\2\2\u07b7\u07b9\7M\2\2\u07b8\u07b6\3\2\2\2\u07b9\u07bc"+
		"\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07be\3\2\2\2\u07bc"+
		"\u07ba\3\2\2\2\u07bd\u07ad\3\2\2\2\u07bd\u07b5\3\2\2\2\u07be\u0131\3\2"+
		"\2\2\u07bf\u07c1\7<\2\2\u07c0\u07c2\5\u0136\u009c\2\u07c1\u07c0\3\2\2"+
		"\2\u07c1\u07c2\3\2\2\2\u07c2\u07ca\3\2\2\2\u07c3\u07c4\7P\2\2\u07c4\u07c6"+
		"\7<\2\2\u07c5\u07c7\5\u0136\u009c\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3"+
		"\2\2\2\u07c7\u07c9\3\2\2\2\u07c8\u07c3\3\2\2\2\u07c9\u07cc\3\2\2\2\u07ca"+
		"\u07c8\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u0133\3\2\2\2\u07cc\u07ca\3\2"+
		"\2\2\u07cd\u07ce\t\4\2\2\u07ce\u0135\3\2\2\2\u07cf\u07d0\7S\2\2\u07d0"+
		"\u07d5\5\u0138\u009d\2\u07d1\u07d2\7O\2\2\u07d2\u07d4\5\u0138\u009d\2"+
		"\u07d3\u07d1\3\2\2\2\u07d4\u07d7\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6"+
		"\3\2\2\2\u07d6\u07d8\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d8\u07d9\7R\2\2\u07d9"+
		"\u0137\3\2\2\2\u07da\u07e1\5\u0130\u0099\2\u07db\u07de\7V\2\2\u07dc\u07dd"+
		"\t\5\2\2\u07dd\u07df\5\u0130\u0099\2\u07de\u07dc\3\2\2\2\u07de\u07df\3"+
		"\2\2\2\u07df\u07e1\3\2\2\2\u07e0\u07da\3\2\2\2\u07e0\u07db\3\2\2\2\u07e1"+
		"\u0139\3\2\2\2\u07e2\u07e7\5\u0148\u00a5\2\u07e3\u07e4\7O\2\2\u07e4\u07e6"+
		"\5\u0148\u00a5\2\u07e5\u07e3\3\2\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07e5\3"+
		"\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u013b\3\2\2\2\u07e9\u07e7\3\2\2\2\u07ea"+
		"\u07ec\7H\2\2\u07eb\u07ed\5\u013e\u00a0\2\u07ec\u07eb\3\2\2\2\u07ec\u07ed"+
		"\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef\7I\2\2\u07ef\u013d\3\2\2\2\u07f0"+
		"\u07f5\5\u0140\u00a1\2\u07f1\u07f2\7O\2\2\u07f2\u07f4\5\u0140\u00a1\2"+
		"\u07f3\u07f1\3\2\2\2\u07f4\u07f7\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f5\u07f6"+
		"\3\2\2\2\u07f6\u07fa\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f8\u07f9\7O\2\2\u07f9"+
		"\u07fb\5\u0142\u00a2\2\u07fa\u07f8\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fe"+
		"\3\2\2\2\u07fc\u07fe\5\u0142\u00a2\2\u07fd\u07f0\3\2\2\2\u07fd\u07fc\3"+
		"\2\2\2\u07fe\u013f\3\2\2\2\u07ff\u0801\5\u00ecw\2\u0800\u07ff\3\2\2\2"+
		"\u0801\u0804\3\2\2\2\u0802\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0805"+
		"\3\2\2\2\u0804\u0802\3\2\2\2\u0805\u0806\5\u0130\u0099\2\u0806\u0807\5"+
		"\u0124\u0093\2\u0807\u0141\3\2\2\2\u0808\u080a\5\u00ecw\2\u0809\u0808"+
		"\3\2\2\2\u080a\u080d\3\2\2\2\u080b\u0809\3\2\2\2\u080b\u080c\3\2\2\2\u080c"+
		"\u080e\3\2\2\2\u080d\u080b\3\2\2\2\u080e\u080f\5\u0130\u0099\2\u080f\u0810"+
		"\7t\2\2\u0810\u0811\5\u0124\u0093\2\u0811\u0143\3\2\2\2\u0812\u0813\5"+
		"\u0168\u00b5\2\u0813\u0145\3\2\2\2\u0814\u0815\5\u0168\u00b5\2\u0815\u0147"+
		"\3\2\2\2\u0816\u081b\7<\2\2\u0817\u0818\7P\2\2\u0818\u081a\7<\2\2\u0819"+
		"\u0817\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2"+
		"\2\2\u081c\u0149\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u081f\t\6\2\2\u081f"+
		"\u014b\3\2\2\2\u0820\u0821\7s\2\2\u0821\u0828\5\u014e\u00a8\2\u0822\u0825"+
		"\7H\2\2\u0823\u0826\5\u0150\u00a9\2\u0824\u0826\5\u0154\u00ab\2\u0825"+
		"\u0823\3\2\2\2\u0825\u0824\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0827\3\2"+
		"\2\2\u0827\u0829\7I\2\2\u0828\u0822\3\2\2\2\u0828\u0829\3\2\2\2\u0829"+
		"\u014d\3\2\2\2\u082a\u082b\5\u0148\u00a5\2\u082b\u014f\3\2\2\2\u082c\u0831"+
		"\5\u0152\u00aa\2\u082d\u082e\7O\2\2\u082e\u0830\5\u0152\u00aa\2\u082f"+
		"\u082d\3\2\2\2\u0830\u0833\3\2\2\2\u0831\u082f\3\2\2\2\u0831\u0832\3\2"+
		"\2\2\u0832\u0151\3\2\2\2\u0833\u0831\3\2\2\2\u0834\u0835\7<\2\2\u0835"+
		"\u0836\7Q\2\2\u0836\u0837\5\u0154\u00ab\2\u0837\u0153\3\2\2\2\u0838\u083c"+
		"\5\u0192\u00ca\2\u0839\u083c\5\u014c\u00a7\2\u083a\u083c\5\u0156\u00ac"+
		"\2\u083b\u0838\3\2\2\2\u083b\u0839\3\2\2\2\u083b\u083a\3\2\2\2\u083c\u0155"+
		"\3\2\2\2\u083d\u0846\7J\2\2\u083e\u0843\5\u0154\u00ab\2\u083f\u0840\7"+
		"O\2\2\u0840\u0842\5\u0154\u00ab\2\u0841\u083f\3\2\2\2\u0842\u0845\3\2"+
		"\2\2\u0843\u0841\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0847\3\2\2\2\u0845"+
		"\u0843\3\2\2\2\u0846\u083e\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0849\3\2"+
		"\2\2\u0848\u084a\7O\2\2\u0849\u0848\3\2\2\2\u0849\u084a\3\2\2\2\u084a"+
		"\u084b\3\2\2\2\u084b\u084c\7K\2\2\u084c\u0157\3\2\2\2\u084d\u084e\7s\2"+
		"\2\u084e\u084f\7\36\2\2\u084f\u0850\7<\2\2\u0850\u0851\5\u015a\u00ae\2"+
		"\u0851\u0159\3\2\2\2\u0852\u0856\7J\2\2\u0853\u0855\5\u015c\u00af\2\u0854"+
		"\u0853\3\2\2\2\u0855\u0858\3\2\2\2\u0856\u0854\3\2\2\2\u0856\u0857\3\2"+
		"\2\2\u0857\u0859\3\2\2\2\u0858\u0856\3\2\2\2\u0859\u085a\7K\2\2\u085a"+
		"\u015b\3\2\2\2\u085b\u085d\5\u00e8u\2\u085c\u085b\3\2\2\2\u085d\u0860"+
		"\3\2\2\2\u085e\u085c\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0861\3\2\2\2\u0860"+
		"\u085e\3\2\2\2\u0861\u0864\5\u015e\u00b0\2\u0862\u0864\7N\2\2\u0863\u085e"+
		"\3\2\2\2\u0863\u0862\3\2\2\2\u0864\u015d\3\2\2\2\u0865\u0866\5\u0130\u0099"+
		"\2\u0866\u0867\5\u0160\u00b1\2\u0867\u0868\7N\2\2\u0868\u087a\3\2\2\2"+
		"\u0869\u086b\5\u00eex\2\u086a\u086c\7N\2\2\u086b\u086a\3\2\2\2\u086b\u086c"+
		"\3\2\2\2\u086c\u087a\3\2\2\2\u086d\u086f\5\u00fe\u0080\2\u086e\u0870\7"+
		"N\2\2\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u087a\3\2\2\2\u0871"+
		"\u0873\5\u00f6|\2\u0872\u0874\7N\2\2\u0873\u0872\3\2\2\2\u0873\u0874\3"+
		"\2\2\2\u0874\u087a\3\2\2\2\u0875\u0877\5\u0158\u00ad\2\u0876\u0878\7N"+
		"\2\2\u0877\u0876\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u087a\3\2\2\2\u0879"+
		"\u0865\3\2\2\2\u0879\u0869\3\2\2\2\u0879\u086d\3\2\2\2\u0879\u0871\3\2"+
		"\2\2\u0879\u0875\3\2\2\2\u087a\u015f\3\2\2\2\u087b\u087e\5\u0162\u00b2"+
		"\2\u087c\u087e\5\u0164\u00b3\2\u087d\u087b\3\2\2\2\u087d\u087c\3\2\2\2"+
		"\u087e\u0161\3\2\2\2\u087f\u0880\7<\2\2\u0880\u0881\7H\2\2\u0881\u0883"+
		"\7I\2\2\u0882\u0884\5\u0166\u00b4\2\u0883\u0882\3\2\2\2\u0883\u0884\3"+
		"\2\2\2\u0884\u0163\3\2\2\2\u0885\u0886\5\u0120\u0091\2\u0886\u0165\3\2"+
		"\2\2\u0887\u0888\7\16\2\2\u0888\u0889\5\u0154\u00ab\2\u0889\u0167\3\2"+
		"\2\2\u088a\u088e\7J\2\2\u088b\u088d\5\u016a\u00b6\2\u088c\u088b\3\2\2"+
		"\2\u088d\u0890\3\2\2\2\u088e\u088c\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0891"+
		"\3\2\2\2\u0890\u088e\3\2\2\2\u0891\u0892\7K\2\2\u0892\u0169\3\2\2\2\u0893"+
		"\u0897\5\u016c\u00b7\2\u0894\u0897\5\u0170\u00b9\2\u0895\u0897\5\u00e6"+
		"t\2\u0896\u0893\3\2\2\2\u0896\u0894\3\2\2\2\u0896\u0895\3\2\2\2\u0897"+
		"\u016b\3\2\2\2\u0898\u0899\5\u016e\u00b8\2\u0899\u089a\7N\2\2\u089a\u016d"+
		"\3\2\2\2\u089b\u089d\5\u00ecw\2\u089c\u089b\3\2\2\2\u089d\u08a0\3\2\2"+
		"\2\u089e\u089c\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a1\3\2\2\2\u08a0\u089e"+
		"\3\2\2\2\u08a1\u08a2\5\u0130\u0099\2\u08a2\u08a3\5\u0120\u0091\2\u08a3"+
		"\u016f\3\2\2\2\u08a4\u090d\5\u0168\u00b5\2\u08a5\u08a6\7\4\2\2\u08a6\u08a9"+
		"\5\u0192\u00ca\2\u08a7\u08a8\7W\2\2\u08a8\u08aa\5\u0192\u00ca\2\u08a9"+
		"\u08a7\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ac\7N"+
		"\2\2\u08ac\u090d\3\2\2\2\u08ad\u08ae\7\30\2\2\u08ae\u08af\5\u018a\u00c6"+
		"\2\u08af\u08b2\5\u0170\u00b9\2\u08b0\u08b1\7\21\2\2\u08b1\u08b3\5\u0170"+
		"\u00b9\2\u08b2\u08b0\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u090d\3\2\2\2\u08b4"+
		"\u08b5\7\27\2\2\u08b5\u08b6\7H\2\2\u08b6\u08b7\5\u0182\u00c2\2\u08b7\u08b8"+
		"\7I\2\2\u08b8\u08b9\5\u0170\u00b9\2\u08b9\u090d\3\2\2\2\u08ba\u08bb\7"+
		"\65\2\2\u08bb\u08bc\5\u018a\u00c6\2\u08bc\u08bd\5\u0170\u00b9\2\u08bd"+
		"\u090d\3\2\2\2\u08be\u08bf\7\17\2\2\u08bf\u08c0\5\u0170\u00b9\2\u08c0"+
		"\u08c1\7\65\2\2\u08c1\u08c2\5\u018a\u00c6\2\u08c2\u08c3\7N\2\2\u08c3\u090d"+
		"\3\2\2\2\u08c4\u08c5\7\62\2\2\u08c5\u08cf\5\u0168\u00b5\2\u08c6\u08c8"+
		"\5\u0172\u00ba\2\u08c7\u08c6\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08c7\3"+
		"\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cc\3\2\2\2\u08cb\u08cd\5\u0176\u00bc"+
		"\2\u08cc\u08cb\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08d0\3\2\2\2\u08ce\u08d0"+
		"\5\u0176\u00bc\2\u08cf\u08c7\3\2\2\2\u08cf\u08ce\3\2\2\2\u08d0\u090d\3"+
		"\2\2\2\u08d1\u08d2\7\62\2\2\u08d2\u08d3\5\u0178\u00bd\2\u08d3\u08d7\5"+
		"\u0168\u00b5\2\u08d4\u08d6\5\u0172\u00ba\2\u08d5\u08d4\3\2\2\2\u08d6\u08d9"+
		"\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08db\3\2\2\2\u08d9"+
		"\u08d7\3\2\2\2\u08da\u08dc\5\u0176\u00bc\2\u08db\u08da\3\2\2\2\u08db\u08dc"+
		"\3\2\2\2\u08dc\u090d\3\2\2\2\u08dd\u08de\7,\2\2\u08de\u08df\5\u018a\u00c6"+
		"\2\u08df\u08e3\7J\2\2\u08e0\u08e2\5\u017e\u00c0\2\u08e1\u08e0\3\2\2\2"+
		"\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e9"+
		"\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u08e8\5\u0180\u00c1\2\u08e7\u08e6\3"+
		"\2\2\2\u08e8\u08eb\3\2\2\2\u08e9\u08e7\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea"+
		"\u08ec\3\2\2\2\u08eb\u08e9\3\2\2\2\u08ec\u08ed\7K\2\2\u08ed\u090d\3\2"+
		"\2\2\u08ee\u08ef\7-\2\2\u08ef\u08f0\5\u018a\u00c6\2\u08f0\u08f1\5\u0168"+
		"\u00b5\2\u08f1\u090d\3\2\2\2\u08f2\u08f4\7\'\2\2\u08f3\u08f5\5\u0192\u00ca"+
		"\2\u08f4\u08f3\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u090d"+
		"\7N\2\2\u08f7\u08f8\7/\2\2\u08f8\u08f9\5\u0192\u00ca\2\u08f9\u08fa\7N"+
		"\2\2\u08fa\u090d\3\2\2\2\u08fb\u08fd\7\6\2\2\u08fc\u08fe\7<\2\2\u08fd"+
		"\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u090d\7N"+
		"\2\2\u0900\u0902\7\r\2\2\u0901\u0903\7<\2\2\u0902\u0901\3\2\2\2\u0902"+
		"\u0903\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u090d\7N\2\2\u0905\u090d\7N\2"+
		"\2\u0906\u0907\5\u018e\u00c8\2\u0907\u0908\7N\2\2\u0908\u090d\3\2\2\2"+
		"\u0909\u090a\7<\2\2\u090a\u090b\7W\2\2\u090b\u090d\5\u0170\u00b9\2\u090c"+
		"\u08a4\3\2\2\2\u090c\u08a5\3\2\2\2\u090c\u08ad\3\2\2\2\u090c\u08b4\3\2"+
		"\2\2\u090c\u08ba\3\2\2\2\u090c\u08be\3\2\2\2\u090c\u08c4\3\2\2\2\u090c"+
		"\u08d1\3\2\2\2\u090c\u08dd\3\2\2\2\u090c\u08ee\3\2\2\2\u090c\u08f2\3\2"+
		"\2\2\u090c\u08f7\3\2\2\2\u090c\u08fb\3\2\2\2\u090c\u0900\3\2\2\2\u090c"+
		"\u0905\3\2\2\2\u090c\u0906\3\2\2\2\u090c\u0909\3\2\2\2\u090d\u0171\3\2"+
		"\2\2\u090e\u090f\7\t\2\2\u090f\u0913\7H\2\2\u0910\u0912\5\u00ecw\2\u0911"+
		"\u0910\3\2\2\2\u0912\u0915\3\2\2\2\u0913\u0911\3\2\2\2\u0913\u0914\3\2"+
		"\2\2\u0914\u0916\3\2\2\2\u0915\u0913\3\2\2\2\u0916\u0917\5\u0174\u00bb"+
		"\2\u0917\u0918\7<\2\2\u0918\u0919\7I\2\2\u0919\u091a\5\u0168\u00b5\2\u091a"+
		"\u0173\3\2\2\2\u091b\u0920\5\u0148\u00a5\2\u091c\u091d\7e\2\2\u091d\u091f"+
		"\5\u0148\u00a5\2\u091e\u091c\3\2\2\2\u091f\u0922\3\2\2\2\u0920\u091e\3"+
		"\2\2\2\u0920\u0921\3\2\2\2\u0921\u0175\3\2\2\2\u0922\u0920\3\2\2\2\u0923"+
		"\u0924\7\25\2\2\u0924\u0925\5\u0168\u00b5\2\u0925\u0177\3\2\2\2\u0926"+
		"\u0927\7H\2\2\u0927\u0929\5\u017a\u00be\2\u0928\u092a\7N\2\2\u0929\u0928"+
		"\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c\7I\2\2\u092c"+
		"\u0179\3\2\2\2\u092d\u0932\5\u017c\u00bf\2\u092e\u092f\7N\2\2\u092f\u0931"+
		"\5\u017c\u00bf\2\u0930\u092e\3\2\2\2\u0931\u0934\3\2\2\2\u0932\u0930\3"+
		"\2\2\2\u0932\u0933\3\2\2\2\u0933\u017b\3\2\2\2\u0934\u0932\3\2\2\2\u0935"+
		"\u0937\5\u00ecw\2\u0936\u0935\3\2\2\2\u0937\u093a\3\2\2\2\u0938\u0936"+
		"\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093b\3\2\2\2\u093a\u0938\3\2\2\2\u093b"+
		"\u093c\5\u0132\u009a\2\u093c\u093d\5\u0124\u0093\2\u093d\u093e\7Q\2\2"+
		"\u093e\u093f\5\u0192\u00ca\2\u093f\u017d\3\2\2\2\u0940\u0942\5\u0180\u00c1"+
		"\2\u0941\u0940\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0941\3\2\2\2\u0943\u0944"+
		"\3\2\2\2\u0944\u0946\3\2\2\2\u0945\u0947\5\u016a\u00b6\2\u0946\u0945\3"+
		"\2\2\2\u0947\u0948\3\2\2\2\u0948\u0946\3\2\2\2\u0948\u0949\3\2\2\2\u0949"+
		"\u017f\3\2\2\2\u094a\u094b\7\b\2\2\u094b\u094c\5\u0190\u00c9\2\u094c\u094d"+
		"\7W\2\2\u094d\u0955\3\2\2\2\u094e\u094f\7\b\2\2\u094f\u0950\5\u012c\u0097"+
		"\2\u0950\u0951\7W\2\2\u0951\u0955\3\2\2\2\u0952\u0953\7\16\2\2\u0953\u0955"+
		"\7W\2\2\u0954\u094a\3\2\2\2\u0954\u094e\3\2\2\2\u0954\u0952\3\2\2\2\u0955"+
		"\u0181\3\2\2\2\u0956\u0963\5\u0186\u00c4\2\u0957\u0959\5\u0184\u00c3\2"+
		"\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095c"+
		"\7N\2\2\u095b\u095d\5\u0192\u00ca\2\u095c\u095b\3\2\2\2\u095c\u095d\3"+
		"\2\2\2\u095d\u095e\3\2\2\2\u095e\u0960\7N\2\2\u095f\u0961\5\u0188\u00c5"+
		"\2\u0960\u095f\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0963\3\2\2\2\u0962\u0956"+
		"\3\2\2\2\u0962\u0958\3\2\2\2\u0963\u0183\3\2\2\2\u0964\u0967\5\u016e\u00b8"+
		"\2\u0965\u0967\5\u018c\u00c7\2\u0966\u0964\3\2\2\2\u0966\u0965\3\2\2\2"+
		"\u0967\u0185\3\2\2\2\u0968\u096a\5\u00ecw\2\u0969\u0968\3\2\2\2\u096a"+
		"\u096d\3\2\2\2\u096b\u0969\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096e\3\2"+
		"\2\2\u096d\u096b\3\2\2\2\u096e\u096f\5\u0130\u0099\2\u096f\u0970\7<\2"+
		"\2\u0970\u0971\7W\2\2\u0971\u0972\5\u0192\u00ca\2\u0972\u0187\3\2\2\2"+
		"\u0973\u0974\5\u018c\u00c7\2\u0974\u0189\3\2\2\2\u0975\u0976\7H\2\2\u0976"+
		"\u0977\5\u0192\u00ca\2\u0977\u0978\7I\2\2\u0978\u018b\3\2\2\2\u0979\u097e"+
		"\5\u0192\u00ca\2\u097a\u097b\7O\2\2\u097b\u097d\5\u0192\u00ca\2\u097c"+
		"\u097a\3\2\2\2\u097d\u0980\3\2\2\2\u097e\u097c\3\2\2\2\u097e\u097f\3\2"+
		"\2\2\u097f\u018d\3\2\2\2\u0980\u097e\3\2\2\2\u0981\u0982\5\u0192\u00ca"+
		"\2\u0982\u018f\3\2\2\2\u0983\u0984\5\u0192\u00ca\2\u0984\u0191\3\2\2\2"+
		"\u0985\u0986\b\u00ca\1\2\u0986\u0993\5\u0194\u00cb\2\u0987\u0988\7\"\2"+
		"\2\u0988\u0993\5\u0196\u00cc\2\u0989\u098a\7H\2\2\u098a\u098b\5\u0130"+
		"\u0099\2\u098b\u098c\7I\2\2\u098c\u098d\5\u0192\u00ca\23\u098d\u0993\3"+
		"\2\2\2\u098e\u098f\t\r\2\2\u098f\u0993\5\u0192\u00ca\21\u0990\u0991\t"+
		"\16\2\2\u0991\u0993\5\u0192\u00ca";
	private static final String _serializedATNSegment1 =
		"\20\u0992\u0985\3\2\2\2\u0992\u0987\3\2\2\2\u0992\u0989\3\2\2\2\u0992"+
		"\u098e\3\2\2\2\u0992\u0990\3\2\2\2\u0993\u09e9\3\2\2\2\u0994\u0995\f\17"+
		"\2\2\u0995\u0996\t\b\2\2\u0996\u09e8\5\u0192\u00ca\20\u0997\u0998\f\16"+
		"\2\2\u0998\u0999\t\7\2\2\u0999\u09e8\5\u0192\u00ca\17\u099a\u09a2\f\r"+
		"\2\2\u099b\u099c\7S\2\2\u099c\u09a3\7S\2\2\u099d\u099e\7R\2\2\u099e\u099f"+
		"\7R\2\2\u099f\u09a3\7R\2\2\u09a0\u09a1\7R\2\2\u09a1\u09a3\7R\2\2\u09a2"+
		"\u099b\3\2\2\2\u09a2\u099d\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a3\u09a4\3\2"+
		"\2\2\u09a4\u09e8\5\u0192\u00ca\16\u09a5\u09a6\f\f\2\2\u09a6\u09a7\t\17"+
		"\2\2\u09a7\u09e8\5\u0192\u00ca\r\u09a8\u09a9\f\n\2\2\u09a9\u09aa\t\20"+
		"\2\2\u09aa\u09e8\5\u0192\u00ca\13\u09ab\u09ac\f\t\2\2\u09ac\u09ad\7d\2"+
		"\2\u09ad\u09e8\5\u0192\u00ca\n\u09ae\u09af\f\b\2\2\u09af\u09b0\7f\2\2"+
		"\u09b0\u09e8\5\u0192\u00ca\t\u09b1\u09b2\f\7\2\2\u09b2\u09b3\7e\2\2\u09b3"+
		"\u09e8\5\u0192\u00ca\b\u09b4\u09b5\f\6\2\2\u09b5\u09b6\7\\\2\2\u09b6\u09e8"+
		"\5\u0192\u00ca\7\u09b7\u09b8\f\5\2\2\u09b8\u09b9\7]\2\2\u09b9\u09e8\5"+
		"\u0192\u00ca\6\u09ba\u09bb\f\4\2\2\u09bb\u09bc\7V\2\2\u09bc\u09bd\5\u0192"+
		"\u00ca\2\u09bd\u09be\7W\2\2\u09be\u09bf\5\u0192\u00ca\5\u09bf\u09e8\3"+
		"\2\2\2\u09c0\u09c1\f\3\2\2\u09c1\u09c2\t\21\2\2\u09c2\u09e8\5\u0192\u00ca"+
		"\3\u09c3\u09c4\f\33\2\2\u09c4\u09c5\7P\2\2\u09c5\u09e8\7<\2\2\u09c6\u09c7"+
		"\f\32\2\2\u09c7\u09c8\7P\2\2\u09c8\u09e8\7.\2\2\u09c9\u09ca\f\31\2\2\u09ca"+
		"\u09cb\7P\2\2\u09cb\u09cd\7\"\2\2\u09cc\u09ce\5\u01a2\u00d2\2\u09cd\u09cc"+
		"\3\2\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09e8\5\u019a\u00ce"+
		"\2\u09d0\u09d1\f\30\2\2\u09d1\u09d2\7P\2\2\u09d2\u09d3\7+\2\2\u09d3\u09e8"+
		"\5\u01a8\u00d5\2\u09d4\u09d5\f\27\2\2\u09d5\u09d6\7P\2\2\u09d6\u09e8\5"+
		"\u01a0\u00d1\2\u09d7\u09d8\f\26\2\2\u09d8\u09d9\7L\2\2\u09d9\u09da\5\u0192"+
		"\u00ca\2\u09da\u09db\7M\2\2\u09db\u09e8\3\2\2\2\u09dc\u09dd\f\25\2\2\u09dd"+
		"\u09df\7H\2\2\u09de\u09e0\5\u018c\u00c7\2\u09df\u09de\3\2\2\2\u09df\u09e0"+
		"\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e8\7I\2\2\u09e2\u09e3\f\22\2\2\u09e3"+
		"\u09e8\t\22\2\2\u09e4\u09e5\f\13\2\2\u09e5\u09e6\7\34\2\2\u09e6\u09e8"+
		"\5\u0130\u0099\2\u09e7\u0994\3\2\2\2\u09e7\u0997\3\2\2\2\u09e7\u099a\3"+
		"\2\2\2\u09e7\u09a5\3\2\2\2\u09e7\u09a8\3\2\2\2\u09e7\u09ab\3\2\2\2\u09e7"+
		"\u09ae\3\2\2\2\u09e7\u09b1\3\2\2\2\u09e7\u09b4\3\2\2\2\u09e7\u09b7\3\2"+
		"\2\2\u09e7\u09ba\3\2\2\2\u09e7\u09c0\3\2\2\2\u09e7\u09c3\3\2\2\2\u09e7"+
		"\u09c6\3\2\2\2\u09e7\u09c9\3\2\2\2\u09e7\u09d0\3\2\2\2\u09e7\u09d4\3\2"+
		"\2\2\u09e7\u09d7\3\2\2\2\u09e7\u09dc\3\2\2\2\u09e7\u09e2\3\2\2\2\u09e7"+
		"\u09e4\3\2\2\2\u09e8\u09eb\3\2\2\2\u09e9\u09e7\3\2\2\2\u09e9\u09ea\3\2"+
		"\2\2\u09ea\u0193\3\2\2\2\u09eb\u09e9\3\2\2\2\u09ec\u09ed\7H\2\2\u09ed"+
		"\u09ee\5\u0192\u00ca\2\u09ee\u09ef\7I\2\2\u09ef\u0a02\3\2\2\2\u09f0\u0a02"+
		"\7.\2\2\u09f1\u0a02\7+\2\2\u09f2\u0a02\5\u014a\u00a6\2\u09f3\u0a02\7<"+
		"\2\2\u09f4\u09f5\5\u0130\u0099\2\u09f5\u09f6\7P\2\2\u09f6\u09f7\7\13\2"+
		"\2\u09f7\u0a02\3\2\2\2\u09f8\u09f9\7\63\2\2\u09f9\u09fa\7P\2\2\u09fa\u0a02"+
		"\7\13\2\2\u09fb\u09ff\5\u01a2\u00d2\2\u09fc\u0a00\5\u01aa\u00d6\2\u09fd"+
		"\u09fe\7.\2\2\u09fe\u0a00\5\u01ac\u00d7\2\u09ff\u09fc\3\2\2\2\u09ff\u09fd"+
		"\3\2\2\2\u0a00\u0a02\3\2\2\2\u0a01\u09ec\3\2\2\2\u0a01\u09f0\3\2\2\2\u0a01"+
		"\u09f1\3\2\2\2\u0a01\u09f2\3\2\2\2\u0a01\u09f3\3\2\2\2\u0a01\u09f4\3\2"+
		"\2\2\u0a01\u09f8\3\2\2\2\u0a01\u09fb\3\2\2\2\u0a02\u0195\3\2\2\2\u0a03"+
		"\u0a04\5\u01a2\u00d2\2\u0a04\u0a05\5\u0198\u00cd\2\u0a05\u0a06\5\u019e"+
		"\u00d0\2\u0a06\u0a0d\3\2\2\2\u0a07\u0a0a\5\u0198\u00cd\2\u0a08\u0a0b\5"+
		"\u019c\u00cf\2\u0a09\u0a0b\5\u019e\u00d0\2\u0a0a\u0a08\3\2\2\2\u0a0a\u0a09"+
		"\3\2\2\2\u0a0b\u0a0d\3\2\2\2\u0a0c\u0a03\3\2\2\2\u0a0c\u0a07\3\2\2\2\u0a0d"+
		"\u0197\3\2\2\2\u0a0e\u0a10\7<\2\2\u0a0f\u0a11\5\u01a4\u00d3\2\u0a10\u0a0f"+
		"\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a19\3\2\2\2\u0a12\u0a13\7P\2\2\u0a13"+
		"\u0a15\7<\2\2\u0a14\u0a16\5\u01a4\u00d3\2\u0a15\u0a14\3\2\2\2\u0a15\u0a16"+
		"\3\2\2\2\u0a16\u0a18\3\2\2\2\u0a17\u0a12\3\2\2\2\u0a18\u0a1b\3\2\2\2\u0a19"+
		"\u0a17\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1e\3\2\2\2\u0a1b\u0a19\3\2"+
		"\2\2\u0a1c\u0a1e\5\u0134\u009b\2\u0a1d\u0a0e\3\2\2\2\u0a1d\u0a1c\3\2\2"+
		"\2\u0a1e\u0199\3\2\2\2\u0a1f\u0a21\7<\2\2\u0a20\u0a22\5\u01a6\u00d4\2"+
		"\u0a21\u0a20\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a24"+
		"\5\u019e\u00d0\2\u0a24\u019b\3\2\2\2\u0a25\u0a41\7L\2\2\u0a26\u0a2b\7"+
		"M\2\2\u0a27\u0a28\7L\2\2\u0a28\u0a2a\7M\2\2\u0a29\u0a27\3\2\2\2\u0a2a"+
		"\u0a2d\3\2\2\2\u0a2b\u0a29\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a2e\3\2"+
		"\2\2\u0a2d\u0a2b\3\2\2\2\u0a2e\u0a42\5\u0128\u0095\2\u0a2f\u0a30\5\u0192"+
		"\u00ca\2\u0a30\u0a37\7M\2\2\u0a31\u0a32\7L\2\2\u0a32\u0a33\5\u0192\u00ca"+
		"\2\u0a33\u0a34\7M\2\2\u0a34\u0a36\3\2\2\2\u0a35\u0a31\3\2\2\2\u0a36\u0a39"+
		"\3\2\2\2\u0a37\u0a35\3\2\2\2\u0a37\u0a38\3\2\2\2\u0a38\u0a3e\3\2\2\2\u0a39"+
		"\u0a37\3\2\2\2\u0a3a\u0a3b\7L\2\2\u0a3b\u0a3d\7M\2\2\u0a3c\u0a3a\3\2\2"+
		"\2\u0a3d\u0a40\3\2\2\2\u0a3e\u0a3c\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u0a42"+
		"\3\2\2\2\u0a40\u0a3e\3\2\2\2\u0a41\u0a26\3\2\2\2\u0a41\u0a2f\3\2\2\2\u0a42"+
		"\u019d\3\2\2\2\u0a43\u0a45\5\u01ac\u00d7\2\u0a44\u0a46\5\u0102\u0082\2"+
		"\u0a45\u0a44\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u019f\3\2\2\2\u0a47\u0a48"+
		"\5\u01a2\u00d2\2\u0a48\u0a49\5\u01aa\u00d6\2\u0a49\u01a1\3\2\2\2\u0a4a"+
		"\u0a4b\7S\2\2\u0a4b\u0a4c\5\u0100\u0081\2\u0a4c\u0a4d\7R\2\2\u0a4d\u01a3"+
		"\3\2\2\2\u0a4e\u0a4f\7S\2\2\u0a4f\u0a52\7R\2\2\u0a50\u0a52\5\u0136\u009c"+
		"\2\u0a51\u0a4e\3\2\2\2\u0a51\u0a50\3\2\2\2\u0a52\u01a5\3\2\2\2\u0a53\u0a54"+
		"\7S\2\2\u0a54\u0a57\7R\2\2\u0a55\u0a57\5\u01a2\u00d2\2\u0a56\u0a53\3\2"+
		"\2\2\u0a56\u0a55\3\2\2\2\u0a57\u01a7\3\2\2\2\u0a58\u0a5f\5\u01ac\u00d7"+
		"\2\u0a59\u0a5a\7P\2\2\u0a5a\u0a5c\7<\2\2\u0a5b\u0a5d\5\u01ac\u00d7\2\u0a5c"+
		"\u0a5b\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d\u0a5f\3\2\2\2\u0a5e\u0a58\3\2"+
		"\2\2\u0a5e\u0a59\3\2\2\2\u0a5f\u01a9\3\2\2\2\u0a60\u0a61\7+\2\2\u0a61"+
		"\u0a65\5\u01a8\u00d5\2\u0a62\u0a63\7<\2\2\u0a63\u0a65\5\u01ac\u00d7\2"+
		"\u0a64\u0a60\3\2\2\2\u0a64\u0a62\3\2\2\2\u0a65\u01ab\3\2\2\2\u0a66\u0a68"+
		"\7H\2\2\u0a67\u0a69\5\u018c\u00c7\2\u0a68\u0a67\3\2\2\2\u0a68\u0a69\3"+
		"\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a6b\7I\2\2\u0a6b\u01ad\3\2\2\2\u0134"+
		"\u01af\u01b4\u01ba\u01c2\u01cb\u01d0\u01d7\u01de\u01e5\u01ec\u01f1\u01f5"+
		"\u01f9\u01fd\u0202\u0206\u020a\u0214\u021c\u0223\u022a\u022e\u0231\u0234"+
		"\u023d\u0243\u0248\u024b\u0251\u0257\u025b\u0264\u026b\u0274\u027b\u0281"+
		"\u0285\u0292\u0296\u029e\u02a3\u02a7\u02aa\u02b3\u02c0\u02ca\u02cf\u02d4"+
		"\u02dd\u02e5\u02f0\u02f8\u02fd\u030d\u0318\u031d\u0325\u0329\u032b\u033a"+
		"\u0342\u0345\u0349\u034e\u0352\u035d\u0366\u0368\u036f\u0374\u037d\u0382"+
		"\u0385\u038a\u0393\u03a3\u03ad\u03b0\u03b9\u03c3\u03cb\u03ce\u03d1\u03de"+
		"\u03e7\u03f4\u03f8\u03fc\u0400\u0402\u0404\u040a\u0411\u041b\u0422\u0429"+
		"\u042e\u0437\u043f\u0448\u045f\u0462\u0465\u046d\u0471\u0479\u047f\u048a"+
		"\u0493\u0498\u04a4\u04ad\u04b5\u04bd\u04c4\u04d1\u04da\u04e3\u04e9\u04f4"+
		"\u04f9\u0505\u0509\u050d\u0511\u0513\u0517\u051c\u052f\u0545\u0555\u057d"+
		"\u0593\u0596\u059c\u059e\u05b4\u05b6\u05bf\u05c1\u05c5\u05ca\u05ce\u05d2"+
		"\u05d6\u05e0\u05ec\u05f3\u05f6\u05fa\u0606\u060b\u0611\u0613\u061a\u061e"+
		"\u0630\u0635\u063a\u0640\u0648\u0651\u0656\u065d\u0664\u066b\u0672\u0677"+
		"\u067b\u067f\u0683\u0688\u068c\u0690\u069a\u06a2\u06a9\u06b0\u06b4\u06b7"+
		"\u06ba\u06c3\u06c9\u06ce\u06d1\u06d7\u06dd\u06e1\u06ea\u06f1\u06fa\u0701"+
		"\u0707\u070b\u0716\u071a\u0722\u0727\u072b\u0734\u0742\u0747\u0750\u0758"+
		"\u0762\u076a\u0772\u0777\u0783\u0789\u0790\u0795\u079d\u07a1\u07a3\u07b2"+
		"\u07ba\u07bd\u07c1\u07c6\u07ca\u07d5\u07de\u07e0\u07e7\u07ec\u07f5\u07fa"+
		"\u07fd\u0802\u080b\u081b\u0825\u0828\u0831\u083b\u0843\u0846\u0849\u0856"+
		"\u085e\u0863\u086b\u086f\u0873\u0877\u0879\u087d\u0883\u088e\u0896\u089e"+
		"\u08a9\u08b2\u08c9\u08cc\u08cf\u08d7\u08db\u08e3\u08e9\u08f4\u08fd\u0902"+
		"\u090c\u0913\u0920\u0929\u0932\u0938\u0943\u0948\u0954\u0958\u095c\u0960"+
		"\u0962\u0966\u096b\u097e\u0992\u09a2\u09cd\u09df\u09e7\u09e9\u09ff\u0a01"+
		"\u0a0a\u0a0c\u0a10\u0a15\u0a19\u0a1d\u0a21\u0a2b\u0a37\u0a3e\u0a41\u0a45"+
		"\u0a51\u0a56\u0a5c\u0a5e\u0a64\u0a68";
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