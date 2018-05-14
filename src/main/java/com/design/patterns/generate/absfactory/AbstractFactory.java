package com.design.patterns.generate.absfactory;

import com.design.patterns.generate.factory.Pet;
import com.design.patterns.generate.factory.PetType;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public abstract class AbstractFactory {
    public abstract Color getColor(ColorType colorType);

    public abstract Pet getPet(PetType petType);
}
