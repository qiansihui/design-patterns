package com.design.patterns.behavior.memento;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * 就是用一个链表按顺序把每一步变化的状态记录下来
 */
public class App {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("current state:" + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First state:" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second state:" + originator.getState());

    }
}
