package Creational.Factory;

public class ConcreteProductA implements Product {

    @Override
    public void build(){
        System.out.println("Hello I'm PRODUCT_A");
    }
}
