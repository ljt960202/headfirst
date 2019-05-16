package facade.entity;

/**
 * @ClassName Projector
 * @Description 投影仪
 * @Author Duplicator
 * @Date 2019/5/16 10:42
 * @Version 1.0
 **/
public class Projector {
    private int size=5;

    private static Projector instance = null;

    private Projector() {

    }

    public static Projector getInstance() {
        if (instance == null) {
            instance = new Projector();
        }

        return instance;
    }

    public void on() {
        System.out.println("Projector On");
    }

    public void off() {
        System.out.println("Projector Off");
    }

    public void focus() {
        System.out.println("Popcorn is focus");
    }

    public void zoom(int size) {
        this.size=size;
        System.out.println("Popcorn zoom to"+size);
    }
}
