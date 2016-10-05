package patterns.samples.creational.singleton.vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
