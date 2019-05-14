package command.commandmode.command;

import command.commandmode.Stereo;

/**
 * @ClassName StereoOnCommand
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 9:49
 * @Version 1.0
 **/
public class StereoAddVolCommand implements Command {
    private Stereo stereo;

    public StereoAddVolCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        int vol = stereo.getVol();
        if(vol<11){
            stereo.setVol(++vol);
        }
    }

    @Override
    public void undo() {
        int vol = stereo.getVol();
        if(vol>0){
            stereo.setVol(--vol);
        }
    }
}
