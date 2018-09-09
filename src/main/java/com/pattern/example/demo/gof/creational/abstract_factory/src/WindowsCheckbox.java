package com.pattern.example.demo.gof.creational.abstract_factory.src;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
