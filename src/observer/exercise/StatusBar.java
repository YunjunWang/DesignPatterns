package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer{
    private List<Stock> popularStocks = new ArrayList<>();
    private Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
    }

    public void addStock(Stock stock) {
        popularStocks.add(stock);
    }

    public void removeStock(Stock stock) {
        popularStocks.remove(stock);
    }

    public List<Stock> getPopularStocks() {
        return popularStocks;
    }

    @Override
    public void update() {
        System.out.println("StatusBar get notified: " + stock.getPrice());
    }
}
