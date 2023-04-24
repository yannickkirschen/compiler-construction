/*
 * Exercise 2 c)
 *
 * Create a new G4 grammar called Expression. This should represent a language for simple mathematical expressions,
 * consisting of point and line arithmetic with normal numbers, as well as parentheses.
 */
grammar Expression;

start: expr;

expr: '(' expr ')'
    | expr Pow expr
    | expr Mul expr
    | expr Div expr
    | expr Add expr
    | expr Sub expr
    | Number;

Pow: '^';
Mul: '*';
Div: '/';
Add: '+' ;
Sub: '-';
Number: [0-9]+;
WS: [ ]+ -> skip ;
