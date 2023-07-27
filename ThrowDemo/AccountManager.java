package ThrowDemo;

public class AccountManager {
        private double balance;

        public void deposit(double amount){
            balance = getBalance() + amount;
        }
        public void withdraw(double amount) throws BalanceInsufficentExcepiton{
            if(balance >= amount){
                balance = getBalance() - amount;
            }else{
                throw new BalanceInsufficentExcepiton("Insufficient Balance");
            }
        }


        public double getBalance(){
            return balance;
        }
}
