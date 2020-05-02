package cn.itailan.abstractfactory.factory;

/**
 * 抽象的零件
 * @author Mr.Lan
 * @since 2020/5/2 1:40 下午
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();
}
