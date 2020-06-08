package cn.itailan.visitor;

import java.util.Iterator;

/**
 * 访问数据结构并显示元素
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/8 10:41 下午
 */
public class ListVisitor extends Visitor {
    //当前正在访问的文件夹名字
    private String currentDir = "";

    @Override
    public void visit(File file) {
        //这里没有accept了,说明到这里已经访问结束,不会再往下了
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();

        //递归调用
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            //这个方法调用了Visitor的visit方法,一直递归到文件(元素)为止
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
