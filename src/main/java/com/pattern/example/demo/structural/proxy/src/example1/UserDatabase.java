package com.pattern.example.demo.structural.proxy.src.example1;

class UserDatabase {

    private int userAmount;
    private int connectedUsers;

    public UserDatabase() {
        userAmount = (int) (Math.random() * 100);
        connectedUsers = (int) (Math.random() * 10);
    }

    public String getAmountUsers() {
        return new String("Total de usuários: " + userAmount);
    }

    public String getConnectedUsers() {
        return new String("Usuários conectados: " + connectedUsers);
    }
}
