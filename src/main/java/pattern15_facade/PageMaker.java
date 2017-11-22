package pattern15_facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Author: Rivers
 * Date: 2017/11/23 06:03
 */
public class PageMaker {

    private static final String PREFIX = "/Users/Rivers/Develop/yoxiang/design-pattern-in-java/src/main/java/pattern15_facade/";

    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) throws IOException {
        Properties properties = Database.getProperties(PREFIX + "user_email");
        String username = properties.getProperty(mailaddr);

        HtmlWriter writer = new HtmlWriter(new FileWriter(PREFIX + filename));
        writer.title("Welcome to " + username + "'s page");
        writer.paragraph(username + "欢迎来到 " + username + " 的主页");
        writer.paragraph("等着你的邮件哟！");
        writer.mailto(mailaddr, username);
        writer.close();
        System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
    }
}
