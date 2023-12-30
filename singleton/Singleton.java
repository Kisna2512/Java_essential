package singleton;

// it will be used if we want to create only one instance of an class
public class Singleton {
    private Singleton() {
        System.out.println("Hello krishna");
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
