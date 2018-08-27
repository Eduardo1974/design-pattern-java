package com.pattern.example.demo.structural.proxy.src.example2;

public class PersonDAO {

    public static Person getPersonByID(String id){
        System.out.println("select * from PESSOA where id="+id);
        return new PersonImpl(id,"Pessoa " + id);
    }
}
