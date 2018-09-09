package com.pattern.example.demo.gof.structural.bridge.src;

public class Application {

    public static void main(String[] args) {

        AbstractWindow window = new DialogWindow(new DefaultWindow());
        window.draw();

        window = new WarnWindow(new BootstrapWindow());
        window.draw();
    }
}
