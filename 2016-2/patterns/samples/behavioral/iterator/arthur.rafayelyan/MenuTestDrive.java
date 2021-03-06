package behavioral.iterator;

import behavioral.iterator.aggregate.Menu;
import behavioral.iterator.aggregate.concreteAggregate.DinerMenu;
import behavioral.iterator.aggregate.concreteAggregate.PancakeHouseMenu;
import behavioral.iterator.client.Waitress;
import behavioral.iterator.iterator.concreteIterator.PancakeHouseMenuIterator;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Arthur Rafayelyan
 * @since 9/23/2016.
 */
public class MenuTestDrive {


    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

    @Test
    public void testMenuIterator() {

        /**
         * Create new aggregate.PancakeHouseMenu
         * add the aggregate items
         * And create iterator.PancakeHouseMenuIterator
         * */
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        pancakeHouseMenu.addItem("aaa","bbb",false,1.5);
        pancakeHouseMenu.addItem("ccc","ddd",false,5.2);
        PancakeHouseMenuIterator iterator = new PancakeHouseMenuIterator(pancakeHouseMenu.menuItems);

        /**
         * each time iterator.next() returns new value of pancakeHouseMenu
         *
         * */
        assert ((MenuItem) iterator.next()).getName().equals("aaa");
        assert ((MenuItem) iterator.next()).getName().equals("ccc");

        /**
         * each time pancakeHouseMenu.createIterator().next() returns the same value
         *
         * */
        Assert.assertEquals (((MenuItem)pancakeHouseMenu.createIterator().next()).getName(),"aaa");
        Assert.assertEquals (((MenuItem)pancakeHouseMenu.createIterator().next()).getName(),"aaa");
    }
}
