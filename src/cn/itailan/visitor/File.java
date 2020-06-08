package cn.itailan.visitor;

/**
 * 文件----具体元素
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/8 10:12 下午
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
    public int getSize(){
        return size;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
