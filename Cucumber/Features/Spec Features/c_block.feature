Feature: Blocks delimit the scope of variable names

  A block is compound statement that organizes a list of statements together into a single unit and provides a syntactic scope for variables and their values. We code a block by inclosing a sequence of statements between curly braces. All of an object's procedural code is contained in blocks, either method bodies, constructor bodies, or initializer blocks.

Scenario: The meaning of a block is the conjunction of the meanings of its sequence of statements

  If there is no top-level means-statement, then the meaning of a block is the conjunction of the meaning of all of its top level statements. We illustrate this with a method block that contains no means statements. We can see that the meaning of the method block is the conjunction of the meaning of its statements by comparing it with the means statement for the entire method definition.

  * a valid run unit is
    """
    class BlockMeaning1 {

    int a, b;
    int startingA;

    void swap() {
      startingA' = 'a;
      a' = 'b;
      b' = startingA';
    }
    means(startingA' = 'a & a' = 'b & b' = startingA');

    } // end class
    """

Scenario: The means-statement replaces the meaning of the blocks's preceding statements

  The means-statement is used to summarize, refactor, or reformulate the meaning of all the
  preceding statements of the block, replacing them with the means-statement. The compiler will only
  accept means statements that are logically entailed by the meaning of the statements that it
  summarizes. Thus, a programmer reading the block of code can use the means statement to understand
  the intent of the preceding statements. Also, in order to understand the overall meaning of a
  block, the programmer can start reading at the bottommost means statement, so it is good practice
  to have a final means statement at the end of every nontrivial block.

  Note that the current value of a local variable may be forgotten after a means-statement, but its
  type is still available to allow definition of a new value for it.

  * a valid run unit is
    """
    class BlockMeaning2 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      b' = startingA';
      means(a' = 'b & b' = 'a);
    }

    } // end class
    """

  * a valid run unit is
    """
    class BlockMeaning2a {

    int a, b;

    void swap() {
      int startingA' = 'a;
      int 'startingB = 'b;
      a' = 'startingB;
      means (startingA' = 'a & a' = 'b); // forget 'startingB = 'b & a' = 'startingB
      b' = startingA';
      means (a' = 'b & b' = 'a);
    }

    } // end class
    """

  * a valid run unit is
    """
    class BlockMeaning2a {

    int a, b;

    void swap() {
      int startingA' = 'a;
      int 'startingB = 'b + 'a;
      means (startingA' = 'a); // <==== start reading here
      startingB' = 'b;         // we can create a new value for variable startingB
      a' = startingB';
      b' = startingA';
    }
    means (a' = 'b & b' = 'a);

    } // end class
    """

  When an invalid run unit is
    """
    class BlockMeaning2b {

    int a, b, c;

    void rotateLeft() {
      int startingA' = 'a;
      a' = 'b;
      means a' = 'b;   // forget startingA' = 'a
      b' = 'c;
      c' = startingA'; // error because the value of startingA' is forgotten
      means a' = 'b & b' = 'c & c' = 'a;
    }

    } // end class
    """
  # TODO: Then an error message contains
  # """
  # The value of startingA' is not known at this point
  # """
  Then an error message contains
    """
    The code does not support the proof of the statement: c' = 'a
    """

Scenario: Blocks may be nested

  A block may be nested in another block's sequential code or used as part of a complex control statement, such as being one branch of a conditional statement. When a block is nested within another block, the inside block is treated as a single compound statement of the enclosing block with its own meaning that can be given in a single statement. When a block is part of a complex control statement, the meaning of the block plays one part of the more complex meaning of the control statement. We will treat the conditional and iterative statements that may contain blocks in a separate feature descriptions.

  * a valid run unit is
    """
    class BlockMeaning3 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      { int startingB' = 'b;
        a' = startingB';
        means (a' = 'b);
      }
      b' = startingA';
    }
    means (a' = 'b & b' = 'a);

    } // end class
    """

Scenario: A variable's scope encloses the scopes of all its values

  The relationship of local variables and blocks is consistent with Java. To review: the scope of a variable, which is the set of code statements where values of the variable may be defined or used, extends from the variable's declaration to the end of the block where it is declared, and includes any nested blocks. A block's variables must have names that do not shadow those that were already declared in an enclosing scope. This includes method parameter names; however, field names may be shadowed with a new variable name, requiring access to the field to be dot-prefixed with either 'super' or 'this'. A separate, non-overlapping, block may use the same name for one of its variables, but having the same name does not indicate any relationship between the variables -- they are entirely separate variables.

  Our example shows an attempt to use a value name that is out of scope.

  When an invalid run unit is
    """
    class BlockMeaning4 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      { // Here we will save and set b
        int startingB' = 'b;
        b' = startingA';
        means(b' = 'a);
      }
      a' = startingB'; // Oops, the variable startingB is out of scope
    }
    means(a' = 'b & b' = 'a);

    } // end class
    """
  Then an error message contains
    """
    Variable startingB has not been defined in this scope
    """

