Feature: Iteration and complex control statements for loops

Loops are a block of code that is executed repeatedly until a stopping condition is reached.

Scenario: The general form for a loop

  Simplified forms of a loop are prefered, but we start with the general form. The body of the loop
  is code that is repeatedly executed to modify data, each iteration starting with the data that was
  created in the previous iteration. A loop condition tests whether the desired ending state has
  been reached, but it is just a test and does not guarantee that the end will ever arrive. So we
  need a loop variant that documents how some of the data modified by the body progresses toward a
  stopping point. Clearly, the programmer must arrange things so that by the time the loop variant
  has reached its stopping point, then the loop condition's test must also show that the ending
  state has been reached, and the TrueJ compiler checks for this.

  The full desired ending state of the loop, with all the data changes that have been done, can be
  complex: if we use it as the loop condition, we could need another loop for the check in many
  cases. And that expensive test would need to be done at the end of every iteration. But we can
  simplify the work done in the loop condition by factoring the ending state into two parts, an
  efficient test that the ending state has been reached, and the rest of the desired facts about the
  ending state, which do not need to be tested at the end of each iteration. The statement of these
  left-over facts, without the key moving parts of the condition test, describes the state of
  everything that has been accomplished so far, in all the previous loops, whether the condition
  test is met or not. We really only need the this left-overs statement to be true at the end of the
  last iteration of the body's code, but the way to ensure that it is true at the end of the last
  iteration is to make it true at the end of every iteration. Since it is invariably true at the end
  of every iteration of the body's code, we call this left-over statement the invariant. Clearly,
  The meaning of the body's code must imply the loop invariant, and the TrueJ compiler checks for
  this.

  Also clearly, the meaning of the loop is the conjunction of the loop's condition test and its
  invariant.

# TODO:
#  When ...


Scenario: In a status statement, each conjunct of a top-level forall is checked separately

    We make use of the fact that

      forall(X:SetOfX) (p(X) & q(X)) === forall(X:SetOfX) p(X) & forall(X:SetOfX) q(X)

    and evaluate each conjunct of the right-hand side separately.

    TODO: We also might split an implication with a conjunctive RHS or a disjunctive LHS. And, we
    could check all resulting statements from universal quantification and implication for whether
    they are conjunctive. And we have disjunctions under negations. We are essentially keeping track
    of parity, splitting anything that is equivalent to a non-negated conjunction. But what kinds
    and levels of splits will help the programmer see the error, and what splitting makes the error
    more difficult to understand? This will become even more of an issue when method meanings are
    allowed in status statements. Perhaps we should check and report each error in its own syntax
    before burrowing down to the next level in order to give the programmer a clear context at each
    stage.

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
