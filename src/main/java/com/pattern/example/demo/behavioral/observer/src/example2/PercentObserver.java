package com.pattern.example.demo.behavioral.observer.src.example2;

import java.text.DecimalFormat;

public class PercentObserver extends Observer {

    public PercentObserver(DataSubject data) {
        super(data);
    }

    @Override
    public void update() {
        int somaDosValores = data.getState().valueA + data.getState().valueB
                + data.getState().valueC;
        DecimalFormat formatador = new DecimalFormat("#.##");
        String porcentagemA = formatador.format((double) data.getState().valueA
                / somaDosValores);
        String porcentagemB = formatador.format((double) data.getState().valueB
                / somaDosValores);
        String porcentagemC = formatador.format((double) data.getState().valueC
                / somaDosValores);
        System.out.println("Porcentagem:\nValor A: " + porcentagemA
                + "%\nValor B: " + porcentagemB + "%\nValor C: " + porcentagemC
                + "%");
    }
}
