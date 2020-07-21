package tlang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.jdt.annotation.Nullable;
import static tlang.TLantlrParser.*;

/**
 * Utility methods used in both the compiler and testing, but somehow they are
 * not in the compiler itself.
 * @author cowan
 */
public class TUtil {

static final HashMap<String,String> EMPTY_HASH_MAP = new HashMap<>(0);
static final HashSet<String> EMPTY_HASH_SET = new HashSet<>(0);
static final char decorator = '\'';
static final String decoratorString = "'";

@SuppressWarnings("null") // Arrays.asList performs unchecked conversion
final static List<Integer> decoratedTokenTypes
    = Arrays.asList(TLantlrParser.PreValueName,
                    TLantlrParser.PostValueName,
                    TLantlrParser.MidValueName);

/**
 * Read file as a token stream.
 * @param fileToParse
 * @param msgCollector
 * @return CommonTokenStream built from file input
 * @throws IOException
 */
public static CommonTokenStream
fileToTokens(String fileToParse, CollectingMsgListener msgCollector)
      throws IOException {
  try {
    ANTLRFileStream inputStream = new ANTLRFileStream(fileToParse);
    return charsToTokens(inputStream, msgCollector);
  } catch (FileNotFoundException e) {
    msgCollector.collectError("ERROR: File "+ fileToParse +" was not found. " + e.getMessage());
    throw e;
  } catch (IOException e) {
    msgCollector.collectError("ERROR: "+ fileToParse +" could not be read. " + e.getMessage());
    throw e;
  }
}

public static CommonTokenStream
truejStringToTokens(String name, String tStringToParse, CollectingMsgListener msgCollector) {
  final ANTLRInputStream inputStream = new ANTLRInputStream(tStringToParse);
  inputStream.name = name;
  if (tStringToParse == "") {
    msgCollector.collectError("ERROR: TrueJ Language code is empty for " + name);
  }
  return charsToTokens(inputStream, msgCollector);
}

public static CommonTokenStream
charsToTokens(final ANTLRInputStream inputStream, final CollectingMsgListener msgCollector) {
  final JavaUnicodeInputStream input = new JavaUnicodeInputStream(inputStream);
  // translates Unicode escapes to Unicode characters
  final TLantlrLexer lexer = new TLantlrLexer(input);
  lexer.removeErrorListeners();
  lexer.addErrorListener(msgCollector);
  return new CommonTokenStream(lexer);
}

public static boolean
validFileName(String fileName) {
  return (fileName.endsWith(".t") || fileName.endsWith(".java"));
}

    public static boolean
fileNameErrorReporting( TCompilerCounts counts
                      , CollectingMsgListener msgCollector
                      , String fileName
                      ) {
  if ( ! validFileName(fileName)) {
    msgCollector.collectError(fileName +" must be either a .t or a .java file");
    //TODO: just use the simple file name (after the last "/" or "\")
    counts.incErrorCount();
    return true;
  } else {
    return false;
  }
}


    /**
     * Parse the stream of tokens that is loaded into the T language parser.
     * Attempt SLL parsing. If there are errors or complications,
     * revert to the slower, but more thorough, LL parsing.
     * @param parser Generated parser from Antlr
     * @param msgCollector
     * @param counts A fresh collector for statistics from the parse
     * @return Resulting parse tree
     */
    public static ParseTree
fastParse( TLantlrParser parser  // added parameter
         //, CommonTokenStream tokenStream  // removed parameter
         , CollectingMsgListener msgCollector
         , TCompilerCounts counts
         ) {
  ParseTree tree = null;
  // final TLantlrParser parser = new TLantlrParser(tokenStream);
  final CommonTokenStream tokenStream = (CommonTokenStream)parser.getTokenStream();
  parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
  parser.removeErrorListeners();
  parser.setErrorHandler(new BailErrorStrategy());
  final String sourceName = parser.getSourceName();
  try {
    if (sourceName.endsWith(".java")) {
      counts.incJavaParseCount();
      tree = parser.compilationUnit();
    } else {
      counts.incTCodeCount();
      tree = parser.t_compilationUnit();
    }
  } catch (ParseCancellationException ex) {
    counts.incCatchSLLCount();
    // throw RuntimeException if this is a serious error
    // RecognitionException's just start Phase II of the parser
    //   to locate and report the synax mistake in the T language program
    if (  ! (ex.getCause() instanceof RecognitionException) ) {
      throw ex;
    }
    else { // revert to the slower LL parsing
      msgCollector.collectMsg( tokenStream.getSourceName()
                             + ": SLL parsing failed; LL parsing was used"
                             );
      tokenStream.reset();
      parser.getInterpreter().setPredictionMode(PredictionMode.LL);
      parser.addErrorListener(msgCollector); // error listeners removed above
      // parser.addErrorListener(new DiagnosticErrorListener()); // TODO remove from production, leave in special test program
      parser.setErrorHandler(new DefaultErrorStrategy());
      if (sourceName.endsWith(".java")) {
        // counts.incJavaParseCount(); // already counted above
        tree = parser.compilationUnit();
      } else {
        // counts.incTCodeCount(); // already counted above
        tree = parser.t_compilationUnit();
      }
    }
  } // end catch ParseCancellationException
  return tree;
}

