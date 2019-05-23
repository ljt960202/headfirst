package composite;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/22 10:32
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        CakeHouseMenu cakeHouseMenu = new CakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        waitress.addComponent(cakeHouseMenu);
        waitress.addComponent(dinerMenu);
        waitress.printMenu();
    }
}
