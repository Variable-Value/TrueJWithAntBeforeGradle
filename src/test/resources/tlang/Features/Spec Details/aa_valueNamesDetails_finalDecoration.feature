Feature: Final value names may be left undecorated (TrueJ 0.1)

  In this feature we experiment with a simpler notation. Currently allowing either a' or a to represent the final value of the variable a in executable code. In an object's field declarations,
      Int a;
  just declares the variable as final with its default value. To initialize the value we must decorate the variable or it will be final:
      Int 'a = 2;
      Int b' = 5;
      Int b = 5; // equivalent to b' = 5

  There is a command-line flag to force use of final decoration for final values. In that case,
      Int a;
  is interpreted as only declaring a variable; the variable does not have a value.


Scenario: Values have names

  * A valid run unit is
    """
    class Swapper {

    int a, b;

    void swap() {
      int startingA = 'a;
      a = 'b;
      b = startingA;
      means startingA = 'a && a = 'b && b = startingA;
    }
    means(a = 'b && b = 'a);

    } // end class
    """

  * Note
    """
    But the identical program gives an error when used with the command-line flag to require final
    decoration.
    """

  Given decorated final value names are required

  Then an invalid run unit is
    """
    class Swapper_error {

    int a, b;

    void swap() {
      int startingA = 'a;
      a = 'b;
      b = startingA;
      means startingA = 'a && a = 'b && b = startingA;
    }
    means(a = 'b && b = 'a);

    } // end class
    """
  And the following are in the error messages
    """
    line 6:6 for <startingA>: Initialized variable declarations must be decorated
    8:6 for <startingA>: A reference to a value must be a value name: startingA must be decorated
    """

Scenario: The scope of a value name ends with the scope of its variable


  * A valid run unit is
    """
    class Swapper2 {

    int a, b;

    void swap() {
      a = 'b;
      b = 'a;   // OK to use value 'a because the variable a is still in scope
    }

    } // end class
    """

  Given decorated final value names are required

  Then an invalid run unit is
    """
    class Swapper2_error {

    int a, b;

    void swap() {
      a = 'b;
      b = 'a;   // OK to use value 'a because the variable a is still in scope
    }

    } // end class
    """
  And the following are in the error messages
    """
    a must be decorated
    b must be decorated
    """

  When an invalid run unit is
    """
    class Swapper3 {

    int a, b;

    void swap() {
      int startingA = 'a;
      a = 'b;
      b = startingA;
    }
    means(startingA = 'a && a = 'b && b = startingA);
       // startingA value is out of scope here, outside the method's block,
       // because its variable startingA is declared inside the block

    } // end class
    """

  Then an error message contains
    """
    Variable startingA has not been defined in this scope
    """

  Given decorated final value names are required
  When an invalid run unit is
    """
    class Swapper3 {

    int a, b;

    void swap() {
      int startingA = 'a;
      a = 'b;
      b = startingA;
    }
    means(startingA = 'a && a = 'b && b = startingA);
       // startingA value is out of scope here, outside the method's block,
       // because its variable startingA is declared inside the block

    } // end class
    """
  Then the following are in the error messages
    """
    <startingA>: Initialized variable declarations must be decorated
    a must be decorated
    8:6 for <startingA>: A reference to a value must be a value name: startingA must be decorated
    b must be decorated
    Variable startingA has not been defined in this scope
    A reference to a value must be a value name: startingA must be decorated
    """

Scenario: A final value defined with one decoration cannot be used with the other

  When an invalid run unit is
    """
    class DecorationErr1 {

    int a, b;

    void swap() {
      int startingA = 'a;
      a = 'b;
      b = startingA';
      means startingA' = 'a && a = 'b && b = startingA';
    }
    means(a' = 'b && b = 'a);

    } // end class
    """
   Then the following are in the error messages
    """
    line 8:6 for <startingA'>: A different final decoration, startingA, was defined at line 6
    line 11:6 for <a'>: A different final decoration, a, was defined at line 7
    """

  When an invalid run unit is
    """
    class DecorationErr2 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA;
      means startingA = 'a && a = 'b && b' = startingA;
    }
    means(a = 'b && b' = 'a);

    } // end class
    """
  Then the following are in the error messages
    """
    line 8:7 for <startingA>: A different final decoration, startingA', was defined at line 6
    line 9:26 for <a>: A different final decoration, a', was defined at line 7
    """

  When an invalid run unit is
    """
    class DecorationErr3 {

    int a, b;
    int startingA = 'a;
    int startingB' = 'b;

    void swap() {
      a = startingB;
      b = startingA';
      means startingA' = 'a && a = startingB && b = startingA';
    }
    means(a = 'b && b = 'a);

    } // end class
    """
   Then the following are in the error messages
    """
    line 8:6 for <startingB>: A different final decoration, startingB', was defined at line 5
    line 9:6 for <startingA'>: A different final decoration, startingA, was defined at line 4
    """

  When An invalid run unit is
    """
    class RedefinitionErr1 {

    int a, b = 3, c' = 4;

    void swap() {
      a' = b;
      a = 2;
      b = 'a;
      c = 1;
      means b = 'a && a = 'b;
    }
    means(a' = 'b && b = 'a);

    } // end class
    """
   Then the following are in the error messages
    """
    line 7:2 for <a>: A different final decoration, a', was defined at line 6
    line 8:2 for <b>: The value b has already been defined on line 3
    line 9:2 for <c>: A different final decoration, c', was defined at line 3
    10:22 for <'b>: Value 'b has not been defined for the variable b that was declared at line 3
    """

    When An invalid run unit is
    """
    class RedefinitionErr2 {

    int a, b;

    void swap() {
      int starting = 'b;
      a = starting;
      starting' = 'a;
      b = starting';
      means starting' = 'a && a = 'b && b = starting;
    }
    means(a = 'b && b = 'a);

    } // end class
    """
    Then the following are in the error messages
    """
    line 8:2 for <starting'>: A different final decoration, starting, was defined at line 6
    """

  When An invalid run unit is
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
        a' = a'temp2;
        b = b'temp2;
      } else {
        a'temp2 = 'b; // note the different order of assignment here to the variables a and b
        a'temp1 = a'temp2;
        b'temp2 = 'a;
        b'temp1 = b'temp2;
        a = a'temp2;
        b' = b'temp2;
      }
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """
    Then the following are in the error messages
    """
    19:4 for <a>: Value name a must also be defined in the initial branch
    20:4 for <b'>: Value name b' must also be defined in the initial branch
    21:2 for <}>: The value name b was not defined in the else-clause
    21:2 for <}>: The value name a' was not defined in the else-clause
    23:6 for <a'>: Value a' has not been defined for the variable a that was declared at line 3
    """

  When An invalid run unit is
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
        a' = a'temp2;
        b = b'temp2;
      } else {
        a'temp2 = 'b; // note the different order of assignment here to the variables a and b
        a'temp1 = a'temp2;
        b'temp2 = 'a;
        b'temp1 = b'temp2;
        a' = a'temp2;
        b = b'temp2;
      }
    }
    means(a = 'b & b' = 'a);

    } // end class
    """
    Then the following are in the error messages
    """
    23:6 for <a>: A different final decoration, a', was defined at line 19
    23:15 for <b'>: A different final decoration, b, was defined at line 20
    """
