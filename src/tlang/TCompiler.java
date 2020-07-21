/*
 * TCompiler.java - Parse input against the TLantlr.g4 grammar
 *
 * [The "BSD licence"]
 * Copyright (c) 2012 George S. Cowan
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package tlang;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.format.DateTimeFormatter.*;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.jdt.annotation.NonNull;

import tlang.TUtil.TCompilerCounts;
import static tlang.TUtil.*;

/**
 * TCompiler.java parses T language files against the TLantlr.g4 grammar.
 * Related Java source files may be compiled in the same run.
 * <p>
 * For command line options see the code in the method
 * {@link #ParameterCollector.exitWithCommandLineFormatError(String)}
 */
public class TCompiler {

/**
 * List of options for the Java compiler (after translation of TrueJ to Java).
 */
private static List<String> javaCompilerOptions = new ArrayList<>();

// RUNTIME PARAMETERS                      Default values
static boolean xDiagnostics                        = false;
static boolean xJavaTestOption                     = false;
static boolean isGeneratedFilesDirectoryRequested  = false;
static boolean isRequiringDecoratedFinalValue       = false;
static boolean isCompileUnitInCommandLine          = false;

static String commandLineCompileUnit = "";

private  CollectingMsgListener msgCollector = new CollectingMsgListener();
  public CollectingMsgListener msgCollector() { return msgCollector; }
private  CollectingMsgListener javaMessages = new CollectingMsgListener("Java Compiler");
  public CollectingMsgListener javaMessages() { return javaMessages; }
private  TCompilerCounts counts = new TCompilerCounts();
  public TCompilerCounts counts() { return counts; }
private final Map<RuleContext, Scope> scopeMap = new HashMap<>();
private ParameterCollector parameterCollector = new ParameterCollector();

private String generatedJavaDir;



public TCompiler() {
  msgCollector.clear();
  scopeMap.clear();
  generatedJavaDir
    =   System.getProperty("java.io.tmpdir") +"generatedTJava"
      + File.separator+ System.getProperty("user.name")
      + File.separator+ ZonedDateTime.now().format(ISO_LOCAL_DATE_TIME).replace(":", "-");
}

/** Compile TrueJ programs.
 *
 * @implNote The compiler.parameterCollector.checkForParameters(args) method must ensure
 *           that each file name is non-null before inserting it into the files list.
 *           .
 * @param args See {@link #checkForParameters(String[])} to see the options that
 *    you can use; the options are followed by a list of T and Java files to
 *    compile.
 * @throws Exception
 */
@SuppressWarnings({"all", "null"}) // null check misses @NonNull String @NonNull [] files
    public static void
main(String[] args) throws Exception {
  runTrueJCompiler(args);
}

static TCompiler runTrueJCompiler(String[] args) throws IOException, InterruptedException {
  TCompiler truejCompiler = new TCompiler();
  final @NonNull String @NonNull [] files = truejCompiler.parameterCollector.checkForParameters(args);
  truejCompiler.sequentialParse(files); // null checking misses @NonNull String @NonNull [] for files
  return truejCompiler;
}

