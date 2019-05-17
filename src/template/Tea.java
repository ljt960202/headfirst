package template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @ClassName Tea
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/17 14:17
 * @Version 1.0
 **/
public class Tea extends HotDrink{
    @Override
    public void brew() {
        System.out.println("brewing tea");
    }



    @Override
    public void addCondiments() {
        System.out.println("adding lemon");
    }
}
