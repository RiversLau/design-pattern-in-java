package pattern05_singleton.practice;

/**
 * Author: Rivers
 * Date: 2017/11/18 15:21
 */
public class TicketMakerTest {
    public static void main(String[] args) {
        TicketMaker m1 = TicketMaker.getInstance();
        TicketMaker m2 = TicketMaker.getInstance();
        if (m1 == m2) {
            System.out.println("生成了相同的实例");
        }

        int num1 = m1.getNextTicketNum();
        int num2 = m2.getNextTicketNum();
        System.out.println("Num one is = " + num1 + "; Num two is = " + num2);
        assert num2 > num1;
    }
}
