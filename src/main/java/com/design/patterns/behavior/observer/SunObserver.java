package com.design.patterns.behavior.observer;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class SunObserver extends Observer {
    public SunObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void receive() {
        System.out.println("sun don't know your white : " + subject.getState());
    }
}
