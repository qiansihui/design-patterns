package com.design.patterns.behavior.chain;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public abstract class AbstractLogger {
    public static int DEBUG = 0;
    public static int INFO = 1;
    public static int ERROR = 2;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (null != nextLogger) {
            nextLogger.log(level, message);
        }
    }

    abstract protected void write(String message);
}
