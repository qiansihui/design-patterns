package com.design.patterns.structure.proxy;

import com.design.patterns.generate.factory.Pet;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：静态代理
 */
public class PetStaticProxy implements Pet{
    private Pet pet;

    public PetStaticProxy(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void eat() {
        System.out.println("--- static proxy call ---");
        pet.eat();
    }
}
