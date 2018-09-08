package com.pattern.example.demo.behavioral.observer.src.example2;

public class TableObserver extends Observer {

    public TableObserver(DataSubject data) {
        super(data);
    }

    @Override
    public void update() {
        System.out.println("Tabela:\nValor A: " + data.getState().valueA
                + "\nValor B: " + data.getState().valueB + "\nValor C: "
                + data.getState().valueC);
    }
}
