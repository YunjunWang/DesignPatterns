package command.demo.undo;

public interface UndoableCommand extends Command{
    void unexecute();
}
