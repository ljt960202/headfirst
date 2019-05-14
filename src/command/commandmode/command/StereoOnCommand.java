package command.commandmode.command;

import command.commandmode.Stereo;

/**
 * @ClassName StereoOnCommand
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 9:49
 * @Version 1.0
 **/
public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
