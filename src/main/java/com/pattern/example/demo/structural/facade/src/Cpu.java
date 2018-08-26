package com.pattern.example.demo.structural.facade.src;

public class Cpu {

    public void start() {
        System.out.println("inicialização da cpu");
    }
    public void execute() {
        System.out.println("executa algo no processador");
    }
    public void load() {
        System.out.println("carrega registrador");
    }
    public void free() {
        System.out.println("libera registradores");
    }
}
