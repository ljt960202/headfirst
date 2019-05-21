package iterator;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/21 10:23
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        CakeHouseMenu cakeHouseMenu = new CakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        waitress.addIterator(cakeHouseMenu.getIterator());
        waitress.addIterator(dinerMenu.getIterator());
        waitress.printMenu();
    }
}
