package com.pattern.example.demo.gof.structural.adapter.src;

public class TwoPinPowerPlug implements PowerPlug {

    private final int PIN_01 = 1;
    private final int PIN_02 = 2;

    @Override
    public void powerPlug() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "ThreePinPowerPlug{" +
                "PIN_01=" + PIN_01 +
                ", PIN_02=" + PIN_02 +
                '}';
    }
}
