package cn.itailan.abstractfactory.listfactory;

import cn.itailan.abstractfactory.factory.Factory;
import cn.itailan.abstractfactory.factory.Link;
import cn.itailan.abstractfactory.factory.Page;
import cn.itailan.abstractfactory.factory.Tray;

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
