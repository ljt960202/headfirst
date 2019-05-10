package factory.abstractfactory;

import factory.factory.OrderPizza;
import factory.pizza.NYGreekPizza;
import factory.pizza.NYPepperPizza;
import factory.pizza.Pizza;

/**
 * @ClassName LDOrderPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 14:15
 * @Version 1.0
 **/
public class NYOrderPizza implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza =null;
        if (orderType.equals("greek")){
            pizza = new NYGreekPizza();
        }else if(orderType.equals("pepper")){
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
