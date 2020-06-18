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

  First we test a null case where the loop is never executed. Even here, we must ensure that the
  invariant is maintained if the loop were executed.

  * a valid run unit is
    """
    class NullLoopExample {

      boolean 'b;

      void nullLoop() {
        (n' --> n')
        while 'n < 0 {
          invar true;
          variant 'n < 0;

          n' = n + 1;
        }
      }
      means n' >= 0;
    }
    """

#  # TODO:
#  Given the assumption
#    """
#      forall(number n', m' : m' >= 0 : n' * (m'+1) = n'*m' + n')
#    &
#    """
#
#  * A valid run unit is
#    """
#    class ProductExample {
#
#      int productByAddition(int multiplicand', int multiplier') {
#        given (multiplier' >= 0);
#
#        int 'productSoFar = 0;
#        int 'i = 0;
#
#        ('productSoFar --> productSoFar')
#        while ('i < multiplier') {
#          invar i' >= multiplier' & 'productSoFar = multiplicand' * 'i;
#          variant multiplier' - i’ > 0;
#
#          productSoFar'inLoop = 'productSoFar + multiplicand';
#          means (productSoFar'inLoop = multiplicand' * ('i+1));
#
#          i' = 'i+1;
#          means (productSoFar'inLoop = multiplicand' * i');
#        }
#        means (productSoFar' = multiplicand' * multiplier');
#
#        return productSoFar';
#      }
#      means(return' = multiplicand' * multiplier');
#
#    }
#    """
#
#  * A valid run unit is
#    """
#    int product(int multiplicand', int multiplier') {
#      given (multiplier' >= 0);
#      int 'productSoFar = 0;
#      int 'i = 0;
#      while ('i != multiplier')
#        'productSoFar --> productSoFar';
#        invar 'productSoFar = multiplicand' * 'i;
#        variant multiplier' - i’ > 0;
#      {
#        productSoFar'inLoop = 'productSoFar + multiplicand';
#        means (productSoFar'inLoop = multiplicand' * ('i+1));
#        i' = 'i+1;
#        means (productSoFar'inLoop = multiplicand' * i');
#      }
#      means (productSoFar' = multiplicand' * multiplier');
#      return productSoFar';
#    }
#    Means(return = multiplicand' * multiplier');
#    """