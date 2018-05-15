package com.design.patterns.behavior.command;

import jdk.nashorn.internal.objects.annotations.Function;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public interface Cmd {
    @Function
    int execute(int i, int j);
}
