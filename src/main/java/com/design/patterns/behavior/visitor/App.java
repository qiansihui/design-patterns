package com.design.patterns.behavior.visitor;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。
 * 通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。
 * 根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 */
public class App {
    public static void main(String[] args) {
        HousePart housePart = new House();
        housePart.accept(new HousePartDisplayVisitor());
    }
}
