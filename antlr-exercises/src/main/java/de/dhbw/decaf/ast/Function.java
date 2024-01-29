package de.dhbw.decaf.ast;

import java.util.List;

public record Function(Type type, String name, List<Variable> params, Block block) implements Node {
}
