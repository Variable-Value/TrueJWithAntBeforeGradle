Feature: Execution Status Statements

There are several TrueJ statements that summarize the state that will be created by the code as it executes. These are the given statement, the means statement, the lemma, and the conjecture statement.

In addition, we will cover elsewhere several similar statements that are used outside of executable code to describe the invariants that constrain the state of an object.

Scenario: A block forgets operations from before a means statement

    To ensure that the programmer can rely on the means statement to understand previous code, the compiler forgets all of the block's operations from above the means. The compiler translates all its operational code for execution, of course, but after a means statement it only allows status statements to use the facts extablished by the means statement.

    There are more issues with means statements that we will discuss along with the other TrueJ status statements. But here is an example that shows an error caused by an attempt to refer back to a forgotten fact.

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

Scenario: The compiler remembers facts from surrounding blocks after a means statement

Scenario: The compiler remembers types after a means statement

Scenario:

  If a field of an object is modified anywhere in a block, the code must define a final value for the field that is part of the meaning of the block. This is a security feature to prevent the code from hiding changes to a field. Sometimes a field has no security implications, such as a usage counter or log, and it can be marked with the lenient modifier to avoid the need for including it in the meaning of a block.

  When an invalid run unit is **** CODE NOT CHANGED YET ****
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

  * a valid run unit is     **** CODE NOT CHANGED YET ****
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

