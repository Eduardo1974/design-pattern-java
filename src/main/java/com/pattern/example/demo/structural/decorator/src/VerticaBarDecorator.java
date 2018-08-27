package com.pattern.example.demo.structural.decorator.src;

public class VerticaBarDecorator extends AbstractDecoratorWindow {

    public VerticaBarDecorator(Window decoratorWindow) {
        super(decoratorWindow);
    }

    @Override
    public void draw() {
        drawVerticalBar();
        decoratorWindow.draw();
    }

    private void drawVerticalBar() {
        System.out.println("desenha uma barra vertical na janela");
    }
}
