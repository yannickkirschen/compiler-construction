package de.dhbw.decaf;

import de.dhbw.decaf.ast.*;
import de.dhbw.decaf.parser.DecafParser;

import java.util.*;

public class ASTGenerator {
    public static Program generateAST(DecafParser.ProgramContext parseTree) {
        List<Variable> variables = new ArrayList<>();
        for (DecafParser.VarContext varCtx : parseTree.var()) {
            variables.add(generateVariable(varCtx));
        }
        List<de.dhbw.decaf.ast.Function> functions = new ArrayList<>();
        for (DecafParser.FuncContext funcCtx : parseTree.func()) {
            functions.add(generateFunc(funcCtx));
        }
        return new Program(variables, functions);
    }

    public static Variable generateVariable(DecafParser.VarContext ctx) {
        return new Variable(ctx.id().getText(), getType(ctx.type()));
    }

    public static Variable generateVariable(DecafParser.ParamContext ctx) {
        return new Variable(ctx.id().getText(), getType(ctx.type()));
    }

    public static Function generateFunc(DecafParser.FuncContext ctx) {
        throw new RuntimeException("TODO");
    }

    public static Type getType(DecafParser.TypeContext ctx) {
        if (ctx.INT() != null)
            return Type.INT;
        if (ctx.BOOL() != null)
            return Type.BOOL;
        if (ctx.VOID() != null)
            return Type.VOID;
        throw new RuntimeException();
    }
}
