package com.pattern.example.demo.gof.behavioral.visitor.src.example2;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}