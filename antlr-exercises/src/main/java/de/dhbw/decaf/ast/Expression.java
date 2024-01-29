package de.dhbw.decaf.ast;

public sealed interface Expression extends Node permits Binary, IntConstant, BoolConstant, Location, FunctionCall {
}
