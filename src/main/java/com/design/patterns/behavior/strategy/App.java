package com.design.patterns.behavior.strategy;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context(new StrategyAdd());
        System.out.println("2 + 3 = " + context.executeStrategy(2, 3));
        context = new Context(new StrategyPow());
        System.out.println("2 ^ 3 = " + context.executeStrategy(2, 3));
    }
}
