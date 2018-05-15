package com.design.patterns.structure.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class GirlCriteria implements Criteria {
    public List<Person> meetCriteria(List<Person> personList) {
        return personList.stream().filter(p -> !p.isSex()).collect(Collectors.toList());
    }
}
