package de.dhbw.decaf;

import de.dhbw.decaf.ast.Program;
import org.junit.jupiter.api.*;

public class CompilerTest {
    @Test
    public void generateASTTest() {
        String inputString = """
            def int add(int x, int y) {
                return x + y;
            }
            def int main() {
                int a;
                a = 3;
                return add(a, 2);
            }""";
        Program ast = Compiler.generateAST(inputString);
        Assertions.assertEquals(2, ast.methods().size());
    }
}
