package cn.cychee.abstractfactory;

import cn.cychee.abstractfactory.factory.Factory;
import cn.cychee.abstractfactory.factory.Link;
import cn.cychee.abstractfactory.factory.Page;
import cn.cychee.abstractfactory.factory.Tray;

/**
 * 生产产品
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(args[0]);

        //生产零件
        Link people = factory.createLink("人民日报", "http://www.people.com");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.com");
        Link google = factory.createLink("Google", "http://www.google.com");

        //生产零件.这里add之后,在具体工厂中会循环调用Link中的makeHtml方法
        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray search = factory.createTray("搜索");
        search.add(google);

        //组装零件.这里add之后,在具体工厂中会循环调用Tray中的makeHtml方法,一层一层的调用,最终实现产品组装
        //在具体使用中,调用什么方法逻辑都在具体工厂中实现,从零件到产品
        Page page = factory.createPage("LinkPage", "Lan");
        page.add(trayNews);
        page.add(search);
        page.outPut();
    }
}
