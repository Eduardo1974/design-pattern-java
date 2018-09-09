package com.pattern.example.demo.gof.behavioral.interpreter.src.example1;

public class HundredExpression extends Expression {

    @Override
    public String one() {
        return "C";
    }

    @Override
    public String four() {
        return "CD";
    }

    @Override
    public String five() {
        return "D";
    }

    @Override
    public String nine() {
        return "CM";
    }

    @Override
    public int multiplier() {
        return 100;
    }
}