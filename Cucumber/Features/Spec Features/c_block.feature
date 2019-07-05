Feature: Blocks delimit the scope of variable names

A block is single statement that organizes a list of statements together into a single unit and provides a syntactic scope for variables and their values. We syntactically express a block by inclosing statements between curly braces. All executable code is contained in either a method's main block or a constructor's main block. We start with an overview of the way that blocks interact with other features of the TrueJ language, but restate the explanations and give examples as part of the scenarios below.

The meaning of a block is the meaning of its last means-statement conjoined with the meaning of any top-level executable statements that follow it, and if there is no means-statement, the meaning is the conjunction of all the top-level statements of the block. That is, a means-statement summarizes everything you need to know about the statements above it and ignores things that are no longer needed.

A block may be nested in another block's sequential code or used as part of a complex control statement, such as being one branch of a conditional statement. When a block is nested within another block, the inside block is treated as a single statement of the enclosing block. When a block is part of a complex control statement, the meaning of the block is one part of the more complex meaning of the control statement.

Local variables interact with blocks because each variable is declared and used within a block. The scope of a variable is the set of code statements where values of the variable may be defined or used and, as in Java, extends from the variable's declaration to the end of the block where it is declared, and includes any nested blocks. That is, TrueJ does not allow nested blocks to declare a new variable using a name that was already declared in an enclosing scope. This includes method parameter names; however, field names may be shadowed with a new variable name, requiring access to the field to be dot-prefixed with either 'super' or 'this'.

To define or use a value of a variable we use a value name, constructing it from the variable's name using a decorator. A value name must be meaningful to be referenced; therefore, a value name cannot be referenced in a statement unless all paths of execution to the statement define the value name, and since a means statement summarizes everything above it that is available below it in a block, an unmentioned value name has no meaning in the part of the block after the means statement. But note that a means statement summarizes the meaning of the block that contains it and not that of any enclosing block.

If a field is modified anywhere in a block, the code must define a final value for the field that is part of it the meaning of the block. This is a security feature to prevent the code from making surprise changes to a field. Fields without security implications, such as usage counters and logs, can be marked to avoid the need for including them in the meaning of a block.


Scenario: The meaning of a block is formed from the meaning of its statements

    If there is no top-level means-statement, then the meaning of a block is the conjunction of the meaning of all of its top level statements. But because a means-statement summarizes what is important to the programmer about all the preceding code of the block, its meaning is substituted for the meaning of all that code, making the meaning of the block be the meaning of its last top-level means-statement conjoined with the meaning of any following top-level statements. Note that the means-statement must be provable from the preceding code, but does not have to be logically equivalent to it.

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

