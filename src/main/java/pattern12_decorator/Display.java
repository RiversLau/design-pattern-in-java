package pattern12_decorator;

/**
 * Author: Rivers
 * Date: 2017/11/21 21:38
 */
public abstract class Display {

    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
