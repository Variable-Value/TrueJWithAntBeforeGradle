%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%% etleantap.pl - a prover for the first-order typed predicate calculus with
%%%                equality and function expressions
%%%
%%% tested with the tuProlog system.
%%% Copyright (c) 2016: George S Cowan
%%%                     Email: cowan@acm.org
%%% Based on the predicate calculus prover by
%%% Bernhard Beckert & Joachim Posegga, Copyright (C) 1993:
%%%                     Universit"at Karlsruhe
%%%                     Email: {beckert|posegga}@ira.uka.de
%%%
%%% (Types are not yet fully implemented. They will be implemented once
%%% T-language tests require them.)
%%%
%%% Types are considered to be a set of predicates, possibly including
%%% additional type "declarations", which are simply predicates declaring that a
%%% name within the scope of the enclosing type has a particular type.
%%%
%%% Besides adding types and equality, a major change is that etleantap.pl has
%%% three possible outcomes: inconsistent, consistent, and ambiguous. An
%%% ambigious outcome occurs when processing is abandoned because a depth limit
%%% is reached. When this happens in an OR-branch, processing is abandoned since
%%% there is no possibility of proving inconsistency. Proving consistency is
%%% still possible, but we are not so interested in that. When processing is
%%% abandoned in one conjunct of an AND-expression, there is still the
%%% possibility of proving inconsistency in the other branch, so it is explored,
%%% but proving consistency is no longer possible.
%%%
%%% In addition, the previous copy of an ALL-expression is checked to make sure
%%% that it has been used before adding another copy. This greatly reduces
%%% trivial depth expansion.
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%%%%%%%%%% BEGIN OF TOPLEVEL PREDICATES

% -------------------------------------------------------------------
% runProver(+Formula, +TextOfFormula, -Result)
%
% Is the formula consistent or inconsistent? Or did the prover reach
% its limits while trying to find an inconsistency?
%
% The Result will be one of
%   inconsistent  - the prover found an inconsistency
%   consistent    - the prover exhasted all possible ways for there to be an inconsistency
%   limit         - the formula was too complicated for the prover to solve

runProver(Formula, Result)
:- Limit = 7
 , retractall(limit(_))
 , retractall(with_limit) % with_limit marks that a consistent result is
        % actually ambiguous because a depth limit was reached.
 , retractall(reached_limit) % reached_limit prevents further exploration but
        % is retracted at each backtrack to process another conjunct of an AND
 , nonvar(Limit),!, assert(maxLimit(Limit)) % the number of times that we backtrack from Limit
 , assert(limit(Limit)) % for now, var limit, depth, and maxLimit are the same
 , ( inconsistent(Formula,[],[],[],[],Limit) -> Result = inconsistent
   ; with_limit                              -> Result = limit
   ;                                            Result = consistent
   )
 .

% -----------------------------------------------------------------
% inconsistent(+Fml,?VarLim)
%
% Is the formula Fml inconsistent. This can be interpreted as a proof for
% the negation of Fml.
%
% Iterative deepening is used when VarLim is unbound.
% Examples:
%
% | ?- inconsistent((p(a) , -p(f(f(a))) , all(X,(-p(X) ; p(f(X))))), 1).
% ambiguous
% | ?- inconsistent((p(a) , -p(f(f(a))) , all(X,(-p(X) ; p(f(X))))), 2).
% yes
%


%% inconsistent(+Formula, +GuardedExpressionExpansionLimit, +TextOfFormula)
%%
%% Starts the prover. To prove a statement is valid, that is, true for all
%% possible values of its variables, the Formula submitted should
%% be the negation of the statement to be proven. If the Formula is consistent
%% (that is, the proof of the negation of the formula fails), a message is
%% printed.
%%
%% TODO: add a fourth parameter that returns a clear signal as to why the
%%       prover stopped: inconsistent, consistent, or unresolved
%%
%% A branch can refuse to close because there was no action to take; if there
%% are no alternatives to explore, this indicates that the Formula is
%% consistent. The Formula is also consistent if the prover loops forever, but
%% if a branch reaches the maximum number of free variables that are
%% allowed then the prover stops in an ambigious situation: a higher limit
%% could possibly allow the prover to show that the statement is inconsistent
%% (that is negation is provably true).
%%
%% We will need to print a msg such as:
%%
%%    Proof failed for XXX. Either it is
%%    inconsistent with the information provided or its proof depends on
%%    information that has not been given. Consider adding to the
%%    constraints, given-statement, or program statements.
%%
%% Or a msg such as
%%    Proof failed for XXX because the length or time was exceeded. If the
%%    statement is true, you may be able to prove it by adding to the
%%    constraints, given-statement, or program statements. An alternative is
%%    to change the statement to a conjecture.
%
% TODO: allow separate values for ALL-variable limit, depth limit, and
%       continuations limit
% TODO: Try adding a rule to allow "a /\ a=b => b"
%       Check for an equality in lits with either end that matches Lit. If
%       found, run inconsistent(X,...) where X is the other end of the equality
% TODO: add a parameter to return a result of either: inconsistent, consistent,
%       or ambiguous at the specified depth check.
inconsistent(Fml,Limit, FmlTxt)
 :- mydebug(['Beginning ',Fml])
  , retractall(limit(_))
  , retractall(with_limit) % with_limit marks that a consistent result is
         % actually ambiguous because a depth limit was reached.
  , retractall(reached_limit) % reached_limit prevents further exploration but
         % is retracted at each backtrack to process another conjunct of an AND
  , nonvar(Limit),!, assert(maxLimit(Limit)) % the number of times that we backtrack from Limit
  , assert(limit(Limit)) % for now, var limit, depth, and maxLimit are the same
  , ( inconsistent(Fml,[],[],[],[],Limit)
       -> mydebug(['Proven: ',FmlTxt])
        ; ( with_limit
              % At least one of the conjunctives failed because it exceeded the
              % depth limit or the limit of times that the unexpanded-list,
              % UnExp, is allowed to have new material added to it by guarded
              % expressions. Therefore, an inconsistency might have been found
              % on that conjunctive if the depth limit was large enough, and
              % we cannot be positive that the Fml is consistent.
           -> nl, print('Reached Limit '),print(Limit)
              , print(' on formula: '), print(FmlTxt), nl
              , fail
            ; mydebug(['Unprovable: ',FmlTxt])
              , fail %                    print('Proof failed for formula: '), print(FmlTxt), nl, fail
          )
    )
  , mydebug('End ')
  .

