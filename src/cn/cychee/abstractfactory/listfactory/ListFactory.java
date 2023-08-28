package cn.cychee.abstractfactory.listfactory;

import cn.cychee.abstractfactory.factory.Factory;
import cn.cychee.abstractfactory.factory.Link;
import cn.cychee.abstractfactory.factory.Page;
import cn.cychee.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
