package pattern03_template_method;

/**
 * Author: Rivers
 * Date: 2017/11/18 10:33
 */
public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
