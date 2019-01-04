REM Reset the environment to the one in the src\T_Translator directory
rm *.java *.jjt *.jj *.class *.new *.bak
cp ../../src/T_Translator/*.java .
cp ../../src/T_Translator/TLanguage.jjt .
cp ../TestCases/testcase.java .

@echo *
@echo * READY TO BEGIN T TRANSLATOR JJT
@echo *
@echo BEGINNING jjTree
call jjtree TLanguage.jjt 

@echo *
@echo * READY TO BEGIN T TRANSLATOR JavaCC
@echo *
pause
@echo BEGINNING JavaCC
call javacc TLanguage.jj

@echo *
@echo * READY TO BEGIN T TRANSLATOR Compile with javac
@echo *
pause
@echo BEGINNING JavaC
javac -cp .. Main.java

@echo *
@echo * READY TO BEGIN T TRANSLATOR Test
@echo *
pause
@echo BEGINNING Java
java -cp .. T_Translator.Main testcase.java > New.java

@echo ******************************** 
@echo ********************************
@echo ****** TEST RESULT *************
type New.java
@echo ********************************
@echo * TEST COMPLETE FOR T TRANSLATOR
@echo ********************************
pause
