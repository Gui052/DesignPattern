package cn.itailan.strategy;

/**
 * 策略接口,定义了策略中使用的方法
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/5/24 6:50 下午
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
