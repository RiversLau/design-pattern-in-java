package pattern19_state;

/**
 * Author: Rivers
 * Date: 2017/11/25 10:27
 */
public class StateTest {

    public static void main(String[] args) {
        Context context = new SafeFrame("State Sample");
        while (true) {
            for (int i = 1; i <= 24; i++) {
                context.setClock(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
