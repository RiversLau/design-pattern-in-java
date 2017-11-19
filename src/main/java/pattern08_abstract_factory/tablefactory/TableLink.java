package pattern08_abstract_factory.tablefactory;

import pattern08_abstract_factory.factory.Link;

/**
 * Author: Rivers
 * Date: 2017/11/19 10:06
 */
public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String buildHtml() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
