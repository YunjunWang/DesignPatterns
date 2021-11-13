package command.demo.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class LabelActionHistory {
    private Deque <LabelCommand> commands = new ArrayDeque<>();

    public void push(LabelCommand command) {
        commands.push(command);
    }

    public LabelCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
