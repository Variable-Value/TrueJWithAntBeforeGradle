Feature: Equality of objects     (Tests for the eLeanTaP system)
    Copyright and license information at bottom of file.

    Here we provide tests of the equality proof features of the T language
    compiler's theorem prover. The symbols = and #= are used to represent
    equality and inequality.

    Background information on the prover and its language is in the feature file
    pl1aa_eLeanTap_eqivalence_truth.feature.


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And Java debugging
#  And using feature "pl1fe_eTLeanTaP_equality"

Scenario Outline: Simple Examples

  When the FOP is "<Statement>"
  Then it is a "<Result>"
  * Note that "<Note>"

  Examples:
    | Result    | Statement                       | Note                       |
    #-----------|---------------------------------|----------------------------|
    | theorem   | f(a) = f(a)                     |Function = reflexivity (1.2)|
    | theorem   | a = a                           |Constant = reflexivity (1.2)|
    | theorem   | a ==> a                         | Simple implication         |
    | theorem   | a <== a                         | Simple Consequence         |
    | theorem   | a /\ b ==> a /\ b               | Simple Consequence         |
    | theorem   | a = a === true                  | Identity of =, (3.3)       |
    | theorem   |  a = b === b = a                | Symmetry of =, (1.3)       |
    | theorem   | -(a = b) === -(b = a)           | Symmetry of =, (1.3)       |
    | theorem   |  a #= b === -(a = b)            | Def of #= (3.10)           |
    | theorem   |  a #= a === false               | #= is nonreflexive         |
    | theorem   | (a #= b) === (b #= a)           | Symmetry of #=, (3.16)     |
    | theorem   |  f(a) = f(b) ===  f(b) = f(a)   | Symmetry of =, (1.3)       |
    | theorem   | -(f(a)=f(b)) === -(f(b)=f(a))   | Symmetry of =, (1.3)       |
    | theorem   |  f(a) #= f(b) ===  f(b) #= f(a) | Symmetry of #=, (3.16)     |
    | theorem   | ((a=b) /\ (b=c) ==> (a=c))      | Transitivity of =, (1.4)   |
    | theorem   | (a=c) \/ -((a=b) /\ (b=c))      | Transitivity out of order  |
    | theorem   | ((a=b)/\(b=c)/\(c=d) ==> (a=d)) | More transitivity of =     |
    | theorem   | ((a=b)/\(b=c)/\(c=d)/\(d=e) ==> (a=e)) | Long transitivity   |
    | theorem   |  (a=c) /\ -(b=c) ==> -(a=b)     | flip side of transitivity  |
    | theorem   |  (b=c) /\ -(a=c) ==> -(a=b)     | flip side of transitivity  |
    | theorem   |  (b=c) /\ -(a=c) ==> -(b=a)     | flip side of transitivity  |
    #
    |non-theorem| all(X, (a=X))                   | e.g., X = 2 and a #= 2     |
    | theorem   |  ex(X, (a=X))                   | e.g., X = a                |
    |non-theorem| all(X,-(a=X))                   | e.g., X = a                |
    |non-theorem| all(X, (f(a)=f(X)))             | e.g., X = 2 and a #= 2     |
    |non-theorem| all(X,-(f(a)=f(X)))             | e.g., X = a                |
    |non-theorem| all(X,all(Y, (Y=X)))            | checking equality matching |
    |non-theorem| all(X,all(Y,-(Y=X)))            | checking equality matching |
    |non-theorem| all(X,all(Y, (f(Y)=f(X))))      | checking equality matching |
    |non-theorem| all(X,all(Y,-(f(Y)=f(X))))      | checking equality matching |

Scenario: Transitive chain on each side of an inequality

  These formulas require the prover to store a lot of transitive chain
  information for later use. The second formula causes the prover to reach its
  depth limit.

  * Formula "(a=b) /\ (b=c) /\ (c#=d ) /\ (d=e) /\ (e=f)  ==> (f#=a)" is a theorem

  * Formula "(a=b) /\ (b=c) /\ (c#=d) /\ (d=e) /\ (e=f)  ==> (f=a)" is not a theorem


Scenario: Alternative equalities matching two different transitive chains

  This test ensures that the prover doesn't get confused by reusing a transitive
  chain.

  * Formula "(a=b) ==> ( ((b=c) ==> (a=c)) /\ ((b=d) ==> (a=d)) )" is a theorem


# Copyright (c) George S. Cowan, 2016. Licensed under the BSD 3-clause
# License which can be found packaged with the eLeanTaP system or at
#
#   https://opensource.org/licenses/BSD-3-Clause
