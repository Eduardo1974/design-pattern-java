package com.pattern.example.demo.behavioral.command.src.example2;

public class Store {

    protected String storeName;

    public Store(String name) {
        storeName = name;
    }

    public void execOrder(double valor, CommandPayment paymentType) {
        Order order = new Order(storeName);
        order.setAmount(valor);
        paymentType.processOrder(order);
    }
}
