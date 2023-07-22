package Polymorphism;

public class TeacherCreditManager extends BaseCreditManager{
    public double calculate(double amount) {
        return amount * 1.15;
    }
}
