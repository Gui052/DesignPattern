package cn.cychee.factorymethod;

import cn.cychee.factorymethod.framework.Factory;
import cn.cychee.factorymethod.framework.Product;
import cn.cychee.factorymethod.idcard.IdCardFactory;
import cn.cychee.factorymethod.passport.PassPortFactory;

public class Main {
    public static void main(String[] args) {
        Factory factoryIdCard = new IdCardFactory();
        Product product1 = factoryIdCard.create("小明");
        Product product2 = factoryIdCard.create("小红");
        product1.use();
        product2.use();

        Factory factoryPassPort = new PassPortFactory();
        Product product3 = factoryPassPort.create("小明");
        Product product4 = factoryPassPort.create("小红");
        product3.use();
        product4.use();
    }
}
