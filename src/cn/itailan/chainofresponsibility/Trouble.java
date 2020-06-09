package cn.itailan.chainofresponsibility;

/**
 * 表示发生的问题
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/9 9:41 下午
 */
public class Trouble {
    //问题编号
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
