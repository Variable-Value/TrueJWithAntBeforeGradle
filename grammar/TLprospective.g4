/*
 [The "BSD licence"]
 Copyright (c) 2014 George S. Cowan
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


/** T Language prospective grammar,
  grammar for Antlr 4
   Includes TJava based on Java 7 grammar at
    https://github.com/antlr/grammars-v4/tree/master/java7/Java7.g4

  A grammar for recording the eventual grammar for T. The various features do not
  have to be consistent, though they must be correctly formed Antlr 4 rules.
  */
grammar TLprospective;

import TJava;
// @header {
// package tlang; // provided in command line as "-package tlang"
// }



/*******************************************************************************
      Parser section
*******************************************************************************/

t_compilationUnit
  : t_packageDeclaration? t_importDeclaration* t_typeDeclaration* EOF
  ;

// note that annotations for a package are only allowed in a single place
// and that is recommended to be the package-info.java file.
t_packageDeclaration
  : t_annotation* 'package' t_qualifiedName ';'
  ;

t_importDeclaration
  : 'import' 'static'? t_qualifiedName ('.' '*')? ';'
  ;

t_typeDeclaration
  : t_classOrInterfaceModifier* t_classDeclaration
  | t_classOrInterfaceModifier* t_enumDeclaration
  | t_classOrInterfaceModifier* t_interfaceDeclaration
  | t_classOrInterfaceModifier* t_annotationTypeDeclaration
  | ';'
  ;

t_modifier
  : t_classOrInterfaceModifier
  | ( 'native'
    | 'synchronized'
    | 'transient'
    | 'volatile'
    )
  ;

t_classOrInterfaceModifier
  : t_annotation   // class or interface
  | ( 'public'     // class or interface
    | 'protected'  // class or interface
    | 'private'    // class or interface
    | 'static'     // class or interface
    | 'abstract'   // class or interface
    | 'transient'  // class only -- does not apply to interfaces
    | 'sequential' // class only -- does not apply to interfaces
    | 'final'      // class only -- does not apply to interfaces
    | 'strictfp'   // class or interface
    )
  ;

t_variableModifier
  : 'final'
  | t_annotation
  ;

t_classDeclaration
  : 'class' Identifier t_typeParameters?
      ('extends' t_type)?
      ('implements' t_typeList)?
      t_classBody
  ;

t_typeParameters
  : '<' ','? t_typeParameter (',' t_typeParameter)* ','? '>'
  ;

t_typeParameter
  : Identifier ('extends' t_typeBound)?
  ;

t_typeBound
  : '&'? t_type ('&' t_type)* '&'?
  ;

t_enumDeclaration
  : ENUM Identifier ('implements' t_typeList)?
      '{' t_enumConstants? ','? t_enumBodyDeclarations? '}'
  ;

t_enumConstants
  : ','? t_enumConstant (',' t_enumConstant)* ','?
  ;

t_enumConstant
  : t_annotation* Identifier t_arguments? t_classBody?
  ;

t_enumBodyDeclarations
  : ';' t_classBodyDeclaration*
  ;

t_interfaceDeclaration
  : 'interface' Identifier t_typeParameters? ('extends' t_typeList)? t_interfaceBody
  ;

t_typeList
  : ','? t_type (',' t_type)* ','?
  ;

t_classBody
  : '{' t_classBodyDeclaration* '}'
  ;

t_interfaceBody
  : '{' nomenclature t_interfaceBodyDeclaration* '}'
  ;

nomenclature // at most one of each
  : ( EXEMPLARS | SYNONYMS | PREFIXOPS | POSTFIXOPS | BINARYOPS )*
  ;

t_classBodyDeclaration
  : ';'
  | 'static'? t_initializer
  | t_modifier* t_memberDeclaration
  | t_testDeclaration
  ;

t_initializer
  : t_block
  ;

t_memberDeclaration
  : t_methodDeclaration
  | t_genericMethodDeclaration
  | t_fieldDeclaration
  | t_constructorDeclaration
  | t_genericConstructorDeclaration
  | t_interfaceDeclaration
  | t_annotationTypeDeclaration
  | t_classDeclaration
  | t_enumDeclaration
  ;


