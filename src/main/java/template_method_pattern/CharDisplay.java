package template_method_pattern;

/**
 * Author: Rivers
 * Date: 2017/11/18 10:35
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;
    public CharDisplay(char achar) {
        this.ch = achar;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }
}
