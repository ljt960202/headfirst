package strategy.duck.impl;

import strategy.duck.Duck;
import strategy.flybehavior.impl.FlyWithWings;
import strategy.quackbehavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("我是一只野鸭");
    }

}
