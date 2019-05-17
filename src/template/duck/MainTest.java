package template.duck;

import java.util.Arrays;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/17 15:00
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("duck1",(int)(Math.random()*100)),
                new Duck("duck2",(int)(Math.random()*100)),
                new Duck("duck3",(int)(Math.random()*100)),
                new Duck("duck4",(int)(Math.random()*100)),
                new Duck("duck5",(int)(Math.random()*100)),
                new Duck("duck6",(int)(Math.random()*100)),
                new Duck("duck7",(int)(Math.random()*100)),
                new Duck("duck8",(int)(Math.random()*100)),
                new Duck("duck9",(int)(Math.random()*100)),
                new Duck("duck10",(int)(Math.random()*100)),
                new Duck("duck11",(int)(Math.random()*100))
        };
        System.out.println("before sort:");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("affter sort:");
        display(ducks);
    }
    public static void display(Duck[] ducks){
        for (Duck duck : ducks) {
            System.out.println(duck.name+" weight:"+duck.weight);
        }
    }
}
