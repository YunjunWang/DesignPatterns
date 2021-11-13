package command.demo.exercise;

public interface UndoableAction extends Action{
    void unexecute();
}
