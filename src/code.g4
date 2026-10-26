grammar code;

/* ================= PARSER ================= */

program
    : START line* END EOF
    ;

line
    : statement
    | functionDef
    ;

statement
    : assignStmt
    | makeStmt
    | printStmt
    | repeatStmt
    | ifStmt
    | forStmt
    | funcCall
    ;

/* ---------- Statements ---------- */

assignStmt
    : ID ASSIGN expression
    ;

makeStmt
    : MAKE COLON ID COLON expression
    ;

printStmt
    : PRINT LBRACK expression RBRACK
    ;

repeatStmt
    : REPEAT expression block
    ;

ifStmt
    : IF comparison block
    ;

forStmt
    : FOR LBRACK ID expression expression expression RBRACK block
    ;

/* ---------- Function Definition ---------- */

functionDef
    : BEGIN ID LPAREN paramList? RPAREN line* FINISH
    ;

paramList
    : ID (COMMA ID)*
    ;

/* ---------- Function Call ---------- */

funcCall
    : ID LPAREN argList? RPAREN
    | SIN LPAREN expression RPAREN
    | COS LPAREN expression RPAREN
    | SQRT LPAREN expression RPAREN
    | MAX LPAREN expression COMMA expression RPAREN
    | MIN LPAREN expression COMMA expression RPAREN
    | RANDOM LPAREN? RPAREN
    ;

argList
    : expression (COMMA expression)*
    ;

/* ---------- Block ---------- */

block
    : LBRACK statement* RBRACK
    ;

/* ---------- Comparison ---------- */

comparison
    : expression compOp expression
    ;

compOp
    : LT | GT | EQ | LE | GE | NEQ
    ;

/* ---------- Expressions ---------- */

expression
    : expression ADD term
    | expression SUB term
    | term
    ;

term
    : term MUL factor
    | term DIV factor
    | factor
    ;

factor
    : LPAREN expression RPAREN
    | funcCall
    | ID
    | NUMBER
    | STRING
    ;

/* ================= LEXER ================= */

START   : 'Start';
END     : 'End';

BEGIN   : 'Begin';
FINISH  : 'Finish';

MAKE    : 'make';
PRINT   : 'print';
REPEAT  : 'repeat';
IF      : 'if';
FOR     : 'for';

ASSIGN  : ':=';

/* comparison operators */
EQ  : '=';
NEQ : '=!';
LT  : '<';
GT  : '>';
LE  : '<=';
GE  : '>=';

/* arithmetic operators */
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

/* built-in functions */
SIN   : 'sin';
COS   : 'cos';
SQRT  : 'sqrt';
MAX   : 'max';
MIN   : 'min';
RANDOM: 'random';

/* symbols */
LPAREN  : '(';
RPAREN  : ')';
LBRACK  : '[';
RBRACK  : ']';
COMMA   : ',';
COLON   : ':';

COMMENT
    : ';' ~[\r\n]* -> skip
    ;

STRING
    : '"' (~["\r\n])* '"'
    | '“' (~[”\r\n])* '”'
    ;

NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
