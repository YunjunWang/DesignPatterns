package strategy.demo;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String file) {
        System.out.println("Blacking and White filtering...");
    }
}
