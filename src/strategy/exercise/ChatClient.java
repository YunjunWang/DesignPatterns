package strategy.exercise;

public class ChatClient {

    public void send(String message, Encrypt encrypt) {
        encrypt.apply(message);
        System.out.println("Sending the encrypted message...");
    }
}
