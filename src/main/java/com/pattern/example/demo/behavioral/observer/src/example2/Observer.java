package com.pattern.example.demo.behavioral.observer.src.example2;

public abstract class Observer {

    protected DataSubject data;

    public Observer(DataSubject data) {
        this.data = data;
    }

    public abstract void update();
}
