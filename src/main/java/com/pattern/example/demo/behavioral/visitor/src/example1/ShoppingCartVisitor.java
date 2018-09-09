package com.pattern.example.demo.behavioral.visitor.src.example1;

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}