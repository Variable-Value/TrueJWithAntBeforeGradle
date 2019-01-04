Feature: Interface For Calling Systems     (Tests for the eTLeanTaP system)
    Copyright and license information at bottom of file.

  The eTLeanTap system provides procedures for a calling system to load axioms
  and prove theorems sequentially, with each theorem building upon the previous
  ones. Here we ensure that the first-order predicates passed by the KnowledgeBase to the Prolog
  prover can be processed correctly.

  The axioms and theorems must be loaded in one file. An example is at
    ...\TLantlr\Cucumber\Features\aa1_valueNamesEndToEnd.feature
  starting at about line 130.


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And debugging on
  And using feature "pl1ta_eTLeanTap_interfaceT"

Scenario: A simple example of code that supports a proof

# the simplified version
When the FOP is "-(-(('startingA^' = '^a') /\ ('a^' = '^b') /\ ('b^last' = 'startingA^')) /\ ('b^last' = 'startingA^') /\ ('a^' = '^b') /\ ('startingA^' = '^a'))"
  Then it is a "theorem"

When the FOP is "-(-(('block_L5C12.startingA^' = 'this.^a') /\ ('this.a^' = 'this.^b') /\ ('this.b^last' = 'block_L5C12.startingA^')) /\ ('this.b^last' = 'block_L5C12.startingA^') /\ ('this.a^' = 'this.^b') /\ ('block_L5C12.startingA^' = 'this.^a'))"
  Then it is a "theorem"

#Scenario: Establish a new state to start loading and proving axioms sequentially
#
#  When the prover is called with "newState(7, State)"
#
#  Then the variable "State" contains the value "[[],[],[],[]]"
#  And the query "with_limit" fails
#  And the query "limit_reached" fails
#  And the query "limit(7)" succeeds
#  And the query "maxLimit(7)" succeeds
#  And the query "unexpandedFormulas([])" succeeds
#  And the query "consistentLiterals([])" succeeds
#  And the query "freeVariables([])" succeeds
#  And the query "guardedExpressions([])" succeeds

  # TODO: the new state S needs to contain an empty, fresh, list
  # for each component of state that need to be carried from one step of the
  # prover to the next

  #  UnExp:     list of formulas to be expanded to literal form and tested for
  #             inconsistency. If a literal is consistent with everything so far,
  #             it is added to the Lits list. Universally quantified statements are
  #             recycled to the end of this list for further instantiation
  #  Lits:      list of literals on the current branch that so far are mutually
  #             consistent.
  #  FreeV      List of free variables created for All-statements. It is used to
  #             ensure the continuity of all-variables in expanding nested
  #             all-statements. If, in future versions, all-statements are
  #             allowed to contain guarded expression statements, guarded
  #             expression processing will need to also account for free
  #             variables in its copying of guarded expressions.
  #  Guarded:   List of guarded expressions. Guarded expressions are a kind of
  #             one way if-statement, very similar to Prolog Horn clauses.
  #                 guarded(Guard,Expression)
  #             For all guards that are matched by the current literal, the
  #             corresponding Expressions are placed on Unexp, the list of
  #             unexplored expressions. The exception is that Expressions which
  #             are  themselves guarded expressions are immediately placed on
  #             this guarded expression list. Also, some guarded expressions are
  #             written as Prolog facts: the guarded expressions for three basic
  #             rules of the transitivity of equality are hard coded prolog
  #             facts, and type definitions are asserted as Prolog facts.



Scenario: Copyright and License

    Copyright (c) George S. Cowan, 2016. Licensed under the BSD 3-clause
    License which can be found packaged with the eLeanTaP system or at

    https://opensource.org/licenses/BSD-3-Clause

  * End of "Copyright and License"
