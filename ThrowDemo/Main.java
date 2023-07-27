package ThrowDemo;

public class Main {
    
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Balance: " + accountManager.getBalance());

        accountManager.deposit(100);
        System.out.println("Balance: " + accountManager.getBalance());

        try {
            accountManager.withdraw(90);
        } catch (BalanceInsufficentExcepiton e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance: " + accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        } catch (BalanceInsufficentExcepiton e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + accountManager.getBalance());
    }
}
