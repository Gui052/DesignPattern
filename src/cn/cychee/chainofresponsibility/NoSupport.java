package cn.cychee.chainofresponsibility;

/**
 * 不解决问题
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/9 10:42 下午
 */
public class NoSupport extends Support {
    private String name;
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
