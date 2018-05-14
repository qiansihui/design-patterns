package com.design.patterns.generate.absfactory;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Class clazz) {
        if (ColorFactory.class.equals(clazz)) {
            return new ColorFactory();
        }
        if (PetFactory.class.equals(clazz)) {
            return new PetFactory();
        }
        throw new RuntimeException("not support");
    }
}
