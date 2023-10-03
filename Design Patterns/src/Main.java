import Behavioral.Observer.Observer;
import Behavioral.Observer.Subject;
import Behavioral.Strategy.BehaviorA;
import Behavioral.Strategy.BehaviorB;
import Behavioral.Strategy.Client;
import Creational.Builder.Computer;
import Creational.Singleton.Singleton;
import Structural.Decorator.AddonDecorator;
import Structural.Decorator.Beverage;
import Structural.Decorator.Carmel;
import Structural.Decorator.Espresso;

public class Main {
    public static void main(String[] args) {


        {
            System.out.println("Singleton");
            Singleton singleton = Singleton.getInstance();

            System.out.println(singleton);

            Singleton singleton2 = Singleton.getInstance();

            System.out.println(singleton2);
        }

        {
            System.out.println("Builder");
            Computer computer = new Computer.ComputerBuilder("512GB", "16RAM").setGraphicsCardEnabled(true).setBluetoothEnabled(false).build();

            System.out.println(computer);
        }

        {
            System.out.println("Observer");

            Subject subject = new Subject(1);
            Observer observer = new Observer(subject);
            subject.registerObserver(observer);

            System.out.println(observer);
            subject.setData(2);
            subject.notifyObservers();
            System.out.println(observer);
        }

        {
        System.out.println("Strategy");

        Client client1 = new Client(new BehaviorA());
        Client client2 = new Client(new BehaviorB());

        client1.execute();
        client2.execute();
        }

        {
            System.out.println("Decorator");

            Beverage espresso = new Espresso(10);
            AddonDecorator espresso_carmel = new Carmel(espresso, 2);

            System.out.println(espresso_carmel.cost());
        }
    }
}