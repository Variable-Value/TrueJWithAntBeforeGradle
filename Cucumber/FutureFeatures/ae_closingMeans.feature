Feature: A closing means statement defines the preceding executable code

  A closing means statement may be used immediately following the definition or declaration of a method, constructor, or initializer. It may be thought of as either summarizing what was accomplished in its preceding executable or as providing a specification for it. If no closing means is given in the code, the system generates one for the use of other subsystems, such as the prover.


Scenario: A closing means statement summarizes a method

  A closing means may only include free valueNames that were defined in the code
  preceding it, up thru the last means statement. (A later feature will discuss how new allowed names may be defined/bound within an expression by using quantifiers such as forall and forsome.) Also, a closing means may not introduce any new facts.

  # TODO make this example illustrate the scenario

Scenario: A closing means statement specifies the preceding code

  The preceding code may include details that are ignored by the closing means statement. However, each non-local variable or field that is modified must be mentioned in the closing means.

  # TODO make this example illustrate the scenario

Scenario: A process's following meaning uses initial and final values

    A process definition or declaration, that is, a method, constructor, or initializer, may have its effect stated in a closing 'means' statement that resides immediately following and outside the scope of the process. This closing means statement must convey the changes caused to the fields of the enclosing object by using initial and final values for relevant fields. In addition, a closing means statement must include the final value of every modified variable. If this meaning statement is not provided by the programmer, then the compiler generates it for its internal use. For security purposes, the compiler publishes any such generated statement for each publicly accessible method.

    # TODO make this example illustrate the scenario
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

    Then an error message contains "Variable startingA already has its final value"
    And  an error message contains "Variable b already has its final value"

  Scenario: A process must define a final value name for every changed value

    The effect of the above restrictions on a closing means statement is that every process must ensure that the last value assigned to each changed variable has a final, i.e., post-decorated, value name; otherwise, it could not be included in the closing means statement of the process, whether the closing means is given in the code or generated internally by the compiler.

    # TODO modify the above example by removing an invalid closing means to show
    #      that the new example is still invalid