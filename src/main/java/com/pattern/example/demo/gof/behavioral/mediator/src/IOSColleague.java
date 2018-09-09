package com.pattern.example.demo.gof.behavioral.mediator.src;

public class IOSColleague extends Colleague {

    public IOSColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receiveMenssage(String mensagem) {
        System.out.println("iOs recebeu: " + mensagem);
    }
}