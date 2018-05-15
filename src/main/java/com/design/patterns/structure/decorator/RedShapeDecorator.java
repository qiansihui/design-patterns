package com.design.patterns.structure.decorator;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color: red " + decoratedShape);
    }
}
