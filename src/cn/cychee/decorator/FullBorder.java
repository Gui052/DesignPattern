package cn.cychee.decorator;

/**
 * 给上下左右都加上边框,边框类型不可变的
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/7 11:23 下午
 */
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            //上边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            //下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
