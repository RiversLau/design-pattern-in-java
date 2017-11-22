package pattern15_facade;

import java.io.IOException;
import java.io.Writer;

/**
 * Author: Rivers
 * Date: 2017/11/23 05:58
 */
public class HtmlWriter {

    private Writer writer;
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\">");
        writer.write("<title>" + title + "</title>");
        writer.write("<body>");
        writer.write("<h1>" + title + "</h1>");
    }

    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
    }

    public void link(String href, String caption) throws IOException {
        writer.write("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailaddr, String username) throws IOException {
        link(mailaddr, username);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
