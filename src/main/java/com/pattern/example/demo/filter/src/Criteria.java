package com.pattern.example.demo.filter.src;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}

