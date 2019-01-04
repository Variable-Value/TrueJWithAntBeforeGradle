package tlang;

import static org.junit.Assert.*;

import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import tlang.JavaFileHandler;


public class JavaFileHandlerTest {

private final static String slash = File.separator;
private static final List<String> noCommandLineArguments = Arrays.asList("");
private static final String
  tempDir = System.getProperty("java.io.tmpdir") + "JavaFileHandlerTest";
private static final String
  tempLocation = tempDir + slash + "targetDir";

@AfterClass
public static void deleteTempLocation() throws IOException {
  TUtil.deleteDirectory(tempDir);
}

@Test
public void
testIntermixedJavaFile() {
  JavaFileHandler jFiler = new JavaFileHandler(tempLocation+slash+"Abc"+slash+"Def", noCommandLineArguments);
  jFiler.saveIntermixedJava("C:"+slash+"Xyz"+slash+"Abc.java");
  jFiler.saveIntermixedJava("Uvw"+slash+"Def.java");
  List<String> src = jFiler.getJavaSourceLocations();
  assertEquals("C:"+slash+"Xyz"+slash+"Abc.java", src.get(0));
  assertEquals("Uvw"+slash+"Def.java", src.get(1));
}

@Test
public void
testGenTFileWithoutDir() throws IOException {
  JavaFileHandler jFiler = new JavaFileHandler(tempLocation, noCommandLineArguments);
  jFiler.saveGeneratedJava("class Abc {}", "", "Abc");
  jFiler.saveGeneratedJava("class Defg {}", "a.bb", "Defg");
  List<String> src = jFiler.getJavaSourceLocations();
  assertEquals(tempLocation+slash+"Abc.java", src.get(0));
  assertEquals(tempLocation+slash+"a"+slash+"bb"+slash+"Defg.java", src.get(1));
}

@Test
public void
testCurrentDirTFileWithGenDir() throws IOException {
  final String dir = tempLocation + slash + ".."+slash+"gen";
  JavaFileHandler jFiler = new JavaFileHandler(dir, noCommandLineArguments);
  jFiler.saveGeneratedJava("class Abc {}", "", "Abc");
  jFiler.saveGeneratedJava("class Defg {}", "a.bb", "Defg");
  List<String> src = jFiler.getJavaSourceLocations();
  assertEquals(dir+slash+"Abc.java", src.get(0));
  assertEquals(dir+slash+"a"+slash+"bb"+slash+"Defg.java", src.get(1));
}

@Test
public void
testCurrentDirTFileWithGenDirSlash() throws IOException {
  final String dir = tempLocation + slash + ".."+slash+"gen"+slash;
  JavaFileHandler jFiler = new JavaFileHandler(dir, noCommandLineArguments);
  jFiler.saveGeneratedJava("class Abc {}", "", "Abc");
  jFiler.saveGeneratedJava("class Defg {}", "a.bb", "Defg");
  List<String> src = jFiler.getJavaSourceLocations();
  assertEquals(dir+"Abc.java", src.get(0));
  assertEquals(dir+"a"+slash+"bb"+slash+"Defg.java", src.get(1));
}

@Test
public void
testValidRunCommand() throws IOException, InterruptedException {
  JavaFileHandler jFiler = new JavaFileHandler(tempLocation, noCommandLineArguments);
  List<String> listFilesCommand = Arrays.asList("javac","-version");
  System.out.println("**** Console Output for testValidRunCommand ***");
  CollectingMsgListener msgCollector = new CollectingMsgListener();
  int result = jFiler.runCommand(msgCollector, listFilesCommand);
  System.out.println(msgCollector.lines());
  System.out.println();
  assertTrue(result==0);
}

@Test
public void
testInvalidRunCommand() throws IOException, InterruptedException {
  JavaFileHandler jFiler = new JavaFileHandler(tempLocation, noCommandLineArguments);
  List<String> listFilesCommand = Arrays.asList("javac","-abracadabra");
  System.out.println("**** Console Output for testInvalidRunCommand ***");
  CollectingMsgListener msgCollector = new CollectingMsgListener();
  int result = jFiler.runCommand(msgCollector, listFilesCommand);
  System.out.println(msgCollector.lines());
  System.out.println("result: "+ result);
  System.out.println();
  assertTrue(result>0);
}

@Ignore // spike: verify understanding of backslashes in String.split()
@Test
public void
testSaveJavaSplit() {
  String[] expecteds = {"aaa","bbb","ccc"};
  String[] actuals = "aaa.bbb.ccc".split("\\.");
  assertArrayEquals(expecteds, actuals);
}

}
