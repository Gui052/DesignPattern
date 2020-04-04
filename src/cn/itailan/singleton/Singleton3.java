package cn.itailan.singleton;

/**
 * 双重检查的懒汉模式单例.使用volatile关键字禁止指令重排序
 */
public class Singleton3 {
    private volatile static Singleton3 instance;
    private Singleton3 (){
    }
    public static Singleton3 getInstance() {
        if (instance== null) {
            synchronized (Singleton3.class) {
                if (instance== null) {
                    instance= new Singleton3();
                }
            }
        }
        return instance;
    }
}
