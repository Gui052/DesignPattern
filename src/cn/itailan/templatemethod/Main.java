package cn.itailan.templatemethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("你好");
        display1.display();
        display2.display();
    }
}
