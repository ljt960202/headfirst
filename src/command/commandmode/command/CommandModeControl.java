package command.commandmode.command;

import command.commandmode.command.Control;

import java.util.Stack;

/**
 * @ClassName CommandModeControl
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 9:55
 * @Version 1.0
 **/
public class CommandModeControl implements Control {
    private Command[] onCommands;
    private Command[] offCommands;

    private Stack<Command> stack = new Stack<Command>();
    public CommandModeControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        Command noCommand = new NoCommand();
        for (int i = 0; i < offCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void  setCommand(int solt,Command onCommand,Command offComand){
        onCommands[solt] = onCommand;
        offCommands[solt] = offComand;
    }

    @Override
    public void onButton(int slot) {
        onCommands[slot].execute();
        stack.push(onCommands[slot]);
    }

    @Override
    public void offButton(int slot) {
        offCommands[slot].execute();
        stack.push(offCommands[slot]);
    }

    @Override
    public void undoButton(int slot) {
        stack.pop().undo();
    }
}
