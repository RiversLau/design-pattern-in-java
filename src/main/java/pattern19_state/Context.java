package pattern19_state;

/**
 * Author: Rivers
 * Date: 2017/11/25 10:03
 */
public interface Context {

    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
