package pattern06_prototype;

/**
 * Author: Rivers
 * Date: 2017/11/18 16:25
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("first", new UnderlinePen('='));
        manager.register("second", new MessageBox('~'));

        Product p1 = manager.create("first");
        p1.use("Hello World");

        Product p2 = manager.create("second");
        p2.use("Hello World");
    }
}