/** declare a test to be run at compile time
    Example:
    test swapAandB (.9) (.01)$ Swapper() {
      a = 1;
      b = 2;
      swap();
      assertThat("A has been swapped", a, is(2)); // JUnit and Hamcrest libs available
      assertThat("B has been swapped", b, is(0); // red test
    }

    A test failure is a compile failure. The confidence is a number from 0.0 to
    1.0; you may think of it as an informal judgement of the probability that
    the test will succeed. The expense level is a similar judgement from 0.0 to
    1.0 with 0.0 being an inexpensive test that is run on every compile and 1.0
    being an expensive test that is never run, but might be some day.

    The compiler default is to run tests with an expense of less than $(0.10)

    The constructor invocation Swapper() allows the code in the test block to have the
    same feel as that in a method. It is required unless the test has the
    'static' modifier. A static test allows testing of static class components
    and also allows you to create instances inside the test block, perhaps with
    factories and more complicated uses of constructors.

    The test code may use the conventions of JUnit and Hamcrest.
 */
t_testDeclaration
  : 'static'? 'test' Identifier '(' confidence ')' '$' '(' expense ')'
    (t_constructorDeclaration | t_genericConstructorDeclaration)?
    t_block
  ;

confidence: FloatingPointLiteral ; // 0.0 < confidence < 1.0

expense: FloatingPointLiteral ; // 0.0 (always) =< expense =< 1.0 (never)

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
t_methodDeclaration
  : (t_type|'void') Identifier t_formalParameters ('[' ']')*
      ('throws' t_qualifiedNameList)?
      (   t_methodBody
      | ';'
      )
			t_means?
  ;

t_genericMethodDeclaration
  : t_typeParameters t_methodDeclaration
  ;

t_constructorDeclaration
  : Identifier t_formalParameters ('throws' t_qualifiedNameList)?
      t_constructorBody
  ;

t_genericConstructorDeclaration
  : t_typeParameters t_constructorDeclaration
  ;

t_fieldDeclaration
  : ty=t_type t_fieldDeclarator[$ty.text] (',' t_fieldDeclarator[$ty.text])* ';'
  ;

t_fieldDeclarator[String idType]
  : t_idDeclaration[$idType] '=' t_variableInitializer   #InitializedField
  | t_idDeclaration[$idType]                             #UninitializedField
  ;

t_interfaceBodyDeclaration
  : t_modifier* t_interfaceMemberDeclaration
  | ';'
  ;

t_interfaceMemberDeclaration
  : t_constDeclaration
  | t_interfaceMethodDeclaration
  | t_genericInterfaceMethodDeclaration
  | t_interfaceDeclaration
  | t_annotationTypeDeclaration
  | t_classDeclaration
  | t_enumDeclaration
  ;

t_constDeclaration
  : ty=t_type t_constantDeclarator[$ty.text] (',' t_constantDeclarator[$ty.text])* ';'
  ;

t_constantDeclarator [String idType]
  : t_idDeclaration[$idType] '=' t_variableInitializer
  ;

// see matching of [] comment in methodDeclaratorRest
t_interfaceMethodDeclaration
  : (t_type|'void') Identifier t_formalParameters ('[' ']')*
      ('throws' t_qualifiedNameList)?
      ';'
  ;

t_genericInterfaceMethodDeclaration
  : t_typeParameters t_interfaceMethodDeclaration
  ;

t_annotationVariableDeclarator
  : t_annotationVariableDeclaratorId '=' t_variableInitializer
  ;

t_variableDeclarators [String idType]
  : t_variableDeclarator[$idType] (',' t_variableDeclarator[$idType])*
  ;

t_variableDeclarator [String idType]
  : t_initializedVariableDeclaratorId[$idType] '=' t_variableInitializer
  | t_uninitializedVariableDeclaratorId[$idType]
  ;

t_initializedVariableDeclaratorId [String idType]
  : t_idDeclaration[$idType]
  ;

t_uninitializedVariableDeclaratorId [String idType]
  : t_idDeclaration[$idType]
  ;

t_annotationVariableDeclaratorId
  : t_identifier ('[' ']')*
  ;

t_variableInitializer
  : t_arrayInitializer
  | t_expression
  ;

