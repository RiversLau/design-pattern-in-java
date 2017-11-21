package pattern13_visitor;

/**
 * Author: Rivers
 * Date: 2017/11/22 05:58
 */
public abstract class Visitor {

    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
