%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% $Id: LeanTaPsrc.shar,v 1.1 2012/11/15 00:14:20 beckert Exp $
% Sicstus Prolog
% Copyright (C) 1993: Bernhard Beckert & Joachim Posegga
%                     Universit"at Karlsruhe
%                     Email: {beckert|posegga}@ira.uka.de
%
% Purpose:            computes Skolemized negation normal form
%                     for a first-order formula
%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%% separate directives are required for operators
%:- op(300,xfy,':' ).   % needed if we implement universal variable option
:- op(400,fy ,'-' ).   % negation
:- op( 700,xfx,'#=').  % not equal, != conflicts in tuProlog with ! (cut)
%:- op( 700,xfx,'=').   % equal, 700 is the standard prolog precedence for =
                        % but it seems to require parentheses anyway
:- op(1000,xfy,'/\').  % conjunction. Right-assoc instead of prolog 500,yfx
:- op(1050,xfy,'\/').  % disjunction. Right-assoc instead of prolog 500,yfx
:- op(1110,yfx,'==>'). % implication
:- op(1110,yfx,'<=='). % converse implication; infix "if" operator
:- op(1130,yfx,'==='). % logical equivalence
:- op(1130,yfx,'=#='). % logical nonequivalence, exclusive disjunction, "xor"
                       % unfortunately, a =!= b translates to (a = !) = b



% nnfdebug(A) :- !. % comment out this line to enable nnfdebug messages
nnfdebug(A) :- mydebug(A).


% -----------------------------------------------------------------
%  nnf(+Fml,?NNF)
%
% Fml is a first-order formula and NNF its Skolemized negation
% normal form.
%
% Syntax of Fml:
%  negation: '-', disj: '\/', conj: '/\', impl: '==>', eqv: '===',
%  quantification: 'all(X,<Formula>)', where 'X' is a prolog variable.
%
% Translated to the internal syntax: negation: '-', disj: ';', conj: ','
% quantification:
%  'all(X,<Formula>)', where 'X' is a prolog variable.
%
% Example:  nnf(ex(Y, all(X, (f(Y) ==> f(X)))),NNF).
%           NNF =  all(_A,(-(f(all(X,f(ex)==>f(X))));f(_A)))) ?

nnf(Fml,NNF) :- nnfdebug(['Starting ',Fml])
              , nnf(Fml,[],NNF,_)
              , !
              .

