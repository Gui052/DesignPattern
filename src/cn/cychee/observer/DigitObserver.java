package cn.cychee.observer;

/**
 * 数字观察者,观察到改变输出数字
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/10 9:52 下午
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println(numberGenerator.getNumber());
        //为了看清楚结果,这里休眠一下
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
