Feature: Blocks delimit the scope of variable names

A block is compound statement that organizes a list of statements together into a single unit and provides a syntactic scope for variables and their values. We can write a block by inclosing statements between curly braces. All of an object's procedural code is contained in blocks; for instance, a method's body is a block.

Scenario: The meaning of a block is formed from the meaning of its statements

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

Scenario: The means statement summarizes the meaning of the block's preceding statements

   The means statement is used to clarify, summarize, or focus the meaning of all the preceding statements of the block, perhaps discarding some of the temporary values and stepping-stone statements that were used to establish a value. The statements that are summarized from the block have a meaning that must logically entail the means statement for the compiler to accept it. Thus, a programmer reading the block of code can use the means statement to understand the intent of the preceding statements. Also, in order to understand the overall meaning of a block, the programmer can start reading at the bottommost means statement, so it is good practice to have a final means statement at the end of every nontrivial block.

   The examples in this feature description will only use means statements at the end of a block or method. In the following example, we use a means statement inside the block to summarize the three statements preceding it.

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

Scenario: Blocks may be nested

  A block may be nested in another block's sequential code or used as part of a complex control statement, such as being one branch of a conditional statement. When a block is nested within another block, the inside block is treated as a single compound statement of the enclosing block with its own meaning that can be given in a single statement. When a block is part of a complex control statement, the meaning of the block plays one part of the more complex meaning of the control statement. We will treat the conditional and iterative statements that may contain blocks in a separate feature descriptions.

The relationship of local variables and blocks is consistent with Java. To review: variables declared in a block may only be used within that block; a separate, non-overlapping, block may use the same name for one of its variables, but it is a separate variable. And the scope of a variable, which is the set of code statements where values of the variable may be defined or used, extends from the variable's declaration to the end of the block where it is declared, and includes any nested blocks. As in Java, TrueJ requires a block's variables to have names that do not shadow those that were already declared in an enclosing scope. This includes method parameter names; however, field names may be shadowed with a new variable name, requiring access to the field to be dot-prefixed with either 'super' or 'this'.






#  * using feature "***** c_block.feature - The meaning of a block - first test *****"

  When an invalid run unit is
    """
    class BlockMeaning1 {

    int aa, b;

    void swap() {
      int startingA' = 'aa;
      int startingB' = 'b;
      b' = startingA';
      means(b' = 'aa);

      aa' = startingB';
      means(aa' = 'b); // ignores the (b' = 'aa) of the previous means
    }
    means(aa' = 'b && b' = 'aa);

    } // end class
    """
  Then an error message contains
    """
    The code does not support the proof of the statement: b' = 'aa
    """



Scenario: Code from enclosing blocks is still available for proofs in a nested block after a means-statement

