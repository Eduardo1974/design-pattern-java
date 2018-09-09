package com.pattern.example.demo.gof.behavioral.iterator.src.example2;

public class NameIterator implements Iterator {

    int index;

    private String names[] = null;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {

        if (index < names.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}