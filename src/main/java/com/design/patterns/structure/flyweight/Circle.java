package com.design.patterns.structure.flyweight;

import com.design.patterns.structure.decorator.Shape;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Circle implements Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Shape:Circle ; Color: " + color);
    }
}