t_arrayInitializer
  : '{' (','? t_variableInitializer (',' t_variableInitializer)* (',')? )? '}'
  ;

t_packageOrTypeName
  : t_qualifiedName
  ;

t_enumConstantName
  : Identifier
  ;

t_typeName
  : t_qualifiedName
  ;

t_type
  : t_classOrInterfaceType ('[' ']')*
  | t_primitiveType ('[' ']')*
  ;

t_classOrInterfaceType
  : Identifier t_typeArguments? ('.' Identifier t_typeArguments? )*
  ;

t_primitiveType
  : 'boolean'
  | 'char'
  | 'byte'
  | 'short'
  | 'int'
  | 'long'
  | 'float'
  | 'double'
  ;

t_typeArguments
  : '<' ','? t_typeArgument (',' t_typeArgument)* ','? '>'
  ;

t_typeArgument
  : t_type
  | '?' (('extends' | 'super') t_type)?
  ;

t_qualifiedNameList
  : ','? t_qualifiedName (',' t_qualifiedName)* ','?
  ;

t_formalParameters
  : '(' t_formalParameterList? ')'
  ;

t_formalParameterList
  : ','? t_formalParameter (',' t_formalParameter)* (',' t_lastFormalParameter)? ','?
  | t_lastFormalParameter
  ;

t_formalParameter
  : t_variableModifier* ty=t_type t_initializedVariableDeclaratorId[$ty.text]
  ;

t_lastFormalParameter
  : t_variableModifier* ty=t_type '...' t_initializedVariableDeclaratorId[$ty.text]
  ;

t_methodBody
  : t_block
  ;

t_constructorBody
  : t_block
  ;

t_qualifiedName
  : t_identifier ('.' t_identifier)*
  ;

t_literal
  : IntegerLiteral
  | FloatingPointLiteral
  | CharacterLiteral
  | StringLiteral
  | BooleanLiteral
  | 'null'
  ;

// ANNOTATIONS

t_annotation
  : '@' t_annotationName ( '(' ( t_elementValuePairs | t_elementValue )? ')' )?
  ;

t_annotationName : t_qualifiedName ;

t_elementValuePairs
  : ','? t_elementValuePair (',' t_elementValuePair)* ','?
  ;

t_elementValuePair
  : Identifier '=' t_elementValue
  ;

t_elementValue
  : t_expression
  | t_annotation
  | t_elementValueArrayInitializer
  ;

t_elementValueArrayInitializer
  : '{' (','? t_elementValue (',' t_elementValue)* ','?)? '}'
  ;

t_annotationTypeDeclaration
  : '@' 'interface' Identifier t_annotationTypeBody
  ;

t_annotationTypeBody
  : '{' (t_annotationTypeElementDeclaration)* '}'
  ;

t_annotationTypeElementDeclaration
  : ';' // this is not allowed by the grammar, but apparently allowed by the Java compiler
  | t_modifier*
    ( t_type t_annotationMethodRest ';'
    | t_type t_annotationConstantRest ';'
  | t_classDeclaration ';'?
  | t_interfaceDeclaration ';'?
  | t_enumDeclaration ';'?
  | t_annotationTypeDeclaration ';'?
    )
  ;

t_annotationMethodRest
  : Identifier '(' ')' t_defaultValue?
  ;

t_annotationConstantRest
  : t_annotationVariableDeclarator (',' t_annotationVariableDeclarator)*
  ;

t_defaultValue
  : 'default' t_elementValue
  ;

// STATEMENTS / BLOCKS

t_block
  : '{' t_blockStatement* '}'
  ;

t_blockStatement
  : t_localVariableDeclarationStatement
  | t_statement
  | t_typeDeclaration
  ;

t_localVariableDeclarationStatement
  :  t_localVariableDeclaration ';'
  ;

t_localVariableDeclaration
  : t_variableModifier* ty=t_type t_variableDeclarators[$ty.text]
  ;

