package patterns.samples.creational.singleton.vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class StaticSingleton {

    private static StaticSingleton instance;

    static {
        instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return instance;
    }
}
