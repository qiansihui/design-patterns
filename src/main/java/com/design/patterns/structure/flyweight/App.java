package com.design.patterns.structure.flyweight;

import com.design.patterns.structure.decorator.Shape;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * 即共享对象，使用缓冲器将对象缓存起来。
 */
public class App {
    public static void main(String[] args) {
        Shape redCircle = ShapeFactory.getCircle("red");
        redCircle.draw();
        redCircle = ShapeFactory.getCircle("red");
        redCircle.draw();
        Shape blueCircle = ShapeFactory.getCircle("blue");
        blueCircle.draw();

    }
}
