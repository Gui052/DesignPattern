package cn.cychee.iterator;

/**
 * 一个具体的迭代器
 * @author Mr.Lan
 * @since 2020-03-08 11:59
 */
public class ConcreteIterator<T> implements Itrator {

    private ConcreteAggregate<T> concreteAggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < concreteAggregate.getLength();
    }

    @Override
    public Object next() {
        T obj = concreteAggregate.getIndexAt(index);
        index ++;
        return obj;
    }
}
