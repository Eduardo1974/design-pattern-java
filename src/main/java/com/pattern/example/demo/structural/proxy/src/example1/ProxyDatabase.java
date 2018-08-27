package com.pattern.example.demo.structural.proxy.src.example1;

public class ProxyDatabase extends UserDatabase {

    protected String user, pass;

    public ProxyDatabase(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public String getAmountUsers() {
        if (hasConnectionPermission()) {
            return super.getAmountUsers();
        }
        return null;
    }

    @Override
    public String getConnectedUsers() {
        if (hasConnectionPermission()) {
            return super.getConnectedUsers();
        }
        return null;
    }

    private boolean hasConnectionPermission() {
        return user == "admin" && pass == "admin";
    }
}
