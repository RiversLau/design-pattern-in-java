package prototype_pattern;

/**
 * Author: Rivers
 * Date: 2017/11/18 16:28
 */
public class MessageBox implements Product {

    private char ch;
    public MessageBox(char ach) {
        this.ch = ach;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(ch);
        }

        System.out.println("");
        System.out.println(ch + " " + str + " " + ch);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(ch);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}