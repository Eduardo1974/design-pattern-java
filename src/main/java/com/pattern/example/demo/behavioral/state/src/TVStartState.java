package com.pattern.example.demo.behavioral.state.src;

public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}