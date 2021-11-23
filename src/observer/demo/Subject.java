package observer.demo;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject <T>{

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // push style
    public void notifyObservers(T value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    // pull style
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
