package com.design.patterns.behavior.command;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 */
public class App {
    public static void main(String[] args) {
        int k = Calculator.calculate(1, 2, new AddCmd());
        System.out.println("add : " + k);
        int m = Calculator.calculate(2, 2, new MultiplyCmd());
        System.out.println("multiply : " + m);
        int n = Calculator.calculate(2, 3, (i, j) -> (int) Math.pow(i, j));
        System.out.println("pow : " + n);

    }
}
