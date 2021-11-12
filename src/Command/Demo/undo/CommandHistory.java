package Command.Demo.undo;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {
    private Deque <BoldCommand> commands = new ArrayDeque<>();

    public void push(BoldCommand command) {
        commands.push(command);
    }

    public BoldCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
