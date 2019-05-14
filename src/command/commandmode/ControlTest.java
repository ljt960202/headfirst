package command.commandmode;

/**
 * @ClassName ControlTest
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/13 16:56
 * @Version 1.0
 **/
public class ControlTest {
    public static void main(String[] args) {
        Light light = new Light("BedRomm");
        Stereo stereo = new Stereo();
        Control control = new TraditionControl(light,stereo);
        control.onButton(0);
        control.offButton(0);
        control.onButton(1);
        control.onButton(2);
        control.offButton(2);
        control.offButton(1);
    }
}
