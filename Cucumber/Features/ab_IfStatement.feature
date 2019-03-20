Feature: The if statement

  The if-control-structure provides us with the ability to program conditional operations. Later we
  will cover the switch/case statement, but we postpone that until we have the basics of the T
  language introduced.


Scenario: The if-statement allows alternative definitions for values

    A value name has only one value for the whole range of its scope, but that value may be selected
    from different options, depending upon the runtime conditions of the state.

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
    means (   'hasDiscount ==> rate' = discountRate'
          & ! 'hasDiscount ==> rate' = standardRate'
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

  The definitions in the else branch are often trivial, and the compiler omits them in the generated
  code. This may be simplified in future versions if a suitable symbol or keyword can be found,
  perhaps "default", or as a pseudo-function like "default(a', b')", or even as a default-clause
  that is an alternative to the else-clause.

  But a valid run unit is
    """
    class Swapper_2 {

    int a;
    int b;

    void validSwap() {
      if ('a = 'b) {
        a' = 'a; // the Java compiler generates a null operation a = a and b = b
        b' = 'b; // for a = a and b = b
      } else {
        a' = 'b;
        b' = 'a;
      }
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """

#  Scenario: A more complex example - ThreeSort
#
#    This version of sorting three items minimizes copying in each case.
#
#    The means-statement is used to good effect to keep track of the state determined so far. If
#    there are mistakes in programming, the final means statement for the threeSort() method could be
#    copied to the end of suspected cases to see which one is at fault.
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
#        } else { // 'a & 'c both <= 'b
#          if ('a <= 'c) {
#            means ('a <= 'c && 'c <= 'b); // 'a <= 'c <= 'b);
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
#            c' = 'b;
#          }
#        }
#      }
#    }
#    means (a' <= b' && b' <= c');
#
#    } // end class
#    """

#  @Ignore # save this for after we have established proving for less-than relations

# END @Ignore --------------------