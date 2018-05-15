package com.design.patterns.behavior.observer;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void receive();

}
