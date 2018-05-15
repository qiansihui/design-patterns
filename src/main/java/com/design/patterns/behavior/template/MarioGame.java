package com.design.patterns.behavior.template;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class MarioGame extends Game {

    @Override
    void initialize() {
        System.out.println(" mario loading...");
    }

    @Override
    void start() {
        System.out.println(" mario start！");
    }

    @Override
    void end() {
        System.out.println(" mario game over !");
    }
}
