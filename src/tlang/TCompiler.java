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

import static org.eclipse.jdt.annotation.DefaultLocation.*;
import tlang.TUtil.TCompilerCounts;
import tlang.TLantlrRewriteVisitor;
import static tlang.TUtil.*;

/**
 * TCompiler.java parses T language files against the TLantlr.g4 grammar.
 * Related Java source files may be compiled in the same run.
 * <p>
 * For command line options see the code in the method
 * {@link #exitWithCommandLineFormatError(String)}
 */
public class TCompiler {

private final static String slash = File.separator;

// RUNTIME PARAMETERS
  private boolean xDiagnostics              = false;
  private boolean xJavaTestOption           = false;
  private boolean isGeneratedFilesRequested = false;

private final CollectingMsgListener   msgCollector = new CollectingMsgListener();
  public      CollectingMsgListener     msgCollector() { return msgCollector; }
private final Map<RuleContext, Scope> scopeMap = new HashMap<>();
private List<String>                  javaCompilerOptions = new ArrayList<>(3);
private static String generatedJavaDir;
//private static File generatedJavaDir
//  = new File
//  ( new File( System.getProperty("java.io.tmpdir")
//            , "generatedTJava"
//            )
//  , "src"
//  )
//  ;


public TCompiler() {
  msgCollector.clear();
  scopeMap.clear();
  javaCompilerOptions.clear();
  javaCompilerOptions.add("-d");
  javaCompilerOptions.add("\".\""); // i.e., "." in quotes
  generatedJavaDir
    =   System.getProperty("java.io.tmpdir") +"generatedTJava"
      + slash+ System.getProperty("user.name")
      + slash+ ZonedDateTime.now().format(ISO_LOCAL_DATE_TIME).replace(":", "-");
}

// **************** main method ************************************************
//TODO: All Java options are accepted.
/** Invoke the TCompiler by executing this.
 *
 * @param args See {@link #checkForParameters(String[])} to see the options that
 *    you can use; the options are followed by a list of T and Java files to
 *    compile.
 * @throws Exception
 */
@SuppressWarnings({"all", "null"}) // null check misses @NonNull String @NonNull [] file
    public static void
main(String[] args) throws Exception {
  //TODO: check if a try clause is needed to handle any Exception elegantly
  TCompiler compiler = new TCompiler();
  final @NonNull String @NonNull [] files = compiler.checkForParameters(args);
  compiler.sequentialParse(files); // null checking misses @NonNull String @NonNull []
}
// *****************************************************************************

