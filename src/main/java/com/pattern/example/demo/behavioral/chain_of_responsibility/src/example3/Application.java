package com.pattern.example.demo.behavioral.chain_of_responsibility.src.example3;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        final Order pedido = new Order();
        pedido.addItem(500);
        pedido.addItem(800);
        pedido.addItem(20);
        BigDecimal bigDecimal = calculateDiscount(pedido);
        System.out.println(bigDecimal);
    }

    public static BigDecimal calculateDiscount(Order order) {
        final Discount descontoPorItem = new DiscountByItems();
        final Discount descontoPorValor = new DiscountByValue();
        final Discount semDiscount = new NoDiscount();

        descontoPorItem.setNext(descontoPorValor);
        descontoPorValor.setNext(semDiscount);

        return descontoPorItem.calculate(order);
    }

    /*

    Antes de Chain of Responsability

    public static void main(String[] args) {
        final Order order = new Order();
        order.addItem(500);
        order.addItem(800);
        order.addItem(20);
        calculateDiscount(order);
    }

    public BigDecimal calculateDiscount(Order order) {
        if(order.getItems().size() > 10) {
            return order.getTotal().multiply(BigDecimal.valueOf(0.5));
        } else if(order.getTotal() > 1000.0) {
            return order.getTotal().multiply(BigDecimal.valueOf(0.10));
        } else {
            return BigDecimal.ZERO;
        }
    }*/
}
