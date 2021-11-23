package observer.demo;

import observer.demo.Subject;

public class DataSource<T> extends Subject{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        // push style
        notifyObservers(value);

        // pull style
        notifyObservers();
    }

}
