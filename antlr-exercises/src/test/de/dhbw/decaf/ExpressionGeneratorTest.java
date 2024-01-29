package de.dhbw.decaf;

import de.dhbw.decaf.ast.*;
import de.dhbw.decaf.parser.*;
import org.antlr.v4.runtime.*;
import org.junit.jupiter.api.*;

public class ExpressionGeneratorTest {
    @Test
    public void binaryTest() {
        Expression binary = generateExpression("x + 3");
        Assertions.assertTrue(binary instanceof Binary);
        Assertions.assertTrue(((Binary) binary).left() instanceof Location);
        Assertions.assertTrue(((Binary) binary).right() instanceof IntConstant);
    }

    @Test
    public void locationTest() {
        Expression location = generateExpression("x");
        Assertions.assertTrue(location instanceof Location);
        Assertions.assertEquals("x", ((Location) location).name());
    }

    @Test
    public void methodCallTest() {
        Expression mCall = generateExpression("m(x,y)");
        Assertions.assertTrue(mCall instanceof FunctionCall);
        Assertions.assertEquals("m", ((FunctionCall) mCall).name());
        Assertions.assertEquals(2, ((FunctionCall) mCall).args().size());
    }

    @Test
    public void intConstantTest() {
        Expression intCons = generateExpression("3");
        Assertions.assertTrue(intCons instanceof IntConstant);
        Assertions.assertEquals(3, (int) ((IntConstant) intCons).value());
    }

    @Test
    public void boolConstantTest() {
        Expression boolCons = generateExpression("true");
        Assertions.assertTrue(boolCons instanceof BoolConstant);
        Assertions.assertTrue(((BoolConstant) boolCons).value());
    }

    private Expression generateExpression(String from) {
        CharStream input = CharStreams.fromString(from);
        DecafLexer lexer = new DecafLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DecafParser parser = new DecafParser(tokens);
        return new ExpressionGenerator().visit(parser.expr());
    }
}
