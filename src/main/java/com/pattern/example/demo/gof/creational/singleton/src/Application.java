package com.pattern.example.demo.gof.creational.singleton.src;

import java.io.IOException;

public class Application {

    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = GetPlanFactory.getInstance();

        Plan p = planFactory.getPlan(PlanType.DOMESTICPLAN);

        p.getRate();
        p.calculateBill(10);
    }
}
