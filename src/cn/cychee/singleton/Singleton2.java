package cn.cychee.singleton;

/**
 * 重量锁的懒汉单例模式,synchronized关键字同步
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
