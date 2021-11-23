package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer{
    private List<Stock> stocks = new ArrayList<>();
    private Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void removeStock(Stock stock) {
        stocks.remove(stock);
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    @Override
    public void update() {
        System.out.println("StocklistView get notified: " + stock.getPrice());
    }
}
