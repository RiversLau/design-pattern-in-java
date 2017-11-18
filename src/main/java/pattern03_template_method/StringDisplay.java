package pattern03_template_method;

/**
 * Author: Rivers
 * Date: 2017/11/18 10:37
 */
public class StringDisplay extends AbstractDisplay {

    private String str;
    private int width;
    public StringDisplay(String aStr) {
        this.str = aStr;
        this.width = aStr.getBytes().length;
    }

    @Override
    public void open() {
        printline();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printline();
    }

    public void printline() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
