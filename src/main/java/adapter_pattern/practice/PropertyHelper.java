package adapter_pattern.practice;

import java.io.IOException;

/**
 * Author: Rivers
 * Date: 2017/11/18 06:41
 */
public interface PropertyHelper {

    void readFromFile(String fileName) throws IOException;

    void writeToFile(String fileName) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
