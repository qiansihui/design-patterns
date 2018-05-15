package com.design.patterns.structure.facade;

import com.design.patterns.structure.decorator.Circle;
import com.design.patterns.structure.decorator.Shape;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
