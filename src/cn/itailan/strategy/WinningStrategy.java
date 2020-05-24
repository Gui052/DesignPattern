package cn.itailan.strategy;

import java.util.Random;

/**
 * 赢了的策略
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/5/24 6:52 下午
 */
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt());
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
