package task4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import task4.grammar.GrammarLexer;
import task4.grammar.GrammarParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by heat_wave on 6/9/16.
 */
public class ParserGenerator {

    private ExecutionMode mode;
    private String grammarName;

    public ParserGenerator(ExecutionMode mode) {
        this.mode = mode;
    }

    public void prepare(File grammarFile, String start) throws IOException {
        grammarName = grammarFile.getName().split("[.]")[0];
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(grammarFile));
        GrammarLexer lexer = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();
        GrammarVisitor visitor = new GrammarVisitor();
        ParseTree tree = parser.grandma();
        walker.walk(visitor, tree);
    }
}
