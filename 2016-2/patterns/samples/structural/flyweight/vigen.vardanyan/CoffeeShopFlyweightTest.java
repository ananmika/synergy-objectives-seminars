package patterns.samples.structural.flyweight.vigen.vardanyan;

import java.util.List;
import java.util.Vector;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class CoffeeShopFlyweightTest {
    private final List<Order> orders = new Vector<Order>();
    private final Menu menu = new Menu();

    void takeOrder(String flavourName, int table) {
        CoffeeFlavour flavour = menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        orders.add(order);
    }

    void service() {
        for (Order order : orders)
            order.serve();
    }

    String report() {
        return "\n" + menu.totalCoffeeFlavours();
    }

    public static void main(String[] args) {
        CoffeeShopFlyweightTest shop = new CoffeeShopFlyweightTest();

        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Cappuccino", 97);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 96);
        shop.takeOrder("Cappuccino", 121);
        shop.takeOrder("Espresso", 121);

        shop.service();
        System.out.println(shop.report());
    }
}
