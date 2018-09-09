package com.pattern.example.demo.gof.behavioral.interpreter.src.example1;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        //String roman = "MCMXXVIII";
        String roman = "XXVIII";
        Context context = new Context(roman);

        // Build the 'parse tree'
        ArrayList<Expression> tree = new ArrayList<Expression>();
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());

        // Interpret
        for (Expression expression : tree) {
            expression.interpret(context);
        }

        System.out.println(roman + " = " + Integer.toString(context.getOutput()));
    }
}
