package cn.itailan.abstractfactory.factory;

/**
 * 抽象的零件,Link
 */
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
