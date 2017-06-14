package task4.testing;

import org.StructureGraphic.v1.DSutils;
import task4.testproduction.regex.RegexParser;
import task4.utils.Tree;

import java.io.*;
import java.text.ParseException;

/**
 * Created by heat_wave on 6/9/16.
 */
public class RegexTest extends BaseTest {
    public static void main(String[] args) {
        new RegexTest("/home/heat_wave/IdeaProjects/ANTLR/src/task4/testproduction/regex").useGeneratedFiles();
    }

    public RegexTest(String outputDir) {
        super(outputDir);
        this.sourceFile = "/home/heat_wave/IdeaProjects/ANTLR/src/task4/testing/Regex.in";
        this.startingRule = "regexp";
    }

    @Override
    void useGeneratedFiles() {
        try {
            Tree tree = new RegexParser().parse(new PushbackInputStream(new FileInputStream(
                    new File("/home/heat_wave/IdeaProjects/ANTLR/src/task4/testing/regexInput.in")), 1024), "regexp");
            DSutils.show(tree, 120, 120);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}