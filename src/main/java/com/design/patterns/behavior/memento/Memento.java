package com.design.patterns.behavior.memento;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
