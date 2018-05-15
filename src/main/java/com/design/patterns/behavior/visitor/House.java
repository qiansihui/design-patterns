package com.design.patterns.behavior.visitor;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class House implements HousePart {
    HousePart[] parts;

    public House() {
        parts = new HousePart[]{new Bathroom(), new Bedroom()};
    }

    @Override
    public void accept(HousePartVisitor housePartVisitor) {
        for (HousePart housePart : parts) {
            housePart.accept(housePartVisitor);
        }
        housePartVisitor.visit(this);

    }
}
