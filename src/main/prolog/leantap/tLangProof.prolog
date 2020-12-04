%%% tLangProof.prolog
%%% Predicates for proving the correctness of T language programs
%%% Requires mydebug.pl, nnf.pl, and etleantap.pl in order to run

%%% the prolog commands defined here are
%%%  newState(limit, <new_emptyState>)
%%%    - creates a new beginning state and retracts any prolog assertions
%%%  assertNew(limit,old_state, <single of constrainer, given, or conjecture>, new_State, Result)
%%%    - checks for the consistency of the assertion as it adds it to the state.
%%%      The caller will check that the result is consistent.
%%%  assertKnown(limit,old_state, [<typings, commands, and provens>], new_State, Result)
%%%    - currently checks for the consistency of the assertion as it adds it to the state,
%%%      but there is no need for that -- we only use this for proven statements or for T Language %%%      type statements and code and the compiler checks are sufficient to ensure that these
%%%      statements are consistent with the previous state.
%%%    TODO: determine if the input limit could be set to 0 or 1 for this predicate. That is,
%%%      is every conjunct already correctly asserted to state when the limit is reached, or do we
%%%      wait until it is proven consistent to do that?
%%%  prove(old_state, <single statement to be proven>, Result)
%%%    - checks that the negative of the statement is inconsistent, which is equivalent to
%%%      checking that the statement has supporting statements from which it can be proven.
%%%  checkConsistent(old_state, <single statement to be checked>, Result)

%%% The current strategy is to apply NNF to each formula. If the formula is free of disjuncts, we
%%% check it for consistency and save the state. Otherwise we keep it in a separate list of disjuncts
%%% and the new state is the same as the old state. Any time that we are checking for consistency, we
%%% check the conjuncts first, save the state, then check that state with the disjuncts.

%%% The common prolog argument modes (before evaluation of the predicate):
%%%  + argument must be instantiated input, that is, not a variable that does not yet have a value
%%%  - argument must be a variable that will receive output
%%%  ? argument may be a variable for output, or instantiated (normally for checking the value)
%%%  @ argument will not be changed by evaluation (use + if always completely instantiated)
%%%  (blank) argument is expected to be an ungrounded compound term

%% newState(+Limit:Integer, -InitializedState)
%%   Creates new beginning state variables and also resets the prolog execution state by asserting
%%   prolog facts at beginning values.
%% parameters:
%%   +Limit - Integer value between zero and 99
%%   -State - set to the list of the state variables, which are each initialized to an empty list
%%     [ UnexpandedFormulas, ConsistentLiterals, FreeVariables, GuardedExpressions ]
%%
%% Side-effects:
%%   limit(Limit) - number of times that the GuardedExpressions can be expanded
%%   reached_limit is retracted - to show that the Limit has not yet been reached for
%%       the current conjunct
%%   with_limit is retracted - to show that the Limit has not yet been reached for any
%%       conjunct. When set, an apparently consistent result cannot be trusted because
%%       the Limit was reached at least once and one conjunct has not been fully
%%       explored for inconsistency
%%   maxLimit(Limit) - number of times that we can backtrack after reaching the limit
%%       in order to look for inconsistency in another conjunct. We currently use the
%%       same Limit for both limit\1 and maxLimit\1
%%
newState(Limit, InitializedState)
 :- limitOK(Limit)
  , initializeLimitState(Limit)
  , initializeStateFacts
  , collectState(InitializedState)
  .

limitOK(Limit)
 :- ( integer(Limit) , 0 =< Limit , Limit < 100 ) -> true
  ; concat(['ERROR: Limit = ', Limit, ', but must be from 0 through 99'], Message)
    , !
    , print(Message)
    , fail
  .

concat(AtomList,Concatenated)
 :- concatHelp('',AtomList,Concatenated)
  .

concatHelp(SoFar,[]                     ,SoFar       ).
concatHelp(SoFar,[FirstAtom | RestOfAtoms],Concatenated)
 :- ( number(FirstAtom) -> number_chars(FirstAtom,NumberChars)
                         , atom_chars(Atom1,NumberChars)
                         , atom_concat(SoFar,Atom1,SoFarTemp)
    ; atom_concat(SoFar,FirstAtom,SoFarTemp)
    )
  , concatHelp(SoFarTemp,RestOfAtoms,Concatenated)
  .

