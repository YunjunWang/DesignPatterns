package observer.demo;

public class Spreadsheet implements Observer {
    private DataSource dataSource;

    public Spreadsheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // pull style
    @Override
    public void update() {
        System.out.println("Pull Style - Spreadsheet get notified: " + dataSource.getValue());
    }

    // push style
    @Override
    public void update(Object value) {
        System.out.println("Push Style - Spreadsheet get notified: " + value);
    }
}