% TODO: prove that var(Result) leads to correct iterative deepening or remove
%       the iterative deepinging option
inconsistent(Fml,Result)
 :- iterate(Limit,1,inconsistent(Fml,[],[],[],[],Limit),Result)
  .

iterate(Current,Current,Goal,Current)
 :- nl, write('Limit = '), write(Current),nl
  , Goal
  .

iterate(Limit,Current,Goal,Result)
 :- Current1 is Current + 1
  , iterate(Limit,Current1,Goal,Result)
  .


%% -----------------------------------------------------------------
%% inconsistent(+Fml,+UnExp,+Lits,+FreeV,+Guarded,+DepthLeft)
%%
%% succeeds if there is a closed tableau for Fml with not more than DepthLeft
%% expansions of Unexplored expressions from guarded expressions on each
%% sub-branch. This is implemented as succeeding if any member of the UnExp list
%% is inconsistent with any other member.
%%
%%  Fml: formula in skolemized negation normal form that will be tested for
%%       inconsistency, that is, an attempt will be made to prove that its
%%       negation is true.
%%       syntax:      negation: '-', disj: ';', conj: ','
%%       quantifiers: all(X,<Formula>), where 'X' is a prolog variable that
%%       occurs in <Formula>. This form of the all statement is translated to an
%%       implementation that has three parameters, all(X,<Formula>,LastVar),
%%       with the addition of LastVar. The all-statement is placed back at the
%%       end of the list of unexplored expressions after the <Formula> is copied
%%       with a fresh variable for X that acts as a free variable in the copy.
%%       LastVar is the free variable from the previous copy of the <Formula>.
%%       If LastVar is a variable then that free variable for the previous copy
%%       of the <Formula> has not been matched, and, therefore, there is nothing
%%       to be accomplished by making another copy because the previous copy is
%%       on the literals list and can match anything that the new copy would
%%       match.
%%
%%     The <Formula> may have the following special forms which are processed by
%%     moving the full guarded expression to the guarded list:
%%       guarded(hasType(T,<X>), ExpressionWithX)
%%       guarded(EqMatch, ExpressionWithX) - where EqMatch is either an
%%           equality term that includes the variable <X>, such as <X>=B, or an
%%           inequality term, such as -(<X>=B) a guarded fact.
%%
%%     If the Fml is a literal that is not a guarded expression, and it doesn't
%%     close the branch, then it is matched with a fresh copy of the guards of
%%     the guarded expressions and any resulting newly-bound ExpressionWithX is
%%     placed in the unexamined list before the Fml is added to the literal
%%     list. There is no need to test a new
%%     equality guard against all the previously processed literals because any
%%     previously processed equality literal would have invoked a guarded
%%     statement when it was processed that the current equality would have
%%     matched, ending its processing.
%%
%%     Although the current version uses guarded expressions only for
%%     implementing equality, it should also be sufficient for implementing
%%     types. Type definitions will be asserted as guarded expression rules.
%%     Then every time a variable is defined with a type, a search for a guard
%%     with type(VarName,TypeDefinition) will be performed. If the
%%     TypeDefinition expression contains the definition of an enclosed-type /
%%     inner-class, then that will be placed on the Guarded list. Notice that
%%     this does not allow for deducing that an element has a particular type,
%%     but that is not required for proofs of a Java-like language as all
%%     variables are declared with all the typing that they are allowed to use.
%%
%%     When the nnf.prolog encounters a typed all, all(X,type(X,T),Expression),
%%     it is responsible for translating it to a guarded expression,
%%     guarded(type(X,T),Expression) and asserting it as a new rule.
%%
%%       Perhaps in later versions, a type may declare
%%             guardedOp(Op,MatchExpr)
%%         such as
%%             guardedOp('<',X < Y)
%%         to show the intention to use a guarded expression for that operator
%%         or predicate. This will allow the definition of transitivity,
%%         monotonicity, and substitution rules for other relational operators
%%         without incurring the cost of branching in the tableau. Although it
%%         is not needed for types and equalities, new guarded-Ops may need the
%%         following: if a guard generated from a guard contains an unbound
%%         variable, every expression in the literals list is matched against it
%%         so that order of expansion is not an issue.
%%
%%  UnExp:     list of formula not yet expanded to literal form and tested for
%%             inconsistency. If a literal is consistent with everything so far,
%%             it is added to the Lits list.
%%  Lits:      list of literals on the current branch that so far are mutually
%%             consistent.
%%  FreeV      List of free variables created for All-statements. It is used to
%%             ensure the continuity of all-variables in expanding nested
%%             all-statements. If, in future versions, all-statements are
%%             allowed to contain guarded expression statements, guarded
%%             expression processing will need to also account for free
%%             variables in its copying of guarded expressions.
%%  Guarded:   List of guarded expressions. Guarded expressions are a kind of
%%             one way if-statement, very similar to Prolog Horn clauses.
%%                 guarded(Guard,Expression)
%%             For all guards that are matched by the current literal, the
%%             corresponding Expressions are placed on Unexp, the list of
%%             unexplored expressions. The exception is that Expressions which
%%             are  themselves guarded expressions are immediately placed on
%%             this guarded expression list. Also, some guarded expressions are
%%             written as Prolog facts: the guarded expressions for three basic
%%             rules of the transitivity of equality are hard coded prolog
%%             facts, and type definitions are asserted as Prolog facts.
%%  DepthLeft: Number of remaining times that the search is allowed to place
%%             guarded expressions on the Unexp list. It is NOT a count of the
%%             number of guarded expressions that are placed on the Unexp list.
%%             This will prevent the search from cycling through guarded
%%             expressions that then match additional guarded expressions.
%%  UnExp:     list of formulas to be expanded to literal form and tested for
%%             inconsistency. If a literal is consistent with everything so far,
%%             it is added to the Lits list. Universally quantified statements are
%%             recycled to the end of this list for further instantiation
%%  Lits:      list of literals on the current branch that so far are mutually
%%             consistent.
%%  FreeV      List of free variables created for All-statements. It is used to
%%             ensure the continuity of all-variables in expanding nested
%%             all-statements. If, in future versions, all-statements are
%%             allowed to contain guarded expression statements, guarded
%%             expression processing will need to also account for free
%%             variables in its copying of guarded expressions.
%%  Guarded:   List of guarded expressions. Guarded expressions are a kind of
%%             one way if-statement, very similar to Prolog Horn clauses.
%%                 guarded(Guard,Expression)
%%             For all guards that are matched by the current literal, the
%%             corresponding Expressions are placed on Unexp, the list of
%%             unexplored expressions. The exception is that Expressions which
%%             are  themselves guarded expressions are immediately placed on
%%             this guarded expression list. Also, some guarded expressions are
%%             written as Prolog facts: the guarded expressions for three basic
%%             rules of the transitivity of equality are hard coded prolog
%%             facts, and type definitions are asserted as Prolog facts.
%%  DepthLeft: Number of remaining times that the search is allowed to place
%%             guarded expressions on the Unexp list. It is NOT a count of the
%%             number of guarded expressions that are placed on the Unexp list.
%%             This will prevent the search from cycling through guarded
%%             expressions that then match additional guarded expressions. Because equality uses the
%%             Guarded-list processing, the number of chained equalities is limited here.

