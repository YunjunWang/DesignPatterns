package Memento.Document;

import java.util.ArrayList;
import java.util.List;

public class History {
    List <Momento> states = new ArrayList<Momento>();

    public void push (Momento state) {
        states.add(state);
    }

    public Momento pop() {
        int lastIndex = states.size() - 1;
        Momento lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }

    public String revertContent() {
        int lastIndex = states.size() - 1;
        Momento lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState.getContent();
    }
}
