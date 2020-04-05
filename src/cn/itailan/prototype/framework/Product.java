package cn.itailan.prototype.framework;

/**
 * 声明抽象方法use和createClone接口.
 * 这里只是浅拷贝
 */
public interface Product extends Cloneable {
    public abstract void use(String string);

    public abstract Product createClone();
}
