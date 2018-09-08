package com.pattern.example.demo.behavioral.strategy.src.example2;

public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}