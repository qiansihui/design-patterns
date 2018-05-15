package com.design.patterns.behavior.memento;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class CareTaker {
    private List<Memento> mementos = new LinkedList<>();

    public void add(Memento state) {
        mementos.add(state);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
