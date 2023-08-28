package cn.cychee.visitor;

/**
 * 表示访问者的抽象类,访问者依赖于它所访问的数据结构
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/8 9:53 下午
 */
public abstract class Visitor {
    //依赖于composite模式的两个类

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
