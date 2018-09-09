package com.pattern.example.demo.gof.behavioral.command.src.example2;

public class Order {

    private static int ORDER_ID;
    private int invoiceId;
    private String storeName;
    private double amount;

    public Order(String storeName) {
        this.storeName = storeName;
        invoiceId = ++ORDER_ID;
    }

    public void setAmount(double valor) {
        this.amount = valor;
    }

    public String getInfoInvoice() {
        return "Nota fiscal nº: " + invoiceId + "\nLoja: "
                + storeName + "\nValor: " + amount;
    }

}
