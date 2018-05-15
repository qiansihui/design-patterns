package com.design.patterns.structure.proxy;

import com.design.patterns.generate.factory.Dog;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 */
public class App {

    public static void main(String[] args) {
        Dog dog = new Dog();
        PetStaticProxy staticProxy = new PetStaticProxy(dog);
        staticProxy.eat();

        PetDynamicProxy dynamicProxy = new PetDynamicProxy(Dog.class);
        dynamicProxy.eat();
    }
}
