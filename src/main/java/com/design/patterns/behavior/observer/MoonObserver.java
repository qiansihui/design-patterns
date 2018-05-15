package com.design.patterns.behavior.observer;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class MoonObserver extends Observer {
    public MoonObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void receive() {
        System.out.println("moon know your heart : " + subject.getState());
    }
}
