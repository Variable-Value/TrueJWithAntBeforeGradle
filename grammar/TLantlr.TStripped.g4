/*
 [The "BSD licence"]
 Copyright (c) 2013 George S. Cowan
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
  notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
  notice, this list of conditions and the following disclaimer in the
  documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
  derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/


/** T Language, version 0.00a
  grammar for Antlr 4
   Includes TJava based on Java 7 grammar at
    https://github.com/antlr/grammars-v4/tree/master/java7/Java7.g4

  TODO: Correctly parses sequences of assignment statements to primatives in methods.
        Other parts of the system will generate working Java and verify the logic.
  */
grammar TLantlr;

import TJava;
// @header {
// package tlang; // provided in command line as "-package tlang"
// }



/*******************************************************************************
      Parser section
*******************************************************************************/

compilationUnit
  : packageDeclaration? importDeclaration* typeDeclaration* EOF
  ;

// note that annotations for a package are only allowed in a single place
// and that is recommended to be the package-info.java file.
packageDeclaration
  : annotation* 'package' qualifiedName ';'
  ;

importDeclaration
  : 'import' 'static'? qualifiedName ('.' '*')? ';'
  ;

typeDeclaration
  : classOrInterfaceModifier* classDeclaration
  | classOrInterfaceModifier* enumDeclaration
  | classOrInterfaceModifier* interfaceDeclaration
  | classOrInterfaceModifier* annotationTypeDeclaration
  | ';'
  ;

modifier
  : classOrInterfaceModifier
  | ( 'native'
    | 'synchronized'
    | 'transient'
    | 'volatile'
    )
  ;

classOrInterfaceModifier
  : annotation       // class or interface
  | (   'public'     // class or interface
    | 'protected'  // class or interface
    | 'private'    // class or interface
    | 'static'     // class or interface
    | 'abstract'   // class or interface
    | 'final'      // class only -- does not apply to interfaces
    | 'strictfp'   // class or interface
    )
  ;

variableModifier
  : 'final'
  | annotation
  ;

classDeclaration
  : 'class' Identifier typeParameters?
    ('extends' type)?
    ('implements' typeList)?
    classBody
  ;

typeParameters
  : '<' typeParameter (',' typeParameter)* '>'
  ;

typeParameter
  : Identifier ('extends' typeBound)?
  ;

typeBound
  : type ('&' type)*
  ;

enumDeclaration
  : ENUM Identifier ('implements' typeList)?
      '{' enumConstants? ','? enumBodyDeclarations? '}'
  ;

enumConstants
  : enumConstant (',' enumConstant)*
  ;

enumConstant
  : annotation* Identifier arguments? classBody?
  ;

enumBodyDeclarations
  : ';' classBodyDeclaration*
  ;

interfaceDeclaration
  : 'interface' Identifier typeParameters? ('extends' typeList)? interfaceBody
  ;

typeList
  : type (',' type)*
  ;

classBody
  : '{' classBodyDeclaration* '}'
  ;

interfaceBody
  : '{' interfaceBodyDeclaration* '}'
  ;

classBodyDeclaration
  : ';'
  | 'static'? initializer
  | modifier* memberDeclaration
  ;

initializer
  : block
  ;

memberDeclaration
  : methodDeclaration
  | genericMethodDeclaration
  | fieldDeclaration
  | constructorDeclaration
  | genericConstructorDeclaration
  | interfaceDeclaration
  | annotationTypeDeclaration
  | classDeclaration
  | enumDeclaration
  ;

