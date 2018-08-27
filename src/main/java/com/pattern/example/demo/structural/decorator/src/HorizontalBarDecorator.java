package com.pattern.example.demo.structural.decorator.src;

public class HorizontalBarDecorator extends AbstractDecoratorWindow {

    public HorizontalBarDecorator(Window decoratorWindow) {
        super(decoratorWindow);
    }

    @Override
    public void draw() {
        drawHorizontallBar();
        decoratorWindow.draw();
    }

    private void drawHorizontallBar() {
        System.out.println("desenha uma barra horizontal na janela");
    }
}
