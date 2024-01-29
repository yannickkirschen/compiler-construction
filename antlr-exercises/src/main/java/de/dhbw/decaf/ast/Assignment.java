package de.dhbw.decaf.ast;

public record Assignment(Location loc, Expression value) implements Statement {
}
