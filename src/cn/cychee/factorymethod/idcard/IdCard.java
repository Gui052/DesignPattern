package cn.cychee.factorymethod.idcard;

import cn.cychee.factorymethod.framework.Product;

public class IdCard extends Product {
    private String owner;

    /**
     * 非public构造函数,强迫包外只能通过工厂获取
     */
    IdCard(String owner) {
        System.out.println("制作" + owner + "的IdCard");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的IdCard");
    }

    public String getOwner() {
        return this.owner;
    }
}
