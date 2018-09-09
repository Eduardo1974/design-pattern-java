package com.pattern.example.demo.gof.behavioral.mediator.src;

public class AndroidColleague extends Colleague {

    public AndroidColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receiveMenssage(String mensagem) {
        System.out.println("Android recebeu: " + mensagem);
    }
}
