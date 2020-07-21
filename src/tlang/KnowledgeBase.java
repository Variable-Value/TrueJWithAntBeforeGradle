package tlang;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.stream.Collectors;
import alice.tuprolog.*;
import alice.tuprolog.event.*;
import cucumber.deps.com.thoughtworks.xstream.io.path.Path;
import org.eclipse.jdt.annotation.*;


//@formatter:off
/** Contains facts about some consistent world. Represented as a list of consistent, first-order
 * predicate logic facts. A new fact can be checked to
 * either see if it is consistent with the current facts or if it can be proven from the current
 * facts.
 * <p>
 * The KnowledgeBase does not syntax check the facts that it is given, but the prover uses the
 * following language:
 *
 * <h4> KnowledgeBase operators</h4>
 *      <h5>least sticky dominates an expression, as in Prolog</h5>
 * <p>
 * <h5> Right associative unless noted </h5>
 * <dl><dt> A === B, A =#= B
 *       <dd> Logical equivalence and inequivalence of boolean expressions. Equivalence is
 *            associative, not conjunctive, see below. Inequivalence can also be thought of as
 *            exclusive disjunction (<code>xor</code>). Both are left associative.
 *     <dt> A ==> B, A <== B
 *       <dd> Implication, "A implies B", and consequence, "A if B". Both are
 *            left associative.
 *     <dt> A \/ B       <dd> Disjunction, "or"
 *     <dt> A /\ B       <dd> Conjunction, "and"
 *     <dt> (a = b)      <dd> Equals; a and b may be substituted for one another.
 *                            Use <code> = </code> to compare objects and <code> === </code> to
 *                            compare logical expressions.
 *                            Unfortunately, because of implementation issues, an equality
 *                            expression must always be enclosed in parentheses,
 *                            <code>(a = b)</code>.
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
 * <code>salary(person)</code> and <code>spentToday(person)</code>, and write wish to prove
 * statements like<code>(salary(x) = spentToday(x))</code>. Because <code>=</code> is an operator
 * whose value might be either <code>true</code> or <code>false</code>, we can also write the
 * possible fact <code>isHusband(x) === (salary(x) = spentToday(x))</code>.
 * <p>
 * In Java, <code>true</code> and <code>false</code> are just different values that methods may
 * produce, but the implementation of the prover makes it simpler to keep them separate. if we want
 * <code>keepsSecrets(x)</code> to be defined to be always <code>true</code>, it is more convenient
 * to define <code>keepsSecrets(x)</code> as a relation using <code>keepsSecrets(x) === true</code>
 * and write <code>isHusband(x) === keepsSecrets(x)</code> because if we define it as a function
 * with a truth value result, using equality instead of equivalence,
 * <code>keepsSecrets(x) = true</code>, the prover forces us to awkwardly write
 * <code>isHusband(x) === (keepsSecrets(x) = true)</code>. (No husbands were injured during the
 * construction of these examples.)
 *
 * <h4> Logical quantifiers </h4>
 * <dl><dt> all(X,p(X))
 *       <dd> The universal quantifier: For all <code>X</code>, <code>p(X)</code> is true. Here,
 *            <code>X</code> stands for any Prolog variable name, a string of letters, digits,
 *            or underscores beginning with a capital letter or underscore. And
 *            <code>p(X)</code> stands for any expression containing <code>X</code>.
 *     <dt> all(X, range-of(X), body(X))
 *       <dd> For all <code>X</code> where <code>range-of(X)</code> is true, <code>body(X)</code> is
 *            true. Here, <code>X</code> stands for any Prolog variable name, that is, a string of
 *            letters, digits, or underscores beginning with a capital letter or underscore. And
 *            <code>range-of(X)</code> and <code>body(X)</code> stand for any expressions containing
 *            <code>X</code>. Although it just means <code>all(X, range-of(X) ==> body(X))</code>,
 *            it's a convenient way to give a type or other restriction for the quantified variable,
 *            as in <code>all(N, (type(integer,N) /\ N #= 0), square(N) > 0)</code> or
 *            <code>all(Employee, type(partTime,Employee), paidBiweekly(Employee))</code>.
 *     <dt> ex(X,p(X))
 *       <dd> Existential quantification. For all <code>X</code>, <code>p(X)</code> is true.
 *     <dt> ex(X, range-of(X), body(X))
 *       <dd> For all <code>X</code> where <code>range-of(X)</code> is true, <code>body(X)</code> is
 *            true. This is equivalent to <code>ex(X, range-of(X) /\ body(X))</code>
 * </dl>
 *
 * <h4> A Note on Associativity of logical operators - none are conjunctive </h4>
 *
 * <dl><dt> A === B      <dd> Logical equivalence of predicates; associative.
 *     <dt> A =#= B      <dd> Inequivalence for boolean expressions; exclusive disjunction (xor)
 *                            (Left associative)
 *     <dt> A ==> B      <dd> Implication, "A implies B" (Left associative)
 *     <dt> A <== B      <dd> Consequence, "A if B" (Left associative)
 * </dl>
 * <p>
 * Do not chain the logical operators together, for instance, avoid <code>A ==> B ==> C</code>
 * because it means if <code>A ==> B</code> then <code>C</code>. And logical equivalence is
 * associative, not conjunctive (chaining). For instance, the following are
 * all the same:
 * <dl><dt> ((p===q) === r) === (p === (q===r))
 *       <dd> Which is the Law of Associativity of Equivalence
 *       <p>
 *     <dt> (p===q) === (r===p) === (q===r)
 *       <dd> This leaves some parentheses out, so we can read it either as
 *            <ul><li>(p===q) is the same as (r===p), if and only if (q===r), or as
 *                <li>(p===q), if and only if (r===p) is the same as (q===r)
 *            </ul>
 *     <dt> p === q === r === p === q === r
 *       <dd> Parenthesize this any way you like, it all means the same thing.</dd>
 * </dl>
 *<p>
 * The last two can be confusing. Liberal use of parentheses are recommended, or perhaps adding
 * extra spaces around some === to give them extra visual weight.
 * <p>
 * Since we mentioned
 * conjunctivity, perhaps we need to also mention that equality <code>=</code> is not
 * conjunctive either, and in fact, must always be enclosed in parentheses, as in
 * <code>(a = successor(b))</code>.
 */
