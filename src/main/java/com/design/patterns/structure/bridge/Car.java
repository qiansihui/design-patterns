package com.design.patterns.structure.bridge;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Car implements Transport {
    public void trans(String express) {
        System.out.println("express by car");
    }
}
