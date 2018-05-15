package com.design.patterns.behavior.mediator;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        ChatRoom.show(this, message);
    }
}
