package cn.itailan.singleton;

/**
 * 饿汉模式单例
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() { }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
