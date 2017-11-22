package pattern15_facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Author: Rivers
 * Date: 2017/11/23 05:53
 */
public class Database {

    private Database() {}

    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