    private void
sequentialParse(String[] fileNames) throws IOException, InterruptedException {
  JavaFileHandler javaCollector
    = new JavaFileHandler( generatedJavaDir, javaCompilerOptions);

  CommonTokenStream tokenStream;
  if (isCompileUnitInCommandLine) {
    String name = "the compile unit from the command line";
    tokenStream = truejStringToTokens(name, commandLineCompileUnit, msgCollector);
    compileTokens(tokenStream, name, counts, javaCollector);
  }
  else {
    tryingEachFileName: for (String fileName : fileNames) {
      msgCollector.newSource(fileName);
      boolean fileDone = specialFileCases(javaCollector, counts, fileName);
      if (fileDone)
        continue tryingEachFileName;

      tokenStream = fileToTokens(fileName, msgCollector);
      compileTokens(tokenStream, fileName, counts, javaCollector);
    }
  }

  javaCollector.compileJavaFiles(javaMessages);
  if (javaMessages.hasMsgs())
    System.out.println("Java Compiler Messages\n"+ javaMessages.toString());
  if ( ! isGeneratedFilesDirectoryRequested)
    deleteDirectory(generatedJavaDir);
  System.out.println(counts.toString());
}

private void compileTokens(CommonTokenStream tokenStream, String sourceName,
                                       TCompilerCounts counts, JavaFileHandler javaCollector) {
  TLantlrParser parser = new TLantlrParser(tokenStream);
  ParseTree tree = fastParse(parser, msgCollector, counts);

  if (msgCollector.hasNoErrs()) { // only errors are issued by the parser
    ContextCheckVisitor sourceInfo
      = new ContextCheckVisitor(tree, msgCollector, scopeMap);
    sourceInfo.visit(tree);
    String topQualifiedName = sourceInfo.getCompoundTypeName();
    checkNameAgreement(topQualifiedName, sourceName);
    if (msgCollector.hasNoErrs()) {
      ExtendedRewriter rewriter = new ExtendedRewriter(tokenStream);
      saveGenerated(javaCollector, sourceInfo, tree, rewriter, tokenStream);
      counts.incTCompileCount();
    }
  }
  if (msgCollector.hasNoErrs()) {
    // TODO Run tests and collect any test errors
  }
  if (msgCollector.hasNoErrs()) {
    // TODO Generate SAT checks and collect any errors
  }
  if (msgCollector.hasNoErrs()) {
    TLantlrProofVisitor.proveCorrectness(tree, tokenStream, scopeMap, msgCollector);
    /* TODO: Would be good to do proof checking after compile to avoid trivial errors
     * but I want to shell out to the compiler a single time.
     * So perhaps the best thing to do is to check for the first proof checking error
     * and if I find one, shell out to the compiler immediately to collect any errors
     * Then if there are no compile errors, continue proof checking.
     */
    /* TODO: Use Proof carrying code - note that this requires instrumenting the
     *       generated java before compile (or recompile)
     */
  }
  if (msgCollector.hasNoErrs()) {
    // TODO Generate semantic web page for the public class of the run unit
  }
  if (msgCollector.hasErrs()) {
    counts.incErrorCount();
  }
  if (msgCollector.hasMsgs()) {
    System.out.println(msgCollector.toString());
  }
}

/**
 * Check and deal with special cases and errors:
 * <ul>
 * <li> invalid file suffix (must be .t or .java)
 * <li> using parser ambiguity check instead of compile
 * <li> compiling java instead of T language
 * </ul>
 */
private boolean specialFileCases(JavaFileHandler javaCollector,
                                 TCompilerCounts counts,
                                 String fileName)
    throws IOException, ParseCancellationException
{
  if (fileNameErrorReporting(counts, msgCollector, fileName))
    return true;

  if (xDiagnostics) {
    AmbiguityDetection(fileName, msgCollector, counts);
    return true;
  }
  if (fileName.endsWith(".java")) {
    if (xJavaTestOption) {
      testJavaParsing(fileName, counts);
    } else {
      javaCollector.saveIntermixedJava(fileName);
      counts.incJavaPassThruCount();
    }
    return true;
  }
  // otherwise
  return false;
}

    private static void
AmbiguityDetection(String fileName
                  , CollectingMsgListener msgCollector
                  , TCompilerCounts counts
                  ) throws IOException {
  CommonTokenStream tokenStream = fileToTokens(fileName, msgCollector);
  final TLantlrParser parser = new TLantlrParser(tokenStream);
  parser.removeErrorListeners();
  parser.addErrorListener(msgCollector);
  parser.addErrorListener(new DiagnosticErrorListener());
  parser.setErrorHandler(new DefaultErrorStrategy());
  parser.getInterpreter()
          .setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
  final String sourceName = parser.getSourceName();
  if (sourceName.endsWith(".java")) {
    parser.compilationUnit();
    counts.incJavaParseCount();
  } else {
    parser.t_compilationUnit();
    counts.incTCodeCount();
  }
  if (msgCollector.hasErrs())
    counts.incErrorCount();
  System.out.println("Ambiguity Detection Messages for "+ fileName +": \n"+ msgCollector.toString());
}

    private void
testJavaParsing(String fileName, TCompilerCounts counts)
      throws IOException, ParseCancellationException
{ CommonTokenStream tokenStream = fileToTokens(fileName, msgCollector);
  TLantlrParser parser = new TLantlrParser(tokenStream);
  fastParse(parser, msgCollector, counts);
  if (msgCollector.hasMsgs()) {
    counts.incErrorCount();
    System.out.println("Parsing messages for "+ fileName +":\n"+ msgCollector.toString());
  }
}

//    private void
//saveJavaSrc( String fileName, ParseTree tree) {
//  // msgCollector.newSource("Error check");
//  SemanticsCheckVisitor sourceInfo
//    = new SemanticsCheckVisitor(tree, msgCollector, scopeMap);
//  String topQualifiedName = sourceInfo.getCompoundTypeName();
//  checkNameAgreement(topQualifiedName, fileName);
//}

    private void
checkNameAgreement(String topQualifiedName, String fileName) {
      if (isCompileUnitInCommandLine)
        return;

      String fileType = fileName.substring(fileName.lastIndexOf('.'));
      String adjustedFileName = fileName.replace(File.separatorChar, '.').replace('/', '.');
      String adjustedTopName = topQualifiedName + fileType;
      if ( ! adjustedFileName.endsWith(adjustedTopName)) {
        msgCollector.collectError("Top qualified name "+ topQualifiedName + " must agree with file name "+ fileName);
      }
    }

