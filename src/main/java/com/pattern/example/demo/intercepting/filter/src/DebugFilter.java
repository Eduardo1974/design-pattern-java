package com.pattern.example.demo.intercepting.filter.src;

public class DebugFilter implements Filter {

    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
