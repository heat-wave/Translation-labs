package task4.testing;

import org.StructureGraphic.v1.DSutils;
import task4.testproduction.Java2Parser;
import task4.testproduction.RegexParser;
import task4.utils.Tree;

import java.io.*;
import java.text.ParseException;

/**
 * Created by heat_wave on 6/9/16.
 */
public class ObfuscationTest extends BaseTest {

    public static void main(String[] args) {
        new ObfuscationTest("/home/heat_wave/IdeaProjects/ANTLR/src/task4/testproduction/").useGeneratedFiles();
    }

    public ObfuscationTest(String outputDir) {
        super(outputDir);
        this.sourceFile = "/home/heat_wave/IdeaProjects/ANTLR/src/task4/testing/Java2.in";
        this.startingRule = "compilationUnit";
    }

    @Override
    void useGeneratedFiles() {
        try {
            new Java2Parser().parse(new PushbackInputStream(new FileInputStream(
                    new File("/home/heat_wave/IdeaProjects/ANTLR/src/task4/testing/SimpleCode.java")), 1024));
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}