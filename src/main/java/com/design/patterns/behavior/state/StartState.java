package com.design.patterns.behavior.state;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Start : do");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "State : Start";
    }
}
