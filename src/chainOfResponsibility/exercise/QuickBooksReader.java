package chainOfResponsibility.exercise;

public class QuickBooksReader extends FileReader {

    public QuickBooksReader(FileReader next) {
        super(next);
    }

    @Override
    public void doReading(File file) {
        System.out.println("Reading data from a QuickBooks file.");
    }

    @Override
    public String getExtension() {
        return ".qbw";
    }
}
