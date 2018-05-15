package com.design.patterns.behavior.interpreter;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class AndExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String content) {
        return exp1.interpret(content) && exp2.interpret(content);
    }
}
