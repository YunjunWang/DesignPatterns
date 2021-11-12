package Command.Demo.undo;

public interface UndoableCommand extends Command{
    void unexecute();
}
