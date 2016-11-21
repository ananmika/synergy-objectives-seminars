package behavioral.iterator.aggregate.concreteAggregate;

import behavioral.iterator.aggregate.Menu;
import behavioral.iterator.MenuItem;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.iterator.concreteIterator.PancakeHouseMenuIterator;

import java.util.ArrayList;

/**
 * @author Arthur Rafayelyan
 * @since 9/23/2016.
 */
public class PancakeHouseMenu implements Menu {
    public ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        /*addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);*/
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    // other aggregate methods here
}
