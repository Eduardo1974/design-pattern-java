package com.pattern.example.demo.behavioral.observer.src.example2;

public class BarObserver extends Observer {

    public BarObserver(DataSubject data) {
        super(data);
    }

    @Override
    public void update() {
        String barraA = "", barraB = "", barraC = "";

        for (int i = 0; i < data.getState().valueA; i++) {
            barraA += '=';
        }

        for (int i = 0; i < data.getState().valueB; i++) {
            barraB += '=';
        }

        for (int i = 0; i < data.getState().valueC; i++) {
            barraC += '=';
        }

        System.out.println("Barras:\n Valor A: " + barraA + "\nValor B: "
                + barraB + "\nValor C: " + barraC);
    }
}
