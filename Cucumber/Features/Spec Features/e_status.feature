Feature: Status Statements for Executable code

  Several TrueJ statements can summarize the state required or created by the code as it executes.
  These are the given-statement, the means-statement, the lemma, and the conjecture. The use of
  status statements to constrain or summarize the state of an object between method executions is
  covered in another feature.

  TODO: Add tests for the lemma.
  TODO: Add tests for the given statement.
  TODO: Add tests for the conjecture.

Scenario: A block forgets operations from before a means statement

    To ensure that the programmer can rely on the means statement to understand previous code, the
    compiler forgets all of the block's operations from above the means. The compiler translates all
    its operational code for execution, of course, but after a means statement it only allows status
    statements to use the facts extablished by the means statement.

    There are more issues with means statements that we will discuss along with the other TrueJ
    status statements. But here is an example that shows an error caused by an attempt to refer back
    to a forgotten fact.

  When an invalid run unit is
    """
    class BlockMeaning3 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      a' = 'b;
      means (a' = 'b);          // Oops, we are now forgetting that startingA' = 'a
      b' = startingA';          // We generate code, but we don't know what that code means
      means(a' = 'b & b' = 'a); // So we can't see that    b'=startingA'  ==>  b'='a
    }

    } // end class
    """
  Then an error message contains
    """
    The code does not support the proof of the statement: b' = 'a
    """

Scenario: The compiler remembers type information for a variable after a means statement

  TODO: Create code to show success and falure because it remembers the type of a variable.

  Because the scope of a variable reaches to the end of the block, new values can be assigned to it
  after a means statement. To ensure that those values have the correct type, the type of the
  variable is remembered after a means statement.

Scenario: The compiler remembers facts from surrounding blocks after a means statement

  * a valid run unit is
    """
    class BlockMeaning5 {

    int a, b;

    void swap() {
      int startingA' = 'a;
      { int startingB' = 'b;
        a' = startingB';
        means (a' = 'b);
        b' = startingA';
        means (a' = 'b & b' = 'a);
      }
    }

    } // end class
    """

Scenario: Object fields that are modified must have a final value for security

  TODO: Code the examples.

  Because the means-statement is expected to summarize the code above it, a security review should
  be possible by looking only at means-statements where they exist. To prevent malicious or
  accidental ommision of modifications of an object, TrueJ requires that a means-statement must
  define the value of any fields that are modified in the code above it. We allow lenient security
  for a field with little security implications, such as a usage counter or log, by marking it with
  the lenient-modifier.
