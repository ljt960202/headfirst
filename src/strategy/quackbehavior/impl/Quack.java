package strategy.quackbehavior.impl;

import strategy.quackbehavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("真的呱呱叫");
    }
}
