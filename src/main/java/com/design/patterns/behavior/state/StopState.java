package com.design.patterns.behavior.state;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Stop : do");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "State : Stop";
    }
}
