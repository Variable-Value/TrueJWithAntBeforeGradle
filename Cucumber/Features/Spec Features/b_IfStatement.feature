Feature: The if statement

  The if-statement control structure provides conditional operations. We postpone discussing the
  switch/case statement until we have introduced the basics of the TrueJ language.

Scenario: The if-statement allows alternative definitions for values

    A value name has only one value for the whole range of its scope, but that value may be selected
    from different options, depending upon the runtime conditions of the state.

  * A valid run unit is
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

Scenario: A valid value name has a definition in each branch of a conditional

    For a value name to be available to an operation or logic statement later in its scope, it must
    be defined along all paths to that statement. For an if-statement, this means that it must be
    defined in both branches. And we are able to issue helpful error messages because they point to
    the branch that omits a value name, or misspells it, or attempts to define a new name that was
    not in prior branches.

    Although we require the value names to be the same from branch to branch, we do not require them
    to be defined in the same order.

    Sometimes a value name will be needed in only one branch. When this happens, one approach is for
    the programmer to use a new local variable instead. Otherwise the programmer will be required to
    define that value name in another branch solely because it was needed in this branch. However,
    in the other branch, if the programmer writes this otherwise unneeded definition as a trivial
    assignment of the latest value to the needed value name, the compiler will at least recognize
    that it doesn't need to generate any executablecode to establish the truth of the assignment's
    semantics, and that semantics will still be available for use in status expressions following
    the conditional statement.

    SHOULD WE DO THIS INSTEAD?
      Ignore an ill-defined value name until an attempt is made to reference it. The advantage of
      this method is that value names in if-statements do not require trivial self-assignments in
      other branches. The disadvantage is that the programmer may attempt to use a value name later
      and be surprised that the preceding and previously error-free code does not allow it to be
      used. But perhaps well written error messages would solve this problem.

      (As an Implementation note, checking whether a value is defined on all branches would still be
      required, and issuing a good error message to help the programmer locate a problem would
      require saving the same information that is now reported.)

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

Scenario: A more complex example - ThreeSort

    This version of sorting three items minimizes copying in each case.

    The means-statements are used to keep track of the state determined so far. Clearly we have more
    work to do to make this readable; conjunctive comparison relations like a' < b' < c' would help
    a lot, and because we have not yet presented a theory of comparisons at all, we were not able to
    write means-statements with obvious simplifications, such as 'c < 'b instead of !('b <= 'c).

    The implicit local variable that TrueJ creates is often helpful, but in one case we need to use
    a different ordering of the code than our preferred one to avoid creating two implicit local
    variables.

  * A valid run unit is
    """
    class Triplet {

    int a;
    int b;
    int c;

    void threeSort() {
      if ('a <= 'b) {
        if ('b <= 'c) { // already in order
          a' = 'a;                           // no-ops generated for self assignment
          b' = 'b;
          c' = 'c;
        } else {
          if ('a <= 'c) {
            means 'a <= 'c & !('b <= 'c);    // 'a <= 'c < 'b
            a' = 'a;
            b' = 'c;
            c' = 'b;
          } else {
            means !('a <= 'c) & 'a <= 'b;    // 'c < 'a <= 'b);
            a' = 'c;                         // 'a is saved in an implicit variable here
            c' = 'b;                         // a,c,b assignment here to avoid implicit 'b variable
            b' = 'a;
          }
        }
      } else { // 'b < 'a
        if ('a <= 'c) { // 'b < 'a <= 'c
          means ( !('a <= 'b ) && 'a <= 'c); // 'b < 'a <= 'c);
          a' = 'b;
          b' = 'a;
          c' = 'c;
        } else {
          if ('b <= 'c) {
            means ('b <= 'c && !('a <= 'c)); // 'b <= 'c < 'a
            a' = 'b;
            b' = 'c;
            c' = 'a;
          } else {
            means ( !('b <= 'c) && !('a <= 'b)); // 'c < 'b < 'a);
            a' = 'c;
            b' = 'b;
            c' = 'a;
          }
        }
      }
    }
    // means (a' <= b' && b' <= c');  // requires theory of comparisons

    } // end class
    """

Scenario: An if-then-statement may not define value names

    The then-only version of the if-statement becomes much less useful because value names must be
    defined under all cases. However, a single branch of an if statement may still be used as long
    as no value names are defined. Perhaps writing to a log file would be a good example, but even
    that would not apply if you wanted the accuracy of the log file to be part of the specification.

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
