package tlang;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

// CompileToTemp: class
/**
 * Provide a connection to the Java compiler, if it is available in the
 * System provided tools. This is not used because the command-line compiler
 * offers the complete set of options and the system provided Java compiler
 * does not. If implemented this class can be used like
 *
 * String topQualifiedName = packageName +"."+ typeName;
 * StringWriter msgs = new StringWriter();
 * wasSuccessful = comp.compileString(topQualifiedName, javaCodeFromT, options, msgs);
 * final String compileMsgs = msgs.toString();
 * if (compileMsgs.length() > 0) {
 *    if (wasSuccessful) { msgCollector.collectMsg  (compileMsgs); }
 *    else               { msgCollector.collectError(compileMsgs); }
 *  }

 *
 * @author George Cowan
 * @deprecated Use JavaFileHandler class instead
 */
@Deprecated public class CompileToTemp {

private final JavaCompiler compiler;
private final boolean internalCompilerIsAvailable;
@SuppressWarnings("unused") // will be needed if we start using this approach
  private final boolean writeJavaFilesForCompilation;
private StandardJavaFileManager fileManager = null;
private final DiagnosticCollector<JavaFileObject> diagnostics = null; // i.e., st err instead
private final List<String> noAnnotationClasses = null;

private final Path dir = Paths.get("temp", "java", "classes"); // temp/java/classes
private  final File dirPath = dir.toFile();

public CompileToTemp(CollectingMsgListener msgCollector) throws IOException {
  compiler = ToolProvider.getSystemJavaCompiler();
  internalCompilerIsAvailable = (compiler != null);
  if                            (internalCompilerIsAvailable) {
    fileManager = compiler.getStandardFileManager(null, null, null);
    dirPath.mkdirs();
    fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(dirPath));
      //fileManager.setLocation(StandardLocation.SOURCE_PATH, singleDirList);
      //fileManager.setLocation(StandardLocation.CLASS_PATH, singleDirList);
  } else {
    msgCollector.collectMsg("No System Java Compiler is available and the feature to write files for Java compilation is not yet available.");
    throw new RuntimeException("ERROR: "+ msgCollector.toString());
  }
  writeJavaFilesForCompilation = ! internalCompilerIsAvailable;
}

/**
 * @param javaClassName Qualified name of the Visible Class, e.g., <pre>tryit.testit.SimpleClass</pre>
 * @param javaClassSource Full source of the compile unit, e.g., <pre>package tryit.testit; class SimpleClass {}</pre>
 * @param options
 */
boolean compileString(String javaClassName, String javaClassSource, Iterable<String> options, StringWriter compilerOutput) {
  List<JavaSourceFromString> compilationUnits
      = Arrays.asList(new JavaSourceFromString(javaClassName, javaClassSource));


  CompilationTask task
      = compiler.getTask( compilerOutput, fileManager, diagnostics
                        , options, noAnnotationClasses, compilationUnits
                        );
  return task.call();
}

/**
 * @param javaFileNames Qualified names of the Visible Class, e.g.,
 *   <pre> String[] javaFileNameArray = {"file1.java", "package\subpackage\file2.java"};
           List<String> javaFileNames = Arrays.asList(javaFileNameArray);
     </pre>
 * @param options
 */
StringWriter compileFiles(List<String> javaFileNames, Iterable<String> options) {
  StringWriter compilerOutput = new StringWriter();      // i.e., st err instead
  Iterable<? extends JavaFileObject> compilationUnits
      = fileManager.getJavaFileObjectsFromStrings(javaFileNames);
  compiler.getTask( compilerOutput, fileManager, diagnostics, options
                  , noAnnotationClasses, compilationUnits
                  )
          .call();
  return compilerOutput;
}


private static final class JavaSourceFromString extends SimpleJavaFileObject {

  final String sourceCode;

  JavaSourceFromString(String compilationUnitName, String sourceCode) {
    super( URI.create("string:///" + compilationUnitName.replace('.','/') + Kind.SOURCE.extension)
         , Kind.SOURCE
         );
    this.sourceCode = sourceCode;
  }

  @Override
  public CharSequence getCharContent(boolean ignoreEncodingErrors) {
    return sourceCode;
  }

} // inner class JavaSourceFromString

}

