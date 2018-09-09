package com.pattern.example.demo.gof.behavioral.memento.src;

import java.util.ArrayList;

public class Caretaker {

    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento() {
        if (mementos.size() <= 0) {
            return new Memento("");
        }
        Memento savedState = mementos.get(mementos.size() - 1);
        mementos.remove(mementos.size() - 1);
        return savedState;
    }
}
