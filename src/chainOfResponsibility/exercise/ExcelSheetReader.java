package chainOfResponsibility.exercise;

public class ExcelSheetReader extends FileReader {

    public ExcelSheetReader(FileReader next) {
        super(next);
    }

    @Override
    public void doReading(File file) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }

    @Override
    public String getExtension() {
        return ".xsl";
    }
}
