package pattern08_abstract_factory.listfactory;

import pattern08_abstract_factory.factory.Factory;
import pattern08_abstract_factory.factory.Link;
import pattern08_abstract_factory.factory.Page;
import pattern08_abstract_factory.factory.Tray;

/**
 * Author: Rivers
 * Date: 2017/11/19 09:10
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