//@formatter:on
public class KnowledgeBase {

enum SolverInTestMode {on,off}
SolverInTestMode testMode = SolverInTestMode.off;

/** Is the prolog engine printing its output? */
private static boolean isDebugging = false;
private static Prolog engine = createPrologEngine();
private static Theory theory;
private static String prologStdOut = "";
/** Name of the prolog code field where the result is stored. See method
 * {@link #prologConsistencyResult(SolveInfo)} */
private static final String prologConsistencyResult = "ConsistencyResult";

private static final String relativeDir = "./";

/** The logical conjunction operator, AND, is written as <code>/\</code> in the first-order
 * predicate language for the KnowledgeBase and the Prolog prover. */
public static final String and = " /\\ ";
/** The logical disjunction operator, OR, is written as <code>\/</code> in the first-order predicate
 * language for the KnowledgeBase and the Prolog prover. */
public static final String or = " \\/ ";
/** The logical negation operator, NOT, is written as <code>-</code> in the first-order predicate
 * language for the KnowledgeBase and the Prolog prover */
public static final String not = " -";


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


private final KnowledgeBase parentKB;

  /*getter*/ Object parentKB() { return parentKB; }
  boolean hasParent() { return parentKB != null; }
  boolean isTopLevelKB() { return ! hasParent(); }

/** the facts known by the KnowledgeBase. These must all be consistent with one another. The facts
 * are kept in a queue data structure in the hope that the most recently entered fact will be the
 * one most important in proving a new fact.
 */
private ArrayDeque<String> facts = null;

