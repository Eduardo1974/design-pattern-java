package com.pattern.example.demo.gof.behavioral.iterator.src.example2;

public class NameRepository implements Container {

    private String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}