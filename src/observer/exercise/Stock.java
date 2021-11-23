package observer.exercise;

public class Stock extends Observable{
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }
}