/* We use this rule even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
  :   (type|'void') Identifier formalParameters ('[' ']')*
      ('throws' qualifiedNameList)?
      ( methodBody
      | ';'
      )
      means?
  ;

genericMethodDeclaration
  : typeParameters methodDeclaration
  ;

constructorDeclaration
  : Identifier formalParameters ('throws' qualifiedNameList)?
      constructorBody
  ;

genericConstructorDeclaration
  : typeParameters constructorDeclaration
  ;

fieldDeclaration
  : ty=type fieldDeclarator[$ty.text] (',' fieldDeclarator[$ty.text])* ';'
  ;

fieldDeclarator[String idType]
  : idDeclaration[$idType] '=' variableInitializer   #InitializedField
  | idDeclaration[$idType]                             #UninitializedField
  ;

interfaceBodyDeclaration
  : modifier* interfaceMemberDeclaration
  | ';'
  ;

interfaceMemberDeclaration
  : constDeclaration
  | interfaceMethodDeclaration
  | genericInterfaceMethodDeclaration
  | interfaceDeclaration
  | annotationTypeDeclaration
  | classDeclaration
  | enumDeclaration
  ;

constDeclaration
  : ty=type constantDeclarator[$ty.text] (',' constantDeclarator[$ty.text])* ';'
  ;

constantDeclarator [String idType]
  : idDeclaration[$idType] '=' variableInitializer
  ;

// see matching of [] comment in methodDeclaratorRest
interfaceMethodDeclaration
  : (type|'void') Identifier formalParameters ('[' ']')*
      ('throws' qualifiedNameList)?
      ';'
  ;

genericInterfaceMethodDeclaration
  : typeParameters interfaceMethodDeclaration
  ;

annotationVariableDeclarator
  : annotationVariableDeclaratorId '=' variableInitializer
  ;

variableDeclarators [String idType]
  : variableDeclarator[$idType] (',' variableDeclarator[$idType])*
  ;

variableDeclarator [String idType]
  : initializedVariableDeclaratorId[$idType] '=' variableInitializer
  | uninitializedVariableDeclaratorId[$idType]
  ;

initializedVariableDeclaratorId [String idType]
  : idDeclaration[$idType]
  ;

uninitializedVariableDeclaratorId [String idType]
  : idDeclaration[$idType]
  ;

annotationVariableDeclaratorId
  : identifier ('[' ']')*
  ;

variableInitializer
  : arrayInitializer
  | enterExprs
  ;

arrayInitializer
  : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
  ;

packageOrTypeName
  : qualifiedName
  ;

enumConstantName
  : Identifier
  ;

typeName
  : qualifiedName
  ;

type
  : classOrInterfaceType ('[' ']')*
  | primitiveType ('[' ']')*
  ;

classOrInterfaceType
  : Identifier typeArguments? ('.' Identifier typeArguments? )*
  ;

primitiveType
  : 'boolean'
  | 'char'
  | 'byte'
  | 'short'
  | 'int'
  | 'long'
  | 'float'
  | 'double'
  ;

typeArguments
  : '<' typeArgument (',' typeArgument)* '>'
  ;

typeArgument
  : type
  | '?' (('extends' | 'super') type)?
  ;

qualifiedNameList
  : qualifiedName (',' qualifiedName)*
  ;

formalParameters
  : '(' formalParameterList? ')'
  ;

formalParameterList
  : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
  | lastFormalParameter
  ;

formalParameter
  : variableModifier* ty=type initializedVariableDeclaratorId[$ty.text]
  ;

lastFormalParameter
  : variableModifier* ty=type '...' initializedVariableDeclaratorId[$ty.text]
  ;

methodBody
  : block
  ;

constructorBody
  : block
  ;

qualifiedName
  : identifier ('.' identifier)*
  ;

literal
  : IntegerLiteral
  | FloatingPointLiteral
  | CharacterLiteral
  | StringLiteral
  | BooleanLiteral
  | 'null'
  ;

// ANNOTATIONS

annotation
  : '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
  ;

annotationName : qualifiedName ;

elementValuePairs
  : elementValuePair (',' elementValuePair)*
  ;

elementValuePair
  : Identifier '=' elementValue
  ;

elementValue
  : enterExprs
  | annotation
  | elementValueArrayInitializer
  ;

elementValueArrayInitializer
  : '{' (elementValue (',' elementValue)*)? (',')? '}'
  ;

annotationTypeDeclaration
  : '@' 'interface' Identifier annotationTypeBody
  ;

annotationTypeBody
  : '{' (annotationTypeElementDeclaration)* '}'
  ;

annotationTypeElementDeclaration
  : ';' // this is not allowed by the grammar, but apparently allowed by the Java compiler
  | modifier*
    ( type annotationMethodRest ';'
    | type annotationConstantRest ';'
    | classDeclaration ';'?
    | interfaceDeclaration ';'?
    | enumDeclaration ';'?
    | annotationTypeDeclaration ';'?
    )
  ;

annotationMethodRest
  : Identifier '(' ')' defaultValue?
  ;

annotationConstantRest
  : annotationVariableDeclarator (',' annotationVariableDeclarator)*
  ;

defaultValue
  : 'default' elementValue
  ;

// STATEMENTS / BLOCKS

block
  : '{' blockStatement* '}'
  ;

blockStatement
  : localVariableDeclaration ';'
  | statement
  | typeDeclaration
  ;

localVariableDeclaration
  : variableModifier* ty=type variableDeclarators[$ty.text]
  ;

statement
  : block                                                                      # BlockStmt
  | ASSERT enterExprs (':' enterExprs)? ';'                                  # AssertStmt
  | 'if' parExpression statement ('else' statement)?                       # IfStmt
  | 'for' '(' forControl ')' statement                                       # ForStmt
  | 'while' parExpression statement                                          # WhileStmt
  | 'do' statement 'while' parExpression ';'                                 # DoStmt
  | 'try' block (catchClause+ finallyBlock? | finallyBlock)              # TryStmt
  | 'try' resourceSpecification block catchClause* finallyBlock?         # TryStmt
  | 'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}' # SwitchStmt
  | 'synchronized' parExpression block                                       # SyncStmt
  | 'return' enterExprs? ';'                                                   # ReturnStmt
  | 'throw' enterExprs ';'                                                     # ThrowStmt
  | 'break' Identifier? ';'                                                      # BreakStmt
  | 'continue' Identifier? ';'                                                   # ContinueStmt
  | ';'                                                                          # EmptyStmt
	| assignable '=' enterExprs ';'                                            # AssignStmt
  | enterExprs '(' expressionList? ')' ';'                                   # CallStmt
  | enterExprs '.' 'new' nonWildcardTypeArguments? innerCreator            # CreationStmt
  | Identifier ':' statement                                                   # LabelStmt
  | means                                                                      # MeansStmt
  ;

assignable // left hand side or method argument referring to a modified object
  : identifier
  ;

catchClause
  : 'catch' '(' variableModifier* catchType identifier ')' block
  ;

catchType
  : qualifiedName ('|' qualifiedName)*
  ;

finallyBlock
  : 'finally' block
  ;

resourceSpecification
  : '(' resources ';'? ')'
  ;

resources
  : resource (';' resource)*
  ;

resource
  : variableModifier* ty=classOrInterfaceType
    initializedVariableDeclaratorId[$ty.text] '=' enterExprs
  ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
  : switchLabel+ blockStatement+
  ;

switchLabel
  : 'case' constantExpression ':'
  | 'case' enumConstantName ':'
  | 'default' ':'
  ;

forControl
  : enhancedForControl
  | forInit? ';' enterExprs? ';' forUpdate?
  ;

forInit
  : localVariableDeclaration
  | expressionList
  ;

enhancedForControl
  : variableModifier* type identifier ':' enterExprs
  ;

forUpdate
  : expressionList
  ;

// EXPRESSIONS

parExpression
  : '(' enterExprs ')'
  ;

expressionList
  : enterExprs (',' enterExprs)*
  ;

constantExpression
  : enterExprs
  ;

enterExprs // creates visitor method for setting valueAccessState = reference;
  : expression
  ;

expression
  : primary                                                         # PrimaryExpr
  | expression '.' identifier                                     # DotExpr
  | expression '.' 'this'                                           # DotThisExpr
  | expression '.' 'new' nonWildcardTypeArguments? innerCreator # DotNewExpr
  | expression '.' 'super' superSuffix                            # DotSuperExpr
  | expression '.' explicitGenericInvocation                      # DotExplicitGenericExpr
  | expression '[' expression ']'                                 # ArrayExpr
  | expression '(' (expression (',' expression)*)? ')'          # FuncCallExpr
  | 'new' creator                                                   # NewExpr
  | '(' type ')' expression                                       # TypeCastExpr
  | ('+'|'-') expression                                            # SignExpr
  | '~' expression                                                  # BitComplementExpr
  | '!' expression                                                  # NotExpr
  | expression ('*'|'/'|'%') expression                           # MultiplicativeExpr
  | expression ('+'|'-') expression                               # AdditiveExpr
  | expression ('<' '<' | '>' '>' '>' | '>' '>') expression       # ShiftExpr
  | expression ('<=' | '>=' | '>' | '<') expression               # CompareExpr
  | expression 'instanceof' type                                  # InstanceOfExpr
  | expression ('!=' | '=') expression                            # EqualityExpr // not assignment
  | expression '&' expression                                     # AndExpr
  | expression '^' expression                                     # ExclusiveOrExpr
  | expression '|' expression                                     # OrExpr
  | expression '&&' expression                                    # ConditionalAndExpr
  | expression '||' expression                                    # ConditionalOrExpr
  | expression '?' expression ':' expression                    # ConditionalExpr
//  | expression            // only = assignment allowed
//      (  '='<assoc=right>
//      | '+='<assoc=right>
//      | '-='<assoc=right>
//      | '*='<assoc=right>
//      | '/='<assoc=right>
//      | '&='<assoc=right>
//      | '|='<assoc=right>
//      | '^='<assoc=right>
//      | '>>='<assoc=right>
//      | '>>>='<assoc=right>
//      | '<<='<assoc=right>
//      | '%='<assoc=right>
//      )
//      expression
  ;

primary
  : '(' expression ')'
  | 'this'
  | 'super'
  | literal
  | identifier
  | type '.' 'class'
  | 'void' '.' 'class'
  | nonWildcardTypeArguments (explicitGenericInvocationSuffix | 'this' arguments)
  ;

creator
  : nonWildcardTypeArguments createdName classCreatorRest
  | createdName (arrayCreatorRest | classCreatorRest)
  ;

createdName
  : identifier typeArgumentsOrDiamond? ('.' identifier typeArgumentsOrDiamond?)*
  | primitiveType
  ;

innerCreator
  : identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
  ;

arrayCreatorRest
  : '['
      (   ']' ('[' ']')* arrayInitializer
      | expression ']' ('[' expression ']')* ('[' ']')*
      )
  ;

classCreatorRest
  : arguments classBody?
  ;

explicitGenericInvocation
  : nonWildcardTypeArguments explicitGenericInvocationSuffix
  ;

nonWildcardTypeArguments
  : '<' typeList '>'
  ;

typeArgumentsOrDiamond
  : '<' '>'
  | typeArguments
  ;

nonWildcardTypeArgumentsOrDiamond
  : '<' '>'
  | nonWildcardTypeArguments
  ;

superSuffix
  : arguments
  | '.' identifier arguments?
  ;

explicitGenericInvocationSuffix
  : 'super' superSuffix
  | identifier arguments
  ;

arguments
  : '(' expressionList? ')'
  ;

means
  : MEANS '(' enterExprs ')' ';'
  ;

idDeclaration [String idType]
  : identifier ('[' ']' {$idType = $idType+"[]";})*
  ;

identifier
  : identifierToken
  ;

identifierToken
  : Identifier
	| PreValueName
	| MidValueName
	| PostValueName
	;

valueName
  : PreValueName
  | MidValueName
  | PostValueName
  ;


/*******************************************************************************
      Lexer section
*******************************************************************************/

