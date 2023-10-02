package Behavioral.Observer;

public class Observer implements IObserver{

    int data;
    Subject subject;

    @Override
    public void update() {
        this.data = this.subject.getData();
    }

    public Observer(Subject subject){
        this.subject = subject;
    }
}
