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


#  @Ignore -------------------

# Scenario: Different orders of execution for reused value names
#
#    All branches of a conditional statement must be considered when looking for reuse. It's possible
#    for a value name to require reuse in one branch but not the other.

# END @Ignore --------------------
