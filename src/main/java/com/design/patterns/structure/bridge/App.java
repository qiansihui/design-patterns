package com.design.patterns.structure.bridge;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 * 这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 * 将抽象部分与实现部分分离，使它们都可以独立的变化。
 */
public class App {
    public static void main(String[] args) {
        // 可以在构建快递时选择具体的运输工具
        SFExpress carExpress = new SFExpress(new Car(), "iphoneX");
        SFExpress bicycleExpress = new SFExpress(new Bicycle(), "mail");

        carExpress.trans();
        bicycleExpress.trans();

    }
}
