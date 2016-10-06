package patterns.samples.structural.flyweight.vigen.vardanyan;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class Menu {
    private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<>();

    CoffeeFlavour lookup(String flavorName) {
        if (!flavours.containsKey(flavorName)) {
            flavours.put(flavorName, new CoffeeFlavour(flavorName));
        }
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavours() {
        return flavours.size();
    }
}
