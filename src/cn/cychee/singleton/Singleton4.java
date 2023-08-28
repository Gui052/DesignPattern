package cn.cychee.singleton;

/**
 * 静态域模式单例
 * @author Mr.Lan
 * @since 2020-04-05 00:53
 */
public class Singleton4 {
    private Singleton4(){}

    private static Singleton4 singleton4;
    static {
        singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return singleton4;
    }
}
