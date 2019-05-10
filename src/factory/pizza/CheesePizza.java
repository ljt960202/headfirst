package factory.pizza;

/**
 * @ClassName CheesePizza
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/10 10:17
 * @Version 1.0
 **/
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("CheesePizza");
        System.out.println(name+" preparing;");
    }
}
