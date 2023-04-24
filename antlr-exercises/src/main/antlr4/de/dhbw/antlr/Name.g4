/*
 * Exercise 2 a) and b)
 *
 * The grammar from Task 2.1 is currently not able to read uppercase letters. Extend the grammar so that names must
 * always begin with a capital letter. Then extend the grammar with the rule namen, which reads in a list of names
 * separated by line breaks.
 */

grammar Name;

names: (name NEWLINE)* name;
name: Word ',' Word; // surname, forename

Word: [A-Z][a-z]+;
NEWLINE: [\r\n];
WS: [ ]+ -> skip ; // ignore whitespace
