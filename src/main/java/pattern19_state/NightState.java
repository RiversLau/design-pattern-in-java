package pattern19_state;

/**
 * Author: Rivers
 * Date: 2017/11/25 10:09
 */
public class NightState implements State {

    private static NightState instance = new NightState();
    private NightState() {}

    public static NightState getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（晚上）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("晚上通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
