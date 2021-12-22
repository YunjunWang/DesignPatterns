package chainOfResponsibility.problem;

import chainOfResponsibility.demo.Handler;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest httpRequest) {
        // Authentication
        // Logging
        // Compression
        // All abstracted by the pipeline of handler therefore
        // it's open for extension and closed for modifications
        handler.handle(httpRequest);
    }
}
