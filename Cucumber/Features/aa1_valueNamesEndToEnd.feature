Feature: Value names - end to end test (T Language 0.1)

  This feature specification is for the end to end testing of the features
  specified in the file aa_valueNames.feature. That file specifies the visible
  aspects of value names and offers more complete explanations of the
  implementation. This file shows generated Java code for compilation and Prolog
  code that is sent to the prover.


#Background: The theorem prover is loaded into a tuProlog engine
#  Given a Prolog engine
#  And the eTLeanTap theory is loaded
#  And Java debugging
#  And using feature "aa1_valueNamesEndToEnd.feature"


Scenario: Values have names

    Decorators that modify a variable name into a value name are surrounded by
    comments in the generated Java code. Also, non-Java statements like the
    means-statement are embedded in special comments. One principle we follow is
    that the T language code can be reconstructed from the generated Java.

  # The following do not yet test qualified names; when we get to that, we can
  # model the T code for the syntax on the code in
  # javax.lang.model.SourceVersion.isName(CharSequence name)

  When a valid T Language run unit is
    """
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

  * Note
    """
    In the following generated Java code you can see that we avoid inserting or
    deleting lines so that line numbers in Java error messages will match the T
    language line where the error is.
    """

  Then the Java operational run unit is
    """
    import tlang.runtime.*; @TType class Swapper {

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

  ## I am saving the following because of good ideas that are in it. It is partially implemented.
  # ---------------------------------------------------------------------------------------------
  # This will actually be done in TLantlrProofVisitor and KnowledgeBase, not  the Prolog prover
  # -------------------------------------------------------------------------------------------
  #
  # See TImplementationInJava.md for notes on translating T language to Prolog Theorems for proof.
  # The following commands are taken from there.

  # the prolog commands are
  #  new_state(new_emptyState)
  #  assertNew(old_state, <single of constrainer, given, or conjecture>, new_State)
  #    - checks for the consistency of the assertion as it adds it to the state.
  #      The caller will check that the result is consistent.
  #  assertKnown(old_state, <single or array of typing, command, or proven>, new_State)
  #    - currently checks for the consistency of the assertion as it adds it to the state,
  #      but there is no need for that -- T Language code can never be inconsistent with the
  #      previous state
  #  prove(old_state, <single statement to be proven>)
  #    - checks that the negative of the statement is inconsistent, which is equivalent to
  #      checking that the statement has supporting statements from which it can be proven.
  #  checkConsistent(old_state, <single statement to be checked>)

#  And the prolog call to the prover ignoring whitespace is
#    """
#    %% validate class Swapper
#    new_state(S)
#    % sequentially collect static variable types, with final constant initial values
#      % , assertKnown(S,[<types | constants>],Static1) % needed later
#    % sequentially collect static variable default values (even if initialized)
#    %   allowing null default values for even non-null objects
#      % , assertKnown(Static1,[<variable defaults>],<NextState>)
#    % in declaration order, for each static initialization block and static variable initializer
#      % if variable initialzer
#        % , assertKnown(<LatestState>,[<initializers>],<NextState>)
#      % if initialization block
#        % , assertKnown(<LatestState>,[<code>],<NextState>)
#        % , prove(<LatestState>,<FinalMeans>)
#        % , assertKnown(<LatestState>,FinalMeans,<NextState>)
#    % in declaration order, for the initial state of the static object,
#    %   for each static axiom, lemma, theorem, constraint, and non-optional field type
#      % , prove(<LatestState>, Assertion)
#      % , assertKnown(<LatestState>, Assertion, <NextState>)
#    % construct the general state conditions of the static object for inclusion into each static
#    % method's given and to initialize instance creation
#    % (we now think of Static1 as the upcomming LatestState)
#    % for each static axiom, lemma, theorem, constraint, and non-optional field type
#      % , assertNew(<LatestState>,Assertion,StaticGeneral2)
#    % the object constraints to be included into the final means must be built for each method
#    %   in order to use final decoration for fields that are modified by the method, initial
#    %   decoration for unmodified fields, and to omit entirely constraints that use only unmodified
#    %   fields and constants.
#
#    % Then do the same thing with instances, adding constructors
#
#    % sequentially collect instance variable types, with final constant initial values
#      , assert(StaticGeneral2
#              , [ type(int,'this.^a')
#                , type(int,'this.a^')
#                , type(int,'this.^b')
#                , type(int,'this.b^')
#                ]
#              ,Instance1
#              )
#    % sequentially collect instance variable default values (even if initialized)
#      , assert( Instance1
#              , [ 'this.^a' = 0
#                , 'this.^b' = 0
#                ]
#              , Instance2
#              )
#    % in declaration order, for each initialization block and variable initializer
#      % if variable initialzer
#        % , assert(Instance2,[],Instance4)
#      % if initialization block
#        % , assert(Instance2,[],Instance3) % code
#        % , prove(Instance3,FinalMeans)
#        % , assert(Instance3,FinalMeans,Instance4)
#    % for each constructor, start again with the same Instance4 initialization state as a given
#      % assert its code
#        % , assert(Instance4,[],Instance5)
#      % prove its final means
#        % , prove(Instance5,FinalMeans)
#        % , assert(Instance5,FinalMeans,Instance6)
#      % in declaration order, for the initial state of the instance object,
#      % for each instance axiom, lemma, theorem, constraint, and non-optional
#        % , prove(Instance6, Assertion)
#        % , assert(Instance6, Assertion, Instance7)
#    % construct the general state conditions of the instance object
#    % (for inclusion into each method's given) (note return to Instance1)
#    % for each instance axiom, lemma, theorem, constraint, and non-optional
#      % , assert(Instance1,Assertion,StaticGeneral2)
#    % the object constraints to be included into the final means must be built for each method
#    %   in order to use final decoration for fields that are modified by the method, initial
#    %   decoration for unmodified fields, and to omit entirely constraints that have no modified
#    %   fields.
#
#
#    % , collectStatic(S, _staticStateChanges, _staticConstraints
#                     , _staticTypeState)
#        % constraints in _staticConstraints may have names
#    % , assertAll(_staticTypeState, _staticStateChanges, _staticInitialState)
#    % , proveEach(_staticInitialState, _staticConstraints)
#        % need to prove each conjunct of each constraint separately
#    , staticCode(S, [], _staticInitialState)
#        % checks consistency of state and constraints together line by line
#    , assert(_staticTypes, _staticConstraintsOnly, _staticConstraints)
#    , code(_staticConstraints
#      , [ type(int,'this.^a')
#        , type(int,'this.a^')
#        , type(int,'this.^b')
#        , type(int,'this.b^')
#        ]
#      , _thisTypes)
#    , code(_ ????
#    , code(_staticConstraints, [], _thisInitialState
#    % each conjunct separately as noted above for static
#      % , checkConsistent(_thisConstraints,_thisInitialState)
#      % , prove(_thisInitialState,_thisConstraints)
#
#    % Then validate each method (could be done in parallel)
#
#    % begin validation of method swap() at line 5 column 5
#    , code(_this
#      , []
#      % parameter types and assume statement have been asserted
#      % begin validation of block_L5C12
#        , [ type(int,'block_L5C12.startingA^')
#          , 'block_L5C12.startingA^' = 'this.^a'
#          , 'this.a^' = 'this.^b'
#          , 'this.b^' = 'block_L5C12.startingA^'
#          ]
#        , _L9C2)
#        % prove means at line 9 column 2
#        , prove(9,13,   'block_L5C12.startingAn' = 'this.^a' )
#        , assert(_L9C2, 'block_L5C12.startingA^' = 'this.^a' , _L9C24)
#        % next conjunct
#        , prove(9,27,    'this.a^' = 'this.^b' )
#        , assert(_L9C24, 'this.a^' = 'this.^b' , _L9C35)
#        % next conjunct
#        , prove(9,38,    'this.b^' = 'block_L5C12.startingA^' )
#        , assert(_L9C35, 'this.b^' = 'block_L5C12.startingA^' ,_L11C0)
#        % means validated
#        % block_L5C12 validated
#      % method swap validated
#    % validate final means at line 11 column 0
#    , prove(11,6,    'this.a^' = 'this.^b' )
#    , assert(_L11C0, 'this.a^' = 'this.^b' , _L11C14)
#    % conjunct validated
#    , prove(11,17,    'this.b^' = 'this.^a' )
#    % , assert(_L11C14, 'this.b^' = 'this.^a' , _) % not needed for final means
#    % final means validated
#    % class Swapper validated
#
#
#    """


* Note
  """
  Here is a note to the programmer that can be removed later:

  The Prolog sub_atom can be used to deconstruct the information in the name of
  a value if it is needed, for instance, to construct error messages. As an
  example, here is the way to find the variable name from a simple value name
  like a^, ^a, or a^temp.

  atom_name(Val,Var)
   :- sub_atom(Val, Pre, 1, Post, '^')
    , ( Pre = 0 -> sub_atom(Val, 1, Post, 0, Var) % for pre-decorated
                 ; sub_atom(Val, 0, Pre , _, Var) % for mid- or post-decorated
      )
    .

  Similar code can isolate the value name from the contextual information in the
  Prolog name, such as a method name and line and character counts.
  """
# The assert-statements for the final conjuncts in a means-statement are not
# necessary. Some other asserts are not necessary because they occur in previous
# code or asserts. For now, we will leave them in. Later, we will need to define
# a method for use in other methods, but that will probably be handled in Java
# rather than the Prolog.

# The code for a following method would back up to the _this_ state of the
# class. In this example it would start with:
#
#   method_header(_this ...
#
# Local variables in separate blocks may have the same name without confusing
# the prover because the names and their types are stored in a Prolog list that
# is accessed most recent first.

# A block summary is automatically generated for a block that does not have a
# blocklemma statement.

# A method call uses the given-statement and means-statement of the called
# method with variables renamed for the calling context. The called method's
# assumptions are stated in its given-statement, and if it cannot be proven in
# the calling context an error is generated. The called method's side effects
# and any returned result are stated in the methods final means-statement, which
# is then assumed in the calling context for use in any following proofs.



# Note that it is the responsibility of the T compiler to reorder the fields,
# class constraints, and methods to eliminate forward references. Mutual
# recursions must have one involved method that is marked as
#   recursive(<grounded-order-expression>) ( ?? multiple recursions ??)
# and provides a final-means statement; it also provides a block marked as
#   base { ... }
# that is one branch of a conditional statement and does not use any recursion.

#TODO
#  And the test code is
#    """
#    import org.tlanguage.test.*;
#    import org.junit.*;
#    import static org.junit.Assert.*;
#    import static org.hamcrest.CoreMatchers.*;
#    import org.hamcrest.core.CombinableMatcher;
#
#    class SwapperTest {
#
#    int a, b;
#
#    void swap() {
#      int startingA/*'*/ = /*'*/a;
#      a/*'*/ = /*'*/b;
#      b/*'*/ = startingA/*'*/;
#      /* means(startingA = 'a && a' = 'b && b' = startingA'); */
#    }
#    /* means(a' = 'b && b' = 'a); */
#
#    @test
#    public void swapAandB() throws Exception {
#      Swapper 'sw = new Swapper();
#      sw'a.a = 1;
#      sw'ab.b = 2;
#      (sw'ab --> sw').swap();
#      assertEqual("A has been swapped", 2, sw'.a);
#      assertEqual("B has been swapped", 0, sw'.b); // red test
#    }
#
#    } // end class
#    """
#
#  And the test result is OK


Scenario: Values have block scoping

    If a value is reused, then we generate code saving the value at the end of
    the line preceding the line where it is overwritten.

  When a valid T Language run unit is
    """
    class Swapper2 {

    int a, b;

    void swap() {
      a' = 'b;
      b' = 'a;
    }

    } // end class Swapper2
    """

  Then the Java operational run unit is
    """
    import tlang.runtime.*; @TType class Swapper2 {

    int a, b;

    void swap() { int $T$a = /*'*/a;
      a/*'*/ = /*'*/b;
      b/*'*/ = $T$a;
    }

    } // end class Swapper2
    """


Scenario: Intermediate value names use middle decoration

    The whole decorator that is used to transform a variable name into a value name is commented out
    in the generated code.

  When a valid T Language run unit is
    """
    class AllTrue {

    boolean a;
    boolean b;
    boolean c;

    boolean allTrue;

    void checkAll() {
      allTrue'reset = true;
      allTrue'thruA = allTrue'reset && 'a;
      allTrue'thruB = allTrue'thruA && 'b;
      allTrue'      = allTrue'thruB && 'c;
    }
    means(allTrue' = ('a && 'b && 'c)); // equality is stickier than && (higher TrueJ "priority")

    } // end class
    """


  Then the Java operational run unit is
    """
    import tlang.runtime.*; @TType class AllTrue {

    boolean a;
    boolean b;
    boolean c;

    boolean allTrue;

    void checkAll() {
      allTrue/*'reset*/ = true;
      allTrue/*'thruA*/ = allTrue/*'reset*/ && /*'*/a;
      allTrue/*'thruB*/ = allTrue/*'thruA*/ && /*'*/b;
      allTrue/*'*/      = allTrue/*'thruB*/ && /*'*/c;
    }
    /*$T$* means(allTrue' = ('a && 'b && 'c)); *$T$*/ // equality is stickier than && (higher TrueJ "priority")

    } // end class
    """


 Scenario: Value names may only refer to one value

     In order for value names to be consistent across the method, they cannot
     have new values given to them like a variable name.

  When an invalid run unit is
    """
    class AllTrue2 {

    boolean a;
    boolean b;
    boolean c;

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

  # expect error here
  Then an error message contains
    """
    at line 12:2 for <allTrue'temp>: The value allTrue'temp has already been defined on line 11
    """

  And the error messages are
    """
    Context Checking during testing
    Context Check error at line 12:2 for <allTrue'temp>: The value allTrue'temp has already been defined on line 11

    """


Scenario: Assignments with no operational effect are commented out in Java

  If the current value of a variable is assigned to an new value name of the same variable, the assignment is translated to a Java comment. This does not affect the reusability of value names or the use of the value names in logic.

  When a valid T Language run unit is
    """
    class Assignment1 {
    int 'a = 1;
    int 'b = 2;

    void assign() {
      a'temp = 4;
      a'another = a'temp;

      b'temp = 'b;
      b' = a'another;
      a' = b'temp;
    }
    means(a' = 'b & b' = 4);

    }
    """

  Then the Java operational run unit is
    """
    import tlang.runtime.*; @TType class Assignment1 {
    int /*'*/a = 1;
    int /*'*/b = 2;

    void assign() {
      a/*'temp*/ = 4;
      /*$T$* a'another = a'temp; *$T$*/

      /*$T$* b'temp = 'b; *$T$*/ int b$T$temp = b/*'temp*/;
      b/*'*/ = a/*'another*/;
      a/*'*/ = b$T$temp;
    }
    /*$T$* means(a' = 'b & b' = 4); *$T$*/

    }
    """
