package cn.cychee.composite;

import java.util.ArrayList;

/**
 * 表示文件夹的类
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/5/31 7:36 下午
 */
public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        //这里是一致性表现,不管是文件夹还是文件,都可以调用getSize方法
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    /**
     * 增加条目
     */
    @Override
    public Entry add(Entry entry) throws FileTreatMentException {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String perfix) {
        System.out.println(perfix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(perfix + "/" + name);
        }
    }
}
