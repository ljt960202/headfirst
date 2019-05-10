package factory.factory;

import factory.pizza.LDGreekPizza;
import factory.pizza.LDPepperPizza;
import factory.pizza.Pizza;

/**
 * @ClassName LDOrderPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 14:15
 * @Version 1.0
 **/
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza =null;
        if (orderType.equals("greek")){
            pizza = new LDGreekPizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
