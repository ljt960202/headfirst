package facade;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/16 11:02
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }
}
