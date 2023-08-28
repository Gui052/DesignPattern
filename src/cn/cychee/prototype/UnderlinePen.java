package cn.cychee.prototype;

import cn.cychee.prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String string) {
        int length = string.getBytes().length;
        System.out.println("\"" + string + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return product;
    }
}
