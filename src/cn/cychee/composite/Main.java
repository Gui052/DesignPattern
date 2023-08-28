package cn.cychee.composite;

/**
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/5/31 7:47 下午
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries......");

        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory userdir = new Directory("user");

        //文件夹里可以加上文件夹
        rootdir.add(bindir).add(tmpdir).add(userdir);
        //文件夹里可以加文件
        bindir.add(new File("vi", 1000)).add(new File("latex", 2000));
        rootdir.printList();

        System.out.println("Making user entries....");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomyra");

        userdir.add(yuki).add(hanako).add(tomura);
        yuki.add(new File("diary.html", 100)).add(new File("Composite.java", 200));
        hanako.add(new File("memo.tex", 1000));
        tomura.add(new File("game.doc", 100)).add(new File("jumk.mail", 500));
        rootdir.printList();
    }
}
