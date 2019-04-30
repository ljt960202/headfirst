package strategy.flybehavior.impl;

import strategy.flybehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞行");
    }
}
