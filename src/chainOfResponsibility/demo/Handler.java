package chainOfResponsibility.demo;

import chainOfResponsibility.problem.HttpRequest;

public abstract class Handler {
    // each objects in the chain only knows the next
    // once it finishes its own task, it'll pass on to the next in the pipeline
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract boolean doHandle(HttpRequest request);

    public void handle(HttpRequest request) {
        // if finished, stop processing the next in the pipeline
        if (doHandle(request))
            return;
        // if next is valid, then pass on to the next object
        if (next != null)
            next.handle(request);
    }
}
