package com.design.patterns.behavior.visitor;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public interface HousePartVisitor {
    void visit(Bedroom bedroom);

    void visit(Bathroom bathroom);

    void visit(House house);
}