    public static boolean
compileSource(String packageName, String typeName, String javaCodeFromT
             , JavaFileHandler javaMgr
             , CollectingMsgListener msgCollector
             ) throws IOException, InterruptedException
{ javaMgr.saveGeneratedJava(javaCodeFromT, packageName, typeName);
  javaMgr.compileJavaFiles(msgCollector);
  /* I would like to use the internal compiler but it doesn't implement all the
   * commandline options. See my issue at Java site.
   * Meanwhile, I have deprecated the CompileToTemp class
   */
  // TODO translate Java errors to correspond to T code
  boolean wasSuccessful = true;
  return wasSuccessful;
}

 final static String variableName(final Token valueNameToken) {
   return variableName(valueNameToken.getText());
 }

final public static String
variableName(String valueName) {
  final int pos = decoratorPosition(valueName);
  if      (pos == -1) { return valueName; }                  // return abc for abc
  else if (pos ==  0) { return valueName.substring(1); }     // return abc for 'abc
  else                { return valueName.substring(0,pos); } // return abc for abc' or abc'de
}


final public static int decoratorPosition(String valueName) {
  return valueName.indexOf(decorator);
}

final public static boolean isDecorated(Token valueToken) {
  return decoratedTokenTypes.contains(valueToken.getType());
}

final public static boolean isDecorated(String valueName) {
  return valueName.contains(decoratorString);
}

final public static boolean isUndecorated(Token valueToken) {
  return valueToken.getType() == UndecoratedIdentifier;
}

final public static boolean isUndecorated(String valueName) {
  return (! isDecorated(valueName)); //TODO: remove this line
}

final public static boolean isMidDecorated(Token valueToken) { // e.g., abc'de
  return valueToken.getType() == MidValueName;
}

final public static boolean isMidDecorated(String valueName) { // e.g., abc'de
  final int pos = decoratorPosition(valueName);
  return ( pos > 0                    // e.g., not abc or 'abc
        && pos < valueName.length()-1 // e.g., not abc'
         );
}

final public static boolean isInitialDecorated(Token valueToken) {
  return valueToken.getType() == PreValueName; // e.g., 'abc
}

final public static boolean isInitialDecorated(String valueName) {
  return valueName.startsWith(decoratorString); // e.g., 'abc
}

final public static boolean hasCorrectFinalDecoration(Token valueToken) {
  return ! TCompiler.isRequiringDecoratedFinalValue && isUndecorated(valueToken)
      || isFinalDecorated(valueToken);
}

final public static boolean hasCorrectFinalDecoration(String valueName) {
  return ! TCompiler.isRequiringDecoratedFinalValue && isUndecorated(valueName)
      || isFinalDecorated(valueName);
}

final public static boolean isFinalDecorated(Token valueToken) {
  return valueToken.getType() == PostValueName; // e.g., abc'
}

final public static boolean isFinalDecorated(String valueName) {
  return valueName.endsWith(decoratorString) ; // e.g., abc'
}

public static void printMap(java.util.Map<String, String> map) {
  for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() +" --> "+ entry.getValue());
  }
}

