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
		WHILE=51, BooleanLiteral=52, NullLiteral=53, CONJUNCTIVE_BOOLEAN_EQUAL=54, 
		CONJUNCTIVE_IMPLIES=55, CONJUNCTIVE_CONSEQUENCE=56, CONJUNCTIVE_NOT_EQUAL=57, 
		UndecoratedIdentifier=58, Identifier=59, PreValueName=60, MidValueName=61, 
		PostValueName=62, WS=63, COMMENT=64, LINE_COMMENT=65, IntegerLiteral=66, 
		FloatingPointLiteral=67, CharacterLiteral=68, StringLiteral=69, LPAREN=70, 
		RPAREN=71, LBRACE=72, RBRACE=73, LBRACK=74, RBRACK=75, SEMI=76, COMMA=77, 
		DOT=78, ASSIGN=79, GT=80, LT=81, BANG=82, TILDE=83, QUESTION=84, COLON=85, 
		EQUAL=86, LE=87, GE=88, NOTEQUAL=89, AND=90, OR=91, INC=92, DEC=93, ADD=94, 
		SUB=95, MUL=96, DIV=97, BITAND=98, BITOR=99, CARET=100, MOD=101, ADD_ASSIGN=102, 
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
		RULE_t_assignable = 69, RULE_t_catchClause = 70, RULE_t_catchType = 71, 
		RULE_t_finallyBlock = 72, RULE_t_resourceSpecification = 73, RULE_t_resources = 74, 
		RULE_t_resource = 75, RULE_t_switchBlockStatementGroup = 76, RULE_t_switchLabel = 77, 
		RULE_t_forControl = 78, RULE_t_forInit = 79, RULE_t_enhancedForControl = 80, 
		RULE_t_forUpdate = 81, RULE_t_parExpression = 82, RULE_t_expressionList = 83, 
		RULE_t_constantExpression = 84, RULE_t_expression = 85, RULE_t_expressionDetail = 86, 
		RULE_t_primary = 87, RULE_t_creator = 88, RULE_t_createdName = 89, RULE_t_innerCreator = 90, 
		RULE_t_arrayCreatorRest = 91, RULE_t_classCreatorRest = 92, RULE_t_explicitGenericInvocation = 93, 
		RULE_t_nonWildcardTypeArguments = 94, RULE_t_typeArgumentsOrDiamond = 95, 
		RULE_t_nonWildcardTypeArgumentsOrDiamond = 96, RULE_t_superSuffix = 97, 
		RULE_t_explicitGenericInvocationSuffix = 98, RULE_t_arguments = 99, RULE_t_means = 100, 
		RULE_t_idDeclaration = 101, RULE_t_identifier = 102, RULE_t_identifierDetail = 103, 
		RULE_t_valueName = 104, RULE_compilationUnit = 105, RULE_packageDeclaration = 106, 
		RULE_importDeclaration = 107, RULE_typeDeclaration = 108, RULE_modifier = 109, 
		RULE_classOrInterfaceModifier = 110, RULE_variableModifier = 111, RULE_classDeclaration = 112, 
		RULE_typeParameters = 113, RULE_typeParameter = 114, RULE_typeBound = 115, 
		RULE_enumDeclaration = 116, RULE_enumConstants = 117, RULE_enumConstant = 118, 
		RULE_enumBodyDeclarations = 119, RULE_interfaceDeclaration = 120, RULE_typeList = 121, 
		RULE_classBody = 122, RULE_interfaceBody = 123, RULE_classBodyDeclaration = 124, 
		RULE_memberDeclaration = 125, RULE_methodDeclaration = 126, RULE_genericMethodDeclaration = 127, 
		RULE_constructorDeclaration = 128, RULE_genericConstructorDeclaration = 129, 
		RULE_fieldDeclaration = 130, RULE_interfaceBodyDeclaration = 131, RULE_interfaceMemberDeclaration = 132, 
		RULE_constDeclaration = 133, RULE_constantDeclarator = 134, RULE_interfaceMethodDeclaration = 135, 
		RULE_genericInterfaceMethodDeclaration = 136, RULE_variableDeclarators = 137, 
		RULE_variableDeclarator = 138, RULE_variableDeclaratorId = 139, RULE_variableInitializer = 140, 
		RULE_arrayInitializer = 141, RULE_packageOrTypeName = 142, RULE_enumConstantName = 143, 
		RULE_typeName = 144, RULE_type = 145, RULE_classOrInterfaceType = 146, 
		RULE_primitiveType = 147, RULE_typeArguments = 148, RULE_typeArgument = 149, 
		RULE_qualifiedNameList = 150, RULE_formalParameters = 151, RULE_formalParameterList = 152, 
		RULE_formalParameter = 153, RULE_lastFormalParameter = 154, RULE_methodBody = 155, 
		RULE_constructorBody = 156, RULE_qualifiedName = 157, RULE_literal = 158, 
		RULE_annotation = 159, RULE_annotationName = 160, RULE_elementValuePairs = 161, 
		RULE_elementValuePair = 162, RULE_elementValue = 163, RULE_elementValueArrayInitializer = 164, 
		RULE_annotationTypeDeclaration = 165, RULE_annotationTypeBody = 166, RULE_annotationTypeElementDeclaration = 167, 
		RULE_annotationTypeElementRest = 168, RULE_annotationMethodOrConstantRest = 169, 
		RULE_annotationMethodRest = 170, RULE_annotationConstantRest = 171, RULE_defaultValue = 172, 
		RULE_block = 173, RULE_blockStatement = 174, RULE_localVariableDeclarationStatement = 175, 
		RULE_localVariableDeclaration = 176, RULE_statement = 177, RULE_catchClause = 178, 
		RULE_catchType = 179, RULE_finallyBlock = 180, RULE_resourceSpecification = 181, 
		RULE_resources = 182, RULE_resource = 183, RULE_switchBlockStatementGroup = 184, 
		RULE_switchLabel = 185, RULE_forControl = 186, RULE_forInit = 187, RULE_enhancedForControl = 188, 
		RULE_forUpdate = 189, RULE_parExpression = 190, RULE_expressionList = 191, 
		RULE_statementExpression = 192, RULE_constantExpression = 193, RULE_expression = 194, 
		RULE_primary = 195, RULE_creator = 196, RULE_createdName = 197, RULE_innerCreator = 198, 
		RULE_arrayCreatorRest = 199, RULE_classCreatorRest = 200, RULE_explicitGenericInvocation = 201, 
		RULE_nonWildcardTypeArguments = 202, RULE_typeArgumentsOrDiamond = 203, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 204, RULE_superSuffix = 205, 
		RULE_explicitGenericInvocationSuffix = 206, RULE_arguments = 207;
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
		null, "'null'", "'==='", "'==>'", "'<=='", "'=!='", null, null, null, 
		null, null, null, null, null, null, null, null, null, "'('", "')'", "'{'", 
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
		"NullLiteral", "CONJUNCTIVE_BOOLEAN_EQUAL", "CONJUNCTIVE_IMPLIES", "CONJUNCTIVE_CONSEQUENCE", 
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
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(416);
				t_packageDeclaration();
				}
				break;
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(419);
				t_importDeclaration();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << DEFAULT) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(425);
				t_typeDeclaration();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
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
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(433);
				t_annotation();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			match(PACKAGE);
			setState(440);
			t_qualifiedName();
			setState(441);
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
			setState(443);
			match(IMPORT);
			setState(445);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(444);
				match(STATIC);
				}
			}

			setState(447);
			t_qualifiedName();
			setState(450);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(448);
				match(DOT);
				setState(449);
				match(MUL);
				}
			}

			setState(452);
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
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(454);
					t_classOrInterfaceModifier();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
				t_classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(461);
					t_classOrInterfaceModifier();
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
				t_enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << TRANSIENT))) != 0) || _la==AT) {
					{
					{
					setState(468);
					t_classOrInterfaceModifier();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
				t_interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(475);
						t_classOrInterfaceModifier();
						}
						} 
					}
					setState(480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(481);
				t_annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
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
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				t_classOrInterfaceModifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
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
			setState(491);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
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
				setState(490);
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
			setState(495);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
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
			setState(497);
			match(CLASS);
			setState(498);
			match(UndecoratedIdentifier);
			setState(500);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(499);
				t_typeParameters();
				}
			}

			setState(504);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(502);
				match(EXTENDS);
				setState(503);
				t_type();
				}
			}

			setState(508);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(506);
				match(IMPLEMENTS);
				setState(507);
				t_typeList();
				}
			}

			setState(510);
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
			setState(512);
			match(LT);
			setState(513);
			t_typeParameter();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(514);
				match(COMMA);
				setState(515);
				t_typeParameter();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
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
			setState(523);
			match(UndecoratedIdentifier);
			setState(526);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(524);
				match(EXTENDS);
				setState(525);
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
			setState(528);
			t_type();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(529);
				match(BITAND);
				setState(530);
				t_type();
				}
				}
				setState(535);
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
			setState(536);
			match(ENUM);
			setState(537);
			match(UndecoratedIdentifier);
			setState(540);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(538);
				match(IMPLEMENTS);
				setState(539);
				t_typeList();
				}
			}

			setState(542);
			match(LBRACE);
			setState(544);
			_la = _input.LA(1);
			if (_la==UndecoratedIdentifier || _la==AT) {
				{
				setState(543);
				t_enumConstants();
				}
			}

			setState(547);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(546);
				match(COMMA);
				}
			}

			setState(550);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(549);
				t_enumBodyDeclarations();
				}
			}

			setState(552);
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
			setState(554);
			t_enumConstant();
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					match(COMMA);
					setState(556);
					t_enumConstant();
					}
					} 
				}
				setState(561);
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
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(562);
				t_annotation();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			match(UndecoratedIdentifier);
			setState(570);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(569);
				t_arguments();
				}
			}

			setState(573);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(572);
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
			setState(575);
			match(SEMI);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << UndecoratedIdentifier))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(576);
				t_classBodyDeclaration();
				}
				}
				setState(581);
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
			setState(582);
			match(INTERFACE);
			setState(583);
			match(UndecoratedIdentifier);
			setState(585);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(584);
				t_typeParameters();
				}
			}

			setState(589);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(587);
				match(EXTENDS);
				setState(588);
				t_typeList();
				}
			}

			setState(591);
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
			setState(593);
			t_type();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(594);
				match(COMMA);
				setState(595);
				t_type();
				}
				}
				setState(600);
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
			setState(601);
			match(LBRACE);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << UndecoratedIdentifier))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(602);
				t_classBodyDeclaration();
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
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
			setState(610);
			match(LBRACE);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << UndecoratedIdentifier))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (SEMI - 76)) | (1L << (LT - 76)) | (1L << (AT - 76)))) != 0)) {
				{
				{
				setState(611);
				t_interfaceBodyDeclaration();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
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
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(620);
					match(STATIC);
					}
				}

				setState(623);
				t_initializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						t_modifier();
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(630);
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
			setState(633);
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
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				t_methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				t_genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				t_fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				t_constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(639);
				t_genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				t_interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(641);
				t_annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(642);
				t_classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(643);
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
			setState(648);
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
				setState(646);
				t_type();
				}
				break;
			case VOID:
				{
				setState(647);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(650);
			match(UndecoratedIdentifier);
			setState(651);
			t_formalParameters();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(652);
				match(LBRACK);
				setState(653);
				match(RBRACK);
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(659);
				match(THROWS);
				setState(660);
				t_qualifiedNameList();
				}
			}

			setState(665);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(663);
				t_methodBody();
				}
				break;
			case SEMI:
				{
				setState(664);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(668);
			_la = _input.LA(1);
			if (_la==MEANS) {
				{
				setState(667);
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
			setState(670);
			t_typeParameters();
			setState(671);
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
			setState(673);
			match(UndecoratedIdentifier);
			setState(674);
			t_formalParameters();
			setState(677);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(675);
				match(THROWS);
				setState(676);
				t_qualifiedNameList();
				}
			}

			setState(679);
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
			setState(681);
			t_typeParameters();
			setState(682);
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
			setState(684);
			((T_fieldDeclarationContext)_localctx).ty = t_type();
			setState(685);
			t_fieldDeclarator((((T_fieldDeclarationContext)_localctx).ty!=null?_input.getText(((T_fieldDeclarationContext)_localctx).ty.start,((T_fieldDeclarationContext)_localctx).ty.stop):null));
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(686);
				match(COMMA);
				setState(687);
				t_fieldDeclarator((((T_fieldDeclarationContext)_localctx).ty!=null?_input.getText(((T_fieldDeclarationContext)_localctx).ty.start,((T_fieldDeclarationContext)_localctx).ty.stop):null));
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(693);
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
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new InitializedFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				t_idDeclaration(_localctx.idType);
				setState(696);
				((InitializedFieldContext)_localctx).op = match(ASSIGN);
				setState(697);
				t_variableInitializer();
				}
				break;
			case 2:
				_localctx = new UninitializedFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
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
			setState(710);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
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
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(703);
						t_modifier();
						}
						} 
					}
					setState(708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(709);
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
			setState(712);
			t_annotationVariableDeclaratorId();
			setState(713);
			match(ASSIGN);
			setState(714);
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
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new InitializedVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				t_initializedVariableDeclaratorId(_localctx.idType);
				setState(717);
				((InitializedVariableContext)_localctx).op = match(ASSIGN);
				setState(718);
				t_variableInitializer();
				}
				break;
			case 2:
				_localctx = new UninitializedVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
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
			setState(723);
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
			setState(725);
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
			setState(727);
			t_identifier();
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(728);
				match(LBRACK);
				setState(729);
				match(RBRACK);
				}
				}
				setState(734);
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
			setState(737);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
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
				setState(736);
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
			setState(739);
			match(LBRACE);
			setState(751);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
				{
				setState(740);
				t_variableInitializer();
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(741);
						match(COMMA);
						setState(742);
						t_variableInitializer();
						}
						} 
					}
					setState(747);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(749);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(748);
					match(COMMA);
					}
				}

				}
			}

			setState(753);
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
			setState(755);
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
			setState(757);
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
			setState(777);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				t_classOrInterfaceType();
				setState(766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(762);
						match(LBRACK);
						setState(763);
						match(RBRACK);
						}
						} 
					}
					setState(768);
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
				setState(769);
				t_primitiveType();
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(770);
						match(LBRACK);
						setState(771);
						match(RBRACK);
						}
						} 
					}
					setState(776);
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
			setState(779);
			match(UndecoratedIdentifier);
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(780);
				t_typeArguments();
				}
				break;
			}
			setState(790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(783);
					match(DOT);
					setState(784);
					match(UndecoratedIdentifier);
					setState(786);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(785);
						t_typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(792);
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
			setState(793);
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
			setState(795);
			match(LT);
			setState(796);
			t_typeArgument();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(797);
				match(COMMA);
				setState(798);
				t_typeArgument();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
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
			setState(812);
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
				setState(806);
				t_type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				match(QUESTION);
				setState(810);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(809);
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
			setState(814);
			t_qualifiedName();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(815);
				match(COMMA);
				setState(816);
				t_qualifiedName();
				}
				}
				setState(821);
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
			setState(822);
			match(LPAREN);
			setState(824);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << UndecoratedIdentifier))) != 0) || _la==AT) {
				{
				setState(823);
				t_formalParameterList();
				}
			}

			setState(826);
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
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				t_formalParameter();
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(829);
						match(COMMA);
						setState(830);
						t_formalParameter();
						}
						} 
					}
					setState(835);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(838);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(836);
					match(COMMA);
					setState(837);
					t_lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
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
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(843);
				t_variableModifier();
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(849);
			((T_formalParameterContext)_localctx).ty = t_type();
			setState(850);
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
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(852);
				t_variableModifier();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			((T_lastFormalParameterContext)_localctx).ty = t_type();
			setState(859);
			match(ELLIPSIS);
			setState(860);
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
			setState(862);
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
			setState(864);
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
			setState(866);
			t_identifier();
			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(867);
					match(DOT);
					setState(868);
					t_identifier();
					}
					} 
				}
				setState(873);
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
			setState(874);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BooleanLiteral - 52)) | (1L << (NullLiteral - 52)) | (1L << (IntegerLiteral - 52)) | (1L << (FloatingPointLiteral - 52)) | (1L << (CharacterLiteral - 52)) | (1L << (StringLiteral - 52)))) != 0)) ) {
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
			setState(876);
			match(AT);
			setState(877);
			t_annotationName();
			setState(884);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(878);
				match(LPAREN);
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(879);
					t_elementValuePairs();
					}
					break;
				case 2:
					{
					setState(880);
					t_elementValue();
					}
					break;
				}
				setState(883);
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
			setState(886);
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
			setState(888);
			t_elementValuePair();
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(889);
				match(COMMA);
				setState(890);
				t_elementValuePair();
				}
				}
				setState(895);
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
			setState(896);
			match(UndecoratedIdentifier);
			setState(897);
			match(ASSIGN);
			setState(898);
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
			setState(903);
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
				setState(900);
				t_expression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				t_annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(902);
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
			setState(905);
			match(LBRACE);
			setState(914);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(906);
				t_elementValue();
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(907);
						match(COMMA);
						setState(908);
						t_elementValue();
						}
						} 
					}
					setState(913);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				}
			}

			setState(917);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(916);
				match(COMMA);
				}
			}

			setState(919);
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
			setState(921);
			match(AT);
			setState(922);
			match(INTERFACE);
			setState(923);
			match(UndecoratedIdentifier);
			setState(924);
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
			setState(926);
			match(LBRACE);
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << UndecoratedIdentifier))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(927);
				t_annotationTypeElementDeclaration();
				}
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(933);
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
			setState(968);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
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
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(936);
						t_modifier();
						}
						} 
					}
					setState(941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(942);
					t_type();
					setState(943);
					t_annotationMethodRest();
					setState(944);
					match(SEMI);
					}
					break;
				case 2:
					{
					setState(946);
					t_type();
					setState(947);
					t_annotationConstantRest();
					setState(948);
					match(SEMI);
					}
					break;
				case 3:
					{
					setState(950);
					t_classDeclaration();
					setState(952);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(951);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 4:
					{
					setState(954);
					t_interfaceDeclaration();
					setState(956);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(955);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 5:
					{
					setState(958);
					t_enumDeclaration();
					setState(960);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(959);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 6:
					{
					setState(962);
					t_annotationTypeDeclaration();
					setState(964);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(963);
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
			setState(970);
			match(UndecoratedIdentifier);
			setState(971);
			match(LPAREN);
			setState(972);
			match(RPAREN);
			setState(974);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(973);
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
			setState(976);
			t_annotationVariableDeclarator();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(977);
				match(COMMA);
				setState(978);
				t_annotationVariableDeclarator();
				}
				}
				setState(983);
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
			setState(984);
			match(DEFAULT);
			setState(985);
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
			setState(987);
			((T_blockContext)_localctx).openBrace = match(LBRACE);
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << MEANS) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(988);
				t_blockStatement();
				}
				}
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(994);
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
		enterRule(_localctx, 132, RULE_t_blockStatement);
		try {
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				t_localVariableDeclaration();
				setState(997);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				t_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
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
		enterRule(_localctx, 134, RULE_t_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1003);
				t_variableModifier();
				}
				}
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1009);
			((T_localVariableDeclarationContext)_localctx).ty = t_type();
			setState(1010);
			t_variableDeclarator((((T_localVariableDeclarationContext)_localctx).ty!=null?_input.getText(((T_localVariableDeclarationContext)_localctx).ty.start,((T_localVariableDeclarationContext)_localctx).ty.stop):null));
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1011);
				match(COMMA);
				setState(1012);
				t_variableDeclarator((((T_localVariableDeclarationContext)_localctx).ty!=null?_input.getText(((T_localVariableDeclarationContext)_localctx).ty.start,((T_localVariableDeclarationContext)_localctx).ty.stop):null));
				}
				}
				setState(1017);
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
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				t_block();
				}
				break;
			case 2:
				_localctx = new AssertStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(ASSERT);
				setState(1020);
				t_expression();
				setState(1023);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1021);
					match(COLON);
					setState(1022);
					t_expression();
					}
				}

				setState(1025);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1027);
				match(IF);
				setState(1028);
				t_parExpression();
				setState(1029);
				t_statement();
				setState(1032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(1030);
					match(ELSE);
					setState(1031);
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
				setState(1034);
				match(FOR);
				setState(1035);
				match(LPAREN);
				setState(1036);
				t_forControl();
				setState(1037);
				match(RPAREN);
				setState(1038);
				t_statement();
				}
				break;
			case 5:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1040);
				match(WHILE);
				setState(1041);
				t_parExpression();
				setState(1042);
				t_statement();
				}
				break;
			case 6:
				_localctx = new DoStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1044);
				match(DO);
				setState(1045);
				t_statement();
				setState(1046);
				match(WHILE);
				setState(1047);
				t_parExpression();
				setState(1048);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new TryStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1050);
				match(TRY);
				setState(1051);
				t_block();
				setState(1061);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1053); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1052);
						t_catchClause();
						}
						}
						setState(1055); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1058);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1057);
						t_finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1060);
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
				setState(1063);
				match(TRY);
				setState(1064);
				t_resourceSpecification();
				setState(1065);
				t_block();
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1066);
					t_catchClause();
					}
					}
					setState(1071);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1073);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1072);
					t_finallyBlock();
					}
				}

				}
				break;
			case 9:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1075);
				match(SWITCH);
				setState(1076);
				t_parExpression();
				setState(1077);
				match(LBRACE);
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1078);
						t_switchBlockStatementGroup();
						}
						} 
					}
					setState(1083);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1084);
					t_switchLabel();
					}
					}
					setState(1089);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1090);
				match(RBRACE);
				}
				break;
			case 10:
				_localctx = new SyncStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1092);
				match(SYNCHRONIZED);
				setState(1093);
				t_parExpression();
				setState(1094);
				t_block();
				}
				break;
			case 11:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1096);
				match(RETURN);
				setState(1098);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(1097);
					t_expression();
					}
				}

				setState(1100);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new ThrowStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1101);
				match(THROW);
				setState(1102);
				t_expression();
				setState(1103);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1105);
				match(BREAK);
				setState(1107);
				_la = _input.LA(1);
				if (_la==UndecoratedIdentifier) {
					{
					setState(1106);
					match(UndecoratedIdentifier);
					}
				}

				setState(1109);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1110);
				match(CONTINUE);
				setState(1112);
				_la = _input.LA(1);
				if (_la==UndecoratedIdentifier) {
					{
					setState(1111);
					match(UndecoratedIdentifier);
					}
				}

				setState(1114);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1115);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1116);
				t_assignable();
				setState(1117);
				((AssignStmtContext)_localctx).op = match(ASSIGN);
				setState(1118);
				t_expression();
				setState(1119);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new CallStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1121);
				t_expression();
				setState(1122);
				match(LPAREN);
				setState(1124);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(1123);
					t_expressionList();
					}
				}

				setState(1126);
				match(RPAREN);
				setState(1127);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new CreationStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1129);
				t_expression();
				setState(1130);
				match(DOT);
				setState(1131);
				match(NEW);
				setState(1133);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1132);
					t_nonWildcardTypeArguments();
					}
				}

				setState(1135);
				t_innerCreator();
				}
				break;
			case 19:
				_localctx = new LabelStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1137);
				match(UndecoratedIdentifier);
				setState(1138);
				match(COLON);
				setState(1139);
				t_statement();
				}
				break;
			case 20:
				_localctx = new MeansStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1140);
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
		enterRule(_localctx, 138, RULE_t_assignable);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				t_expression();
				setState(1144);
				match(LBRACK);
				setState(1145);
				t_expression();
				setState(1146);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
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
		enterRule(_localctx, 140, RULE_t_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(CATCH);
			setState(1152);
			match(LPAREN);
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1153);
				t_variableModifier();
				}
				}
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1159);
			t_catchType();
			setState(1160);
			t_identifier();
			setState(1161);
			match(RPAREN);
			setState(1162);
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
		enterRule(_localctx, 142, RULE_t_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			t_qualifiedName();
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1165);
				match(BITOR);
				setState(1166);
				t_qualifiedName();
				}
				}
				setState(1171);
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
		enterRule(_localctx, 144, RULE_t_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(FINALLY);
			setState(1173);
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
		enterRule(_localctx, 146, RULE_t_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(LPAREN);
			setState(1176);
			t_resources();
			setState(1178);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1177);
				match(SEMI);
				}
			}

			setState(1180);
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
		enterRule(_localctx, 148, RULE_t_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			t_resource();
			setState(1187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1183);
					match(SEMI);
					setState(1184);
					t_resource();
					}
					} 
				}
				setState(1189);
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
		enterRule(_localctx, 150, RULE_t_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1190);
				t_variableModifier();
				}
				}
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1196);
			((T_resourceContext)_localctx).ty = t_classOrInterfaceType();
			setState(1197);
			t_initializedVariableDeclaratorId((((T_resourceContext)_localctx).ty!=null?_input.getText(((T_resourceContext)_localctx).ty.start,((T_resourceContext)_localctx).ty.stop):null));
			setState(1198);
			match(ASSIGN);
			setState(1199);
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
		enterRule(_localctx, 152, RULE_t_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1201);
					t_switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1206);
					t_blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1209); 
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
		enterRule(_localctx, 154, RULE_t_switchLabel);
		try {
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1211);
				match(CASE);
				setState(1212);
				t_constantExpression();
				setState(1213);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				match(CASE);
				setState(1216);
				t_enumConstantName();
				setState(1217);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1219);
				match(DEFAULT);
				setState(1220);
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
		enterRule(_localctx, 156, RULE_t_forControl);
		int _la;
		try {
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				t_enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(1224);
					t_forInit();
					}
				}

				setState(1227);
				match(SEMI);
				setState(1229);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(1228);
					t_expression();
					}
				}

				setState(1231);
				match(SEMI);
				setState(1233);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(1232);
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
		enterRule(_localctx, 158, RULE_t_forInit);
		try {
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				t_localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238);
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
		enterRule(_localctx, 160, RULE_t_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1241);
				t_variableModifier();
				}
				}
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1247);
			t_type();
			setState(1248);
			t_identifier();
			setState(1249);
			match(COLON);
			setState(1250);
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
		enterRule(_localctx, 162, RULE_t_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
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
		enterRule(_localctx, 164, RULE_t_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(LPAREN);
			setState(1255);
			t_expression();
			setState(1256);
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
		enterRule(_localctx, 166, RULE_t_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			t_expression();
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1259);
				match(COMMA);
				setState(1260);
				t_expression();
				}
				}
				setState(1265);
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
		enterRule(_localctx, 168, RULE_t_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
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
		enterRule(_localctx, 170, RULE_t_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
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
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_t_expressionDetail, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1271);
				t_primary();
				}
				break;
			case 2:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1272);
				match(NEW);
				setState(1273);
				t_creator();
				}
				break;
			case 3:
				{
				_localctx = new TypeCastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1274);
				match(LPAREN);
				setState(1275);
				t_type();
				setState(1276);
				match(RPAREN);
				setState(1277);
				t_expressionDetail(16);
				}
				break;
			case 4:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1279);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1280);
				t_expressionDetail(15);
				}
				break;
			case 5:
				{
				_localctx = new BitComplementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1281);
				match(TILDE);
				setState(1282);
				t_expressionDetail(14);
				}
				break;
			case 6:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1283);
				match(BANG);
				setState(1284);
				t_expressionDetail(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1287);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1288);
						_la = _input.LA(1);
						if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (MUL - 96)) | (1L << (DIV - 96)) | (1L << (MOD - 96)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1289);
						t_expressionDetail(13);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1290);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1291);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1292);
						t_expressionDetail(12);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1293);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1301);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(1294);
							match(LT);
							setState(1295);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1296);
							match(GT);
							setState(1297);
							match(GT);
							setState(1298);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1299);
							match(GT);
							setState(1300);
							match(GT);
							}
							break;
						}
						setState(1303);
						t_expressionDetail(11);
						}
						break;
					case 4:
						{
						_localctx = new ConjRelationExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1304);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1305);
						((ConjRelationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ASSIGN - 79)) | (1L << (GT - 79)) | (1L << (LT - 79)) | (1L << (LE - 79)) | (1L << (GE - 79)) | (1L << (NOTEQUAL - 79)))) != 0)) ) {
							((ConjRelationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1306);
						t_expressionDetail(10);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1307);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1308);
						match(BITAND);
						setState(1309);
						t_expressionDetail(8);
						}
						break;
					case 6:
						{
						_localctx = new ExclusiveOrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1310);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1311);
						match(CARET);
						setState(1312);
						t_expressionDetail(7);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1313);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1314);
						match(BITOR);
						setState(1315);
						t_expressionDetail(6);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalAndExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1316);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1317);
						match(AND);
						setState(1318);
						t_expressionDetail(5);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalOrExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1320);
						match(OR);
						setState(1321);
						t_expressionDetail(4);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1323);
						match(QUESTION);
						setState(1324);
						t_expressionDetail(0);
						setState(1325);
						match(COLON);
						setState(1326);
						t_expressionDetail(3);
						}
						break;
					case 11:
						{
						_localctx = new ConjunctiveBoolExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1328);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1329);
						((ConjunctiveBoolExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONJUNCTIVE_BOOLEAN_EQUAL) | (1L << CONJUNCTIVE_IMPLIES) | (1L << CONJUNCTIVE_CONSEQUENCE) | (1L << CONJUNCTIVE_NOT_EQUAL))) != 0)) ) {
							((ConjunctiveBoolExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1330);
						t_expressionDetail(2);
						}
						break;
					case 12:
						{
						_localctx = new DotExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1331);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1332);
						match(DOT);
						setState(1333);
						t_identifier();
						}
						break;
					case 13:
						{
						_localctx = new DotThisExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1334);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1335);
						match(DOT);
						setState(1336);
						match(THIS);
						}
						break;
					case 14:
						{
						_localctx = new DotNewExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1337);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1338);
						match(DOT);
						setState(1339);
						match(NEW);
						setState(1341);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1340);
							t_nonWildcardTypeArguments();
							}
						}

						setState(1343);
						t_innerCreator();
						}
						break;
					case 15:
						{
						_localctx = new DotSuperExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1344);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1345);
						match(DOT);
						setState(1346);
						match(SUPER);
						setState(1347);
						t_superSuffix();
						}
						break;
					case 16:
						{
						_localctx = new DotExplicitGenericExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1348);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1349);
						match(DOT);
						setState(1350);
						t_explicitGenericInvocation();
						}
						break;
					case 17:
						{
						_localctx = new ArrayExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1351);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1352);
						match(LBRACK);
						setState(1353);
						t_expressionDetail(0);
						setState(1354);
						match(RBRACK);
						}
						break;
					case 18:
						{
						_localctx = new FuncCallExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1356);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1357);
						match(LPAREN);
						setState(1366);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
							{
							setState(1358);
							t_expressionDetail(0);
							setState(1363);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(1359);
								match(COMMA);
								setState(1360);
								t_expressionDetail(0);
								}
								}
								setState(1365);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(1368);
						match(RPAREN);
						}
						break;
					case 19:
						{
						_localctx = new InstanceOfExprContext(new T_expressionDetailContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t_expressionDetail);
						setState(1369);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1370);
						match(INSTANCEOF);
						setState(1371);
						t_type();
						}
						break;
					}
					} 
				}
				setState(1376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		enterRule(_localctx, 174, RULE_t_primary);
		try {
			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				t_parExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1379);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1380);
				t_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1381);
				t_identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1382);
				t_type();
				setState(1383);
				match(DOT);
				setState(1384);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1386);
				match(VOID);
				setState(1387);
				match(DOT);
				setState(1388);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1389);
				t_nonWildcardTypeArguments();
				setState(1393);
				switch (_input.LA(1)) {
				case SUPER:
				case UndecoratedIdentifier:
				case PreValueName:
				case MidValueName:
				case PostValueName:
					{
					setState(1390);
					t_explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1391);
					match(THIS);
					setState(1392);
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
		enterRule(_localctx, 176, RULE_t_creator);
		try {
			setState(1406);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				t_nonWildcardTypeArguments();
				setState(1398);
				t_createdName();
				setState(1399);
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
				setState(1401);
				t_createdName();
				setState(1404);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1402);
					t_arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1403);
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
		enterRule(_localctx, 178, RULE_t_createdName);
		int _la;
		try {
			setState(1423);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1408);
				t_identifier();
				setState(1410);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1409);
					t_typeArgumentsOrDiamond();
					}
				}

				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1412);
					match(DOT);
					setState(1413);
					t_identifier();
					setState(1415);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1414);
						t_typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1421);
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
				setState(1422);
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
		enterRule(_localctx, 180, RULE_t_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			t_identifier();
			setState(1427);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1426);
				t_nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1429);
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
		enterRule(_localctx, 182, RULE_t_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(LBRACK);
			setState(1459);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1432);
				match(RBRACK);
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1433);
					match(LBRACK);
					setState(1434);
					match(RBRACK);
					}
					}
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1440);
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
				setState(1441);
				t_expression();
				setState(1442);
				match(RBRACK);
				setState(1449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1443);
						match(LBRACK);
						setState(1444);
						t_expression();
						setState(1445);
						match(RBRACK);
						}
						} 
					}
					setState(1451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				setState(1456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1452);
						match(LBRACK);
						setState(1453);
						match(RBRACK);
						}
						} 
					}
					setState(1458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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
		enterRule(_localctx, 184, RULE_t_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			t_arguments();
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1462);
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
		enterRule(_localctx, 186, RULE_t_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			t_nonWildcardTypeArguments();
			setState(1466);
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
		enterRule(_localctx, 188, RULE_t_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(LT);
			setState(1469);
			t_typeList();
			setState(1470);
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
		enterRule(_localctx, 190, RULE_t_typeArgumentsOrDiamond);
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				match(LT);
				setState(1473);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
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
		enterRule(_localctx, 192, RULE_t_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				match(LT);
				setState(1478);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
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
		enterRule(_localctx, 194, RULE_t_superSuffix);
		try {
			setState(1488);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				t_arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				match(DOT);
				setState(1484);
				t_identifier();
				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1485);
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
		enterRule(_localctx, 196, RULE_t_explicitGenericInvocationSuffix);
		try {
			setState(1495);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				match(SUPER);
				setState(1491);
				t_superSuffix();
				}
				break;
			case UndecoratedIdentifier:
			case PreValueName:
			case MidValueName:
			case PostValueName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1492);
				t_identifier();
				setState(1493);
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
		enterRule(_localctx, 198, RULE_t_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(LPAREN);
			setState(1499);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << UndecoratedIdentifier) | (1L << PreValueName) | (1L << MidValueName) | (1L << PostValueName))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
				{
				setState(1498);
				t_expressionList();
				}
			}

			setState(1501);
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
		enterRule(_localctx, 200, RULE_t_means);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(MEANS);
			setState(1504);
			t_expression();
			setState(1505);
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
		enterRule(_localctx, 202, RULE_t_idDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
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
		enterRule(_localctx, 204, RULE_t_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
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
		enterRule(_localctx, 206, RULE_t_identifierDetail);
		try {
			setState(1515);
			switch (_input.LA(1)) {
			case UndecoratedIdentifier:
				_localctx = new T_UndecoratedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1511);
				match(UndecoratedIdentifier);
				}
				break;
			case PreValueName:
				_localctx = new T_PreValueNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1512);
				match(PreValueName);
				}
				break;
			case MidValueName:
				_localctx = new T_MidValueNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1513);
				match(MidValueName);
				}
				break;
			case PostValueName:
				_localctx = new T_PostValueNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1514);
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
		enterRule(_localctx, 208, RULE_t_valueName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
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
		enterRule(_localctx, 210, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1519);
				packageDeclaration();
				}
				break;
			}
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(1522);
				importDeclaration();
				}
				}
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(1528);
				typeDeclaration();
				}
				}
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1534);
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
		enterRule(_localctx, 212, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1536);
				annotation();
				}
				}
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1542);
			match(PACKAGE);
			setState(1543);
			qualifiedName();
			setState(1544);
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
		enterRule(_localctx, 214, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(IMPORT);
			setState(1548);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1547);
				match(STATIC);
				}
			}

			setState(1550);
			qualifiedName();
			setState(1553);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1551);
				match(DOT);
				setState(1552);
				match(MUL);
				}
			}

			setState(1555);
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
		enterRule(_localctx, 216, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(1586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1557);
					classOrInterfaceModifier();
					}
					}
					setState(1562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1563);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1564);
					classOrInterfaceModifier();
					}
					}
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1570);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(1571);
					classOrInterfaceModifier();
					}
					}
					setState(1576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1577);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1578);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1584);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1585);
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
		enterRule(_localctx, 218, RULE_modifier);
		int _la;
		try {
			setState(1590);
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
				setState(1588);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
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
		enterRule(_localctx, 220, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(1594);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
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
				setState(1593);
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
		enterRule(_localctx, 222, RULE_variableModifier);
		try {
			setState(1598);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
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
		enterRule(_localctx, 224, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(CLASS);
			setState(1601);
			match(Identifier);
			setState(1603);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1602);
				typeParameters();
				}
			}

			setState(1607);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1605);
				match(EXTENDS);
				setState(1606);
				type();
				}
			}

			setState(1611);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1609);
				match(IMPLEMENTS);
				setState(1610);
				typeList();
				}
			}

			setState(1613);
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
		enterRule(_localctx, 226, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			match(LT);
			setState(1616);
			typeParameter();
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1617);
				match(COMMA);
				setState(1618);
				typeParameter();
				}
				}
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1624);
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
		enterRule(_localctx, 228, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(Identifier);
			setState(1629);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1627);
				match(EXTENDS);
				setState(1628);
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
		enterRule(_localctx, 230, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			type();
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1632);
				match(BITAND);
				setState(1633);
				type();
				}
				}
				setState(1638);
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
		enterRule(_localctx, 232, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(ENUM);
			setState(1640);
			match(Identifier);
			setState(1643);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1641);
				match(IMPLEMENTS);
				setState(1642);
				typeList();
				}
			}

			setState(1645);
			match(LBRACE);
			setState(1647);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1646);
				enumConstants();
				}
			}

			setState(1650);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1649);
				match(COMMA);
				}
			}

			setState(1653);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1652);
				enumBodyDeclarations();
				}
			}

			setState(1655);
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
		enterRule(_localctx, 234, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			enumConstant();
			setState(1662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1658);
					match(COMMA);
					setState(1659);
					enumConstant();
					}
					} 
				}
				setState(1664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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
		enterRule(_localctx, 236, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1665);
				annotation();
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1671);
			match(Identifier);
			setState(1673);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1672);
				arguments();
				}
			}

			setState(1676);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1675);
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
		enterRule(_localctx, 238, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(SEMI);
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << Identifier))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(1679);
				classBodyDeclaration();
				}
				}
				setState(1684);
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
		enterRule(_localctx, 240, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(INTERFACE);
			setState(1686);
			match(Identifier);
			setState(1688);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1687);
				typeParameters();
				}
			}

			setState(1692);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1690);
				match(EXTENDS);
				setState(1691);
				typeList();
				}
			}

			setState(1694);
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
		enterRule(_localctx, 242, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			type();
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1697);
				match(COMMA);
				setState(1698);
				type();
				}
				}
				setState(1703);
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
		enterRule(_localctx, 244, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(LBRACE);
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << Identifier))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LBRACE - 72)) | (1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(1705);
				classBodyDeclaration();
				}
				}
				setState(1710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1711);
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
		enterRule(_localctx, 246, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			match(LBRACE);
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << Identifier))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (SEMI - 76)) | (1L << (LT - 76)) | (1L << (AT - 76)))) != 0)) {
				{
				{
				setState(1714);
				interfaceBodyDeclaration();
				}
				}
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1720);
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
		enterRule(_localctx, 248, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1724);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(1723);
					match(STATIC);
					}
				}

				setState(1726);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1727);
						modifier();
						}
						} 
					}
					setState(1732);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				setState(1733);
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
		enterRule(_localctx, 250, RULE_memberDeclaration);
		try {
			setState(1745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1736);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1738);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1739);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1740);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1741);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1742);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1743);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1744);
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
		enterRule(_localctx, 252, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
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
				setState(1747);
				type();
				}
				break;
			case VOID:
				{
				setState(1748);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1751);
			match(Identifier);
			setState(1752);
			formalParameters();
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1753);
				match(LBRACK);
				setState(1754);
				match(RBRACK);
				}
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1762);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1760);
				match(THROWS);
				setState(1761);
				qualifiedNameList();
				}
			}

			setState(1766);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(1764);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(1765);
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
		enterRule(_localctx, 254, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			typeParameters();
			setState(1769);
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
		enterRule(_localctx, 256, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(Identifier);
			setState(1772);
			formalParameters();
			setState(1775);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1773);
				match(THROWS);
				setState(1774);
				qualifiedNameList();
				}
			}

			setState(1777);
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
		enterRule(_localctx, 258, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			typeParameters();
			setState(1780);
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
		enterRule(_localctx, 260, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			type();
			setState(1783);
			variableDeclarators();
			setState(1784);
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
		enterRule(_localctx, 262, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(1794);
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
				setState(1789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1786);
						modifier();
						}
						} 
					}
					setState(1791);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				}
				setState(1792);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
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
		enterRule(_localctx, 264, RULE_interfaceMemberDeclaration);
		try {
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1796);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1797);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1798);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1799);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1800);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1801);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1802);
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
		enterRule(_localctx, 266, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			type();
			setState(1806);
			constantDeclarator();
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1807);
				match(COMMA);
				setState(1808);
				constantDeclarator();
				}
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1814);
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
		enterRule(_localctx, 268, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			match(Identifier);
			setState(1821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1817);
				match(LBRACK);
				setState(1818);
				match(RBRACK);
				}
				}
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1824);
			match(ASSIGN);
			setState(1825);
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
		enterRule(_localctx, 270, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
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
				setState(1827);
				type();
				}
				break;
			case VOID:
				{
				setState(1828);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1831);
			match(Identifier);
			setState(1832);
			formalParameters();
			setState(1837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1833);
				match(LBRACK);
				setState(1834);
				match(RBRACK);
				}
				}
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 272, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			typeParameters();
			setState(1847);
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
		enterRule(_localctx, 274, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			variableDeclarator();
			setState(1854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1850);
				match(COMMA);
				setState(1851);
				variableDeclarator();
				}
				}
				setState(1856);
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
		enterRule(_localctx, 276, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			variableDeclaratorId();
			setState(1860);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1858);
				match(ASSIGN);
				setState(1859);
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
		enterRule(_localctx, 278, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(Identifier);
			setState(1867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1863);
				match(LBRACK);
				setState(1864);
				match(RBRACK);
				}
				}
				setState(1869);
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
		enterRule(_localctx, 280, RULE_variableInitializer);
		try {
			setState(1872);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1870);
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
				setState(1871);
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
		enterRule(_localctx, 282, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			match(LBRACE);
			setState(1886);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
				{
				setState(1875);
				variableInitializer();
				setState(1880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1876);
						match(COMMA);
						setState(1877);
						variableInitializer();
						}
						} 
					}
					setState(1882);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				}
				setState(1884);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1883);
					match(COMMA);
					}
				}

				}
			}

			setState(1888);
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
		enterRule(_localctx, 284, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
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
		enterRule(_localctx, 286, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
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
		enterRule(_localctx, 288, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
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
		enterRule(_localctx, 290, RULE_type);
		try {
			int _alt;
			setState(1912);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1896);
				classOrInterfaceType();
				setState(1901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1897);
						match(LBRACK);
						setState(1898);
						match(RBRACK);
						}
						} 
					}
					setState(1903);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
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
				setState(1904);
				primitiveType();
				setState(1909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1905);
						match(LBRACK);
						setState(1906);
						match(RBRACK);
						}
						} 
					}
					setState(1911);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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
		enterRule(_localctx, 292, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			match(Identifier);
			setState(1916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1915);
				typeArguments();
				}
				break;
			}
			setState(1925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1918);
					match(DOT);
					setState(1919);
					match(Identifier);
					setState(1921);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						setState(1920);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(1927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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
		enterRule(_localctx, 294, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
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
		enterRule(_localctx, 296, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			match(LT);
			setState(1931);
			typeArgument();
			setState(1936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1932);
				match(COMMA);
				setState(1933);
				typeArgument();
				}
				}
				setState(1938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1939);
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
		enterRule(_localctx, 298, RULE_typeArgument);
		int _la;
		try {
			setState(1947);
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
				setState(1941);
				type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1942);
				match(QUESTION);
				setState(1945);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(1943);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1944);
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
		enterRule(_localctx, 300, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			qualifiedName();
			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1950);
				match(COMMA);
				setState(1951);
				qualifiedName();
				}
				}
				setState(1956);
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
		enterRule(_localctx, 302, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			match(LPAREN);
			setState(1959);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << Identifier))) != 0) || _la==AT) {
				{
				setState(1958);
				formalParameterList();
				}
			}

			setState(1961);
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
		enterRule(_localctx, 304, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(1976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1963);
				formalParameter();
				setState(1968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1964);
						match(COMMA);
						setState(1965);
						formalParameter();
						}
						} 
					}
					setState(1970);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				}
				setState(1973);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1971);
					match(COMMA);
					setState(1972);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
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
		enterRule(_localctx, 306, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1978);
				variableModifier();
				}
				}
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1984);
			type();
			setState(1985);
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
		enterRule(_localctx, 308, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1987);
				variableModifier();
				}
				}
				setState(1992);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1993);
			type();
			setState(1994);
			match(ELLIPSIS);
			setState(1995);
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
		enterRule(_localctx, 310, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
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
		enterRule(_localctx, 312, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
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
		enterRule(_localctx, 314, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			match(Identifier);
			setState(2006);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2002);
					match(DOT);
					setState(2003);
					match(Identifier);
					}
					} 
				}
				setState(2008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
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
		enterRule(_localctx, 316, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BooleanLiteral - 52)) | (1L << (NullLiteral - 52)) | (1L << (IntegerLiteral - 52)) | (1L << (FloatingPointLiteral - 52)) | (1L << (CharacterLiteral - 52)) | (1L << (StringLiteral - 52)))) != 0)) ) {
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
		enterRule(_localctx, 318, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(AT);
			setState(2012);
			annotationName();
			setState(2019);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2013);
				match(LPAREN);
				setState(2016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(2014);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(2015);
					elementValue();
					}
					break;
				}
				setState(2018);
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
		enterRule(_localctx, 320, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2021);
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
		enterRule(_localctx, 322, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			elementValuePair();
			setState(2028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2024);
				match(COMMA);
				setState(2025);
				elementValuePair();
				}
				}
				setState(2030);
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
		enterRule(_localctx, 324, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			match(Identifier);
			setState(2032);
			match(ASSIGN);
			setState(2033);
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
		enterRule(_localctx, 326, RULE_elementValue);
		try {
			setState(2038);
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
				setState(2035);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2036);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2037);
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
		enterRule(_localctx, 328, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			match(LBRACE);
			setState(2049);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(2041);
				elementValue();
				setState(2046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2042);
						match(COMMA);
						setState(2043);
						elementValue();
						}
						} 
					}
					setState(2048);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				}
				}
			}

			setState(2052);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2051);
				match(COMMA);
				}
			}

			setState(2054);
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
		enterRule(_localctx, 330, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			match(AT);
			setState(2057);
			match(INTERFACE);
			setState(2058);
			match(Identifier);
			setState(2059);
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
		enterRule(_localctx, 332, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			match(LBRACE);
			setState(2065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << Identifier))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(2062);
				annotationTypeElementDeclaration();
				}
				}
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2068);
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
		enterRule(_localctx, 334, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(2078);
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
				setState(2073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2070);
						modifier();
						}
						} 
					}
					setState(2075);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
				}
				setState(2076);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2077);
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
		enterRule(_localctx, 336, RULE_annotationTypeElementRest);
		try {
			setState(2100);
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
				setState(2080);
				type();
				setState(2081);
				annotationMethodOrConstantRest();
				setState(2082);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2084);
				classDeclaration();
				setState(2086);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(2085);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2088);
				interfaceDeclaration();
				setState(2090);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2089);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(2092);
				enumDeclaration();
				setState(2094);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2093);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2096);
				annotationTypeDeclaration();
				setState(2098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2097);
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
		enterRule(_localctx, 338, RULE_annotationMethodOrConstantRest);
		try {
			setState(2104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2102);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2103);
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
		enterRule(_localctx, 340, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
			match(Identifier);
			setState(2107);
			match(LPAREN);
			setState(2108);
			match(RPAREN);
			setState(2110);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2109);
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
		enterRule(_localctx, 342, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2112);
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
		enterRule(_localctx, 344, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(DEFAULT);
			setState(2115);
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
		enterRule(_localctx, 346, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			match(LBRACE);
			setState(2121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(2118);
				blockStatement();
				}
				}
				setState(2123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2124);
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
		enterRule(_localctx, 348, RULE_blockStatement);
		try {
			setState(2129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2126);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2127);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2128);
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
		enterRule(_localctx, 350, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			localVariableDeclaration();
			setState(2132);
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
		enterRule(_localctx, 352, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2134);
				variableModifier();
				}
				}
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2140);
			type();
			setState(2141);
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
		enterRule(_localctx, 354, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(2247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2143);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2144);
				match(ASSERT);
				setState(2145);
				expression(0);
				setState(2148);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(2146);
					match(COLON);
					setState(2147);
					expression(0);
					}
				}

				setState(2150);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2152);
				match(IF);
				setState(2153);
				parExpression();
				setState(2154);
				statement();
				setState(2157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2155);
					match(ELSE);
					setState(2156);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2159);
				match(FOR);
				setState(2160);
				match(LPAREN);
				setState(2161);
				forControl();
				setState(2162);
				match(RPAREN);
				setState(2163);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2165);
				match(WHILE);
				setState(2166);
				parExpression();
				setState(2167);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2169);
				match(DO);
				setState(2170);
				statement();
				setState(2171);
				match(WHILE);
				setState(2172);
				parExpression();
				setState(2173);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2175);
				match(TRY);
				setState(2176);
				block();
				setState(2186);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(2178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2177);
						catchClause();
						}
						}
						setState(2180); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(2183);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(2182);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(2185);
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
				setState(2188);
				match(TRY);
				setState(2189);
				resourceSpecification();
				setState(2190);
				block();
				setState(2194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(2191);
					catchClause();
					}
					}
					setState(2196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2198);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(2197);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2200);
				match(SWITCH);
				setState(2201);
				parExpression();
				setState(2202);
				match(LBRACE);
				setState(2206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2203);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(2208);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				}
				setState(2212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(2209);
					switchLabel();
					}
					}
					setState(2214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2215);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2217);
				match(SYNCHRONIZED);
				setState(2218);
				parExpression();
				setState(2219);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2221);
				match(RETURN);
				setState(2223);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(2222);
					expression(0);
					}
				}

				setState(2225);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2226);
				match(THROW);
				setState(2227);
				expression(0);
				setState(2228);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2230);
				match(BREAK);
				setState(2232);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2231);
					match(Identifier);
					}
				}

				setState(2234);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2235);
				match(CONTINUE);
				setState(2237);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2236);
					match(Identifier);
					}
				}

				setState(2239);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2240);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2241);
				statementExpression();
				setState(2242);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2244);
				match(Identifier);
				setState(2245);
				match(COLON);
				setState(2246);
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
		enterRule(_localctx, 356, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			match(CATCH);
			setState(2250);
			match(LPAREN);
			setState(2254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2251);
				variableModifier();
				}
				}
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2257);
			catchType();
			setState(2258);
			match(Identifier);
			setState(2259);
			match(RPAREN);
			setState(2260);
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
		enterRule(_localctx, 358, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			qualifiedName();
			setState(2267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(2263);
				match(BITOR);
				setState(2264);
				qualifiedName();
				}
				}
				setState(2269);
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
		enterRule(_localctx, 360, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			match(FINALLY);
			setState(2271);
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
		enterRule(_localctx, 362, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			match(LPAREN);
			setState(2274);
			resources();
			setState(2276);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2275);
				match(SEMI);
				}
			}

			setState(2278);
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
		enterRule(_localctx, 364, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			resource();
			setState(2285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2281);
					match(SEMI);
					setState(2282);
					resource();
					}
					} 
				}
				setState(2287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
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
		enterRule(_localctx, 366, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2288);
				variableModifier();
				}
				}
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2294);
			classOrInterfaceType();
			setState(2295);
			variableDeclaratorId();
			setState(2296);
			match(ASSIGN);
			setState(2297);
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
		enterRule(_localctx, 368, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2299);
				switchLabel();
				}
				}
				setState(2302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(2305); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2304);
				blockStatement();
				}
				}
				setState(2307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 370, RULE_switchLabel);
		try {
			setState(2319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2309);
				match(CASE);
				setState(2310);
				constantExpression();
				setState(2311);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2313);
				match(CASE);
				setState(2314);
				enumConstantName();
				setState(2315);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2317);
				match(DEFAULT);
				setState(2318);
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
		enterRule(_localctx, 372, RULE_forControl);
		int _la;
		try {
			setState(2333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2321);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2323);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2322);
					forInit();
					}
				}

				setState(2325);
				match(SEMI);
				setState(2327);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(2326);
					expression(0);
					}
				}

				setState(2329);
				match(SEMI);
				setState(2331);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
					{
					setState(2330);
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
		enterRule(_localctx, 374, RULE_forInit);
		try {
			setState(2337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2335);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2336);
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
		enterRule(_localctx, 376, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2339);
				variableModifier();
				}
				}
				setState(2344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2345);
			type();
			setState(2346);
			match(Identifier);
			setState(2347);
			match(COLON);
			setState(2348);
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
		enterRule(_localctx, 378, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
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
		enterRule(_localctx, 380, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2352);
			match(LPAREN);
			setState(2353);
			expression(0);
			setState(2354);
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
		enterRule(_localctx, 382, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			expression(0);
			setState(2361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2357);
				match(COMMA);
				setState(2358);
				expression(0);
				}
				}
				setState(2363);
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
		enterRule(_localctx, 384, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 386, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2366);
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
		int _startState = 388;
		enterRecursionRule(_localctx, 388, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2369);
				primary();
				}
				break;
			case 2:
				{
				setState(2370);
				match(NEW);
				setState(2371);
				creator();
				}
				break;
			case 3:
				{
				setState(2372);
				match(LPAREN);
				setState(2373);
				type();
				setState(2374);
				match(RPAREN);
				setState(2375);
				expression(17);
				}
				break;
			case 4:
				{
				setState(2377);
				_la = _input.LA(1);
				if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (INC - 92)) | (1L << (DEC - 92)) | (1L << (ADD - 92)) | (1L << (SUB - 92)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2378);
				expression(15);
				}
				break;
			case 5:
				{
				setState(2379);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2380);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2383);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2384);
						_la = _input.LA(1);
						if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (MUL - 96)) | (1L << (DIV - 96)) | (1L << (MOD - 96)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2385);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2386);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2387);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2388);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2389);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2397);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
						case 1:
							{
							setState(2390);
							match(LT);
							setState(2391);
							match(LT);
							}
							break;
						case 2:
							{
							setState(2392);
							match(GT);
							setState(2393);
							match(GT);
							setState(2394);
							match(GT);
							}
							break;
						case 3:
							{
							setState(2395);
							match(GT);
							setState(2396);
							match(GT);
							}
							break;
						}
						setState(2399);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2400);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2401);
						_la = _input.LA(1);
						if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (GT - 80)) | (1L << (LT - 80)) | (1L << (LE - 80)) | (1L << (GE - 80)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2402);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2403);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2404);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2405);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2406);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2407);
						match(BITAND);
						setState(2408);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2409);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2410);
						match(CARET);
						setState(2411);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2412);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2413);
						match(BITOR);
						setState(2414);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2415);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2416);
						match(AND);
						setState(2417);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2418);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2419);
						match(OR);
						setState(2420);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2421);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2422);
						match(QUESTION);
						setState(2423);
						expression(0);
						setState(2424);
						match(COLON);
						setState(2425);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2427);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2428);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ASSIGN - 79)) | (1L << (ADD_ASSIGN - 79)) | (1L << (SUB_ASSIGN - 79)) | (1L << (MUL_ASSIGN - 79)) | (1L << (DIV_ASSIGN - 79)) | (1L << (AND_ASSIGN - 79)) | (1L << (OR_ASSIGN - 79)) | (1L << (XOR_ASSIGN - 79)) | (1L << (MOD_ASSIGN - 79)) | (1L << (LSHIFT_ASSIGN - 79)) | (1L << (RSHIFT_ASSIGN - 79)) | (1L << (URSHIFT_ASSIGN - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2429);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2430);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(2431);
						match(DOT);
						setState(2432);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2433);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(2434);
						match(DOT);
						setState(2435);
						match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2436);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(2437);
						match(DOT);
						setState(2438);
						match(NEW);
						setState(2440);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(2439);
							nonWildcardTypeArguments();
							}
						}

						setState(2442);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2443);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(2444);
						match(DOT);
						setState(2445);
						match(SUPER);
						setState(2446);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2447);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(2448);
						match(DOT);
						setState(2449);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2450);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2451);
						match(LBRACK);
						setState(2452);
						expression(0);
						setState(2453);
						match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2455);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2456);
						match(LPAREN);
						setState(2458);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
							{
							setState(2457);
							expressionList();
							}
						}

						setState(2460);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2461);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2462);
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
						setState(2463);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2464);
						match(INSTANCEOF);
						setState(2465);
						type();
						}
						break;
					}
					} 
				}
				setState(2470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
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
		enterRule(_localctx, 390, RULE_primary);
		try {
			setState(2492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2471);
				match(LPAREN);
				setState(2472);
				expression(0);
				setState(2473);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2475);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2476);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2477);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2478);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2479);
				type();
				setState(2480);
				match(DOT);
				setState(2481);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2483);
				match(VOID);
				setState(2484);
				match(DOT);
				setState(2485);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2486);
				nonWildcardTypeArguments();
				setState(2490);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(2487);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(2488);
					match(THIS);
					setState(2489);
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
		enterRule(_localctx, 392, RULE_creator);
		try {
			setState(2503);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2494);
				nonWildcardTypeArguments();
				setState(2495);
				createdName();
				setState(2496);
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
				setState(2498);
				createdName();
				setState(2501);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(2499);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(2500);
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
		enterRule(_localctx, 394, RULE_createdName);
		int _la;
		try {
			setState(2520);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2505);
				match(Identifier);
				setState(2507);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2506);
					typeArgumentsOrDiamond();
					}
				}

				setState(2516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2509);
					match(DOT);
					setState(2510);
					match(Identifier);
					setState(2512);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2511);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(2518);
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
				setState(2519);
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
		enterRule(_localctx, 396, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522);
			match(Identifier);
			setState(2524);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2523);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(2526);
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
		enterRule(_localctx, 398, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2528);
			match(LBRACK);
			setState(2556);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(2529);
				match(RBRACK);
				setState(2534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2530);
					match(LBRACK);
					setState(2531);
					match(RBRACK);
					}
					}
					setState(2536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2537);
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
				setState(2538);
				expression(0);
				setState(2539);
				match(RBRACK);
				setState(2546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2540);
						match(LBRACK);
						setState(2541);
						expression(0);
						setState(2542);
						match(RBRACK);
						}
						} 
					}
					setState(2548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				}
				setState(2553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2549);
						match(LBRACK);
						setState(2550);
						match(RBRACK);
						}
						} 
					}
					setState(2555);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
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
		enterRule(_localctx, 400, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2558);
			arguments();
			setState(2560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2559);
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
		enterRule(_localctx, 402, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			nonWildcardTypeArguments();
			setState(2563);
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
		enterRule(_localctx, 404, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
			match(LT);
			setState(2566);
			typeList();
			setState(2567);
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
		enterRule(_localctx, 406, RULE_typeArgumentsOrDiamond);
		try {
			setState(2572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2569);
				match(LT);
				setState(2570);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2571);
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
		enterRule(_localctx, 408, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(2577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2574);
				match(LT);
				setState(2575);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2576);
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
		enterRule(_localctx, 410, RULE_superSuffix);
		try {
			setState(2585);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2579);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2580);
				match(DOT);
				setState(2581);
				match(Identifier);
				setState(2583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2582);
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
		enterRule(_localctx, 412, RULE_explicitGenericInvocationSuffix);
		try {
			setState(2591);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2587);
				match(SUPER);
				setState(2588);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2589);
				match(Identifier);
				setState(2590);
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
		enterRule(_localctx, 414, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
			match(LPAREN);
			setState(2595);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << Identifier))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)))) != 0)) {
				{
				setState(2594);
				expressionList();
				}
			}

			setState(2597);
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
		case 86:
			return t_expressionDetail_sempred((T_expressionDetailContext)_localctx, predIndex);
		case 194:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3t\u0a2a\4\2\t\2\4"+
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
		"\3\2\5\2\u01a4\n\2\3\2\7\2\u01a7\n\2\f\2\16\2\u01aa\13\2\3\2\7\2\u01ad"+
		"\n\2\f\2\16\2\u01b0\13\2\3\2\3\2\3\3\7\3\u01b5\n\3\f\3\16\3\u01b8\13\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u01c0\n\4\3\4\3\4\3\4\5\4\u01c5\n\4\3\4\3"+
		"\4\3\5\7\5\u01ca\n\5\f\5\16\5\u01cd\13\5\3\5\3\5\7\5\u01d1\n\5\f\5\16"+
		"\5\u01d4\13\5\3\5\3\5\7\5\u01d8\n\5\f\5\16\5\u01db\13\5\3\5\3\5\7\5\u01df"+
		"\n\5\f\5\16\5\u01e2\13\5\3\5\3\5\5\5\u01e6\n\5\3\6\3\6\5\6\u01ea\n\6\3"+
		"\7\3\7\5\7\u01ee\n\7\3\b\3\b\5\b\u01f2\n\b\3\t\3\t\3\t\5\t\u01f7\n\t\3"+
		"\t\3\t\5\t\u01fb\n\t\3\t\3\t\5\t\u01ff\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n"+
		"\u0207\n\n\f\n\16\n\u020a\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u0211\n\13"+
		"\3\f\3\f\3\f\7\f\u0216\n\f\f\f\16\f\u0219\13\f\3\r\3\r\3\r\3\r\5\r\u021f"+
		"\n\r\3\r\3\r\5\r\u0223\n\r\3\r\5\r\u0226\n\r\3\r\5\r\u0229\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u0230\n\16\f\16\16\16\u0233\13\16\3\17\7\17\u0236"+
		"\n\17\f\17\16\17\u0239\13\17\3\17\3\17\5\17\u023d\n\17\3\17\5\17\u0240"+
		"\n\17\3\20\3\20\7\20\u0244\n\20\f\20\16\20\u0247\13\20\3\21\3\21\3\21"+
		"\5\21\u024c\n\21\3\21\3\21\5\21\u0250\n\21\3\21\3\21\3\22\3\22\3\22\7"+
		"\22\u0257\n\22\f\22\16\22\u025a\13\22\3\23\3\23\7\23\u025e\n\23\f\23\16"+
		"\23\u0261\13\23\3\23\3\23\3\24\3\24\7\24\u0267\n\24\f\24\16\24\u026a\13"+
		"\24\3\24\3\24\3\25\3\25\5\25\u0270\n\25\3\25\3\25\7\25\u0274\n\25\f\25"+
		"\16\25\u0277\13\25\3\25\5\25\u027a\n\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0287\n\27\3\30\3\30\5\30\u028b\n\30\3"+
		"\30\3\30\3\30\3\30\7\30\u0291\n\30\f\30\16\30\u0294\13\30\3\30\3\30\5"+
		"\30\u0298\n\30\3\30\3\30\5\30\u029c\n\30\3\30\5\30\u029f\n\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\5\32\u02a8\n\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\7\34\u02b3\n\34\f\34\16\34\u02b6\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u02bf\n\35\3\36\3\36\7\36\u02c3\n\36\f\36\16"+
		"\36\u02c6\13\36\3\36\5\36\u02c9\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \5 \u02d4\n \3!\3!\3\"\3\"\3#\3#\3#\7#\u02dd\n#\f#\16#\u02e0\13#\3$\3"+
		"$\5$\u02e4\n$\3%\3%\3%\3%\7%\u02ea\n%\f%\16%\u02ed\13%\3%\5%\u02f0\n%"+
		"\5%\u02f2\n%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\7)\u02ff\n)\f)\16)\u0302"+
		"\13)\3)\3)\3)\7)\u0307\n)\f)\16)\u030a\13)\5)\u030c\n)\3*\3*\5*\u0310"+
		"\n*\3*\3*\3*\5*\u0315\n*\7*\u0317\n*\f*\16*\u031a\13*\3+\3+\3,\3,\3,\3"+
		",\7,\u0322\n,\f,\16,\u0325\13,\3,\3,\3-\3-\3-\3-\5-\u032d\n-\5-\u032f"+
		"\n-\3.\3.\3.\7.\u0334\n.\f.\16.\u0337\13.\3/\3/\5/\u033b\n/\3/\3/\3\60"+
		"\3\60\3\60\7\60\u0342\n\60\f\60\16\60\u0345\13\60\3\60\3\60\5\60\u0349"+
		"\n\60\3\60\5\60\u034c\n\60\3\61\7\61\u034f\n\61\f\61\16\61\u0352\13\61"+
		"\3\61\3\61\3\61\3\62\7\62\u0358\n\62\f\62\16\62\u035b\13\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\7\65\u0368\n\65\f\65\16"+
		"\65\u036b\13\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u0374\n\67\3\67"+
		"\5\67\u0377\n\67\38\38\39\39\39\79\u037e\n9\f9\169\u0381\139\3:\3:\3:"+
		"\3:\3;\3;\3;\5;\u038a\n;\3<\3<\3<\3<\7<\u0390\n<\f<\16<\u0393\13<\5<\u0395"+
		"\n<\3<\5<\u0398\n<\3<\3<\3=\3=\3=\3=\3=\3>\3>\7>\u03a3\n>\f>\16>\u03a6"+
		"\13>\3>\3>\3?\3?\7?\u03ac\n?\f?\16?\u03af\13?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\5?\u03bb\n?\3?\3?\5?\u03bf\n?\3?\3?\5?\u03c3\n?\3?\3?\5?\u03c7"+
		"\n?\5?\u03c9\n?\5?\u03cb\n?\3@\3@\3@\3@\5@\u03d1\n@\3A\3A\3A\7A\u03d6"+
		"\nA\fA\16A\u03d9\13A\3B\3B\3B\3C\3C\7C\u03e0\nC\fC\16C\u03e3\13C\3C\3"+
		"C\3D\3D\3D\3D\3D\5D\u03ec\nD\3E\7E\u03ef\nE\fE\16E\u03f2\13E\3E\3E\3E"+
		"\3E\7E\u03f8\nE\fE\16E\u03fb\13E\3F\3F\3F\3F\3F\5F\u0402\nF\3F\3F\3F\3"+
		"F\3F\3F\3F\5F\u040b\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\6F\u0420\nF\rF\16F\u0421\3F\5F\u0425\nF\3F\5F\u0428\nF\3F\3"+
		"F\3F\3F\7F\u042e\nF\fF\16F\u0431\13F\3F\5F\u0434\nF\3F\3F\3F\3F\7F\u043a"+
		"\nF\fF\16F\u043d\13F\3F\7F\u0440\nF\fF\16F\u0443\13F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\5F\u044d\nF\3F\3F\3F\3F\3F\3F\3F\5F\u0456\nF\3F\3F\3F\5F\u045b"+
		"\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0467\nF\3F\3F\3F\3F\3F\3F\3F\5F"+
		"\u0470\nF\3F\3F\3F\3F\3F\3F\5F\u0478\nF\3G\3G\3G\3G\3G\3G\5G\u0480\nG"+
		"\3H\3H\3H\7H\u0485\nH\fH\16H\u0488\13H\3H\3H\3H\3H\3H\3I\3I\3I\7I\u0492"+
		"\nI\fI\16I\u0495\13I\3J\3J\3J\3K\3K\3K\5K\u049d\nK\3K\3K\3L\3L\3L\7L\u04a4"+
		"\nL\fL\16L\u04a7\13L\3M\7M\u04aa\nM\fM\16M\u04ad\13M\3M\3M\3M\3M\3M\3"+
		"N\6N\u04b5\nN\rN\16N\u04b6\3N\6N\u04ba\nN\rN\16N\u04bb\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\5O\u04c8\nO\3P\3P\5P\u04cc\nP\3P\3P\5P\u04d0\nP\3P\3P"+
		"\5P\u04d4\nP\5P\u04d6\nP\3Q\3Q\5Q\u04da\nQ\3R\7R\u04dd\nR\fR\16R\u04e0"+
		"\13R\3R\3R\3R\3R\3R\3S\3S\3T\3T\3T\3T\3U\3U\3U\7U\u04f0\nU\fU\16U\u04f3"+
		"\13U\3V\3V\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0508"+
		"\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0518\nX\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0540\nX\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\7X\u0554\nX\fX\16X\u0557\13X\5X\u0559\n"+
		"X\3X\3X\3X\3X\7X\u055f\nX\fX\16X\u0562\13X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0574\nY\5Y\u0576\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z"+
		"\u057f\nZ\5Z\u0581\nZ\3[\3[\5[\u0585\n[\3[\3[\3[\5[\u058a\n[\7[\u058c"+
		"\n[\f[\16[\u058f\13[\3[\5[\u0592\n[\3\\\3\\\5\\\u0596\n\\\3\\\3\\\3]\3"+
		"]\3]\3]\7]\u059e\n]\f]\16]\u05a1\13]\3]\3]\3]\3]\3]\3]\3]\7]\u05aa\n]"+
		"\f]\16]\u05ad\13]\3]\3]\7]\u05b1\n]\f]\16]\u05b4\13]\5]\u05b6\n]\3^\3"+
		"^\5^\u05ba\n^\3_\3_\3_\3`\3`\3`\3`\3a\3a\3a\5a\u05c6\na\3b\3b\3b\5b\u05cb"+
		"\nb\3c\3c\3c\3c\5c\u05d1\nc\5c\u05d3\nc\3d\3d\3d\3d\3d\5d\u05da\nd\3e"+
		"\3e\5e\u05de\ne\3e\3e\3f\3f\3f\3f\3g\3g\3h\3h\3i\3i\3i\3i\5i\u05ee\ni"+
		"\3j\3j\3k\5k\u05f3\nk\3k\7k\u05f6\nk\fk\16k\u05f9\13k\3k\7k\u05fc\nk\f"+
		"k\16k\u05ff\13k\3k\3k\3l\7l\u0604\nl\fl\16l\u0607\13l\3l\3l\3l\3l\3m\3"+
		"m\5m\u060f\nm\3m\3m\3m\5m\u0614\nm\3m\3m\3n\7n\u0619\nn\fn\16n\u061c\13"+
		"n\3n\3n\7n\u0620\nn\fn\16n\u0623\13n\3n\3n\7n\u0627\nn\fn\16n\u062a\13"+
		"n\3n\3n\7n\u062e\nn\fn\16n\u0631\13n\3n\3n\5n\u0635\nn\3o\3o\5o\u0639"+
		"\no\3p\3p\5p\u063d\np\3q\3q\5q\u0641\nq\3r\3r\3r\5r\u0646\nr\3r\3r\5r"+
		"\u064a\nr\3r\3r\5r\u064e\nr\3r\3r\3s\3s\3s\3s\7s\u0656\ns\fs\16s\u0659"+
		"\13s\3s\3s\3t\3t\3t\5t\u0660\nt\3u\3u\3u\7u\u0665\nu\fu\16u\u0668\13u"+
		"\3v\3v\3v\3v\5v\u066e\nv\3v\3v\5v\u0672\nv\3v\5v\u0675\nv\3v\5v\u0678"+
		"\nv\3v\3v\3w\3w\3w\7w\u067f\nw\fw\16w\u0682\13w\3x\7x\u0685\nx\fx\16x"+
		"\u0688\13x\3x\3x\5x\u068c\nx\3x\5x\u068f\nx\3y\3y\7y\u0693\ny\fy\16y\u0696"+
		"\13y\3z\3z\3z\5z\u069b\nz\3z\3z\5z\u069f\nz\3z\3z\3{\3{\3{\7{\u06a6\n"+
		"{\f{\16{\u06a9\13{\3|\3|\7|\u06ad\n|\f|\16|\u06b0\13|\3|\3|\3}\3}\7}\u06b6"+
		"\n}\f}\16}\u06b9\13}\3}\3}\3~\3~\5~\u06bf\n~\3~\3~\7~\u06c3\n~\f~\16~"+
		"\u06c6\13~\3~\5~\u06c9\n~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\5\177\u06d4\n\177\3\u0080\3\u0080\5\u0080\u06d8\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\7\u0080\u06de\n\u0080\f\u0080\16\u0080\u06e1"+
		"\13\u0080\3\u0080\3\u0080\5\u0080\u06e5\n\u0080\3\u0080\3\u0080\5\u0080"+
		"\u06e9\n\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u06f2\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0085\7\u0085\u06fe\n\u0085\f\u0085\16\u0085"+
		"\u0701\13\u0085\3\u0085\3\u0085\5\u0085\u0705\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u070e\n\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\7\u0087\u0714\n\u0087\f\u0087\16\u0087\u0717"+
		"\13\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\7\u0088\u071e\n\u0088"+
		"\f\u0088\16\u0088\u0721\13\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\5\u0089\u0728\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u072e\n"+
		"\u0089\f\u0089\16\u0089\u0731\13\u0089\3\u0089\3\u0089\5\u0089\u0735\n"+
		"\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"+
		"\7\u008b\u073f\n\u008b\f\u008b\16\u008b\u0742\13\u008b\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0747\n\u008c\3\u008d\3\u008d\3\u008d\7\u008d\u074c\n"+
		"\u008d\f\u008d\16\u008d\u074f\13\u008d\3\u008e\3\u008e\5\u008e\u0753\n"+
		"\u008e\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u0759\n\u008f\f\u008f\16"+
		"\u008f\u075c\13\u008f\3\u008f\5\u008f\u075f\n\u008f\5\u008f\u0761\n\u008f"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0093\7\u0093\u076e\n\u0093\f\u0093\16\u0093\u0771\13\u0093"+
		"\3\u0093\3\u0093\3\u0093\7\u0093\u0776\n\u0093\f\u0093\16\u0093\u0779"+
		"\13\u0093\5\u0093\u077b\n\u0093\3\u0094\3\u0094\5\u0094\u077f\n\u0094"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u0784\n\u0094\7\u0094\u0786\n\u0094\f"+
		"\u0094\16\u0094\u0789\13\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\7\u0096\u0791\n\u0096\f\u0096\16\u0096\u0794\13\u0096\3\u0096"+
		"\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u079c\n\u0097\5\u0097"+
		"\u079e\n\u0097\3\u0098\3\u0098\3\u0098\7\u0098\u07a3\n\u0098\f\u0098\16"+
		"\u0098\u07a6\13\u0098\3\u0099\3\u0099\5\u0099\u07aa\n\u0099\3\u0099\3"+
		"\u0099\3\u009a\3\u009a\3\u009a\7\u009a\u07b1\n\u009a\f\u009a\16\u009a"+
		"\u07b4\13\u009a\3\u009a\3\u009a\5\u009a\u07b8\n\u009a\3\u009a\5\u009a"+
		"\u07bb\n\u009a\3\u009b\7\u009b\u07be\n\u009b\f\u009b\16\u009b\u07c1\13"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009c\7\u009c\u07c7\n\u009c\f\u009c\16"+
		"\u009c\u07ca\13\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\7\u009f\u07d7\n\u009f\f\u009f"+
		"\16\u009f\u07da\13\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u07e3\n\u00a1\3\u00a1\5\u00a1\u07e6\n\u00a1\3\u00a2\3"+
		"\u00a2\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u07ed\n\u00a3\f\u00a3\16\u00a3"+
		"\u07f0\13\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u07f9\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u07ff\n"+
		"\u00a6\f\u00a6\16\u00a6\u0802\13\u00a6\5\u00a6\u0804\n\u00a6\3\u00a6\5"+
		"\u00a6\u0807\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a8\3\u00a8\7\u00a8\u0812\n\u00a8\f\u00a8\16\u00a8\u0815\13"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a9\7\u00a9\u081a\n\u00a9\f\u00a9\16\u00a9"+
		"\u081d\13\u00a9\3\u00a9\3\u00a9\5\u00a9\u0821\n\u00a9\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0829\n\u00aa\3\u00aa\3\u00aa"+
		"\5\u00aa\u082d\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u0831\n\u00aa\3\u00aa\3"+
		"\u00aa\5\u00aa\u0835\n\u00aa\5\u00aa\u0837\n\u00aa\3\u00ab\3\u00ab\5\u00ab"+
		"\u083b\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0841\n\u00ac\3"+
		"\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\7\u00af\u084a\n"+
		"\u00af\f\u00af\16\u00af\u084d\13\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0"+
		"\3\u00b0\5\u00b0\u0854\n\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2\7\u00b2"+
		"\u085a\n\u00b2\f\u00b2\16\u00b2\u085d\13\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0867\n\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0870\n\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\6\u00b3\u0885\n\u00b3\r\u00b3\16\u00b3\u0886\3\u00b3\5\u00b3"+
		"\u088a\n\u00b3\3\u00b3\5\u00b3\u088d\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3"+
		"\u00b3\7\u00b3\u0893\n\u00b3\f\u00b3\16\u00b3\u0896\13\u00b3\3\u00b3\5"+
		"\u00b3\u0899\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u089f\n\u00b3"+
		"\f\u00b3\16\u00b3\u08a2\13\u00b3\3\u00b3\7\u00b3\u08a5\n\u00b3\f\u00b3"+
		"\16\u00b3\u08a8\13\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\5\u00b3\u08b2\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u08bb\n\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u08c0\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\5\u00b3\u08ca\n\u00b3\3\u00b4\3\u00b4\3\u00b4\7\u00b4"+
		"\u08cf\n\u00b4\f\u00b4\16\u00b4\u08d2\13\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u08dc\n\u00b5\f\u00b5"+
		"\16\u00b5\u08df\13\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7"+
		"\5\u00b7\u08e7\n\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\7\u00b8"+
		"\u08ee\n\u00b8\f\u00b8\16\u00b8\u08f1\13\u00b8\3\u00b9\7\u00b9\u08f4\n"+
		"\u00b9\f\u00b9\16\u00b9\u08f7\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00ba\6\u00ba\u08ff\n\u00ba\r\u00ba\16\u00ba\u0900\3\u00ba"+
		"\6\u00ba\u0904\n\u00ba\r\u00ba\16\u00ba\u0905\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0912"+
		"\n\u00bb\3\u00bc\3\u00bc\5\u00bc\u0916\n\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u091a\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u091e\n\u00bc\5\u00bc\u0920\n\u00bc"+
		"\3\u00bd\3\u00bd\5\u00bd\u0924\n\u00bd\3\u00be\7\u00be\u0927\n\u00be\f"+
		"\u00be\16\u00be\u092a\13\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1"+
		"\7\u00c1\u093a\n\u00c1\f\u00c1\16\u00c1\u093d\13\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0950\n\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0960\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u098b\n\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u099d\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u09a5\n\u00c4\f\u00c4"+
		"\16\u00c4\u09a8\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u09bd\n\u00c5\5\u00c5\u09bf\n"+
		"\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6"+
		"\u09c8\n\u00c6\5\u00c6\u09ca\n\u00c6\3\u00c7\3\u00c7\5\u00c7\u09ce\n\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u09d3\n\u00c7\7\u00c7\u09d5\n\u00c7\f"+
		"\u00c7\16\u00c7\u09d8\13\u00c7\3\u00c7\5\u00c7\u09db\n\u00c7\3\u00c8\3"+
		"\u00c8\5\u00c8\u09df\n\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\7\u00c9\u09e7\n\u00c9\f\u00c9\16\u00c9\u09ea\13\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u09f3\n\u00c9\f"+
		"\u00c9\16\u00c9\u09f6\13\u00c9\3\u00c9\3\u00c9\7\u00c9\u09fa\n\u00c9\f"+
		"\u00c9\16\u00c9\u09fd\13\u00c9\5\u00c9\u09ff\n\u00c9\3\u00ca\3\u00ca\5"+
		"\u00ca\u0a03\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a0f\n\u00cd\3\u00ce\3\u00ce\3"+
		"\u00ce\5\u00ce\u0a14\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0a1a"+
		"\n\u00cf\5\u00cf\u0a1c\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0"+
		"\u0a22\n\u00d0\3\u00d1\3\u00d1\5\u00d1\u0a26\n\u00d1\3\u00d1\3\u00d1\3"+
		"\u00d1\2\4\u00ae\u0186\u00d2\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
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
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\2\23\6\2"+
		"!!--\61\61\64\64\b\2\3\3\16\16\24\24$&)*\61\61\n\2\5\5\7\7\n\n\20\20\26"+
		"\26\35\35\37\37((\4\2\23\23++\4\2\66\67DG\3\2`a\4\2bcgg\4\2QSY[\3\28;"+
		"\3\2>@\6\2\3\3\24\24$&)*\3\2^a\3\2TU\4\2RSYZ\4\2XX[[\4\2QQhr\3\2^_\u0b0b"+
		"\2\u01a3\3\2\2\2\4\u01b6\3\2\2\2\6\u01bd\3\2\2\2\b\u01e5\3\2\2\2\n\u01e9"+
		"\3\2\2\2\f\u01ed\3\2\2\2\16\u01f1\3\2\2\2\20\u01f3\3\2\2\2\22\u0202\3"+
		"\2\2\2\24\u020d\3\2\2\2\26\u0212\3\2\2\2\30\u021a\3\2\2\2\32\u022c\3\2"+
		"\2\2\34\u0237\3\2\2\2\36\u0241\3\2\2\2 \u0248\3\2\2\2\"\u0253\3\2\2\2"+
		"$\u025b\3\2\2\2&\u0264\3\2\2\2(\u0279\3\2\2\2*\u027b\3\2\2\2,\u0286\3"+
		"\2\2\2.\u028a\3\2\2\2\60\u02a0\3\2\2\2\62\u02a3\3\2\2\2\64\u02ab\3\2\2"+
		"\2\66\u02ae\3\2\2\28\u02be\3\2\2\2:\u02c8\3\2\2\2<\u02ca\3\2\2\2>\u02d3"+
		"\3\2\2\2@\u02d5\3\2\2\2B\u02d7\3\2\2\2D\u02d9\3\2\2\2F\u02e3\3\2\2\2H"+
		"\u02e5\3\2\2\2J\u02f5\3\2\2\2L\u02f7\3\2\2\2N\u02f9\3\2\2\2P\u030b\3\2"+
		"\2\2R\u030d\3\2\2\2T\u031b\3\2\2\2V\u031d\3\2\2\2X\u032e\3\2\2\2Z\u0330"+
		"\3\2\2\2\\\u0338\3\2\2\2^\u034b\3\2\2\2`\u0350\3\2\2\2b\u0359\3\2\2\2"+
		"d\u0360\3\2\2\2f\u0362\3\2\2\2h\u0364\3\2\2\2j\u036c\3\2\2\2l\u036e\3"+
		"\2\2\2n\u0378\3\2\2\2p\u037a\3\2\2\2r\u0382\3\2\2\2t\u0389\3\2\2\2v\u038b"+
		"\3\2\2\2x\u039b\3\2\2\2z\u03a0\3\2\2\2|\u03ca\3\2\2\2~\u03cc\3\2\2\2\u0080"+
		"\u03d2\3\2\2\2\u0082\u03da\3\2\2\2\u0084\u03dd\3\2\2\2\u0086\u03eb\3\2"+
		"\2\2\u0088\u03f0\3\2\2\2\u008a\u0477\3\2\2\2\u008c\u047f\3\2\2\2\u008e"+
		"\u0481\3\2\2\2\u0090\u048e\3\2\2\2\u0092\u0496\3\2\2\2\u0094\u0499\3\2"+
		"\2\2\u0096\u04a0\3\2\2\2\u0098\u04ab\3\2\2\2\u009a\u04b4\3\2\2\2\u009c"+
		"\u04c7\3\2\2\2\u009e\u04d5\3\2\2\2\u00a0\u04d9\3\2\2\2\u00a2\u04de\3\2"+
		"\2\2\u00a4\u04e6\3\2\2\2\u00a6\u04e8\3\2\2\2\u00a8\u04ec\3\2\2\2\u00aa"+
		"\u04f4\3\2\2\2\u00ac\u04f6\3\2\2\2\u00ae\u0507\3\2\2\2\u00b0\u0575\3\2"+
		"\2\2\u00b2\u0580\3\2\2\2\u00b4\u0591\3\2\2\2\u00b6\u0593\3\2\2\2\u00b8"+
		"\u0599\3\2\2\2\u00ba\u05b7\3\2\2\2\u00bc\u05bb\3\2\2\2\u00be\u05be\3\2"+
		"\2\2\u00c0\u05c5\3\2\2\2\u00c2\u05ca\3\2\2\2\u00c4\u05d2\3\2\2\2\u00c6"+
		"\u05d9\3\2\2\2\u00c8\u05db\3\2\2\2\u00ca\u05e1\3\2\2\2\u00cc\u05e5\3\2"+
		"\2\2\u00ce\u05e7\3\2\2\2\u00d0\u05ed\3\2\2\2\u00d2\u05ef\3\2\2\2\u00d4"+
		"\u05f2\3\2\2\2\u00d6\u0605\3\2\2\2\u00d8\u060c\3\2\2\2\u00da\u0634\3\2"+
		"\2\2\u00dc\u0638\3\2\2\2\u00de\u063c\3\2\2\2\u00e0\u0640\3\2\2\2\u00e2"+
		"\u0642\3\2\2\2\u00e4\u0651\3\2\2\2\u00e6\u065c\3\2\2\2\u00e8\u0661\3\2"+
		"\2\2\u00ea\u0669\3\2\2\2\u00ec\u067b\3\2\2\2\u00ee\u0686\3\2\2\2\u00f0"+
		"\u0690\3\2\2\2\u00f2\u0697\3\2\2\2\u00f4\u06a2\3\2\2\2\u00f6\u06aa\3\2"+
		"\2\2\u00f8\u06b3\3\2\2\2\u00fa\u06c8\3\2\2\2\u00fc\u06d3\3\2\2\2\u00fe"+
		"\u06d7\3\2\2\2\u0100\u06ea\3\2\2\2\u0102\u06ed\3\2\2\2\u0104\u06f5\3\2"+
		"\2\2\u0106\u06f8\3\2\2\2\u0108\u0704\3\2\2\2\u010a\u070d\3\2\2\2\u010c"+
		"\u070f\3\2\2\2\u010e\u071a\3\2\2\2\u0110\u0727\3\2\2\2\u0112\u0738\3\2"+
		"\2\2\u0114\u073b\3\2\2\2\u0116\u0743\3\2\2\2\u0118\u0748\3\2\2\2\u011a"+
		"\u0752\3\2\2\2\u011c\u0754\3\2\2\2\u011e\u0764\3\2\2\2\u0120\u0766\3\2"+
		"\2\2\u0122\u0768\3\2\2\2\u0124\u077a\3\2\2\2\u0126\u077c\3\2\2\2\u0128"+
		"\u078a\3\2\2\2\u012a\u078c\3\2\2\2\u012c\u079d\3\2\2\2\u012e\u079f\3\2"+
		"\2\2\u0130\u07a7\3\2\2\2\u0132\u07ba\3\2\2\2\u0134\u07bf\3\2\2\2\u0136"+
		"\u07c8\3\2\2\2\u0138\u07cf\3\2\2\2\u013a\u07d1\3\2\2\2\u013c\u07d3\3\2"+
		"\2\2\u013e\u07db\3\2\2\2\u0140\u07dd\3\2\2\2\u0142\u07e7\3\2\2\2\u0144"+
		"\u07e9\3\2\2\2\u0146\u07f1\3\2\2\2\u0148\u07f8\3\2\2\2\u014a\u07fa\3\2"+
		"\2\2\u014c\u080a\3\2\2\2\u014e\u080f\3\2\2\2\u0150\u0820\3\2\2\2\u0152"+
		"\u0836\3\2\2\2\u0154\u083a\3\2\2\2\u0156\u083c\3\2\2\2\u0158\u0842\3\2"+
		"\2\2\u015a\u0844\3\2\2\2\u015c\u0847\3\2\2\2\u015e\u0853\3\2\2\2\u0160"+
		"\u0855\3\2\2\2\u0162\u085b\3\2\2\2\u0164\u08c9\3\2\2\2\u0166\u08cb\3\2"+
		"\2\2\u0168\u08d8\3\2\2\2\u016a\u08e0\3\2\2\2\u016c\u08e3\3\2\2\2\u016e"+
		"\u08ea\3\2\2\2\u0170\u08f5\3\2\2\2\u0172\u08fe\3\2\2\2\u0174\u0911\3\2"+
		"\2\2\u0176\u091f\3\2\2\2\u0178\u0923\3\2\2\2\u017a\u0928\3\2\2\2\u017c"+
		"\u0930\3\2\2\2\u017e\u0932\3\2\2\2\u0180\u0936\3\2\2\2\u0182\u093e\3\2"+
		"\2\2\u0184\u0940\3\2\2\2\u0186\u094f\3\2\2\2\u0188\u09be\3\2\2\2\u018a"+
		"\u09c9\3\2\2\2\u018c\u09da\3\2\2\2\u018e\u09dc\3\2\2\2\u0190\u09e2\3\2"+
		"\2\2\u0192\u0a00\3\2\2\2\u0194\u0a04\3\2\2\2\u0196\u0a07\3\2\2\2\u0198"+
		"\u0a0e\3\2\2\2\u019a\u0a13\3\2\2\2\u019c\u0a1b\3\2\2\2\u019e\u0a21\3\2"+
		"\2\2\u01a0\u0a23\3\2\2\2\u01a2\u01a4\5\4\3\2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a7\5\6\4\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ae\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\5\b\5\2\u01ac\u01ab\3\2"+
		"\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\2\2\3\u01b2\3\3\2\2\2"+
		"\u01b3\u01b5\5l\67\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01ba\7#\2\2\u01ba\u01bb\5h\65\2\u01bb\u01bc\7N\2\2\u01bc\5\3\2\2\2\u01bd"+
		"\u01bf\7\33\2\2\u01be\u01c0\7)\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\5h\65\2\u01c2\u01c3\7P\2\2\u01c3"+
		"\u01c5\7b\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c7\7N\2\2\u01c7\7\3\2\2\2\u01c8\u01ca\5\f\7\2\u01c9\u01c8"+
		"\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01e6\5\20\t\2\u01cf\u01d1\5"+
		"\f\7\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01e6\5\30"+
		"\r\2\u01d6\u01d8\5\f\7\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2"+
		"\2\2\u01dc\u01e6\5 \21\2\u01dd\u01df\5\f\7\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\5x=\2\u01e4\u01e6\7N\2\2\u01e5\u01cb"+
		"\3\2\2\2\u01e5\u01d2\3\2\2\2\u01e5\u01d9\3\2\2\2\u01e5\u01e0\3\2\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6\t\3\2\2\2\u01e7\u01ea\5\f\7\2\u01e8\u01ea\t\2\2\2"+
		"\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\13\3\2\2\2\u01eb\u01ee"+
		"\5l\67\2\u01ec\u01ee\t\3\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"\r\3\2\2\2\u01ef\u01f2\7\24\2\2\u01f0\u01f2\5l\67\2\u01f1\u01ef\3\2\2"+
		"\2\u01f1\u01f0\3\2\2\2\u01f2\17\3\2\2\2\u01f3\u01f4\7\13\2\2\u01f4\u01f6"+
		"\7<\2\2\u01f5\u01f7\5\22\n\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01fa\3\2\2\2\u01f8\u01f9\7\23\2\2\u01f9\u01fb\5P)\2\u01fa\u01f8\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fd\7\32\2\2\u01fd"+
		"\u01ff\5\"\22\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3"+
		"\2\2\2\u0200\u0201\5$\23\2\u0201\21\3\2\2\2\u0202\u0203\7S\2\2\u0203\u0208"+
		"\5\24\13\2\u0204\u0205\7O\2\2\u0205\u0207\5\24\13\2\u0206\u0204\3\2\2"+
		"\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7R\2\2\u020c\23\3\2\2\2\u020d"+
		"\u0210\7<\2\2\u020e\u020f\7\23\2\2\u020f\u0211\5\26\f\2\u0210\u020e\3"+
		"\2\2\2\u0210\u0211\3\2\2\2\u0211\25\3\2\2\2\u0212\u0217\5P)\2\u0213\u0214"+
		"\7d\2\2\u0214\u0216\5P)\2\u0215\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\27\3\2\2\2\u0219\u0217\3\2\2"+
		"\2\u021a\u021b\7\22\2\2\u021b\u021e\7<\2\2\u021c\u021d\7\32\2\2\u021d"+
		"\u021f\5\"\22\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3"+
		"\2\2\2\u0220\u0222\7J\2\2\u0221\u0223\5\32\16\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0226\7O\2\2\u0225\u0224\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0229\5\36\20\2\u0228"+
		"\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7K"+
		"\2\2\u022b\31\3\2\2\2\u022c\u0231\5\34\17\2\u022d\u022e\7O\2\2\u022e\u0230"+
		"\5\34\17\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2"+
		"\u0231\u0232\3\2\2\2\u0232\33\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0236"+
		"\5l\67\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023c\7<"+
		"\2\2\u023b\u023d\5\u00c8e\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u0240\5$\23\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\35\3\2\2\2\u0241\u0245\7N\2\2\u0242\u0244\5(\25\2\u0243\u0242"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\37\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7\36\2\2\u0249\u024b\7<\2"+
		"\2\u024a\u024c\5\22\n\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024f\3\2\2\2\u024d\u024e\7\23\2\2\u024e\u0250\5\"\22\2\u024f\u024d\3"+
		"\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5&\24\2\u0252"+
		"!\3\2\2\2\u0253\u0258\5P)\2\u0254\u0255\7O\2\2\u0255\u0257\5P)\2\u0256"+
		"\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259#\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025f\7J\2\2\u025c\u025e"+
		"\5(\25\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\7K"+
		"\2\2\u0263%\3\2\2\2\u0264\u0268\7J\2\2\u0265\u0267\5:\36\2\u0266\u0265"+
		"\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\7K\2\2\u026c\'\3\2\2\2"+
		"\u026d\u027a\7N\2\2\u026e\u0270\7)\2\2\u026f\u026e\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u027a\5*\26\2\u0272\u0274\5\n\6\2\u0273"+
		"\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u027a\5,\27\2\u0279"+
		"\u026d\3\2\2\2\u0279\u026f\3\2\2\2\u0279\u0275\3\2\2\2\u027a)\3\2\2\2"+
		"\u027b\u027c\5\u0084C\2\u027c+\3\2\2\2\u027d\u0287\5.\30\2\u027e\u0287"+
		"\5\60\31\2\u027f\u0287\5\66\34\2\u0280\u0287\5\62\32\2\u0281\u0287\5\64"+
		"\33\2\u0282\u0287\5 \21\2\u0283\u0287\5x=\2\u0284\u0287\5\20\t\2\u0285"+
		"\u0287\5\30\r\2\u0286\u027d\3\2\2\2\u0286\u027e\3\2\2\2\u0286\u027f\3"+
		"\2\2\2\u0286\u0280\3\2\2\2\u0286\u0281\3\2\2\2\u0286\u0282\3\2\2\2\u0286"+
		"\u0283\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287-\3\2\2\2"+
		"\u0288\u028b\5P)\2\u0289\u028b\7\63\2\2\u028a\u0288\3\2\2\2\u028a\u0289"+
		"\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\7<\2\2\u028d\u0292\5\\/\2\u028e"+
		"\u028f\7L\2\2\u028f\u0291\7M\2\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2"+
		"\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0297\3\2\2\2\u0294\u0292"+
		"\3\2\2\2\u0295\u0296\7\60\2\2\u0296\u0298\5Z.\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u029c\5d\63\2\u029a\u029c\7N"+
		"\2\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029c\u029e\3\2\2\2\u029d"+
		"\u029f\5\u00caf\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f/\3\2\2"+
		"\2\u02a0\u02a1\5\22\n\2\u02a1\u02a2\5.\30\2\u02a2\61\3\2\2\2\u02a3\u02a4"+
		"\7<\2\2\u02a4\u02a7\5\\/\2\u02a5\u02a6\7\60\2\2\u02a6\u02a8\5Z.\2\u02a7"+
		"\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\5f"+
		"\64\2\u02aa\63\3\2\2\2\u02ab\u02ac\5\22\n\2\u02ac\u02ad\5\62\32\2\u02ad"+
		"\65\3\2\2\2\u02ae\u02af\5P)\2\u02af\u02b4\58\35\2\u02b0\u02b1\7O\2\2\u02b1"+
		"\u02b3\58\35\2\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02b8\7N\2\2\u02b8\67\3\2\2\2\u02b9\u02ba\5\u00ccg\2\u02ba\u02bb\7Q\2"+
		"\2\u02bb\u02bc\5F$\2\u02bc\u02bf\3\2\2\2\u02bd\u02bf\5\u00ccg\2\u02be"+
		"\u02b9\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf9\3\2\2\2\u02c0\u02c9\7N\2\2\u02c1"+
		"\u02c3\5\n\6\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2"+
		"\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7"+
		"\u02c9\5,\27\2\u02c8\u02c0\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9;\3\2\2\2"+
		"\u02ca\u02cb\5D#\2\u02cb\u02cc\7Q\2\2\u02cc\u02cd\5F$\2\u02cd=\3\2\2\2"+
		"\u02ce\u02cf\5@!\2\u02cf\u02d0\7Q\2\2\u02d0\u02d1\5F$\2\u02d1\u02d4\3"+
		"\2\2\2\u02d2\u02d4\5B\"\2\u02d3\u02ce\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"?\3\2\2\2\u02d5\u02d6\5\u00ccg\2\u02d6A\3\2\2\2\u02d7\u02d8\5\u00ccg\2"+
		"\u02d8C\3\2\2\2\u02d9\u02de\5\u00ceh\2\u02da\u02db\7L\2\2\u02db\u02dd"+
		"\7M\2\2\u02dc\u02da\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02dfE\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\5H%\2\u02e2"+
		"\u02e4\5\u00acW\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e4G\3\2\2"+
		"\2\u02e5\u02f1\7J\2\2\u02e6\u02eb\5F$\2\u02e7\u02e8\7O\2\2\u02e8\u02ea"+
		"\5F$\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02f0\7O"+
		"\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1"+
		"\u02e6\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\7K"+
		"\2\2\u02f4I\3\2\2\2\u02f5\u02f6\5h\65\2\u02f6K\3\2\2\2\u02f7\u02f8\7<"+
		"\2\2\u02f8M\3\2\2\2\u02f9\u02fa\5h\65\2\u02faO\3\2\2\2\u02fb\u0300\5R"+
		"*\2\u02fc\u02fd\7L\2\2\u02fd\u02ff\7M\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0302"+
		"\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u030c\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0303\u0308\5T+\2\u0304\u0305\7L\2\2\u0305\u0307\7M\2\2"+
		"\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u02fb\3\2\2\2\u030b"+
		"\u0303\3\2\2\2\u030cQ\3\2\2\2\u030d\u030f\7<\2\2\u030e\u0310\5V,\2\u030f"+
		"\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0318\3\2\2\2\u0311\u0312\7P"+
		"\2\2\u0312\u0314\7<\2\2\u0313\u0315\5V,\2\u0314\u0313\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0311\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319S\3\2\2\2\u031a\u0318\3\2\2\2"+
		"\u031b\u031c\t\4\2\2\u031cU\3\2\2\2\u031d\u031e\7S\2\2\u031e\u0323\5X"+
		"-\2\u031f\u0320\7O\2\2\u0320\u0322\5X-\2\u0321\u031f\3\2\2\2\u0322\u0325"+
		"\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0326\u0327\7R\2\2\u0327W\3\2\2\2\u0328\u032f\5P)\2\u0329"+
		"\u032c\7V\2\2\u032a\u032b\t\5\2\2\u032b\u032d\5P)\2\u032c\u032a\3\2\2"+
		"\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u0328\3\2\2\2\u032e\u0329"+
		"\3\2\2\2\u032fY\3\2\2\2\u0330\u0335\5h\65\2\u0331\u0332\7O\2\2\u0332\u0334"+
		"\5h\65\2\u0333\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336[\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033a\7H\2\2\u0339"+
		"\u033b\5^\60\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2"+
		"\2\2\u033c\u033d\7I\2\2\u033d]\3\2\2\2\u033e\u0343\5`\61\2\u033f\u0340"+
		"\7O\2\2\u0340\u0342\5`\61\2\u0341\u033f\3\2\2\2\u0342\u0345\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0348\3\2\2\2\u0345\u0343\3\2"+
		"\2\2\u0346\u0347\7O\2\2\u0347\u0349\5b\62\2\u0348\u0346\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u034c\5b\62\2\u034b\u033e\3\2"+
		"\2\2\u034b\u034a\3\2\2\2\u034c_\3\2\2\2\u034d\u034f\5\16\b\2\u034e\u034d"+
		"\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\5P)\2\u0354\u0355\5@!\2"+
		"\u0355a\3\2\2\2\u0356\u0358\5\16\b\2\u0357\u0356\3\2\2\2\u0358\u035b\3"+
		"\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b"+
		"\u0359\3\2\2\2\u035c\u035d\5P)\2\u035d\u035e\7t\2\2\u035e\u035f\5@!\2"+
		"\u035fc\3\2\2\2\u0360\u0361\5\u0084C\2\u0361e\3\2\2\2\u0362\u0363\5\u0084"+
		"C\2\u0363g\3\2\2\2\u0364\u0369\5\u00ceh\2\u0365\u0366\7P\2\2\u0366\u0368"+
		"\5\u00ceh\2\u0367\u0365\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2"+
		"\2\u0369\u036a\3\2\2\2\u036ai\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d"+
		"\t\6\2\2\u036dk\3\2\2\2\u036e\u036f\7s\2\2\u036f\u0376\5n8\2\u0370\u0373"+
		"\7H\2\2\u0371\u0374\5p9\2\u0372\u0374\5t;\2\u0373\u0371\3\2\2\2\u0373"+
		"\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377\7I"+
		"\2\2\u0376\u0370\3\2\2\2\u0376\u0377\3\2\2\2\u0377m\3\2\2\2\u0378\u0379"+
		"\5h\65\2\u0379o\3\2\2\2\u037a\u037f\5r:\2\u037b\u037c\7O\2\2\u037c\u037e"+
		"\5r:\2\u037d\u037b\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380q\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0383\7<\2\2\u0383"+
		"\u0384\7Q\2\2\u0384\u0385\5t;\2\u0385s\3\2\2\2\u0386\u038a\5\u00acW\2"+
		"\u0387\u038a\5l\67\2\u0388\u038a\5v<\2\u0389\u0386\3\2\2\2\u0389\u0387"+
		"\3\2\2\2\u0389\u0388\3\2\2\2\u038au\3\2\2\2\u038b\u0394\7J\2\2\u038c\u0391"+
		"\5t;\2\u038d\u038e\7O\2\2\u038e\u0390\5t;\2\u038f\u038d\3\2\2\2\u0390"+
		"\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0395\3\2"+
		"\2\2\u0393\u0391\3\2\2\2\u0394\u038c\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0397\3\2\2\2\u0396\u0398\7O\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2"+
		"\2\2\u0398\u0399\3\2\2\2\u0399\u039a\7K\2\2\u039aw\3\2\2\2\u039b\u039c"+
		"\7s\2\2\u039c\u039d\7\36\2\2\u039d\u039e\7<\2\2\u039e\u039f\5z>\2\u039f"+
		"y\3\2\2\2\u03a0\u03a4\7J\2\2\u03a1\u03a3\5|?\2\u03a2\u03a1\3\2\2\2\u03a3"+
		"\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2"+
		"\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a8\7K\2\2\u03a8{\3\2\2\2\u03a9\u03cb"+
		"\7N\2\2\u03aa\u03ac\5\n\6\2\u03ab\u03aa\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03c8\3\2\2\2\u03af\u03ad\3\2"+
		"\2\2\u03b0\u03b1\5P)\2\u03b1\u03b2\5~@\2\u03b2\u03b3\7N\2\2\u03b3\u03c9"+
		"\3\2\2\2\u03b4\u03b5\5P)\2\u03b5\u03b6\5\u0080A\2\u03b6\u03b7\7N\2\2\u03b7"+
		"\u03c9\3\2\2\2\u03b8\u03ba\5\20\t\2\u03b9\u03bb\7N\2\2\u03ba\u03b9\3\2"+
		"\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c9\3\2\2\2\u03bc\u03be\5 \21\2\u03bd"+
		"\u03bf\7N\2\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c9\3\2"+
		"\2\2\u03c0\u03c2\5\30\r\2\u03c1\u03c3\7N\2\2\u03c2\u03c1\3\2\2\2\u03c2"+
		"\u03c3\3\2\2\2\u03c3\u03c9\3\2\2\2\u03c4\u03c6\5x=\2\u03c5\u03c7\7N\2"+
		"\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03b0"+
		"\3\2\2\2\u03c8\u03b4\3\2\2\2\u03c8\u03b8\3\2\2\2\u03c8\u03bc\3\2\2\2\u03c8"+
		"\u03c0\3\2\2\2\u03c8\u03c4\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03a9\3\2"+
		"\2\2\u03ca\u03ad\3\2\2\2\u03cb}\3\2\2\2\u03cc\u03cd\7<\2\2\u03cd\u03ce"+
		"\7H\2\2\u03ce\u03d0\7I\2\2\u03cf\u03d1\5\u0082B\2\u03d0\u03cf\3\2\2\2"+
		"\u03d0\u03d1\3\2\2\2\u03d1\177\3\2\2\2\u03d2\u03d7\5<\37\2\u03d3\u03d4"+
		"\7O\2\2\u03d4\u03d6\5<\37\2\u03d5\u03d3\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u0081\3\2\2\2\u03d9\u03d7\3\2"+
		"\2\2\u03da\u03db\7\16\2\2\u03db\u03dc\5t;\2\u03dc\u0083\3\2\2\2\u03dd"+
		"\u03e1\7J\2\2\u03de\u03e0\5\u0086D\2\u03df\u03de\3\2\2\2\u03e0\u03e3\3"+
		"\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e4\u03e5\7K\2\2\u03e5\u0085\3\2\2\2\u03e6\u03e7\5\u0088"+
		"E\2\u03e7\u03e8\7N\2\2\u03e8\u03ec\3\2\2\2\u03e9\u03ec\5\u008aF\2\u03ea"+
		"\u03ec\5\b\5\2\u03eb\u03e6\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2"+
		"\2\2\u03ec\u0087\3\2\2\2\u03ed\u03ef\5\16\b\2\u03ee\u03ed\3\2\2\2\u03ef"+
		"\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\3\2"+
		"\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\5P)\2\u03f4\u03f9\5> \2\u03f5\u03f6"+
		"\7O\2\2\u03f6\u03f8\5> \2\u03f7\u03f5\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9"+
		"\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0089\3\2\2\2\u03fb\u03f9\3\2"+
		"\2\2\u03fc\u0478\5\u0084C\2\u03fd\u03fe\7\4\2\2\u03fe\u0401\5\u00acW\2"+
		"\u03ff\u0400\7W\2\2\u0400\u0402\5\u00acW\2\u0401\u03ff\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\7N\2\2\u0404\u0478\3\2\2\2\u0405"+
		"\u0406\7\30\2\2\u0406\u0407\5\u00a6T\2\u0407\u040a\5\u008aF\2\u0408\u0409"+
		"\7\21\2\2\u0409\u040b\5\u008aF\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2"+
		"\2\u040b\u0478\3\2\2\2\u040c\u040d\7\27\2\2\u040d\u040e\7H\2\2\u040e\u040f"+
		"\5\u009eP\2\u040f\u0410\7I\2\2\u0410\u0411\5\u008aF\2\u0411\u0478\3\2"+
		"\2\2\u0412\u0413\7\65\2\2\u0413\u0414\5\u00a6T\2\u0414\u0415\5\u008aF"+
		"\2\u0415\u0478\3\2\2\2\u0416\u0417\7\17\2\2\u0417\u0418\5\u008aF\2\u0418"+
		"\u0419\7\65\2\2\u0419\u041a\5\u00a6T\2\u041a\u041b\7N\2\2\u041b\u0478"+
		"\3\2\2\2\u041c\u041d\7\62\2\2\u041d\u0427\5\u0084C\2\u041e\u0420\5\u008e"+
		"H\2\u041f\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u041f\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423\u0425\5\u0092J\2\u0424\u0423"+
		"\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0428\5\u0092J"+
		"\2\u0427\u041f\3\2\2\2\u0427\u0426\3\2\2\2\u0428\u0478\3\2\2\2\u0429\u042a"+
		"\7\62\2\2\u042a\u042b\5\u0094K\2\u042b\u042f\5\u0084C\2\u042c\u042e\5"+
		"\u008eH\2\u042d\u042c\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2"+
		"\u042f\u0430\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0434"+
		"\5\u0092J\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0478\3\2\2"+
		"\2\u0435\u0436\7,\2\2\u0436\u0437\5\u00a6T\2\u0437\u043b\7J\2\2\u0438"+
		"\u043a\5\u009aN\2\u0439\u0438\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439"+
		"\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0441\3\2\2\2\u043d\u043b\3\2\2\2\u043e"+
		"\u0440\5\u009cO\2\u043f\u043e\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u043f"+
		"\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0441\3\2\2\2\u0444"+
		"\u0445\7K\2\2\u0445\u0478\3\2\2\2\u0446\u0447\7-\2\2\u0447\u0448\5\u00a6"+
		"T\2\u0448\u0449\5\u0084C\2\u0449\u0478\3\2\2\2\u044a\u044c\7\'\2\2\u044b"+
		"\u044d\5\u00acW\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e"+
		"\3\2\2\2\u044e\u0478\7N\2\2\u044f\u0450\7/\2\2\u0450\u0451\5\u00acW\2"+
		"\u0451\u0452\7N\2\2\u0452\u0478\3\2\2\2\u0453\u0455\7\6\2\2\u0454\u0456"+
		"\7<\2\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457"+
		"\u0478\7N\2\2\u0458\u045a\7\r\2\2\u0459\u045b\7<\2\2\u045a\u0459\3\2\2"+
		"\2\u045a\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u0478\7N\2\2\u045d\u0478"+
		"\7N\2\2\u045e\u045f\5\u008cG\2\u045f\u0460\7Q\2\2\u0460\u0461\5\u00ac"+
		"W\2\u0461\u0462\7N\2\2\u0462\u0478\3\2\2\2\u0463\u0464\5\u00acW\2\u0464"+
		"\u0466\7H\2\2\u0465\u0467\5\u00a8U\2\u0466\u0465\3\2\2\2\u0466\u0467\3"+
		"\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\7I\2\2\u0469\u046a\7N\2\2\u046a"+
		"\u0478\3\2\2\2\u046b\u046c\5\u00acW\2\u046c\u046d\7P\2\2\u046d\u046f\7"+
		"\"\2\2\u046e\u0470\5\u00be`\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2"+
		"\u0470\u0471\3\2\2\2\u0471\u0472\5\u00b6\\\2\u0472\u0478\3\2\2\2\u0473"+
		"\u0474\7<\2\2\u0474\u0475\7W\2\2\u0475\u0478\5\u008aF\2\u0476\u0478\5"+
		"\u00caf\2\u0477\u03fc\3\2\2\2\u0477\u03fd\3\2\2\2\u0477\u0405\3\2\2\2"+
		"\u0477\u040c\3\2\2\2\u0477\u0412\3\2\2\2\u0477\u0416\3\2\2\2\u0477\u041c"+
		"\3\2\2\2\u0477\u0429\3\2\2\2\u0477\u0435\3\2\2\2\u0477\u0446\3\2\2\2\u0477"+
		"\u044a\3\2\2\2\u0477\u044f\3\2\2\2\u0477\u0453\3\2\2\2\u0477\u0458\3\2"+
		"\2\2\u0477\u045d\3\2\2\2\u0477\u045e\3\2\2\2\u0477\u0463\3\2\2\2\u0477"+
		"\u046b\3\2\2\2\u0477\u0473\3\2\2\2\u0477\u0476\3\2\2\2\u0478\u008b\3\2"+
		"\2\2\u0479\u047a\5\u00acW\2\u047a\u047b\7L\2\2\u047b\u047c\5\u00acW\2"+
		"\u047c\u047d\7M\2\2\u047d\u0480\3\2\2\2\u047e\u0480\5\u00ceh\2\u047f\u0479"+
		"\3\2\2\2\u047f\u047e\3\2\2\2\u0480\u008d\3\2\2\2\u0481\u0482\7\t\2\2\u0482"+
		"\u0486\7H\2\2\u0483\u0485\5\16\b\2\u0484\u0483\3\2\2\2\u0485\u0488\3\2"+
		"\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\3\2\2\2\u0488"+
		"\u0486\3\2\2\2\u0489\u048a\5\u0090I\2\u048a\u048b\5\u00ceh\2\u048b\u048c"+
		"\7I\2\2\u048c\u048d\5\u0084C\2\u048d\u008f\3\2\2\2\u048e\u0493\5h\65\2"+
		"\u048f\u0490\7e\2\2\u0490\u0492\5h\65\2\u0491\u048f\3\2\2\2\u0492\u0495"+
		"\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0091\3\2\2\2\u0495"+
		"\u0493\3\2\2\2\u0496\u0497\7\25\2\2\u0497\u0498\5\u0084C\2\u0498\u0093"+
		"\3\2\2\2\u0499\u049a\7H\2\2\u049a\u049c\5\u0096L\2\u049b\u049d\7N\2\2"+
		"\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f"+
		"\7I\2\2\u049f\u0095\3\2\2\2\u04a0\u04a5\5\u0098M\2\u04a1\u04a2\7N\2\2"+
		"\u04a2\u04a4\5\u0098M\2\u04a3\u04a1\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u0097\3\2\2\2\u04a7\u04a5\3\2"+
		"\2\2\u04a8\u04aa\5\16\b\2\u04a9\u04a8\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab"+
		"\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04ab\3\2"+
		"\2\2\u04ae\u04af\5R*\2\u04af\u04b0\5@!\2\u04b0\u04b1\7Q\2\2\u04b1\u04b2"+
		"\5\u00acW\2\u04b2\u0099\3\2\2\2\u04b3\u04b5\5\u009cO\2\u04b4\u04b3\3\2"+
		"\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04b9\3\2\2\2\u04b8\u04ba\5\u0086D\2\u04b9\u04b8\3\2\2\2\u04ba\u04bb"+
		"\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u009b\3\2\2\2\u04bd"+
		"\u04be\7\b\2\2\u04be\u04bf\5\u00aaV\2\u04bf\u04c0\7W\2\2\u04c0\u04c8\3"+
		"\2\2\2\u04c1\u04c2\7\b\2\2\u04c2\u04c3\5L\'\2\u04c3\u04c4\7W\2\2\u04c4"+
		"\u04c8\3\2\2\2\u04c5\u04c6\7\16\2\2\u04c6\u04c8\7W\2\2\u04c7\u04bd\3\2"+
		"\2\2\u04c7\u04c1\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8\u009d\3\2\2\2\u04c9"+
		"\u04d6\5\u00a2R\2\u04ca\u04cc\5\u00a0Q\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc"+
		"\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04cf\7N\2\2\u04ce\u04d0\5\u00acW\2"+
		"\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3"+
		"\7N\2\2\u04d2\u04d4\5\u00a4S\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2"+
		"\u04d4\u04d6\3\2\2\2\u04d5\u04c9\3\2\2\2\u04d5\u04cb\3\2\2\2\u04d6\u009f"+
		"\3\2\2\2\u04d7\u04da\5\u0088E\2\u04d8\u04da\5\u00a8U\2\u04d9\u04d7\3\2"+
		"\2\2\u04d9\u04d8\3\2\2\2\u04da\u00a1\3\2\2\2\u04db\u04dd\5\16\b\2\u04dc"+
		"\u04db\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2"+
		"\2\2\u04df\u04e1\3\2\2\2\u04e0\u04de\3\2\2\2\u04e1\u04e2\5P)\2\u04e2\u04e3"+
		"\5\u00ceh\2\u04e3\u04e4\7W\2\2\u04e4\u04e5\5\u00acW\2\u04e5\u00a3\3\2"+
		"\2\2\u04e6\u04e7\5\u00a8U\2\u04e7\u00a5\3\2\2\2\u04e8\u04e9\7H\2\2\u04e9"+
		"\u04ea\5\u00acW\2\u04ea\u04eb\7I\2\2\u04eb\u00a7\3\2\2\2\u04ec\u04f1\5"+
		"\u00acW\2\u04ed\u04ee\7O\2\2\u04ee\u04f0\5\u00acW\2\u04ef\u04ed\3\2\2"+
		"\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u00a9"+
		"\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f5\5\u00acW\2\u04f5\u00ab\3\2\2"+
		"\2\u04f6\u04f7\5\u00aeX\2\u04f7\u00ad\3\2\2\2\u04f8\u04f9\bX\1\2\u04f9"+
		"\u0508\5\u00b0Y\2\u04fa\u04fb\7\"\2\2\u04fb\u0508\5\u00b2Z\2\u04fc\u04fd"+
		"\7H\2\2\u04fd\u04fe\5P)\2\u04fe\u04ff\7I\2\2\u04ff\u0500\5\u00aeX\22\u0500"+
		"\u0508\3\2\2\2\u0501\u0502\t\7\2\2\u0502\u0508\5\u00aeX\21\u0503\u0504"+
		"\7U\2\2\u0504\u0508\5\u00aeX\20\u0505\u0506\7T\2\2\u0506\u0508\5\u00ae"+
		"X\17\u0507\u04f8\3\2\2\2\u0507\u04fa\3\2\2\2\u0507\u04fc\3\2\2\2\u0507"+
		"\u0501\3\2\2\2\u0507\u0503\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u0560\3\2"+
		"\2\2\u0509\u050a\f\16\2\2\u050a\u050b\t\b\2\2\u050b\u055f\5\u00aeX\17"+
		"\u050c\u050d\f\r\2\2\u050d\u050e\t\7\2\2\u050e\u055f\5\u00aeX\16\u050f"+
		"\u0517\f\f\2\2\u0510\u0511\7S\2\2\u0511\u0518\7S\2\2\u0512\u0513\7R\2"+
		"\2\u0513\u0514\7R\2\2\u0514\u0518\7R\2\2\u0515\u0516\7R\2\2\u0516\u0518"+
		"\7R\2\2\u0517\u0510\3\2\2\2\u0517\u0512\3\2\2\2\u0517\u0515\3\2\2\2\u0518"+
		"\u0519\3\2\2\2\u0519\u055f\5\u00aeX\r\u051a\u051b\f\13\2\2\u051b\u051c"+
		"\t\t\2\2\u051c\u055f\5\u00aeX\f\u051d\u051e\f\t\2\2\u051e\u051f\7d\2\2"+
		"\u051f\u055f\5\u00aeX\n\u0520\u0521\f\b\2\2\u0521\u0522\7f\2\2\u0522\u055f"+
		"\5\u00aeX\t\u0523\u0524\f\7\2\2\u0524\u0525\7e\2\2\u0525\u055f\5\u00ae"+
		"X\b\u0526\u0527\f\6\2\2\u0527\u0528\7\\\2\2\u0528\u055f\5\u00aeX\7\u0529"+
		"\u052a\f\5\2\2\u052a\u052b\7]\2\2\u052b\u055f\5\u00aeX\6\u052c\u052d\f"+
		"\4\2\2\u052d\u052e\7V\2\2\u052e\u052f\5\u00aeX\2\u052f\u0530\7W\2\2\u0530"+
		"\u0531\5\u00aeX\5\u0531\u055f\3\2\2\2\u0532\u0533\f\3\2\2\u0533\u0534"+
		"\t\n\2\2\u0534\u055f\5\u00aeX\4\u0535\u0536\f\32\2\2\u0536\u0537\7P\2"+
		"\2\u0537\u055f\5\u00ceh\2\u0538\u0539\f\31\2\2\u0539\u053a\7P\2\2\u053a"+
		"\u055f\7.\2\2\u053b\u053c\f\30\2\2\u053c\u053d\7P\2\2\u053d\u053f\7\""+
		"\2\2\u053e\u0540\5\u00be`\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u055f\5\u00b6\\\2\u0542\u0543\f\27\2\2\u0543\u0544"+
		"\7P\2\2\u0544\u0545\7+\2\2\u0545\u055f\5\u00c4c\2\u0546\u0547\f\26\2\2"+
		"\u0547\u0548\7P\2\2\u0548\u055f\5\u00bc_\2\u0549\u054a\f\25\2\2\u054a"+
		"\u054b\7L\2\2\u054b\u054c\5\u00aeX\2\u054c\u054d\7M\2\2\u054d\u055f\3"+
		"\2\2\2\u054e\u054f\f\24\2\2\u054f\u0558\7H\2\2\u0550\u0555\5\u00aeX\2"+
		"\u0551\u0552\7O\2\2\u0552\u0554\5\u00aeX\2\u0553\u0551\3\2\2\2\u0554\u0557"+
		"\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0559\3\2\2\2\u0557"+
		"\u0555\3\2\2\2\u0558\u0550\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a\3\2"+
		"\2\2\u055a\u055f\7I\2\2\u055b\u055c\f\n\2\2\u055c\u055d\7\34\2\2\u055d"+
		"\u055f\5P)\2\u055e\u0509\3\2\2\2\u055e\u050c\3\2\2\2\u055e\u050f\3\2\2"+
		"\2\u055e\u051a\3\2\2\2\u055e\u051d\3\2\2\2\u055e\u0520\3\2\2\2\u055e\u0523"+
		"\3\2\2\2\u055e\u0526\3\2\2\2\u055e\u0529\3\2\2\2\u055e\u052c\3\2\2\2\u055e"+
		"\u0532\3\2\2\2\u055e\u0535\3\2\2\2\u055e\u0538\3\2\2\2\u055e\u053b\3\2"+
		"\2\2\u055e\u0542\3\2\2\2\u055e\u0546\3\2\2\2\u055e\u0549\3\2\2\2\u055e"+
		"\u054e\3\2\2\2\u055e\u055b\3\2\2\2\u055f\u0562\3\2\2\2\u0560\u055e\3\2"+
		"\2\2\u0560\u0561\3\2\2\2\u0561\u00af\3\2\2\2\u0562\u0560\3\2\2\2\u0563"+
		"\u0576\5\u00a6T\2\u0564\u0576\7.\2\2\u0565\u0576\7+\2\2\u0566\u0576\5"+
		"j\66\2\u0567\u0576\5\u00ceh\2\u0568\u0569\5P)\2\u0569\u056a\7P\2\2\u056a"+
		"\u056b\7\13\2\2\u056b\u0576\3\2\2\2\u056c\u056d\7\63\2\2\u056d\u056e\7"+
		"P\2\2\u056e\u0576\7\13\2\2\u056f\u0573\5\u00be`\2\u0570\u0574\5\u00c6"+
		"d\2\u0571\u0572\7.\2\2\u0572\u0574\5\u00c8e\2\u0573\u0570\3\2\2\2\u0573"+
		"\u0571\3\2\2\2\u0574\u0576\3\2\2\2\u0575\u0563\3\2\2\2\u0575\u0564\3\2"+
		"\2\2\u0575\u0565\3\2\2\2\u0575\u0566\3\2\2\2\u0575\u0567\3\2\2\2\u0575"+
		"\u0568\3\2\2\2\u0575\u056c\3\2\2\2\u0575\u056f\3\2\2\2\u0576\u00b1\3\2"+
		"\2\2\u0577\u0578\5\u00be`\2\u0578\u0579\5\u00b4[\2\u0579\u057a\5\u00ba"+
		"^\2\u057a\u0581\3\2\2\2\u057b\u057e\5\u00b4[\2\u057c\u057f\5\u00b8]\2"+
		"\u057d\u057f\5\u00ba^\2\u057e\u057c\3\2\2\2\u057e\u057d\3\2\2\2\u057f"+
		"\u0581\3\2\2\2\u0580\u0577\3\2\2\2\u0580\u057b\3\2\2\2\u0581\u00b3\3\2"+
		"\2\2\u0582\u0584\5\u00ceh\2\u0583\u0585\5\u00c0a\2\u0584\u0583\3\2\2\2"+
		"\u0584\u0585\3\2\2\2\u0585\u058d\3\2\2\2\u0586\u0587\7P\2\2\u0587\u0589"+
		"\5\u00ceh\2\u0588\u058a\5\u00c0a\2\u0589\u0588\3\2\2\2\u0589\u058a\3\2"+
		"\2\2\u058a\u058c\3\2\2\2\u058b\u0586\3\2\2\2\u058c\u058f\3\2\2\2\u058d"+
		"\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0592\3\2\2\2\u058f\u058d\3\2"+
		"\2\2\u0590\u0592\5T+\2\u0591\u0582\3\2\2\2\u0591\u0590\3\2\2\2\u0592\u00b5"+
		"\3\2\2\2\u0593\u0595\5\u00ceh\2\u0594\u0596\5\u00c2b\2\u0595\u0594\3\2"+
		"\2\2\u0595\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\5\u00ba^\2\u0598"+
		"\u00b7\3\2\2\2\u0599\u05b5\7L\2\2\u059a\u059f\7M\2\2\u059b\u059c\7L\2"+
		"\2\u059c\u059e\7M\2\2\u059d\u059b\3\2\2\2\u059e\u05a1\3\2\2\2\u059f\u059d"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u059f\3\2\2\2\u05a2"+
		"\u05b6\5H%\2\u05a3\u05a4\5\u00acW\2\u05a4\u05ab\7M\2\2\u05a5\u05a6\7L"+
		"\2\2\u05a6\u05a7\5\u00acW\2\u05a7\u05a8\7M\2\2\u05a8\u05aa\3\2\2\2\u05a9"+
		"\u05a5\3\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2"+
		"\2\2\u05ac\u05b2\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05af\7L\2\2\u05af"+
		"\u05b1\7M\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2"+
		"\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5"+
		"\u059a\3\2\2\2\u05b5\u05a3\3\2\2\2\u05b6\u00b9\3\2\2\2\u05b7\u05b9\5\u00c8"+
		"e\2\u05b8\u05ba\5$\23\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba"+
		"\u00bb\3\2\2\2\u05bb\u05bc\5\u00be`\2\u05bc\u05bd\5\u00c6d\2\u05bd\u00bd"+
		"\3\2\2\2\u05be\u05bf\7S\2\2\u05bf\u05c0\5\"\22\2\u05c0\u05c1\7R\2\2\u05c1"+
		"\u00bf\3\2\2\2\u05c2\u05c3\7S\2\2\u05c3\u05c6\7R\2\2\u05c4\u05c6\5V,\2"+
		"\u05c5\u05c2\3\2\2\2\u05c5\u05c4\3\2\2\2\u05c6\u00c1\3\2\2\2\u05c7\u05c8"+
		"\7S\2\2\u05c8\u05cb\7R\2\2\u05c9\u05cb\5\u00be`\2\u05ca\u05c7\3\2\2\2"+
		"\u05ca\u05c9\3\2\2\2\u05cb\u00c3\3\2\2\2\u05cc\u05d3\5\u00c8e\2\u05cd"+
		"\u05ce\7P\2\2\u05ce\u05d0\5\u00ceh\2\u05cf\u05d1\5\u00c8e\2\u05d0\u05cf"+
		"\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05cc\3\2\2\2\u05d2"+
		"\u05cd\3\2\2\2\u05d3\u00c5\3\2\2\2\u05d4\u05d5\7+\2\2\u05d5\u05da\5\u00c4"+
		"c\2\u05d6\u05d7\5\u00ceh\2\u05d7\u05d8\5\u00c8e\2\u05d8\u05da\3\2\2\2"+
		"\u05d9\u05d4\3\2\2\2\u05d9\u05d6\3\2\2\2\u05da\u00c7\3\2\2\2\u05db\u05dd"+
		"\7H\2\2\u05dc\u05de\5\u00a8U\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2"+
		"\u05de\u05df\3\2\2\2\u05df\u05e0\7I\2\2\u05e0\u00c9\3\2\2\2\u05e1\u05e2"+
		"\7 \2\2\u05e2\u05e3\5\u00acW\2\u05e3\u05e4\7N\2\2\u05e4\u00cb\3\2\2\2"+
		"\u05e5\u05e6\5\u00ceh\2\u05e6\u00cd\3\2\2\2\u05e7\u05e8\5\u00d0i\2\u05e8"+
		"\u00cf\3\2\2\2\u05e9\u05ee\7<\2\2\u05ea\u05ee\7>\2\2\u05eb\u05ee\7?\2"+
		"\2\u05ec\u05ee\7@\2\2\u05ed\u05e9\3\2\2\2\u05ed\u05ea\3\2\2\2\u05ed\u05eb"+
		"\3\2\2\2\u05ed\u05ec\3\2\2\2\u05ee\u00d1\3\2\2\2\u05ef\u05f0\t\13\2\2"+
		"\u05f0\u00d3\3\2\2\2\u05f1\u05f3\5\u00d6l\2\u05f2\u05f1\3\2\2\2\u05f2"+
		"\u05f3\3\2\2\2\u05f3\u05f7\3\2\2\2\u05f4\u05f6\5\u00d8m\2\u05f5\u05f4"+
		"\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8"+
		"\u05fd\3\2\2\2\u05f9\u05f7\3\2\2\2\u05fa\u05fc\5\u00dan\2\u05fb\u05fa"+
		"\3\2\2\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe"+
		"\u0600\3\2\2\2\u05ff\u05fd\3\2\2\2\u0600\u0601\7\2\2\3\u0601\u00d5\3\2"+
		"\2\2\u0602\u0604\5\u0140\u00a1\2\u0603\u0602\3\2\2\2\u0604\u0607\3\2\2"+
		"\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0605"+
		"\3\2\2\2\u0608\u0609\7#\2\2\u0609\u060a\5\u013c\u009f\2\u060a\u060b\7"+
		"N\2\2\u060b\u00d7\3\2\2\2\u060c\u060e\7\33\2\2\u060d\u060f\7)\2\2\u060e"+
		"\u060d\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0613\5\u013c"+
		"\u009f\2\u0611\u0612\7P\2\2\u0612\u0614\7b\2\2\u0613\u0611\3\2\2\2\u0613"+
		"\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\7N\2\2\u0616\u00d9\3\2"+
		"\2\2\u0617\u0619\5\u00dep\2\u0618\u0617\3\2\2\2\u0619\u061c\3\2\2\2\u061a"+
		"\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061a\3\2"+
		"\2\2\u061d\u0635\5\u00e2r\2\u061e\u0620\5\u00dep\2\u061f\u061e\3\2\2\2"+
		"\u0620\u0623\3\2\2\2\u0621\u061f\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0624"+
		"\3\2\2\2\u0623\u0621\3\2\2\2\u0624\u0635\5\u00eav\2\u0625\u0627\5\u00de"+
		"p\2\u0626\u0625\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0628"+
		"\u0629\3\2\2\2\u0629\u062b\3\2\2\2\u062a\u0628\3\2\2\2\u062b\u0635\5\u00f2"+
		"z\2\u062c\u062e\5\u00dep\2\u062d\u062c\3\2\2\2\u062e\u0631\3\2\2\2\u062f"+
		"\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3\2\2\2\u0631\u062f\3\2"+
		"\2\2\u0632\u0635\5\u014c\u00a7\2\u0633\u0635\7N\2\2\u0634\u061a\3\2\2"+
		"\2\u0634\u0621\3\2\2\2\u0634\u0628\3\2\2\2\u0634\u062f\3\2\2\2\u0634\u0633"+
		"\3\2\2\2\u0635\u00db\3\2\2\2\u0636\u0639\5\u00dep\2\u0637\u0639\t\2\2"+
		"\2\u0638\u0636\3\2\2\2\u0638\u0637\3\2\2\2\u0639\u00dd\3\2\2\2\u063a\u063d"+
		"\5\u0140\u00a1\2\u063b\u063d\t\f\2\2\u063c\u063a\3\2\2\2\u063c\u063b\3"+
		"\2\2\2\u063d\u00df\3\2\2\2\u063e\u0641\7\24\2\2\u063f\u0641\5\u0140\u00a1"+
		"\2\u0640\u063e\3\2\2\2\u0640\u063f\3\2\2\2\u0641\u00e1\3\2\2\2\u0642\u0643"+
		"\7\13\2\2\u0643\u0645\7=\2\2\u0644\u0646\5\u00e4s\2\u0645\u0644\3\2\2"+
		"\2\u0645\u0646\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0648\7\23\2\2\u0648"+
		"\u064a\5\u0124\u0093\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064d"+
		"\3\2\2\2\u064b\u064c\7\32\2\2\u064c\u064e\5\u00f4{\2\u064d\u064b\3\2\2"+
		"\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\5\u00f6|\2\u0650"+
		"\u00e3\3\2\2\2\u0651\u0652\7S\2\2\u0652\u0657\5\u00e6t\2\u0653\u0654\7"+
		"O\2\2\u0654\u0656\5\u00e6t\2\u0655\u0653\3\2\2\2\u0656\u0659\3\2\2\2\u0657"+
		"\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065a\3\2\2\2\u0659\u0657\3\2"+
		"\2\2\u065a\u065b\7R\2\2\u065b\u00e5\3\2\2\2\u065c\u065f\7=\2\2\u065d\u065e"+
		"\7\23\2\2\u065e\u0660\5\u00e8u\2\u065f\u065d\3\2\2\2\u065f\u0660\3\2\2"+
		"\2\u0660\u00e7\3\2\2\2\u0661\u0666\5\u0124\u0093\2\u0662\u0663\7d\2\2"+
		"\u0663\u0665\5\u0124\u0093\2\u0664\u0662\3\2\2\2\u0665\u0668\3\2\2\2\u0666"+
		"\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u00e9\3\2\2\2\u0668\u0666\3\2"+
		"\2\2\u0669\u066a\7\22\2\2\u066a\u066d\7=\2\2\u066b\u066c\7\32\2\2\u066c"+
		"\u066e\5\u00f4{\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f"+
		"\3\2\2\2\u066f\u0671\7J\2\2\u0670\u0672\5\u00ecw\2\u0671\u0670\3\2\2\2"+
		"\u0671\u0672\3\2\2\2\u0672\u0674\3\2\2\2\u0673\u0675\7O\2\2\u0674\u0673"+
		"\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\3\2\2\2\u0676\u0678\5\u00f0y"+
		"\2\u0677\u0676\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a"+
		"\7K\2\2\u067a\u00eb\3\2\2\2\u067b\u0680\5\u00eex\2\u067c\u067d\7O\2\2"+
		"\u067d\u067f\5\u00eex\2\u067e\u067c\3\2\2\2\u067f\u0682\3\2\2\2\u0680"+
		"\u067e\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u00ed\3\2\2\2\u0682\u0680\3\2"+
		"\2\2\u0683\u0685\5\u0140\u00a1\2\u0684\u0683\3\2\2\2\u0685\u0688\3\2\2"+
		"\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0689\3\2\2\2\u0688\u0686"+
		"\3\2\2\2\u0689\u068b\7=\2\2\u068a\u068c\5\u01a0\u00d1\2\u068b\u068a\3"+
		"\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\3\2\2\2\u068d\u068f\5\u00f6|\2"+
		"\u068e\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u00ef\3\2\2\2\u0690\u0694"+
		"\7N\2\2\u0691\u0693\5\u00fa~\2\u0692\u0691\3\2\2\2\u0693\u0696\3\2\2\2"+
		"\u0694\u0692\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u00f1\3\2\2\2\u0696\u0694"+
		"\3\2\2\2\u0697\u0698\7\36\2\2\u0698\u069a\7=\2\2\u0699\u069b\5\u00e4s"+
		"\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069d"+
		"\7\23\2\2\u069d\u069f\5\u00f4{\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2"+
		"\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\5\u00f8}\2\u06a1\u00f3\3\2\2\2\u06a2"+
		"\u06a7\5\u0124\u0093\2\u06a3\u06a4\7O\2\2\u06a4\u06a6\5\u0124\u0093\2"+
		"\u06a5\u06a3\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8"+
		"\3\2\2\2\u06a8\u00f5\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ae\7J\2\2\u06ab"+
		"\u06ad\5\u00fa~\2\u06ac\u06ab\3\2\2\2\u06ad\u06b0\3\2\2\2\u06ae\u06ac"+
		"\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1"+
		"\u06b2\7K\2\2\u06b2\u00f7\3\2\2\2\u06b3\u06b7\7J\2\2\u06b4\u06b6\5\u0108"+
		"\u0085\2\u06b5\u06b4\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7"+
		"\u06b8\3\2\2\2\u06b8\u06ba\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba\u06bb\7K"+
		"\2\2\u06bb\u00f9\3\2\2\2\u06bc\u06c9\7N\2\2\u06bd\u06bf\7)\2\2\u06be\u06bd"+
		"\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c9\5\u015c\u00af"+
		"\2\u06c1\u06c3\5\u00dco\2\u06c2\u06c1\3\2\2\2\u06c3\u06c6\3\2\2\2\u06c4"+
		"\u06c2\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c4\3\2"+
		"\2\2\u06c7\u06c9\5\u00fc\177\2\u06c8\u06bc\3\2\2\2\u06c8\u06be\3\2\2\2"+
		"\u06c8\u06c4\3\2\2\2\u06c9\u00fb\3\2\2\2\u06ca\u06d4\5\u00fe\u0080\2\u06cb"+
		"\u06d4\5\u0100\u0081\2\u06cc\u06d4\5\u0106\u0084\2\u06cd\u06d4\5\u0102"+
		"\u0082\2\u06ce\u06d4\5\u0104\u0083\2\u06cf\u06d4\5\u00f2z\2\u06d0\u06d4"+
		"\5\u014c\u00a7\2\u06d1\u06d4\5\u00e2r\2\u06d2\u06d4\5\u00eav\2\u06d3\u06ca"+
		"\3\2\2\2\u06d3\u06cb\3\2\2\2\u06d3\u06cc\3\2\2\2\u06d3\u06cd\3\2\2\2\u06d3"+
		"\u06ce\3\2\2\2\u06d3\u06cf\3\2\2\2\u06d3\u06d0\3\2\2\2\u06d3\u06d1\3\2"+
		"\2\2\u06d3\u06d2\3\2\2\2\u06d4\u00fd\3\2\2\2\u06d5\u06d8\5\u0124\u0093"+
		"\2\u06d6\u06d8\7\63\2\2\u06d7\u06d5\3\2\2\2\u06d7\u06d6\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u06da\7=\2\2\u06da\u06df\5\u0130\u0099\2\u06db\u06dc"+
		"\7L\2\2\u06dc\u06de\7M\2\2\u06dd\u06db\3\2\2\2\u06de\u06e1\3\2\2\2\u06df"+
		"\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e4\3\2\2\2\u06e1\u06df\3\2"+
		"\2\2\u06e2\u06e3\7\60\2\2\u06e3\u06e5\5\u012e\u0098\2\u06e4\u06e2\3\2"+
		"\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e8\3\2\2\2\u06e6\u06e9\5\u0138\u009d"+
		"\2\u06e7\u06e9\7N\2\2\u06e8\u06e6\3\2\2\2\u06e8\u06e7\3\2\2\2\u06e9\u00ff"+
		"\3\2\2\2\u06ea\u06eb\5\u00e4s\2\u06eb\u06ec\5\u00fe\u0080\2\u06ec\u0101"+
		"\3\2\2\2\u06ed\u06ee\7=\2\2\u06ee\u06f1\5\u0130\u0099\2\u06ef\u06f0\7"+
		"\60\2\2\u06f0\u06f2\5\u012e\u0098\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2\3"+
		"\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\5\u013a\u009e\2\u06f4\u0103\3\2"+
		"\2\2\u06f5\u06f6\5\u00e4s\2\u06f6\u06f7\5\u0102\u0082\2\u06f7\u0105\3"+
		"\2\2\2\u06f8\u06f9\5\u0124\u0093\2\u06f9\u06fa\5\u0114\u008b\2\u06fa\u06fb"+
		"\7N\2\2\u06fb\u0107\3\2\2\2\u06fc\u06fe\5\u00dco\2\u06fd\u06fc\3\2\2\2"+
		"\u06fe\u0701\3\2\2\2\u06ff\u06fd\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0702"+
		"\3\2\2\2\u0701\u06ff\3\2\2\2\u0702\u0705\5\u010a\u0086\2\u0703\u0705\7"+
		"N\2\2\u0704\u06ff\3\2\2\2\u0704\u0703\3\2\2\2\u0705\u0109\3\2\2\2\u0706"+
		"\u070e\5\u010c\u0087\2\u0707\u070e\5\u0110\u0089\2\u0708\u070e\5\u0112"+
		"\u008a\2\u0709\u070e\5\u00f2z\2\u070a\u070e\5\u014c\u00a7\2\u070b\u070e"+
		"\5\u00e2r\2\u070c\u070e\5\u00eav\2\u070d\u0706\3\2\2\2\u070d\u0707\3\2"+
		"\2\2\u070d\u0708\3\2\2\2\u070d\u0709\3\2\2\2\u070d\u070a\3\2\2\2\u070d"+
		"\u070b\3\2\2\2\u070d\u070c\3\2\2\2\u070e\u010b\3\2\2\2\u070f\u0710\5\u0124"+
		"\u0093\2\u0710\u0715\5\u010e\u0088\2\u0711\u0712\7O\2\2\u0712\u0714\5"+
		"\u010e\u0088\2\u0713\u0711\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2"+
		"\2\2\u0715\u0716\3\2\2\2\u0716\u0718\3\2\2\2\u0717\u0715\3\2\2\2\u0718"+
		"\u0719\7N\2\2\u0719\u010d\3\2\2\2\u071a\u071f\7=\2\2\u071b\u071c\7L\2"+
		"\2\u071c\u071e\7M\2\2\u071d\u071b\3\2\2\2\u071e\u0721\3\2\2\2\u071f\u071d"+
		"\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0722\3\2\2\2\u0721\u071f\3\2\2\2\u0722"+
		"\u0723\7Q\2\2\u0723\u0724\5\u011a\u008e\2\u0724\u010f\3\2\2\2\u0725\u0728"+
		"\5\u0124\u0093\2\u0726\u0728\7\63\2\2\u0727\u0725\3\2\2\2\u0727\u0726"+
		"\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\7=\2\2\u072a\u072f\5\u0130\u0099"+
		"\2\u072b\u072c\7L\2\2\u072c\u072e\7M\2\2\u072d\u072b\3\2\2\2\u072e\u0731"+
		"\3\2\2\2\u072f\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0734\3\2\2\2\u0731"+
		"\u072f\3\2\2\2\u0732\u0733\7\60\2\2\u0733\u0735\5\u012e\u0098\2\u0734"+
		"\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737\7N"+
		"\2\2\u0737\u0111\3\2\2\2\u0738\u0739\5\u00e4s\2\u0739\u073a\5\u0110\u0089"+
		"\2\u073a\u0113\3\2\2\2\u073b\u0740\5\u0116\u008c\2\u073c\u073d\7O\2\2"+
		"\u073d\u073f\5\u0116\u008c\2\u073e\u073c\3\2\2\2\u073f\u0742\3\2\2\2\u0740"+
		"\u073e\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0115\3\2\2\2\u0742\u0740\3\2"+
		"\2\2\u0743\u0746\5\u0118\u008d\2\u0744\u0745\7Q\2\2\u0745\u0747\5\u011a"+
		"\u008e\2\u0746\u0744\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0117\3\2\2\2\u0748"+
		"\u074d\7=\2\2\u0749\u074a\7L\2\2\u074a\u074c\7M\2\2\u074b\u0749\3\2\2"+
		"\2\u074c\u074f\3\2\2\2\u074d\u074b\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0119"+
		"\3\2\2\2\u074f\u074d\3\2\2\2\u0750\u0753\5\u011c\u008f\2\u0751\u0753\5"+
		"\u0186\u00c4\2\u0752\u0750\3\2\2\2\u0752\u0751\3\2\2\2\u0753\u011b\3\2"+
		"\2\2\u0754\u0760\7J\2\2\u0755\u075a\5\u011a\u008e\2\u0756\u0757\7O\2\2"+
		"\u0757\u0759\5\u011a\u008e\2\u0758\u0756\3\2\2\2\u0759\u075c\3\2\2\2\u075a"+
		"\u0758\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075e\3\2\2\2\u075c\u075a\3\2"+
		"\2\2\u075d\u075f\7O\2\2\u075e\u075d\3\2\2\2\u075e\u075f\3\2\2\2\u075f"+
		"\u0761\3\2\2\2\u0760\u0755\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0762\3\2"+
		"\2\2\u0762\u0763\7K\2\2\u0763\u011d\3\2\2\2\u0764\u0765\5\u013c\u009f"+
		"\2\u0765\u011f\3\2\2\2\u0766\u0767\7=\2\2\u0767\u0121\3\2\2\2\u0768\u0769"+
		"\5\u013c\u009f\2\u0769\u0123\3\2\2\2\u076a\u076f\5\u0126\u0094\2\u076b"+
		"\u076c\7L\2\2\u076c\u076e\7M\2\2\u076d\u076b\3\2\2\2\u076e\u0771\3\2\2"+
		"\2\u076f\u076d\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u077b\3\2\2\2\u0771\u076f"+
		"\3\2\2\2\u0772\u0777\5\u0128\u0095\2\u0773\u0774\7L\2\2\u0774\u0776\7"+
		"M\2\2\u0775\u0773\3\2\2\2\u0776\u0779\3\2\2\2\u0777\u0775\3\2\2\2\u0777"+
		"\u0778\3\2\2\2\u0778\u077b\3\2\2\2\u0779\u0777\3\2\2\2\u077a\u076a\3\2"+
		"\2\2\u077a\u0772\3\2\2\2\u077b\u0125\3\2\2\2\u077c\u077e\7=\2\2\u077d"+
		"\u077f\5\u012a\u0096\2\u077e\u077d\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0787"+
		"\3\2\2\2\u0780\u0781\7P\2\2\u0781\u0783\7=\2\2\u0782\u0784\5\u012a\u0096"+
		"\2\u0783\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0786\3\2\2\2\u0785\u0780"+
		"\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785\3\2\2\2\u0787\u0788\3\2\2\2\u0788"+
		"\u0127\3\2\2\2\u0789\u0787\3\2\2\2\u078a\u078b\t\4\2\2\u078b\u0129\3\2"+
		"\2\2\u078c\u078d\7S\2\2\u078d\u0792\5\u012c\u0097\2\u078e\u078f\7O\2\2"+
		"\u078f\u0791\5\u012c\u0097\2\u0790\u078e\3\2\2\2\u0791\u0794\3\2\2\2\u0792"+
		"\u0790\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0795\3\2\2\2\u0794\u0792\3\2"+
		"\2\2\u0795\u0796\7R\2\2\u0796\u012b\3\2\2\2\u0797\u079e\5\u0124\u0093"+
		"\2\u0798\u079b\7V\2\2\u0799\u079a\t\5\2\2\u079a\u079c\5\u0124\u0093\2"+
		"\u079b\u0799\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079e\3\2\2\2\u079d\u0797"+
		"\3\2\2\2\u079d\u0798\3\2\2\2\u079e\u012d\3\2\2\2\u079f\u07a4\5\u013c\u009f"+
		"\2\u07a0\u07a1\7O\2\2\u07a1\u07a3\5\u013c\u009f\2\u07a2\u07a0\3\2\2\2"+
		"\u07a3\u07a6\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u012f"+
		"\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a7\u07a9\7H\2\2\u07a8\u07aa\5\u0132\u009a"+
		"\2\u07a9\u07a8\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ac"+
		"\7I\2\2\u07ac\u0131\3\2\2\2\u07ad\u07b2\5\u0134\u009b\2\u07ae\u07af\7"+
		"O\2\2\u07af\u07b1\5\u0134\u009b\2\u07b0\u07ae\3\2\2\2\u07b1\u07b4\3\2"+
		"\2\2\u07b2\u07b0\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b7\3\2\2\2\u07b4"+
		"\u07b2\3\2\2\2\u07b5\u07b6\7O\2\2\u07b6\u07b8\5\u0136\u009c\2\u07b7\u07b5"+
		"\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07bb\3\2\2\2\u07b9\u07bb\5\u0136\u009c"+
		"\2\u07ba\u07ad\3\2\2\2\u07ba\u07b9\3\2\2\2\u07bb\u0133\3\2\2\2\u07bc\u07be"+
		"\5\u00e0q\2\u07bd\u07bc\3\2\2\2\u07be\u07c1\3\2\2\2\u07bf\u07bd\3\2\2"+
		"\2\u07bf\u07c0\3\2\2\2\u07c0\u07c2\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c2\u07c3"+
		"\5\u0124\u0093\2\u07c3\u07c4\5\u0118\u008d\2\u07c4\u0135\3\2\2\2\u07c5"+
		"\u07c7\5\u00e0q\2\u07c6\u07c5\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6"+
		"\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb"+
		"\u07cc\5\u0124\u0093\2\u07cc\u07cd\7t\2\2\u07cd\u07ce\5\u0118\u008d\2"+
		"\u07ce\u0137\3\2\2\2\u07cf\u07d0\5\u015c\u00af\2\u07d0\u0139\3\2\2\2\u07d1"+
		"\u07d2\5\u015c\u00af\2\u07d2\u013b\3\2\2\2\u07d3\u07d8\7=\2\2\u07d4\u07d5"+
		"\7P\2\2\u07d5\u07d7\7=\2\2\u07d6\u07d4\3\2\2\2\u07d7\u07da\3\2\2\2\u07d8"+
		"\u07d6\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u013d\3\2\2\2\u07da\u07d8\3\2"+
		"\2\2\u07db\u07dc\t\6\2\2\u07dc\u013f\3\2\2\2\u07dd\u07de\7s\2\2\u07de"+
		"\u07e5\5\u0142\u00a2\2\u07df\u07e2\7H\2\2\u07e0\u07e3\5\u0144\u00a3\2"+
		"\u07e1\u07e3\5\u0148\u00a5\2\u07e2\u07e0\3\2\2\2\u07e2\u07e1\3\2\2\2\u07e2"+
		"\u07e3\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e6\7I\2\2\u07e5\u07df\3\2"+
		"\2\2\u07e5\u07e6\3\2\2\2\u07e6\u0141\3\2\2\2\u07e7\u07e8\5\u013c\u009f"+
		"\2\u07e8\u0143\3\2\2\2\u07e9\u07ee\5\u0146\u00a4\2\u07ea\u07eb\7O\2\2"+
		"\u07eb\u07ed\5\u0146\u00a4\2\u07ec\u07ea\3\2\2\2\u07ed\u07f0\3\2\2\2\u07ee"+
		"\u07ec\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u0145\3\2\2\2\u07f0\u07ee\3\2"+
		"\2\2\u07f1\u07f2\7=\2\2\u07f2\u07f3\7Q\2\2\u07f3\u07f4\5\u0148\u00a5\2"+
		"\u07f4\u0147\3\2\2\2\u07f5\u07f9\5\u0186\u00c4\2\u07f6\u07f9\5\u0140\u00a1"+
		"\2\u07f7\u07f9\5\u014a\u00a6\2\u07f8\u07f5\3\2\2\2\u07f8\u07f6\3\2\2\2"+
		"\u07f8\u07f7\3\2\2\2\u07f9\u0149\3\2\2\2\u07fa\u0803\7J\2\2\u07fb\u0800"+
		"\5\u0148\u00a5\2\u07fc\u07fd\7O\2\2\u07fd\u07ff\5\u0148\u00a5\2\u07fe"+
		"\u07fc\3\2\2\2\u07ff\u0802\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2"+
		"\2\2\u0801\u0804\3\2\2\2\u0802\u0800\3\2\2\2\u0803\u07fb\3\2\2\2\u0803"+
		"\u0804\3\2\2\2\u0804\u0806\3\2\2\2\u0805\u0807\7O\2\2\u0806\u0805\3\2"+
		"\2\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0809\7K\2\2\u0809"+
		"\u014b\3\2\2\2\u080a\u080b\7s\2\2\u080b\u080c\7\36\2\2\u080c\u080d\7="+
		"\2\2\u080d\u080e\5\u014e\u00a8\2\u080e\u014d\3\2\2\2\u080f\u0813\7J\2"+
		"\2\u0810\u0812\5\u0150\u00a9\2\u0811\u0810\3\2\2\2\u0812\u0815\3\2\2\2"+
		"\u0813\u0811\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\3\2\2\2\u0815\u0813"+
		"\3\2\2\2\u0816\u0817\7K\2\2\u0817\u014f\3\2\2\2\u0818\u081a\5\u00dco\2"+
		"\u0819\u0818\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c"+
		"\3\2\2\2\u081c\u081e\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u0821\5\u0152\u00aa"+
		"\2\u081f\u0821\7N\2\2\u0820\u081b\3\2\2\2\u0820\u081f\3\2\2\2\u0821\u0151"+
		"\3\2\2\2\u0822\u0823\5\u0124\u0093\2\u0823\u0824\5\u0154\u00ab\2\u0824"+
		"\u0825\7N\2\2\u0825\u0837\3\2\2\2\u0826\u0828\5\u00e2r\2\u0827\u0829\7"+
		"N\2\2\u0828\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0837\3\2\2\2\u082a"+
		"\u082c\5\u00f2z\2\u082b\u082d\7N\2\2\u082c\u082b\3\2\2\2\u082c\u082d\3"+
		"\2\2\2\u082d\u0837\3\2\2\2\u082e\u0830\5\u00eav\2\u082f\u0831\7N\2\2\u0830"+
		"\u082f\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0837\3\2\2\2\u0832\u0834\5\u014c"+
		"\u00a7\2\u0833\u0835\7N\2\2\u0834\u0833\3\2\2\2\u0834\u0835\3\2\2\2\u0835"+
		"\u0837\3\2\2\2\u0836\u0822\3\2\2\2\u0836\u0826\3\2\2\2\u0836\u082a\3\2"+
		"\2\2\u0836\u082e\3\2\2\2\u0836\u0832\3\2\2\2\u0837\u0153\3\2\2\2\u0838"+
		"\u083b\5\u0156\u00ac\2\u0839\u083b\5\u0158\u00ad\2\u083a\u0838\3\2\2\2"+
		"\u083a\u0839\3\2\2\2\u083b\u0155\3\2\2\2\u083c\u083d\7=\2\2\u083d\u083e"+
		"\7H\2\2\u083e\u0840\7I\2\2\u083f\u0841\5\u015a\u00ae\2\u0840\u083f\3\2"+
		"\2\2\u0840\u0841\3\2\2\2\u0841\u0157\3\2\2\2\u0842\u0843\5\u0114\u008b"+
		"\2\u0843\u0159\3\2\2\2\u0844\u0845\7\16\2\2\u0845\u0846\5\u0148\u00a5"+
		"\2\u0846\u015b\3\2\2\2\u0847\u084b\7J\2\2\u0848\u084a\5\u015e\u00b0\2"+
		"\u0849\u0848\3\2\2\2\u084a\u084d\3\2\2\2\u084b\u0849\3\2\2\2\u084b\u084c"+
		"\3\2\2\2\u084c\u084e\3\2\2\2\u084d\u084b\3\2\2\2\u084e\u084f\7K\2\2\u084f"+
		"\u015d\3\2\2\2\u0850\u0854\5\u0160\u00b1\2\u0851\u0854\5\u0164\u00b3\2"+
		"\u0852\u0854\5\u00dan\2\u0853\u0850\3\2\2\2\u0853\u0851\3\2\2\2\u0853"+
		"\u0852\3\2\2\2\u0854\u015f\3\2\2\2\u0855\u0856\5\u0162\u00b2\2\u0856\u0857"+
		"\7N\2\2\u0857\u0161\3\2\2\2\u0858\u085a\5\u00e0q\2\u0859\u0858\3\2\2\2"+
		"\u085a\u085d\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e"+
		"\3\2\2\2\u085d\u085b\3\2\2\2\u085e\u085f\5\u0124\u0093\2\u085f\u0860\5"+
		"\u0114\u008b\2\u0860\u0163\3\2\2\2\u0861\u08ca\5\u015c\u00af\2\u0862\u0863"+
		"\7\4\2\2\u0863\u0866\5\u0186\u00c4\2\u0864\u0865\7W\2\2\u0865\u0867\5"+
		"\u0186\u00c4\2\u0866\u0864\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868\3\2"+
		"\2\2\u0868\u0869\7N\2\2\u0869\u08ca\3\2\2\2\u086a\u086b\7\30\2\2\u086b"+
		"\u086c\5\u017e\u00c0\2\u086c\u086f\5\u0164\u00b3\2\u086d\u086e\7\21\2"+
		"\2\u086e\u0870\5\u0164\u00b3\2\u086f\u086d\3\2\2\2\u086f\u0870\3\2\2\2"+
		"\u0870\u08ca\3\2\2\2\u0871\u0872\7\27\2\2\u0872\u0873\7H\2\2\u0873\u0874"+
		"\5\u0176\u00bc\2\u0874\u0875\7I\2\2\u0875\u0876\5\u0164\u00b3\2\u0876"+
		"\u08ca\3\2\2\2\u0877\u0878\7\65\2\2\u0878\u0879\5\u017e\u00c0\2\u0879"+
		"\u087a\5\u0164\u00b3\2\u087a\u08ca\3\2\2\2\u087b\u087c\7\17\2\2\u087c"+
		"\u087d\5\u0164\u00b3\2\u087d\u087e\7\65\2\2\u087e\u087f\5\u017e\u00c0"+
		"\2\u087f\u0880\7N\2\2\u0880\u08ca\3\2\2\2\u0881\u0882\7\62\2\2\u0882\u088c"+
		"\5\u015c\u00af\2\u0883\u0885\5\u0166\u00b4\2\u0884\u0883\3\2\2\2\u0885"+
		"\u0886\3\2\2\2\u0886\u0884\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0889\3\2"+
		"\2\2\u0888\u088a\5\u016a\u00b6\2\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2"+
		"\2\u088a\u088d\3\2\2\2\u088b\u088d\5\u016a\u00b6\2\u088c\u0884\3\2\2\2"+
		"\u088c\u088b\3\2\2\2\u088d\u08ca\3\2\2\2\u088e\u088f\7\62\2\2\u088f\u0890"+
		"\5\u016c\u00b7\2\u0890\u0894\5\u015c\u00af\2\u0891\u0893\5\u0166\u00b4"+
		"\2\u0892\u0891\3\2\2\2\u0893\u0896\3\2\2\2\u0894\u0892\3\2\2\2\u0894\u0895"+
		"\3\2\2\2\u0895\u0898\3\2\2\2\u0896\u0894\3\2\2\2\u0897\u0899\5\u016a\u00b6"+
		"\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u08ca\3\2\2\2\u089a\u089b"+
		"\7,\2\2\u089b\u089c\5\u017e\u00c0\2\u089c\u08a0\7J\2\2\u089d\u089f\5\u0172"+
		"\u00ba\2\u089e\u089d\3\2\2\2\u089f\u08a2\3\2\2\2\u08a0\u089e\3\2\2\2\u08a0"+
		"\u08a1\3\2\2\2\u08a1\u08a6\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a3\u08a5\5\u0174"+
		"\u00bb\2\u08a4\u08a3\3\2\2\2\u08a5\u08a8\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6"+
		"\u08a7\3\2\2\2\u08a7\u08a9\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a9\u08aa\7K"+
		"\2\2\u08aa\u08ca\3\2\2\2\u08ab\u08ac\7-\2\2\u08ac\u08ad\5\u017e\u00c0"+
		"\2\u08ad\u08ae\5\u015c\u00af\2\u08ae\u08ca\3\2\2\2\u08af\u08b1\7\'\2\2"+
		"\u08b0\u08b2\5\u0186\u00c4\2\u08b1\u08b0\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2"+
		"\u08b3\3\2\2\2\u08b3\u08ca\7N\2\2\u08b4\u08b5\7/\2\2\u08b5\u08b6\5\u0186"+
		"\u00c4\2\u08b6\u08b7\7N\2\2\u08b7\u08ca\3\2\2\2\u08b8\u08ba\7\6\2\2\u08b9"+
		"\u08bb\7=\2\2\u08ba\u08b9\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08bc\3\2"+
		"\2\2\u08bc\u08ca\7N\2\2\u08bd\u08bf\7\r\2\2\u08be\u08c0\7=\2\2\u08bf\u08be"+
		"\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08ca\7N\2\2\u08c2"+
		"\u08ca\7N\2\2\u08c3\u08c4\5\u0182\u00c2\2\u08c4\u08c5\7N\2\2\u08c5\u08ca"+
		"\3\2\2\2\u08c6\u08c7\7=\2\2\u08c7\u08c8\7W\2\2\u08c8\u08ca\5\u0164\u00b3"+
		"\2\u08c9\u0861\3\2\2\2\u08c9\u0862\3\2\2\2\u08c9\u086a\3\2\2\2\u08c9\u0871"+
		"\3\2\2\2\u08c9\u0877\3\2\2\2\u08c9\u087b\3\2\2\2\u08c9\u0881\3\2\2\2\u08c9"+
		"\u088e\3\2\2\2\u08c9\u089a\3\2\2\2\u08c9\u08ab\3\2\2\2\u08c9\u08af\3\2"+
		"\2\2\u08c9\u08b4\3\2\2\2\u08c9\u08b8\3\2\2\2\u08c9\u08bd\3\2\2\2\u08c9"+
		"\u08c2\3\2\2\2\u08c9\u08c3\3\2\2\2\u08c9\u08c6\3\2\2\2\u08ca\u0165\3\2"+
		"\2\2\u08cb\u08cc\7\t\2\2\u08cc\u08d0\7H\2\2\u08cd\u08cf\5\u00e0q\2\u08ce"+
		"\u08cd\3\2\2\2\u08cf\u08d2\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d0\u08d1\3\2"+
		"\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08d0\3\2\2\2\u08d3\u08d4\5\u0168\u00b5"+
		"\2\u08d4\u08d5\7=\2\2\u08d5\u08d6\7I\2\2\u08d6\u08d7\5\u015c\u00af\2\u08d7"+
		"\u0167\3\2\2\2\u08d8\u08dd\5\u013c\u009f\2\u08d9\u08da\7e\2\2\u08da\u08dc"+
		"\5\u013c\u009f\2\u08db\u08d9\3\2\2\2\u08dc\u08df\3\2\2\2\u08dd\u08db\3"+
		"\2\2\2\u08dd\u08de\3\2\2\2\u08de\u0169\3\2\2\2\u08df\u08dd\3\2\2\2\u08e0"+
		"\u08e1\7\25\2\2\u08e1\u08e2\5\u015c\u00af\2\u08e2\u016b\3\2\2\2\u08e3"+
		"\u08e4\7H\2\2\u08e4\u08e6\5\u016e\u00b8\2\u08e5\u08e7\7N\2\2\u08e6\u08e5"+
		"\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\7I\2\2\u08e9"+
		"\u016d\3\2\2\2\u08ea\u08ef\5\u0170\u00b9\2\u08eb\u08ec\7N\2\2\u08ec\u08ee"+
		"\5\u0170\u00b9\2\u08ed\u08eb\3\2\2\2\u08ee\u08f1\3\2\2\2\u08ef\u08ed\3"+
		"\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u016f\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f2"+
		"\u08f4\5\u00e0q\2\u08f3\u08f2\3\2\2\2\u08f4\u08f7\3\2\2\2\u08f5\u08f3"+
		"\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f8\3\2\2\2\u08f7\u08f5\3\2\2\2\u08f8"+
		"\u08f9\5\u0126\u0094\2\u08f9\u08fa\5\u0118\u008d\2\u08fa\u08fb\7Q\2\2"+
		"\u08fb\u08fc\5\u0186\u00c4\2\u08fc\u0171\3\2\2\2\u08fd\u08ff\5\u0174\u00bb"+
		"\2\u08fe\u08fd\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u08fe\3\2\2\2\u0900\u0901"+
		"\3\2\2\2\u0901\u0903\3\2\2\2\u0902\u0904\5\u015e\u00b0\2\u0903\u0902\3"+
		"\2\2\2\u0904\u0905\3\2\2\2\u0905\u0903\3\2\2\2\u0905\u0906\3\2\2\2\u0906"+
		"\u0173\3\2\2\2\u0907\u0908\7\b\2\2\u0908\u0909\5\u0184\u00c3\2\u0909\u090a"+
		"\7W\2\2\u090a\u0912\3\2\2\2\u090b\u090c\7\b\2\2\u090c\u090d\5\u0120\u0091"+
		"\2\u090d\u090e\7W\2\2\u090e\u0912\3\2\2\2\u090f\u0910\7\16\2\2\u0910\u0912"+
		"\7W\2\2\u0911\u0907\3\2\2\2\u0911\u090b\3\2\2\2\u0911\u090f\3\2\2\2\u0912"+
		"\u0175\3\2\2\2\u0913\u0920\5\u017a\u00be\2\u0914\u0916\5\u0178\u00bd\2"+
		"\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0919"+
		"\7N\2\2\u0918\u091a\5\u0186\u00c4\2\u0919\u0918\3\2\2\2\u0919\u091a\3"+
		"\2\2\2\u091a\u091b\3\2\2\2\u091b\u091d\7N\2\2\u091c\u091e\5\u017c\u00bf"+
		"\2\u091d\u091c\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u0920\3\2\2\2\u091f\u0913"+
		"\3\2\2\2\u091f\u0915\3\2\2\2\u0920\u0177\3\2\2\2\u0921\u0924\5\u0162\u00b2"+
		"\2\u0922\u0924\5\u0180\u00c1\2\u0923\u0921\3\2\2\2\u0923\u0922\3\2\2\2"+
		"\u0924\u0179\3\2\2\2\u0925\u0927\5\u00e0q\2\u0926\u0925\3\2\2\2\u0927"+
		"\u092a\3\2\2\2\u0928\u0926\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092b\3\2"+
		"\2\2\u092a\u0928\3\2\2\2\u092b\u092c\5\u0124\u0093\2\u092c\u092d\7=\2"+
		"\2\u092d\u092e\7W\2\2\u092e\u092f\5\u0186\u00c4\2\u092f\u017b\3\2\2\2"+
		"\u0930\u0931\5\u0180\u00c1\2\u0931\u017d\3\2\2\2\u0932\u0933\7H\2\2\u0933"+
		"\u0934\5\u0186\u00c4\2\u0934\u0935\7I\2\2\u0935\u017f\3\2\2\2\u0936\u093b"+
		"\5\u0186\u00c4\2\u0937\u0938\7O\2\2\u0938\u093a\5\u0186\u00c4\2\u0939"+
		"\u0937\3\2\2\2\u093a\u093d\3\2\2\2\u093b\u0939\3\2\2\2\u093b\u093c\3\2"+
		"\2\2\u093c\u0181\3\2\2\2\u093d\u093b\3\2\2\2\u093e\u093f\5\u0186\u00c4"+
		"\2\u093f\u0183\3\2\2\2\u0940\u0941\5\u0186\u00c4\2\u0941\u0185\3\2\2\2"+
		"\u0942\u0943\b\u00c4\1\2\u0943\u0950\5\u0188\u00c5\2\u0944\u0945\7\"\2"+
		"\2\u0945\u0950\5\u018a\u00c6\2\u0946\u0947\7H\2\2\u0947\u0948\5\u0124"+
		"\u0093\2\u0948\u0949\7I\2\2\u0949\u094a\5\u0186\u00c4\23\u094a\u0950\3"+
		"\2\2\2\u094b\u094c\t\r\2\2\u094c\u0950\5\u0186\u00c4\21\u094d\u094e\t"+
		"\16\2\2\u094e\u0950\5\u0186\u00c4\20\u094f\u0942\3\2\2\2\u094f\u0944\3"+
		"\2\2\2\u094f\u0946\3\2\2\2\u094f\u094b\3\2\2\2\u094f\u094d\3\2\2\2\u0950"+
		"\u09a6\3\2\2\2\u0951\u0952\f\17\2\2\u0952\u0953\t\b\2\2\u0953\u09a5\5"+
		"\u0186\u00c4\20\u0954\u0955\f\16\2\2\u0955\u0956\t\7\2\2\u0956\u09a5\5"+
		"\u0186\u00c4\17\u0957\u095f\f\r\2\2\u0958\u0959\7S\2\2\u0959\u0960\7S"+
		"\2\2\u095a\u095b\7R\2\2\u095b\u095c\7R\2\2\u095c\u0960\7R\2\2\u095d\u095e"+
		"\7R\2\2\u095e\u0960\7R\2\2\u095f\u0958\3\2\2\2\u095f\u095a\3\2\2\2\u095f"+
		"\u095d\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u09a5\5\u0186\u00c4\16\u0962"+
		"\u0963\f\f\2\2\u0963\u0964\t\17\2\2\u0964\u09a5\5\u0186\u00c4\r\u0965"+
		"\u0966\f\n\2\2\u0966\u0967\t\20\2\2\u0967\u09a5\5\u0186\u00c4\13\u0968"+
		"\u0969\f\t\2\2\u0969\u096a\7d\2\2\u096a\u09a5\5\u0186\u00c4\n\u096b\u096c"+
		"\f\b\2\2\u096c\u096d\7f\2\2\u096d\u09a5\5\u0186\u00c4\t\u096e\u096f\f"+
		"\7\2\2\u096f\u0970\7e\2\2\u0970\u09a5\5\u0186\u00c4\b\u0971\u0972\f\6"+
		"\2\2\u0972\u0973\7\\\2\2\u0973\u09a5\5\u0186\u00c4\7\u0974\u0975\f\5\2"+
		"\2\u0975\u0976\7]\2\2\u0976\u09a5\5\u0186\u00c4\6\u0977\u0978\f\4\2\2"+
		"\u0978\u0979\7V\2\2\u0979\u097a\5\u0186\u00c4\2\u097a\u097b\7W\2\2\u097b"+
		"\u097c\5\u0186\u00c4\5\u097c\u09a5\3\2\2\2\u097d\u097e\f\3\2\2\u097e\u097f"+
		"\t\21\2\2\u097f\u09a5\5\u0186\u00c4\3\u0980\u0981\f\33\2\2\u0981\u0982"+
		"\7P\2\2\u0982\u09a5\7=\2\2\u0983\u0984\f\32\2\2\u0984\u0985\7P\2\2\u0985"+
		"\u09a5\7.\2\2\u0986\u0987\f\31\2\2\u0987\u0988\7P\2\2\u0988\u098a\7\""+
		"\2\2\u0989\u098b\5\u0196\u00cc\2\u098a\u0989\3\2\2\2\u098a\u098b\3\2\2"+
		"\2\u098b\u098c\3\2\2\2\u098c\u09a5\5\u018e\u00c8\2\u098d\u098e\f\30\2"+
		"\2\u098e\u098f\7P\2\2\u098f\u0990\7+\2\2\u0990\u09a5\5\u019c\u00cf\2\u0991"+
		"\u0992\f\27\2\2\u0992\u0993\7P\2\2\u0993\u09a5\5\u0194\u00cb\2\u0994\u0995"+
		"\f\26\2\2\u0995\u0996\7L\2\2\u0996\u0997\5\u0186\u00c4\2\u0997\u0998\7"+
		"M\2\2\u0998\u09a5\3\2\2\2\u0999\u099a\f\25\2\2\u099a\u099c\7H\2\2\u099b"+
		"\u099d\5\u0180\u00c1\2\u099c\u099b\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u099e"+
		"\3\2\2\2\u099e\u09a5\7I\2\2\u099f\u09a0\f\22\2\2\u09a0\u09a5\t\22\2\2"+
		"\u09a1\u09a2\f\13\2\2\u09a2\u09a3\7\34\2\2\u09a3\u09a5\5\u0124\u0093\2"+
		"\u09a4\u0951\3\2\2\2\u09a4\u0954\3\2\2\2\u09a4\u0957\3\2\2\2\u09a4";
	private static final String _serializedATNSegment1 =
		"\u0962\3\2\2\2\u09a4\u0965\3\2\2\2\u09a4\u0968\3\2\2\2\u09a4\u096b\3\2"+
		"\2\2\u09a4\u096e\3\2\2\2\u09a4\u0971\3\2\2\2\u09a4\u0974\3\2\2\2\u09a4"+
		"\u0977\3\2\2\2\u09a4\u097d\3\2\2\2\u09a4\u0980\3\2\2\2\u09a4\u0983\3\2"+
		"\2\2\u09a4\u0986\3\2\2\2\u09a4\u098d\3\2\2\2\u09a4\u0991\3\2\2\2\u09a4"+
		"\u0994\3\2\2\2\u09a4\u0999\3\2\2\2\u09a4\u099f\3\2\2\2\u09a4\u09a1\3\2"+
		"\2\2\u09a5\u09a8\3\2\2\2\u09a6\u09a4\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7"+
		"\u0187\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a9\u09aa\7H\2\2\u09aa\u09ab\5\u0186"+
		"\u00c4\2\u09ab\u09ac\7I\2\2\u09ac\u09bf\3\2\2\2\u09ad\u09bf\7.\2\2\u09ae"+
		"\u09bf\7+\2\2\u09af\u09bf\5\u013e\u00a0\2\u09b0\u09bf\7=\2\2\u09b1\u09b2"+
		"\5\u0124\u0093\2\u09b2\u09b3\7P\2\2\u09b3\u09b4\7\13\2\2\u09b4\u09bf\3"+
		"\2\2\2\u09b5\u09b6\7\63\2\2\u09b6\u09b7\7P\2\2\u09b7\u09bf\7\13\2\2\u09b8"+
		"\u09bc\5\u0196\u00cc\2\u09b9\u09bd\5\u019e\u00d0\2\u09ba\u09bb\7.\2\2"+
		"\u09bb\u09bd\5\u01a0\u00d1\2\u09bc\u09b9\3\2\2\2\u09bc\u09ba\3\2\2\2\u09bd"+
		"\u09bf\3\2\2\2\u09be\u09a9\3\2\2\2\u09be\u09ad\3\2\2\2\u09be\u09ae\3\2"+
		"\2\2\u09be\u09af\3\2\2\2\u09be\u09b0\3\2\2\2\u09be\u09b1\3\2\2\2\u09be"+
		"\u09b5\3\2\2\2\u09be\u09b8\3\2\2\2\u09bf\u0189\3\2\2\2\u09c0\u09c1\5\u0196"+
		"\u00cc\2\u09c1\u09c2\5\u018c\u00c7\2\u09c2\u09c3\5\u0192\u00ca\2\u09c3"+
		"\u09ca\3\2\2\2\u09c4\u09c7\5\u018c\u00c7\2\u09c5\u09c8\5\u0190\u00c9\2"+
		"\u09c6\u09c8\5\u0192\u00ca\2\u09c7\u09c5\3\2\2\2\u09c7\u09c6\3\2\2\2\u09c8"+
		"\u09ca\3\2\2\2\u09c9\u09c0\3\2\2\2\u09c9\u09c4\3\2\2\2\u09ca\u018b\3\2"+
		"\2\2\u09cb\u09cd\7=\2\2\u09cc\u09ce\5\u0198\u00cd\2\u09cd\u09cc\3\2\2"+
		"\2\u09cd\u09ce\3\2\2\2\u09ce\u09d6\3\2\2\2\u09cf\u09d0\7P\2\2\u09d0\u09d2"+
		"\7=\2\2\u09d1\u09d3\5\u0198\u00cd\2\u09d2\u09d1\3\2\2\2\u09d2\u09d3\3"+
		"\2\2\2\u09d3\u09d5\3\2\2\2\u09d4\u09cf\3\2\2\2\u09d5\u09d8\3\2\2\2\u09d6"+
		"\u09d4\3\2\2\2\u09d6\u09d7\3\2\2\2\u09d7\u09db\3\2\2\2\u09d8\u09d6\3\2"+
		"\2\2\u09d9\u09db\5\u0128\u0095\2\u09da\u09cb\3\2\2\2\u09da\u09d9\3\2\2"+
		"\2\u09db\u018d\3\2\2\2\u09dc\u09de\7=\2\2\u09dd\u09df\5\u019a\u00ce\2"+
		"\u09de\u09dd\3\2\2\2\u09de\u09df\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1"+
		"\5\u0192\u00ca\2\u09e1\u018f\3\2\2\2\u09e2\u09fe\7L\2\2\u09e3\u09e8\7"+
		"M\2\2\u09e4\u09e5\7L\2\2\u09e5\u09e7\7M\2\2\u09e6\u09e4\3\2\2\2\u09e7"+
		"\u09ea\3\2\2\2\u09e8\u09e6\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09eb\3\2"+
		"\2\2\u09ea\u09e8\3\2\2\2\u09eb\u09ff\5\u011c\u008f\2\u09ec\u09ed\5\u0186"+
		"\u00c4\2\u09ed\u09f4\7M\2\2\u09ee\u09ef\7L\2\2\u09ef\u09f0\5\u0186\u00c4"+
		"\2\u09f0\u09f1\7M\2\2\u09f1\u09f3\3\2\2\2\u09f2\u09ee\3\2\2\2\u09f3\u09f6"+
		"\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09fb\3\2\2\2\u09f6"+
		"\u09f4\3\2\2\2\u09f7\u09f8\7L\2\2\u09f8\u09fa\7M\2\2\u09f9\u09f7\3\2\2"+
		"\2\u09fa\u09fd\3\2\2\2\u09fb\u09f9\3\2\2\2\u09fb\u09fc\3\2\2\2\u09fc\u09ff"+
		"\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fe\u09e3\3\2\2\2\u09fe\u09ec\3\2\2\2\u09ff"+
		"\u0191\3\2\2\2\u0a00\u0a02\5\u01a0\u00d1\2\u0a01\u0a03\5\u00f6|\2\u0a02"+
		"\u0a01\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0193\3\2\2\2\u0a04\u0a05\5\u0196"+
		"\u00cc\2\u0a05\u0a06\5\u019e\u00d0\2\u0a06\u0195\3\2\2\2\u0a07\u0a08\7"+
		"S\2\2\u0a08\u0a09\5\u00f4{\2\u0a09\u0a0a\7R\2\2\u0a0a\u0197\3\2\2\2\u0a0b"+
		"\u0a0c\7S\2\2\u0a0c\u0a0f\7R\2\2\u0a0d\u0a0f\5\u012a\u0096\2\u0a0e\u0a0b"+
		"\3\2\2\2\u0a0e\u0a0d\3\2\2\2\u0a0f\u0199\3\2\2\2\u0a10\u0a11\7S\2\2\u0a11"+
		"\u0a14\7R\2\2\u0a12\u0a14\5\u0196\u00cc\2\u0a13\u0a10\3\2\2\2\u0a13\u0a12"+
		"\3\2\2\2\u0a14\u019b\3\2\2\2\u0a15\u0a1c\5\u01a0\u00d1\2\u0a16\u0a17\7"+
		"P\2\2\u0a17\u0a19\7=\2\2\u0a18\u0a1a\5\u01a0\u00d1\2\u0a19\u0a18\3\2\2"+
		"\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1c\3\2\2\2\u0a1b\u0a15\3\2\2\2\u0a1b\u0a16"+
		"\3\2\2\2\u0a1c\u019d\3\2\2\2\u0a1d\u0a1e\7+\2\2\u0a1e\u0a22\5\u019c\u00cf"+
		"\2\u0a1f\u0a20\7=\2\2\u0a20\u0a22\5\u01a0\u00d1\2\u0a21\u0a1d\3\2\2\2"+
		"\u0a21\u0a1f\3\2\2\2\u0a22\u019f\3\2\2\2\u0a23\u0a25\7H\2\2\u0a24\u0a26"+
		"\5\u0180\u00c1\2\u0a25\u0a24\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26\u0a27\3"+
		"\2\2\2\u0a27\u0a28\7I\2\2\u0a28\u01a1\3\2\2\2\u012e\u01a3\u01a8\u01ae"+
		"\u01b6\u01bf\u01c4\u01cb\u01d2\u01d9\u01e0\u01e5\u01e9\u01ed\u01f1\u01f6"+
		"\u01fa\u01fe\u0208\u0210\u0217\u021e\u0222\u0225\u0228\u0231\u0237\u023c"+
		"\u023f\u0245\u024b\u024f\u0258\u025f\u0268\u026f\u0275\u0279\u0286\u028a"+
		"\u0292\u0297\u029b\u029e\u02a7\u02b4\u02be\u02c4\u02c8\u02d3\u02de\u02e3"+
		"\u02eb\u02ef\u02f1\u0300\u0308\u030b\u030f\u0314\u0318\u0323\u032c\u032e"+
		"\u0335\u033a\u0343\u0348\u034b\u0350\u0359\u0369\u0373\u0376\u037f\u0389"+
		"\u0391\u0394\u0397\u03a4\u03ad\u03ba\u03be\u03c2\u03c6\u03c8\u03ca\u03d0"+
		"\u03d7\u03e1\u03eb\u03f0\u03f9\u0401\u040a\u0421\u0424\u0427\u042f\u0433"+
		"\u043b\u0441\u044c\u0455\u045a\u0466\u046f\u0477\u047f\u0486\u0493\u049c"+
		"\u04a5\u04ab\u04b6\u04bb\u04c7\u04cb\u04cf\u04d3\u04d5\u04d9\u04de\u04f1"+
		"\u0507\u0517\u053f\u0555\u0558\u055e\u0560\u0573\u0575\u057e\u0580\u0584"+
		"\u0589\u058d\u0591\u0595\u059f\u05ab\u05b2\u05b5\u05b9\u05c5\u05ca\u05d0"+
		"\u05d2\u05d9\u05dd\u05ed\u05f2\u05f7\u05fd\u0605\u060e\u0613\u061a\u0621"+
		"\u0628\u062f\u0634\u0638\u063c\u0640\u0645\u0649\u064d\u0657\u065f\u0666"+
		"\u066d\u0671\u0674\u0677\u0680\u0686\u068b\u068e\u0694\u069a\u069e\u06a7"+
		"\u06ae\u06b7\u06be\u06c4\u06c8\u06d3\u06d7\u06df\u06e4\u06e8\u06f1\u06ff"+
		"\u0704\u070d\u0715\u071f\u0727\u072f\u0734\u0740\u0746\u074d\u0752\u075a"+
		"\u075e\u0760\u076f\u0777\u077a\u077e\u0783\u0787\u0792\u079b\u079d\u07a4"+
		"\u07a9\u07b2\u07b7\u07ba\u07bf\u07c8\u07d8\u07e2\u07e5\u07ee\u07f8\u0800"+
		"\u0803\u0806\u0813\u081b\u0820\u0828\u082c\u0830\u0834\u0836\u083a\u0840"+
		"\u084b\u0853\u085b\u0866\u086f\u0886\u0889\u088c\u0894\u0898\u08a0\u08a6"+
		"\u08b1\u08ba\u08bf\u08c9\u08d0\u08dd\u08e6\u08ef\u08f5\u0900\u0905\u0911"+
		"\u0915\u0919\u091d\u091f\u0923\u0928\u093b\u094f\u095f\u098a\u099c\u09a4"+
		"\u09a6\u09bc\u09be\u09c7\u09c9\u09cd\u09d2\u09d6\u09da\u09de\u09e8\u09f4"+
		"\u09fb\u09fe\u0a02\u0a0e\u0a13\u0a19\u0a1b\u0a21\u0a25";
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