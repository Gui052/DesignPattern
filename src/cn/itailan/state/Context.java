package cn.itailan.state;

/**
 * 负责管理状态和联系警报中心的接口
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/20 10:51
 */
public interface Context {

    //设置时间
    void setClock(int hour);

    //改变状态
    void changeState(State state);

    //联系报警中心
    void callSecurityCenter(String massage);

    //在报警中心留下记录
    void recordLog(String massage);
}
