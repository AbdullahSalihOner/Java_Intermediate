package Generics;

public class Main {
    public static void main(String[] args){
        MyList<Customer> customers = new MyList<Customer>();
        customers.add(new Customer());
        customers.remove(new Customer());
        customers.add(new Customer());
    }
}
