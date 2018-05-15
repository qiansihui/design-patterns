package com.design.patterns.behavior.chain;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("error: " + message);
    }
}
