package cn.itailan.builder;

/**
 * 声明一个编写文档的方法
 * @author Mr.Lan
 * @since 2020-05-01 20:00
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String string);

    public abstract void makeItems(String[] items);

    public abstract void close();
}