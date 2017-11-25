package pattern20_flyweight;

/**
 * Author: Rivers
 * Date: 2017/11/25 12:01
 */
public class BigString {

    private BigChar[] bigchars;

    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getinstance();
        for (int i = 0; i < string.length(); i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
