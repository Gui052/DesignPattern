package cn.cychee.visitor;

import cn.cychee.composite.FileTreatMentException;

import java.util.Iterator;

/**
 * 定义数据如何访问
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/8 10:07 下午
 */
public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    //只适用于Directory,这里就简单的让它报错
    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public Iterator iterator() throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
