package cn.itailan.classadapter;

public class Client {
    public static void main(String[] args) {
        //客户端调用的Target是一个接口
        Target t = new Adapter("哈哈哈");
        t.printStrong();
        t.printWeak();
    }
}
