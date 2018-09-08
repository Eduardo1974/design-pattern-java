package com.pattern.example.demo.behavioral.mediator.src;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    public void sendMessage(String message) {
        mediator.send(message, this);
    }

    public abstract void receiveMenssage(String message);
}
