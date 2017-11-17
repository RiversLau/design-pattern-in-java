package adapter_pattern.extend_adapter;

/**
 * Author: Rivers
 * Date: 2017/11/18 06:25
 */
public class AdapterTest {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
