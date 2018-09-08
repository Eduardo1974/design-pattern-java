package com.pattern.example.demo.behavioral.command.src.example2;

public class CreditPayment implements CommandPayment {

    @Override
    public void processOrder(Order order) {
        System.out.println("Pagamento em crédito: " + order.getInfoInvoice());
    }
}
