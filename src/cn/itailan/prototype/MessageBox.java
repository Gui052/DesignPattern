package cn.itailan.prototype;

import cn.itailan.prototype.framework.Product;

public class MessageBox implements Product {
    private char decoder;

    public MessageBox(char decoder) {
        this.decoder = decoder;
    }

    @Override
    public void use(String string) {
        int length = string.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoder);
        }
        System.out.println();
        System.out.println(decoder + " " + string + " " + decoder);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoder);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            //用于复制自己.Cloneable接口只是告诉程序可以使用clone()方法
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return product;
    }
}
