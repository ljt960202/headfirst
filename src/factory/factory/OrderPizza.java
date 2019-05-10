package factory.factory;

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
public abstract class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do{
            orderType=getType();
            pizza = createPizza(orderType);
            if(pizza==null){
                System.out.println("没有输入的pizza");
            }else{
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);

    }

    public abstract Pizza createPizza(String orderType);


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
