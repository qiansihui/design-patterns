package com.design.patterns.behavior.observer;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。
 * 比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。
 */
public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new MoonObserver(subject);
        Observer observer2 = new SunObserver(subject);

        subject.setState("moon cake");
    }
}
