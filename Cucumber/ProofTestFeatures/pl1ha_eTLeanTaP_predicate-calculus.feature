Feature: Predicate Calculus     (Tests for the eLeanTaP system) 
    Copyright and license information at bottom of file.

    This file contains the tests for the axioms and theorems of the predicate 
    calculus. We rely on (Gries&Schneider, 1993) in testing a complete set of 
    theorems.

    The quantifiers are represented as functions "all" and "ex" taking either 
    two or three arguments. The three-argument versions take a parameter for 
      (1) variable name
      (2) a range predicate
      (3) the expression for the body, to which the quantification operator is 
          applied when the range predicate is true. 
    The three-argument statement 
       all(X, range-of-X, body) 
    is read as "for all X such that <range-of-X>, then <body>". For example, 
       all(X, X < 0, 2*X < X).

    And 
      ex (X, range-of-X, body) 
    is read as "there exists an X such that <range-of-X> and <body>". For 
    example, 
      ex(X, even(X), squareOf(2) = X).
    
    The two-argument versions are
      all(X,body), meaning all(X,true, body)
      ex (X,body), meaning  ex(X,true, body)

    The range, if it is present, is intended to simplify the body by 
    providing a place to limit the values that are used by the 
    quantified variable.

    The three-argument versions, with ranges, may be translated into the two-
    argument versions in the following way.
      all(X,range,body) === all(X,range ==> body)
      ex (X,range,body) ===  ex(X,range /\  body)

    Some information on the prover and its language is in the feature file
    pl1aa_eLeanTap_eqivalence_truth.feature.


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And Java debugging
#  And using feature "pl1ha_eTLeanTaP_predicate-calculus"

Scenario: Simple example of a non-theorem

  When the FOP is "all(Y, all(X, p(Y) ==> p(X) ))"
  Then it is not a theorem

Scenario: Quantified variables may be given new names

    The all and ex statements bind variables locally, and the names used for 
    these variables may be chosen arbitrarily, as long as the name has not 
    already been used in the expression. 

  * Formula "all(X, p(X)) === all(Y, p(Y))" is a theorem
  * Formula " ex(X, p(X)) ===  ex(Y, p(Y))" is a theorem


Scenario: Universal quantified variables may be instantiated to any constant

  When the FOP is "all(X, p(X)) ==> p(a) "
  Then it is a theorem
  
* Formula "all(X,p(X)) ==> p(a) /\ p(b) /\ p(c)" is a theorem

* Formula "(p(a) /\ p(b) /\ p(c)) \/ -all(X,p(X))" is a theorem
# same as above only all() is in last place

Scenario: Additional unnamed items do not necessarily exist

    Items must be mentioned in order for us to depend upon their existance. For 
    instance, the theory of natural numbers specifically states that zero exists 
    and then sets up the machinery that specifies the existence of any other 
    natural number. But in general we cannot assume that things exist. So if we 
    have an object, we cannot prove that there is some different object unless 
    we specify it.

  * Formula "ex(X,(a#=X))" is not a theorem

  But formula "ex(X,(a=X))" is a theorem


  And formula "-ex(X,(a#=X))" is not a theorem

  But formula "ex(Y,a#=Y) ==> ex(X,(a#=X))" is a theorem


  But formula "-(a = b) ==> ex(X,-(a=X))" is a theorem


  And formula "-(a = b) ==> ex(X,-(a=X))" is a theorem

  And formula "(a=b) ==> ex(X, (a=X))" is a theorem
  * Note
    """
    This last formula can perhaps be understood as claiming that two different 
    objects exist which are equal, but another interpretation is that there are 
    two different names for the same object.
    """


