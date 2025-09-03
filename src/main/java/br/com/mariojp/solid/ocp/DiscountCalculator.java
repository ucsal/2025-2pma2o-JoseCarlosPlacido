package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    
    private final Map<CustomerType, DiscountPolicy> policies = new HashMap<>();

    public DiscountCalculator() {

        policies.put(CustomerType.REGULAR, new RegularDiscountPolicy());
        policies.put(CustomerType.PREMIUM, new PremiumDiscountPolicy());
        policies.put(CustomerType.PARTNER, new PartnerDiscountPolicy());
    }

    public double apply(double amount, CustomerType type) {
        DiscountPolicy policy = policies.get(type);

        if (policy != null) {
            return policy.applyDiscount(amount);
        }
        
        return amount;
    }
}