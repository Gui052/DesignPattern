package cn.cychee.decorator;

/**
 * 具体的边框装饰类
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/7 11:18 下午
 */
public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Display display,char ch) {
        super(display);
        this.borderChar = ch;
    }

    //最后的字符数为两个边框加上原来的字符数
    @Override
    public int getColumns() {
        //这里直接调用继承与父类的成员变量
        return 1 + display.getRows() + 1;
    }

    //行数即为被装饰物的行数
    @Override
    public int getRows() {
        return display.getRows();
    }

    //给指定的一行字符串加上边框
    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }

}
