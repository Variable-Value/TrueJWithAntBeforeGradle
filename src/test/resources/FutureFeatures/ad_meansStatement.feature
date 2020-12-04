Feature: A means statement wraps up the meaning of everything preceding it

    A means statement may be used within an executable block of code to summarize all the information that is needed in following statements in order to understand and verify the correctness of the whole block of code. This means that, once a means statement is understood and confirmed, neither a reader nor an automated prover needs to use any facts established before the means to understand the program. This gives the programmer a way of partitioning the work of a program into discrete stages, dividing the work of verifying the program's correctness into chunks, documenting the progress at the end of each stage, dropping details that will not be relevant to following code, and aggregating complexities into meaningful concepts.

    Also, a closing means statement may be used immediately following the definition or declaration of a method, constructor, or initializer. It may be thought of as either summarizing what was accomplished in its preceding executable or as providing a specification for it. This is documented in the closingMeans feature file.


Scenario: A means statement summarizes previous changes to program state

    The means statement holds all the information that we need to know in order to proceed with the code. One way it accomplishes this is to drop references to local variables and intermediate values whose purpose is done, thereby freeing our minds of whatever complicated relationships between them that we had to build in order get to this point in the code, kicking away the ladder once we have climbed out the hole*.

      # TODO: Create the examples to elucidate this scenario.


Scenario: A means statement tracks all changes

    For security purposes, we must ensure that all changes to non-local variables are tracked so that they are not changed accidentally or surreptitiously. Thus, we require that a means statement relate the current values from all changes to other state values.

      # TODO: Create the examples to elucidate this scenario.


Scenario: A means statement drops all previous information

    The requirement that a means-statement track all field changes conflicts somewhat with its ability to simplify the preceding code. But the relationship involving the current value does not need to be an equation that defines all the complications of its definition, it may instead be a newly established relationship or constraint; for a simple arithmetic example, once we have found the square of the height of a doorway, the square of it's width, the sum of those squares, and the square root of the sum, we may forget any of those intermediate values that are not fields and simply refer to the "diagonal" of the doorway while we are trying to decide how large a mirror we can buy for our living room.

    # TODO: Create the examples to elucidate this scenario.


Scenario: Means statements let us recast statements to a higher conceptual level

    An additional opportunity for simplifying the means statement while recording all changes to the state of any variable relies on the fact that any time we modify a field of an object, we are also modifying the object containing the field. As we refocus on higher objects in the object hierarchy, we provide an opportunity to match the computations to their corresponding meaning that motivates them in the real world. We accordingly allow the means-statement to restate a change from the detailed computations on the fields to that of a containing object, looking at the change in terms of the new constraints that have consequently been imposed on the containing object as a whole, thereby raising the conceptual level as we summarize the changes.

    # TODO: Create the examples to elucidate this scenario.


  * Notes
      """
      In Wittgenstein's Tractatus Logico-Philosophicus, he uses the image of disposing of the ladder once you have reached the roof of understanding factual statements, so I am sure he would allow me to dispose of the messy details about data in a computer once I climb up to the object level. Thankfully, you can no longer check that I am right by asking him about it, and besides, he would probably invent a new philosophy to explain how I had misunderstood.
      """
