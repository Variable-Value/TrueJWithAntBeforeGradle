Feature: Value names - end to end details test (T Language 0.1)

  This feature specification tests additional cases and options of the features
  as specified in the file aa2_valueNamesEndToEnd.feature. That file tests all
  the major facilities for the feature aa_valueNames. This one contains extra
  tests that clarify more of the details of the way things will and will not
  work.


Scenario: The string of characters $T$ is not allowed in identifiers

    In order to translate the T language to Java, we must have the ability to
    create names and other character sequences that do not duplicate those that
    the programmer writes. Therefore, we forbid a particular string of
    characters, $T$, from ever being used in the T language, freeing us to
    generate names and any other sequences of Java code without worry.

  When an invalid run unit is
    """
    class Swap$T$Error {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """

  Then an error message contains
  """
  error at line 1:6 for <Swap$T$Error>: $T$ is reserved for T language internal use only
  """


  When an invalid run unit is
  """
  class SwapError1 {

  int a, b;

  void swap() {
    int 'starting = 'a;
    starting'$T$ = 'b;
    b' = 'starting;
    starting' = starting'$T$;
    a' = starting';
  }
  means(a' = 'b && b' = 'a);

  } // end class
  """

  Then the error messages are
    """
    Context Checking during testing
    Context Check error at line 7:2 for <starting'$T$>: $T$ is reserved for T language internal use only
    Context Check error at line 9:14 for <starting'$T$>: $T$ is reserved for T language internal use only

    """

  When an invalid run unit is
    """
    class SwapError2 {

    int 'a$T$=0, 'b=1;

    void swap() {
      int startingA' = 'a$T$;
      a$T$' = 'b;
      b' = startingA';
    }
    means(a$T$' = 'b && b' = 'a$T$);

    } // end class
    """
  Then the error messages are
    """
    Context Checking during testing
    Context Check error at line 3:4 for <'a$T$>: $T$ is reserved for T language internal use only
    Context Check error at line 6:19 for <'a$T$>: $T$ is reserved for T language internal use only
    Context Check error at line 7:2 for <a$T$'>: $T$ is reserved for T language internal use only
    Context Check error at line 10:6 for <a$T$'>: $T$ is reserved for T language internal use only
    Context Check error at line 10:25 for <'a$T$>: $T$ is reserved for T language internal use only

    """

# TODO: implement the $T$ prohibition in comments

#Scenario: Back translation of comments requires absence of reserved characters
  #
  #  Generation of executable Java from the T language requires translating all
  #  non-command statements to comments. Although we have not implemented a
  #  back-translator from the generated Java to the T language that would generate
  #  it, we hope that these special comments will allow such a translator to be
  #  built, especially for back-translating Java error messages into T language
  #  error messages. In order to mark parts of a generated comment that need to be
  #  uncommented or not, the character string $T$ is used. To avoid confusing any
  #  attempt at back-translation, that string needs to be prohibited within the
  #  original T language comments.
  #
  #  When an invalid run unit is
  #    """
  #    class SwapError5 {
  #
  #    /* no comment may contain $T$, like this one does */
  #
  #    int a, b;
  #
  #    void swap() {
  #      int startingA' = 'a;
  #      a' = 'b;
  #      b' = startingA';
  #    }
  #    means(a' = 'b && b' = 'a);
  #
  #    } // end class
  #    """
  #
  #  Then an error message contains
  #  """
  #  ???
  #  """


Scenario: A reused intermediate value is saved immediately before reuse

  When a valid T Language run unit is
    """
    class Swapper2 {

    int a, b;

    void swap() {
      b'temp = 'a;
      a'temp = 'b; // reuseing 'b that was overwritten as b'temp
      a' = b'temp;
      b' = a'temp; // reusing a'temp that was overwritten as a'
    }

    } // end class Swapper2
    """

  Then the Java operational run unit is
    """
    import tlang.runtime.*; @TType class Swapper2 {

    int a, b;

    void swap() { int a$T$temp; int $T$b = /*'*/b;
      b/*'temp*/ = /*'*/a;
      a/*'temp*/ = $T$b; a$T$temp = a/*'temp*/; // reuseing 'b that was overwritten as b'temp
      a/*'*/ = b/*'temp*/;
      b/*'*/ = a$T$temp; // reusing a'temp that was overwritten as a'
    }

    } // end class Swapper2
    """


