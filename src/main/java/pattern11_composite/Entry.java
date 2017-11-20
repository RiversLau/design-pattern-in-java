package pattern11_composite;

/**
 * Author: Rivers
 * Date: 2017/11/21 05:57
 */
public abstract class Entry {

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
