package pattern12_decorator;

/**
 * Author: Rivers
 * Date: 2017/11/21 21:40
 */
public class StringDisplay extends Display {

    private String str;
    public StringDisplay(String aStr) {
        this.str = aStr;
    }

    @Override
    public int getColumns() {
        return str.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return str;
        }
        return null;
    }
}
