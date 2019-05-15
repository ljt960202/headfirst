package adapter.duck;

/**
 * @ClassName GreenheadDuck
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/15 9:31
 * @Version 1.0
 **/
public class GreenheadDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("ga ga");
    }

    @Override
    public void fly() {
        System.out.println("I can fly long distances");
    }
}
