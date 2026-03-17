package models;

import observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(status);
        }
    }
}