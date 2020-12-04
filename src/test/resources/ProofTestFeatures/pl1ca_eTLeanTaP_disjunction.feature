Feature: Disjunction     (Tests for the eLeanTaP system) 
    Copyright and license information at bottom of file.

    This file contains the tests for the axioms and theorems about disjunction 
    in the propositional calculus, which we represent in the input language with 
    "\/" and in the internal language with Prolog's ";". We rely on 
    (Gries&Schneider, 1993) in testing a complete set of theorems.

    Background information on the prover and its language is in the feature file
    pl1aa_eLeanTap_eqivalence_truth.feature.


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And Java debugging
#  And using feature "pl1ca_eTLeanTaP_disjunction"


Scenario Outline: Simple Examples

  When the FOP is "<Statement>"
  Then it is a "<Result>"
  * Note that "<Note>"

  # In the following, parenthetic numbers are a reference to the the
  # theorems collected in the final pages of David Gries & Fred B. Schneider, A 
  # Logical Approach to Discrete Math, 1993. For instance, (3.8) refers to their
  # Axiom, "Definition of false".

  Examples:
    | Result    | Statement                   | Note                           |
#   |-----------|-----------------------------|--------------------------------|
    | theorem   | p \/ q === q \/ p           | Axiom: Symmetry of \/ (3.24)   |
    | theorem   | (p\/q) \/ r === p \/ (q\/r) | Axiom: Associativity (3.25)    |
    | theorem   | p \/ p === p                | Axiom: Idempotency (3.26)      |
    | theorem   | p \/ -p                     | Axiom: Excluded Middle (3.28)  |
    | theorem   | p \/ true === true    | Zero of \/ (3.29)              |
    | theorem   | p \/ false === p         | Identity of \/ (3.30)          |
    | theorem   | p\/q === p\/ -q === p       | Theorem (3.32)                 |
    |non-theorem| p \/ q === p === q          | nonsense                       |


Scenario: Axiom: Distributivity of \/ over === (3.27)

  * Formula "p \/ (q === r)   ===   (p \/ q) === (p \/ r)" is a theorem


Scenario: Axiom: Distributivity of \/ over \/ (3.31)

  * Formula "p \/ (q \/ r)   ===   (p \/ q) \/ (p \/ r)" is a theorem



# Copyright (c) George S. Cowan, 2016. Licensed under the BSD 3-clause 
# License which can be found packaged with the eLeanTaP system or at 
#
#   https://opensource.org/licenses/BSD-3-Clause
