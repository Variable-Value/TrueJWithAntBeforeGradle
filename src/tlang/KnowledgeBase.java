package tlang;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import alice.tuprolog.*;
import alice.tuprolog.event.ExceptionEvent;
import alice.tuprolog.event.ExceptionListener;
import alice.tuprolog.event.OutputEvent;
import alice.tuprolog.event.OutputListener;
import alice.tuprolog.event.WarningEvent;
import alice.tuprolog.event.WarningListener;



/** Contains facts about some consistent world. Represented as a list of consistent, first-order
 * predicate logic facts. A new fact can be checked to
 * either see if it is consistent with the current facts or if it can be proven from the current
 * facts.
 * <p>
 * The KnowledgeBase does not syntax check the facts that it is given, but the prover uses the
 * following language:
 *
 * <h4> KnowledgeBase operators, dominant operators first (Prolog precedence) </h4>
 * <h5> Right associative unless noted </h5>
 * <dl><dt> A === B, A =#= B
 *       <dd> Logical equivalence and inequivalence of boolean expressions. Equivalence is
 *            associative, not conjunctive, see below. Inequivalence can also be thought of as
 *            exclusive disjunction (<code>xor</code>). Both are left associative.
 *     <dt> A ==> B, A <== B
 *       <dd> Implication, "A implies B". And converse implication, "A if B". Both are left
 *            associative.
 *     <dt> A \/ B       <dd> Disjunction, "or"
 *     <dt> A /\ B       <dd> Conjunction, "and"
 *     <dt> a = b        <dd> Equals; a and b may be substituted for one another.
 *                            Use <code> = </code> to compare objects and <code> === </code> to
 *                            compare logical expressions.
 *                            Unfortunately, an equality expression should always be
 *                            enclosed in parentheses, <code>(a = a)</code>.
 *     <dt> a #= b       <dd> Not equal
 *     <dt> -A           <dd> Logical negation; "not A"
 *     <dt> false, true  <dd> The logical constants
 *     <dt>
 * </dl>
 *
 * <h4> Relations and functions </h4>
 * Relations and functions look the same, but are conceptually different. Both are written as any
 * java identifier beginning with a lower-case letter and followed by a list of any number of
 * parenthesized objects. But relations are are either <code>true</code> or <code>false</code> while
 * functions may have any kind of value. Therefore we might have relations <code>isHusband(x)</code>
 * and <code>hasChildren(x)</code> and write statements which may or may not be true like
 * <code>isHusband(x) === hasChildren(x)</code>.
 * We might have functions at the same time of
 * <code>salary(x)</code> and <code>spentToday(x)</code>, and write wish to prove statements like
 * <code>(salary(x) = spentToday(x))</code>. Because <code>=</code> is a relational operator whose
 * value might be either <code>true</code> or <code>false</code>, we can also write the possible
 * fact <code>isHusband(x) === (salary(x) = spentToday(x))</code>.
 * <p>
 * In Java, <code>true</code> and <code>false</code> are just
 * different values that methods may produce, but the implementation of the prover makes it
 * simpler to keep them separate. if we want <code>keepsSecrets(x)</code> to be defined to be always
 * <code>true</code>, it is more convenient to define <code>keepsSecrets(x)</code> as a relation using
 * <code>keepsSecrets(x) === true</code>
 * and write <code>isHusband(x) === keepsSecrets(x)</code> because if we define it as a function
 * with a truth value result, using equality instead of equivalence, <code>keepsSecrets(x) = true</code>, the
 * prover forces us to awkwardly write <code>isHusband(x) === (keepsSecrets(x) = true)</code>.
 *
 * <h4> Logical quantifiers </h4>
 * <dl><dt> all(X,p(X))
 *       <dd> The universal quantifier: For all <code>X</code>, <code>p(X)</code> is true. Here,
 *            <code>X</code> stands for any Prolog variable name, a string of letters, digits,
 *            or underscores beginning with a capital letter or underscore. And
 *            <code>p(x)</code> stands for any expression containing <code>X</code>.
 *     <dt> all(X, range-of(X), body(X))
 *       <dd> For all <code>X</code> where <code>range-of(X)</code> is true, <code>body(X)</code> is
 *            true. Here, <code>X</code>
 *            stands for any Prolog variable name, a string of letters, digits,
 *            or underscores beginning with a capital letter or underscore. And <code>range-of(X)</code> and
 *            <code>body(X)</code> stand for any expressions containing <code>X</code>. Although
 *            it just means
 *            <code>all(X, range-of-X ==> body)</code>, it's a
 *            convenient way to give a type or other restriction for the quantified variable, as in
 *            <code>all(N, (type(integer,N) /\ N > 0), square(N) > 0)</code> or
 *            <code>all(Employee, type(part_time_employee,Employee), paid_biweekly(Employee))</code>.
 *     <dt> ex(X,p(X))
 *       <dd> Existential quantification. For all <code>X</code> where <code>range-of(X)</code> is true, <code>body(X)</code> is
 *     <dt> ex (X, range-of(X), body(X))
 *       <dd> For all <code>X</code> where <code>range-of(X)</code> is true, <code>body(X)</code> is
 * </dl>
 *       for all     all(X,p(X))             there exists  ex(X,p(X))
                  all(X, range-of-X, body)              ex (X, range-of-X, body)
 * <dl><dt> A === B      <dd> Logical equivalence of boolean expressions. Associative,
 *                            not conjunctive, see below.
 *     <dt> A =#= B      <dd> Inequivalence for boolean expressions; exclusive disjunction (xor)
 *                            (Left associative)
 *     <dt> A ==> B      <dd> Implication, "A implies B" (Left associative)
 *     <dt> A <== B      <dd> converse implication, "A if B" (Left associative)
 * </dl>
 * <p>
 * Logical equivalence is associative, not conjunctive (chaining). For instance, the following are
 * all the same:
 * <dl><dt> ((p===q) === r) === (p === (q===r))
 *       <dd> associativity of equivalence
 *     <dt> (p===q) === (r===p) === (q===r)
 *       <dd> Some parentheses are left out, so we can read it either as
 *            <ul><li>(p===q) is the same as (r===p), if and only if (q===r), or as
 *                <li>(p===q), if and only if (r===p) is the same as (q===r)
 *            </ul>
 *     <dt> p === q === r === p === q === r
 *       <dd> Divide this up any way you like, it all means the same thing.
 * </dl>
 *
 * The last two can be confusing. Liberal use of parentheses are recommended, or perhaps adding
 * extra spaces around some === to give them extra visual weight. Since we mentioned
 * conjunctivity, perhaps we need to also mention that equality <code>=</code> is not
 * conjunctive either, and in fact, must always be enclosed in parentheses, as in
 * <code>(a = successor(b))</code>.
 */
