package pattern13_visitor;

/**
 * Author: Rivers
 * Date: 2017/11/22 05:59
 */
public interface Element {

    void accept(Visitor v);
}
