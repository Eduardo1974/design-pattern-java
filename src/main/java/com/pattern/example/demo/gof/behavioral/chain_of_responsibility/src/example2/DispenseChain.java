package com.pattern.example.demo.gof.behavioral.chain_of_responsibility.src.example2;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
