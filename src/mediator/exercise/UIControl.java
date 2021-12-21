package mediator.exercise;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<EventHandler> eventHandlers = new ArrayList<>();
    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (EventHandler e : eventHandlers)
            e.handle();
    }
}
