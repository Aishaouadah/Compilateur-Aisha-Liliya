grammar Langage;

@header{
package antlr;
}

//General structure of code of the tiny language
code : 'compil' Prg_name Parenthese_ouv Parenthese_ferm Accolade_ouv declarations 'start' statements Accolade_ferm  #Program
			; 

//declaration part
listId : ID Vergule listId #ListIdentifiers
		|ID 			   #Identifers
		;   
declarations : declaration declarations #Decs1
			| declaration				#Decs2
				; 
				
type : 'intCompil'|'floatCompil'|'stringCompil'    #type
		; 
declaration : (type listId PointVergule)+ #Dec
			; 


//statment part
statements : (statement)+;

statement : (assignment|do_while|if_then_else|print|scan);

//defining diffrent statement
assignment: ID Affect ID PointVergule   #assig1
            | ID Affect STRING PointVergule #assig2
            | ID Affect INT PointVergule   #assig3
            | ID Affect FLOAT PointVergule #assig4
            | ID Affect arithmitic_expression PointVergule #assig5
            ;

logic_expression: ID LOGIC_OPERATORS ID         #le1
                | ID LOGIC_OPERATORS STRING     #le2
                | ID LOGIC_OPERATORS FLOAT      #le3
                | ID LOGIC_OPERATORS INT        #le4
                | STRING LOGIC_OPERATORS ID     #le6
                | FLOAT LOGIC_OPERATORS ID      #le7
                | INT LOGIC_OPERATORS ID        #le8
                |INT LOGIC_OPERATORS INT      #le9
                |STRING LOGIC_OPERATORS STRING #le10
                |FLOAT LOGIC_OPERATORS FLOAT     #le11
                ;

//arithmitic expression
arithmitic_expression: arithmitic_expression ARITHMITIC_OPERATORS arithmitic_expression #ae1
					| ID 																#ae2
					| INT																#ae3
					| FLOAT																#ae4
					;



// do while loop
do_while: Do Accolade_ouv statements Accolade_ferm While Parenthese_ouv logic_expression Parenthese_ferm;

// if_then_else
if_then_else : si  sinon?;
si : IF Parenthese_ouv logic_expression Parenthese_ferm Then Accolade_ouv statements Accolade_ferm ;
sinon : ELSE Accolade_ouv statements Accolade_ferm;

// Instruction d'ecriture
print: PrintCompil Parenthese_ouv listId  Parenthese_ferm PointVergule #printcheck1
       | PrintCompil Parenthese_ouv STRING  Parenthese_ferm PointVergule #printcheck2
                   ;

//Instruction de lecture
scan : Scan Parenthese_ouv  listId Parenthese_ferm PointVergule  #scan2
                ;


LOGIC_OPERATORS : (Sup|SupE|Inf|InfE|Equal|NEqual);
ARITHMITIC_OPERATORS : (Plus|Minus|Multiply|Division);

Prg_name :UPPERCASE (UPPERCASE|LOWERCASE|Number|'_')*;

IF : 'if';
ELSE : 'else';
Then : 'then';
PrintCompil : 'printCompil';
Scan : 'scanCompil';
Do : 'do';
While :'while';
ID : (UPPERCASE|LOWERCASE)(UPPERCASE|LOWERCASE|Number|'_')*;


Plus : '+';
Minus: '-';
Multiply:'*';
Division : '/';
Sup : '>';
SupE :'>=';
Inf:'<';
InfE :'<=';
Equal :'==';
NEqual : '!=';
Affect : '=';
Parenthese_ouv :'(';
Parenthese_ferm :')';
Accolade_ouv : '{';
Accolade_ferm : '}';
PointVergule : ';';
Vergule : ',';

STRING : '"' ~('\r' | '\n' | '"')* '"' ;
INT: (Plus|Minus)?(Number)+;
FLOAT: (Plus|Minus)?(Number)+'.'(Number)+;

Number : [0-9];
LOWERCASE  : [a-z] ;
UPPERCASE  : [A-Z] ;

//Comments
Comment: '/*' .*? '*/' -> skip;
Line_comment : '//' ~[\r\n]* -> skip;
Ws : [ \r\n\t] + -> skip ;
