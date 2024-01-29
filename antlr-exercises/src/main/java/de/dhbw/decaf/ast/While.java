package de.dhbw.decaf.ast;

public record While(Expression cond, Block block) implements Statement {
}
