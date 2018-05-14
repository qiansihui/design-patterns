package com.design.patterns.generate.absfactory;

import com.design.patterns.generate.factory.Pet;
import com.design.patterns.generate.factory.PetType;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class App {
    public static void main(String[] args) {
        AbstractFactory petFactory = FactoryProducer.getFactory(PetFactory.class);
        Pet dog = petFactory.getPet(PetType.DOG);
        dog.eat();
        Pet cat = petFactory.getPet(PetType.CAT);
        cat.eat();
        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
        Color blue = colorFactory.getColor(ColorType.BLUE);
        blue.fill();

    }
}