% true is consistent, therefore (not true) is inconsistent
inconsistent(-true ,_,_,_,_,_).

% false is inconsistent
inconsistent(false ,_,_,_,_,_) :- mydebug('false is inconsistent!').

% AND is inconsistent if either of its conjuncts is inconsistent
inconsistent((A,B),UnExp,Lits,FreeVar,Guarded, DepthLeft)
 :- !, \+ reached_limit
  , dbbegin(ThisLevel, ['AND check ', (A,B)])
  , ( inconsistent(A,[B|UnExp],Lits,FreeVar,Guarded, DepthLeft)
     -> mydebug(['Inconsistent AND:',(A,B)])
      ; ( reached_limit -> dbend(ThisLevel, ['AND reached limit', (A,B)])
                         ; dbend(ThisLevel, ['AND was consistent', (A,B)])
        )
        , fail
    )
  , mydebug(['AND arg1 or arg2 ended ', (A,B)])
  , dbend(ThisLevel, ['AND completed'])
  .

% OR is inconsistent if both its disjuncts are inconsistent.
% if either argument has reached the depth limit, then we do not know the result
% for that branch and the result of the other branch cannot prove inconsistency.
% The other brach could be consistent, proving the consistency of the OR, but we
% do not persue that.
inconsistent((A;B),UnExp,Lits,FreeVar,Guarded, DepthLeft)
 :- !, \+ reached_limit
  , dbbegin(ThisLevel, ['OR check ',(A;B),'Guarded:',Guarded])
  % Var matches across branches are required in Lits because an OR within an ALL
  %   needs to keep any unification from branch to branch. This is not true with
  %   guards, so we preserve the original Guarded.
  , copy_term(Guarded,OldGuarded)
  , inconsistent(A,UnExp,Lits,FreeVar,Guarded, DepthLeft)
  , \+ reached_limit
  , mydebug(['OR arg1 inconsistent: ',A,'Arg2:',B,'Guarded:',OldGuarded])
  , inconsistent(B,UnExp,Lits,FreeVar,OldGuarded, DepthLeft) % Guarded to OldGuarded
  , \+ reached_limit
  , mydebug(['OR arg2 inconsistent: ',B])
  , dbend(ThisLevel, ['OR completed',(A;B)])
  .

%preserveGuarded([],[]).
%preserveGuarded([[guarded(Guard,X),Fresh]|RestGuarded],[[Copy,Fresh]|RestNew])
% :- ( ground(Guard) -> copy_term(Fresh,Copy) ; Copy = guarded(Guard,X) )
%  , preserveGuarded(RestGuarded,RestNew)
%  .

% The two-parameter form of the all-statement is changed to the three parameter
% form with an non-var for the LastVar parameter.
inconsistent(all(X,Fml),UnExp,Lits,FreeV,Guarded, DepthLeft)
 :- !, inconsistent(all(X,Fml,[]),UnExp,Lits,FreeV,Guarded, DepthLeft)
  .

% Here we only check for FreeV length, elsewhere we check DepthLeft
% If findNext() cannot find an all(...) that is ready to use (or another term to
% expand, then fail
%
inconsistent(all(X,Fml,LastVar),UnExp,Lits,FreeV,Guarded, DepthLeft)
 :- !, \+ reached_limit
   , ( Lits=[lt(A0,B0)] ,  var(A0) , var(B0) , \+ (A0 = a0 , B0 = b0)
      -> mydebug(['in ALL Lits, vars unified 0:',Fml,' = ',Fml,  'with Lits: ',Lits,' FreeV: ',FreeV])
       ; true
     )
  , ( var(LastVar) % if last expansion of this all() has not yet been used
       -> ( findNext(UnExp,[all(X,Fml,LastVar)],UnExpOut,UnusedAllToAppend,Next)
           -> append(UnExpOut,UnusedAllToAppend,NewUnExp)
            , mydebug(['Unused All, going to Next:',Next,'UnExp:',NewUnExp,'Lits:',Lits,'FreeV:',FreeV,'Guarded:',Guarded,'DepthLeft:',DepthLeft])
            , inconsistent(Next,NewUnExp,Lits,FreeV,Guarded, DepthLeft)
          ; mydebug(['ALL fail:',all(X,Fml,LastVar),'Lits:', Lits,'UnExp:', UnExp])
            , fail
          )
        % otherwise, this all() is ready for a new expansion
        ; mydebug(['Proceeding with:',all(X,Fml,LastVar),'Lits:', Lits,'UnExp:',UnExp,'DepthLeft:', DepthLeft])
          , mydebug(['in ALL 1 from:',Fml,' with Lits: ',Lits])
          , length(FreeV,Length), limit(Limit)
          , ( Length < Limit -> true
            ; mydebug(['Limit reached ',Length,' limit: ',Limit])
              , assert(reached_limit), assert(with_limit)
              , fail
            )
          , mydebug(['in ALL 2:',Fml,' with Lits: ',Lits]) % ,'                 FreeV: ',FreeV])
         , ( Lits=[lt(A1,B1)] ,  var(A1) , var(B1) , \+ (A1 = a1 , B1 = b1)
            -> mydebug(['in ALL Lits, vars unified 1:',Fml,' = ',Fml,  'with Lits: ',Lits,' FreeV: ',FreeV])
             ; true
           )
         , copy_term((X,Fml,FreeV),(X1,Fml1,FreeV))
         , ( Lits=[lt(A2,B2)] ,  var(A2) , var(B2) , \+ (A2 = a2 , B2 = b2)
            -> mydebug(['in ALL Lits, vars unified 2:',Fml,'to:',Fml1,' with Lits: ',Lits,' FreeV: ',FreeV])
             ; true
           )
          , mydebug(['in ALL 3 from:',Fml,'to:',Fml1,' with Lits: ',Lits]) % ,' FreeV: ',FreeV])
          , append(UnExp,[all(X,Fml,X1)],UnExp1) % X1 is the latest var used
          , mydebug(['Now check inconsistent for fml: ',Fml1,' with Lits: ',Lits,'UnExp:',UnExp1])
          , inconsistent(Fml1,UnExp1,Lits,[X1|FreeV],Guarded, DepthLeft)
    )
  .