t_statement
  : t_block                                                                      # BlockStmt
  | ASSERT t_expression (':' t_expression)? ';'                                  # AssertStmt
  | 'if' t_parExpression t_statement ('else' t_statement)?                       # IfStmt
  | 'for' '(' t_forControl ')' t_statement                                       # Forstmt
  | 'while' t_parExpression t_statement                                          # Whilestmt
  | 'do' t_statement 'while' t_parExpression ';'                                 # Dostmt
  | 'try' t_block (t_catchClause+ t_finallyBlock? | t_finallyBlock)              # Trystmt
  | 'try' t_resourceSpecification t_block t_catchClause* t_finallyBlock?         # Trystmt
  | 'switch' t_parExpression '{' t_switchBlockStatementGroup* t_switchLabel* '}' # Switchstmt
  | 'synchronized' t_parExpression t_block                                       # Syncstmt
  | 'return' t_expression? ';'                                                   # Returnstmt
  | 'throw' t_expression ';'                                                     # Throwstmt
  | 'break' Identifier? ';'                                                      # Breakstmt
  | 'continue' Identifier? ';'                                                   # Continuestmt
  | ';'                                                                          # Emptystmt
	| t_assignment ';'                                                             # Assignstmt
  | t_methodCallStatement ';'                                                    # Callstmt
  | Identifier ':' t_statement                                                   # Labelstmt
  | t_means                                                                      # Meansstmt
  ;

t_assignment
  : t_assignable '=' t_expression
	;

t_assignable
  : (Identifier '.')* t_valueName ('.' Identifier)* // value name must be new
	;

t_locator
  : t_identifier ('.' t_identifier)* // one Identifier must be  either a class name or old value name
	     // TODO: allow general class names, e.g. generics
	;

t_methodCallStatement
  : t_locator '(' t_expressionList? ')'
  ;

t_catchClause
  : 'catch' '(' t_variableModifier* t_catchType t_identifier ')' t_block
  ;

t_catchType
  : t_qualifiedName ('|' t_qualifiedName)*
  ;

t_finallyBlock
  : 'finally' t_block
  ;

t_resourceSpecification
  : '(' ';'? t_resources ';'? ')'
  ;

t_resources
  : t_resource (';' t_resource)*
  ;

t_resource
  : t_variableModifier* ty=t_classOrInterfaceType
    t_initializedVariableDeclaratorId[$ty.text] '=' t_expression
  ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
t_switchBlockStatementGroup
  : t_switchLabel+ t_blockStatement+
  ;

t_switchLabel
  : 'case' t_constantExpression ':'
  | 'case' t_enumConstantName ':'
  | 'default' ':'
  ;

t_forControl
  : t_enhancedForControl
  | t_forInit? ';' t_expression? ';' t_forUpdate?
  ;

t_forInit
  : t_localVariableDeclaration
  | t_expressionList
  ;

t_enhancedForControl
  : t_variableModifier* t_type t_identifier ':' t_expression
  ;

t_forUpdate
  : t_expressionList
  ;

// EXPRESSIONS

t_parExpression
  : '(' t_expression ')'
  ;

t_expressionList
  : ','? t_expression (',' t_expression)* ','?
  ;

t_constantExpression
  : t_expression
  ;

