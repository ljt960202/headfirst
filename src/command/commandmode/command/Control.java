package command.commandmode.command;

public interface Control {
    public void onButton(int slot);

    public void offButton(int slot);

    public void undoButton(int slot);
}
