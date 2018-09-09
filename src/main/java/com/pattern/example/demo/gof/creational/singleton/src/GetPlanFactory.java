package com.pattern.example.demo.gof.creational.singleton.src;

public class GetPlanFactory {

    public static GetPlanFactory instance;

    private GetPlanFactory() {
    }

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

    // Thread Safe Singleton
    public synchronized static GetPlanFactory getInstance() {
        if (instance == null)
            instance = new GetPlanFactory();
        return instance;
    }
}