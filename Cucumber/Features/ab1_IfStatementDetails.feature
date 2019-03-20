Feature: If Statement Details


Scenario: The if statement with empty branches

  * A valid T Language run unit is
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
    means ('a = 'b);

    } // end class
    """
  Then an error message contains "The code does not support the proof of the statement: 'a = 'b"

Scenario: The if statement with nested empty branches

  * A valid T Language run unit is
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
    means ('a != 'b);

    } // end class
    """
  Then an error message contains "The code does not support the proof of the statement: 'a != 'b"

Scenario: The if statement with one variable

  * A valid T Language run unit is
    """
    class Rates1 {

    double rate;

    boolean hasDiscount;

    void setRate() {
      if ('hasDiscount) rate' = .10;
                   else rate' = .20;
    // a natural logic for if-then-else statements
    means (   'hasDiscount ==> rate' = .10
          & ! 'hasDiscount ==> rate' = .20
          );
    }
    // an equivalent logic
    means ( (   'hasDiscount & rate' = .10)
          | ( ! 'hasDiscount & rate' = .20)
          );

    } // end class
    """

Scenario: Two-deep if-statement

  * A valid T Language run unit is
    """
    class TwoDeepIfNull {
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

  * A valid T Language run unit is
    """
    class TwoDeepIfNull {
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

  * A valid T Language run unit is
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

  The scope of the initial branch disappears, so those value names cannot be referenced from a
  following scope. The original enclosing scope state is the state that the following branch starts
  with.

# a valid reference to an enclosing scope value name
  * A valid T Language run unit is
  """
    class NestedEmptyBranches1 {
      int a;

    void emptyBranches() {
      a'temp = 'a + 1;
      if (true)
        a'next = 1;
      else
        a'next = a'temp + 2;
      a' = a'next -1;
    }
    means (true);

    } // end class
  """

# an error when the following scope refers to an initial scope value name
  When an invalid run unit is
  """
  class MultipleEmptyBranches2 {

  int a, b;

  void emptyBranches() {
    if (true) {
      a'temp = 'b;
      a' = a'temp + 2;
    }
    else {
      a' = a'temp + 1;
    }
  }

  } // end class
  """
  Then an error message contains "The value name a'temp was not defined"


#  @Ignore -------------------

# Scenario: Different orders of execution for reused value names
#
#    All branches of a conditional statement must be considered when looking for reuse. It's possible
#    for a value name to require reuse in one branch but not the other.

# END @Ignore --------------------


#Scenario: End of if-statement details
#
#  * using feature "End of ab1_ifStatementDetails"