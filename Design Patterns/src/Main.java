import Behavioral.Command.Invoker;
import Behavioral.Command.LightOffCommand;
import Behavioral.Command.LightOnCommand;
import Behavioral.Command.Receiver;
import Behavioral.Observer.Observer;
import Behavioral.Observer.Subject;
import Behavioral.Strategy.BehaviorA;
import Behavioral.Strategy.BehaviorB;
import Behavioral.Strategy.Client;
import Creational.AbstractFactory.*;
import Creational.Builder.Computer;
import Creational.Factory.ConcreteCreatorA;
import Creational.Factory.ConcreteCreatorB;
import Creational.Factory.Creator;
import Creational.Factory.Product;
import Creational.Singleton.Singleton;
import Structural.Decorator.AddonDecorator;
import Structural.Decorator.Beverage;
import Structural.Decorator.Carmel;
import Structural.Decorator.Espresso;

public class Main {
    public static void main(String[] args) {

        //Singleton
        {
            System.out.println("Singleton");
            Singleton singleton = Singleton.getInstance();

            System.out.println(singleton);

            Singleton singleton2 = Singleton.getInstance();

            System.out.println(singleton2);
        }

        //Builder
        {
            System.out.println("Builder");
            Computer computer = new Computer.ComputerBuilder("512GB", "16RAM").setGraphicsCardEnabled(true).setBluetoothEnabled(false).build();

            System.out.println(computer);
        }

        //Observer
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

        //Strategy
        {
        System.out.println("Strategy");

        Client client1 = new Client(new BehaviorA());
        Client client2 = new Client(new BehaviorB());

        client1.execute();
        client2.execute();
        }

        //Decorator
        {
            System.out.println("Decorator");

            Beverage espresso = new Espresso(10);
            AddonDecorator espresso_carmel = new Carmel(espresso, 2);

            System.out.println(espresso_carmel.cost());
        }

        //Factory
        {
            System.out.println("Factory");
            Creator creatorA = new ConcreteCreatorA();
            Product productA = creatorA.someOperation();

            Creator creatorB = new ConcreteCreatorB();
            Product productB = creatorB.someOperation();

        }

        //Abstract Factory
        {
            System.out.println("Abstract Factory");
            Factory factory = new ConcreteFactory1();
            ProductA productA = factory.createProductA();
            ProductB productB = factory.createProductB();

            productA.run();
            productB.run();
        }

        //Command Pattern
        {
            System.out.println("Command");
            Receiver light = new Receiver();
            Invoker remote = new Invoker(new LightOnCommand(light), new LightOffCommand(light));

            light.getStatus();
            remote.clickOn();
            light.getStatus();
            remote.clickOff();
            light.getStatus();
        }
    }
}