package Creational.Singleton;


/*
* For Medium : https://medium.com/p/4bc30b403c49
* */

class Singleton {
    private static Singleton createInstance;

    private Singleton() {
        // Private constructor to prevent external instantiation
    }

    public static Singleton createSingleton() {
        if (createInstance == null) {
            createInstance = new Singleton();
        }
        return createInstance;
    }

    /*
     * In a multithreaded project, if we intend to use the Singleton pattern, we need to ensure that different threads do not create separate instances of the Singleton class simultaneously. One way to achieve this is by using synchronization.
     * Example method: createThreadSafeSingleton
     */

    public static Singleton createThreadSafeSingleton() {
        synchronized (Singleton.class) {
            if (createInstance == null) {
                createInstance = new Singleton();
            }
            return createInstance;
        }
    }
}
