package Structural.Decorator;

public class Espresso extends Beverage {

    int price;

    public Espresso(int price){
        this.price = price;
    }

    @Override
    public int cost() {
        return price;
    }
}
