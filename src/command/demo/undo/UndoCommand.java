package command.demo.undo;

public class UndoCommand implements Command{
    private CommandHistory history;

    public UndoCommand(CommandHistory history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().unexecute();
    }
}
