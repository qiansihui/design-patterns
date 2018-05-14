package com.design.patterns.generate.singleton;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：人不能两次踏进同一条河流
 * 静态内部类
 * 静态域使用延迟初始化，线程安全
 */
public class River {
    private River() {
    }

    private static class RiverHolder {
        static River river = new River();
    }

    public static River getRiver() {
        return RiverHolder.river;
    }

}
