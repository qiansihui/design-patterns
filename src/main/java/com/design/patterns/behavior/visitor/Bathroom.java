package com.design.patterns.behavior.visitor;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class Bathroom implements HousePart {
    @Override
    public void accept(HousePartVisitor housePartVisitor) {
        housePartVisitor.visit(this);
    }
}
