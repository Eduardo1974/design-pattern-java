package com.pattern.example.demo.structural.bridge.src;

public abstract class AbstractWindow {

    protected IWindow window;

    public AbstractWindow(IWindow iWindow) {
        window = iWindow;
    }

    public void drawWindow(String title) {
        window.drawWindow(title);
    }

    public void drawButton(String title) {
        window.drawButton(title);
    }

    public abstract void draw();
}
