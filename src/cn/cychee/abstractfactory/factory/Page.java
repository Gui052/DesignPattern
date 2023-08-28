package cn.cychee.abstractfactory.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

/**
 * 抽象的产品,Page
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void outPut() {
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHtml());
            System.out.println(fileName + "完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 一个简单的Template Method模式的方法
     */
    public abstract String makeHtml();
}
