package factory.pizza;

/**
 * @ClassName PepperPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 10:16
 * @Version 1.0
 **/
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("PepperPizza");
        System.out.println(name+" preparing;");
    }
}
