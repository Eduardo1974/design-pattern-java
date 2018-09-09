package com.pattern.example.demo.gof.creational.abstract_factory.src;

public class FactoryProducer {

    private Button button;
    private Checkbox checkbox;

    public FactoryProducer(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
