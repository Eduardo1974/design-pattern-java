package com.pattern.example.demo.behavioral.observer.src.example2;

import java.util.ArrayList;

public class DataSubject {

    protected ArrayList<Observer> observers;
    protected Data data;

    public DataSubject() {
        observers = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(int indice) {
        observers.remove(indice);
    }

    public void setState(Data data) {
        this.data = data;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Data getState() {
        return data;
    }
}
