package singleton_pattern.practice;

/**
 * Author: Rivers
 * Date: 2017/11/18 15:19
 */
public class TicketMaker {

    private static TicketMaker instance = new TicketMaker();

    private int ticket;
    private TicketMaker() {
        ticket = 1000;
    }

    public static TicketMaker getInstance() {
        return instance;
    }

    public synchronized int getNextTicketNum() {
        return ticket++;
    }
}
