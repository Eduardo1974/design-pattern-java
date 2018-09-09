package com.pattern.example.demo.gof.creational.abstract_factory.src;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}