package cn.cychee.abstractfactory.factory;

import java.util.ArrayList;

/**
 * 抽象的零件,Tray
 */
public abstract class Tray extends Item {
    protected ArrayList<Item> tray = new ArrayList<>(10);
    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
