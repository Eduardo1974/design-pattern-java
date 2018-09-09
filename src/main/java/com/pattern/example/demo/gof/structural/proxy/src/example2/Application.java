package com.pattern.example.demo.gof.structural.proxy.src.example2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        
        List<Person> people = new ArrayList<Person>();

        //Cria cada Proxy para encapsular o acesso a classe "PersonImpl"
        people.add(new ProxyPerson("A"));
        people.add(new ProxyPerson("B"));
        people.add(new ProxyPerson("C"));

        System.out.println("Nome: " + people.get(0).getName()); // busca do banco de dados
        System.out.println("Nome: " + people.get(1).getName()); // busca do banco de dados
        System.out.println("Nome: " + people.get(0).getName()); // já buscou esta pessoa... apenas retorna do cache...

        // A terceira pessoa nunca será consultada no banco de dados (melhor performance - lazy loading)
        System.out.println("Id da 3ª - " + people.get(2).getId());//pode imprimir o ID do objeto, e o proxy nao será inicializado.

    }
}
