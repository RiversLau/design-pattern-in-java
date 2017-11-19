package pattern09_bridge;

/**
 * Author: Rivers
 * Date: 2017/11/19 13:26
 */
public class BridgeTest {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello World"));
        Display d2 = new Display(new StringDisplayImpl("Hello Design Pattern"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hell Count"));

        d1.display();
        d2.display();
        d3.multiDisplay(3);
    }
}
