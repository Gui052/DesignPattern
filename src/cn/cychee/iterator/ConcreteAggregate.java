package cn.cychee.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个具体的集合,实现集合接口
 * @author Mr.Lan
 * @since 2020-03-08 11:45
 */
public class ConcreteAggregate<T> implements Aggregate {
    private List<T> aggregete = new ArrayList<>(10);
    private int last = 0;

    public T getIndexAt(int index) {
        return aggregete.get(index);
    }

    public void append(T one) {
        this.aggregete.add(one);
        this.last++;
    }

    public int getLength() {
        return last;
    }

    /**
     * 这里返回一个this的迭代器
     * @author Mr.Lan
     * @since 2020-03-08 11:56
     */
    @Override
    public Itrator iterator() {
        return new ConcreteIterator<T>(this);
    }
}
