package pattern12_decorator;

/**
 * Author: Rivers
 * Date: 2017/11/21 21:43
 */
public class SideBorder extends Border {

    private char ch;
    public SideBorder(Display display, char ach) {
        super(display);
        this.ch = ach;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return ch + display.getRowText(row) + ch;
    }
}