% If findNext() sees that LastVar is a variable, then the previous use of this
% all-predicate has not been used, so it skips it and returns the next item in
% UnExp; if UnExp is [], fail
%
findNext([all(X,Fml,LastVar)|RestUnexp],UnusedSoFar,UnExpOut,UnusedAllToAppend,Next)
 :- ! % do not backtrack to use following findNext()
  , ( var(LastVar) % if last expansion of all has not yet been used
     -> findNext(RestUnexp,[all(X,Fml,LastVar)|UnusedSoFar],UnExpOut,UnusedAllToAppend,Next)
      ; Next = all(X,Fml,LastVar)
        , UnExpOut = RestUnexp
        , UnusedAllToAppend = UnusedSoFar
    )
  .
% anything other than an all() is OK to use
findNext([Next|RestUnexp],UnusedSoFar,RestUnexp,UnusedSoFar,Next).
% findNext([],_,_,_,_) :- fail.

%% No more literals to check, but A=A so -(A=A) is inconsistent
inconsistent(-(A=A),_,[],_,_,_). % inconsistent

%% If identical ground terms A and B are equal, then -(A=B) is inconsistent.
%% However, if either involves a variable, to allow the match would
%% claim that arbitrary different items exist.
inconsistent(-(A=B),_,_,_,_,_) :- ground(A=B),A=B.


negTest(-S, _,[ S|Lits]).
negTest( _,-R,[ R|Lits]).
negTest(S, R,[_|Lits]) :- negTest(S,R,Lits) .


% eqTest/2 is a possible substitute for both posTest and negTest, and it should
% be considered for use in transferGuarded
% would it be better to use member on the longer list or the shorter list,
% as we do here?

%eqTest(_,[]) :- fail.
%eqTest([],_) :- fail.
eqTest([FirstTest|RestTests],[FirstTest|RestList]).
eqTest([FirstTest|RestTests],[FirstList|RestList])
 :- eqTest(RestTests,[FirstList|RestList]) % or member(FirstList,RestTests)
  ; eqTest([FirstTest|RestTests],RestList)
  .


inconsistent(-(A=B),UnExp,Lits,FreeV,Guarded, DepthLeft)
 :- mydebug(['Proving equal: ',-(A=B),'Lits: ',Lits,'Guarded: ',Guarded])
  , \+ reached_limit
  , \+ eqTest([-(A=B),-(B=A)],Lits)
  , gnzArgs(A,NewA,AFunctor,AArgs,VarAArgs)
  , gnzArgs(B,NewB,BFunctor,BArgs,VarBArgs)
  , append(AArgs,BArgs,Args), append(VarAArgs,VarBArgs,VarArgs)
  , ( negTest(-(NewA=NewB),-(NewB=NewA),Lits) % backtrack will search all Lits
      , mydebug(['negTest found matching Lit: ',-(A=B),'Lits: ',Lits])
      , (Args = []
        ; toDisjunct(Args,VarArgs,ArgDisjunct)
          , inconsistent(ArgDisjunct,UnExp,[-(A=B)|Lits],FreeV,Guarded, DepthLeft)
        )
    ; AFunctor = BFunctor
      , mydebug(['Matching functors: ',-(A=B),'AArgs:',AArgs,'BArgs',BArgs])
      , toDisjunct(AArgs,BArgs,ArgDisjunct)
      , inconsistent(ArgDisjunct,UnExp,[-(A=B)|Lits],FreeV,Guarded, DepthLeft)
    ; mydebug(['Checking neg DepthLeft:',DepthLeft,'for',-(A=B)])
      , ( DepthLeft > 0 -> true
        ; maxLimit(ContinueLimit)
          , mydebug(['Maximum depth reached. ',ContinueLimit,'continuations left.'])
          , assert(reached_limit), assert(with_limit)
          , fail
        )
      , mydebug(['Checking guards at:',-(A=B),'DepthLeft:',DepthLeft
                ,' Lits: ',Lits,' UnExp: ',UnExp,' Guarded: ',Guarded])
      , copy_term((-(NewA=NewB),-(NewB=NewA),Args,VarArgs),Matcher)
      , addList(Matcher,(-(NewA=NewB),-(NewB=NewA),Args,VarArgs),Guarded,[]
               ,UnExp,Lits,FreeV,DepthLeft,Guarded1,NewUnExp)
      , mydebug(['After addList at:',-(A=B),' UnExp: ',NewUnExp,'Guarded: ',Guarded1])
      , getGuardedMatches(-(A=B),-(B=A),Guarded1,NewGuarded)
      , mydebug(['After getGuardedMatches at:',-(A=B),'Guarded: ',NewGuarded])
      , ( NewUnExp \= UnExp -> NewDepthLeft is DepthLeft-1
                               , mydebug(['New NewDepthLeft:',NewDepthLeft])
                             ; NewDepthLeft = DepthLeft
        )
      , !
      , ( [Next|RestUnExp] = NewUnExp
         -> mydebug(['Ready to check at:',-(A=B),'Next:',Next,'RestUnExp:',RestUnExp])
            , inconsistent(Next,RestUnExp,[-(A=B)|Lits],FreeV,NewGuarded, NewDepthLeft)
            , mydebug(['Next inconsistent at ',-(A=B),'Next:',Next])
          ; mydebug(['Fail at ',-(A=B),'NewUnExp:',NewUnExp]), fail
        )
    )
  .

