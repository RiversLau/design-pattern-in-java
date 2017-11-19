package pattern08_abstract_factory.factory;

import java.util.ArrayList;

/**
 * Author: Rivers
 * Date: 2017/11/19 08:56
 */
public abstract class Tray extends Item {

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
