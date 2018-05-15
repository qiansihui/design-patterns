package com.design.patterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private String state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.receive();
        }
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
