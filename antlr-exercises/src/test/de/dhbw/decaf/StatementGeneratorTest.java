package de.dhbw.decaf;

import de.dhbw.decaf.ast.*;
import de.dhbw.decaf.parser.*;
import org.antlr.v4.runtime.*;
import org.junit.jupiter.api.*;

public class StatementGeneratorTest {
    @Test
    public void whileTest() {
        Statement whileStmt = generateStatement("while(true){}");
        Assertions.assertTrue(whileStmt instanceof While);
        Assertions.assertEquals(0, ((While) whileStmt).block().stmts().size());
    }

    private Statement generateStatement(String from) {
        CharStream input = CharStreams.fromString(from);
        DecafLexer lexer = new DecafLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DecafParser parser = new DecafParser(tokens);
        return new StatementGenerator().visit(parser.stmt());
    }
}
