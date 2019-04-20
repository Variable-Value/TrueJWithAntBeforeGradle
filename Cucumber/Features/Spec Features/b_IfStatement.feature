Feature: The if statement

  The if-control-structure provides us with the ability to program conditional operations. Later we
  will cover the switch/case statement, but we postpone that until we have the basics of the T
  language introduced.


Scenario: The if-statement allows alternative definitions for values

    A value name has only one value for the whole range of its scope, but that value may be selected
    from different options, depending upon the runtime conditions of the state.

  #  * using feature "***** b_IfStatement.feature - allows alternative definitions - first test *****\n"

  * A valid T Language run unit is
    """
    class Rates {

    double rate;

    double standardRate' = 0.05;
    double discountRate' = 0.15;

    boolean hasDiscount;

    void setRate() {
      if ('hasDiscount) rate' = discountRate';
                   else rate' = standardRate';
    // a natural logic for if-then-else statements
    means ( (   'hasDiscount ==> rate' = discountRate' )
          & ( ! 'hasDiscount ==> rate' = standardRate' )
          );
    }
    // an equivalent logic
    means ( (   'hasDiscount & rate' = discountRate')
          | ( ! 'hasDiscount & rate' = standardRate')
          );

    } // end class
    """

Scenario: Any value set in one branch of an if-statement must be set in both

    For a value name to be available to an operation or logic statement later in its scope, it must
    be defined along all paths to that statement. For an if-statement, this means that it must be
    defined in both branches.

  When an invalid run unit is
    """
    class Rates_1X {

    double rate;
    double reportRate;

    double standardRate' = 0.05;
    double discountRate' = 0.15;

    boolean hasDiscount;

    void setRate() {
      rate'standard = standardRate';
      if ('hasDiscount)
        rate' = discountRate';
      else
        ; // ERROR: attempting to let rate variable default to rate'standard previous value

      reportRate' = rate'; /* This is also an error because rate' is not defined in all paths
                            * but it is not discovered here */
    }
    means ( (   'hasDiscount & reportRate' = discountRate')
          | ( ! 'hasDiscount & reportRate' = standardRate')
              /* this last disjunct would also be an error because there is no proof
                * that reportRate' = standardRate' when 'hasDiscount = false,
                * but it is not found because the else-error stops the proof attempt */
          );

    } // end class
    """

    Then an error message contains
    """
    rate' was not defined in the else-clause
    """

Scenario: An if-then-statement, without the else clause, cannot set values in both conditions

  The then-only version of the if-statement becomes much less useful because value names must be
  defined under all cases. (However, a single branch of an if statement may be used if no value
  names are defined. Perhaps writing to a log file would be a good example, but even that would not
  apply if you wanted the accuracy of the log file to be part of the specification.)

  When an invalid run unit is
    """
    class Swapper_1 {

    int a;
    int b;

    /** We (invalidly) attempt to avoid swapping the two values when they are equal. */
    void invalidSwap() {
      if ('a != 'b) {
        a' = 'b;
        b' = 'a;
      }
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """

    Then an error message contains
    """
    a' was not defined in the else-clause
    """
    And an error message contains
    """
    b' was not defined in the else-clause
    """


