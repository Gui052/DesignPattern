package cn.itailan.flyweight;

import java.util.HashMap;

/**
 * 生成BigChar实例的工厂,它实现了共享实例的功能
 */
public class BigCharFactory {
    //管理已经生成的BigChar实例
    private HashMap<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();
    private BigCharFactory(){}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    //生成(共享)BigChar实例.同步方法
    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get(String.valueOf(charName));
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put(String.valueOf(charName), bigChar);
        }
        return bigChar;
    }
}
