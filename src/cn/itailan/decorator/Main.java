package cn.itailan.decorator;

/**
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/7 11:37 下午
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello Word");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);

        d1.show();
        d2.show();
        d3.show();

        //因为他们的父类都是Display,所以Border中使用成员变量display就能访问到方法
        Display d4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        //StringDisplay也是Display的子类,所以,可以放到FullBorder里
                                        new StringDisplay("你好世界")
                                ), '*'
                        )
                ), '/'
        );
        d4.show();
    }
}
