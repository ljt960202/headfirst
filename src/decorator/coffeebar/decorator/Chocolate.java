package decorator.coffeebar.decorator;

import decorator.coffeebar.Drink;

public class Chocolate extends Decorator{
    public Chocolate(Drink drink){
        super(drink);
        super.setDescription("Chocolate");
        super.setPrice(1.1f);
    }
}
