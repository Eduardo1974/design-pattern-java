package com.pattern.example.demo.gof.behavioral.command.src.example1;

public class LightOnCommand implements Command {
    //reference to the light
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOn();
    }
}
