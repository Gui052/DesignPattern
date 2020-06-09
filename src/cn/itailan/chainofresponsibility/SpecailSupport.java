package cn.itailan.chainofresponsibility;

/**
 * 解决特定编号的问题
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/9 10:54 下午
 */
public class SpecailSupport extends Support {
    private int number;

    public SpecailSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
