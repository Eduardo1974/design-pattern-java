package com.pattern.example.demo.behavioral.mediator.src;

public class Application {

    public static void main(String[] args) {
        MessageMediator mediador = new MessageMediator();

        AndroidColleague android = new AndroidColleague(mediador);
        IOSColleague ios = new IOSColleague(mediador);

        mediador.addColleague(android);
        mediador.addColleague(ios);

        android.sendMessage("Oi iOs! Eu sou um Android!");
        System.out.println("=========");
        ios.sendMessage("Olá todos, sou um iOs!");
    }
}
