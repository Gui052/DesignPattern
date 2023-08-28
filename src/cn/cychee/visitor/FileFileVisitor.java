package cn.cychee.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 访问某一特定后缀的文件
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/8 11:27 下午
 */
public class FileFileVisitor extends Visitor {
    private String fileType = "";
    private List<Entry> fount = new ArrayList<>();

    public Iterator<Entry> getFountFile() {
        return fount.iterator();
    }

    public FileFileVisitor(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(fileType)) {
            fount.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
    }
}
