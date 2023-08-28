package cn.cychee.bridge;

/**
 * 类的功能层次结构,新增了multiDisplay方法
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    public void multiDisplay(int time) {
        open();
        for (int i = 0; i < time; i++) {
            print();
        }
        close();
    }
}
