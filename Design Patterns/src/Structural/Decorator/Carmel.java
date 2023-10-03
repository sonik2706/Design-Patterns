package Structural.Decorator;

public class Carmel extends AddonDecorator{

    int price;
    Beverage beverage;

    public Carmel(Beverage beverage, int price){
        this.beverage = beverage;
        this.price = price;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + this.price;
    }
}
