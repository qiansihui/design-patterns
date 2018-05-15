package com.design.patterns.behavior.state;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 * 即根据状态操作对象
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState());


        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState());


    }
}
