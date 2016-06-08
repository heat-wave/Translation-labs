package task4.testing;

import java.io.File;

/**
 * Created by heat_wave on 6/9/16.
 */
public class ObfuscationTest extends BaseTest {
    public ObfuscationTest(String outputDir) {
        super(outputDir);
        this.sourceFile = "/home/heat_wave/IdeaProjects/ANTLR/src/task4/test/regex.in";
        this.startingRule = "compilationUnit";
    }
}