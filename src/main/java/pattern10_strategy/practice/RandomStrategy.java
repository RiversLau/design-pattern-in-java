package pattern10_strategy.practice;

import pattern10_strategy.Hand;
import pattern10_strategy.Strategy;

import java.util.Random;

/**
 * Author: Rivers
 * Date: 2017/11/19 20:18
 */
public class RandomStrategy extends Strategy {

    private Random random;
    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        // do nothing
    }
}
