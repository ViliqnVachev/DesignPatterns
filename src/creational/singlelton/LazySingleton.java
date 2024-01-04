package creational.singlelton;

public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        //thread-safe - provides the double-checked locking implementation (better performance)
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }

}
