package pattern02_adapter.extend_adapter;

/**
 * Author: Rivers
 * Date: 2017/11/18 06:19
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
