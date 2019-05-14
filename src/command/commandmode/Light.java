package command.commandmode;

/**
 * @ClassName Light
 * @Description 台灯对象
 * @Author Duplicator
 * @Date 2019/5/13 16:36
 * @Version 1.0
 **/
public class Light {
    String loc = "";

    public Light(String loc) {
        this.loc = loc;
    }

    public void on(){
        System.out.println(loc+" on");
    }

    public void off(){
        System.out.println(loc+" off");
    }
}
