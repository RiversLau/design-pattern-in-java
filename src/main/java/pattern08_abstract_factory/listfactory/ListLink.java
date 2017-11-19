package pattern08_abstract_factory.listfactory;

import pattern08_abstract_factory.factory.Link;

/**
 * Author: Rivers
 * Date: 2017/11/19 09:11
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String buildHtml() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
