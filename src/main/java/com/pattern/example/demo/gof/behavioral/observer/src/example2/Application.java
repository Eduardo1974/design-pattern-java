package com.pattern.example.demo.gof.behavioral.observer.src.example2;

public class Application {

    public static void main(String[] args) {
        DataSubject dados = new DataSubject();
        dados.attach(new TableObserver(dados));
        dados.attach(new BarObserver(dados));
        dados.attach(new PercentObserver(dados));

        dados.setState(new Data(7, 3, 1));
        //dados.setState(new Data(2, 3, 1));
    }
}
