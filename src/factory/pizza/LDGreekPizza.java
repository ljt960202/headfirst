package factory.pizza;

/**
 * @ClassName GreekPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 10:32
 * @Version 1.0
 **/
public class LDGreekPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("LDGreekPizza");
        System.out.println(name+" preparing;");
    }
}
