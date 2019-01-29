Feature: Conjunction     (Tests for the eLeanTaP system)
    Copyright and license information at bottom of file.

    This file contains the tests for the axioms and theorems about conjunction in the propositional
    calculus, which we represent in the input language with "\/" and in the internal language with
    Prolog's ",". We rely on the theorems and axioms of (Gries&Schneider, 1993) as part of creating
    a complete test of the prover.

    Background information on the prover and its language is in the feature file
    pl1aa_eLeanTap_eqivalence_truth.feature.


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And Java debugging
  And using feature "pl1da_eTLeanTaP_conjunction"

Scenario Outline: Simple Examples

  When the FOP is "<Statement>"
  Then it is a "<Result>"
  * Note that "<Note>"

  # In the following, parenthetic numbers are a reference to the theorems collected in the final
  # pages of (Gries&Schneider, 1993). For instance, (3.8) refers to the Axiom, Definition of false.

  Examples:
    | Result    | Statement                   | Note                           |
    #-----------|-----------------------------|--------------------------------|
    | theorem   | p/\q === p === q === q\/p   | Axiom: Golden Rule (3.35)      |
    |non-theorem| p /\ q === p === q          | nonsense ((f/\f)===f) === t    |
    | theorem   | p /\ q === q /\ p           | Symmetry (3.36)                |
    | theorem   | (p/\q) /\ r === p /\ (q/\r) | Associativity (3.37)           |
    | theorem   | p/\(q/\r) === p/\q/\r       | Parentheses not needed by Assoc|
    | theorem   | p /\ p === p                | Idempotency (3.38)             |
    | theorem   | p /\ true === p          | Identity of /\ (3.39)          |
    | theorem   | p /\ false === false  | Zero of /\ (3.40)              |
    | theorem   | p/\(q/\r) === (p/\q)/\(p/\r)| /\ distributes over /\ (3.41)  |
    | theorem   | p /\ -p === false        | Contradiction (3.42)           |
    | theorem   | p/\(p\/q) === p             | Absorbtion (3.43)              |
    | theorem   | p\/(p/\q) === p             | Absorbtion (3.43)              |
    | theorem   | p/\(-p\/q) === p/\q         | Absorbtion (3.44)              |
    | theorem   | p\/(-p/\q) === p\/q         | Absorbtion (3.44)              |
    | theorem   | p\/(q/\r) === (p\/q)/\(p\/r)| Absorbtion (3.45)              |
    | theorem   | p/\(q\/r) === (p/\q)\/(p/\r)| Absorbtion (3.46)              |
    | theorem   | -(p/\q) === (-p \/ -q)      | De Morgan (3.47)               |
    | theorem   | -(p\/q) === (-p /\ -q)      | De Morgan (3.47)               |
    | theorem   | (p\/q)/\(-p\/q) === q       | Resolution                     |
    | theorem   | (p/\q)\/(-p/\q) === q       | Resolution                     |
    # TODO: WORKING HERE p.52

    # Why do the following fail to parse?
    #| theorem   | -(p/\q) === (-q\/-p)        | De MorgaN (3.47)             |
    #| theorem   | -(p\/q) === (-q/\-p)        | De MorgaN (3.47)             |


Scenario: Axiom: Distributivity of \/ over === (3.27)

  * Formula "p \/ (q === r)   ===   (p \/ q) === (p \/ r)" is a theorem


Scenario: Axiom: Distributivity of \/ over \/ (3.31)

  * Formula "p \/ (q \/ r)   ===   (p \/ q) \/ (p \/ r)" is a theorem


Scenario: If-then-else equivalence for use in proving program correctness

  The equivalent statement is better for use in some provers because there is only a single
  disjunction.

  * Formula "(p==>q)  /\ (-p==>r) === (p/\q) \/ (-p/\r)" is a theorem

#Scenario: References
#
#  David Gries & Fred B. Schneider, A Logical Approach to Discrete Math, 1993.
#
#  * End References

# Copyright (c) George S. Cowan, 2016. Licensed under the BSD 3-clause
# License which can be found packaged with the eLeanTaP system or at
#
#   https://opensource.org/licenses/BSD-3-Clause
