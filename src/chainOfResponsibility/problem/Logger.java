package chainOfResponsibility.problem;

import chainOfResponsibility.demo.Handler;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

//    public void log(HttpRequest httpRequest) {
//        System.out.println("Log");
//    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}
