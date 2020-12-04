Feature: A final, post-decorated, value name has special significance

    We might speak informally of a variable's "final value in a method" and specify the action of the method by stating how the "final values are produced from initial values". In order to capture this kind of information in programming code, we need to actually represent the "final value" with a final, post-decorated, name.

Scenario: Final values may not be overwritten

    A new value may not be written to a variable that contains a final (post-decorated) value.

  When an invalid run unit is
    """
    class Swapper {

    int 'a = 1, b' = 2;

    void swap() {
      int startingA' = 0;
      startingA'beginA = 'a; // ERROR: attempts to overwrite startingA'
      a' = b';
      b' = startingA'beginA; // ERROR: attempts to overwrite b'
      means(startingA'beginA = 'a && a' = b' && b' = startingA'beginA);
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """

  Then an error message contains "startingA already has its final value"
  And  an error message contains "Variable b already has its final value"


Scenario: Changed fields require a final value name

    Every method, constructor, or initializer that modifies a field of an object must end with the last value of that field having a final, post-decorated, value name. Sometimes this even requires a trivial statement like

      x' = x'intermediate;

    that we expect the compiler to optimize away. Besides neatly rounding off the process definition in a consistent and sensible way, the final value name is required for use by closing means statements as documented in d_meansStatement.feature.

  When an invalid run unit is
    """
    class Swapper {

    int 'a = 1, b' = 2;

    void swap() {
      a'temp = 'b;
      b' = 'a;
    }

    } // end class
    """

  Then an error message contains
    """
    final value of variable a must be a' instead of a'temp
    """

