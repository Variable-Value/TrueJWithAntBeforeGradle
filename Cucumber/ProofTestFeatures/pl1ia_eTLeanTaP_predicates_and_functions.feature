Feature: Predicates and functions     (Tests for the eLeanTaP system) 
    Copyright and license information at bottom of file.

    Here we provide tests that logic works with precicates and equality works 
    with functions. We normally represent a predicate as p(x) or q(x) and a 
    function as f(x) or g(x).

    One important result covered here is that Boolean functions must never be 
    treated as predicates. That is, instead of saying that the boolean result of 
    function f(y) holds, we must state that it is equal to true. For instance,
      not  p(y) /\ f(x)
      but  p(y) /\ f(x)=true
    
    More information on the prover and its language is in the feature file
        
      pl1aa_eLeanTap_eqivalence_truth.feature


Background: The theorem prover is loaded into a tuProlog engine
  Given a Prolog engine
  And the eTLeanTap theory is loaded
#  And Java debugging
#  And using feature "pl1ia_eTLeanTaP_predicates_and_functions"

Scenario: Simple examples of non-theorems

    These statements have no support, that is, they depend upon facts that are
    not stated. Therefore they cannot be proven.

  * Formula "p(a,b,c) ==> q(a,b,c)" is not a theorem

  * Formula "p(a,f(b,c)) ==> p(a,g(b,c))" is not a theorem

  * Formula "f(a,b,c) = g(a,b,c)" is not a theorem


Scenario Outline: Simple Examples

  When the FOP is "<Statement>"
  Then it is a "<Result>"
  * Note that "<Note>"

  Examples:
    | Result    | Statement                       | Note                       |
    #-----------|---------------------------------|----------------------------| 
    | theorem   | f(a,b) = f(a,b)                 | Arg equality is reflexive  |
    |non-theorem| p(a)   =   p(b)                 | Arguments are not arbitrary|
    | theorem   |  a = b ==> f(a) = f(b)          | Leibnitz in functions (1.8)|
    | theorem   |  b = a ==> f(a) = f(b)          |   and using symmetry       |
    | theorem   |  -(f(a) = f(b)) ==> -(b = a)    |   modis tolens version     |
    |non-theorem| f(a) = f(b) ==> a=b             | e.g., -(a=b)/\all(X,f(X)=c)|
    | theorem   | ( p(b) /\ a = b ) ==> p(a)      | Substitution of arguments  |
    | theorem   | (p(b) === p(a))/\p(b) ==> p(a)  |Equiv Predicate substitution|
    # 
    | theorem   | (p(a,b) ===  p(b,a)) /\ p(a,b) ==> p(b,a) | match with args  |
    | theorem   | all(X,all(Y,p(X,Y) ===  p(Y,X) )) /\ p(a,b) ==> p(b,a) | gnzd|
    #
    | theorem   | (f(a,b) = f(b,a)) /\ p(f(a,b)) ==> p(f(b,a)) | match in fns  |
    | theorem   | all(X,all(Y,f(X,Y) = f(Y,X) )) /\ p(f(a,b)) ==> p(f(b,a))|gnz|
    #
    | theorem   | (a = b) /\ p(c,f(a)) ==> p(c,f(b)) |Deep arguments           |
    | theorem  |(a = c) /\ f(a,b) = g(a,d) ==> f(a,b) = g(c,d) |Fns in equality|
    #
    | theorem  |(f(a,b)=g(b,a))/\p(g(b,a)) ==> p(f(a,b)) |different fns in pred|
    | theorem   |  -p(a) \/ p(b) \/ -(a=b)        | inequality implies arg ineq |
    

Scenario: Simple a ==> a with distractions to exercise the prover

  * Formula "-p(a) /\ p(f(a,b)) /\ (f(a,b)=g(b,a))/\p(g(c,a)) ==> p(f(a,b))" is a theorem


Scenario: Generalized use of functions in equalities

  * Formula "(a = b) /\ all(X,p(X,f(a))) ==> p(c,f(b))" is a theorem

  * Formula "(a = c) /\ all(X,f(X,b) = g(X,d)) ==> (f(a,b) = g(c,d))" is a theorem


Scenario: Order of argument use is not important to the prover
  
  The prover implements this with a feature called "guarded expressions". This
  test ensures that guarded expressions work reguardless of order.

  * Formula "(f(a) = f(d)) \/ -((a=b) /\ (b=c) /\ (c=d))" is a theorem


