package com.pattern.example.demo.gof.structural.bridge.src;

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
