package MomentoPattern.Document.Prototype;

import java.lang.management.MonitorInfo;
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List <Momento> states = new ArrayList();

    public void push(Momento state) {
        states.add(state);
    }

    public Momento pop() {
        int lastIndex = states.size() - 1;
        Momento lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}