    private void
saveGenerated( JavaFileHandler javaCollector
             , ContextCheckVisitor semanticCheckResults
             , ParseTree tree
             , @SuppressWarnings("unused") ExtendedRewriter rewriter
                // will need later for other outputs to be compiled, e.g., tests
             , CommonTokenStream tokens
             ) {
  if (msgCollector.hasNoErrs()) {
    String javaCodeFromT
        = TLantlrRewriteVisitor.treeToJava(tree, tokens, scopeMap);
    final String topTypeName = semanticCheckResults.getTopTypeName();
    final String packageName = semanticCheckResults.getPackageName();
    try {
      javaCollector.saveGeneratedJava(javaCodeFromT, packageName, topTypeName);
    } catch (IOException e) {
      String pkg;
      if (packageName == null)    { pkg = "null package"; }
      else if (packageName == "") { pkg = "default package"; }
      else                        { pkg = "package "+ packageName; }
      msgCollector.collectError
          ("Unable to save generated Java file for class "+ topTypeName
          +" in "+ pkg
          +"\n" + e.getMessage()
          );
    }
//        boolean succcessful = TUtil.compileSource
//                                ( topQualifiedName, javaCodeFromT
//                                , comp, javaCompilerOptions, msgCollector
//                                );
//        if (msgCollector.hasMsgs()) {
//          System.out.println( "The Java Compiler issued the following msgs: "
//                            + msgCollector.toString()
//                            );
//        }
  }
}

  private class ParameterCollector {

    public ParameterCollector() {
      //javaCompilerOptions.clear();
      javaCompilerOptions.add("-d");
      String quote = "\"";
      javaCompilerOptions.add(quote +"."+ quote);
      javaCompilerOptions.add("-cp");
      javaCompilerOptions.add("build"+ System.getProperty("file.separator") +"prod");
    }

    /**
     * Captures the T and Java command-line parameters and creates field settings
     * for all the T paramenters, and collects the Java command-line parameters into the
     * field {@link #javaCompilerOptions} for later use when the Java compiler is run.
     * The individual command-line options that are checked here are documented
     * in the method {@link #exitWithCommandLineFormatError(String[] args, String msg)}.
     * @param args The command-line arguments from {@link #main(String[])}
     * @return A list of T and Java files to compile
     * @see #exitWithCommandLineFormatError(String)
     */
    private String[] checkForParameters(String[] args) throws IOException {
      int thisArg = 0;
      while (thisArg < args.length && args[thisArg].startsWith("-")) {
        switch (args[thisArg]) {
          // T specific arguments
          case "-traceback"        :
            thisArg++;
            try {
              int depth = Integer.parseInt(args[thisArg]);
              if (depth < 1)
                throw new NumberFormatException("Positive integer required");
              msgCollector.setTraceBackSize(depth);
            } catch (@SuppressWarnings("unused") NumberFormatException e) {
              exitWithCommandLineFormatError(args,
                     "ERROR: Invalid traceback depth after '-traceback'"
                  + "\n " + e.getMessage() );
            }
            break;
          case "-genout"           :
            isGeneratedFilesDirectoryRequested = true;
            generatedJavaDir  = args[++thisArg];
            if (generatedJavaDir.startsWith("-"))
              exitWithCommandLineFormatError(args,
                    "ERROR: The directory for the generated Java files is missing after '-genout'");
            System.out.println("Generated Java files are at: "+ generatedJavaDir);
            TUtil.ensureDirExists(generatedJavaDir);
            break;
          case "-unit"             :
            isCompileUnitInCommandLine = true;
            thisArg++;
            if (thisArg >= args.length)
              commandLineCompileUnit = "-"; // to signal ERROR
            else
              commandLineCompileUnit = args[thisArg];
            if (commandLineCompileUnit.startsWith("-"))
              exitWithCommandLineFormatError(args,
                    "ERROR: The compile unit code is missing after '-unit'");
            break;
          case "-decorateFinal"    : isRequiringDecoratedFinalValue = true; break;
          case "-wg":
          case "-Xjavatest" : xJavaTestOption               = true; break;
          case "-Xdiagnostics"     : xDiagnostics                  = true; break;
          // Java Flag options listing all flags for javac that have parameters
          //   case "-X":
          //   case "-XXXX":
          case "-d"                : // destination directory (or class output directory)
            javaCompilerOptions.add(args[thisArg]);
            thisArg++;
            javaCompilerOptions.add(args[thisArg]);
            TUtil.ensureDirExists(args[thisArg]);
            break;
          case "-cp":
          case "-classpath" :
            javaCompilerOptions.add(args[thisArg]);
            javaCompilerOptions.add(args[++thisArg]);
            break;
          default:
            // we know it begins with a dash, so assume it is a Java switch argument;
            // let Java compiler issue error message
            javaCompilerOptions.add(args[thisArg]);
            break;
//              default:
//                exitWithCommandLineFormatError(args,
//                    "ERROR: invalid command argument: "+ args[thisArg]);
//                break;
        }
        thisArg++;
      }
      String errMsg = "";
      if (  isCompileUnitInCommandLine && thisArg < args.length)
        exitWithCommandLineFormatError(args,
            "ERROR: Assuming argument "+ args[thisArg] +" is the first file name to compile. "
          + "But command line cannot have both -unit and files to compile");
      if (! isCompileUnitInCommandLine && thisArg >= args.length)
        exitWithCommandLineFormatError(args, "ERROR: There is no file to parse");

      if (isCompileUnitInCommandLine)
          return new String[] {};
      else
          return copyOfTail(args, thisArg);
    }

