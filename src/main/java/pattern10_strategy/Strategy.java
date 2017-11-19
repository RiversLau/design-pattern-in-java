package pattern10_strategy;

/**
 * Author: Rivers
 * Date: 2017/11/19 19:46
 */
public abstract class Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
