package command.demo.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class ContrastActionHistory {
    private Deque <ContrastCommand> commands = new ArrayDeque<>();
    public void push(ContrastCommand command) {
        commands.push(command);
    }
    public ContrastCommand pop() {
        return commands.pop();
    }
    public int size() {
        return commands.size();
    }
}
