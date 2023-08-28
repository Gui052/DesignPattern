package cn.cychee.factorymethod.passport;

import cn.cychee.factorymethod.framework.Product;

public class PassPort extends Product {
    private String owner;

    /**
     * 非public构造函数,强迫包外只能通过工厂获取
     */
    PassPort(String owner) {
        System.out.println("制作" + owner + "的PassPort");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的PassPort");
    }

    public String getOwner() {
        return this.owner;
    }
}
