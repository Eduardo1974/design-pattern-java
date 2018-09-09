package com.pattern.example.demo.gof.structural.decorator.src;

public abstract class AbstractDecoratorWindow extends Window {

    protected Window decoratorWindow;

    public AbstractDecoratorWindow(Window decoratorWindow) {
        this.decoratorWindow = decoratorWindow;
    }

}
