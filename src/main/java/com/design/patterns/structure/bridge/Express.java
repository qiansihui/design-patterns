package com.design.patterns.structure.bridge;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public abstract class Express {
    protected Transport transport;

    public Express(Transport transport) {
        this.transport = transport;
    }

    public abstract void trans();
}
