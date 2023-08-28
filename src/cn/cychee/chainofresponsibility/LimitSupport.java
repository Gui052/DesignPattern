package cn.cychee.chainofresponsibility;

/**
 * 解决编号小于Limit的问题
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/9 10:51 下午
 */
public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
