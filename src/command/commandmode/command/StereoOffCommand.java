package command.commandmode.command;

import command.commandmode.Stereo;

/**
 * @ClassName StereoOnCommand
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 9:49
 * @Version 1.0
 **/
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
    }
}