initializeLimitState(Limit)
 :- retractall(with_limit)
  , retractall(reached_limit)
  , setFact(maxLimit,Limit)
  , setFact(limit,Limit)
  .

initializeStateFacts
 :- setFact(unexpandedFormulas,[])
  , setFact(consistentLiterals,[])
  , setFact(freeVariables     ,[])
  , setFact(guardedExpressions,[])
  .

setState(UnexpandedFormulas, ConsistentLiterals, FreeVariables, GuardedExpressions)
 :- setFact(unexpandedFormulas,UnexpandedFormulas)
  , setFact(consistentLiterals,ConsistentLiterals)
  , setFact(freeVariables     ,FreeVariables     )
  , setFact(guardedExpressions,GuardedExpressions)
  .


% setFact(FactName,Value)
%  :- retractall( FactName(  _  ))
%   , assert(     FactName(Value))
%   .

setFact(FactName,Value)
 :- callBuiltPredicate(retractall,FactName,_    )
  , callBuiltPredicate(assert    ,FactName,Value)
  .

callBuiltPredicate(Functor,FactName,Value)
 :- Fact =.. [FactName, Value]
  , Predicate =.. [Functor, Fact]
  , call(Predicate)
  .

%% assertNew(+OldState, +Formula, -NewState, -Result)
%%   Adds a new formula to the assumptions of the proof after checking it for consistency with the
%%   existing assumptions. The Formula might be an axiom, lemma, constraint, given
%%   statement, or conjecture. If a limit is reached, the state is updated to include the new
%%   formula to allow further proofs to proceed. Succeeds even if inconsistent, but in that
%%   case the state continues to be the same, NewState = OldState, making the assumption that the
%%   latest formula is the one in error.
%% TODO: Ensure that, when one disjunct is found consistent, the state of any other state lists is
%%   preserved and the disjunction is added to the end of the previous unexpanded list.
%% TODO: Check whether, when a formula reaches the exploration limit, that we can ensure all
%%   conjuncts are expanded.
%% TODO: Check whether, when the formula is found to be inconsistent, any unexpanded conjuncts can be
%%   expanded and then the state can be preserved with all failing literals added to
%%   the ConsistentLiterals list.
%% Parameters:
%%   Formula - a first-order predicate calculus expression to be added to the assumptions
%%   OldState and NewState - each is an array containing the state lists
%%     [ UnexpandedFormulas, ConsistentLiterals, FreeVariables, GuardedExpressions ]
%%   Result - an atom: inconsistent, reached_limit, or consistent
%%     The reached_limit result indicates that the Formula is consistent as far as tested,
%%     but it may inconsistent.
%%
assertNew(Limit, OldState, Formula, NewState, Result)
 :- [UnexpandedFormulas, ConsistentLiterals, FreeVariables, GuardedExpressions] = OldState
  , ( inconsistent( Formula
                  , UnexpandedFormulas, ConsistentLiterals, FreeVariables, GuardedExpressions
                  , Limit
                  )
     -> ( Result = inconsistent
        , NewState = OldState
        )
    ; with_limit
     -> ( Result = reached_limit
        , collectState(NewState)
        )
    ; % else
      ( Result = consistent
      , collectState(NewState)
      )
    )
  .

collectState(CurrentState)
 :- unexpandedFormulas(F), consistentLiterals(L), freeVariables(F), guardedExpressions(G)
  , CurrentState = [F,L,F,G]
  .

assertKnown(Limit, OldState, Formulas, NewState, Result)
 :- assertKnown(Formulas, consistent, Limit, OldState, NewState, Result)
  .

assertKnown([]                     , LatestResult    , _    , OldState, OldState, LatestResult).

assertKnown([Formula1|MoreFormulas], WorstResultSoFar, Limit, OldState, NewState, Result)
 :- assertNew(Limit, OldState, Formula1, TransitionState, ResultTemp1)
  , updateWorstSoFar(ResultTemp1,WorstResultSoFar,ResultTemp2)
  , assertKnown(MoreFormulas, ResultTemp2, Limit, TransitionState, NewState, Result)
  .

updateWorstSoFar(ResultA,ResultB,Worst)
 :- ResultA = consistent    -> Worst = ResultB
  ; ResultA = inconsistent  -> Worst = inconsistent
  % else      reached_limit
  ; (ResultB = inconsistent -> Worst = inconsistent
                             ; Worst = reached_limit
    )
  .
