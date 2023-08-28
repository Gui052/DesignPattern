package cn.cychee.bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello"));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,hello"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
