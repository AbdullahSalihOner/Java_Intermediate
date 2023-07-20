package Encapsulation;

public class Product {
    private int id;
    private String name;    
    private double price;
    private int quantity;
    private String description;

    public Product() {
        System.out.println("Constructor without parameters");
    }

    public Product(int id, String name, double price, int quantity, String description) {
        System.out.println("Constructor with parameters");
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int GetId() {
        return id;
    }
    public void SetId(int id) {
        this.id = id;
    }
    public String GetName() {
        return name;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public double GetPrice() {
        return price;
    }
    public void SetPrice(double price) {
        this.price = price;
    }
    public int GetQuantity() {
        return quantity;
    }
    public void SetQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String GetDescription() {
        return description;
    }
    public void SetDescription(String description) {
        this.description = description;
    }

}
