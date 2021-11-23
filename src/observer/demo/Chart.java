package observer.demo;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // pull style
    @Override
    public void update() {
        System.out.println("Pull Style - Chart get notified: " + dataSource.getValue());
    }

    // push style
    @Override
    public void update(Object value) {
        System.out.println("Push Style - Chart get notified: " + value);
    }
}
