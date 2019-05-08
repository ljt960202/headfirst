package decorator.coffeebar.demo;

public class Mocha extends CondimentDecorator{
    public Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+1.2;
    }
}
