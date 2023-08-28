package cn.cychee.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 文件夹---对象结构(包含有File),也是具体元素   两个角色
 * <p>类似于composite,相比增加了两个方法</p>
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/8 10:18 下午
 */
public class Directory extends Entry{
    private String name;
    private ArrayList<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    //递归调用
    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : dir) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    //定义迭代器,使用ArrayList的迭代器,相当于可以直接拿到数据
    @Override
    public Iterator<Entry> iterator() {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
