package com.design.patterns.behavior.command;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Calculator {
    public static int calculate(int i, int j, Cmd cmd) {
        return cmd.execute(i, j);
    }

}
