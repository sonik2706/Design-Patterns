import Behavioral.Strategy.BehaviorA;
import Behavioral.Strategy.BehaviorB;
import Behavioral.Strategy.Client;
import Creational.Builder.Computer;
import Creational.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2);

        Computer computer = new Computer.ComputerBuilder("512GB", "16RAM").setGraphicsCardEnabled(true).setBluetoothEnabled(false).build();

        System.out.println(computer);


        System.out.println("Strategy");

        Client client1 = new Client(new BehaviorA());
        Client client2 = new Client(new BehaviorB());

        client1.execute();
        client2.execute();
    }
}