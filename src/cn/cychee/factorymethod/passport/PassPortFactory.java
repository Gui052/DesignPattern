package cn.cychee.factorymethod.passport;

import cn.cychee.factorymethod.framework.Factory;
import cn.cychee.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class PassPortFactory extends Factory {
    private final List<String> owners = new ArrayList<>(10);

    @Override
    protected Product createProduct(String owner) {
        return new PassPort(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((PassPort) product).getOwner());
    }
}
