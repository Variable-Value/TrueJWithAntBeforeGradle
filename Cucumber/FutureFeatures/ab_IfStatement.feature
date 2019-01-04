Feature: The if statement

  The if-control-structure provides us with the ability to program conditional operations. Later we will cover the switch/case statement, but we postpone that until we have the basics of the T language introduced.


Scenario: The if-statement allows alternative definitions for values

    A value name has only one value for the whole range of its scope, but that value may be selected from different options, depending upon the runtime conditions of the state.

  * A valid T Language run unit is
    """
    class Rates {

    double rate;

    double standardRate' = 0.05;
    double discountRate' = 0.15;

    boolean hasDiscount;

    void setRate() {
      if ('hasDiscount) { rate' = discountRate'; }
                   else { rate' = standardRate'; }
    }
    means( (   'hasDiscount & rate' = discountRate')
         | ( ! 'hasDiscount & rate' = standardRate')
         );

    } // end class
    """


Scenario: Any value set in one branch of an if-statement must be set in both

    For a value name to be available to an operation or logic statement later in its scope, it must be defined along all paths to that statement. For an if-statement, this means that it must be defined in both branches.

  When an invalid run unit is
    """
    class Rates1X {

    double rate;
    double reportRate;

    double standardRate' = 0.05;
    double discountRate' = 0.15;

    boolean hasDiscount;

    void setRate() {
      rate'standard = standardRate';
      if ('hasDiscount)
        { rate' = discountRate'; } // error here
          // rate' is not defined when 'hasDiscount = false
      reportRate' = rate';
    }
    means( (   'hasDiscount & reportRate' = discountRate')
         | ( ! 'hasDiscount & reportRate' = standardRate')
         );

    } // end class
    """

    Then an error message says
    """
    value name rate' is not defined for the else-branch of the if statement
    """


  Scenario: An if-statement with a single branch

    A single branch of an if statement may be used if only contains assignments to Java variables that are not referred to until the final means statement, where a post-decorated value name is used to refer to the implicit value name that the T language constructs for the value of the variable.
