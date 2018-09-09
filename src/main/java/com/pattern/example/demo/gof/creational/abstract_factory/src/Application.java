package com.pattern.example.demo.gof.creational.abstract_factory.src;

public class Application {

    public static void main(String[] args) {
        GUIFactory factory = new MacOSFactory();
        FactoryProducer factoryProducer = new FactoryProducer(factory);
        factoryProducer.paint();

        factory = new WindowsFactory();
        factoryProducer = new FactoryProducer(factory);
        factoryProducer.paint();
    }
}
