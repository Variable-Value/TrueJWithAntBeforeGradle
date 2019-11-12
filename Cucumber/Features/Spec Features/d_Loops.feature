Feature: TODO: after development of integers - Iteration and complex control statements for loops

  Loops are a block of code that is executed repeatedly until a stopping condition is reached.

  TODO:

Scenario: The general form for a loop

  We wish each TrueJ structure to have a clear semantics, and in fact a predicate calculus meaning. Most academic work on iteration semantics features loop variants and invariants. Loop variants are expressions which limit the number of iterations that remain and allow us to show that we do not iterate forever. Loop invariants are predicates that are true before starting a new iteration. A loop condition is tested to see whether to start a new iteration and the and the loop invariant must be true before each of those tests, even the first. The predicate calculus meaning of the iteration statement is then the ending test conjoined with the loop invariant. TrueJ requires an integer loop variant but allows the programmer to choose between providing an invariant or following the iteration statement with a means-statement.

  Sidebar for academics only:

    Practical problems only require that the variant expression
    be an integer expression that counts down to zero and shows that when we reach zero the
    iterations are done. The initial versions of TrueJ will only allow the programmer to specify
    integer expressions, but more convenient expressions will be helpful to the programmer and are
    likely to be included in future versions. To aid the programmer in finding a loop invariant for
    a difficult case, the interactive development environment or special tools might automate its
    generation but including that automation in early versions of the compiler does not seem
    reasonable.

    While it is not difficult
    to train programmers to find loop invariants for the common cases, that training is not given in
    many computer science programs, much less other avenues of programmer education. Unfortunately,
    automatic generation of loop invariants is an unsolved problem for the general case, and
    surely falls in the class of unsolvable problems, though I have never seen a proof of that.
    Many practical cases have been solved, but work is still progressing, and for the time being, it
    seems best to leave automatic generation of loop variants to an interative development
    environment or special tool rather than include it in the TrueJ compiler. However, to aid all
    programmers, and especially the untrained ones, TrueJ allows an alternative.

    Instead of providing a loop invariant, the programmer may state the the desired final meaning of
    the loop. TrueJ then attempts to prove by induction that the loop execution will establish that
    meaning; the induction is done over the possible initial values of the variant. As a convenience
    we also allow non-looping statements to follow the loop before a means-statement is specified
    since it is not difficult to include these statements in the inductive proof.

  Simplified forms of a loop are prefered, such as the the Java foreach loop, but we start with the general form. The body of the loop
  is code that is repeatedly executed to modify data, each iteration starting with the data that was
  created in the previous iteration. A loop condition tests whether the desired ending state has
  been reached, but it is just a test and does not guarantee that the end will ever arrive. So we
  need a loop variant that documents how some of the data modified by the body progresses toward a
  stopping point. Clearly, the programmer must arrange things so that by the time the loop variant
  has reached its stopping point, then the loop condition's test must also show that the ending
  state has been reached. The TrueJ compiler checks that these are true.

  The full desired ending state of the loop, with all the data changes that have been done, can be complex: if we use it as the loop condition, we could need another loop for the check in many cases. And that expensive test would need to be done at the end of every iteration. But we can simplify the work done in the loop condition by factoring the ending state into two parts, an efficient test that the ending state has been reached, and the rest of the desired facts about the ending state, which do not need to be tested at the end of each iteration. The statement of these left-over facts, without the key moving parts of the condition test, describes the state of everything that has been accomplished so far, in all the previous loops, whether the condition test is met or not. We really only need the this left-overs statement to be true at the end of the last iteration of the body's code, but the way to ensure that it is true at the end of the last iteration is to make it true every time the loop condition is tested. Since it is invariably true at this point in every iteration, we call this left-over statement the invariant. Clearly, The meaning of the body's code must imply the loop invariant, and the TrueJ compiler checks for this. Also clearly, the meaning of the loop is the conjunction of the loop's condition test and its invariant.

  # TODO:
  #  When ...


Scenario: In a status statement, each conjunct of a top-level forall is checked separately

    We make use of the fact that

      forall(X:SetOfX) (p(X) & q(X)) === forall(X:SetOfX) p(X) & forall(X:SetOfX) q(X)

    and evaluate each conjunct of the right-hand side separately.

    TODO:
      We also might split an implication with a conjunctive RHS or a disjunctive LHS. And, we could check all resulting statements from universal quantification and implication for whether they are conjunctive. And we have disjunctions under negations. We are essentially keeping track of parity, splitting anything that is equivalent to a non-negated conjunction. But what kinds and levels of splits will help the programmer see the error, and what splitting makes the error more difficult to understand? This will become even more of an issue when method meanings are allowed in status statements. Perhaps we should check and report each error in its own syntax before burrowing down to the next level in order to give the programmer a clear context at each stage.

      I think I like the following even better: When there is an error, display the top level conjunct while highlighting the lowest level phrase discovered thru parity-driven conjunct checking.

    # TODO:
    #  When an invalid run unit is
    #    """
    #    class ForallWithConjunction {
    #
    #      void checkTruth() {
    #        for(t' : tests'.indices) {
    #          result'[t'] = 'result[t'] || tests'[t'];
    #        }
    #        means forall (t' : tests'.indices) ( (result'[t'] ==> 'result[t'])
    #                                          /\ (result'[t'] ==>  tests'[t']) );
    #          // the programmer has accidentally reversed the implications
    #      }
    #
    #    }