// §3.9 Keywords

ABSTRACT      : 'abstract';
ASSERT        : 'assert';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'class';
CONST         : 'const';
CONTINUE      : 'continue';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
EXTENDS       : 'extends';
FINAL         : 'final';
FINALLY       : 'finally';
FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
INT           : 'int';
INTERFACE     : 'interface';
LONG          : 'long';
MEANS         : 'means';
NATIVE        : 'native';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
SHORT         : 'short';
STATIC        : 'static';
STRICTFP      : 'strictfp';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TRANSIENT     : 'transient';
TRY           : 'try';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';

// §3.8 Identifiers (must appear after all keywords in the grammar)

PreValueName
  : SingleQuote  JavaLetter JavaLetterOrDigit*
	;

MidValueName
  : JavaLetter JavaLetterOrDigit* SingleQuote JavaLetterOrDigit+
	;

PostValueName
  : JavaLetter JavaLetterOrDigit* SingleQuote
  ;

fragment
SingleQuote : '\'' ;


//
// Whitespace and comments - (just overriding "skip")
//

WS
  : [ \r\t\u000C\n]+ -> channel(HIDDEN)
  ;

COMMENT
  : '/*' .*? '*/'    -> channel(HIDDEN)
  ;

LINE_COMMENT
  : '//' ~[\r\n]*    -> channel(HIDDEN)
  ;
