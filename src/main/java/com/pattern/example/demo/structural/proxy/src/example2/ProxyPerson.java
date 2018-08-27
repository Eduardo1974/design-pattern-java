package com.pattern.example.demo.structural.proxy.src.example2;

public class ProxyPerson implements Person {

    private String id;

    private Person person;

    public ProxyPerson(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        if (person == null) {
            //Apenas cria o objeto real quando chamar este método
            person = PersonDAO.getPersonByID(this.id);
        }
        return person.getName();
    }

    @Override
    public String getId() {
        return this.id;
    }
}