    /** The command-line options, formatted for printing out to the user's
     * console. This must be coordinated with the method {@link #checkForParameters(String[] args)}
     * @param msg An error message to print before printing the command-line
     *            options.
     */
        private void
    exitWithCommandLineFormatError(String[] args, String msg) {
      System.out.println(msg);
      System.out.println("Arguments given were: "+ Arrays.toString(args));
      System.out.println
      ( "\n  Format of TCompiler command line is"
      + "\n    java javaclasspath TCompiler [TrueJ_options] file..."
      + "\n"
      + "\n    javaclasspath"
      + "\n    -classpath paths  or  -cp paths"
      + "\n      The paths are a list of directories or jars that are made"
      + "\n      available for include statements in TrueJ or Java"
      + "\n      compilation units. They must include the paths to the Antlr"
      + "\n      and TrueJ runtime libraries. So this argument will begin:"
      + "\n        -cp .<sep>path1/antlr.current.jar<sep>path2/tlang.current.compiletime"
      + "\n      (Your operating system uses '<sep>' as the delimiter between paths.)"
      + "\n"
      + "\n    TrueJ options:"
      + "\n      -traceback depth"
      + "\n        The depth is the number of enclosing rules that are reported "
      + "\n        in error messages. The default depth is 1."
      + "\n      -genout dirpath"
      + "\n        The path to the directory where Java files generated from"
      + "\n        TrueJ compilation units will be placed and saved for later"
      + "\n        examination. The default is that the Java files are placed in"
      + "\n        system temp directory at generatedTJava/<user>/<date and time>"
      + "\n        and that these files are deleted after generating .class files"
      + "\n      -decorateFinal"
      + "\n        Require final value names to be decorated. The default is that"
      + "\n        final value names may either be decorated or be the same as"
      + "\n        the name of the variable that holds the value."
      + "\n"
      + "\n    Java compiler options that have additional meaning in TrueJ"
      + "\n         (The other options of your javac compiler may also be used)"
      + "\n      -d dirpath        Where to place generated class files"
      + "\n        The path to the destination \"root\" directory. The .class"
      + "\n        files for TrueJ and Java compilation units are placed"
      + "\n        in their package subdirectories under this directory."
      + "\n        The default is the current directory."
      + "\n"
      + "\n    file..."
      + "\n      the space separated list of .t and .java compile unit files to be"
      + "\n      compiled."
      + "\n"
      + "\n    Additional options for use by TrueJ language developers"
      + "\n      -unit TrueJCompileUnit"
      + "\n        A complete TrueJ compile unit to be compiled. This parameter allows"
      + "\n        invocation of the main(String[]) method in a test."
      + "\n      -Xjavatest"
      + "\n        In normal use, the TCompiler calls the javac"
      + "\n        compiler for .java files. But when this parameter is present"
      + "\n        and a .java file is encountered, it is parsed using the java"
      + "\n        grammar on which the TrueJ Language is built. This allows testing"
      + "\n        that the java syntax used as a basis for TrueJ is also correct"
      + "\n        for Java."
      + "\n      -Xdiagnostics"
      + "\n        Report ambiguities and context sensitivity that are found in"
      + "\n        the grammar at runtime"
      + "\n"
         .replace("<sep>", System.getProperty("path.separator"))
      );
      System.exit(1);
    }

    /** copies the tail of a String array, ensuring that no nulls are in the result.
     * Arrays.copyOfRange() allows nulls in its result if the end of the copy
     * extends the new array beyond the end of the old one, so we isolate it here to
     * suppress the warnings.
     */
    private @NonNull String @NonNull [] copyOfTail(String[] args, final int start) {
      return Arrays.copyOfRange(args, start, args.length);
    }

  } // end inner class ParameterCollector

} // end class TCompiler
