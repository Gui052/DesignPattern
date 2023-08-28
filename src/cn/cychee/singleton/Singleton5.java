package cn.cychee.singleton;

/**
 * 枚举模式单例
 */
public class Singleton5 {
    private Singleton5() { }

    public static Singleton5 getInstance() {
        return Singleton.INSTANCE.getSingleton();
    }

    private enum Singleton {
        INSTANCE;

        private Singleton5 singleton;

        /**JVM保证这个方法绝对只允许调用一次*/
        Singleton() {
            singleton = new Singleton5();
        }

        public Singleton5 getSingleton() {
            return singleton;
        }
    }
}
