package iterator;

import aggregate.MenuItem;

import java.util.ArrayList;

/**
 * @author Arthur Rafayelyan
 * @since 9/23/2016.
 */
public class PancakeHouseMenuIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
