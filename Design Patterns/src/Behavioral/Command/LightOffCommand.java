package Behavioral.Command;

public class LightOffCommand implements ICommand{

    Receiver receiver;
    public LightOffCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void unexecute() {
        receiver.on();
    }
}
