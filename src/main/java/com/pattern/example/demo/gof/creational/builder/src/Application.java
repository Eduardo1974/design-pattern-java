package com.pattern.example.demo.gof.creational.builder.src;

public class Application {

    public static void main(String[] args) {
        BankAccount account = new BankAccount.Builder(1234L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        System.out.println(account.getAccountNumber());
    }
}
