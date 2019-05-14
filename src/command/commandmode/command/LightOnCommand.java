package command.commandmode.command;

import command.commandmode.Light;

/**
 * @ClassName LightOnCommand
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 9:48
 * @Version 1.0
 **/
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