Scenario: A Type name cannot be decorated when it's class is declared

    Declaration of classes and other forms of types must be in the usual Java
    form and not decorated.

    This all gets confusing because in Java, the class name is used for both the
    type that the class declares and the static object that is associated with
    the class. When we refer to the static object of a class, we will need to
    indicate its state with a decoration; one possibility is

      Employee'.salary = 'Employee.salary + 1_000;

    # Should we use final decoration to declare classes with immutable static
    # objects?

  When an invalid run unit is
  """
  class SwapError2' {

  int a, b;

  void swap() {
    int starting' = 'a;
    a' = 'b;
    b' = starting';
  }
  means(a' = 'b && b' = 'a);

  } // end class
  """

  Then an error message contains
    """
    mismatched input 'SwapError2'' expecting UndecoratedIdentifier in rule t_classDeclaration
    """
    #  And the error messages are
    #    """
    #    Test Parse
    #    ...
    #
    #    """


Scenario: Initial and final values of a variable must be correctly decorated

    In order to provide consistency throughout the various places that methods may be declared and
    defined, the initial value of any fields that the method modifies must be pre-decorated and the
    final value must be post-decorated. Even if a method does not have an explicit
    final-means-statement, one might be added later, and that would require using initial and final
    value decorations. Note that an object's fields always have values, so when a new value is
    assigned to them in a method, they will always be middle- or post-decorated.

  When an invalid run unit is
  """
  class SwapError3 {

  int a, b;

  void swap() {
    int startingA' = a'current; // invalid because the initial value of a is 'a
    b' = startingA';
    a' = 'a;
    means(startingA' = 'a && a' = 'b && b' = startingA');
  }
  means(a' = 'b && b' = 'a);

  } // end class

  """

  Then an error message contains
  """
  Value a'current has not been defined
  """

  When an invalid run unit is
  """
  class SwapError3 {

  int a, b;

  void swap() {
    int startingA' = 'a;
    'a = 'b; // cannot change initial value 'a because fields already have a value
    b' = startingA';
    means(startingA' = 'a && a' = 'b && b' = startingA');
  }
  means(a' = 'b && b' = 'a);

  } // end class

  """

  Then an error message contains
  """
  The value 'a has already been defined on line 3
  """

### TODO: reactivate this test
#Scenario: The final value name of all fields must be final-decorated
#
#  To ensure that a method's final meaning can be used in calling programs and consistently compared
#  against requirements imposed in super classes and interfaces, we insist that all field value names
#  be final-decorated at the end of the method. To be more specific, every field must have a
#  final-decorated value name by the termination point of every path through the program unless an
#  Exception is thrown.
#
#  When an invalid run unit is
#  """
#  class SwapError4 {
#
#  int a, b;
#
#  void swap() {
#    int startingA' = 'a;
#    a' = 'b;
#    b'last = startingA';
#    means(startingA' = 'a && a' = 'b && b'last = startingA');
#  }
#  means(a' = 'b && b'last = 'a);
#
#  } // end class
#
#  """
#  ### TODO: RED/GREEN TEST
#    Then an error message contains
#    """
#    The final value of field b must be b'
#  """


Scenario: Value names may only refer to one value within their scope

    Within its scope, we need all uses of a single value-name to refer to a
    single value, so it may not be assigned new values as though it were a
    variable name.

  When an invalid run unit is
    """
    class AllTrue2 { // invalid class

    boolean a, b, c;

    boolean allTrue;

    void checkAll() {
      allTrue'reset = true;
      allTrue'temp  = allTrue'reset && 'a;
      allTrue'temp  = allTrue'temp  && 'b; // error here
      allTrue'      = allTrue'temp  && 'c;
    }
    means(allTrue' = 'a && 'b && 'c);

    } // end class
    """

  Then an error message contains "allTrue'temp has already been defined"


Scenario: Insertion of T runtime import relative to comments

    The tlang.runtime import is inserted before any class JavaDoc, being careful
    to preserve line numbers to help associate Java compile errors with the
    original T Language code. The @TType annotation is inserted after the
    JavaDoc, before and on the same line as the class keyword.

    In a future version we may adjust the character positions and other info in
    the Java compiler's error messages so that they refer exactly to the T
    language code.

  When a valid T Language run unit is
  """
  /**
   * A class to demonstrate value names
   */
  class Swapper {

  int a, b;

  void swap() {
    int startingA' = 'a;
    a' = 'b;
    b' = startingA';
    means(startingA' = 'a && a' = 'b && b' = startingA');
  }
  means(a' = 'b && b' = 'a);

  } // end class
    """

  Then the Java operational run unit is
    """
    import tlang.runtime.*; /**
     * A class to demonstrate value names
     */
    @TType class Swapper {

    int a, b;

    void swap() {
      int startingA/*'*/ = /*'*/a;
      a/*'*/ = /*'*/b;
      b/*'*/ = startingA/*'*/;
      /*$T$* means(startingA' = 'a && a' = 'b && b' = startingA'); *$T$*/
    }
    /*$T$* means(a' = 'b && b' = 'a); *$T$*/

    } // end class
    """


