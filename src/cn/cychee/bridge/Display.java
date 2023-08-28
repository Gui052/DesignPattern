package cn.cychee.bridge;

/**
 * 类的功能层次结构
 */
public class Display {
    //委托,Display交予DisplayImpl具体实现工作
    private DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }
    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
