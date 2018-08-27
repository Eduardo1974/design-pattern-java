package com.pattern.example.demo.behavioral.chain_of_responsibility.src.example3;

import java.math.BigDecimal;

public interface Discount {

    void setNext(Discount next);

    BigDecimal calculate(Order order);
}
