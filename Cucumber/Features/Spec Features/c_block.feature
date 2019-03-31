Feature: Blocks contain the scope of variable names and value names

  We syntactically express a block by inclosing statements between an opening and a closing curly brace. All executable code is contained in either a method's main block or a constructor's main block. We start with an overview of the way that blocks interact with other features of the TrueJ language, but restate the explanations and give examples as part of the scenarios given below.

  The meaning of a block is the conjunction of the meanings of its top-level code statements. But we have the caveat that a means-statement summarizes all the statements above it. So a more exact description of the meaning of a block is that it is the meaning of the last top-level means-statement conjoined with the following top-level statements of the block.

  Additionally, a block may be nested in another block's sequential code or used as part of a complex control statement, such as being one branch of a conditional statement. When a block is nested within another block, the inside block is treated as a single statement of the enclosing block. The meaning of the nested block then becomes the meaning of a single statement within its containing block that is conjoined with the meanings of the other statements to form the meaning of the enclosing block. When a block is part of a complex control statement, then the flow of control does not always pass through the block, and this leads to a more complex meaning for the control statement, using the meaning of the block as a part of it.

  Local variables interact with blocks because each variable is declared and used within a block. The scope of a variable is the set of code statements where values of the variable may be defined or used and, as in Java, extends from the variable's declaration to the end of the block where it is declared, and includes any nested blocks. That is, Like Java and unlike C, TrueJ does not allow nested blocks to declare a new variable using a name that was already declared in an enclosing scope. This includes method parameter names; however, field names may be shadowed with a new variable name, requiring access to the field to be dot-prefixed with either 'super' or 'this'.

  To define or use a value of a variable we use a value name, constructing it from the variable's name by adding a decorator. Of course, that value name is meaningless outside the scope of the variable. Note that nested blocks do not interfere with the variable's scope and value names defined in a nested scope may be used after it ends as long as it is still in the variable's scope.

  A value name cannot be referenced unless all flows of execution define the value name.

  A value name cannot be referenced after a means-statement that does not reference the value.

  Because every method must end with a final value for any field that was modified anywhere in the method, field value names are usually referenced in a following means statement as part of the flow of constructing the final value of the field.


Scenario: The meaning of a block if formed from the meaning of its statements

    If there is no top-level means-statement, then the meaning of a block is the conjunction of the meaning of all of its top level statements. But because a means-statement summarizes what is important to the programmer about all the preceding code of the block, its meaning is substituted for the meaning of all that code, making the meaning of the block be the meaning of its last top-level means-statement conjoined with the meaning of any following top-level statements. Note that the means-statement must be provable from the preceding code, but does not have to be logically equivalent to it.

  When an invalid run unit is
    """
    class BlockMeaning1 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      int startingB' = 'b;
      b' = startingA';
      means(b' = 'a);


      a' = startingB';
      means(a' = 'b); // ignores the (b' = 'a) of the previous means
    }
    means(a' = 'b && b' = 'a);

    } // end class
    """
  Then an error message contains
    """
    The code does not support the proof of the statement: b' = 'a
    """

Scenario: Code from enclosing blocks is still available for proofs in a nested block after a means-statement

