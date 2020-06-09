package cn.itailan.chainofresponsibility;

/**
 * 表示用来解决问题的抽象类
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/9 9:43 下午
 */
public abstract class Support {
    private String name;
    //推卸给的对象
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    //这个总是返回最新的职责对象,和build很像
    public Support setNext(Support support) {
        next = support;
        return next;
    }

    //解决问题的方法,各个子类需要自己实现
    protected abstract boolean resolve(Trouble trouble);

    //问题解决
    protected void done(Trouble trouble) {
        System.out.println(trouble + "问题已经由" + this + "解决");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + "问题未解决");
    }

    //解决问题的步骤
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            //让他的下一个support解决,链式调用
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public String toString() {
        return "[" + name + "]";
    }
}