Scenario: Always include definitions of value names in all branches

    Every branch of a conditional statement must define the same value names. If this were not true,
    then the only value names that could be reused in the code following the conditional statement
    would be those that were defined in all branches. So at the point where a value name was reused,
    all paths through the preceding code would need to be checked to ensure that each one defined
    the value name. And the worst part would be that it would be very difficult to help a programmer
    pinpoint where the missing definition was in an error message.

    By insisting that every branch define the same value names, we ensure that the programmer always
    has a consistent set of prior value names. And our error messages are helpful because they point
    to the branch that omits a value name, or misspells it, or attempts to define a new name that
    was not in prior branches.

    Sometimes a value name will be needed in only one branch. When this happens, one approach is for
    the programmer to use a new local variable instead. Otherwise the programmer will be required to
    define that value name in another branch solely because it was needed in this branch. However,
    in the other branch, if the programmer writes this otherwise unneeded definition as a trivial
    assignment of the latest value to the needed value name, the compiler will recognize that it
    doesn't need to generate any code to establish the truth of the assignment's semantics, and that
    semantics will still be available for use in status expressions following the conditional
    statement.

    Although we require the value names to be the same from branch to branch, we do not require them
    to be defined in the same order. Even the last value name used for a variable can be different from one branch to another.

    The coding could be simplified if a suitable default value for the missing value names from a branch could be established, perhaps the first or last value of the variable in the branch scope. Then a perhaps a pseudo-function could be used taking parameters of the value names that would otherwise be undefined, for instance, "default(a', b')", or just "default", or the compiler could always default the value names without requiring extra code. A disadvantage of this approach is that it makes the mapping from the executable code to its meaning a little more obscure.

  #  * using feature "***** b_IfStatement.feature - Include definitions of value names - first test *****"

  * a valid run unit is
    """
    class Swapper_2 {

    int a;
    int b;

    void validSwap() {
      if ('a = 'b) {
        a' = 'a; // the compiler generates a null operation for the assignments
        b' = 'b;
      } else {
        a' = 'b;
        b' = 'a;
      }
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """


  * a valid run unit is
    """
    class Swapper_3 {

    int a;
    int b;

    void validSwap() {
      if ('a = 'b) {
        a'temp1 = 'b;
        a'temp2 = a'temp1;
        b'temp1 = 'a;
        b'temp2 = b'temp1;
      } else {
        a'temp2 = 'b; // note the different order of assignment here to the variables a and b
        a'temp1 = a'temp2;
        b'temp2 = 'a;
        b'temp1 = b'temp2;
      }
      a' = a'temp2;
      b' = b'temp2;
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """
    # see the generated code for this example in ba_IfStatementEndToEnd.feature

#  Scenario: A more complex example - ThreeSort
  #
  #    This version of sorting three items minimizes copying in each case.
  #
  #    The means-statements are used to keep track of the state determined so far. We do not do the
  #    obvious simplifications because we have not yet presented a theory of comparisons to justify
  #    translating, say, !('b <= 'c) to ('c < 'b).
  #
  #    The implicit local variable that TrueJ creates is often helpful, but in one case we need to use a different ordering of the code than our preferred one to avoid creating two implicit local variables.
  #
  #  * A valid T Language run unit is
  #    """
  #    class Triplet {
  #
  #    int a;
  #    int b;
  #    int c;
  #
  #    void threeSort() {
  #      if ('a <= 'b ) {
  #        if ('b <= 'c) { // already in order
  #          a' = 'a;                          // no-op
  #          b' = 'b;                          // no-op
  #          c' = 'c;                          // no-op
  #        } else { // 'a & 'c are both <= 'b
  #          if ('a <= 'c) {
  #            means ('a <= 'c && !('b <= 'c)); // actually 'a <= 'c < 'b
  #            a' = 'a;                        // no-op
  #            b' = 'c;
  #            c' = 'b;
  #          } else {
  #            means ('c < 'a && 'a <= 'b); // 'c < 'a <= 'b);
  #            a' = 'c;
  #            c' = 'b; // definition of c' and b' swapped to minimize implicit local variables
  #            b' = 'a;
  #          }
  #        }
  #      } else { // 'b < 'a
  #        if ('a <= 'c) { // 'b < 'a <= 'c
  #          means ('b < 'a && 'a <= 'c); // 'b < 'a <= 'c);
  #          a' = 'b;
  #          b' = 'a;
  #          c' = 'c;                          // no-op
  #        } else {          // 'b & 'c both <= 'a
  #          if ('b <= 'c) {
  #            means ('b <= 'c && 'c < 'a); // 'b <= 'c < 'a
  #            a' = 'b;
  #            b' = 'c;
  #            c' = 'a;
  #          } else {
  #            means ('c < 'b && 'b < 'a); // 'c < 'b < 'a);
  #            a' = 'c;
  #            b' = 'b;                        // no-op
  #            c' = 'b; // RED TEST (should be c' = 'a;)
  #          }
  #        }
  #      }
  #    }
  #    means (a' <= b' && b' <= c');
  #
  #    } // end class
  #    """
