package decorator.coffeebar.coffee;

import decorator.coffeebar.Drink;

public class Coffee extends Drink {
    @Override
    public float getCost() {
        return super.getPrice();
    }
}