boolean isMissing(Optional<?> optional) {
  return !optional.isPresent();
}

/** the string argument is all white space or empty
 * @param stringToCheck
 * @return true if only spaces, newlines, returns, and tabs (or if empty string)
 */
public static boolean isWhiteSpace(String stringToCheck) {
  for (int i = 0; i < stringToCheck.length(); i++) {
    final char ch = stringToCheck.charAt(i);
    if ( ! (ch==' ' || ch=='\n' || ch=='\r'|| ch=='\t'))
      return false;
  }
  return true;
}

/**
 * Create a directory if it does not already exist
 * @param dir The desired directory.
 *            Use the empty string "" for the current execution directory
 * @throws IOException
 */
public static void
ensureDirExists(String dir) throws IOException {
  if (dir == "")
    return;

  final File dirAsFile = new File(dir);
  if (dirAsFile.isDirectory())
    return;

  final boolean success = dirAsFile.mkdirs();
  if ( ! success)
    throw new IOException
      ("Could not create directory at location: <"+ dirAsFile.getPath() +">");
}

/** Recursively deletes a directory and everything it contains
 * @param dirPathName Directory to delete as a string
 * @throws IOException
 */
public static void
deleteDirectory(String dirPathName) throws IOException {
  File dirAsFile = new File(dirPathName);
  if ( ! dirAsFile.exists() )
    return;

  Path path = dirAsFile.toPath();
  if (path == null) {
    final String errMsg = "There was a problem with the path name: "+ dirPathName;
    throw new FileNotFoundException(errMsg);
  }
  deleteDirectory(path);
}

/** Recursively deletes a directory and everything it contains
 * @param dirPathName Directory to delete
 * @throws IOException
 */
public static void deleteDirectory(@Nullable Path dirPathName)
      throws IOException {
  Files.walkFileTree(dirPathName, new DeletionVisitor());
}

/**
 * Provides the methods to recursively delete everything in a directory.
 */
    /* nested */ private static class
DeletionVisitor extends SimpleFileVisitor<Path> {

  public DeletionVisitor() {}

      @Override public FileVisitResult
  visitFile(Path file, @Nullable BasicFileAttributes attrs) throws IOException {
    Files.delete(file);
    return FileVisitResult.CONTINUE;
  }

      @Override public FileVisitResult
  postVisitDirectory(Path dir, @Nullable IOException ex) throws IOException {
    if (ex != null)
      throw ex;

    Files.delete(dir);
    return FileVisitResult.CONTINUE;
  }

} // end nested class DeletionVisitor


    /* nested */ public static class
TCompilerCounts {
  private int tCodeCount        = 0;
  private int javaParseCount    = 0;
  private int catchSLLCount     = 0;
  private int errorCount        = 0;
  private int tCompileCount     = 0;
  private int javaPassThruCount = 0;

  public void incTCodeCount()        { tCodeCount++;        }
  public void incJavaParseCount()    { javaParseCount++;    }
  public void incJavaPassThruCount() { javaPassThruCount++; }
  public void incTCompileCount()     { tCompileCount    ++; }

  public void incCatchSLLCount()     { catchSLLCount++;  }
  public void incErrorCount()        { errorCount++;     }

  public boolean hasError()          { return errorCount > 0; }
  public boolean noErrors()          { return ! hasError();   }

  @Override
  public String toString() {
    StringBuilder msg = new StringBuilder(200);
    if (tCodeCount > 0) {
      msg.append("Encountered "+ tCodeCount
                +" T language files\n");
    }
    if (javaPassThruCount > 0) {
      msg.append("Passed "+ javaPassThruCount
          +" Java files directly to Java compiler\n");
    }
    if (javaParseCount > 0) {
      msg.append("Parsed "+ javaParseCount +" Java compile units\n");
    }
    if (tCompileCount > 0) {
      msg.append("Compiled "+ tCompileCount +" T language compile units\n");
    }
    if (catchSLLCount > 0) {
      msg.append("Programs that required LL parsing: " + catchSLLCount +"\n");
    }
    if (errorCount > 0) {
      msg.append("Programs with errors: " + errorCount +"\n");
    }
    return msg.toString();
  }

} // end nested class TCompilerCounts


} // end class TUtil
