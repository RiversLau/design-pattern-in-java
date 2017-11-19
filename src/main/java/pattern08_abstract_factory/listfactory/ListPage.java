package pattern08_abstract_factory.listfactory;

import pattern08_abstract_factory.factory.Item;
import pattern08_abstract_factory.factory.Page;

import java.util.Iterator;

/**
 * Author: Rivers
 * Date: 2017/11/19 09:16
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String buildHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head>");
        builder.append("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\">");
        builder.append("<title>" + title + "</title></head>");
        builder.append("<body>\n");
        builder.append("<h1>" + title + "</h1>");
        builder.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            builder.append(item.buildHtml());
        }
        builder.append("</ul>\n");
        builder.append("<hr><address>" + author + "</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
