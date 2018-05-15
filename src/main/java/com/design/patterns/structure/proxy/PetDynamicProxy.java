package com.design.patterns.structure.proxy;

import com.design.patterns.generate.factory.Pet;

import java.lang.reflect.Proxy;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class PetDynamicProxy implements Pet {
    private Class clazz;

    public PetDynamicProxy(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public void eat() {
        Pet proxy = (Pet) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (proxy1, method, args) -> {
            System.out.println("--- dynamic proxy call ---");
            return method.invoke(clazz.newInstance(), args);
        });
        proxy.eat();
    }
}
