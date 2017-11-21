package pattern13_visitor;

import java.util.Iterator;

/**
 * Author: Rivers
 * Date: 2017/11/22 06:00
 */
public abstract class Entry implements Element {

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    public Iterator iterator() {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
