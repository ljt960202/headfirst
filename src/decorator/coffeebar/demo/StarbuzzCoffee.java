package decorator.coffeebar.demo;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espress();
        System.out.println(beverage.getDescription()+":"+beverage.cost());
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription()+":"+beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()+":"+beverage.cost());
    }
}
