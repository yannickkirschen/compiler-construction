package de.dhbw.decaf.ast;

public sealed interface Statement extends Node permits Assignment, VoidFunctionCall, IfElse, While, Return, ReturnVoid, Break, Continue {
}
