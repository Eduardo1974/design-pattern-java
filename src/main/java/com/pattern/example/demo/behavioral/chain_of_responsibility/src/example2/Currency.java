package com.pattern.example.demo.behavioral.chain_of_responsibility.src.example2;

public class Currency {

    private int amount;

    public Currency(int amt){
        this.amount=amt;
    }

    public int getAmount(){
        return this.amount;
    }
}