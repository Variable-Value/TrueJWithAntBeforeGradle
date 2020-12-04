Feature: Consideration of the goto statement

The TrueJ language does not have a goto statement; however, it is instructive to consider how it would look if a goto statement had the support of status statements. Would it be easier to use goto statement in a way that programmers could understand? Would it be more difficult to write programs that mislead the programmer's understanding?

Including the goto statement might also allow experimentation that leads to useful new control statements, for instance a search statement. We therefore allow the use the goto statement, checking the syntax and verification conditions, but producing an error instead of generating executable code.

Scenario: A labeled statement must be immediately followed by a means statement

A label is used to syntactically mark all statements that might be the target of one or more goto statements. The code following the label accomplishes some task, with the requirements perhaps stated in a means-statement that follows that code. We would like to be able to understand the code after that label and ensuring that it accomplishes its requirements without understanding all the code that might have led to the label. To simplify the job of understanding the code, we partition our analysis into separate chunks -- we follow the label with a means statement that summarizes everything the following code needs in order to accomplish its task, forming a chunk of code that can be analyzed independently. Then the code before each goto statement that targets that label can be analyzed independently to ensure that it has a meaning that supports the means-statement after the label. The remaining job in our analysis is to make sure that the code will eventually exit, which can be easily automated when all the goto statements jump forward. Jumps that loop back will be discussed later.

  * A valid run unit is
    """

    """
