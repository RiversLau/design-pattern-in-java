package pattern18_memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rivers
 * Date: 2017/11/24 21:38
 */
public class Memento {

    int money;
    List fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String s) {
        fruits.add(s);
    }

    List getFruits() {
        return fruits;
    }
}
