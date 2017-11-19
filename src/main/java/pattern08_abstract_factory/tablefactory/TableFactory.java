package pattern08_abstract_factory.tablefactory;

import pattern08_abstract_factory.factory.Factory;
import pattern08_abstract_factory.factory.Link;
import pattern08_abstract_factory.factory.Page;
import pattern08_abstract_factory.factory.Tray;

/**
 * Author: Rivers
 * Date: 2017/11/19 10:06
 */
public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
