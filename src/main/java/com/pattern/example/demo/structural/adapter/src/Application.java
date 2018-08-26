package com.pattern.example.demo.structural.adapter.src;

public class Application {

    public static void main(String[] args) {

        PowerPlug threePinPowerPlug = new ThreePinPowerPlug();

        PowerPlugAdapter powerPlugAdapter = new PowerPlugAdapter(threePinPowerPlug);
        powerPlugAdapter.powerPlug();

    }
}
