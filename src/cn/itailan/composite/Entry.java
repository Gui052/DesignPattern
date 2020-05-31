package cn.itailan.composite;

/**
 * 用于实现File类和Directory类的一致性
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/5/31 4:49 下午
 */
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String perfix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
