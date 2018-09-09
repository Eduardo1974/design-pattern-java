package com.pattern.example.demo.gof.behavioral.chain_of_responsibility.src.example3;

import java.math.BigDecimal;

public class DiscountByItems implements Discount {

    private Discount next;

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }

    @Override
    public BigDecimal calculate(Order order) {
        if (order.getItems().size() > 10) {
            return order.getTotal().multiply(BigDecimal.valueOf(0.5));
        } else {
            return next.calculate(order);
        }
    }
}
