package chainOfResponsibility.exercise;

public class DataReaderChain {
    public static FileReader getDataReaderChain() {
        var excelReader = new ExcelSheetReader(null);
        var numbersReader = new NumbersSheetReader(excelReader);
        var quickBooksReader = new QuickBooksReader(numbersReader);

//        var excelReader = new ExcelSheetReader();
//        var numbersReader = new NumbersSheetReader();
//        var quickBooksReader = new QuickBooksReader();

//        quickBooksReader.setNext(numbersReader);
//        numbersReader.setNext(excelReader);

        return quickBooksReader;
    }
}
