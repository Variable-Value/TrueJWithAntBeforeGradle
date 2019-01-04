package tlang;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

import static tlang.TUtil.*;

/**
 * Java files may be compiled along with T files, and also the T Compiler
 * generates a Java file corresponding to each T compilation unit. This class
 * controls the writing of the generated files and the compilation of all the
 * Java files.
 *
 * @author George S. Cowan
 *
 */
public class JavaFileHandler {

private final String generatedFileLocation; // without any final file separator
private List<String> runParameters;

//TODO: either change the implementation to set or change the comment
/** IMPLEMENTATION NOTE: We use a set to avoid storing duplicates. Entries for
 * both generated files and any Java files intermixed with the T
 * source files have the same form. The entries are of the form
 * <p><code>mydir/lowerdir/*.java</code> or <code>*.java</code>
 *                                            (for the default package)</p>
 */
private List<String> javaSourceLocations = new ArrayList<>();
  List<String> getJavaSourceLocations() { return javaSourceLocations; }


/**
 * Construction of the JavaFileHandler requires the generatedLocation and the
 * command-line argument for compilerInput
 *
 * @param generatedLocation The location where generated Java files
 *            corresponding to T source files are to be placed. An empty string
 *            indicates that the files should be placed at the location from
 *            which the T compiler was executed. (Any Java files intermixed with
 *            T source files are left in place and do not require a location.)
 *            If the generatedLocation is temporary it is the responsibility of
 *            the calling program to delete it.
 * @param runParameters The filtered array of Java command-line argument Strings
 *            that were passed to the T compiler. Note that this is a List of
 *            Strings, not an Array of Strings. The arguments must be
 *            pre-filtered to remove all source files and all T-specific
 *            arguments, leaving only valid Java command-line options. The javac
 *            command is prefixed when the command-line compiler is invoked and
 *            should therefore not be included as part of the runParameters.
 */
public // constructor
JavaFileHandler( String generatedLocation
               , List<String> runParameters
               ) {
  if (generatedLocation.endsWith(File.separator)) {
    int lastFileSlash = generatedLocation.lastIndexOf(File.separator);
    this.generatedFileLocation = generatedLocation.substring(0, lastFileSlash);
  } else {
    this.generatedFileLocation = generatedLocation;
  }
  this.runParameters               = runParameters;
}

/**
 * Save a .java source file that was intermixed with the .t source files.
 *
 * @param location The path of a Java source file as provided to the
 *                 T compiler. Therefore, the string will end with ".java".
 */
public void
saveIntermixedJava(String location) {
  javaSourceLocations.add(location);
}

/**
 * Writes the generated Java file corresponding to a T file to the correct
 * location and saves that location for later submission
 * to a command-line invocation of javac.
 *
 * @param compilationUnit The complete translation of the T compilation
 *                        unit into Java
 * @param packageName     The package from the T file
 * @param className       The public class name of the T file
 *
 * @throws IOException    Thrown when the directory for the package cannot be
 *                        created or when the file cannot be written
 */
public void
saveGeneratedJava( String compilationUnit, String packageName, String className)
      throws IOException
{ final String packageLocation = packagePath(packageName);
  ensureDirExists(packageLocation);
  javaSourceLocations.add(packageLocation + File.separator + className + ".java");
  try (PrintWriter javaWriter = newJavaWriter(packageLocation, className)) {
    javaWriter.print(compilationUnit);
  }
}

/** The directory path including the common path used for all generated files
 *  together with the additional directory names for this specific package
 * @param packageName the package as specified in the program (with periods)
 * @return the path without an ending file name separator (slash)
 */
private String packagePath(String packageName) {
  final Character sep = File.separatorChar;
  final String packPath
      = (packageName == "") ? "" : sep + packageName.replace('.', sep);
  return generatedFileLocation + packPath;
} //TODO: use File or Path to concatenate a path

private static PrintWriter
newJavaWriter(String dir, String className) throws IOException {
  final File javaFile = new File(dir, className +".java");
  try {
    return new PrintWriter(new BufferedWriter(new FileWriter(javaFile)));
  } catch (IOException e) {
    String msg = e.getMessage() +"\nCould not create writer for "+ javaFile;
    throw(new IOException(msg));
  }
}

/**
 * Submit the generated Java files and any Java files that were intermixed with
 * the T files to a command-line javac for compilation.
 *
 * @throws IOException
 * @throws InterruptedException
 */
public void
compileJavaFiles(CollectingMsgListener msgCollector)
      throws IOException, InterruptedException {
  if (javaSourceLocations.isEmpty())
    return;

  final List<String> javac = Arrays.asList("javac");
  //TODO: write javaSourceLocations to a file theSrc and use with @theSrc parameter
  runCommand(msgCollector, javac, runParameters, javaSourceLocations);
}


@SafeVarargs /* but only because commandChunks are never aliased as other than
                array of Collection<String>, e.g., no
                   Object[] x = commandChunks;    */
static int
runCommand(CollectingMsgListener msgCollector, Collection<String>... commandChunks)
      throws IOException, InterruptedException {
  List<String> commandList = new ArrayList<>(40);
  for (Collection<String> chunk : commandChunks) {
    commandList.addAll(chunk);
  }
  Process javacProcess = new ProcessBuilder(commandList).redirectErrorStream(true)
                                                        .start();
  BufferedInputStream javaMsgs = new BufferedInputStream(javacProcess.getInputStream());
  StringBuilder msgBuilder = new StringBuilder();
  try (Scanner msgScanner = new Scanner(javaMsgs)) {
    while (msgScanner.hasNextLine()) {
      final String nextLine = msgScanner.nextLine();
      msgBuilder.append(isWhiteSpace(nextLine) ? "" : nextLine + System.lineSeparator());
    }
  }
  if (msgBuilder.length()>0) {
    msgCollector.collectError(msgBuilder.toString());
  }
  return javacProcess.waitFor();
}

} // end class JavaFileHandler

