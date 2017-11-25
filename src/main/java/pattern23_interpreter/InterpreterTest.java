package pattern23_interpreter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author: Rivers
 * Date: 2017/11/25 17:10
 */
public class InterpreterTest {

    private static final String PREFIX = "/Users/Rivers/Develop/yoxiang/design-pattern-in-java/src/main/java/pattern23_interpreter/";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PREFIX + "program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
