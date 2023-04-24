package de.dhbw.antlr;

import de.dhbw.antlr.parser.ExpressionParser;

public class ExpressionCalculator {
    public double calculate(ExpressionParser.ExprContext expr) {
        if (expr.Pow() != null) {
            return Math.pow(this.calculate(expr.expr(0)), this.calculate(expr.expr(1)));
        } else if (expr.Mul() != null) {
            return this.calculate(expr.expr(0)) * this.calculate(expr.expr(1));
        } else if (expr.Div() != null) {
            return this.calculate(expr.expr(0)) / this.calculate(expr.expr(1));
        } else if (expr.Add() != null) {
            return this.calculate(expr.expr(0)) + this.calculate(expr.expr(1));
        } else if (expr.Sub() != null) {
            return this.calculate(expr.expr(0)) - this.calculate(expr.expr(1));
        } else if (expr.Number() != null) {
            return Double.parseDouble(expr.Number().toString());
        }

        return this.calculate(expr.expr(0));
    }
}
