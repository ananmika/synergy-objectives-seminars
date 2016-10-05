package patterns.samples.structural.flyweight.vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class CoffeeFlavour {
    private final String name;

    CoffeeFlavour(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}
