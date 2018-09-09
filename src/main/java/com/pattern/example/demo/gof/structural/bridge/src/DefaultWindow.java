package com.pattern.example.demo.gof.structural.bridge.src;

public class DefaultWindow implements IWindow {

    @Override
    public void drawWindow(String title) {
        System.out.println("DefaultWindow drawWindow: " + title);
    }

    @Override
    public void drawButton(String title) {
        System.out.println("DefaultWindow drawButton: " + title);
    }
}
