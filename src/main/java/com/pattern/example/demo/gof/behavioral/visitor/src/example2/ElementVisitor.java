package com.pattern.example.demo.gof.behavioral.visitor.src.example2;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing xml element with uuid: " + xe.uuid);
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("processing json element with uuid: " + je.uuid);
    }
}