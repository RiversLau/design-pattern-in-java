package pattern13_visitor;

import java.util.Iterator;

/**
 * Author: Rivers
 * Date: 2017/11/22 06:25
 */
public class ListVisitor extends Visitor {

    private String currentDir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String savingDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = savingDir;
    }
}
