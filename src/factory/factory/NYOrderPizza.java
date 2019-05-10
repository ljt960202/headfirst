package factory.factory;

import factory.pizza.*;

/**
 * @ClassName LDOrderPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 14:15
 * @Version 1.0
 **/
public class NYOrderPizza extends OrderPizza {
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
