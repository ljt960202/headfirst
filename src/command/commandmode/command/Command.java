package command.commandmode.command;

/**
 * @ClassName Command
 * @Description TODO
 * @Author Duplicator
 * @Date 2019/5/14 9:46
 * @Version 1.0
 **/
public interface Command {
    public void execute();
    public void undo();
}
