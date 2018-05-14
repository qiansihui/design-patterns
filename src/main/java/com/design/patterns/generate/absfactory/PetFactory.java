package com.design.patterns.generate.absfactory;

import com.design.patterns.generate.factory.Cat;
import com.design.patterns.generate.factory.Dog;
import com.design.patterns.generate.factory.Pet;
import com.design.patterns.generate.factory.PetType;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：京东
 */
public class PetFactory extends AbstractFactory{
    public Color getColor(ColorType colorType) {
        throw new RuntimeException("not support");
    }

    public Pet getPet(PetType petType) {
        switch (petType) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                throw new RuntimeException("not support");
        }
    }
}
