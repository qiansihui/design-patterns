package com.design.patterns.structure.facade;

import com.design.patterns.structure.decorator.Shape;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw Shape: Rectangle");
    }
}
