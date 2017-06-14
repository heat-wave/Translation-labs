package task4.testing;

import task4.ExecutionMode;
import task4.ParserGenerator;

import java.io.File;
import java.io.IOException;

/**
 * Created by heat_wave on 6/9/16.
 */
public abstract class BaseTest {
    String sourceFile;
    String startingRule;
    File outputDir;

    BaseTest(String outputDir) {
        this.outputDir = new File(outputDir);
        this.outputDir.getParentFile().mkdirs();
        //useGeneratedFiles();
    }

    public void run() {
        ParserGenerator generator = new ParserGenerator(ExecutionMode.DEBUG, outputDir);
        try {
            generator.prepare(new File(sourceFile), startingRule);
            generator.generateFiles();
        } catch (IOException e) {
            System.err.println("Test failed with: " + e.getMessage());
            e.printStackTrace();
        }
    }

    abstract void useGeneratedFiles();
}
