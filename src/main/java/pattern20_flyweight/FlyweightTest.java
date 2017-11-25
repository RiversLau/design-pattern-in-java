package pattern20_flyweight;

/**
 * Author: Rivers
 * Date: 2017/11/25 12:03
 */
public class FlyweightTest {

    public static void main(String[] args) {
        String telePhone = "18122188583";
        BigString bigString = new BigString(telePhone);
        bigString.print();
    }
}
