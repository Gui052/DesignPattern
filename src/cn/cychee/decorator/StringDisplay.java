package cn.cychee.decorator;

/**
 * 用于显示单行字符串的类
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/7 10:53 下午
 */
public class StringDisplay extends Display {
    private String string;

    public StringDisplay(String s) {
        this.string = s;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }else {
            return null;
        }
    }
}
