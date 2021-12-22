package chainOfResponsibility.exercise;

public abstract class FileReader {
    private FileReader next;

    public FileReader(FileReader next) {
        this.next = next;
    }

//    public void setNext(FileReader next) {
//        this.next = next;
//    }
    public void read(File file) {
        if (file.getFileName().endsWith(getExtension())) {
            this.doReading(file);
            return;
        }
        if (next != null) {
            next.read(file);
        }
        else
            System.out.println("File format not supported for file: " + file.getFileName());
//            throw new UnsupportedOperationException("File format not supported.");
    }

    public abstract void doReading(File file);
    public abstract String getExtension();
}
