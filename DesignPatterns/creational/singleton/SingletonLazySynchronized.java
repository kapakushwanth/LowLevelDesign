package creational.singleton;

public class SingletonLazySynchronized {

    private static SingletonLazySynchronized singletonLazySynchronized;

    private SingletonLazySynchronized() {
    }

    public static synchronized SingletonLazySynchronized getInstance() {
        if (singletonLazySynchronized == null)
            singletonLazySynchronized = new SingletonLazySynchronized();
        return singletonLazySynchronized;
    }
}
