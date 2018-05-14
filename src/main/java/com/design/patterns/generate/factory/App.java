package com.design.patterns.generate.factory;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class App {
    public static void main(String[] args) {
        Pet dog = PetFactory.create(PetType.DOG);
        dog.eat();
        Pet cat = PetFactory.create(PetType.CAT);
        cat.eat();
    }
}