  boolean hasNoFacts() { return facts == null || facts.isEmpty(); }
  boolean hasFacts()   { return ! hasNoFacts(); }



/** Creates an empty top-level KnowledgeBase that is ready to accept facts.
 * @Implementation We cannot just call the constructor <code>KnowledgeBase(null)</code> because we
 *                 need to prevent clients from knowing that our implementation uses null to
 *                 designate a top-level KnowledgeBase. */
public KnowledgeBase() {
  this.facts = new ArrayDeque<>();
  this.parentKB = null;
}

/** Creates an empty child KnowledgeBase that is ready to accept facts. Although the child Knowledge
 * Base does not contain any facts of its own, it chains to the parent when it needs its facts. */
public KnowledgeBase(KnowledgeBase parentKB) {
  this.facts = new ArrayDeque<>();
  this.parentKB = parentKB;
}

/** Duplicates a KnowledgeBase, allowing you to save and return to a previous state.
 * @Implementation We cannot just clone the KnowledgeBase because both would point to the same list
 *                 of facts, and we need to update the new list separately. */
public KnowledgeBase copy() {
  KnowledgeBase result;
  if (this.parentKB == null)
    result = new KnowledgeBase();
  else
    result = new KnowledgeBase(this.parentKB);
  result.facts = this.facts.clone();

  return result;
}

/** Add Type information for a value name. Look up the predicates that define the type, substitute
 * the value name for all occurrences of the example name in the definition's predicates, and copy
 * the predicates individually to the list of type information. Unlike other facts, type information
 * is preserved when a means statement subsumes the preceding facts.
 *
 * @param variableType
 * @param valueName
 */
// TODO Create a separate list of type facts to hold these assumptions
// TODO Write a method to insert a list of rule templates for a type into a map
public void assumeType(String variableType, String valueName) {
  // Note that no consistency check is necessary because this is a new valueName
    // should we keep a list in the KnowledgeBase of used valueNames to make sure?
  // use the map to find the list of templates
  // insert the valueName into the templates to create a list of facts
  // add these new facts to the type facts
}

/** Add information that cannot possibly be inconsistent with prior facts to the
 * <code>KnowledgeBase</code>. Use the method {@link #assumeIfConsistent(String)} if a check for consistency
 * with the <code>KnowledgeBase</code> could possibly be needed. {@link #assume(String)} is useful
 * for TrueJ <code>given</code> statements or executable code. This is safe for <code>given</code>
 * statements because they checked every place the method is used, and safe for executable code
 * because it establishes facts about new states, which can not conflict with existing states.
 * <p>
 * For efficiency this method could be used to add a fact that is known to be consistent with the
 * the existing knowledge base in some other way, but if a mistake is made, the
 * <code>KnowledgeBase</code> would be corrupted.
 * @param fact
 */
public void assume(String fact) {
  facts.push(fact);
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
  return conjoinedFacts();
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
  SolverInTestMode savedTestMode = testMode;
  if (modeOfTest.length > 0)
    testMode = modeOfTest[0];

  ProofResult result = prove(newFact);
  if (result == ProofResult.provenTrue)
    assume(newFact);

  testMode = savedTestMode;
  return result;
}

/** Substitutes a new fact for the existing facts - use when the only purpose of facts is to
 * establish the new fact.
 * <p>
 * For now, we implement this by simply adding the fact to the KnowledgeBase. But the intent is for
 * this to be used in TrueJ programming to summarize the preceding code of a block with a
 * <code>means</code> statement, gathering the complexity of the code into that single statement of
 * the salient information. Note that variable type information is preserved, but <em>all</em> the
 * other code above the <code>means</code> statement is removed from the knowledge base, even the
 * definition of values whose scope extends beyond the <code>means</code> statement; therefore, the
 * following TrueJ code is allowed to legally reference a value, but nothing could be proven with it
 * because its definition was eclipsed by the <code>means</code> statement.
 * <p>
 * TODO: We need to treat type information separately, ?typeFacts map from variable or value names?
 * to the list of value-facts implied by the type of the variable. Then we can easily eliminate all
 * the facts that are not type declarations and eliminate all the facts for local variable names
 * that are no longer used. If we were to chain KnowledgeBases, then we would not need to recreate a
 * KnowledgeBase from its predecessor, but could just manipulate the current KnowledgeBase.
 *
 * @param newFact */
public void substitute(String newFact) {
  facts.clear();
  assume(newFact);
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
  String testString = parens(statement) + and + conjoinedFacts();
  SolveInfo solutionInfo = checkForConsistency(testString);
  return prologConsistencyResult(solutionInfo);
  }

//@formatter:off
private ConsistencyResult prologConsistencyResult(SolveInfo solutionInfo) {
  try {
    if (isDebugging)
      System.out.println("SolveInfo: "+solutionInfo);
    String resultState = solutionInfo.getTerm(prologConsistencyResult).toString();
  switch (resultState) {
  // Possible values of resultState are listed in the Prolog etleantap.pl file in predicate
  // runProver(+Formula, +TextOfFormula, -Result)
    case "inconsistent": return ConsistencyResult.inconsistent;
    case "consistent"  : return ConsistencyResult.consistent;
    case "limit"       : return ConsistencyResult.reachedLimit;
    default: throw new InvalidResultFromProverException(resultState);
    }
  }
  catch (NoSolutionException e) {
    throw new RuntimeException("A call to the etleantap.pl prover failed to return any result.", e);
  }
  catch (UnknownVarException e) {
    throw new RuntimeException("Mismatch with prover code in etleantap.pl. Expected variable "
                              +"'"+ prologConsistencyResult +"'", e);
  }
} // @formatter:on

@SuppressWarnings("serial")
private class InvalidResultFromProverException extends RuntimeException {
InvalidResultFromProverException(String resultState) {
  super("A call to the etleantap.pl prover gave the invalid result: " + resultState);
  }
}

private SolveInfo checkForConsistency(String testString) {
  SolveInfo info;
  try {
    info = engine.solve(Term.createTerm(prologCommand(testString), engine.getOperatorManager()));
  } catch (InvalidTermException iTE) {
    throw iTE;
  }

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

/** Add a fact to the knowledge base that is expected to be consistent with the current facts. To
 * avoid using a try statement, you can the following code instead.
 * <pre><code>
 *   ConsistencyResult consistency = {@link #checkForConsistency(statement)};
 *   if (consistency = ConsistencyResult.consistent)
 *     {@link #assume(statement)};
 *   else
 *     ...
 * </code></pre>
 *
 * @param statement
 * @throws InvalidConsistencyResultException
 */
public void assumeIfConsistent(String statement) throws InvalidConsistencyResultException {
  ConsistencyResult consistencyResult = checkConsistency(statement);
  if (consistencyResult == ConsistencyResult.consistent)
    assume(statement);
  else
    throw new InvalidConsistencyResultException(consistencyResult);
}

public class InvalidConsistencyResultException extends Exception {
  private ConsistencyResult consistency;
  /*getter*/ public ConsistencyResult getStatus() { return consistency; }

  InvalidConsistencyResultException(ConsistencyResult consistency) {
    super("The new fact is not provably consistent: " + consistency);
    this.consistency = consistency;
  }
}

/** Create a single string with all the statements from the stack conjoined. Each statement from the
 * stack is enclosed in parentheses to make sure that the whole statement associates with the AND.
 * @param stack A Deque of first-order predicate calculus statements
 * @return The stack of statements as one big AND statement
 */
String conjoinedFacts() {
  final String andWithParens = ") "+and+" (";
  String theseFacts = hasFacts()
                        ? parens(facts.stream().collect(Collectors.joining(andWithParens)))
                        : "true";
  String contextFacts = hasParent() ? parentKB.conjoinedFacts() : "true";
  return theseFacts + and + contextFacts;



//  final String andWithParens = ") "+and+" (";
//  if (stack.isEmpty())
//    return "true";
//  else
//    return parens(stack.stream().collect(Collectors.joining(andWithParens)));

  // TODO: explore if method is ever used when stack.isEmpty(). Why would that be?
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
                          ,"alice.tuprolog.lib.IOLibrary"
                          ,"alice.tuprolog.lib.ISOIOLibrary"
                              // ISOIOLibrary overrides some IOLibrary predicates
                          ,"alice.tuprolog.lib.OOLibrary"
                          ,"alice.tuprolog.lib.ThreadLibrary"
                          };
//    final String[] libs = {"alice.tuprolog.lib.BasicLibrary"
//                           ,"alice.tuprolog.lib.ISOLibrary"
//                           ,"alice.tuprolog.lib.IOLibrary"
//                           ,"alice.tuprolog.lib.ISOIOLibrary"
//                              // ISOIOLibrary overrides some IOLibrary predicates
//                           ,"alice.tuprolog.lib.OOLibrary"
//                           ,"alice.tuprolog.lib.ThreadLibrary"
//                           };
    try {
      engine = new Prolog(libs);
    } catch (InvalidLibraryException e) {
      e.printStackTrace();
    }
    engine.addOutputListener(  new OutputListener()
      { @Override
      public void onOutput(OutputEvent e) {
          postToStdOut("\n"+ e.getMsg(), isDebugging);
        }
      }
    );
    engine.addExceptionListener(new ExceptionListener()
      { @Override
      public void onException(ExceptionEvent e) {
          postToStdOut("\n***** EXCEPTION: "+ e.getMsg(), isDebugging);
        }
      }
    );
    engine.addWarningListener(new WarningListener()
      { @Override
      public void onWarning(WarningEvent e) {
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
  } catch (InvalidTheoryException iT) {
    iT.printStackTrace();
  } catch (IOException io) {
    String relativePathName = Paths.get(relativeDir).toAbsolutePath().toString();
    System.out.println("/nThe execution environment pathname is "+ relativePathName);
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

public boolean equals(KnowledgeBase otherKB) {
  if (this == otherKB)
    return true;

  if (this.parentKB != otherKB.parentKB || this.facts.size() != otherKB.facts.size())
    return false;

  String[] thisFacts = this.facts.toArray(new String[this.facts.size()]);
  String[] otherFacts = otherKB.facts.toArray(new String[otherKB.facts.size()]);
  for (int i = 0; i < thisFacts.length; i++)
    if (thisFacts[i] != otherFacts[i])
      return false;

  return true;
}

}
