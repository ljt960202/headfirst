package factory.simpleFactory;

import factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 11:13
 * @Version 1.0
 **/
public class OrderPizza {
    private SimplePizzaFactory simplePizzaFactory;
    public OrderPizza(SimplePizzaFactory simplePizzaFactory){
        setSimplePizzaFactory(simplePizzaFactory);
        Pizza pizza = simplePizzaFactory.createPizza(getType());
        if(pizza==null){
            System.out.println("没有输入的pizza");
        }else{
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
    private void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
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
