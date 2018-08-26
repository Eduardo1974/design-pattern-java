package com.pattern.example.demo.structural.bridge.src;

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
