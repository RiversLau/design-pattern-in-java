package prototype_pattern;

/**
 * Author: Rivers
 * Date: 2017/11/18 16:19
 */
public class UnderlinePen extends Product {

    private char ch;
    public UnderlinePen(char ach) {
        this.ch = ach;
    }

    @Override
    public void use(String str) {
        str = "\"" + str + "\"";
        System.out.println(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
