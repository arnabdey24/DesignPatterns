package observer;

import java.util.ArrayList;

public class Ship implements Observable{

    private ArrayList<Observer> observers;
    private String name;

    public Ship(String name) {
        this.name=name;
        observers=new ArrayList<>();
    }

    public void move(){
        System.out.println("Ship "+name+" has moved.");
        notifyObserves();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserves() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
