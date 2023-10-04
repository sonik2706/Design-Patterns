package Behavioral.Command;

public class LightOnCommand implements ICommand{

    Receiver receiver;

    public LightOnCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void unexecute() {
        receiver.off();
    }
}
