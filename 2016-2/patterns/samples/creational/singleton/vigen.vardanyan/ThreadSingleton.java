package patterns.samples.creational.singleton.vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class ThreadSingleton {

    private static ThreadSingleton instance;

    public static synchronized ThreadSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSingleton();
        }
        return instance;
    }

}
