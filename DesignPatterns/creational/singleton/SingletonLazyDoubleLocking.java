package creational.singleton;

public class SingletonLazyDoubleLocking {

    private static volatile SingletonLazyDoubleLocking singletonLazyDoubleLocking;

    private SingletonLazyDoubleLocking() {

    }

    public static SingletonLazyDoubleLocking getInstance() {
        if (singletonLazyDoubleLocking == null) {
            synchronized (SingletonLazyDoubleLocking.class) {
                if (singletonLazyDoubleLocking == null)
                    singletonLazyDoubleLocking = new SingletonLazyDoubleLocking();
            }
        }
        return singletonLazyDoubleLocking;
    }
}
