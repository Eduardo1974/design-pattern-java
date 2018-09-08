package com.pattern.example.demo.behavioral.mediator.src;

import java.util.ArrayList;

public class MessageMediator implements Mediator {

    protected ArrayList<Colleague> contacts;

    public MessageMediator() {
        contacts = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        contacts.add(colleague);
    }

    @Override
    public void send(String message, Colleague colleague) {
        for (Colleague contact : contacts) {
            if (contact != colleague) {
                contact.receiveMenssage(message);
            }
        }
    }
}