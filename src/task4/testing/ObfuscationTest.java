package task4.testing;

import task4.testproduction.java.Java2Parser;

import java.io.*;
import java.text.ParseException;

/**
 * Created by heat_wave on 6/9/16.
 */
public class ObfuscationTest extends BaseTest {

    public static void main(String[] args) {
        new ObfuscationTest("/home/heat_wave/IdeaProjects/ANTLR/src/task4/testproduction/java").useGeneratedFiles();
    }

    public ObfuscationTest(String outputDir) {
        super(outputDir);
        this.sourceFile = "/home/heat_wave/IdeaProjects/ANTLR/src/task4/testing/Java2.in";
        this.startingRule = "compilationUnit";
    }

    @Override
    void useGeneratedFiles() {
        try {
            String res = new Java2Parser().parse(new PushbackInputStream(new FileInputStream(
                    new File("/home/heat_wave/IdeaProjects/ANTLR/src/task4/testing/SimpleCode.java")), 1024));
            System.out.println(res);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}