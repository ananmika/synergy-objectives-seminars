package patterns.samples.structural.flyweight.vigen.vardanyan;

import java.util.List;
import java.util.Vector;

/**
 * Created by Vigen.Vardanyan on 10/5/2016.
 */
public class CoffeeShopFlyweightTest {
    private final List<Order> orders = new Vector<>();
    private final Menu menu = new Menu();

    private void takeOrder(String flavourName, int table) {
        CoffeeFlavour flavour = menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        orders.add(order);
    }

    private void service() {
        for (Order order : orders) {
            order.serve();
        }
    }

    private String report() {
        return "\n" + menu.totalCoffeeFlavours();
    }

    public static void main(String[] args) {
        CoffeeShopFlyweightTest shop = new CoffeeShopFlyweightTest();

        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Americano", 4);
        shop.takeOrder("Cappuccino", 97);
        shop.takeOrder("Americano", 87);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Americano", 5);
        shop.takeOrder("Espresso", 96);
        shop.takeOrder("Americano", 121);
        shop.takeOrder("Cappuccino", 121);
        shop.takeOrder("Espresso", 121);

        shop.service();
        System.out.println(shop.report());
    }
}
