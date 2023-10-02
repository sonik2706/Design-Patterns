package Behavioral.Strategy;

public class Client {

    IBehavior behavior;
    public Client(IBehavior behavior){
        this.behavior = behavior;
    }

    public void execute(){
        this.behavior.run();
    }

}
