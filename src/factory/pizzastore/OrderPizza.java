package factory.pizzastore;

import factory.pizza.CheesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.PepperPizza;
import factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 10:11
 * @Version 1.0
 **/
public class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String ordertype;
        do{
            ordertype = getType();
            if(ordertype.equals("cheese")){
                pizza = new CheesePizza();
            }else if (ordertype.equals("greek")){
                pizza = new GreekPizza();
            }else if (ordertype.equals("pepper")){
                pizza = new PepperPizza();
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }
    private String getType(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        try {
            String str = bufferedReader.readLine();
            return  str;
        } catch (IOException e) {
            e.printStackTrace();
            return  "";
        }

    }
}
