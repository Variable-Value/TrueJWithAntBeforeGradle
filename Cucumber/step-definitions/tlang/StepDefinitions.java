package tlang;

import tlang.TUtil.TCompilerCounts;
import static tlang.TUtil.*;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

@SuppressWarnings("javadoc")
public class StepDefinitions {

private CollectingMsgListener errs = new CollectingMsgListener();
private TUtil.TCompilerCounts counts = new TCompilerCounts();
private ParseTree tree = null; // (tree != null) ==> we have a parsed program
private TLantlrParser parser;
private CommonTokenStream tokens;
private Map<RuleContext, Scope> scopeMap = new HashMap<>();
private String packageName = "dummyTestPackageName";
private String topTypeName = "dummyTestClassName";
private JavaFileHandler javaMgr;
private List<String> options = null;
/** Allows proof in a separate step */
  private String latestLogicExpected;
  private String prologCodeFromT = "";
/** Allows compilation of generated Java in a separate step */
  private String latestJavaExpected;
  private String javaCodeFromT = "";
/** (tcode != null) ==> we are ready to parse */
  private String tCode = null;

private static final Path targetForJava = Paths.get("temp", "ttests", "bin");
private static final Path prodDir = Paths.get("build", "prod");

// TODO: delete the generated Java source code using something like this:
//@AfterClass
//public void
//afterRunningScenario(Scenario scenario) {
//  TUtil.deleteDirectory(targetForJava);
//}

public StepDefinitions() throws IOException {
  //TODO: if (EclipseRunEnvironment) {"cd projecthome"}
  final File developmentLocation;
  final String userDir = System.getProperty("user.dir");
  if (userDir.contains("clipse") || userDir.contains("ECLIPSE")) {
    developmentLocation = new File(System.getenv("T_DEV_HOME"));
    System.setProperty("user.dir", developmentLocation.toString());
  } else {
    developmentLocation = new File(userDir);
  }

  // System.setProperty("user.dir", developmentLocation);
  final File prodDirFile = new File(developmentLocation, prodDir.toString());
  Files.createDirectories(targetForJava);
  //TODO: delete temp directory at end of tests - do create/delete in Feature?
    // Files.walkFileTree(start, options, maxDepth, visitor);
    // Files.walkFileTree(start, visitor); use Files.delete(path) in visitor
  options = Arrays.asList( "-cp", ".;"+ prodDirFile
                         , "-d" , targetForJava.toString()
                         );
  final String srcPath = Paths.get("temp", "ttests", "gensrc").toString();
  javaMgr = new JavaFileHandler(srcPath, options);
}

@Given("^[Aa] valid run unit is$")
public void a_valid_run_unit_is(String tSourceCode)
      throws IOException, InterruptedException {
  runAllSteps(tSourceCode);
  checkForErrors();
}

@When("^[Aa]n invalid run unit is$")
public void an_invalid_run_unit_is(String tSourceCode)
      throws IOException, InterruptedException {
  runAllSteps(tSourceCode);
  // assertTrue( "Invalid code must produce error messages.", errs.hasErrs());
    // The above line would prevent us from seeing an invalid red test on any
    // of the following tests for the errors in the run unit. See the following
    // method,
    //   show_messages_for()
    // in order to force error messages.
}

@Then("^[Ww]e display all the error messages for inspection$")
public void we_display_all_the_error_messages_for_inspection() {
  assertTrue("Here are the error messages:\n"+ errs.toString(), false);
}

@Then("^[Tt]he error messages are$")
public void the_error_messages_are(String expected) {
  expected = expected.replace("\r\n", "\n");
  assertEquals(expected, errs.toString());
}

@Then("^an error message contains$")
public void an_error_message_contains(String uniquePartOfErr) {
  an_error_message_contains__(uniquePartOfErr);
}

@Then("^an error message contains \"([^\"]*)\"$")
public void an_error_message_contains__(String uniquePartOfErr) {
  // Assumes a compile unit has already been processed, probably by
  //     an_invalid_run_unit_is(String tCode)
  boolean foundMsg = findMsg(uniquePartOfErr);
  if ( ! foundMsg) {
    reportMissingMsg(uniquePartOfErr);
  }
}

@Then("^[Tt]he parse tree is$")
public void the_parse_tree_is(String expectedTree) {
  assertEquals(stripFormating(expectedTree), stripFormating(tree.toStringTree(parser)));
}

@Then("^[Tt]he Java operational run unit is$")
public void the_Java_operational_run_unit_is(String javaCodeExpected) {
  latestJavaExpected = javaCodeExpected;
  assertEquals(javaCodeExpected,javaCodeFromT);            // better output
    // assertThat(javaCodeProduced, is(javaCodeExpected)); // not as useful
}

@Then("^[Tt]he prolog call to the prover is$")
public void
the_prolog_call_to_the_prover_is(String logicCodeExpected) {
  latestLogicExpected = logicCodeExpected;
  assertEquals( latestLogicExpected, prologCodeFromT);    // better output
  // assertThat(logicCodeFromT, is(logicCodeExpected));  // not as useful
}

@Then("^[Tt]he prolog call to the prover ignoring whitespace is$")
public void
ignoring_whitespace_the_prolog_call_to_the_prover_is(String logicCodeExpected) {
  latestLogicExpected = logicCodeExpected;
  if ( ! stripFormating(latestLogicExpected).equals(stripFormating(prologCodeFromT)) )
      assertEquals(latestLogicExpected, prologCodeFromT);   // better output
  // assertThat(logicCodeFromT, is(logicCodeExpected));      // not as useful
}

@Then("^[Tt]he field name collection is$")
public void the_field_name_collection_is(String expectedVarList) {
  Map<RuleContext, tlang.Scope> localScopeMap = new HashMap<>();
  new FieldVisitor("Cucumber Test", errs, localScopeMap).visit(tree);
  for (Scope scope : localScopeMap.values() ) {
    String scopeName = scope.getAncestryLabel();
    Set<String> scopeFields = scope.varToInfoMap.keySet();
    String actualFields = "["+ scopeName
                         +","+ scopeFields.toString()
                         +"]";
    assertEquals(stripFormating(expectedVarList), actualFields);
  }
}

@Then("^[Tt]he logic is valid$")
public void the_logic_is_valid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


@Then("^[Tt]he test code is$")
public void the_test_code_is(String testCode) throws Throwable {
  throw new PendingException();
//TODO: generate, compile, and run the test version of the code with JUnit annotations
//  String jUnitCodeFromT
//      = TLantlrRewriteVisitor.treeToJava(tree, tokens, scopeMap);
//  testCompileOf(jUnitCodeFromT);
//  runJUnit(packageName, topTypeName);
}

//TODO: include testing ?? for Eclipse runtime debugger?
private void runJUnit(String pkgName, String typeName) {
  assertTrue("runJunit not implemented", false);

}

@Then("^[Ss]ummary$")
public void summary(@SuppressWarnings("unused") String arbitraryText) {
  // To allow adding a summary that is not part of any other step
}

@When("^[Nn]otes?$") // Note, Notes, note, or notes
public void notes(@SuppressWarnings("unused") String arbitraryText) {
  // To allow adding notes between steps
}


// ************* Helper methods **********************

void runAllSteps(String tSourceCode) throws IOException, InterruptedException {
  assertNotNull("Code must be provided for processing", tSourceCode);
  tCode = tSourceCode;
  parse("", tCode);
  attemptContextCheck();
  attemptJavaCodeGeneration();
//  attemptCompile(javaCodeFromT);
  attemptProofs();
}

private void attemptProofs() {
  if (errs.hasErrs())
    return;

  errs.newSource("Prove code correct");
//  System.out.println("vvvvvvvvvv PROLOG CODE FROM T vvvvvvvvvv");
  prologCodeFromT = TLantlrProofVisitor.proveCorrectness(tree, tokens, scopeMap, errs);
//  System.out.println(prologCodeFromT);
//  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
}

@SuppressWarnings("null")
private static String stripFormating(String formatted) {
  return formatted.replaceAll("\\R[\\t ]*", "");
}

@SuppressWarnings("null")
private static String stripWhiteSpace(String formatted) {
  return formatted.replaceAll("[ \\r\\n\\t]", "");
}

/**
 * Report complete information to show that the required message was missing, no
 * matter what the reason was.
 *
 * @param keyPartOfErr The important part of the error message
 */
private void reportMissingMsg(String keyPartOfErr) {
  assertTrue(   "No message was found containing <"+ keyPartOfErr +">"
              + "\nHere are the error messages:\n"+ errs.toString()
            , false
            );
}

/**
 * Search the collection of messages that have been issued for a particular
 * string of characters.
 *
 * @param uniquePartOfMsg The important part of the error message
 * @return true if some information or error msg contains the uniquePartOfErr
 */
private boolean findMsg(String uniquePartOfMsg) {
  boolean foundMsg = false; // so far
  for (String line : errs.lines()) {
      if (line.contains(uniquePartOfMsg)) {
        foundMsg = true;
        break;
      }
  }
  return foundMsg;
}

private void parse(String name, String tCode) throws ParseCancellationException {
  errs = new CollectingMsgListener("Test Parse "+ name);
  tokens = tStringToTokens("T Run test", tCode, errs);
  parser = new TLantlrParser(tokens);
  counts = new TCompilerCounts();
  tree = fastParse(parser, errs, counts);
}

//TODO: remove this after replacing all uses with better msg. Actually put the
//      msgs in ensure...() and then redirect all other uses to there.
private void checkForErrors() {
  if (errs.hasErrs()) {
    assertEquals("",errs.toString());
  }
}

/** checks semantics
 *
 * Visit the parse tree, finding and setting the packageName and topTypeName
 */
private void attemptContextCheck() {
  if (errs.hasErrs())
    return;

  errs.newSource("Context Checking during testing");
  ContextCheckVisitor scVisitor = new ContextCheckVisitor(tree, errs, scopeMap);
  scVisitor.visit(tree);
  packageName = scVisitor.getPackageName();
  topTypeName = scVisitor.getTopTypeName();
}

private void attemptJavaCodeGeneration() {
  if (errs.hasErrs())
    return;

  errs.newSource("Generate Java code");
  javaCodeFromT = TLantlrRewriteVisitor.treeToJava(tree, tokens, scopeMap);
}

private void
attemptCompile(String javaCodeFromT) throws IOException, InterruptedException {
  if (errs.hasErrs())
    return;

  errs.newSource("Compile Java from Test");
  TUtil.compileSource(packageName, topTypeName, javaCodeFromT, javaMgr, errs);
//  assertTrue( "The Java Compiler issued the following msgs: "+ errs.toString()
//            , errs.isEmpty()
//            );
}

} // end class StepDefinitions
