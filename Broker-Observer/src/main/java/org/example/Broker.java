package org.example;

import java.util.ArrayList;
import java.util.List;

public class Broker implements Observable {

    private List<Observer> observerList;

    private float fluctuation;

    public Broker() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update(fluctuation);
        }
    }

    public void setNewValue(float fluctuation) {
        this.fluctuation = fluctuation;
        notifyObservers();
    }
}
