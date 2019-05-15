package adapter;

import adapter.duck.Duck;
import adapter.duck.GreenheadDuck;
import adapter.turkey.Turkey;
import adapter.turkey.WildTurkey;

/**
 * @ClassName AdapterTest
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/15 9:35
 * @Version 1.0
 **/
public class AdapterTest {
    public static void main(String[] args) {
        Duck duck = new GreenheadDuck();
        Turkey turkey = new WildTurkey();
        //火鸡模仿鸭子 火鸡转鸭子
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        Duck turkeyAdapterClass = new TurkeyAdapterClass();
        duck.fly();
        duck.quack();
        turkey.fly();
        turkey.gobble();
        turkeyAdapter.fly();
        turkeyAdapter.quack();
        turkeyAdapterClass.fly();
        turkeyAdapterClass.quack();
    }
}
