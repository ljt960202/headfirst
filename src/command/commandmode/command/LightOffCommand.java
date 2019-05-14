package command.commandmode.command;

import command.commandmode.Light;

/**
 * @ClassName LightOnCommand
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 9:48
 * @Version 1.0
 **/
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
