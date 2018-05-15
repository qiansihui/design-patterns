package com.design.patterns.behavior.state;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Context {
    private State state;

    public Context() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
