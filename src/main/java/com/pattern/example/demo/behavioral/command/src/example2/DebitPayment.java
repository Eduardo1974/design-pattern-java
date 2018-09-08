package com.pattern.example.demo.behavioral.command.src.example2;

public class DebitPayment implements CommandPayment {

    @Override
    public void processOrder(Order order) {
        System.out.println("Pagamento em débito: " + order.getInfoInvoice());

    }
}
