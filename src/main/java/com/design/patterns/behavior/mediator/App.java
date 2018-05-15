package com.design.patterns.behavior.mediator;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 */
public class App {
    public static void main(String[] args) {
        User u1 = new User("ming");
        User u2 = new User("hong");
        // 两个智障
        u1.sendMessage("How are you?");
        u2.sendMessage("I am fine.");
    }
}
