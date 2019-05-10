package factory.pizza;

/**
 * @ClassName PepperPizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 10:16
 * @Version 1.0
 **/
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("LDPepperPizza");
        System.out.println(name+" preparing;");
    }
}