#Scenario: We can only quantify objects, not logical statements
#
#    Um, apparantly we can do some second-order logic, but please don't -- the
#    system is not tested for that.
#
#    In first order logic, operators like ==> (implies), - (not), and \/ (or) may 
#    only be used with logical statements and not with objects. The first, 
#    meaningless, formula is to be read as "for all statements X and Y 
#    such that statement X implies statement Y, statement X is false or 
#    statement Y is true". 
#
#  * Formula "all(X,all(Y,X ==> Y,-X \/ Y))" is not a theorem


Scenario Outline: Simple Examples

  When the FOP is "<Statement>"
  Then it is a "<Result>"
  * Note that "<Note>"

  # In the following tables, parenthetic numbers are a reference to the the
  # theorems collected in the final pages of David Gries & Fred B. Schneider, A 
  # Logical Approach to Discrete Math, 1993. For instance, (3.8) refers to their
  # Axiom, "Definition of false".

  Examples:
    | Result    | Statement                 | Note                             |
    | theorem   | all(X,false, p) === true  | Empty Range (8.13)         |
    | theorem   |  ex(X,false, p) === false | Empty Range (8.13)         |

  # TODO: enter tests for the rest of the G&S predicate calculus theorems

Scenario: A difficult example for some provers

  A Smullyan tree proof has difficulty with for-all-statements because they are 
  reinstantiated over and over using the rule Universal Instantiation, 
  generating an infinite tree. Our prover has no trouble with this because 
  instead of instantiating for-all statements, we rewrite them using logic 
  variables and then avoid rewriting the same for-all-statement until that logic 
  variable matches something. We can't possibly find a unique use for a second 
  unmatched instantiation of a statement until we have found a match for the 
  first instantiation.
  
  The first example is taken from Zegarelli (2007, p.295-297). The second 
  example is from Smullyan (1971, p.63). The idea is that the axioms for 
  less-than in the natural numbers are known to be consistent; therefore, we 
  should not be able to prove them false. Smullyan's example requires that we 
  add the fact that every natural number has a successor and a definition for 
  less-than or it runs into the problem of trying to claim something about an 
  object which has no support for even existing.

  I am not yet able to prove that our trick is able to either prove or 
  invalidate every formula, but it definitely reduces the number of problem 
  formulas.

  If a statement is neither valid nor inconsistent, it is incomplete, in the 
  sense that some other statements could be made which force it to be either 
  one.

  * Debugging on
  * Using feature "pl1ha_eTLeanTaP_predicate-calculus - A difficult example for some provers"

  * The conjunction of these formulas is underspecified
      """
      all(X1,ex(Y1,lt(X1,Y1)))
      -ex(X2,lt(X2,X2))
      all(X3, all(Y3, all(Z3, (lt(X3,Y3) /\ lt(Y3,Z3)) ==> lt(X3,Z3) )))
      """
  * The conjunction of these formulas is underspecified
      """
      all(X1,ex(Y1,lt(X1,Y1)))
      -ex(X2,lt(X2,X2))
      """
  * Formula "all(X,ex(Y,lt(X,Y)))" is underspecified

  * Formula "-ex(X,lt(X,X))" is underspecified

  * Formula "all(X, all(Y, all(Z, (lt(X,Y) /\ lt(Y,Z)) ==> lt(X,Z) )))" is underspecified

  * Formula "-lt(inf,Y)" is not a theorem

  * Formula "lt(argh,argh)" is not a theorem

  * Formula "lt(a,b) /\ lt(b,c) /\ -lt(a,c)" is not a theorem


#  * The disjunction of these formulas is underspecified
#      """
#      -lt(inf,Y)
#      lt(argh,argh)
#      (lt(a,b) /\ lt(b,c) /\ -lt(a,c) )
#      """

  * Debugging off



#REFERENCE:
#    David Gries & Fred B. Schneider, A Logical Approach to Discrete Math,
#    Springer-Verlag, 1993.

#    Copyright George S. Cowan, June 2016. Licensed under the BSD 3-clause 
#    License which can be found packaged with the eLeanTaP system or at 
#
#      https://opensource.org/licenses/BSD-3-Clause
