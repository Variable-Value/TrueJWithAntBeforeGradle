REM Reset the environment to the one in the src\T_Translator directory
rm *.java *.jjt *.jj *.class *.new *.bak
REM cp ../../src/T_Translator/*.java .
cp ../../src/T_Translator/TLanguage.jjt .
REM cp ../TestCases/testcase.java .

REM Generate and compile the code for the T_Translator
call jjtree TLanguage.jjt 
REM call javacc Java1.5.jj
REM javac -cp .. Main.java

REM test the new T_Translator
REM java -cp .. T_Translator.Main testcase.java > New.java

pause