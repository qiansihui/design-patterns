package com.design.patterns.behavior.template;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public abstract class Game {
    abstract void initialize();

    abstract void start();

    abstract void end();

    // template method , user final avoid override
    public final void play() {
        initialize();

        start();

        end();
    }
}
