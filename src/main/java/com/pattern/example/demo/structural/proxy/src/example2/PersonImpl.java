package com.pattern.example.demo.structural.proxy.src.example2;

public class PersonImpl implements Person {

    private String id;
    private String name;

    public PersonImpl(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Retornou a pessoa do banco de dados ->  " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }
}
