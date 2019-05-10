package factory.abstractfactory;

import factory.pizza.Pizza;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 14:24
 * @Version 1.0
 **/
public interface AbstractFactory  {
    public Pizza createPizza(String orderType);
}
