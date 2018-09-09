package com.pattern.example.demo.gof.creational.factory_method.src;

import java.io.IOException;

public class Application {

    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        Plan p = planFactory.getPlan(PlanType.DOMESTICPLAN);

        p.getRate();
        p.calculateBill(10);
    }
}
