package de.dhbw.decaf;

import de.dhbw.decaf.ast.Statement;
import de.dhbw.decaf.parser.*;

public class StatementGenerator extends DecafBaseVisitor<Statement> {
    @Override
    public Statement visitAssign(DecafParser.AssignContext ctx) {
        throw new RuntimeException("TODO");
    }

    @Override
    public Statement visitIf(DecafParser.IfContext ctx) {
        throw new RuntimeException("TODO");
    }

    @Override
    public Statement visitWhile(DecafParser.WhileContext ctx) {
        throw new RuntimeException("TODO");
    }

    @Override
    public Statement visitReturn(DecafParser.ReturnContext ctx) {
        throw new RuntimeException("TODO");
    }

    @Override
    public Statement visitReturnVoid(DecafParser.ReturnVoidContext ctx) {
        throw new RuntimeException("TODO");
    }

    @Override
    public Statement visitBreak(DecafParser.BreakContext ctx) {
        throw new RuntimeException("TODO");
    }

    @Override
    public Statement visitContinue(DecafParser.ContinueContext ctx) {
        throw new RuntimeException("TODO");
    }
}
