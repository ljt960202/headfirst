package decorator.coffeebar.decorator;

import decorator.coffeebar.Drink;

public class Decorator extends Drink {
    private Drink drink;
    public Decorator(Drink drink){
        this.drink=drink;
    }
    @Override
    public float getCost() {
        return super.getPrice()+drink.getCost();
    }

    @Override
    public String getDescription() {
        return super.description+"-"+super.getPrice()+"&&"+drink.getDescription();
    }
}
