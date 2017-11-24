package pattern18_memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Author: Rivers
 * Date: 2017/11/24 21:40
 */
public class Gamer {

    private int money;
    private List fruits = new ArrayList<>();
    private Random random = new Random();

    private static String[] fruitsName = {"香蕉", "苹果", "葡萄", "橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
        } else if (dice == 2) {
            money /= 2;
        } else if (dice == 6) {
            String f = getFruits();
            System.out.println("获得了水果(" + f + ")");
            fruits.add(f);
        } else {
            System.out.println("很么都没有发生");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            if (s.startsWith("好吃的")) {
                m.addFruit(s);
            }
        }
        return m;
    }

    public void restoreMemento(Memento m) {
        this.money = m.money;
        this.fruits = m.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    public String getFruits() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
