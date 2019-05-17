package template;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/17 14:18
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        HotDrink coffee = new Coffee();
        //coffee.prepareRecipe();
        HotDrinkTemplate tea = new TeaWithHook();
        tea.prepareRecipe();
    }

}
