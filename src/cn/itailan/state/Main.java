package cn.itailan.state;

/**
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/20 11:35
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame safeFrame = new SafeFrame("State sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                safeFrame.setClock(hour);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
