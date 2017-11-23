package pattern17_observer;

/**
 * Author: Rivers
 * Date: 2017/11/24 05:56
 */
public class ObserverTest {
    public static void main(String[] args) {
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();
        NumberGenerator generator = new RandomNumberGenerator();
        generator.addObserver(o1);
        generator.addObserver(o2);
        generator.execute();

        System.out.println("////////////////////////////");

        NumberGenerator generator1 = new IncrementalNumberGenerator(10, 30, 5);
        generator1.addObserver(o1);
        generator1.addObserver(o2);
        generator1.execute();
    }
}
