package com.design.patterns.structure.filter;

import java.util.List;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}
