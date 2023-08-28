package cn.cychee.objectadapter;

public class Client {
    public static void main(String[] args) {
        //客户端调用的这个Target是一个对象
        Target t = new Adapter("哈哈哈");
        t.printStrong();
        t.printWeak();
    }
}
