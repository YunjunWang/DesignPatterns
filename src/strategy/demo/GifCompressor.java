package strategy.demo;

public class GifCompressor implements Compressor{
    @Override
    public void compress(String file) {
        System.out.println("Compressing GIF image...");
    }
}
