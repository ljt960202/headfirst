package factory.simpleFactory;

import factory.pizza.CheesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.PepperPizza;
import factory.pizza.Pizza;

/**
 * @ClassName SimplePizzaFactory
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 11:14
 * @Version 1.0
 **/
public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType){
        Pizza pizza =null ;
        if(pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }else if (pizzaType.equals("greek")){
            pizza = new GreekPizza();
        }else if (pizzaType.equals("pepper")){
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
