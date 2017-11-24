package pattern18_memento;

import pattern18_memento.game.Gamer;
import pattern18_memento.game.Memento;

/**
 * Author: Rivers
 * Date: 2017/11/24 21:38
 */
public class MementoTest {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("======" + i);
            System.out.println("当前状态：" + gamer);

            gamer.bet();
            System.out.println("所持金钱为：" + gamer.getMoney() + "元");

            if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("所持金钱增加，因此保存当前游戏状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("所持金钱减少，因此将游戏回复至之前的状态");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
