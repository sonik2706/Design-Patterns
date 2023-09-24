import Creational.Builder.Computer;
import Creational.Builder.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2);

        Computer computer = new Computer.ComputerBuilder("512GB", "16RAM").setGraphicsCardEnabled(true).setBluetoothEnabled(false).build();

        System.out.println(computer);
    }
}