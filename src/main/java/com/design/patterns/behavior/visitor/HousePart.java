package com.design.patterns.behavior.visitor;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public interface HousePart {
    void accept(HousePartVisitor housePartVisitor);
}
