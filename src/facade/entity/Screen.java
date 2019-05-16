package facade.entity;

/**
 * @ClassName Screen
 * @Description 屏幕
 * @Author Duplicator
 * @Date 2019/5/16 10:43
 * @Version 1.0
 **/
public class Screen {
    private static Screen instance = null;

    private Screen() {

    }

    public static Screen getInstance() {
        if (instance == null) {
            instance = new Screen();
        }

        return instance;
    }

    public void up() {
        System.out.println("Screen  up");
    }

    public void down() {
        System.out.println("Screen  down");
    }
}
