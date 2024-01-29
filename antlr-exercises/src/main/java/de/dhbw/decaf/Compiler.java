package de.dhbw.decaf;

import de.dhbw.decaf.ast.Program;
import de.dhbw.decaf.parser.*;
import org.antlr.v4.runtime.*;

public class Compiler {
    public static Program generateAST(String fromSource) {
        CharStream input = CharStreams.fromString(fromSource);
        DecafLexer lexer = new DecafLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DecafParser parser = new DecafParser(tokens);
        DecafParser.ProgramContext tree = parser.program();
        return ASTGenerator.generateAST(tree);
    }
}
