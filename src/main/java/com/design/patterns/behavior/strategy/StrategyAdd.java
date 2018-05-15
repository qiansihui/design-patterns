package com.design.patterns.behavior.strategy;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class StrategyAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
