package patterns.samples.creational.singleton.vigen.vardanyan;

import java.io.Serializable;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -4862926644813433707L;

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
