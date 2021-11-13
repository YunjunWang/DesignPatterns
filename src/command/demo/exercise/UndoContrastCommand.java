package command.demo.exercise;

public class UndoContrastCommand implements Action{
    private ContrastActionHistory history;

    public UndoContrastCommand(ContrastActionHistory history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().unexecute();
    }
}