Scenario: Insertion of T runtime import relative to package

  When a valid T Language run unit is
    """
    package ttestclass;
    class Swapper {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
      means(startingA' = 'a && a' = 'b && b' = startingA');
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """

  Then the Java operational run unit is
    """
    package ttestclass; import tlang.runtime.*;
    @TType class Swapper {

    int a, b;

    void swap() {
      int startingA/*'*/ = /*'*/a;
      a/*'*/ = /*'*/b;
      b/*'*/ = startingA/*'*/;
      /*$T$* means(startingA' = 'a && a' = 'b && b' = startingA'); *$T$*/
    }
    /*$T$* means(a' = 'b && b' = 'a); *$T$*/

    } // end class
    """


Scenario: Insertion of T runtime import relative to other imports

  When a valid T Language run unit is
    """
    import tlang.runtime.* /*ORIGINAL*/;
    class Swapper {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
      means(startingA' = 'a && a' = 'b && b' = startingA');
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """

  Then the Java operational run unit is
    """
    import tlang.runtime.*; import tlang.runtime.* /*ORIGINAL*/;
    @TType class Swapper {

    int a, b;

    void swap() {
      int startingA/*'*/ = /*'*/a;
      a/*'*/ = /*'*/b;
      b/*'*/ = startingA/*'*/;
      /*$T$* means(startingA' = 'a && a' = 'b && b' = startingA'); *$T$*/
    }
    /*$T$* means(a' = 'b && b' = 'a); *$T$*/

    } // end class
    """


Scenario: Insertion of T runtime import relative to other imports and package

  When a valid T Language run unit is
    """
    package ttestclass;

    import tlang.runtime.* /*ORIGINAL*/;
    class Swapper {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
      means(startingA' = 'a && a' = 'b && b' = startingA');
    }
    means(a' = 'b && b' = 'a);

    //test swapAandB {
    //  a = 0;
    //  b = 2;
    //  swap();
    //  assertEqual("A has been swapped", 2, a);
    //  assertEqual("B has been swapped", 0, b); // green test
    //}
    //
    //test swapAgain {
    //  a = 1;
    //  b = 2;
    //  swap();
    //  assertEqual("A has been swapped", 2, a);
    //  assertEqual("B has been swapped", 0, b); // red test
    //}

    } // end class
    """

  Then the Java operational run unit is
    """
    package ttestclass;

    import tlang.runtime.*; import tlang.runtime.* /*ORIGINAL*/;
    @TType class Swapper {

    int a, b;

    void swap() {
      int startingA/*'*/ = /*'*/a;
      a/*'*/ = /*'*/b;
      b/*'*/ = startingA/*'*/;
      /*$T$* means(startingA' = 'a && a' = 'b && b' = startingA'); *$T$*/
    }
    /*$T$* means(a' = 'b && b' = 'a); *$T$*/

    //test swapAandB {
    //  a = 0;
    //  b = 2;
    //  swap();
    //  assertEqual("A has been swapped", 2, a);
    //  assertEqual("B has been swapped", 0, b); // green test
    //}
    //
    //test swapAgain {
    //  a = 1;
    //  b = 2;
    //  swap();
    //  assertEqual("A has been swapped", 2, a);
    //  assertEqual("B has been swapped", 0, b); // red test
    //}

    } // end class
    """

  #TODO: import the above Java Swapper class and instantiate it instead of this
  #      class in the @Test run methods
  #      Also, make sure that the compiler specifies class file output locations
  #      for both production and test classes
  #  And the test code is
  #    """
  #    import org.junit.After;
  #    import org.junit.AfterClass;
  #    import org.junit.Before;
  #    import org.junit.BeforeClass;
  #    import org.junit.Test;
  #    import static org.junit.Assert.*;
  #    import static org.hamcrest.CoreMatchers.*;
  #    // import static org.junit.matchers.JUnitMatchers.*;
  #    import static org.junit.experimental.theories.Theories.*;
  #    import org.hamcrest.core.CombinableMatcher;
  #
  #    public class SwapperTest {
  #
  #
  #    int a, b;
  #
  #    void swap() {
  #      int startingA/*'*/ = /*'*/a;
  #      a/*'*/ = /*'*/b;
  #      b/*'*/ = startingA/*'*/;
  #      /*$T$* means(startingA = 'a && a' = 'b && b' = startingA'); *$T$*/
  #    }
  #    /* means(a' = 'b && b' = 'a); */
  #
  #    /*test*/ void swapAandB() throws Exception {
  #      a = 1;
  #      b = 2;
  #      swap();
  #      assertEquals("A has been swapped", 2, a);
  #      assertEquals("B has been swapped", 1, b); // green test
  #    }
  #
  #    @Test
  #    public void $T$test_swapAandB() throws Exception {
  #      (new SwapperTest()).swapAandB();
  #    }
  #
  #    /*test*/ void swapAgain() throws Exception {
  #      a = 1;
  #      b = 2;
  #      swap();
  #      assertEquals("A has been swapped", 2, a);
  #      assertEquals("B has been swapped", 9999, b); // red test
  #    }
  #
  #    @Test
  #    public void $T$test_swapAgain() throws Exception {
  #      (new SwapperTest()).swapAgain();
  #    }
  #
  #    } // end class
  #    """
  #
  #    And the test result is OK

  # The above test code is what would be generated from T code that
  # contains the corresponding tests. Testing will be included in
  # a future version.


