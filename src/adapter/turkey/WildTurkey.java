package adapter.turkey;

/**
 * @ClassName WildTurkey
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/15 9:33
 * @Version 1.0
 **/
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("go go");
    }

    @Override
    public void fly() {
        System.out.println("I can fly short distances");
    }
}
