package pattern10_strategy;

/**
 * Author: Rivers
 * Date: 2017/11/19 19:59
 */
public class StrategyTest {
    public static void main(String[] args) {
        Player p1 = new Player("Rivers", new WinningStrategy(3));
        Player p2 = new Player("TsingHua", new ProbStrategy(5));
        for (int i = 0; i < 10000; i++) {
            Hand nh1 = p1.getHand();
            Hand nh2 = p2.getHand();
            if (nh1.isStrongerThan(nh2)) {
                System.out.println("Winner: " + p1);
                p1.win();
                p2.lost();
            } else if (nh2.isStrongerThan(nh1)) {
                System.out.println("Winner: " + p2);
                p2.win();
                p1.lost();
            } else {
                System.out.println("Even...");
                p1.even();
                p2.even();
            }
        }
        System.out.println("total result:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
