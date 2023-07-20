package Encapsulation;

public class ProductManager {
    public void Add(Product product) {
        System.out.println("Added product: " + product.GetName());
    }
    public void Add2(int id, String name, double price, int quantity, String description) {
        System.out.println("Added product: " + name);
    }
}
