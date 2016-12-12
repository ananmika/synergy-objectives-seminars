import java.util.HashMap;
import java.util.Map;

/**
 * @author Tigran.Mkrtchyan
 * @since 12/12/2016.
 */
public class Flyweighted {
    Integer id;
    private static Map<Integer, Flyweighted> instances = new HashMap<>();

    private Flyweighted(Integer id) {
        this.id = id;
    }

    public static synchronized Flyweighted getInstance(Integer key) {
        if (!instances.keySet().contains(key)) {
            Flyweighted fw = new Flyweighted(key);
            instances.put(key, fw);
            return fw;
        } else
            return instances.get(key);
    }
}

