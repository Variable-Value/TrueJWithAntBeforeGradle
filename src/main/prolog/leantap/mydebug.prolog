% This first rule will turn off processing for debuging messages.
% Comment it out to turn mydebug on.
% But debugging is still off unless db_start_debugging is called.

%db_start_debugging :- !. % this prevents the next rule from being executed


db_start_debugging
 :- asserta(debug_on)
  , retractall(db_level(_))
  , assertz(db_level(0))
  .


mydebug(A) :- ( debug_on -> printdebuglevel, mydebug_helper(A)
                          ; true
              )
            .

mydebug_helper(A)     :- var(A), !, write_term(v(A),numbervars(false)).
mydebug_helper(A)     :- atom(A),!, print(A)                          .
mydebug_helper([])    :-         !, print('[]')                       .  
mydebug_helper([A|B]) :-         !, print('['), mydebug_nostart([A|B]).     % Kludge '] for syntax highlighting 
mydebug_helper(A)     :-         !, write_term(A,numbervars(false))  .

mydebug_nostart([A|B])
 :- mydebug_helper(A)
  , ( var(B) -> print(','),write_term(v(B),numbervars(false)),print(']')
    ; B = [] -> print(']')
    ; print(','), mydebug_nostart(B)
    )
  .


dbbegin(NewLevel, Msg)
 :- debug_on
     -> mydebug(Msg)
      , ( ( retract(db_level(Level)), Level >= 0 )
           -> ( NewLevel is Level + 1
              , assertz(db_level(NewLevel))
              )
            ; ( print('Level error: '), print(level(Level)), print(', Recovering to zero.')
              , NewLevel is 0
              , assertz(db_level(NewLevel))
              )
        )
  ; true
  .

dbbegin(NewLevel)
 :- debug_on
     -> ( ( retract(db_level(Level)), Level >= 0 )
           -> NewLevel is Level + 1, assertz(db_level(NewLevel))
            ; NewLevel is 0        , assertz(db_level(NewLevel))
        )
  ; true
  .

dbsuccess(L) :- dbend(L,'Success').

dbfail(L) :- dbend(L,'Fail'), fail.

dbend(Current_level,Msg)
 :- debug_on, mydebug(Msg)
     -> ( retract(db_level(Level)), Level >= 0
           -> ( ( Current_level = Level -> true ; mydebug('ERROR: Recovering correct error level') )
              , NewLevel is Current_level - 1
              , assertz(db_level(NewLevel))
              )
            ; ( mydebug('ERROR: dbend(Level,Msg) placed incorrectly, recovering to level 0')
              , abort(db_level/1)
              , assertz(db_level(0))
              )
        )
  ; true
  .

dbend(Current_level)
 :- debug_on
     -> ( retract(db_level(Level)), Level >= 0
           -> ( ( Current_level = Level -> true ; mydebug('ERROR: Recovering correct error level') )
              , NewLevel is (Current_level - 1)
              , assertz(db_level(NewLevel))
              )
            ; ( print('ERROR: dbend(Level) placed incorrectly, recovering to level 0')
              , abort(db_level/1)
              , assertz(db_level(0))
              )
        )
  ; true
  .

%% prints '- ' for level =< 0 and an additional '- ' for each level > 0
printdebuglevel :- ( db_level(L) ; L=0 ) -> nl, printdebuglevel_help(L)
                 .

printdebuglevel_help(L)
 :- print('- ')
  , (L > 0) -> ( L1 is L - 1, printdebuglevel_help(L1) )
             ; true
  .

dbg(Msg, Operation)
 :- db_level(L), dbbegin(Level, Msg)
  , ( Operation, dbsuccess(Level)
    ; dbfail(Level)
    )
  .
