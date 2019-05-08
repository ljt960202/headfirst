package decorator.coffeebar;

import decorator.coffeebar.coffee.Decaf;
import decorator.coffeebar.decorator.Milk;

public class CoffeBar {
    public static void main(String[] args) {
        Drink drink ;
        drink = new Decaf();
        System.out.println(drink.getDescription());
        System.out.println(drink.getCost());
        drink = new Milk(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.getCost());
        drink = new Milk(drink);
        System.out.println(drink.getDescription());
        System.out.println(drink.getCost());
    }
}
