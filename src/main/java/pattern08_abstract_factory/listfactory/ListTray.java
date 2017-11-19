package pattern08_abstract_factory.listfactory;

import pattern08_abstract_factory.factory.Item;
import pattern08_abstract_factory.factory.Tray;

import java.util.Iterator;

/**
 * Author: Rivers
 * Date: 2017/11/19 09:12
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String buildHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption + "\n");
        builder.append("<ul>\n");

        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            builder.append(item.buildHtml());
        }
        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
