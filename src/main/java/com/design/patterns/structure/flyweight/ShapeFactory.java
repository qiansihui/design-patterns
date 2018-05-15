package com.design.patterns.structure.flyweight;

import com.design.patterns.structure.decorator.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create circle of color : " + color);
        }
        return circle;
    }

}