inconsistent(-Lit,UnExp,Lits,FreeV,Guarded, DepthLeft)
 :- \+ reached_limit
  , Lit \= (_=_), Lit \= all(_,_,_), Lit \= true %  , Functor \= '=', Functor \= 'all'
  , mydebug(['Predicate1: ',-Lit,'Lits:',Lits])
  , gnzArgs(Lit,NewLit,Functor,Args,VarArgs)
  , !
  , ( member(NewLit,Lits) % Note sign change. Retries all Lits on backtrack.
      , mydebug(['Args:',Args,'VarArgs:',VarArgs])
      , toDisjunct(Args,VarArgs,ArgDisjunct)
%% choose below or just the inconsistent following
%% NOTE: this more complicated version runs slower on the test cases,
%%       perhaps because it generates many more variables but only changes the
%%       execution path in minor ways on the test examples
%      , ( ( ArgDisjunct = (_ ; MaybeFalse) , MaybeFalse \= false )
%          % postpone testing of disjunction until end of other tests
%         -> append(UnExp,[ArgDisjunct],NewUnExp)
%            , [Next|RestUnExp] = NewUnExp
%            , inconsistent(Next,RestUnExp,Lits,FreeV,Guarded, DepthLeft)
%          % otherwise, immediately dispose of the single predicate
%          ; inconsistent(ArgDisjunct,UnExp,Lits,FreeV,Guarded, DepthLeft)
%        )
%% choose above or just the inconsistent following
      , mydebug(['ArgDisjunct:',ArgDisjunct,'Lits:',Lits])
      , inconsistent(ArgDisjunct,UnExp,[-Lit|Lits],FreeV,Guarded, DepthLeft)
    ; mydebug(['No match, Proceeding to UnExp: ',UnExp,'with Lits:',[-Lit|Lits]])
      , [Next | RestUnExp] = UnExp % note fails if UnExp = [] % TODO: consider checking member(-Lit,Lits)
      , inconsistent(Next,RestUnExp,[-Lit|Lits],FreeV,Guarded, DepthLeft)
    )
  .

%%% If there are no literals, check to see if A=B is
%%% consistent by unifying A and B. If not, A=B is inconsistent.
%%% THIS SEEMS REASONABLE BUT IN FACT CAUSES MANY PROBLEMS
%%% Instead, we need to put A=B on the literals list.
%%%
%inconsistent(A=B,_,[],FreeV,_,_)
% :- mydebug(['Check for unify: ',A=B]), nl,print('FAIL  A=B WITH NO LITERALS.')
%  , ground(A=B), A \= B. % A=B is inconsistent
%  .


posTest( S, _,[-S|Lits]).
posTest( _, R,[-R|Lits]).
posTest(S, R,[_|Lits]) :- posTest(S,R,Lits) .

inconsistent((A=B),UnExp,Lits,FreeV,Guarded, DepthLeft)
 :- mydebug(['Proving equal: ',A=B,'Lits: ',Lits,'Guarded: ',Guarded])
  , \+ reached_limit
  , \+ eqTest([(A=B),(B=A)],Lits)
  , gnzArgs(A,NewA,AFunctor,AArgs,VarAArgs)
  , gnzArgs(B,NewB,BFunctor,BArgs,VarBArgs)
  , append(AArgs,BArgs,Args), append(VarAArgs,VarBArgs,VarArgs)
  , ( posTest((NewA=NewB),(NewB=NewA),Lits) % backtrack to search all Lits
      , mydebug(['posTest found matching Lit: ',A=B,'Lits: ',Lits])
      , (Args = []
        ; toDisjunct(Args,VarArgs,ArgDisjunct)
          , inconsistent(ArgDisjunct,UnExp,[(A=B)|Lits],FreeV,Guarded, DepthLeft)
        )
    ; mydebug(['Checking pos DepthLeft:',DepthLeft,'for',(A=B)])
      , ( DepthLeft > 0 -> true
        ; maxLimit(ContinueLimit)
          , mydebug(['Maximum depth reached. ',ContinueLimit,'continuations left.'])
          , assert(reached_limit), assert(with_limit)
          , fail
        )
      , mydebug(['Checking guards at:',(A=B),'DepthLeft:',DepthLeft
                ,' Lits: ',Lits,' UnExp: ',UnExp,'Guarded: ',Guarded])
      , copy_term(((NewA=NewB),(NewB=NewA),Args,VarArgs),Matcher)
      , addList(Matcher,((NewA=NewB),(NewB=NewA),Args,VarArgs),Guarded,[]
               ,UnExp,Lits,FreeV,DepthLeft,Guarded1,NewUnExp)
      , mydebug(['After addList at:',(A=B),' UnExp: ',NewUnExp,'Guarded: ',Guarded1])
      , getGuardedMatches(A=B,B=A,Guarded1,NewGuarded)
      , mydebug(['After getGuardedMatches at:',(A=B),'Guarded: ',NewGuarded])
      , ( NewUnExp \= UnExp -> NewDepthLeft is DepthLeft-1
                               , mydebug(['New NewDepthLeft:',NewDepthLeft])
                             ; NewDepthLeft = DepthLeft
        )
      , !
      , ( [Next|RestUnExp] = NewUnExp
         -> mydebug(['Ready to check at:',(A=B),'Next:',Next,'RestUnExp:',RestUnExp])
            , inconsistent(Next,RestUnExp,[(A=B)|Lits],FreeV,NewGuarded, NewDepthLeft)
            , mydebug(['Next inconsistent at ',(A=B),'Next:',Next])
          ; mydebug(['Fail at ',(A=B),'NewUnExp:',NewUnExp]), fail
        )
    )
  .

inconsistent(Lit,UnExp,Lits,FreeV,Guarded, DepthLeft)
 :- \+ reached_limit
  , Lit \= (_=_), Lit \= all(_,_,_), Lit \= -(_), Lit \= false
  , ( Lit=lt(A0,B0) ,  var(A0) , var(B0) , \+ (A0 = a0 , B0 = b0)
      -> mydebug(['in Lit check, vars unified 0:',Lit,'with Lits: ',Lits,' FreeV: ',FreeV])
       ; true
     )
  , mydebug(['Predicate1: ',Lit,'Lits:',Lits])
  , gnzArgs(Lit,NewLit,Functor,Args,VarArgs)
  , !
  , ( member(-NewLit,Lits) % Note sign change. Retries all Lits on backtrack.
      , toDisjunct(Args,VarArgs,ArgDisjunct)
%% choose below or just the inconsistent following
%% NOTE: this more complicated version runs slower on the test cases,
%%       perhaps because it generates many more variables but only changes the
%%       execution path in minor ways on the test examples
%      , ( ( ArgDisjunct = (_ ; MaybeFalse) , MaybeFalse \= false )
%          % postpone testing of disjunction until end of other tests
%         -> append(UnExp,[ArgDisjunct],NewUnExp)
%            , [Next|RestUnExp] = NewUnExp
%            , inconsistent(Next,RestUnExp,Lits,FreeV,Guarded, DepthLeft)
%          % otherwise, immediately dispose of the single predicate
%          ; inconsistent(ArgDisjunct,UnExp,Lits,FreeV,Guarded, DepthLeft)
%        )
%% choose above or just the inconsistent following
      , inconsistent(ArgDisjunct,UnExp,[Lit|Lits],FreeV,Guarded, DepthLeft)
    ; mydebug(['No match, Proceeding to UnExp: ',UnExp,'with Lits:',[Lit|Lits]])
      , ( Lit=lt(A1,B1) ,  var(A1) , var(B1) , \+ (A1 = a1 , B1 = b1)
          -> mydebug(['in Lit check, vars unified 0:',Lit,'with Lits: ',Lits,' FreeV: ',FreeV])
           ; true
         )
      , [Next | RestUnExp] = UnExp % note fails if UnExp = [] % TODO: consider checking member(-Lit,Lits)
      , inconsistent(Next,RestUnExp,[Lit|Lits],FreeV,Guarded, DepthLeft)
    )
  .

