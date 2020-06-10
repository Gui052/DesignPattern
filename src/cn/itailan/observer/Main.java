package cn.itailan.observer;

/**
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/10 9:55 下午
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        //添加观察者
        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);

        numberGenerator.execute();
    }
}
