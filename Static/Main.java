package Static;

public class Main {
    public static void main(String[] args){
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Crud.update();
    }
}
