package pattern08_abstract_factory.factory;

/**
 * Author: Rivers
 * Date: 2017/11/19 08:53
 */
public abstract class Link extends Item {

    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
