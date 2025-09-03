package br.com.mariojp.solid.ocp;

public class PremiumDiscountPolicy implements DiscountPolicy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90;
    }
}