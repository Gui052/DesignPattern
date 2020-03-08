package cn.itailan.classadapter;
/**
 * 这是一个被适配的类,假设里面有一个方法,对字符串加上括号和*号并且输出
 * @author Mr.Lan
 * @since 2020-03-08 22:42
 */
public class Adaptee {
    private String string;

    public Adaptee(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