% SET OPERATORS
% :- op(300,xfy,':' )   % needed if we implement universal variable option
%  , op(400,fy ,'-' )   % negation
%  , op( 700,xfx,'#=')  % not equal, != conflicts in tuProlog with ! (cut)
%%  , op( 700,xfx,'=')   % equal, 700 is the standard prolog precedence for =
%  , op(   0,xfy,'/\')
%  , op( 800,xfy,'/\')  % conjunction. Right-assoc instead of prolog 500,yfx
%  , op(   0,xfy,'\/')
%  , op( 810,xfy,'\/')  % disjunction. Right-assoc instead of prolog 500,yfx
%  , op( 900,xfy,'==>') % implication
%  , op( 900,xfy,'<==') % converse implication; infix "if" operator
%  , op( 950,xfy,'===') % logical equivalence
%  , op( 950,xfy,'=#=') % logical nonequivalence, exclusive disjunction, "xor"
%                       % unfortunately, a =!= b translates to (a = !) = b
%  .


% -----------------------------------------------------------------
%  nnf(+Fml,+FreeV,-NNF,-Paths)
%
% Fml,NNF:    See above.
% FreeV:      List of free variables in Fml.
% Paths:      Number of disjunctive paths in Fml.
%
% Allowing lists of quantified vars will require enabling these lines and also
% the nnf(ex... ) lines below. In addition, here we must move non-list before
% list while ensuring that we have a single var, e.g.,
%
%   Fml = -ex(X,R,B), var(X)  -> Fml1 = all(X,R ==> -B)

% ??? nnf(Fml,_,_,_) :- var(Fml) -> print('Invalid Formula').

%% The theory for inequalities
%
% We assume that if inequalities occur, the following theory has been given to the prover
%   all(A, all(B,
%       (  ( (A < B) /\ -(B < A) /\ -(A = B) )
%       \/ (-(A < B) /\  (B < A) /\ -(A = B) )
%       \/ (-(A < B) /\ -(B < A) /\  (A = B) )
%       )
%    /\ all(C, ((A < B) /\ (B < C) ==> (A < C)) )
%   ))
%
% Some more careful thought is needed before including something like the commented out comparison
% translations in nnf(), below. If no < comparisons are present, they should not conflict with
% #= comparisons. But something else causes problems. Perhaps the comments on the right of the
% relation translations must be done. I think -(A = B) is handled specially in the prover


nnf(Fml,FreeV,NNF,Paths)
 :-   ( Fml = -false          -> Fml1 = true
      ; Fml = -true           -> Fml1 = false
      ; Fml = -(-A)              -> Fml1 = A                 % These must be done last to avoid
      ; Fml = -(A #= B)          -> Fml1 =  (A = B)          % following translation problems
      ; Fml =  (A #= B)          -> Fml1 = -(A = B)                   % ? /\ (A < B) \/ (B < A) ?
%       ; Fml = -(A > B)           -> Fml1 =  (B =< A)
%       ; Fml =  (A > B)           -> Fml1 =  (B < A)                            % /\ -(B = A)
%       ; Fml = -(A < B)           -> Fml1 =  (B >= A)
%       ; Fml = -(A >= B)          -> Fml1 = (A < B)                             % /\ -(A = B)
%       ; Fml =  (A >= B)          -> Fml1 = (A > B) \/ (A = B)
%       ; Fml = -(A =< B)          -> Fml1 = (B < A)                             % /\ -(B = A)
%       ; Fml =  (A =< B)          -> Fml1 = (A < B) \/ (A = B)
% For quantification, X is assumed to match a free variable
      ; Fml = -all(X,F)          -> Fml1 = ex(X,-F)
      ; Fml = -ex(X,F)           -> Fml1 = all(X,-F)
% For 3-argument quantification, R is Range, B is Body
      ; Fml =  all(X,R,B) -> Fml1 = all(X, R ==> B)
      ; Fml = -all(X,R,B) -> Fml1 = ex(X, R /\ -B)
      ; Fml =  ex(X,R,B)  -> Fml1 = ex(X, R /\ B)
      ; Fml = -ex(X,R,B)  -> Fml1 = all(X,R ==> -B)
%
      ; Fml = -(A \/ B)          -> Fml1 = -A /\ -B
      ; Fml = -(A \/ -B)         -> Fml1 = -A /\  B
      ; Fml = -(-A \/ B)         -> Fml1 =  A /\ -B
      ; Fml = -(-A \/ -B)        -> Fml1 =  A /\  B
      ; Fml = -(A /\ B)          -> Fml1 = -A \/ -B
      ; Fml = -(A /\ -B)         -> Fml1 = -A \/  B
      ; Fml = -(-A /\ B)         -> Fml1 =  A \/ -B
      ; Fml = -(-A /\ -B)        -> Fml1 =  A \/  B
      ; Fml =  (true /\ B)    -> Fml1 = B
      ; Fml =  (-false /\ B)  -> Fml1 = B
      ; Fml =  (A /\ true)    -> Fml1 = A
      ; Fml =  (A /\ -false)  -> Fml1 = A
      ; Fml =  (false /\ B)   -> Fml1 = false
      ; Fml =  (-true /\ B)   -> Fml1 = false
      ; Fml =  (A /\ false)   -> Fml1 = false
      ; Fml =  (A /\ -true)   -> Fml1 = false
      ; Fml =  (true \/ B)    -> Fml1 = true
      ; Fml =  (-false \/ B)  -> Fml1 = true
      ; Fml =  (A \/ true)    -> Fml1 = true
      ; Fml =  (A \/ -false)  -> Fml1 = true
      ; Fml =  (false \/ B)   -> Fml1 = B
      ; Fml =  (-true \/ B)   -> Fml1 = B
      ; Fml =  (A \/ false)   -> Fml1 = A
      ; Fml =  (A \/ -true)   -> Fml1 = A
      ; Fml =  (A <== B)         -> Fml1 =  A \/ -B
      ; Fml = -(A <== B)         -> Fml1 = -A /\  B
      ; Fml =  (A ==> B)         -> Fml1 = -A \/  B
      ; Fml = -(A ==> B)         -> Fml1 =  A /\ -B
      ; Fml =  (A =#= B)         -> Fml1 = -(A === B)
      ; Fml = -(A =#= B)         -> Fml1 =  (A === B)
      ; Fml =  (A === B)         -> Fml1 = (A /\  B) \/ (-A /\ -B) % or ( A \/ -B) /\ (-A \/  B)
      ; Fml = -(A === B)         -> Fml1 = (A /\ -B) \/ (-A /\  B) % or ( A \/  B) /\ (-A \/ -B)
      )
  , !
  , dbbegin(ThisLevel, ['nnf:', Fml])
  , nnfdebug(['using:', Fml1])
  , nnf(Fml1,FreeV,NNF,Paths)
  , dbend(ThisLevel, ['From:', Fml])
  , nnfdebug(        ['  to:', NNF])
  .

nnf(all(X,F),FreeV,all(X,NNF),Paths)
 :- !
  , dbbegin(ThisLevel, ['ALL:', all(X,F)])
  , nnfdebug(['using:', F])
  , nnf(F,[X|FreeV],NNF,Paths)
  , dbend(ThisLevel, ['From:', all(X,F)])
  , nnfdebug(        ['  to:', NNF])
  .

nnf(ex(X,Fml),FreeV,NNF,Paths)
 :- !
  , dbbegin(ThisLevel, ['EXISTS:', ex(X,Fml)])
  , copy_term((X,Fml,FreeV),(Fml,Fml1,FreeV))
  , nnfdebug(['   ex:', Fml1])
  , copy_term((X,Fml1,FreeV),(ex,Fml2,FreeV))
  , nnfdebug(['using:', Fml2])
  , nnf(Fml2,FreeV,NNF,Paths)
  , dbend(ThisLevel, ['From:', ex(X,Fml)])
  , nnfdebug(        ['  to:', NNF])
  .

nnf(A /\ B,FreeV,(NNF2,NNF1),Paths)
 :- !
  , dbbegin(ThisLevel, ['AND:', A /\ B])
  , nnfdebug(['using A/\B part A:', A,'from',A /\ B])
  , nnf(A,FreeV,NNF1,Paths1)
  , nnfdebug(['using A/\B part B:', B,'from',A /\ B])
  , nnf(B,FreeV,NNF2,Paths2)
  , Paths is Paths1 * Paths2
% My tests for efficiency cannot justify the following commented section
%     , (Paths1 > Paths2 -> NNF = (NNF2,NNF1) % postpone disjunctions
%                         ; NNF = (NNF1,NNF2)
%       )
  , dbend(ThisLevel, ['From:', A /\ B])
  , nnfdebug(        ['  to:', (NNF2,NNF1)])
  .

nnf(A \/ B,FreeV,NNF,Paths)
 :- !
  , dbbegin(ThisLevel, ['OR:', A \/ B])
  , nnfdebug(['using A\/B part A:', A,'from',A \/ B])
  , nnf(A,FreeV,NNF1,Paths1)
  , nnfdebug(['using A\/B part B:', B,'from',A \/ B])
  , nnf(B,FreeV,NNF2,Paths2)
  , Paths is Paths1 + Paths2
  , (Paths1 > Paths2 -> NNF = (NNF2;NNF1)
                      ; NNF = (NNF1;NNF2)
    )
  , dbend(ThisLevel, ['From:', A \/ B])
  , nnfdebug(        ['  to:', NNF])
  , nnfdebug(['From:', A \/ B])
  , nnfdebug(['  to:', NNF])
  .

nnf(Lit,_,Lit,1).
