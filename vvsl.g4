grammar vvsl;

p:exp? #pgrm;

exp : INT #exp_int
    | BOOL #exp_bool
    | ID #exp_id
    | UNNOT exp #exp_un_not
    | exp UNMIN #exp_un_min
    | exp UNPLUS #exp_un_plus
    | exp op = (DIV|MUL|MOD|POW|ADD|SUB) exp #exp_ari
    | exp op = ('=='|'!=') exp #exp_bin_bool
    | exp op = (LT|GT|LE|GE) exp #exp_comp
    | exp op = (AND|OR) exp  #exp_andor
    | LPAREN exp RPAREN #exp_paren
    ;



/********* LEXER RULES **********/

INT : '0' | [1-9][0-9]*;
BOOL : 'true' | 'false';

PRINT : 'print';

UNNOT : '!' ;
UNPLUS : '++';
UNMIN : '--';
DIV : '/';
MOD : '%';
MUL: '*';
ADD: '+';
SUB: '-';
POW : '^';
LT : '<';
GT : '>';
LE : '<=';
GE : '>=';
AND : '&&';
OR : '||';


ASSIGNMENT : '=' ;

COMMA : ',';
SEMICOLONE : ';';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRAKET : '[';
RBRAKET : ']';

WS : [ \t\r\n] -> skip;
ID : [a-zA-Z]+[a-zA-Z0-9]*;