inconsistent(Lit,_,Lits,_,_,_)
 :- \+ reached_limit
  , Lit \= (_=_), Lit \= -(_=_)
  , (Lit = -Neg; -Lit = Neg)
     -> member(Neg,Lits)
  .


% The Next is implicitly an AND with the preceding Lit. If either is
% inconsistent, then the AND is inconsistent. So the ambiguity of a
% reached_limit condition does not matter for checking inconsistency of Next.
%
inconsistent(Lit,[Next|UnExp],Lits,FreeV,Guarded, DepthLeft)
 :- ( reached_limit
        % we limit the number of conjuncts that reach the depth limit
     -> maxLimit(ContinuationLimit)
        , ( ContinuationLimit > 0
           -> limit(Limit)
              , mydebug(['At limit. DepthLeft:',DepthLeft
                        ,'ContinuationLimit:',ContinuationLimit,'for Lit: ',Lit
                        ])
              , NewContinuationLimit is ContinuationLimit-1
              , retract(maxLimit(ContinuationLimit)), assert(maxLimit(NewContinuationLimit))
              , NewDepthLeft = Limit
              , retractall(reached_limit) % we keep with_limit
              , mydebug(['Continuing after reaching limit. ',NewContinuationLimit,' continuations left.'])
            ; mydebug(['No continuations left at Lit: ',Lit])
              , fail
          )
      ; NewDepthLeft = DepthLeft
    )
  , Lit \= false
  , NewLits = [Lit|Lits]
  , mydebug(['New lit: ',Lit,' use Next: ',Next,' leaving rest of UnExp: ',UnExp])
  , inconsistent(Next,UnExp,NewLits,FreeV,Guarded, NewDepthLeft)
  .

%% Generalize a structures arguments to variables
gnzArgs(LitWithArgs,LitWithVars,Functor,Args,Vars)
 :- (atom(LitWithArgs) ; var(LitWithArgs))
   -> LitWithVars=LitWithArgs, Functor=LitWithArgs, Args=[], Vars=[]
  ; LitWithArgs =.. [Functor|Args]
    , ensure_vars(Args,Vars)
    , LitWithVars =.. [Functor|Vars]
  .

%% ensure_vars(+Args,-VarArgs)
%% Create a list of variables that corresponds to the list of arguments, but use
%% the argument itself if it is already a variable.
%
ensure_vars([],[]).
ensure_vars([A|Args],VarArgs)
 :- dbbegin(ThisLevel, ['ensure_vars   old: ',[A|Args]])
  , ( var(A) -> VarArgs = [A|MoreVars] % Use arg A if it is already a variable
              ; VarArgs = [V|MoreVars] % New V will stand in place for A
    )
  , ensure_vars(Args,MoreVars)
  , dbend(ThisLevel, ['ensure_vars old: ',[A|Args],'new:',VarArgs])
  .

%% toDisjunct(+ArgList,+VarList,+DisjunctSoFar,-ArgDisjunction)
%%   (Fails unless Arglist and Varlist are the same length.)
%%   (DisjunctSoFar must be false on initial call.)
%% Create an expression, ArgDisjunction, that is the disjunction of a set of
%% inequalities. Each inequality will be used to see if there is support for
%% the equality of its argument and corresponding variable from the lists.
%%
%% The VarList is presumed to come from the Lits, so any variables there are
%% preserved. If V
%% is still a variable, or if it unifies with A, then they are trivially equal
%% and do not need to be tested. The ArgDisjunction will be inconsistent if each
%% of its disjuncts is inconsistent; therefore, if no arguments need to be
%% tested, we return the trivially inconsistent disjunction, false.
%%
%% The returned disjunction will associate as
%%    c ; (b ; a)
%
% A var(V) at the end does not add a false at the end
%       unless it has no predecessors that returned a disjunct. That is
%
%       toDisjunct([b],[V],false) but ensure that
%
%       toDisjunct([a,b],[c,V],  -(a=c)           )  instead of
%       toDisjunct([a,b],[c,V], (-(a=c);false) )

toDisjunct(A,V,Disjunction) :- toFilledDisjunct(A,V,false,Disjunction).
%toDisjunct(A,V,Disjunction) :- toDisjunct(A,V,false,Disjunction).
%
%toDisjunct([],[],SoFar,SoFar).
%toDisjunct([A|RestOfArgs],[V|VarArgs],SoFar,Disjunction)
% :- mydebug(['toDisjunct  in, Args: ',[A|RestOfArgs], 'VarArgs:',[V|VarArgs]])
%  , ( RestOfArgs=[]
%     -> ( ( var(V), nonvar(A), A\=V ) -> mydebug(['STO fail A, Args: ',[A|RestOfArgs], 'VarArgs:',[V|VarArgs]]), fail % fails if subject to Occurs check
%        ; ( var(A), nonvar(V), A\=V ) -> mydebug(['STO fail V, Args: ',[A|RestOfArgs], 'VarArgs:',[V|VarArgs]]), fail % "
%        ; ( var(V) ; A=V ) -> Disjunction = SoFar % TODO: use ( var(V) ; var(A) ; A=V )
%           % TODO: use A==V to preserve variables inside V when it is a structure
%           %       but then we may need to do A=V when A is a variable
%           % TODO: When STO, do we need to issue -(A=V) to allow for cases such
%           %       as f(0) = 0
%        ; SoFar = false    -> Disjunction = -(A=V)
%        ;                     Disjunction = (-(A=V) ; SoFar)
%        )
%      ; ( ( var(V) ; A=V ) -> toDisjunct(RestOfArgs,VarArgs,SoFar,Disjunction)
%        ; SoFar = false    -> toDisjunct(RestOfArgs,VarArgs,(-(A=V)),Disjunction)
%        ;                     toDisjunct(RestOfArgs,VarArgs,(-(A=V) ; SoFar),Disjunction)
%        )
%    )
%  , mydebug(['toDisjunct out, Args: ',[A|RestOfArgs], 'VarArgs:',[V|VarArgs], 'Disjunction:',Disjunction, 'SoFar:',SoFar])
%  .

