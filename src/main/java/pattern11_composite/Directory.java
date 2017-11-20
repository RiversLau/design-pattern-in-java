package pattern11_composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Rivers
 * Date: 2017/11/21 06:01
 */
public class Directory extends Entry {

    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        Iterator it = directory.iterator();
        int sum = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            sum += entry.getSize();
        }
        return sum;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
