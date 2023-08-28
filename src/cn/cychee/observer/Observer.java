package cn.cychee.observer;

/**
 * 观察者接口
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/10 9:40 下午
 */
public interface Observer {
    public abstract void update(NumberGenerator numberGenerator);
}
