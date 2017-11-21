package pattern13_visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Rivers
 * Date: 2017/11/22 06:09
 */
public class Directory extends Entry {

    private String name;
    public List dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() {
        return dir.iterator();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        Iterator it = dir.iterator();
        int sum = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            sum += entry.getSize();
        }
        return sum;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
