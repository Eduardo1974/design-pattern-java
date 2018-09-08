package com.pattern.example.demo.behavioral.command.src.example2;

public class Application {

    public static void main(String[] args) {
        Store americanStores = new Store("American stores");
        americanStores.execOrder(999.00, new CreditPayment());
        americanStores.execOrder(49.00, new TicketPayment());
        americanStores.execOrder(99.00, new DebitPayment());

        Store walmart = new Store("Walmart");
        walmart.execOrder(19.00, new CreditPayment());

    }
}
