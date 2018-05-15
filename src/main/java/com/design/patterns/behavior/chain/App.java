package com.design.patterns.behavior.chain;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 */
public class App {
    public static void main(String[] args) {
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new DebugLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new DebugLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);

        errorLogger.log(AbstractLogger.DEBUG,"debug message");
    }
}
