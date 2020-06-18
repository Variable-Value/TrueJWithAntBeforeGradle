Feature: Iteration with the while statement

  Iterations loop through a block of code, executing it repeatedly, until a stopping condition is
  reached. Here we only consider iteration with arithmetic problems. Looping through arrays and other more complex loops will be considered later.

  TODO: Develop the number theory that the loops depend on, instead of relying on the Java integers.

Scenario: The while loop

  The body of a loop statement is a block of code that is repeatedly executed to modify the state,
  each iteration starting with the state left by the previous iteration, until the test of a
  condition signals that the looping is done. The body has two goals: (1) accomplishing something
  that contributes to the desired final state, and (2) moving closer to the point at which the
  condition signals that the final state has been reached.

  Let's deal with stopping first. A "loop condition" tests whether the desired ending state has been
  reached, but it is just a test and does not guarantee that the end will ever arrive. So we use an
  expression, the "loop variant", that documents how the body changes the state in a way that
  progresses toward a stopping point. Some loop conditions are themselves a usable loop variant, but
  others don't quite do the job. When they are two different expressions, the programmer must
  arrange things so that by the time the loop variant has reached its stopping point, the loop
  condition will have reached its exit condition. But we also want a loop to accomplish something,
  so we use a "loop invariant" condition, which is carefully constructed to help us understand how
  the body accomplishes its goal; the loop exit condition and the loop invariant, together, must
  imply the goal of the loop statement.


    """
    int product(int multiplicand', int multiplier' >= 0) {
      int 'productSoFar = 0;
      loop for upThru(1, multiplier')
        productSoFar' = 'productSoFar + multiplicand';
      return productSoFar';
    }
    means return' = multiplicand' * multiplier';


  What the prover is implicitly using:

    int productWithDetails(int multiplicand', int multiplier') {
      given (multiplier' >= 0);
      int 'productSoFar = 0;

      variant
      invar
      loop for int i' : upThru(1, multiplier') {
        productSoFar' = 'productSoFar + multiplicand';
        means productSoFar' = multiplicand' * (i');
      }
      means productSoFar' = multiplicand' * multiplier';
      return productSoFar';
    }
    means return' = multiplicand' * multiplier';


  Using a generalized loop structure:

    Int productUsingGeneralLoop(Int multiplicand', Int multiplier') {
      given multiplier' >= 0;

      Int 'count = 0;
      Int 'product = 0;

      loop ('count --> count', 'product --> product') {
        variant 'count >= multiplier';
        invar 'product = multiplicand' * 'count;

        if ('count = multiplier')
          break (product' = multiplicand' * multiplier');

        product'soFar = 'product + multiplicand';
        count' = 'count+1;
        continue (product'soFar = multiplicand' * count');
      }
      final means 'product = multiplicand' * 'count;

      return product';
    }
    means return' = multiplicand' * multiplier'; // method final means



    /*
       When the variant is true, the next pass of the body must exit at a break and never reach a
       continue. Therefore, by modus tollens, when the body reaches a continue, the variant, in
       beginning values, must have been false at the beginning of that loop. (Should we put it at
       the bottom, then, after all possible continues? NO, because it needs to be stated in terms of
       the beginning values.)

       We begin with variant expressions involving Int types, but with care this could be applied to
       any finite-descending-chain (Neutherian) relation.
     */

    // ***    Verification conditions:    ****

         // invariant is supported at beginning of first loop
              multiplier' >= 0                            // given (not used)
            & 'count = 0
            & 'product = 0
          ==> 'product = multiplicand' * 'count           // invariant

         // meaning at break is supported
              'product = multiplicand' * 'count           // invariant
            & 'count = multiplier'                        // test for break
          ==> product' = multiplicand' * multiplier'

         // if we reach a continue on the first execution of the body, then the variant was false
         // at the beginning of that body execution
              forall(Int n',m' : n' < m' : n' + 1 <= m')  // included for each loop
            & multiplier' >= 0                            // given (not used)
            & 'count = 0
            & 'product = 0
            & 'product = multiplicand' * 'count           // invariant
            & ~('count = multiplier')                     // ~ break test
            & product'soFar = 'product + multiplicand'
            & count' = 'count+1
          ==> ~('count >= multiplier')

         // proof
            & multiplier' >= 0                              // given (not used)
            & 'count = 0
            & ('count < multiplier' | 'count > multiplier') // ~ break test
          ==> 'count < multiplier'                          // variant false

         // if we reach a continue on other than the first execution,
         // then the beginning variant must be false
              forall(Int n',m' : n' < m' : n' + 1 <= m')  // included for each loop
            & 'product = multiplicand' * 'count           // invariant
            & ~('count = multiplier')                     // ~ break test
            & product'soFar = 'product + multiplicand'
            & count' = 'count+1
          ==> ~('count >= multiplier')



              forall(Int n',m' : n' < m' : n' + 1 <= m')  // included for each loop
            & 'product = multiplicand' * 'count           // invariant
            & ('count < multiplier' | 'count > multiplier')    // ~ break test
            & product'soFar = 'product + multiplicand'
            & count' = 'count+1
          ==> 'count < multiplier'                         // variant false




         // invariant is supported at each continue
              forall(Int n',m' : n' < m' : n' + 1 <= m')  // included for each loop
            & ~('count >= multiplier')                    // ~ variant because we reached continue
            & 'product = multiplicand' * 'count           // invariant
            & ~('count = multiplier')                     // ~ break test
            & product'soFar = 'product + multiplicand'
            & count' = 'count+1
          ==> product'soFar = multiplicand' * count'

         // variant proceeds to finish - at each continue
              ~('count >= multiplier')                    // ~ variant
            & 'product = multiplicand' * 'count           // invariant
            & ~('count = multiplier')                     // ~ break test
            & product'soFar = 'product + multiplicand';
            & count' = 'count+1;                          // this is all we really need
          ==> 'count < count'

         /*
            The meaning of a loop is the disjunct of the meaning at each of its break-statements. If
            a break-statement does not have an associated meaning, then the meaning at the
            break-statement is the accumulated meaning of the code above it.
          */
         // meaning of method is supported - at final method means-statement
              product' = multiplicand' * multiplier'      // meaning of the loop
            & return' = product'
          ==> return' = multiplicand' * multiplier'





         L84: multiplier' >= 0
            & 'count = 0 & 'product = 0
            & ~('count < multiplier')
          ==> 'count = multiplier' (note primise is false)

         L84: multiplier' >= 0
            & 'product = multiplicand' * 'count & 'count <= multiplier'
            & ~(count' < multiplier')
          ==> 'count = multiplier'

       *** BELOW HERE, NOT COMPLETED ***

         L83: multiplier' >= 0
            & 'product = multiplicand' * 'count & 'count <= multiplier'
            & ~('count = multiplier')
            & product'soFar = 'product + multiplicand'
            & count' = 'count+1
            & 'count = multiplier'

         L85: multiplier' >= 0
            & count' = multiplier'
            & ( count' = 0 & product' = 0
              | product' = multiplicand' * count'
              )
            & return' = product'
          ==> return' = multiplicand' * multiplier'




      int product(int multiplicand', int multiplier') {
        given (multiplier' >= 0);
        int 'productSoFar = 0;
        int 'i = 0;
        while ('i != multiplier')
          invar ('productSoFar = multiplicand' * 'i);
          variant (Count)(multiplier' - i’);
        {
          productSoFar'inLoop = 'productSoFar + multiplicand';
          means (productSoFar'inLoop = multiplicand' * ('i+1));
          i' = 'i+1;
          means (productSoFar'inLoop = multiplicand' * i');
        } ('productSoFar -> productSoFar')
        means (productSoFar' = multiplicand' * multiplier');
        return productSoFar';
      }
      Means(return = multiplicand' * multiplier');
    """

Scenario: In a status statement, each conjunct of a top-level forall is checked separately

    We make use of the fact that

      forall(X:SetOfX) (p(X) & q(X)) === forall(X:SetOfX) p(X) & forall(X:SetOfX) q(X)

    and evaluate each conjunct of the right-hand side separately.

    TODO:
      We also might split an implication with a conjunctive RHS or a disjunctive LHS. And, we could
      check all resulting statements from universal quantification and implication for whether they
      are conjunctive. And we have disjunctions under negations. We are essentially keeping track of
      parity, splitting anything that is equivalent to a non-negated conjunction. But what kinds and
      levels of splits will help the programmer see the error, and what splitting makes the error
      more difficult to understand? This will become even more of an issue when method meanings are
      allowed in status statements. Perhaps we should check and report each error in its own syntax
      before burrowing down to the next level in order to give the programmer a clear context at
      each stage.

      I think I like the following even better: When there is an error, display the top level
      conjunct while highlighting the lowest level phrase discovered thru parity-driven conjunct
      checking.

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
