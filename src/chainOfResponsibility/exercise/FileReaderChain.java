package chainOfResponsibility.exercise;

public class FileReaderChain {
    private FileReader fileReader;
    public FileReaderChain(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void read(File file) {
        fileReader.read(file);
    }
    //    public void read(String fileName) {
//        if (fileName.endsWith(".xls")) {
//            System.out.println("Reading data from an Excel spreadsheet.");
//        }
//        else if (fileName.endsWith(".numbers")) {
//            System.out.println("Reading data from a Numbers spreadsheet.");
//        }
//        else if (fileName.endsWith(".qbw")) {
//            System.out.println("Reading data from a QuickBooks file.");
//        }
//        else
//            throw new UnsupportedOperationException("File format not supported.");
//    }
}