Scenario: Ensure disjunction with argument testing and other works

  The prover was discarding the information that it needed to prove a 
  disjunction when statements involving arguments were involved.

  * Formula "(f(a)=f(b)) /\ -(f(b)=f(c)) ==> -(b=c) /\ -(f(a)=f(c))" is a theorem
#  * Formula "-(f(b)=f(c)) /\ (f(a)=f(b)) ==> -(a=c) /\ -(f(a)=f(c))" is a theorem
#  * Formula "-(f(a)=f(b)) /\ (f(b)=f(c)) ==> -(a=b) /\ -(f(a)=f(c))" is a theorem 

  * Formula "-p(b) /\ p(a) ==> -(a=b) /\ p(a)" is a theorem
#  * Formula "p(b) /\ -p(a) ==> -(a=b) /\ -p(a)" is a theorem


Scenario: Special treatment for booleans as a predicate and in (in-)equalities

  We wish we could use boolean variables with equality (=) as well as using them
  as predicates, for instance with implication, ==>, but our implementation does
  not allow this. A single additional requirement would be needed to state what 
  is desired:

    p === q  ===  (p=q) 

  However, the programming difficulties of treating booleans as both predicates 
  and boolean variables that can be compared require us to take a different 
  tack: one options is to transform all predicates into boolean comparisons by
  equating them with true. For instance, our required statement becomes

    (p=true) === (q=true)  ===  (p=q) 

  In addition, we must add the facts that make a p and q be boolean variables, 
  that is, they are each either true or false. Even though we can get away with 
  leaving these boolean facts off in certain similar looking cases because of 
  the way equalities are implemented, we usually end up with statements looking 
  like
  
    ((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) 
    ==> 
    ( (p=true) === (p=q) === (q=true) )
  
  Prepending boolean antecedents does not slow processing significantly for any 
  statement that does not need them. And the implementation of the prover quite 
  reasonably requires that two things must be declared to be equal in order for 
  it to prove that they are always equal; therefore we are not required to state 
  that -(true=false)
  
  One would think that there would be another option: to transform boolean 
  comparisons into logical equivalences like the following modification of the 
  above example:

    p === q  ===  (p=q)   becomes   p === q  ===  (p===q)
     
  
  However, treating a boolean result as sometimes an object and sometimes a 
  predicate greatly complicates the prover.
  
  Therefore, the user must change all uses of a boolean variable as a predicate 
  to a comparison with true, and add the boolean facts for each boolean variable 
  or predicate.
  
  Here are the tests of this version of our required statement, along with 
  various similar statements that it implies, which were useful in testing, as 
  comments.

#  * Formula "p === (p=q) === q" is a theorem # The prover cannot handle this

  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> ( (p=true) === (p=q) === (q=true) )" is a theorem

#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> (((p=true) === (q=true)) ==> (p=q))" is a theorem
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> ((-(p=true) === -(q=true)) ==> (p=q))" is a theorem
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> (-(p=true) ==> (-(p=q) ==> (q=true)))" is a theorem
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> (-(p=q)  ==>  (-(p=true) ==> (q=true)))" is a theorem
#
## The following do not require the boolean antecedents
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> (((p=true) /\ (p=q))  ==>  (q=true))" is a theorem
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> ((p=true) ==> ((p=q) ==> (q=true)))" is a theorem
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> ((p=q)  ==>  ((p=true) ==> (q=true)))" is a theorem
#
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> ((-(p=true) /\ (p=q))  ==>  -(q=true))" is a theorem
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> (-(p=true) ==> ((p=q) ==> -(q=true)))" is a theorem
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> ((p=q)  ==>  (-(p=true) ==> -(q=true)))" is a theorem
#
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> (((p=true) /\ -(p=q))  ==>  -(q=true))" is a theorem
#  * Formula "((p=true)\/(p=false)) /\ ((q=true)\/(q=false)) ==> (((p=true) === -(q=true)) ==> -(p=q))" is a theorem


# Copyright (c) George S. Cowan, 2016. Licensed under the BSD 3-clause 
# License which can be found packaged with the eLeanTaP system or at 
#
#   https://opensource.org/licenses/BSD-3-Clause
