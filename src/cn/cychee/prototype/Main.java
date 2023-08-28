package cn.cychee.prototype;

import cn.cychee.prototype.framework.Manager;
import cn.cychee.prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        //定义相同对象的不同属性,然后用一个name注册到manager
        Manager manager = new Manager();
        UnderlinePen pen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("Strong message", pen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //通过拷贝生成
        Product product1 = manager.create("Strong message");
        product1.use("Hello Word");
        Product product2 = manager.create("warning box");
        product2.use("Hello Word");
        Product product3 = manager.create("slash box");
        product3.use("Hello Word");
    }
}
