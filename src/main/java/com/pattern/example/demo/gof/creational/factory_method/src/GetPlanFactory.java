package com.pattern.example.demo.gof.creational.factory_method.src;

public class GetPlanFactory {

    public Plan getPlan(PlanType planType) {
        switch (planType) {
            case COMMERCIALPLAN:
                return new CommercialPlan();
            case INSTITUTIONALPLAN:
                return new InstitutionalPlan();
            case DOMESTICPLAN:
                return new DomesticPlan();
            default:
                return new CommercialPlan();
        }
    }
}