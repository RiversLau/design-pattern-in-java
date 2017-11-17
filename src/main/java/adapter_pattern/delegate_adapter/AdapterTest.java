package adapter_pattern.delegate_adapter;

/**
 * Author: Rivers
 * Date: 2017/11/18 06:34
 */
public class AdapterTest {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello Adapter");
        p.printWeak();
        p.printStrong();
    }
}
