package strategy;

import strategy.duck.Duck;
import strategy.duck.impl.MallardDuck;
import strategy.flybehavior.impl.FlyNoWay;
import strategy.quackbehavior.impl.MuteQuack;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new MuteQuack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
