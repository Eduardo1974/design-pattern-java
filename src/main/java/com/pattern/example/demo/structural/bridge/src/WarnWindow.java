package com.pattern.example.demo.structural.bridge.src;

public class WarnWindow extends AbstractWindow {

    public WarnWindow(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public void draw() {
        drawWindow("WarnWindow window");
        drawButton("WarnWindow button");
    }
}
