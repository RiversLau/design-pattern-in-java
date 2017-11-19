package pattern08_abstract_factory.tablefactory;

import pattern08_abstract_factory.factory.Item;
import pattern08_abstract_factory.factory.Tray;

import java.util.Iterator;

/**
 * Author: Rivers
 * Date: 2017/11/19 10:08
 */
public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String buildHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<td>");
        builder.append("<table width=\"100%\" border=\"1\">");
        builder.append("<tr>");
        builder.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\">");
        builder.append("<b>");
        builder.append(caption);
        builder.append("</b>");
        builder.append("</td>");
        builder.append("</tr>\n");
        builder.append("<tr>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            builder.append(item.buildHtml());
        }
        builder.append("</tr>");
        builder.append("</table>");
        builder.append("</td>");
        return builder.toString();
    }
}
