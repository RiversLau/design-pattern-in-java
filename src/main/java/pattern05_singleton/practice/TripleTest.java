package pattern05_singleton.practice;

/**
 * Author: Rivers
 * Date: 2017/11/18 15:33
 */
public class TripleTest {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(triple);
        }
        System.out.println("End.");
    }
}
