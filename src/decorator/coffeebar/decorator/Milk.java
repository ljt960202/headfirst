package decorator.coffeebar.decorator;

import decorator.coffeebar.Drink;

public class Milk extends Decorator {
    public Milk(Drink drink){
        super(drink);
        super.setDescription("Milk");
        super.setPrice(1.0f);
    }
}
