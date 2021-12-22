package chainOfResponsibility.problem;

import chainOfResponsibility.demo.Handler;

public class Compressor extends Handler {
//    public void compress(HttpRequest request) {
//        System.out.println("Compression");
//    }
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compression");
        return false;
    }
}
