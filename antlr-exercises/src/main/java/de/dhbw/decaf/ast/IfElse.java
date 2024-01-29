package de.dhbw.decaf.ast;

public record IfElse(Expression cond, Block ifBlock, Block elseBlock) implements Statement {
}
