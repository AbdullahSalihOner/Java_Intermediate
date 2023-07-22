package Polymorphism;

public class AgriculturalCreditManager extends BaseCreditManager{
    public double calculate(double amount) {
        return amount * 1.25;
    }
}
