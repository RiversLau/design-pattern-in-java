package pattern19_state;

/**
 * Author: Rivers
 * Date: 2017/11/25 10:02
 */
public interface State {

    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
