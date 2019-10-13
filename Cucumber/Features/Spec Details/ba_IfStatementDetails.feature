Feature: If Statement Details


Scenario: The if statement with empty branches

  Empty branches do not accomplish anything, of course. And apparently, the meaning of a program that accomplishes nothing is "true". This makes sense if you think of computational work as shaving off more and more things that you don't want until you have what you do want, that is restricting the possibilities more and more until you have the one you desire.

  * A valid run unit is
    """
    class EmptyBranches1 {

    void emptyBranches() {
      if (true) ;
      else ;
    }
    means (true);

    } // end class
    """

  When an invalid run unit is
    """
    class EmptyBranches2 {

    int a, b;

    void emptyBranches() {
      if (true) ;
      else ;
    }
    means 'a = 'b;

    } // end class
    """
  Then an error message contains "The code does not support the proof of the statement: 'a = 'b"

Scenario: The if statement with nested empty branches

  * A valid run unit is
    """
    class NestedEmptyBranches1 {

    void emptyBranches() {
      if (true)
        if (false) ;
        else ;
      else if (true) ;
      else ;
    }
    means (true);

    } // end class
    """

  When an invalid run unit is
    """
    class MultipleEmptyBranches2 {

    int a, b;

    void emptyBranches() {
      if (true)
        if (false) ;
        else ;
      else if (true) ;
      else ;
    }
    means 'a != 'b;

    } // end class
    """
  Then an error message contains "The code does not support the proof of the statement: 'a != 'b"

Scenario: The if statement with one variable

  * A valid run unit is
    """
    class Rates1 {

    double rate;

    boolean hasDiscount;

    void setRate() {
      if ('hasDiscount) rate' = .10;
                   else rate' = .20;
    // a natural logic for if-then-else statements
    means ( (   'hasDiscount ==> rate' = .10 )
          & ( ! 'hasDiscount ==> rate' = .20 )
          );
    }
    // an equivalent logic
    means ( (   'hasDiscount & rate' = .10)
          | ( ! 'hasDiscount & rate' = .20)
          );

    } // end class
    """

Scenario: Two-deep if-statement

  * A valid run unit is
    """
    class TwoDeepIfNull_1 {
      Object a;

      void testTwoDeepNull() {
        if (true) {
          if (true) {
            a' = null;
          } else {
            a' = null;
          }
        } else {
            a' = null;
        }
      }
      means (a' = null);

    }
    """

  * A valid run unit is
    """
    class TwoDeepIfNull_2 {
      Object a;

      void testTwoDeepNull() {
        if (true) {
          if (true) {
            a' = null;
          } else {
            a' = null;
          }
        } else {
          if (true) {
            a' = null;
          } else {
            a' = null;
          }
        }
      }
      means (a' = null);
    }
    """

Scenario: Three-deep if-statement

  * A valid run unit is
    """
    class ThreeDeepIfNull {
      Object a;

      void testTwoDeepNull() {
        if (true) {
          if (true) {
            if (true) {
              a' = null;
            } else {
              a' = null;
            }
          } else {
            if (true) {
              a' = null;
            } else {
              a' = null;
            }
          }
        } else {
          if (true) {
            if (true) {
              a' = null;
            } else {
              a' = null;
            }
          } else {
            if (true) {
              a' = null;
            } else {
              a' = null;
            }
          }
        }
      }
      means (a' = null);

    }
    """

Scenario: A reference to a value name from a following branch is to the enclosing scope

  The branches of a conditional statement are completely independent because they are paths that are
  executed under different conditions, and therefore the code in one cannot influence the code in
  another. Thus, value names that are declared in the initial branch cannot be referenced from a
  following branch's scope. Instead, the following branch scope starts over with the original scope
  that included the conditional statement and builds from there, just as the initial branch scope
  did.

  # an error when the following branch refers to an initial branch value name
  When an invalid run unit is
  """
  class UndefinedValueNameOnBranch {

  int a, b;

  /** The conditional statement's following branch attemps to use a value name, a'temp, that was
   * defined in the initial branch */
  void emptyBranches() {
    if (true) {
      a'temp = 'b;
      a' = a'temp + 2;
    }
    else {
      a' = a'temp + 1; // a'temp was defined on the initial branch, but not on this one
    }
  }

  } // end class
  """
  Then an error message contains "The value name a'temp was not defined"

Scenario: Defining a value name on all branches of a conditional

  If a value name is defined on all branches of a conditional, then it can be referenced in the
  code following the conditional.

  * A valid run unit is
  """
    class valueNameOnAllPaths {
      int a;

    /** Using a valid reference to an value name that was defined on all branches */
    void emptyBranches() {
      a'temp = 'a + 1;
      if (true)
        a'next = 1;
      else
        a'next = a'temp + 2;
      a' = a'next -1; // a'next is defined on both branches
    }
    means (true);

    } // end class
  """

Scenario: The condition is available inside the branches of an if-statement

  We make various condition checks and make sure that we have access to them with means statements.

  * A valid run unit is
  """
  class ConditionAvailablity {
    int a, b, c;

  void checkBranchConditions() {
    if ('a <= 'b ) {
      if ('b <= 'c) {
        means( 'a <= 'b & 'b <= 'c);
        a' = 'a;
      } else {
        if ('a <= 'c) {
          means ('a <= 'b && 'a <= 'c && ! ('b <= 'c));
          a' = 'a;
        } else {
          a' = 'a;
        }
      }
    } else {
      a' = 'a;
    }
  }
  means (a' = 'a);

  }
  """


#Scenario: End of if-statement details
#
#  * using feature "End of ab1_ifStatementDetails"