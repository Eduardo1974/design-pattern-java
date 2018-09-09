package com.pattern.example.demo.gof.behavioral.command.src.example2;

public class TicketPayment implements CommandPayment {

    @Override
    public void processOrder(Order order) {
        System.out.println("Pagamento em boleto: " + order.getInfoInvoice());
    }
}
