package com.pattern.example.demo.gof.behavioral.chain_of_responsibility.src.example3;

import java.math.BigDecimal;

public class NoDiscount implements Discount {

    private Discount next;

    @Override
    public void setNext(Discount next) {
    }

    @Override
    public BigDecimal calculate(Order order) {
        return BigDecimal.ZERO;
    }
}