public class KnowledgeBase {

enum SolverInTestMode {on,off}
SolverInTestMode testMode = SolverInTestMode.off;

private static String relativeDir = "./";

private static Prolog engine = createPrologEngine();
private static String prologStdOut = "";
  // TODO: remove prologStdOut or provide an accessor method
private static boolean isDebugging = false; // set to true to print Prolog output
private static Theory theory;
/** Name of the prolog code field where the result is stored. See
 * {@link #prologConsistencyResult(SolveInfo)} */
private static String prologConsistencyResult = "ConsistencyResult";

/** The logical conjunction operator, AND, is written "/\" in the KnowledgeBase first-order predicate
 * language.
 */
public static final String AND = " /\\ "; //  AND = /\

/** The result of an attempted proof will be one of:
 * <ul> <li>{@link #provenTrue}
 *      <li>{@link #unsupported}
 *      <li>{@link #reachedLimit}
 */
public static enum ProofResult
  { /** the statement was proven to be true */
    provenTrue
  , /** more facts are needed in order to support the proof of the statement */
    unsupported
  , /** The prover reached an internal implementation limit while exploring the complexity of the
      * proof. There are some proofs that will bottom out no matter where the limits are set.
      */
    reachedLimit
  };

/** The result of checking a statement for consistency with the {@link KnowledgeBase} facts will be
 * one of:
 * <ul>
 *   <li> {@link #consistent}
 *   <li> {@link #inconsistent}
 *   <li> {@link #reachedLimit}
 */
public static enum ConsistencyResult
  { /** the statement is consistent with the KnowledgeBase facts */
    consistent
  , /** at least one fact in the {@link KnowledgeBase} is inconsistent with the statement */
    inconsistent
  , /** The consistency checker reached an internal implementation limit while exploring the
      * complexity of the statement. There are some statements for which a consistency check will
      * reach the limits no matter where they are set.
      */
    reachedLimit
  };

/** the facts known by the KnowledgeBase. These must all be consistent with one another. The facts
 * are kept in a queue data structure in the hope that the most recently entered fact will be the
 * one most important in proving a new fact.
 */
private ArrayDeque<String> facts = new ArrayDeque<>();

/** Creates an empty KnowledgeBase that is ready to accept facts. */
public KnowledgeBase() {}

/** Duplicates a KnowledgeBase, allowing you to back up to a previous state.
 * @param kb the KnowledgeBase to be copied
 */
public KnowledgeBase(KnowledgeBase kb) {
  this.facts = kb.facts;
}


/** Add information that cannot possibly be inconsistent with prior facts to the
 * <code>KnowledgeBase</code>. No check for consistency with the <code>KnowledgeBase</code> is
 * performed. This is useful for TrueJ <code>given</code> statements or executable code.
 * Executable code establishes facts about new states, which can not conflict with existing states.
 * For efficiency this method could be used to add a fact that is known to be consistent with the
 * existing knowledge base in some other way, but if a mistake is made, the
 * <code>KnowledgeBase</code> would be corrupted.
 * @param newText
 */
public void assume(String newText) {
  facts.push(newText);
}

/** Checks whether a statement is consistent with the {@link KnowledgeBase} facts and adds it
 * to the list of facts if it is. This is much more efficient than doing the
 * {@link #checkConsistency} and {@link #assume} in two separate steps.
 * @param newText
 * @return a {@link ConsistencyResult}
 */
/* IMPLEMENTATION NOTE:
 * When the incremental prover is done, this will be the most efficient way to add questionable
 * facts to the KnowledgeBase.
 */
public ConsistencyResult assumeIfConsistent(String newText) {
  ConsistencyResult c = checkConsistency(newText);
  if ( c == ConsistencyResult.consistent) {
    assume(newText);
  }
  return c;
}

/** Checks whether a statement is consistent with the {@link KnowledgeBase} facts and adds it
 * to the list of facts if it returns {@link ConsistencyResult#consistent} or
 * {@link ConsistencyResult#reachedLimit}.
 * <p>This alternative to checkConsistency-then-assume will be useful for
 *   some combinations of KnowledgeBase and prover internals. It may also
 *   be useful for conjecture’s, which are checked at runtime.
 * <p>Note that care must be taken in using this method as it may lead to a KnowledgeBase that is
 *    trivially inconsistent and can prove anything.
 * @param newText
 * @return a {@link ConsistencyResult}
 */
public ConsistencyResult assumeUnlessInconsistent(String newText) {
  ConsistencyResult c = checkConsistency(newText);
  if ( c == ConsistencyResult.consistent || c == ConsistencyResult.reachedLimit) {
    assume(newText);
  }
  return c;
}
/** return the conjunction of all the current statements in the KnowledgeBase. This would be useful
 * for summarizing and reporting blocks that do not have a final means, and internally, to construct
 * the statement that is sent to the prover for checking consistency.
 * <p> Because foreach variables will be Skolemized anyway, we can just return the scope prefixed
 *   value names that were defined instead of translating them to foreach statements.
 *   We do not need to use Skolem functions because in the code the function has been evaluated and
 *   assigned to the value name.
 * <p> While statements would sometimes be difficult to translate to forall statements except for the
 *   fact that we will require loop invariants.
 * @return a single statement that is the conjunction of all the <code>KnowledgeBase</code>
 * <code>facts</code>
 */
public String getMeaning() {
  return conjoined(facts);
}

/** Attempts to show that the KnowledgeBase has facts that support the statement.
 * If, instead, it fails with a {@link ProofResult} of <code>unsupported</code> or
 * <code>reachedLimit</code>, it means that the statement
 * cannot be proven. (After confirming that the statement to be proven  is not internally inconsistent,
 * we can find a conflicting fact using findInconsistentFact - not yet implemented.)
 * <p>
 * For technical reasons, the negation of the statement is checked to see if it is
 * <code>inconsistent</code> with some of the facts from the KnowledgeBase. This is equivalent to
 * finding supporting facts that prove the statement. Note that for some statements both the
 * statement and its negation are consistent; that is, the  statement is consistent but cannot be
 * proven, and more assumptions or facts are needed in order  to make the statement be either
 * provably true or inconsistent.
 *
 * TODO: Implement findInconsistentFact().
 * TODO: We could use inverse resolution to find the new assumption needed to prove the statement.
 *
 * @param statement The statement to be shown either true or unsupported
 * @param modeOfTest Optional <code>SolverInTestMode.on</code> to start tracing in the prover
 * @return {@link ProofResult} for the attempted proof
 */
public ProofResult prove(String statement, SolverInTestMode... modeOfTest) {
  SolverInTestMode savedTestMode = testMode;
  if (modeOfTest.length > 0)
    testMode = modeOfTest[0];

  final ConsistencyResult c = checkConsistency(negation(statement));

  testMode = savedTestMode;
  return proofResults(c);
}

private String negation(String statement) {
  return "-("+ statement +")";
}

/**
 * @param c
 * @return
 */
private ProofResult proofResults(ConsistencyResult c) {
  switch (c) {
  case inconsistent: return ProofResult.provenTrue;
  case consistent:   return ProofResult.unsupported;
  case reachedLimit: return ProofResult.reachedLimit;
  default: throw new RuntimeException("Impossible Error - KnowledgeBase.proofResults()");
  }
}

/** Adds a new fact after confirming that it can be proven from the {@link KnowledgeBase} facts.
 * Adding it to the facts may make proving other new facts easier. This will be useful for adding
 * theorems to the KnowledgeBase.
 *
 * @param newFact
 * @param modeOfTest <code>SolverInTestMode.on</code> turns on testing
 * @return a {@link ProofResult}
 */
public ProofResult assumeIfProven(String newFact, SolverInTestMode... modeOfTest) {
  if (modeOfTest.length > 0)
    testMode = modeOfTest[0];
  ProofResult result = prove(newFact);
  if (result == ProofResult.provenTrue)
    assume(newFact);
  testMode = SolverInTestMode.off;
  return result;
}

/**
 * Substitutes a new fact for the existing facts - use when the only purpose of facts is to
 * establish the new fact.
 * <p>
 * For now, we implement this by simply adding the fact to the KnowledgeBase. But the intent is for
 * this to be used in TrueJ programming to summarize the preceding code of a block with a
 * <code>means</code> statement, gathering the complexity of the code into that single
 * statement of the salient information. Note that variable type information is preserved, but
 * <em>all</em> the other code above the <code>means</code> statement is removed from the knowledge
 * base, even the definition of values whose scope extends beyond the  <code>means</code> statement;
 * therefore, the following TrueJ code is allowed to legally reference a value, but nothing could be
 * proven with it because its definition was eclipsed by the <code>means</code> statement.
 * <p>
 * TODO: We need to treat type information separately, ?typeFacts map from variable or value names?
 * to the list of value-facts implied by the type of the variable. Then we can
 * easily eliminate all the facts that are not type declarations and eliminate all the facts for
 * local variable names that are no longer used.
 * If we were to chain KnowledgeBases, then we would
 * not need to recreate a KnowledgeBase from its predecessor, but could just manipulate the current
 * KnowledgeBase.
 *
 * @param newFact
 * @return a {@link ProofResult}
 */
public void substitute(String newFact) {
  assume(newFact); // TODO: eliminate all preceding code in block except types
}

public ProofResult substituteIfProven(String newFact) {
  ProofResult result = prove(newFact);
  if (result == ProofResult.provenTrue) {
    substitute(newFact);
  }
  return result;
}

/** Check a statement to see if it is consistent with the {@link KnowledgeBase} facts.
 * @param statement
 * @return a {@link ConsistencyResult}
 */
public ConsistencyResult checkConsistency(String statement) {
  String testString = parens(statement) + AND + conjoined(facts);
  SolveInfo solutionInfo = checkForConsistency(testString);
  return prologConsistencyResult(solutionInfo);
  }

private ConsistencyResult prologConsistencyResult(SolveInfo solutionInfo) { // @formatter:off
  try {
    String resultState = solutionInfo.getTerm(prologConsistencyResult).toString();
  switch (resultState) {
  // Possible values of resultState are listed in the Prolog etleantap.pl file in predicate
  // runProver(+Formula, +TextOfFormula, -Result)
    case "inconsistent": return ConsistencyResult.inconsistent;
    case "consistent"  : return ConsistencyResult.consistent;
    case "limit"       : return ConsistencyResult.reachedLimit;
    default: throw new InvalidResultFromProverException(resultState);
//    default: throw new RuntimeException
//                      ("A call to the etleantap.pl prover gave the invalid result: " + resultState);
    }
  }
  catch (NoSolutionException e) {
    throw new RuntimeException("A call to the etleantap.pl prover failed to return any result.", e);
  }
  catch (UnknownVarException e) {
    throw new RuntimeException
        ("Mismatch with prover code in etleantap.pl. Expected variable '"+ prologConsistencyResult +"'", e);
  }
} // @formatter:on

@SuppressWarnings("serial")
private class InvalidResultFromProverException extends RuntimeException {
InvalidResultFromProverException(String resultState) {
  super("A call to the etleantap.pl prover gave the invalid result: " + resultState);
  }
}

private SolveInfo checkForConsistency(String testString) {
  SolveInfo info = engine.solve(Term.createTerm(prologCommand(testString), engine.getOperatorManager()));

  if (testMode == SolverInTestMode.on) {
    System.out.println("\nIN TEST MODE: Attempting to prove: "+ testString);
    System.out.println(info.toString().replace('\n', ' ')+"\n");
  }
  return info;
}

private String prologCommand(String formula) {
  String command = "nnf( ("+ formula +"), NNF ), runProver(NNF, "+ prologConsistencyResult +")";
  if (testMode == SolverInTestMode.on)
    command = "db_start_debugging, "+ command;
  return command;
}

/** NOT YET IMPLEMENTED.
 * For an inconsistent statement, returns an inconsistent fact. The fact may not directly
 * contradict the statement, but instead be part of a set of statements that together form the
 * contradiction. And there may be additional ways that the facts contradict the statement; this
 * method returns only one.
 * @param statement
 * @return one of the facts that is involved in the inconsistency with the statement
 *
 * @throws NotYetImplementedException This method has not been implemented. Do not use it. This
 *                                    exception will make you gum up your code if you try to use
 *                                    this method. The exception will be removed when the method is
 *                                    implemented.

 */
/* Implementation note:
 * For an inconsistent statement, try removing all facts cumulatively, one-by-one. Once a consistent
 * result is found, report the last promise removed as "involved in an inconsistency" with the
 * statement. More elaborate schemes might add back all the other facts to see if the found fact
 * alone contradicted the statement or if the contradiction involved a set of statements. The above
 * removal process could be repeated to find another fact involved and repeat until the remaining
 * facts did not contradict. Then a report could list all the statements that could
 * not be added back as the contradicting set of statements. It is an empirical question whether
 * only one fact would normally be involved, or whether reporting it to the programmer would be
 * useful, or whether, when several facts are involved, reporting one fact or the full set of facts
 * that contradict the statement would be useful.
 * OR
 * could we test eliminating one fact at a time, non-cumulatively, working with the most recent
 * facts first, to find the most recent fact that is involved in a contradiction? Are there
 * possible contradictions where no single statement is sufficient?
 * SURE
 * For a simple case, there may be multiple individual contradicting statements.
 *
 * We might provide another method that returns all sets of contradicting statements for complicated
 * situations, but that's a lot of work for something that we don't even know is useful.
 */
@SuppressWarnings("unused") // for the NotYetImplementedException
public String findInconsistentFact(String statement) throws NotYetImplementedException {
  if (false)
    throw new NotYetImplementedException("The method findInconsistentFact has not been implemented");
  else
    System.exit(0);
  return "ERROR" + statement;
}

/** This method has not been implemented. Do not use it.
 * <p>
 * This exception will make you gum up your code if you try to use a method that includes it.
 */
@SuppressWarnings("serial")
public class NotYetImplementedException extends Exception {
  NotYetImplementedException(String message) {super(message);}
}

private ArrayDeque<String> saveState() {
  return facts.clone();
}

private void restoreState(ArrayDeque<String> deque) {
  facts = deque;
}

private ConsistencyResult addFact(String statement) {
  return checkConsistency(statement);
}

/** Create a single string with all the statements from the stack conjoined. Each statement from the
 * stack is enclosed in parentheses to make sure that the whole statement associates with the AND.
 * @param stack A Deque of first-order predicate calculus statements
 * @return The stack of statements as one big AND statement
 */
//TODO: generalize Deque (? to collection ?) as long as order is kept
private String conjoined(Deque<String> stack) {
  //TODO: use Collectors.joining
  String first = parens(stack.pop());
  return stack.stream().reduce(first, (previous, next) -> previous + AND + parens(next)) ;
}

private String parens(String s) {
  return "("+ s +")";
}

static private Prolog createPrologEngine() {
  ensurePrologEngine();
  setTheories();
  return engine;
}

static private void ensurePrologEngine() {
  if (engine == null) {
    final String[] libs = {"alice.tuprolog.lib.BasicLibrary"
                          ,"alice.tuprolog.lib.ISOLibrary"
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
          postToStdOut("\n"+ e.getMsg(), isDebugging);
        }
      }
    );
  }
}

