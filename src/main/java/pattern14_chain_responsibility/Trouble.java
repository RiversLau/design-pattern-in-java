package pattern14_chain_responsibility;

/**
 * Author: Rivers
 * Date: 2017/11/22 21:37
 */
public class Trouble {

    private int number;
    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "[Trouble " + number + "]";
    }
}
