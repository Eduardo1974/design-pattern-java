package com.pattern.example.demo.gof.behavioral.state.src;

public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}