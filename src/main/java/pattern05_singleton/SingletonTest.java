package pattern05_singleton;

/**
 * Author: Rivers
 * Date: 2017/11/18 15:15
 */
public class SingletonTest {

    public static void main(String[] args) {
        System.out.println("Start===");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("只生成了一个实例");
        }
    }
}
