Feature: The if-statement - end to end test

    This feature specification is for the end to end testing of the features specified in the file
    ab_IfStatement.feature. That file specifies the visible aspects of the if-statement and offers
    more complete explanations of its use. This file shows generated Java code for compilation.


Scenario: Always include definitions of value names in all branches

    Here we show the implementation of the if-statement in the code that is generated for it.

  * a valid run unit is
    """
    class Swapper_2 {

    int a;
    int b;

    void validSwap() {
      if ('a = 'b) {
        a' = 'a;
        b' = 'b; // the compiler often generates a null operation for the assignments
      } else {
        a' = 'b;
        b' = 'a;
      }
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """

  And the Java operational run unit is
    """
    import tlang.runtime.*; @TType class Swapper_2 {

    int a;
    int b;

    void validSwap() { int $T$a = /*'*/a;
      if ($T$a = /*'*/b) {
        a/*'*/ = $T$a;
        /*$T$* b' = 'b; *$T$*/ // the compiler often generates a null operation for the assignments
      } else {
        a/*'*/ = /*'*/b;
        b/*'*/ = $T$a;
      }
    }
    /*$T$* means(a' = 'b && b' = 'a); *$T$*/

    } // end class
    """

  * using feature "***** ba_IfStatementEndToEnd.feature - Include definitions of value names - second test *****"

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
        a'temp2 = 'b; // note the different order of assignment to the variables a and b here
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

    And the Java operational run unit is
    """
    import tlang.runtime.*; @TType class Swapper_3 {

    int a;
    int b;

    void validSwap() { int a$T$temp2; int $T$a = /*'*/a; int a$T$temp1; int b$T$temp2; int b$T$temp1;
      if ($T$a = /*'*/b) {
        a/*'temp1*/ = /*'*/b; a$T$temp1 = a/*'temp1*/;
        a/*'temp2*/ = a$T$temp1; a$T$temp2 = a/*'temp2*/;
        b/*'temp1*/ = $T$a; b$T$temp1 = b/*'temp1*/;
        b/*'temp2*/ = b$T$temp1; b$T$temp2 = b/*'temp2*/;
      } else {
        a/*'temp2*/ = /*'*/b; a$T$temp2 = a/*'temp2*/; // note the different order of assignment to the variables a and b here
        a/*'temp1*/ = a$T$temp2; a$T$temp1 = a/*'temp1*/;
        b/*'temp2*/ = $T$a; b$T$temp2 = b/*'temp2*/;
        b/*'temp1*/ = b$T$temp2; b$T$temp1 = b/*'temp1*/;
      }
      a/*'*/ = a$T$temp2;
      b/*'*/ = b$T$temp2;
    }
    /*$T$* means(a' = 'b && b' = 'a); *$T$*/

    } // end class
    """
