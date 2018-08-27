package com.pattern.example.demo.structural.decorator.src;

public abstract class AbstractDecoratorWindow extends Window {

    protected Window decoratorWindow;

    public AbstractDecoratorWindow(Window decoratorWindow) {
        this.decoratorWindow = decoratorWindow;
    }

}
