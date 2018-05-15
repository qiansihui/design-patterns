package com.design.patterns.behavior.command;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class AddCmd implements Cmd {

    @Override
    public int execute(int i, int j) {
        return i + j;
    }

}
