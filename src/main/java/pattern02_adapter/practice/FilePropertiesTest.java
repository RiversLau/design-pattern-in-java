package pattern02_adapter.practice;

import java.io.IOException;

/**
 * Author: Rivers
 * Date: 2017/11/18 06:58
 */
public class FilePropertiesTest {

    private static final String PREFIX = "/Users/Rivers/Develop/yoxiang/design-pattern-in-java/src/main/java/pattern02_adapter/practice/";

    public static void main(String[] args) {
        PropertyHelper helper = new FileProperties();
        try {
            helper.readFromFile(PREFIX + "system.properties");
            helper.setValue("hello", "adapter");
            helper.setValue("big", "pig");
            helper.setValue("running", "now");
            helper.writeToFile(PREFIX + "out.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
