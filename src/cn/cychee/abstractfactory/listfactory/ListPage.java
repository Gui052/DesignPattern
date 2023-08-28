package cn.cychee.abstractfactory.listfactory;

import cn.cychee.abstractfactory.factory.Item;
import cn.cychee.abstractfactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public void add(Item item) {
        super.add(item);
    }

    @Override
    public void outPut() {
        super.outPut();
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</ul>\n")
                .append("<hr><address>")
                .append(author)
                .append("<address")
                .append("</body></html>\n");
        return buffer.toString();
    }
}
