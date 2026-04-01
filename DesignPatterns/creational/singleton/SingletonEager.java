package creational.singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    } // private constructor

    public static SingletonEager getInstance() {
        return instance;
    }
}