    private void
sequentialParse(String[] fileNames) throws IOException, InterruptedException {
  JavaFileHandler javaCollector
    = new JavaFileHandler( generatedJavaDir, javaCompilerOptions);
  TCompilerCounts counts = new TCompilerCounts();

  tryingEachFileName: for (String fileName : fileNames) {
    msgCollector.newSource(fileName);
    boolean fileDone = specialFileCases(javaCollector, counts, fileName);
    if (fileDone)
      continue tryingEachFileName;

    CommonTokenStream tokenStream = fileToTokens(fileName, msgCollector);
    TLantlrParser parser = new TLantlrParser(tokenStream);
    ParseTree tree = fastParse(parser, msgCollector, counts);

    if (msgCollector.hasNoErrs()) { // only errors are issued by the parser
      // msgCollector.newSource("Error check");
      ContextCheckVisitor sourceInfo
        = new ContextCheckVisitor(tree, msgCollector, scopeMap);
      sourceInfo.visit(tree);
      String topQualifiedName = sourceInfo.getCompoundTypeName();
      checkNameAgreement(topQualifiedName, fileName);
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
      /* TODO: do proof checking after compile to avoid trivial errors
       *       but I want to shell out to the compiler a single time
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
  } // end for fileNames
  msgCollector.clear();
  javaCollector.compileJavaFiles(msgCollector);
  if (msgCollector.hasMsgs()) { System.out.println(msgCollector.toString()); }
  if ( ! isGeneratedFilesRequested) {
      if (new File(generatedJavaDir).exists()) {
        deleteDirectory(generatedJavaDir);
      }
  }
  System.out.println(counts.toString());
}

/**
 * Check and deal with special cases and errors:
 * <ul>
 * <li> invalid file suffix (must be .t or .java)
 * <li> using parser ambiguity check instead of compile
 * <li> compiling java instead of T language
 * </ul>
 * <p>
 * @param javaCollector
 * @param counts
 * @param fileName
 * @throws IOException
 * @throws ParseCancellationException
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

    //TODO move Ambiguity detection to a special option compiler like Ter's Test.java
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
  @SuppressWarnings("unused") // TODO: remove this after generating other output
    ParseTree tree = null;
  if (sourceName.endsWith(".java")) {
    tree = parser.compilationUnit();
    counts.incJavaParseCount();
  } else {
    tree = parser.t_compilationUnit();
    counts.incTCodeCount();
  }
  if (msgCollector.hasErrs()) counts.incErrorCount();
  System.out.println(msgCollector.toString());
}

/** The command-line options, formatted for printing out to the use on the
 * console.
 * @param msg An error message to print before printing the command-line
 *     options.
 */
    public static void
exitWithCommandLineFormatError(String msg) {
  System.out.println(msg);
  String sep = System.getProperty("path.separator");
  System.out.println //TODO Duplicate this list in the TCompiler class javadoc or point here
    (   "  Format of TCompiler command line is"
    + "\n    java javaclasspath TCompiler [t_options] file..."
    + "\n"
    + "\n    javaclasspath"
    + "\n      -cp .;path1/antlr.current.jar;path2/tlang.current.compiletime"
    + "\n      (additional java options may of course be used here, too)"
    + "\n"
    + "\n    t_options:"
    + "\n      -classpath paths  or  -cp paths"
    + "\n        The paths are a list of directories or jars that are made "
    + "\n        available for include statements in the T lanaguage or Java "
    + "\n        compilation units."
    + "\n        Use '"+ sep +"' as the separator character between paths"
    + "\n      -traceback depth"
    + "\n        The depth is the number of enclosing rules that are reported "
    + "\n        in error messages. The default depth is 1."
    + "\n      -d dirpath"
    + "\n        The path to the destination \"root\" directory. The .class "
    + "\n        files for T language and Java compilation units are placed "
    + "\n        in their respective package subdirectories under this "
    + "\n        directory. The default is the current directory"
    + "\n      -genout dirpath"
    + "\n        The path to the directory where Java files generated from T"
    + "\n        language compilation units will be placed and saved for later "
    + "\n        examination. The default is that the Java files are placed in"
    + "\n        system temp directory at generatedTJava/<user>/<date and time>"
    + "\n        and that these files are deleted after generating .class files"
    + "\n    (In addition, any options of the javac compiler that you are using "
    + "\n        may be used, e.g., -d)" //TODO: list more javac options
    + "\n"
    + "\n    file..."
    + "\n      the space separated list of .t and .java compile unit files to be"
    + "\n      compiled."
    + "\n"
    + "\n    additional options for use by T language developers"
    + "\n      -Xjavatest"
    + "\n        In normal use, the TCompiler calls the javac"
    + "\n        compiler for .java files. But when this parameter is present"
    + "\n        and a .java file is encountered, it is parsed using the java"
    + "\n        grammar on which the T Language is built. This allows testing"
    + "\n        that the java syntax used as a basis for the T language is"
    + "\n        also correct for Java."
    + "\n      -Xdiagnostics"
    + "\n        Report ambiguities and context sensitivity that are found in "
    + "\n        the grammar at runtime"
    + "\n"
    );
      //TODO: add parameter for class output directory
      //TODO: build special test version of compiler for -javatest and -diagnostics -- not use features
  System.exit(1);
}

/** Captures the T and Java command-line parameters and creates field settings
 *  for all the T paramenters, puts the Java command-line parameters into the
 *  field {@link #javaCompilerOptions}.
 * @param args The command-line arguments from {@link #main(String[])}
 * @return A list of T and Java files to compile
 * @throws IOException
 * @see #exitWithCommandLineFormatError(String)
 */
private String[] checkForParameters(String[] args) throws IOException {
  int thisArg = 0;
  while (thisArg < args.length && args[thisArg].startsWith("-")) {
    switch (args[thisArg]) {
      // T specific arguments
      case "-cp"             :
      case "-classpath"      :
        javaCompilerOptions.add(args[thisArg]);
        javaCompilerOptions.add(args[++thisArg]);
        break;
      case "-traceback"      :
        thisArg++;
        try {
          int depth = Integer.parseInt(args[thisArg]);
          msgCollector.setTraceBackSize(depth);
        } catch (NumberFormatException e) {
          // TODO Auto-generated catch block
          exitWithCommandLineFormatError
              (   "ERROR: traceback depth is not an integer"
              + "\n  Argments given were: "+ Arrays.toString(args)
              );
        }
        break;
      case "-genout"         :
        thisArg++;
        generatedJavaDir  = args[thisArg];
        System.out.println("Generated Java files are at: "+ generatedJavaDir);
        isGeneratedFilesRequested = true;
        break;
      case "-d"              :
        javaCompilerOptions.add(args[thisArg]);
        thisArg++;
        javaCompilerOptions.add(args[thisArg]);
        TUtil.ensureDirExists(args[thisArg]);
        break;
      case "-wg"             :
      case "-Xjavatest"      : xJavaTestOption    = true; break;
      case "-Xdiagnostics"   : xDiagnostics       = true; break;
      // Java Flag options TODO: list all flags for javac
//      case "-X":
//      case "-XXXX":
//        javaCompilerOptions.add(args[thisArg]); break;
//      default: javaCompilerOptions.add(args[  thisArg]);
//               javaCompilerOptions.add(args[++thisArg]);
//               break;
      default                :
        exitWithCommandLineFormatError
          (   "ERROR: invalid command argument: "+ args[thisArg]
          +"\n   Argments were: "+ Arrays.toString(args)
          );
        break;
    }
    thisArg++;
  }
  final int firstFileArg = thisArg;
  if (firstFileArg >= args.length) {
    exitWithCommandLineFormatError(   "ERROR: file to parse is missing"
                                  + "\n  Argments given were: "+ Arrays.toString(args)
                                  );
  }
  return copyOfTail(args, firstFileArg);
}


/** copies the tail of a String array, ensuring that no nulls are in the result.
 * Arrays.copyOfRange() allows nulls in its result if the end of the copy
 * extends the new array beyond the end of the old one, so we isolate it here to
 * suppress the warnings.
 */
// TODO: will need this with null warnings: @SuppressWarnings("null")
private static @NonNull String @NonNull[] copyOfTail(String[] args, final int start) {
  return Arrays.copyOfRange(args, start, args.length);
}

    private void
testJavaParsing(String fileName, TCompilerCounts counts)
      throws IOException, ParseCancellationException
{ CommonTokenStream tokenStream = fileToTokens(fileName, msgCollector);
  TLantlrParser parser = new TLantlrParser(tokenStream);
  fastParse(parser, msgCollector, counts);
  if (msgCollector.hasMsgs()) {
    counts.incErrorCount();
    System.out.println(msgCollector.toString());
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
//      System.out.println("FILENAME: "+ fileName);
//      System.out.println("TOP NAME: "+ topQualifiedName);
      String fileType = fileName.substring(fileName.lastIndexOf('.'));
      String adjustedFileName = fileName.replace(File.separatorChar, '.').replace('/', '.');
      String adjustedTopName = topQualifiedName + fileType;
//      System.out.println("ADJ FILENAME: "+ adjustedFileName);
//      System.out.println("ADJ TOPNAME: "+ adjustedTopName);
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

} // end class TCompiler
