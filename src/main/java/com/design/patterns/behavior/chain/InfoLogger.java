package com.design.patterns.behavior.chain;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("info: " + message);
    }
}
