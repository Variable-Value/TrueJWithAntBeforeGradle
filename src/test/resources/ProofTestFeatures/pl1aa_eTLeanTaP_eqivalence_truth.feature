Feature: Equivalence & True     (Tests for the eLeanTaP system)

    Copyright and license information at bottom of file.


    In order to test the axioms and theorems about equivalence and truth in the
    propositional calculus, we rely on Gries and Schneider's (1993) presentation
    of a complete set of axioms and important theorems. The feature files are
    awkwardly named in an effort to place them in a preferred reading order.

    The input language for the logic uses a common set of logical operators:

      equivalence ===                     inequivalence =#=
      negation    -
      implication ==>                     consequence   <==
      and         /\                      or          \/
      equality    (a=b)                   inequality    (a#=b)
      predicates  p(a) /\ q(b)            functionals   (f(a) = g(b))
      for all     all(X,p(X))             there exists  ex(X,p(X))
                  all(X, range-of-X, body)              ex (X, range-of-X, body)

      Operators must be separated by whitespace, e.g.,

      write a /\ -b
      not   a/\-b

    This file provides a sort of definition of "true" and examples and tests of
    logical equivalence. The other language elements are presented in separate
    feature files.

    The eTLeanTaP prover is a complete theorem prover for the first-order
    predicate calculus with equality and functionals. It was designed for use by
    the compiler for the T programming language. Therefore it is important that
    it be able to check that simple omissions of intermediate statements in
    proofs are valid and to fail in a consistent way without regard for the
    processing power of a particular computer. Because it does not report the
    proofs it discovers as readable proofs, its use as a theorem prover is
    limited. It is based on the leanTaP 1.1 prover. Additional information about
    this approach to theorem proving can be found in (Smullyan, 1971),
    (Smullyan, 2014), and at

      http://www.uni-koblenz.de/~beckert/leantap/


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And Java debugging
#  And using feature "pl1aa_eTLeanTaP_eqivalence_truth"


Scenario: Example of a simple non-theorem

    If an arbitrary formula has no support for either truth or falsity, then it
    cannot be proven.

    A proposition all by itself, is not necessarily false, it is just that its
    statement as a truth is unsupported.

  * Formula "p" is not a theorem


Scenario: Another simple non-theorem

    Two arbitrary propositions are not necessarily equivalent.

  * Formula "p === q" is not a theorem


Scenario: Axiom: associativity of === (3.1)

    The first formula below is written in a form that highlights the conceptual
    notion of associativity and is the form that we normally expect to see. But
    its validity implies that parentheses are unnecessary and, if they are
    included, syntactically matching parentheses may be placed arbitrarily;
    therefore, the second and third statements are also correct.

  * Formula "((p===q) === r) === (p === (q===r))" is a theorem

  * Formula "p === q === r === p === q === r" is a theorem

  * Formula "(p===q) === (r===p) === (q===r)" is a theorem

  * Note
    """
    If you find the last formulation above particularly mystifying, your mind is
    probably making the same mistake that mine always does: interpreting the ===
    as a conjunctive (chained) operator instead of as an associative operator.

    The use of associativity to add parentheses any way you like can be useful
    in simplifying proofs. Gries & Schneider (1993, p.43) often use
    associativity to state theorems with as few parentheses as possible to make
    this clear. I sometimes add extra spaces as fake parentheses in order to
    group expressions so that the conceptual point does not get lost.
    """

Scenario Outline: Simple Examples

  In the following table, parenthetic numbers are a reference to the theorems
  collected in the final pages of Gries & Schneider, A Logical Approach to
  Discrete Math, 1993.

  When the FOP is "<Statement>"
  Then it is a "<Result>"
  * Note that "<Note>"

  Examples:
    | Result    | Statement                 | Note                             |
#   |-----------|---------------------------|----------------------------------|
    | theorem   | (p === q) === (q === p)   | Symmetry of === (3.2)            |
    | theorem   |  p === q   ===   q === p  | Symmetry, using associativity    |
    | theorem   |((p === q) ===  q) === p   | Another associativity            |
    | theorem   | (p ===(q ===  q)) === p   | Another associativity            |
    | theorem   |  p === ((q === q) === p)  | Another associativity            |
    | theorem   |  p === (q === (q === p))  | Another associativity            |
    | theorem   | true === p   ===  p       | true is the Identity of === (3.3)|
    | theorem   | true                      | / representation of true as a  \ |
    |non-theorem| -true                     | \ proposition (3.4)            / |
    | theorem   | p === p                   | === is reflexive G&S 3.5         |


#REFERENCES:
#
#    David Gries & Fred B. Schneider, A Logical Approach to Discrete Math,
#    Springer-Verlag, 1993.
#
#    Raymond M. Smullyan, First-Order Logic, Springer-Verlag, Second Printing,
#    1971.
#
#    Raymond M. Smullyan, A Beginner's Guide to Mathematical Logic, Dover, 2014.


# Copyright (c) George S. Cowan, 2016. Licensed under the BSD 3-clause
# License which can be found packaged with the eLeanTaP system or at
#
#   https://opensource.org/licenses/BSD-3-Clause
