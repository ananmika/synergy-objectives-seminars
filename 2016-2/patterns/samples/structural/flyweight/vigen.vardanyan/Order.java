package patterns.samples.structural.flyweight.vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class Order {
    private final int tableNumber;
    private final CoffeeFlavour flavour;

    Order(int tableNumber, CoffeeFlavour flavor) {
        this.tableNumber = tableNumber;
        this.flavour = flavor;
    }

    void serve() {
        System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
