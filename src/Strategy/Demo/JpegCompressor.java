package Strategy.Demo;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String file) {
        System.out.println("Compressing JPEG image...");
    }
}
