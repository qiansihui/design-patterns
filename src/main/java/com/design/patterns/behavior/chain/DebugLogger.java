package com.design.patterns.behavior.chain;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("debug: " + message);
    }
}
