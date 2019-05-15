package adapter;

import adapter.duck.Duck;
import adapter.turkey.Turkey;

/**
 * @ClassName TurkeyAdapter
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/15 9:34
 * @Version 1.0
 **/
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 6; i++) {
            turkey.fly();
        }
    }
}
