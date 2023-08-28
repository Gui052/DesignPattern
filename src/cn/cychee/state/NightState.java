package cn.cychee.state;

/**
 * 晚上的状态
 * <p>直接调用传进来的Context，此类不持有Context实例</p>
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/20 11:02
 */
public class NightState implements State {
    private static final NightState state = new NightState();
    private NightState(){}

    public static State getInstance(){
        return state;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急，晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上通话录音");
    }

    @Override
    public String toString(){
        return "[晚上]";
    }
}
