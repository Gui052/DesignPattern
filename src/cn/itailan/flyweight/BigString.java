package cn.itailan.flyweight;

/**
 * 表示由BigChar组成的大型字符串
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory bigCharFactory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = bigCharFactory.getBigChar(string.charAt(i));
        }
    }

    //打印
    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
