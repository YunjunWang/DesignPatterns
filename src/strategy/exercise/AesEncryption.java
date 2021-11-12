package strategy.exercise;

public class AesEncryption implements Encrypt{
    @Override
    public void apply(String message) {
        System.out.println("Apply AES encryption.");
    }
}
