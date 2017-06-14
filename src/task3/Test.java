package task3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(args[0]), StandardCharsets.UTF_8));
        ANTLRInputStream inputStream = new ANTLRInputStream(in);
        JavaLexer lexer = new JavaLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        ObfuscatedJavaListener obfuscator = new ObfuscatedJavaListener(tokens, parser.varCount);
        walker.walk(obfuscator, tree);

        for (int id = 0; id < 10; id++) {
            id = id;
        }


        System.out.println(obfuscator.rewriter.getText());
    }
}