Scenario: Comments inside code that is commented out are adjusted

    For comments that will end up nested inside the comments that the compiler
    generates, "(*$T$*" is substituted for "/*" and "*$T$*)" is substituted for
    "*/". This will allow reconstruction of the T language from the generated
    Java by simply doing the reverse any time those odd strings of characters
    are found.

  When a valid T Language run unit is
    """
    class SwapSomeMore {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
      means( startingA' = 'a  // an end of line comment
           & a' = 'b          // does not cause a problem
           & b' = startingA'  // nor does this
           );                 // no problem here, either
    }
    means( a' = /* a comment right in the middle of things */ 'b
         & b' = 'a /* a comment at the end causes no problem */
         ); /* a comment after the means causes no problem */

    } // end class
    """

  Then the Java operational run unit is
    """
    import tlang.runtime.*; @TType class SwapSomeMore {

    int a, b;

    void swap() {
      int startingA/*'*/ = /*'*/a;
      a/*'*/ = /*'*/b;
      b/*'*/ = startingA/*'*/;
      /*$T$* means( startingA' = 'a  // an end of line comment
           & a' = 'b          // does not cause a problem
           & b' = startingA'  // nor does this
           ); *$T$*/                 // no problem here, either
    }
    /*$T$* means( a' = (*$T$* a comment right in the middle of things *$T$*) 'b
         & b' = 'a (*$T$* a comment at the end causes no problem *$T$*)
         ); *$T$*/ /* a comment after the means causes no problem */

    } // end class
    """


Scenario: A single valid literal can be proven

  * A valid T Language run unit is
    """
    class SwapAgain1 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
    }
    means( b' = 'a );

    } // end class
    """


Scenario: The prover detects a single invalid literal

  When an invalid run unit is
    """
    class SwapAgain2 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = a'; // should be = startingA'; so expect an error
    }
    means( b' = 'a );

    } // end class
    """

  Then an error message contains
    """
    The code does not support the proof of the statement: b' = 'a
    """


Scenario: Nested && and || translate to the Prover correctly

    Make sure that the need for parentheses for conjunctions and disjunctions do not cause any
    problems when sending code to the prover. Because the prover is written in Prolog and the
    priorities of the /\ and \/ operators are user defined there, we need to ensure that the
    semantics of the code remains the same. We must either code the provers operator priority for /\
    and \/ carefully or insert extra parentheses before sending code to the prover.

  * A valid T Language run unit is
    """
    class SwapAgain3 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = a'; // should be = startingA'; so expect an error
    }
    means( true || a' = 'b && b' = 'b );
      /* In TrueJ, like Java, this is interpreted as
         ( true || ( a' = 'b && b' = 'b ) ) which is always true

         If the statement is interpreted by the prover as
         ( ( true || a' = 'b ) && b' = 'b ) it will be false
      */

    } // end class
    """
