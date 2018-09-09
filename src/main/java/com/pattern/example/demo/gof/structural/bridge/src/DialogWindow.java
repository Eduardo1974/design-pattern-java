package com.pattern.example.demo.gof.structural.bridge.src;

public class DialogWindow extends AbstractWindow {

    DialogWindow(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public void draw() {
        drawWindow("DialogWindow window");
        drawButton("DialogWindow button");
    }
}
