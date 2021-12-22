package chainOfResponsibility.problem;

import chainOfResponsibility.demo.Handler;

public class Authenticator extends Handler {
//    public boolean authenticate(HttpRequest request) {
//        boolean isValid = request.getUsername() == "username" &&
//                request.getPassword() == "12345";
//        return isValid;
//    }
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isValid = request.getUsername() == "username" &&
                request.getPassword() == "12345";
        System.out.println("Authentication");
        return !isValid;
    }
}
