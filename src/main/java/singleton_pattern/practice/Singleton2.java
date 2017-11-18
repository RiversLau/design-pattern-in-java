package singleton_pattern.practice;

/**
 * Author: Rivers
 * Date: 2017/11/18 15:49
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    /**
     * 一定要加synchronized，否则多个线程同时，会出现多个实例
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