t_expression // in order of most sticky to least sticky
  : t_primary                                                         # PrimaryExpr
  | t_expression '.' t_identifier                                     # DotExpr
  | t_expression '.' 'this'                                           # DotThisExpr
  | t_expression '.' 'new' t_nonWildcardTypeArguments? t_innerCreator # DotNewExpr
  | t_expression '.' 'super' t_superSuffix                            # DotSuperExpr
  | t_expression '.' t_explicitGenericInvocation                      # DotExplicitGenericExpr
  | t_expression '[' t_expression ']'                                 # ArrayExpr
  | t_expression '(' t_expressionList? ')'                            # FuncCallExpr
  | 'new' t_creator                                                   # NewExpr
  | '(' t_type ')' t_expression                                       # TypeCastExpr
  | ('+'|'-') t_expression                                            # SignExpr
  | '~' t_expression                                                  # BitComplementExpr
  | '!' t_expression                                                  # NotExpr
  | t_expression ('*'|'/'|'%') t_expression                           # MultiplicativeExpr
  | t_expression ('+'|'-') t_expression                               # AdditiveExpr
  | t_expression ('<' '<' | '>' '>' '>' | '>' '>') t_expression       # ShiftExpr
  | t_expression op=('<' | '<=' | '=' | '>=' | '>' | '!=')
                                          t_expression becauseOf?     # ConjRelationExpr
    // The becauseOf clause is included for use in equational proofs
    // with relational operators.
    // The allowed conjuctive sequence of operarators are
    //   * sequence of '='s with or without a single '!=' (in any position)
    //   * ascending  sequence including one or more of '<', '<=', or '='
    //   * descending sequence including one of more of '>', '>=', or '='
    // Note that == is not allowed in order to make a clean break with the Java
    // conventions (we can start with making it deprecated).

  | t_expression 'instanceof' t_type                                  # InstanceOfExpr
  | t_expression '&' t_expression                                     # AndExpr
  | t_expression '^' t_expression                                     # ExclusiveOrExpr
  | t_expression '|' t_expression                                     # OrExpr
  | t_expression '&&' t_expression                                    # ConditionalAndExpr
  | t_expression '||' t_expression                                    # ConditionalOrExpr
  | t_expression '?' t_expression ':' t_expression                    # ConditionalExpr

  // *****************************************************************
  //          * Expressions for explanation and proof *
  //
  // Level of stickiness is important for associating 'because' with the
  //   right-hand expression of the left-associative tree; for example,
  //   given boolean expressions A, B, ..., we can write
  //     A ==> G
  //       ( because  A
  //             ===  B      (because C)
  //             ==>  D && E (because F)
  //             ==>  G
  //       )

  //   The 'because' statement is not required to provide a complete proof of its
  //   preceding expression, but it does give us a place to prove supporting
  //   information or to reorder the search for a proof without writing a sequence
  //   of lemmas. The exact proof order of the above expression is
  //      prove: C .
  //      prove: A === B
  //      prove: F .
  //      prove: B ==> D && E .
  //      prove: D && E ==> G .
  //      prove: A ==> G .
  //
  // If 'because' is not stickier than the operators it follows, then it applies to
  //   everything before that. In the above example F is syntactically associated with the
  //   expression D && E, but semantically, F is proven and made available in the
  //   proof of B ==> D && E.
  // We need experience of mixing numeric compare becauseOf with logic becauseOf to see
  //   how to disambiguate them.
  //
  // *****************************************************************
  | t_expression becauseOf                                           # BecauseExpr
  //| t_expression '==' t_expression                                 # ConjEqualsExpr
  | t_expression op=('<==' | '===' | '=!='| '==>') t_expression      # ConjunctiveBoolExpr
      // Allowed conjunctive chains:
      //   A sequence of ===
      //   A sequence of === with a single embedded =!=, which implies =!=
      //   A sequence of intermixed === and ==>, which implies ==>
      //   A sequence of intermixed === and <==, which implies <==
      //   Other sequences are prohibited, such as A ==> B =!= C <== D,
      //                             which implies (A =!= D) | (A === false)
//  | t_expression            // only = assignment allowed so these are invalid
//      (  '='<assoc=right>
//      | '+='<assoc=right> // a' += 'b would be a' = <a'current> + 'b
//      | '-='<assoc=right> // perhaps this would be understandable
//      | '*='<assoc=right> // perhaps we could use an a'current for every variable a
//      | '/='<assoc=right>
//      | '&='<assoc=right>
//      | '|='<assoc=right>
//      | '^='<assoc=right>
//      | '>>='<assoc=right>
//      | '>>>='<assoc=right>
//      | '<<='<assoc=right>
//      | '%='<assoc=right>
//      )
//      t_expression
  ;

// ComparesBecauseExpr //  is this needed for chaining relational operators:
                       //  '<' | '<=' | '=' | '>=' | '>' | '!='
//   :     '(' 'compares' becauseOf
//         ')'                                                          // # ComparesBecauseExpr
//         // if one of the above expressions has a label then all must
//         // (semantic check for when there is a preceding ('<' | '<=' | '=') in parent context)
//
//         ','? labeledExpresion (',' labeledExpresion)* ','
//   ;

becauseOf
  :     '(' 'because' ','? labeledExpresion
                     (','  labeledExpresion)*
                      ','?
        ')'
  ;

