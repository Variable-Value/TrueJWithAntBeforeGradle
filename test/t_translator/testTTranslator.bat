REM Reset the environment to the one in the src\T_Translator directory

REM But first, save the old list of Abstract Syntax Tree nodes for comparison

cp TParserVisitor.java TParserVisitor.java.OLD

rm *.java *.jjt *.jj *.class *.new *.bak
cp ../../src/T_Translator/*.java .
cp ../../src/T_Translator/TLanguage.jjt .
cp ../TestCases/testcase.java .

@echo *
@echo * BEGINNING T TRANSLATOR JJT
@echo *
call jjtree TLanguage.jjt 

@echo *
@echo * BEGINNING T TRANSLATOR JavaCC
@echo *
call javacc TLanguage.jj

@echo *
@echo * BEGINNING T TRANSLATOR Compile with javac
@echo *
javac -cp .. Main.java
@echo *
@echo * if we get a message that 
@echo *   ..\T_Translator\UnparseVisitor.java:34: T_Translator.UnparseVisitor is
@echo *   not abstract and does not override abstract method 
@echo *   visit(T_Translator.ASTxxxxxxxxxxxx,java.lang.Object) 
@echo *   in T_Translator.TParserVisitor
@echo * then we can compare TParserVistor.java to TParserVistor.java.OLD to 
@echo *   quickly find a prototype to modify for UnparseVisitor.java 
@echo *

@echo *
@echo * BEGINNING T TRANSLATOR Test
@echo *
java -cp .. T_Translator.Main testcase.java > New.java

@echo ******************************** 
@echo ********************************
@echo ****** TEST RESULT *************
type New.java
@echo ********************************
@echo * TEST COMPLETE FOR T TRANSLATOR
@echo ********************************
pause
