package com.design.patterns.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，
 * 这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 */
public class App {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>() {{
            add(new Person("lolita", 14, false));
            add(new Person("v", 20, true));
            add(new Person("lily", 16, false));
        }};

        Criteria criteria = new AndCriteria(new GirlCriteria(), new MinorCriteria());

        List<Person> minorGirl = criteria.meetCriteria(people);
        System.out.println(minorGirl);
    }
}
