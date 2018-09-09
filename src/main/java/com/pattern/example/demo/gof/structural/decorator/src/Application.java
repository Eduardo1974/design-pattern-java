package com.pattern.example.demo.gof.structural.decorator.src;

public class Application {

    public static void main(String args[]) {

        Window decoratorWindow = new SimpleWindow();
        decoratorWindow.draw();

        decoratorWindow = new VerticaBarDecorator(decoratorWindow);
        decoratorWindow.draw();

        //decoratorWindow = new HorizontalBarDecorator(new SimpleWindow());
        decoratorWindow = new HorizontalBarDecorator(decoratorWindow); //RECURSIVO
        decoratorWindow.draw();
    }
}
