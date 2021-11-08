package Strategy.Exercise;

public class UnsupportedEncryption implements Encrypt{
    @Override
    public void apply(String message) {
        throw new UnsupportedOperationException("Unsupported encryption algorithm.");
    }
}
