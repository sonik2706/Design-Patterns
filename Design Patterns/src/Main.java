import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2);
    }
}