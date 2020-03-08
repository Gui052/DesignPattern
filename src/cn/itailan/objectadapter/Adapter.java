package cn.itailan.objectadapter;

/**
 * 具体的适配.
 * 这里Target是一个类,继承之后override虚方法,同时需要生成一个Adaptee对象,并调用方法实现适配
 * @author Mr.Lan
 * @since 2020-03-08 23:44
 */
public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter(String string) {
        this.adaptee = new Adaptee(string);
    }

    @Override
    public void printWeak() {
        adaptee.showWithParen();
    }

    @Override
    public void printStrong() {
        adaptee.showWithAster();
    }
}
