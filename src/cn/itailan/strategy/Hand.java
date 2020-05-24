package cn.itailan.strategy;

/**
 * 表示猜拳游戏中的手势
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/5/18 11:42 下午
 */
public class Hand {
    //表示石头
    public static final int HAND_VALUE_GUU = 0;

    //表示剪刀
    public static final int HAND_VALUE_CHO = 1;

    //表示布
    public static final int HAND_VALUE_PAA = 2;

    private static final String[] name = {
            "石头","剪刀","布"
    };

    private static final Hand[] hand = {
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_PAA)
    };

    private int handValue;
    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeekerThan(Hand hand) {
        return fight(hand) == -1;
    }

    /**
     * 计分,0为平局,1为胜,-1为负
     * @param hand
     * @return
     */
    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handValue];
    }
}
