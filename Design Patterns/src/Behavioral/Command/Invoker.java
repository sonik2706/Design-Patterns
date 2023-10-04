package Behavioral.Command;

public class Invoker {

    public ICommand on;
    public ICommand off;

    public Invoker(ICommand on, ICommand off) {
        this.on = on;
        this.off = off;
    }

    public void clickOn(){
        this.on.execute();
    }

    public  void clickOff(){
        this.off.execute();
    }
}
