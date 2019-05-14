package command.commandmode.command;

/**
 * @ClassName MacroCommand
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 15:09
 * @Version 1.0
 **/
public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
