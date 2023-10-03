package Behavioral.Observer;

import java.util.LinkedList;
import java.util.List;

public class Subject implements ISubject{

    int data;
    List<IObserver> observers = new LinkedList<IObserver>();

    public Subject(int data){
        this.data = data;
    }

    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: this.observers){
            observer.update();
        }
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "data=" + data +
                '}';
    }
}
