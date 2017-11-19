package pattern08_abstract_factory.factory;

/**
 * Author: Rivers
 * Date: 2017/11/19 08:52
 */
public abstract class Item {

    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String buildHtml();
}
