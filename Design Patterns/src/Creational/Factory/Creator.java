package Creational.Factory;

public abstract class Creator {
    public Product someOperation(){
        Product product = factoryMethod();
        product.build();

        return product;
    }
    public abstract Product factoryMethod();
}
