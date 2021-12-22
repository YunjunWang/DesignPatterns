package chainOfResponsibility.exercise;

public class NumbersSheetReader extends FileReader {

    public NumbersSheetReader(FileReader next) {
        super(next);
    }

    @Override
    public void doReading(File file) {
        System.out.println("Reading data from a Numbers spreadsheet.");
    }

    @Override
    public String getExtension() {
        return ".numbers";
    }
}
