package command.commandmode;

/**
 * @ClassName Stereo
 * @Description 音响
 * @Author Duplicator
 * @Date 2019/5/13 16:38
 * @Version 1.0
 **/
public class Stereo {
    public static int volume = 0;

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void setCd(){
        System.out.println("Stereo setCd");
    }

    public void setVol(int vol){
        volume = vol;
        System.out.println("Stereo volume="+volume);
    }
    public int getVol(){
        return volume;
    }
    public void start(){
        System.out.println("Stereo Start");
    }
}
