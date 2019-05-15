package adapter;

import adapter.duck.Duck;
import adapter.turkey.WildTurkey;

/**
 * @ClassName TurkeyAdapterClass
 * @Description 类适配器 主要是多重继承 java没有所以用接口实现
 * @Author Duplicator
 * @Date 2019/5/15 10:18
 * @Version 1.0
 **/
public class TurkeyAdapterClass extends WildTurkey implements Duck {
    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }
}
