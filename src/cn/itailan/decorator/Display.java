package cn.itailan.decorator;

/**
 * 用于显示多行字符串的抽象类
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/5/31 8:21 下午
 */
public abstract class Display {
    //获取横向字符数
    public abstract int getColumns();

    //获取纵向字符数
    public abstract int getRows();

    //获取第row行字符串
    public abstract String getRowText(int row);

    /**
     * 全部显示
     */
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
