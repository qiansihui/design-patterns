package com.design.patterns.structure.bridge;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Bicycle implements Transport {
    public void trans(String express) {
        System.out.println("express by bicycle");
    }
}
