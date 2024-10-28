package com.eldars.camsystem;

import java.util.ArrayList;
import java.util.List;

public class Camera implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private String currentImage;

    public void captureImage(String newImage) {
        // Si la nueva imagen es distinta a la actual, se actualiza y se notifica a los observadores
        if (!newImage.equals(this.currentImage)) {
            this.currentImage = newImage;
            notifyObservers();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentImage);
        }
    }

}
