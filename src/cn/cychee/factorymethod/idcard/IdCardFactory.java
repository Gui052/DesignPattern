package cn.cychee.factorymethod.idcard;

import cn.cychee.factorymethod.framework.Factory;
import cn.cychee.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory {
    private final List<String> owners = new ArrayList<>(10);

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    /**
     * 相当于注册产品,可以放到一个容器中,方便使用
     * @param product
     */
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IdCard) product).getOwner());
    }
}
