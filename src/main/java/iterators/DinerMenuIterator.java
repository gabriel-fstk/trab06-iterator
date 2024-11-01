package main.java.iterators;

import java.util.ArrayList;

import main.java.MenuItem;

public class DinerMenuIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public DinerMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        return position < items.size();
    }
    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
