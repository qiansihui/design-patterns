package com.design.patterns.behavior.mediator;

import java.util.Date;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class ChatRoom {
    public static void show(User user, String message) {
        System.out.println(String.format("%s user[%s] : %s", new Date(), user.getName(), message));
    }
}
