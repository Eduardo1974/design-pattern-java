package com.pattern.example.demo.structural.decorator.src;

public class Application {

    public static void main(String args[]) {
        Window decoratorWindow = new VerticaBarDecorator(new SimpleWindow());
        decoratorWindow.draw();

        decoratorWindow = new HorizontalBarDecorator(new SimpleWindow());
        decoratorWindow.draw();
    }
}
