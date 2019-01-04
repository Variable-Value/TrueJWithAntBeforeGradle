Feature: Negation & False - eLeanTaP 1.0 (for T Language 0.1)
    Copyright and license information at bottom of file.

    This file contains the tests for the axioms and theorems about negation and 
    falsity in the propositional calculus. We rely on (Gries&Schneider, 1993) in 
    testing a complete set of theorems.

    Background information on the prover and its language is in the feature file
    pl1aa_eLeanTap_eqivalence_truth.feature.


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And Java debugging
#  And using feature "pl1ba_eTLeanTaP_negation_false"

Scenario Outline: Simple Examples

  When the FOP is "<Statement>"
  Then it is a "<Result>"
  * Note that "<Note>"

  # In the following table, parenthetic numbers are a reference to the the
  # theorems collected in the final pages of David Gries & Fred B. Schneider, A 
  # Logical Approach to Discrete Math, 1993. For instance, (3.8) refers to their
  # Axiom, "Definition of false".

  Examples:
    | Result    | Statement                   | Note                           |
    | theorem   | false === -true       | Def of false (3.8)             |
    | theorem   | -(p === q) ===  -p ===  q   | Distributivity - over === (3.9)|
    |non-theorem| -(p === q) === (-p === -q ) | Invalid distributivity         |
    | theorem   | ((p =#= q)) === -(p === q)  | Def of inequality  =#=  (3.10) |
    | theorem   | -p === q === p === -q       | Theorem (3.11)                 |
    | theorem   | -(-p) === p                 | Double negation (3.12)         |
    | theorem   | -false === true       | Negation of false (3.13)       |
    |non-theorem|  false === true       | false and true are distinct    |
    | theorem   | -p === p === false       | Theorem (3.15)                 |
    | theorem   | (p =#= q) === (q =#= p)     | Symmetry of =#= (3.16)         |


Scenario: Associativity of =#= (3.17)

  * Formula "((p=#=q)=#=r) === (p=#=(q=#=r))" is a theorem

  * Formula "(p=#=q =#= r) === (p =#= q=#=r)" is a theorem


Scenario: Mutual associativity (3.18) and interchangeability (3.19)

  * Formula "((p=#=q)===r)  ===  (p=#=(q===r))" is a theorem

  * Formula   "p=#=q ===r   ===   p=== q=#=r"   is a theorem


Scenario: Using Mutual Associativity to restate Associativity of =#=

    We don't need parentheses for strings of "===" and "=#=" because of mutual 
    associativity, and in fact, if we need it to make a proof simpler, we can 
    swap them around as we please because of their interchangeability; we can 
    even swap around the propositional variables because of the symmetry of 
    "===" and "=#=".

  * Formula "p =#= q =#= r === p =#= q =#= r" is a theorem

  * Formula "p === q =#= r =#= p =#= q =#= r" is a theorem

  * Formula "p === p =#= q =#= q =#= r =#= r" is a theorem


# Copyright (c) George S. Cowan, 2016. Licensed under the BSD 3-clause 
# License which can be found packaged with the eLeanTaP system or at 
#
#   https://opensource.org/licenses/BSD-3-Clause
