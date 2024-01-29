package de.dhbw.decaf;

import de.dhbw.decaf.ast.*;
import de.dhbw.decaf.parser.*;

public class ExpressionGenerator extends DecafBaseVisitor<Expression> {
    public static Expression generateConstant(DecafParser.LiteralContext ctx) {
        if (ctx.number() != null)
            return new IntConstant(Integer.valueOf(ctx.number().getText()));
        if (ctx.boolean_() != null)
            return new BoolConstant(Boolean.valueOf(ctx.boolean_().getText()));
        throw new RuntimeException();
    }

    public static Operator generateOperator(DecafParser.BinaryOpContext ctx) {
        if (ctx.ADD() != null) return Operator.ADD;
        if (ctx.SUB() != null) return Operator.SUB;
        if (ctx.MUL() != null) return Operator.MUL;
        throw new RuntimeException();
    }

    public static Binary generateBinary(DecafParser.BinaryOperationContext ctx) {
        ExpressionGenerator eGen = new ExpressionGenerator();
        return new Binary(eGen.visit(ctx.expr().get(0))
            , generateOperator(ctx.binaryOp())
            , eGen.visit(ctx.expr().get(1)));
    }

    public static Location generateLocation(DecafParser.LocContext loc) {
        return new Location(loc.id().getText());
    }

    @Override
    public Expression visitBinaryOperation(DecafParser.BinaryOperationContext ctx) {
        return generateBinary(ctx);
    }

    @Override
    public Expression visitFunCallExpression(DecafParser.FunCallExpressionContext ctx) {
        throw new RuntimeException("TODO");
    }

    @Override
    public Expression visitConstant(DecafParser.ConstantContext ctx) {
        return generateConstant(ctx.literal());
    }

    @Override
    public Expression visitExpression(DecafParser.ExpressionContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Expression visitLocation(DecafParser.LocationContext ctx) {
        return generateLocation(ctx.loc());
    }
}
