package pattern08_abstract_factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Author: Rivers
 * Date: 2017/11/19 08:57
 */
public abstract class Page {

    private static final String PREFIX = "/Users/Rivers/Develop/yoxiang/design-pattern-in-java/src/main/java/pattern08_abstract_factory/";

    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String fileName = title + ".html";
        try {
            Writer writer = new FileWriter(PREFIX + fileName);
            writer.write(this.buildHtml());
            writer.close();
            System.out.println(fileName + "构建完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String buildHtml();
}
