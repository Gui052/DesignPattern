package cn.cychee.classadapter;

/**
 * 这是适配器具体实现方法
 * 因为Target是一个接口,这里直接override之后,调用父类方法,即可以实现适配
 * @author Mr.Lan
 * @since 2020-03-08 22:53
 */
public class Adapter extends Adaptee implements Target {
    public Adapter(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
