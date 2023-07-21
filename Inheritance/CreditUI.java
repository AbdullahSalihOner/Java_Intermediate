package Inheritance;

public class CreditUI {
    public void CalculateCredit(BaseCreditManager baseCreditManager) {
        System.out.println(baseCreditManager.Calculate(1000));
    }
}
