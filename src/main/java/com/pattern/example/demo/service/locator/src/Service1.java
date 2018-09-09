package com.pattern.example.demo.service.locator.src;

/**
 * Created by eduardo on 21/12/17.
 */
public class Service1 implements Service {

    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}

