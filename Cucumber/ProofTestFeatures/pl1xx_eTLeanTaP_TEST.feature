Feature: Special Test     (Tests for the eLeanTaP system)
    Copyright and license information at bottom of file.

    This file contains tests that are being focused on.


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And debugging on
  And using feature "pl1xx_eTLeanTaP_TEST"


#Scenario: FROM EQUALITY - Transitive chain on each side of an inequality
#
#  * Formula "(a=b) /\ (b=c) /\ (c#=d ) /\ (d=e) /\ (e=f)  ==> (f#=a)" is a theorem
#
# This next formula violates the depth limit for using guarded expressions
#  * Formula "(a=b) /\ (b=c) /\ (c#=d) /\ (d=e) /\ (e=f)  ==> (f=a)" is not a theorem

#Scenario: FROM PRED and FNS - Additional unnamed items do not necessarily exist
#
#    The existence of items must be specified in order for us to depend upon
#    their existance. For instance, the theory of natural numbers specifies that
#    zero exists, and allows us to prove that the rest of the natural numbers
#    exist, but in general we cannot assume that things exist. So we cannot
#    prove that there is something different than a.
#
#    The last formula can perhaps be understood as claiming that two different
#    objects exist which are equal, but another interpretation is that there are
#    two different names for the same object.
#
#  * Formula "ex(X,(a#=X))" is not a theorem
#
#  And formula "-ex(X,(a#=X))" is not a theorem
#
#  But formula "-(a = b) ==> ex(X,-(a=X))" is a theorem
#
#  And formula "ex(Y,a#=Y) ==> ex(X,-(a=X))" is a theorem
#
#  * Formula "(a=b) ==> ex(X, (a=X))" is a theorem

Scenario Outline: Tests

  When the FOP is "<Statement>"
  Then it is a "<Result>"
  * Note that "<Note>"

  Examples:
    | Result    | Statement                        | Note                      |
    #-----------|----------------------------------|---------------------------|
    | theorem   |  a = b ==> f(a) = f(b)           | from preds&fns - works in natural ordering |
#    | theorem   |  b = a ==> f(a) = f(b)           | from preds&fns            |
#    | theorem   |  -(f(a) = f(b)) ==> -(b = a)     | modis tolens version from preds&fns|
#    | theorem   |  (f(a) = f(b)) \/ -(a = b)       | from preds&fns            |
#    | theorem   | (a=c) /\ -(b=c) ==> -(a=b)       | from equality             |
#    | theorem   | -p(a) /\ p(f(a,b)) /\ (f(a,b)=g(b,a))/\p(g(c,a)) ==> p(f(a,b)) |Simple a ==> a with distractions, from Preds&fns |
#    | theorem   | (a = b) /\ p(c,f(a)) ==> p(c,f(b)) | from Preds&fns     |
#    | theorem   | all(X, p(X)) ==> p(a) | From Pred calculus tests      |
#    | theorem   | all(Y,p(a,Y)       ===  p(Y,a))   /\ p(a,b) ==> p(b,a) | gnzd 1|
#    | theorem   | all(X,p(X,b)       ===  p(b,X))   /\ p(a,b) ==> p(b,a) | gnzd 2|
#    | theorem   | all(X,all(Y,p(X,Y) ===  p(Y,X) )) /\ p(a,b) ==> p(b,a) | gnzd 3|
#    | theorem   | ((a=b) /\ (b=c) ==> (a=c))       | Transitivity of =, (1.4) from equality |
#    | theorem   |  -(f(a) = f(b)) ==> -(a = b)     | modis tolens version      |
#    |non-theorem| all(X,-(a=X))                    |                           |
#    | theorem   | ((p===q) === r) === (p === (q===r)) | from eq and truth, associativity of === |
#    | theorem   |  p(a) /\ (a=b) ==> p(b)          |                           |
#    | theorem   |  -p(a) \/ p(b) \/ -(a=b)         | from preds&fns            |
#    |non-theorem|  (f(a) = f(b)) ==> (a = b)       | converse - move to preds&fns after testing |


#Scenario: Transitive elements out of order
#
#    Check that this works: A test for an "out of order" transitive proof. From
#    Equality tests.
#
#  * Formula "(a=c) \/ -((a=b) /\ (b=c))" is a theorem

Scenario: Turn off debugging

  * Debugging off

# Copyright (c) George S. Cowan, 2016. Licensed under the BSD 3-clause
# License which can be found packaged at the top directory of the eLeanTaP
# system, or at
#
#   https://opensource.org/licenses/BSD-3-Clause
