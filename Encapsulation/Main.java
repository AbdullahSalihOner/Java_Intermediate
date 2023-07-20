package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.SetId(1);
        product.SetName("Product 1");
        product.SetPrice(10);
        product.SetQuantity(5);
        product.SetDescription("Description 1");

        ProductManager productManager = new ProductManager();   
        productManager.Add(product);

        productManager.Add2(1, "Product 2", 20, 10, "Description 2");
    }
}
