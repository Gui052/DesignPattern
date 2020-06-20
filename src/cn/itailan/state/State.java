package cn.itailan.state;

/**
 * 标识金库状态
 * <p>直接调用传进来的Context，此类不持有Context实例</p>
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/20 10:49
 */
public interface State {
    //设置时间
    void doClock(Context context, int hour);

    //使用金库
    void doUse(Context context);

    //按下报警
    void doAlarm(Context context);

    //正常通话
    void doPhone(Context context);
}