%% like toDisjunct() but does not preserve variables in Lits
toFilledDisjunct(A,V,Disjunction) :- toFilledDisjunct(A,V,false,Disjunction).

toFilledDisjunct([],[],SoFar,SoFar).
toFilledDisjunct([A|RestOfArgs],[V|VarArgs],SoFar,Disjunction)
 :- mydebug(['toFilledDisjunct, Args: ',[A|RestOfArgs], 'VarArgs:',[V|VarArgs]])
  , ( RestOfArgs=[]
     -> ( (A=V)         -> Disjunction = SoFar
        ; SoFar = false -> Disjunction = -(A=V)
        ;                  Disjunction = (-(A=V) ; SoFar)
        )
      ; ( (A=V)       -> toFilledDisjunct(RestOfArgs,VarArgs,SoFar,Disjunction)
        ; SoFar=false -> toFilledDisjunct(RestOfArgs,VarArgs,(-(A=V)),Disjunction)
        ;                toFilledDisjunct(RestOfArgs,VarArgs,(-(A=V) ; SoFar),Disjunction)
        )
    )
  .

%toDisjunct([],_,false).
%toDisjunct([A|RestOfArgs],[V|VarArgs],ArgDisjunct)
% :- mydebug(['toDisjunct, Args: ',[A|RestOfArgs], 'VarArgs:',[V|VarArgs]])
%  , ( RestOfArgs=[]
%      -> ( ( var(V) ; A=V ) -> ArgDisjunct = false % preserve variabe V
%                             ; ArgDisjunct = -(A=V)
%         )
%       ; ( ( var(V) ; A=V ) ->                toDisjunct(RestOfArgs,VarArgs,ArgDisjunct)
%         ; ArgDisjunct = (-(A=V) ; Disjunct), toDisjunct(RestOfArgs,VarArgs,Disjunct)
%         )
%    )
%  .
%
%%% like toDisjunct() but does not preserve variables
%toFilledDisjunct([],_,false).
%toFilledDisjunct([A|RestOfArgs],[V|VarArgs],ArgDisjunct)
% :- mydebug(['toFilledDisjunct, Args: ',[A|RestOfArgs], 'VarArgs:',[V|VarArgs]])
%  , ( RestOfArgs=[]
%      -> ( ( A=V ) -> ArgDisjunct = false % if var(V), we make it A
%                    ; ArgDisjunct = -(A=V)
%         )
%       ; ( ( A=V ) ->                         toFilledDisjunct(RestOfArgs,VarArgs,ArgDisjunct)
%         ; ArgDisjunct = (-(A=V) ; Disjunct), toFilledDisjunct(RestOfArgs,VarArgs,Disjunct)
%         )
%    )
%  .

% NOTE: Guarded expressions are an implementation trick and not a generally
%       usable term in the logic. The rules addList(...) and
%       getGuardedMatches(...) must be done for each specialized
%       inconsistent(...) that needs it -- specifically, types and transitivity
%       of (in-)equality.
%

getGuardedMatches(Lit,SymmetricLit,Guarded,NewGuarded)
 :- mydebug(['Before findall for: ',Lit, ' Guarded: ',Guarded])
  , findall(E,guarded(Lit,E),RuleMatches1) % Each E is a freshly renamed copy
  , splitGuarded(RuleMatches1,Guarded,Guarded2)
  , findall(E,guarded(SymmetricLit,E),RuleMatches2) % Each E is a freshly renamed copy
  , splitGuarded(RuleMatches2,Guarded2,NewGuarded)
  .

% splitGuarded(@RuleMatches, @GuardedIn, @UnExpSoFar, -GuardedOut, -UnExpOut)
% Split the rulematches to either add them to Guarded or to the list of
% unexplored literals.
%   RuleMatches The list of guarded expressions that were found. They will be
%               prepended to either the Guarded or UnExp lists. Note that each
%               member rule-match is already a freshly renamed copy.
%   GuardedIn   The complete list of guarded expressions for this branch,
%               which will have new guarded expressions prepended. Starting
%               value needs to be the current Guarded list.
%   GuardedOut  Final value of the complete set of guarded expressions
%
splitGuarded([],Guarded,Guarded).
splitGuarded([R|RuleMatches],GuardedSoFar,GOut)
 :- copy_term(R,RR)
  , splitGuarded(RuleMatches,[[RR,R]|GuardedSoFar],GOut)
  .

% for equality, all the hard-coded rules generate new guarded rules, so this is
% not needed.
%splitGuarded([],Guarded,UnExp,Guarded,UnExp).
%splitGuarded([R|RuleMatches],GuardedSoFar,UnExpSoFar,GOut,NewUnExp)
% :- ( R = guarded(_,_)
%       -> ( copy_term(R,RR)
%          , splitGuarded(RuleMatches,[[RR,R]|GuardedSoFar],UnExpSoFar,GOut,NewUnExp)
%          , mydebug(['Add to Guarded:',R])
%          )
%        ; splitGuarded(RuleMatches,GuardedSoFar,[R|UnExpSoFar],GOut,NewUnExp)
%          , mydebug(['Add to UnExp:',R])
%    )
%  .


