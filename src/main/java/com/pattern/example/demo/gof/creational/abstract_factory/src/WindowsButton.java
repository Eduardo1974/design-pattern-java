package com.pattern.example.demo.gof.creational.abstract_factory.src;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}