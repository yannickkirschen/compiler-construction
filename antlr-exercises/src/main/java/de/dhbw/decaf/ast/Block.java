package de.dhbw.decaf.ast;

import java.util.List;

public record Block(List<Variable> vars, List<Statement> stmts) implements Node {
}
