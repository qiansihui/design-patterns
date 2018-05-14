package com.design.patterns.generate.factory;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：京东
 */
public class PetFactory {
    public static Pet create(PetType type) {
        switch (type) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                throw new RuntimeException("factory not support");
        }
    }
}
