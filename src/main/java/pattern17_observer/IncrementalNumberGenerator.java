package pattern17_observer;

/**
 * Author: Rivers
 * Date: 2017/11/24 06:11
 */
public class IncrementalNumberGenerator extends NumberGenerator {

    private int number;
    private int end;
    private int step;
    public IncrementalNumberGenerator(int start, int end, int step) {
        this.number = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += step;
        }
    }
}