% addList(@GnzdLit,@OrigGnzd,+GuardedToCheck,@GuardedIn, @UnExpIn, @Lits, -GuardedOut, -UnExpOut)
% Add expressions from the GuardedToCheck list to either GuardedIn or UnExpIn.
%
%   GnzdLit     The literal being considered. It is matched against the first
%               copy of the initial member of the GuardedToCheck list.
%   OrigGnzd    A copy that doesn't get matched with anything; it must stay
%               unchanged in order to test against other guarded expressions
%   GuardedToCheck   The list of members of the Guarded list that remain to be
%               checked against Lit. Each member is a pair of guarded
%               expressions that are identical except for renaming of variables.
%               The starting value is the current Guarded list.
%   GuardedIn   The full original guarded list for use in inconsistent(...).
%   UnExpIn     Start this with the currrent UnExp for this branch. New
%               expressions from matches will be prepended, if they are not
%               guarded expressions.
%   Lits        All the literals, so far, for checking additions to UnExp
%   FreeVar     Free Variables created in All-statement processing
%   DepthLeft   The number of remaining times that guarded expressions can add
%               new terms to the unexplored list
%   GuardedOut  Final value of the complete set of guarded expressions,
%               including all the original guarded expressions (possibly
%               recreated as fresh copies).
%   UnExpOut    Final value of the complete set of unexplored expressions
%               consisting of the original UnExpIn with any new expressions
%               that were found.
%
addList(_,_,[],Guarded,UnExp,_,_,_,Guarded,UnExp).
% Lit is grounded when the following rule is invoked. Otherwise,
% instead of reusing Lit, we would have to use a fresh copy of OrigGnzd, as in
% the next rule.
addList((Lit,SymmetricLit,[],[]),OrigGnzd,[[guarded(Lit,X),Orig]|Rest],GIn,UnExpIn,Lits,FreeVar,DepthLeft,GOut,UnExpOut)
 :- copy_term(Orig,Fresh)
  , transferGuarded(X,UnExpIn,Lits,UnExpTemp)
  , addList((Lit,SymmetricLit,[],[]),OrigGnzd,Rest,[[Fresh,Orig]|GIn],UnExpTemp,Lits,FreeVar,DepthLeft,GOut,UnExpOut)
  .
addList((Lit,_,Args,VarArgs),OrigGnzd,[[guarded(Lit,X),Orig]|Rest],GIn,UnExpIn,Lits,FreeVar,DepthLeft,GOut,UnExpOut)
 :- mydebug(['addList testing: ',Lit, 'Args: ',Args, 'VarArgs: ',VarArgs, 'New guarded result: ',X])
  , toFilledDisjunct(Args,VarArgs,ArgDisjunct)
  , append(Rest,GIn,FullGuards) % the current guarded expression won't match
  , inconsistent(ArgDisjunct,UnExpIn,Lits,FreeVar,FullGuards, DepthLeft)
  , mydebug(['Successful match in addList: ',Lit, 'ArgDisjunct: ',ArgDisjunct])
  , copy_term((Orig,OrigGnzd),(Fresh,FreshGnzd))
  , transferGuarded(X,UnExpIn,Lits,UnExpTemp)
  , addList(FreshGnzd,OrigGnzd,Rest,[[Fresh,Orig]|GIn],UnExpTemp,Lits,FreeVar,DepthLeft,GOut,UnExpOut)
  .
addList((Lit,SymmetricLit,Args,VarArgs),OrigGnzd,[[guarded(SymmetricLit,X),Orig]|Rest],GIn,UnExpIn,Lits,FreeVar,DepthLeft,GOut,UnExpOut)
 :- toFilledDisjunct(Args,VarArgs,ArgDisjunct)
  , append(Rest,GIn,FullGuards) % the current guarded expression won't match
  , inconsistent(ArgDisjunct,UnExpIn,Lits,FreeVar,FullGuards, DepthLeft)
  , mydebug(['Successful match in Symetric addList: ',SymmetricLit, 'ArgDisjunct: ',ArgDisjunct])
  , copy_term(Orig,Fresh),copy_term(OrigGnzd,FreshGnzd)
  , transferGuarded(X,UnExpIn,Lits,UnExpTemp)
  , addList(FreshGnzd,OrigGnzd,Rest,[[Fresh,Orig]|GIn],UnExpTemp,Lits,FreeVar,DepthLeft,GOut,UnExpOut)
  .
addList(Gnzd,OrigGnzd,[G|Rest],GIn,UnExpIn,Lits,FreeVar,DepthLeft,GOut,UnExpOut)
 :- addList(Gnzd,OrigGnzd,Rest,[G|GIn],UnExpIn,Lits,FreeVar,DepthLeft,GOut,UnExpOut)
  .

transferGuarded(X,UnExpIn,Lits,UnExpOut)
 :- ( \+ ( member(X,UnExpIn) ; member(X,Lits)
          ; X = -(A=B), ( member(-(B=A), UnExpIn) ; member(-(B=A),Lits) )
          ; X =  (A=B), ( member( (B=A), UnExpIn) ; member( (B=A),Lits) )
          )
       % NOTE: This avoids unifying X with a member of UnExpIn or Lits.
       %   Because, when there are multiple variables involved we could
       %   face a problem:
       %     What if a member of UnExp has a variable which would match
       %     with a literal on Lits, but when unified with X no longer has
       %     the variabe open?
    )
     -> append(UnExpIn,[X],NewUnExp)
        , UnExpOut=NewUnExp
      ; UnExpOut=UnExpIn
  .


% -----------------------------------------------------------------
%              Equality Facts as Guarded expressions
%
% Reflexivity, X=X, and Symmetry, X=Y <=> Y=X, are managed with procedural
% checks. But transitivity requires several guarded expressions in order to
% cover all its possible representations as implications.
% Guards are procedural implications, so each of these possible representations
% as implication must be stated as a Prolog fact.
%   ( X=Y /\ Y=Z ) => X=Z  is equivalent to -(X=Y) \/ -(Y=Z) \/ (X=Z)
% and 6 permutations of the disjuncts are possible that need to be covered with
% the guarded expressions, but it turns out that half are duplicates under
% renaming. Symmetry is accounted for in the processing of the rules.
%
% (A quirk of tuProlog findall requires using distinct variable names for
% tuprolog.version=3.0.1; apparently, a new variable number is not generated
% for each application of call(Goal) in findall(Term,Goal,Bag). )
%
guarded( (X1=Y1), guarded( (Y1=Z1),  (X1=Z1))). %  (X=Y) => ( (Y=Z) =>  (X=Z) )
guarded( (X2=Y2), guarded(-(X2=Z2), -(Y2=Z2))). %  (X=Y) => (-(X=Z) => -(Y=Z) )
guarded(-(X3=Z3), guarded( (X3=Y3), -(Y3=Z3))). % -(X=Z) => ( (X=Y) => -(Y=Z) )