/** having a labeledExpression rule allows us to associate each
 *  label with a particular exprssion
 */
labeledExpresion
  : (Identifier ':')? t_expression
  | priorLabel  // where is this used, why doesn't it need an ':'?
                // is this reusing an expression from earlier by just naming its lable?
  ;

priorLabel : Identifier;

t_primary // any changes must coordinate with TLantlrProofVisitor.isBooleanPrimary()
  : t_parExpression
  | 'this'
  | 'super'
  | t_literal
  | t_identifier
  | t_type '.' 'class'
  | 'void' '.' 'class'
  | t_nonWildcardTypeArguments (t_explicitGenericInvocationSuffix | 'this' t_arguments)
  ;

t_creator
  : t_nonWildcardTypeArguments t_createdName t_classCreatorRest
  | t_createdName (t_arrayCreatorRest | t_classCreatorRest)
  ;

t_createdName
  : t_identifier t_typeArgumentsOrDiamond? ('.' t_identifier t_typeArgumentsOrDiamond?)*
  | t_primitiveType
  ;

t_innerCreator
  : t_identifier t_nonWildcardTypeArgumentsOrDiamond? t_classCreatorRest
  ;

t_arrayCreatorRest
  : '['
      (   ']' ('[' ']')* t_arrayInitializer
      | t_expression ']' ('[' t_expression ']')* ('[' ']')*
      )
  ;

t_classCreatorRest
  : t_arguments t_classBody?
  ;

t_explicitGenericInvocation
  : t_nonWildcardTypeArguments t_explicitGenericInvocationSuffix
  ;

t_nonWildcardTypeArguments
  : '<' t_typeList '>'
  ;

t_typeArgumentsOrDiamond
  : '<' '>'
  | t_typeArguments
  ;

t_nonWildcardTypeArgumentsOrDiamond
  : '<' '>'
  | t_nonWildcardTypeArguments
  ;

t_superSuffix
  : t_arguments
  | '.' t_identifier t_arguments?
  ;

t_explicitGenericInvocationSuffix
  : 'super' t_superSuffix
  | t_identifier t_arguments
  ;

t_arguments
  : '(' t_expressionList? ')'
  ;

t_means
  : MEANS t_expression ';'
  ;

t_idDeclaration [String idType]
  : t_identifier ('[' ']' {$idType = $idType+"[]";})*
  ;

t_identifier
  : t_identifierToken
  ;

t_identifierToken
  : Identifier      # T_Java_Identifier
	| PreValueName    # T_PreValueName
	| MidValueName    # T_MidValueName
	| PostValueName   # T_PostValueName
	;

t_valueName
  : PreValueName
	| MidValueName
	| PostValueName
	;


/*******************************************************************************
      Lexer section
*******************************************************************************/

// §3.9 Keywords ( Java keywords are also listed here to keep from having them
//                 overridden by other lexer rules in the T language)

ABSTRACT      : 'abstract';
ASSERT        : 'assert';
AXIOM         : 'axiom';
BECAUSE       : 'because';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'class';
COMPARES      : 'compares';
CONST         : 'const';
CONSTRAINT    : 'constraint';
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
FORMAL        : 'formal';
IF            : 'if';
GIVEN         : 'given';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
INT           : 'int';
INTERFACE     : 'interface';
JAVA          : 'java';
LEMMA         : 'lemma';
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
SYNONYMS      : 'synonyms';
TEST          : 'test';
THEOREM       : 'theorem';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TLANGUAGE     : 'tlanguage' ;
TRANSIENT     : 'transient';
TRY           : 'try';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';

// §3.11 Separators

BECOMES       : '-->';
DOLLAR        : '$'  ;

// §3.12 Operators

// Conjunctive Boolean Operators

CONJUNCTIVE_BOOLEAN_EQUAL : '===';
CONJUNCTIVE_IMPLIES       : '==>';
CONJUNCTIVE_CONSEQUENCE   : '<==';
CONJUNCTIVE_NOT_EQUAL     : '=!=';

// §3.8 Identifiers (must appear after all keywords in the grammar)
//      but valueNames are OK because none of the keywords contain apostrophe

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
// Whitespace and comments (just overriding "skip")
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
