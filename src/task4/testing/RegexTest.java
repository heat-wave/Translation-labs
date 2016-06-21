package task4.testing;

import org.StructureGraphic.v1.DSutils;
import task4.testproduction.RegexParser;
import task4.utils.Tree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 * Created by heat_wave on 6/9/16.
 */
public class RegexTest extends BaseTest {
    public RegexTest(String outputDir) {
        super(outputDir);
        this.sourceFile = "/home/heat_wave/IdeaProjects/ANTLR/src/task4/testing/Regex.in";
        this.startingRule = "regexp";
    }

    @Override
    void useGeneratedFiles() {
        try {
            Tree tree = new RegexParser().parse(new FileInputStream(
                    new File("/home/heat_wave/IdeaProjects/ANTLR/src/task4/testing/regexInput.in")), "regexp");
            DSutils.show(tree, 120, 120);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}