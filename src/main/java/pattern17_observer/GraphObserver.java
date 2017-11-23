package pattern17_observer;

/**
 * Author: Rivers
 * Date: 2017/11/24 05:53
 */
public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver:");
        int number = generator.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
