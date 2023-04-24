package de.dhbw.antlr;

import de.dhbw.antlr.parser.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("100*(2+5)-2^2");
        ExpressionLexer lexer = new ExpressionLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(tokens);
        ExpressionParser.StartContext tree = parser.start();

        double result = new ExpressionCalculator().calculate(tree.expr()); // initiate walk of tree with listener
        System.out.println(result);
    }
}
