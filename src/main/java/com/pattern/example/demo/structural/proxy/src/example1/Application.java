package com.pattern.example.demo.structural.proxy.src.example1;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hacker acessando >(");
        UserDatabase database = new ProxyDatabase("Hacker", "1234");
        System.out.println(database.getAmountUsers());
        System.out.println(database.getConnectedUsers());

        System.out.println("\nAdministrador acessando :)");
        database = new ProxyDatabase("admin", "admin");
        System.out.println(database.getAmountUsers());
        System.out.println(database.getConnectedUsers());
    }
}
