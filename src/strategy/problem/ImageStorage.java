package strategy.problem;

import strategy.Compressor;
import strategy.Filter;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        switch (compressor) {
            case JPEG:
                System.out.println("Compress to JPEG");
                break;
            case GIF:
                System.out.println("Compress to GIF");
                break;
            default:
                break;
        }

        switch (filter) {
            case B_W:
                System.out.println("Filter to Black and White");
                break;
            default:
                break;
        }
    }
}
