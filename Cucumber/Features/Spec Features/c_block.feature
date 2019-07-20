Feature: Blocks delimit the scope of variable names

A block is compound statement that organizes a list of statements together into a single unit and provides a syntactic scope for variables and their values. We can write a block by inclosing statements between curly braces. All of an object's procedural code is contained in blocks; for instance, a method's body is a block. Intuitively, the meaning of a block is the conjunction of the meanings of all its top-level statements, but the means-statement can be used to simplify that meaning. In this feature description, we will only use means statements at the end of blocks.

A block may be nested in another block's sequential code or used as part of a complex control statement, such as being one branch of a conditional statement. When a block is nested within another block, the inside block, being a compound statement, is treated as a single statement of the enclosing block. When a block is part of a complex control statement, the meaning of the block is one part of the more complex meaning of the control statement.

The relationship of local variables and blocks is consistent with Java. To review: variables declared in a block may only be used within that block; a separate, non-overlapping, block may use the same name for one of its variables, but it is a separate variable. And the scope of a variable, which is the set of code statements where values of the variable may be defined or used, extends from the variable's declaration to the end of the block where it is declared, and includes any nested blocks. As in Java, TrueJ requires a block's variables to have names that do not shadow those that were already declared in an enclosing scope. This includes method parameter names; however, field names may be shadowed with a new variable name, requiring access to the field to be dot-prefixed with either 'super' or 'this'.

If a field of an object is modified anywhere in a block, the code must define a final value for the field that is part of it the meaning of the block. This is a security feature to prevent the code from making surprise changes to a field. Sometimes a field has no security implications, such as a usage counter or log, and it can be marked with the lenient modifier to avoid the need for including it in the meaning of a block.


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

