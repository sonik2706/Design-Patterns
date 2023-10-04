package Behavioral.Command;

public class Receiver {

    String status;

    public void getStatus(){
        System.out.println("Status: " + status);
    }

    public void on(){
        status = "Turned ON!";
        System.out.println(status);
    }

    public  void off(){
        status = "Turned OFF!";
        System.out.println(status);
    }
}
