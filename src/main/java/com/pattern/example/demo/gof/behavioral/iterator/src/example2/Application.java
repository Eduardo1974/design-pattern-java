package com.pattern.example.demo.gof.behavioral.iterator.src.example2;

public class Application {

    public static void main(String[] args) {

        Container namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
