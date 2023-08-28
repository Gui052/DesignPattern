package cn.cychee.observer;

/**
 * 图形观察者,观察到变化输出图形
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/10 9:54 下午
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        int count = numberGenerator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
        //为了看清楚结果,这里休眠一下
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
