package cn.itailan.factorymethod;

import cn.itailan.factorymethod.framework.Factory;
import cn.itailan.factorymethod.framework.Product;
import cn.itailan.factorymethod.idcard.IdCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product product1 = factory.create("小明");
        Product product2 = factory.create("小红");
        product1.use();
        product2.use();
    }
}
