package com.pattern.example.demo.gof.structural.bridge.src;

public class BootstrapWindow implements IWindow {

    @Override
    public void drawWindow(String title) {
        System.out.println("BootstrapWindow drawWindow: " + title);
    }

    @Override
    public void drawButton(String title) {
        System.out.println("BootstrapWindow drawButton: " + title);
    }
}
