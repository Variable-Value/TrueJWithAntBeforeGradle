

import static tlang.TUtil.*;
import tlang.TUtil.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import alice.tuprolog.*;
import alice.tuprolog.event.WarningEvent;
import alice.tuprolog.event.WarningListener;
import alice.tuprolog.event.ExceptionEvent;
import alice.tuprolog.event.ExceptionListener;
import alice.tuprolog.event.OutputEvent;
import alice.tuprolog.event.OutputListener;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.junit.*;
import org.junit.Assert;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.core.CombinableMatcher;

@SuppressWarnings({ "unused", "javadoc", "null" })
public class StepDefinitions_eTLeanTaP {

private static Prolog engine;
private static Theory theory;
/*package*/ static boolean debugging = false;

private boolean needsETLeanTapTheory = true;

/*package*/ static String prologStdOut = "";
private String expectedPStdOut;
private static String collectedErrorMsgs = "";

//TODO: generalize tLAntlrDir for any developer to use
private String relativeDir = "./";
private int freeVarDepth = 7; // limit before backtracking
private Term goal;
private String currentGoal = "";
private SolveInfo solutionInfo;

@Given("^a Prolog engine$")
public void a_Prolog_engine() throws Throwable {
  ensurePrologEngine();
}

@Given("^the eTLeanTap theory is loaded$")
public void the_eTLeanTap_theory_is_loaded() throws Throwable {
  if (needsETLeanTapTheory) {
    setAFileTheory(new File(relativeDir +"src/leantap/mydebug.prolog"));
    addAFileTheory(new File(relativeDir +"src/leantap/nnf.pl"));
    addAFileTheory(new File(relativeDir +"src/leantap/etleantap.pl"));
    addAFileTheory(new File(relativeDir +"src/leantap/tLangProof.prolog"));
    needsETLeanTapTheory = false;
  }
}

@Given("^[Dd]ebugging on$")
public void debugging_on() throws Throwable {
  debugging = true;
}

@Then("^[Dd]ebugging off$")
public void debugging_off() throws Throwable {
  debugging = false;
}

@Given("^[Uu]sing feature \"([^\"]*)\"$")
public void using_feature(String name) throws Throwable {
    System.out.print("\nBeginning feature "+ name +" ");
}

@Given("^[Ff]ormula [^b]*\"([^\"]*)\"[^b]* is a theorem$")
public void formula_is_a_theorem(String formula) throws Throwable {
  setFormulaGoal(formula);
  proveGoal();
}

@Given("^[Ff]ormula [^b]*\"([^\"]*)\"[^b]* is not a theorem$")
public void formula_is_not_a_theorem(String formula) throws Throwable {
  setFormulaGoal(formula);
  goalFails();
}

@Given("^[Ff]ormula \"([^\"]*)\" is underspecified$")
public void formula_is_underspecified(String formula) throws Throwable {
  formula_is_not_a_theorem(formula);

  String negation = "-("+ formula +")";
  formula_is_not_a_theorem(negation);
}

@Given("^[Tt]he conjunction of these formulas is underspecified$")
public void the_conjunction_of_these_formulas_is_underspecified(String formulas) throws Throwable {
  final String f1 = formulas.replace("\r\n", ") /\\ (").replace("\n"  , ") /\\ ("); //  a) /\ (b
  final String conjunction = "("+ f1 +")";               // (a) /\ (b)
  formula_is_underspecified(conjunction);
  }

@When("^[Tt]he FOP is \"([^\"]*)\"$")
public void the_FOP_is(String formula) throws Throwable {
  setFormulaGoal(formula);
}

@Then("^[Tt]he proof result is \"([^\"]*)\" with note \"([^\"]*)\"$")
public void the_proof_result_is_with_note(String result, String note)
    throws Throwable {
  assertNotNull("No Goal has been provided", goal);
  solutionInfo = engine.solve(goal);
  String solution = solutionInfo.toString().replace('\n', ' ');
  if (debugging) System.out.println(solution);
  goal = null;
  assertEquals(result, solution);
}

@Then("^[Ii]t is a theorem$")
public void it_is_a_theorem() throws Throwable {
  proveGoal();
}

@Then("^[Ii]t is not a theorem$")
public void it_is_not_a_theorem() throws Throwable {
  goalFails();
}

@Then("^[Ii]t is a \"([^\"]*)\"$")
public void it_is_a(String answer) throws Throwable {
  final boolean theoremIsExpected = answer.equalsIgnoreCase("Theorem");
  assertNotNull("No Goal has been provided", goal);
  solutionInfo = engine.solve(goal);
  String solution = solutionInfo.toString().replace('\n', ' ');
  goal = null;
  final boolean unsupported = solution.startsWith("no.");
  final boolean isTheorem   = solution.startsWith("yes.");
  final boolean isOther     = ! (isTheorem || unsupported);
  String msg = "";
  if ( isOther) {
    msg = "Failure: <"+ solution +"> for: "+currentGoal;
  } else if ( theoremIsExpected && unsupported) {
    msg = "Result: <"+ solution +"> but should be a theorem: "+currentGoal;
  } else if ( ! theoremIsExpected && isTheorem) {
    msg = "Result: <"+ solution +"> but should not be a theorem: "+currentGoal;
  }
  assertTrue(msg, msg == "");
}


@Given("^The interface theorems are true$")
public void the_interface_theorems_are_true(String TJavaInterface) throws Throwable {
  currentGoal = TJavaInterface;
  goal = makeTerm(TJavaInterface);
  solutionInfo = engine.solve(goal);
  String solution = solutionInfo.toString().replace('\n', ' ');
  if (debugging) System.out.println(solution);
  goal = null;
  final boolean valid = solution.startsWith("yes.");
  if ( debugging && ! valid) {
    System.out.println(currentGoal);
    System.out.println("    HAS AN UNSUPPORTED STATEMENT");
  }
  assertTrue("Result: <"+ solution +">. There is an unsupported statement: \n"+ currentGoal, valid);
  if (debugging) {
    System.out.println();
    System.out.println();
  }
}

@When("^the prover is called with$")
public void the_prover_is_called_with(String prologQuery) throws Throwable {
  solveQuery(prologQuery);
}

private void solveQuery(String prologQuery) {
  currentGoal = prologQuery;
  goal = makeTerm(prologQuery);
  solutionInfo = engine.solve(goal);
  String solution = solutionInfo.toString().replace('\n', ' ');
  if (debugging) System.out.println("\n"+ solution);
  goal = null;
}

@When("^the prover is called with \"([^\"]*)\"$")
public void the_prover_is_called_with_line(String prologLine) throws Throwable {
  the_prover_is_called_with(prologLine);
}

@Then("^the variable \"([^\"]*)\" contains the value \"([^\"]*)\"$")
public void the_variable_contains_the_value(String varName, String value) throws Throwable {
  assertTrue("Variable "+ varName +" does not have a value because no solution was found"
              + prologStdOut
            ,solutionInfo.isSuccess()
            );
  Term actualTerm = solutionInfo.getVarValue(varName);
  Term expectedValue = makeTerm(value);
  assertTrue(  "Expected was: "+ expectedValue +" for Actual: "+ actualTerm
            , expectedValue.isEqual(actualTerm)
            );
}

@Then("^the query \"([^\"]*)\" fails$")
public void the_query_fails(String prologQuery) throws Throwable {
  solveQuery(prologQuery);
  assertFalse("The query <"+ goal +"> should fail, but it succeeded.",solutionInfo.isSuccess());
}

@Then("^the query \"([^\"]*)\" succeeds$")
public void the_query_succeeds(String prologQuery) throws Throwable {
  solveQuery(prologQuery);
  assertTrue("The query <"+ goal +"> should succeed, but it failed."
              + "\n"+ prologStdOut
        ,solutionInfo.isSuccess()
        );
}

@Then("^[Nn]ote that \"([^\"]*)\"$")
public void Note_that(String note) throws Throwable {
  // accept any note
}

/**
 * A scenario apparently must contain a step. When a scenario is used for documentation text, this
 * (no-op) step definition can be used to prevent errors.
 */
@Given("^[Ee]nd of \"([^\"]*)\"$")
public void end_of(String scenarioName) throws Throwable {
    // do nothing
}


///** Allow adding notes between steps */
//@When("^[Nn]otes?$") // Note, Notes, note, or notes
//public void notes(@SuppressWarnings("unused") String arbitraryText)
//    throws Throwable {
//}



/* *******  Utility methods ***************************/

private void setFormulaGoal(String formula) {
  currentGoal = formula;
  String goalText  = formula.replace("'", "''");
  String leanGoal = "nnf( (-("+ formula +")), NNF ), inconsistent(NNF, "+ freeVarDepth +", '"+ goalText +"')";
  if (debugging) {
    leanGoal = "db_start_debugging, "+ leanGoal;
    System.out.println("\n"+ leanGoal);
  }
  goal = makeTerm(leanGoal);
}

private Term makeTerm(String prologCode) {
  return Term.createTerm(prologCode, engine.getOperatorManager());
}



private void proveGoal() {
  assertNotNull("No Goal has been provided", goal);
  solutionInfo = engine.solve(goal);
  String solution = solutionInfo.toString().replace('\n', ' ');
  if (debugging) System.out.println(solution);
  goal = null;
  final boolean isTheorem = solution.startsWith("yes.");
  if ( debugging && ! isTheorem) {
    System.out.println(currentGoal);
    System.out.println("    IS NOT A THEOREM!");
  }
  assertTrue("Result: <"+ solution +">. Should be a theorem: \n"+ currentGoal, isTheorem);
  if (debugging) {
    System.out.println();
    System.out.println();
  }
}

private void goalFails() {
  assertNotNull("No Goal has been provided", goal);
  solutionInfo = engine.solve(goal);
  String solution = solutionInfo.toString().replace('\n', ' ');
  final boolean isNonTheorem = solution.startsWith("no.");
  if ( debugging && ! isNonTheorem) {
    System.out.println(currentGoal);
    System.out.println("    SHOULD NOT BE A THEOREM!");
    System.out.println("    Solution: "+ solution);
  }
  goal = null;
  assertTrue("Result: <"+ solution +">. Should not be a theorem: "+currentGoal, isNonTheorem);
  if (debugging) {
    System.out.println();
    System.out.println();
  }
}

private void addAFileTheory(File thFile) throws IOException, InvalidTheoryException {
  //todo: see setAFileTheory()
  theory = new Theory(new FileInputStream(thFile));
  addATheory(theory, thFile);
}

private void setAFileTheory(File thFile)
      throws IOException, InvalidTheoryException {
  //todo: set directory to make finding the file easier
  // System.out.println("Current User Directory: "+ System.getProperty("user.dir"));
  theory = new Theory(new FileInputStream(thFile));
  setATheory(theory, thFile);
}

private void addATheory(Theory th, File thFile) throws InvalidTheoryException {
  ensurePrologEngine();
  try {
    engine.addTheory(th);
  } catch (InvalidTheoryException e) {
    final String msg = "at "+ thFile.getName() +" line "+ e.line +":"+ (1+e.pos) +" - "
        + e.getLocalizedMessage();
    throw new InvalidTheoryException(msg);
  }
}

private void setATheory(Theory th, File thFile) throws InvalidTheoryException {
  prologStdOut = "";
  ensurePrologEngine();
  try {
    engine.setTheory(th);
  } catch (InvalidTheoryException e) {
    final String msg = "at "+ thFile.getName() +" line "+ e.line +":"+ (1+e.pos) +" - "
        + e.getLocalizedMessage();
    throw new InvalidTheoryException(msg);
  }
}

private void addATheory(String thName, String theoryText) throws InvalidTheoryException {
  Theory th = new Theory(theoryText);
  try {
    engine.addTheory(th);
  } catch (InvalidTheoryException e) {
    String title;
    if (thName.length() > 0) {
      title = thName;
    } else {
      int eolTh = endOfLineOrFile(theoryText, 0);
      title = "\""+ theoryText.substring(0, eolTh) +"\"...";
    }
    final String msg = "at "+ title +" line "+ e.line +":"+ (1+e.pos) +" - "
        + e.getLocalizedMessage();
    throw new InvalidTheoryException(msg);
  }
}

static private void ensurePrologEngine() {
  if (engine == null) {
    final String[] libs = {"alice.tuprolog.lib.BasicLibrary"
                          ,"alice.tuprolog.lib.ISOLibrary"
                          ,"alice.tuprolog.lib.IOLibrary"
                          ,"alice.tuprolog.lib.ISOIOLibrary"
                             // ISOIOLibrary overrides some IOLibrary predicates
                          ,"alice.tuprolog.lib.OOLibrary"
                          ,"alice.tuprolog.lib.ThreadLibrary"
                          };
    try {
      engine = new Prolog(libs);
    } catch (InvalidLibraryException e) {
      e.printStackTrace();
    }
    engine.addOutputListener(  new OutputListener()
      { @Override public void onOutput(OutputEvent e) {
          postToStdOut("\n"+ e.getMsg());
        }
      }
    );
    engine.addExceptionListener(new ExceptionListener()
      { @Override public void onException(ExceptionEvent e) {
          postToStdOut("\n***** EXCEPTION: "+ e.getMsg());
        }
      }
    );
    engine.addWarningListener(new WarningListener()
      { @Override public void onWarning(WarningEvent e) {
          postToStdOut("\n"+ e.getMsg(), debugging);
        }
      }
    );
  }
}

static private void postToStdOut(String msg, boolean... shouldPostToSysout) {
  prologStdOut = prologStdOut + msg;
  boolean useSysout = (shouldPostToSysout.length == 0) ? true : shouldPostToSysout[0];
  if (useSysout) { System.out.print(msg); }
}

/* ************************************************************************************************
 * The below seems to be part of some scheme to ensure that actual messages match an expected value.
 * As of my checking, the only part used in the above code is the method endOfLineOrFile()
 *
 * This code may come from either a Cucumber, JUnit, or tuProlog source.
 **************************************************************************************************/
private void mismatchError(String msg, int lineCount, int expPos, int actPos) throws AssertionError {
  int bolExp = beginningOfLineOrFile(expectedPStdOut, expPos);
  int eolExp =       endOfLineOrFile(expectedPStdOut, expPos);
  int bolAct = beginningOfLineOrFile(prologStdOut   , actPos);
  int eolAct =       endOfLineOrFile(prologStdOut   , actPos);
  System.out.println("Beginning of Actual: "+ bolAct +" Position in Actual: "+ actPos +" End of Actual: "+ eolAct);
  String newMsg = ("\n"+ msg +" at line "+ lineCount
                  +" (expected position "+ (expPos-bolExp) +")"
                  +" (actual position "  + (actPos-bolAct) +")"
                  +"\n  Expected: "+ expectedPStdOut.substring(bolExp, eolExp)
                  +"\n    Actual: "+    prologStdOut.substring(bolAct, eolAct)
                  );
  collectedErrorMsgs = collectedErrorMsgs + newMsg;

}

private int beginningOfLineOrFile(String lines, int posInLine) {
  final int bol = lines.lastIndexOf('\n', posInLine - 1);
    // in case we are sitting on \n
  return 1 + bol; // char after previous \n, or beginning of file, e.g., zero
}

private int endOfLineOrFile(String lines, int posInLine) {
  // if posInLine is \n, then that is the end of the current line
  final int eol = lines.indexOf('\n', posInLine);
  if (eol == -1) { return lines.length(); }
            else { return eol;            }
}

private void reportErrors() {
  // System.out.println("<"+ collectedErrorMsgs +">");
  throw new AssertionError(collectedErrorMsgs);
}

private boolean validPVarStart(char c) {
  if (c == '_' || Character.isUpperCase(c))
       return true;
  else return false;
}

private boolean validPVarChar(char c) {
  if (c == '_' || Character.isAlphabetic(c) || Character.isDigit(c) )
       return true;
  else return false;
}

private char lastChar(CharSequence chars) {
  return chars.charAt(chars.length()-1);
}



}
