package cn.itailan.observer;

import java.util.Random;

/**
 * 随机数生成
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/10 9:45 下午
 */
public class RandomNumberGenerator extends NumberGenerator {

    private int number;
    private Random random = new Random();

    @Override
    public int getNumber() {
        return number;
    }

    //生成数字,通知观察者
    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
