package cn.cychee.composite;

/**
 * 表示文件的类
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/5/31 7:33 下午
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String perfix) {
        System.out.println(perfix + "/" + this);
    }
}
