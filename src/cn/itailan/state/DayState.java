package cn.itailan.state;

/**
 * 白天的状态
 * <p>直接调用传进来的Context，此类不持有Context实例</p>
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/20 10:57
 */
public class DayState implements State {
    private static final DayState state = new DayState();
    private DayState(){}

    public static State getInstance(){
        return state;
    }

    //状态改变
    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }

    @Override
    public String toString(){
        return "[白天]";
    }
}
