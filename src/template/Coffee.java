package template;

/**
 * @ClassName Coffee
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/17 14:12
 * @Version 1.0
 **/
public class Coffee extends HotDrink{

    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