static private void postToStdOut(String msg, boolean... shouldPostToSysout) {
  prologStdOut = prologStdOut + msg;
  if (shouldPostToSysout.length > 0 && shouldPostToSysout[0] == true)
    System.out.print(msg);
}

private static void setTheories() {
  try {
    setAFileTheory(new File(relativeDir +"src/leantap/mydebug.prolog"));
    addAFileTheory(new File(relativeDir +"src/leantap/nnf.pl"));
    addAFileTheory(new File(relativeDir +"src/leantap/etleantap.pl"));
    addAFileTheory(new File(relativeDir +"src/leantap/tLangProof.prolog"));
  } catch (InvalidTheoryException it) {
    it.printStackTrace();
  } catch (IOException io) {
    io.printStackTrace();
  }
}

private static void addAFileTheory(File thFile) throws IOException, InvalidTheoryException {
  //todo: see setAFileTheory()
  theory = new Theory(new FileInputStream(thFile));
  addATheory(theory, thFile);
}

private static void setAFileTheory(File thFile)
      throws IOException, InvalidTheoryException {
  //todo: set directory to make finding the file easier
  // System.out.println("Current User Directory: "+ System.getProperty("user.dir"));
  theory = new Theory(new FileInputStream(thFile));
  setATheory(theory, thFile);
}

private static void addATheory(Theory th, File thFile) throws InvalidTheoryException {
  ensurePrologEngine();
  try {
    engine.addTheory(th);
  } catch (InvalidTheoryException e) {
    final String msg = "at "+ thFile.getName() +" line "+ e.line +":"+ (1+e.pos) +" - "
        + e.getLocalizedMessage();
    throw new InvalidTheoryException(msg);
  }
}

private static void setATheory(Theory th, File thFile) throws InvalidTheoryException {
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



//TODO: scanning StepDefinition_eTleanTap.java at line 79.

}
