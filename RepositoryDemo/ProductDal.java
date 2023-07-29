package RepositoryDemo;

public class ProductDal implements IEntityRepository<Product>{
    @Override
    public void add(Product entity) {
        System.out.println("Product added.");
    }
    @Override
    public void delete(Product entity) {
        System.out.println("Product deleted.");
    }
    @Override   
    public void update(Product entity) {
        System.out.println("Product updated.");
    }
}
