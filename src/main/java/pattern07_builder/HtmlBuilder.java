package pattern07_builder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: Rivers
 * Date: 2017/11/18 17:36
 */
public class HtmlBuilder extends Builder {

    private static final String PREFIX = "/Users/Rivers/Develop/yoxiang/design-pattern-in-java/src/main/java/pattern07_builder/";

    private String fileName;
    private PrintWriter printWriter;

    @Override
    public void buildTitle(String title) {
        fileName = title + ".html";
        try {
            printWriter = new PrintWriter(new FileWriter(new File(PREFIX + fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.println("<html><head>");
        printWriter.println("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\">");
        printWriter.println("<title>" + title + "</title></head>");
        printWriter.println("<h1>" + title + "</h1>");
    }

    @Override
    public void buildString(String str) {
        printWriter.println("<p>" + str + "</p>");
    }

    @Override
    public void buildItems(String[] items) {
        printWriter.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            printWriter.println("<li>" + items[i] + "</li>");
        }
        printWriter.println("</ul>");
    }

    @Override
    public void buildDone() {
        printWriter.println("</body></html>");
        printWriter.close();
    }

    public String getResult() {
        return fileName;
    }
}
