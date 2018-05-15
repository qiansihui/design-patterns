package com.design.patterns.behavior.strategy;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
