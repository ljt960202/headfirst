package decorator.coffeebar.demo;

public class Espress extends Beverage{
    public Espress(){
        description="Espress";
    }
    @Override
    public double cost() {
        return 7.6;
    }
}
