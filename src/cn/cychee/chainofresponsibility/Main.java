package cn.cychee.chainofresponsibility;

/**
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/9 10:56 下午
 */
public class Main {
    public static void main(String[] args) {
        Support alias = new NoSupport("alias");
        Support bob = new LimitSupport("bob", 20);
        Support elmo = new SpecailSupport("elmo", 30);
        Support fred = new LimitSupport("fred", 50);

        //形成职责链
        alias.setNext(bob).setNext(elmo).setNext(fred);
        //制造问题
        for (int i = 10; i < 55; i++) {
            alias.support(new Trouble(i));
        }
    }
}
