package pattern05_singleton;

/**
 * Author: Rivers
 * Date: 2017/11/18 15:14
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Singleton初始化");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
