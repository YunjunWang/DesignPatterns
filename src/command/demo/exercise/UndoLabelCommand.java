package command.demo.exercise;

public class UndoLabelCommand implements Action{
    private LabelActionHistory history;

    public UndoLabelCommand(LabelActionHistory history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().unexecute();
    }
}
