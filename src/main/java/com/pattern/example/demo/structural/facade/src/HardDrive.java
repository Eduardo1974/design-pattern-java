package com.pattern.example.demo.structural.facade.src;

public class HardDrive {

    public String read(int startPosition, int size) {
        System.out.println("lê dados do HD");
        return "lê dados do HD";
    }
    public void write(int position, String info) {
        System.out.println("escreve dados no HD");
    }
}
