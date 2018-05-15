package com.design.patterns.structure.decorator;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 */
public class App {
    public static void main(String[] args) {
        Circle normalCircle = new Circle();
        System.out.println("--- draw normal circle ----");
        normalCircle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("--- draw red circle ---");
        redCircle.draw();

    }
}
