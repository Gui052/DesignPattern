package cn.cychee.decorator;

/**
 * 装饰边框的抽象类
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/7 11:14 下午
 */
public abstract class Border extends Display{
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
