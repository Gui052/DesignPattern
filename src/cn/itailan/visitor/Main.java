package cn.itailan.visitor;

import java.util.Iterator;

/**
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/8 10:50 下午
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("make root entries...");
            Directory root = new Directory("root");
            Directory bin = new Directory("bin");
            Directory tmp = new Directory("tmp");
            Directory user = new Directory("user");
            Directory lan = new Directory("lan");
            root.add(bin);
            root.add(tmp);
            root.add(user);
            user.add(lan);
            bin.add(new File("a.java", 100));
            bin.add(new File("b.latex", 300));
            lan.add(new File("c.java", 320));

            //从root开始访问
            root.accept(new ListVisitor());

            //从user开始访问
            System.out.println("visit user ...");
            user.accept(new ListVisitor());
            //element访问visitor,visitor又访问element,这种消息分发方式成为双重分发

            //特定文件访问
            FileFileVisitor visitor = new FileFileVisitor(".java");
            root.accept(visitor);
            Iterator<Entry> entryIterator = visitor.getFountFile();
            while (entryIterator.hasNext()) {
                System.out.println(entryIterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
