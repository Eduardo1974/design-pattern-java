package com.pattern.example.demo.gof.behavioral.command.src.example1;

public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }
}