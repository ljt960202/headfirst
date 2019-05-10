package factory.abstractfactory;

import factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 14:26
 * @Version 1.0
 **/
public class OrderPizza {
    private AbstractFactory abstractFactory;
    public OrderPizza(AbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;
        String orderType;
        Pizza pizza = null;
        do{
            orderType=getType();
            pizza =getAbstractFactory().createPizza(orderType);
            if(pizza==null){
                System.out.println("没有输入有效的pizza");
            }else{
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }

    public AbstractFactory getAbstractFactory() {
        return abstractFactory;
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
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
