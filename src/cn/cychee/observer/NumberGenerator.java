package cn.cychee.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察的对象
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/10 9:42 下午
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    //向观察者发送通知
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
