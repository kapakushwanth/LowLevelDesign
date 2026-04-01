package Singleton;

public class SingletonEagerInitialization {
    private static SingletonEagerInitialization instance = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {} // private constructor

    public static SingletonEagerInitialization getInstance() {
        return instance;
    }
}
