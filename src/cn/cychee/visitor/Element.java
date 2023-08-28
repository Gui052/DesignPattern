package cn.cychee.visitor;

/**
 * 表示接受访问者访问的接口
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/8 10:05 下午
 */
public interface Element {
    public abstract void accept(Visitor visitor);
}
