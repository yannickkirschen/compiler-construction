package de.dhbw.decaf.ast;

public record Binary(Expression left, Operator op, Expression right) implements Expression {
}
