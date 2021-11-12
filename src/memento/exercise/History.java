package memento.exercise;

import java.util.ArrayList;
import java.util.List;

public class History {
    List <Memento> states = new ArrayList<Memento>();

    public void push (Memento state) {
        states.add(state);
    }

    public Memento pop() {
        int lastIndex = states.size() - 1;
        Memento lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }

    public String revertContent() {
        int lastIndex = states.size() - 1;
        Memento lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState.getContent();
    }
}
