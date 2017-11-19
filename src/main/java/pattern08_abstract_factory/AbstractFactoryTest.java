package pattern08_abstract_factory;

import pattern08_abstract_factory.factory.Factory;
import pattern08_abstract_factory.factory.Link;
import pattern08_abstract_factory.factory.Page;
import pattern08_abstract_factory.factory.Tray;

/**
 * Author: Rivers
 * Date: 2017/11/19 09:57
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("pattern08_abstract_factory.listfactory.ListFactory");

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "RiversLau");
        page.add(trayNews);
        page.add(traySearch);
        page.output();

        factory = Factory.getFactory("pattern08_abstract_factory.tablefactory.TableFactory");

        people = factory.createLink("人民日报", "http://www.people.com.cn/");
        gmw = factory.createLink("光明日报", "http://www.gmw.cn");

        us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        excite = factory.createLink("Excite", "http://www.excite.com/");
        google = factory.createLink("Google", "http://www.google.com/");

        trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        traySearch = factory.createTray("搜索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        page = factory.createPage("TablePage", "RiversLau");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
