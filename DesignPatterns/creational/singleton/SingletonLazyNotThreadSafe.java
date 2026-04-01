package creational.singleton;

public class SingletonLazyNotThreadSafe {
    private static SingletonLazyNotThreadSafe instance;

    private SingletonLazyNotThreadSafe() {
    }

    public static SingletonLazyNotThreadSafe getInstance() {
        if (instance == null)
            instance = new SingletonLazyNotThreadSafe();
        return instance;
    }
}
