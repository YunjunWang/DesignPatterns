package strategy.exercise;

public class DesEncryption implements Encrypt{
    @Override
    public void apply(String message) {
        System.out.println("Apply DES encryption.");
    }
}
