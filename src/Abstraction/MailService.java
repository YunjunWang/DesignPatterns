package Abstraction;

// Abstraction principle
public class MailService {
    // interface that cares
    public void sendMail() {
        connect();
        authenticate();
        //send email
        disconnect();
    }

    // hide implementation details
    private void connect() {
        System.out.println("Connect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }
}
