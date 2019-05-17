package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName TeaWithHook
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/17 14:33
 * @Version 1.0
 **/
public class TeaWithHook extends HotDrinkTemplate{
    @Override
    public void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public boolean wantCondimentsHook() {
        System.out.println("Condiments,yes or no?please input(Y/N):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String result="";
        try {
            result = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(result.equalsIgnoreCase("N")){
            return false;
        }else{
            return true;
        }
    }
}
