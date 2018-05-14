package com.design.patterns.generate.absfactory;

import com.design.patterns.generate.factory.Pet;
import com.design.patterns.generate.factory.PetType;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(ColorType colorType) {
        switch (colorType) {
            case RED:
                return new Red();
            case BLUE:
                return new Blue();
            default:
                throw new RuntimeException("not support");
        }
    }

    public Pet getPet(PetType petType) {
        throw new RuntimeException("not support");
    }
}
