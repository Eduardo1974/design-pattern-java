package com.pattern.example.demo.gof.creational.abstract_factory.src;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}